public class Metodos {

    public static int suma (int num1, int num2){
        int total = num1 +num2;
        return total;
    }

    public static int suma (int num1, int num2, int num3){
        int total = num1 + num2 + num3;
        return total;
    }

    public static void main ( String args[] ){
        int num1 = 10;
        int num2 = 20;
        int num3 = 70;

        int total = suma(num1,num2);
        int total2 = suma(num1,num2,num3);
        System.out.println(total);
    }
}
