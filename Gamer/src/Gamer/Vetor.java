package Gamer;

public class Vetor {
    private Gamer[] A; // armazena os elementos do vetor
        private int capacity; // capacidade do vetor
        private int size; // elementos no vetor

        public Vetor(int capacity) {
         A = new Gamer [capacity];
        this.size = 0;
        this.capacity = capacity;
        }
        public boolean isEmpty() {
            //return (size == 0)
            if (size == 0)
            return true;
            else 
            return false;
        }
        public int size() {
            return size;
        }

        public Gamer get(int i) throws Exception {
            if (i>=size)
            {throw new Exception("Posição inválida para consulta!");
        }

            return A[i];

        }

        public Gamer set(int i, Gamer n) throws Exception {
            if (i>=size)
            {throw new Exception("Posição inválida para consulta!");
        }
        A[i]=n;
        return n;
        }

        public void add(int i, String n, int g) throws Exception {
            if(size==A.length){
                throw new Exception("Lista cheia");
            }
            if (i>size)
            {throw new Exception("Posição inválida!");
        }
        for(int j = size -1;j >= i;j--){
            A[j +1] = A[j];
        }
        A[i] = new Gamer(n,g);
        size++;
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
    

        public void getArray() {
            int i =0;
            while (A[i] != null) {
            for (i=0;i<size;i++){
                    System.out.println(A[i].getName() +": "+ A[i].getScore());
            }
         
        }
    }



}