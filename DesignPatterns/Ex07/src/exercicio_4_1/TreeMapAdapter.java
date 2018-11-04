package exercicio_4_1;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAdapter<K> extends TreeMap<K, K>
  implements Map<K, K>, Cloneable, Serializable
{

  private static final long serialVersionUID = 1L;


  public TreeMapAdapter()
  {
    super();
  }

  public TreeMapAdapter(Comparator<? super K> comparator)
  {
    super(comparator);
  }

  public TreeMapAdapter(K[][] matrix)
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

  public TreeMapAdapter(Map<? extends K, ? extends K> map)
    throws ClassCastException, NullPointerException
  {
    super(map);
  }


  public TreeMapAdapter(SortedMap<K, ? extends K> map)
    throws NullPointerException
  {
    super(map);
  }
}
