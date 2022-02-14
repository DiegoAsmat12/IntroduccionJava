import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class Mapas{
    public static void main(String[] args) {
        HashMap<Integer,String> nombreUsuarios = new HashMap<Integer,String>();

        nombreUsuarios.put(123, "alex88");
        nombreUsuarios.put(456, "martha16");
        nombreUsuarios.put(789, "julie27");

        System.out.println(nombreUsuarios.get(123));

        Set<Integer> setIds = nombreUsuarios.keySet();
        Collection<String> coleccionNombres = nombreUsuarios.values();

        for ( Integer llave : setIds ){
            System.out.println(llave);
            System.out.println(nombreUsuarios.get(llave));
        }

    }
}