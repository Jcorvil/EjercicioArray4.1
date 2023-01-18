package Ejercicio;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        String s = "Hola";
        Double [] d = {1d, 2.5d, 34.46d, null, 0d};

        System.out.println(x);
        m(x);
        System.out.println(x);

        System.out.println(x);
        System.out.println(s);
        System.out.println(d);
        m(x, "hola", d);
        System.out.println(x);
        System.out.println(s);
        System.out.println(d);

    }

    static void m (int x){
        x = x + 1;
    }

    static void m (int x, String s, Double[] d){
        //Dice que la posición "0" del array se incremente en 1
        d[0]++;
        /*Como solo podemos utilizar el 0 y el 1, para decirle al método que utilice la posición "4" del array,
        se lo debemos decir calculando el tamaño. Para escoger la posición 5, le decimos "utiliza la longitud del array menos 1".
        Como el array empieza por 0, al hacer el cálculo sale la posición "4", pero en el array "4" realmente significa "5"*/
        d[d.length - 1]++;
        //Si un array es par, la posición del medio se redondea hacia abajo. Es decir, si la operación resulta en 2.5, pillará la posición 2.
        d[(d.length - 1)/2]++;
    }

    static int [][] m2 (int x, String s, Double[] input){
        int n = input.length;
        int m = 2;
        int[][] output = new int[n][m];

        m(x, s, input);

        output[0][0] = (int)Math.floor(input[0]);
        output[0][1] = (int)Math.round(input[0]);

        output[1][0] = (int)Math.floor(input[1]);
        output[1][1] = (int)Math.round(input[1]);

        output[2][0] = (int)Math.floor(input[2]);
        output[2][1] = (int)Math.round(input[2]);

        output[3][0] = (int)Math.floor(input[3]);
        output[3][1] = (int)Math.round(input[3]);

        output[4][0] = (int)Math.floor(input[4]);
        output[4][1] = (int)Math.round(input[4]);



        return output;
    }

    static void m (String s){
        s = s.toUpperCase();
    }

}