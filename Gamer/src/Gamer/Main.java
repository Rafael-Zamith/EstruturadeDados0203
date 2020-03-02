package Gamer;



public class Main {
    public static void main(String[] args) throws Exception {

       Vetor v = new Vetor(10);
       
       v.add(0, "Abner", 0);
       v.add(1, "Zamith", 10);
       
       v.getArray();
       System.out.println(v.isEmpty());
    }
}
