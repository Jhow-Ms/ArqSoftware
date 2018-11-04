package exercicio_4_1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMapAdapter<K> extends HashMap<K, K>
  implements Map<K, K>, Cloneable, Serializable
{

  private static final long serialVersionUID = 1L;


  public HashMapAdapter()
  {
    super();
  }


  public HashMapAdapter(int initialCapacity) throws IllegalArgumentException
  {
    super(initialCapacity);
  }


  public HashMapAdapter(int initialCapacity, float loadFactor)
    throws IllegalArgumentException
  {
    super(initialCapacity, loadFactor);
  }


  public HashMapAdapter(K[][] matrix)
    throws IllegalArgumentException, NullPointerException
  {
    super();

    if(matrix == null)
    {
      throw new NullPointerException("Matriz nula");
    }

    if(matrix.length != 2)
    {
      throw new IllegalArgumentException("Matriz não tem duas linhas");
    }

    if(matrix[0].length != matrix[1].length)
    {
      throw new IllegalArgumentException("Linhas de comprimento diferente");
    }

    for(int column = 0; column < matrix[0].length; column++)
    {
      put(matrix[0][column], matrix[1][column]);
    }
  }

  public HashMapAdapter(Map<? extends K, ? extends K> map)
    throws NullPointerException
  {
    super(map);
  }
}