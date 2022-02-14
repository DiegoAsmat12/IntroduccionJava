import java.util.ArrayList;

public class Arreglos{
    public static void main( String args[] ){
        int nums[] ={10,20,30,40,50};
        String nombres[] =  new String[4];
        nombres[0] ="Alex";
        for ( int i = 0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }

        ArrayList<Integer> numeros = new ArrayList<Integer>(); 
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println(numeros.size());
        if(numeros.isEmpty()){
            System.out.println("Esta vacía la lista!");
        }
        numeros.set(2, 35);
        for ( int i = 0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println( numeros.contains(10));
        numeros.clear();
    }
}