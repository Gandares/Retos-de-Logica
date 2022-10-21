class Main{
    public static void main(String[] args) {
        Fibonacci.mostrar(50);
    }
}
class Fibonacci{
    public static void mostrar(int cantidad){

        double swap;
        double[] lastTwo = new double[]{0,1};
        
        System.out.println(0);
        System.out.println(1);

        for(int i = 2; i < cantidad; i++){
            swap = lastTwo[0] + lastTwo[1];
            System.out.println(swap);
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = swap;
        }
    }
}