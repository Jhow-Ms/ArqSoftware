package exercicio_3_1;

public class MySingleton {
	 
    private static MySingleton instance = new MySingleton();
     
    public int counter = 0;
     
    private MySingleton(){}
     
    public static MySingleton getInstance()
    {
        return instance;
    }
     
    public void increment()
    {
        this.counter++;
    }
     
    public static void main(String args[])
    {
        MySingleton s = MySingleton.getInstance();      
        s.increment();s.increment();s.increment();
        System.out.println(s.counter);
         
        MySingleton s2 = MySingleton.getInstance();
        System.out.println(s2.counter);
         
        String txt;
        txt = (s.equals(s2)) ? "mesmo singleton":"não é o mesmo";
        System.out.println(txt);
    }
}
