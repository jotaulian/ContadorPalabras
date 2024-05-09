import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la frase y te diré cuantas veces aparece cada palabra:");
        String frase = teclado.nextLine();

        String[] palabrasFrase = frase.split(" ");

        for (int i = 0; i < palabrasFrase.length; i++) {
            String clave = StringUtil.limpiarPalabra(palabrasFrase[i]);

            if(frecuenciaPalabras.get(clave) == null){
                frecuenciaPalabras.put(clave, 1);
            }else{
                frecuenciaPalabras.put(clave, frecuenciaPalabras.get(clave)+1);
            }
        }

        System.out.println(frecuenciaPalabras);
    }
}
