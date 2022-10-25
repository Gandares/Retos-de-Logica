class Main{
    public static void main(String[] args) {
        System.out.println(Cadena.invertir("Hola mundo"));
    }
}

class Cadena{
    public static String invertir(String cadena){
        String invertido = new String();
        for(int i=0, j=cadena.length()-1; i<cadena.length(); i++, j--){
            invertido += cadena.charAt(j);
        }
        return invertido;
    }
}