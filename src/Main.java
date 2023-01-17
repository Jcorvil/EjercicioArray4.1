public class Main {
    public static void main(String[] args) {
        int x = 1;
        String s = "Hola";

        System.out.println(x);
        System.out.println(s);

        int[][] retorno = m(x, s);

        System.out.println(x);
        System.out.println(s);
    }

    static int [][] m(int x, String s){
        s = "Adios";
        for (x = 1; x <= 2 ; x++ ){
            System.out.println(s);
            System.out.println("x vale: " + x);
        }
        return new int[0][0];
    }

}