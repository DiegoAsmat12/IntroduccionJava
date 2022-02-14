public class Introduccion{
    public static void main( String args[] ){
        int edad = 12;
        long numeroGrande = 1000;   //Entero para numeros grandes
        float calificacion = 9.5f;
        double numeroDecimalGrande = 100000.0005;
        String nombre = "Diego";
        boolean estudiante = true;
        char opcion = 'A';
        String apellido = null;

        System.out.println(edad);
        if(edad >= 21){
            System.out.println("Ya puedes tomar legalmente cualquier bebida en USA!");
        }
        else {
            System.out.println("Aún no puedes tomar bebidas alcoholicas en USA!");
        }
    }
}