package exercicio_4_1;

import java.util.Map;


public class Application
{

  public static void main(String[] args)
  {
    Integer[][] matrix = new Integer[][]{{1, 2, 3, 4, 5}, {1, 4, 9, 16, 25}};
    
    Map<Integer, Integer> hashMap = new HashMapAdapter<Integer>(matrix);
    
    System.out.println("Elementos armazenados no HashMap");
    
    for(Integer key: hashMap.keySet())
    {
      System.out.println(key + " : " + hashMap.get(key));
    }
    
    System.out.println();
    
    Map<Integer, Integer> treeMap = new TreeMapAdapter<Integer>(matrix);
    
    System.out.println("Elementos armazenados no TreeMap");
    
    for(Integer key: treeMap.keySet())
    {
      System.out.println(key + " : " + treeMap.get(key));
    }
  }
}
