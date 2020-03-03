package Gamer;
/*
@autores:
Abner Santos
Rafael Zamith
Vitor Akira
*/
public class Main {
    public static void main(String[] args) throws Exception {

       Vetor v = new Vetor(10);
       
       v.add(0, "Abner", 765);
       v.add(1, "Zamith", 898);
       v.add(2, "vitor",858);
       v.add(3, "anna", 788);
       v.add(4, "Duda", 900);
       //
       v.mostarPont(true,0);
       //
       v.mostarPont(false, 1);
       //
       v.remove(2);
       //
       v.mostarPont(true,0);

    }
}
