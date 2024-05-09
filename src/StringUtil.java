public class StringUtil {
    public static String limpiarPalabra(String palabra){
        String palabraLimpia = palabra.replaceAll("^[^a-zA-Z]+|[^a-zA-Z]+$", "");
        palabraLimpia = palabraLimpia.toLowerCase();
        return palabraLimpia;
    }
}
