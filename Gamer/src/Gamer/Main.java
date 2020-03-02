package Gamer;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       List<Gamer> gamer;
       gamer = new ArrayList<Gamer>();
       Vetor v = new Vetor(10);
       
       v.add(0, "Abner", 0);
       v.add(1, "Zamith", 10);
       
       System.out.println(v.getArray());
       System.out.println(v.isEmpty());
    }
}
