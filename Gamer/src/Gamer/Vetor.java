package Gamer;
/*
@autores:
Abner Santos
Rafael Zamith
Vitor Akira
*/
public class Vetor {
    private Gamer[] A;
        private int capacity;
        private int size;

        public Vetor(int capacity) {
        A = new Gamer [capacity];
        this.size = 0;
        this.capacity = capacity;
        }

        public boolean isEmpty() {
            return (size == 0);
        }

        public int size() {
            return size;
        }

        public Gamer get(int i) throws Exception {
            if (i>=size){
                throw new Exception("Posição inválida para consulta!");
            }
            return A[i];
        }

        public Gamer set(int i, Gamer n) throws Exception {
            if (i>=size){
                throw new Exception("Posição inválida para consulta!");
            }
            A[i]=n;
            return n;
        }

        public void add(int i, String n, int g) throws Exception {
            if(size==A.length){
                throw new Exception("Lista cheia");
            }
            if (i>size){
                throw new Exception("Posição inválida!");
            }
            for(int j = size -1;j >= i;j--){
                A[j +1] = A[j];
            }
            A[i] = new Gamer(n,g);
            size++;
            organizvet();
        }

        public void remove(int i) throws Exception {
            if (isEmpty()){
                throw new Exception("Lista Vazia! Impossivel remover");
            }
            if(i>size){
                throw new Exception("Posição Inválida para Remoção");
            }
            for(int j =i; j<=size-1;j++){
                A[j]=A[j+1];
            }
            size--;
        }

        public int search(Gamer n) throws Exception {
            if(isEmpty())
            throw new Exception("Lista vazia");

            for(int i=0;i<size;i++)
                if(A[i]==n)
                    return i;

            return -1;
        }
    

        public void mostarPont(boolean a,int i) {
            if (a==true){
            while (A[i] != null) {
                for (i=0;i<size;i++){
                    System.out.println(A[i].getName() +": "+ A[i].getScore());
                }
            }
            }
            else{
                i -=1;
                System.out.println("Na "+ (i+1) + "° posição está: "+A[i].getName() +": "+ A[i].getScore());
            }
        }

        public void organizvet() throws Exception{
            if (isEmpty()==false) {
                    Gamer temp;
                    // inicia o Bubble Sort
                    for(int i=0; i<size; i++)
                    for(int j=1; j<size-i;j++)
                    if(A[j-1].getScore() < A[j].getScore()){
                    //troca os elementos
                    temp = A [j-1];
                    A [j-1] = A [j];
                    A [j] = temp;
                    }
                    
                    
            } else {
                throw new Exception("Lista vazia"); //n precisa
            }

        }
        



}