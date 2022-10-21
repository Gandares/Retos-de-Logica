import java.util.stream.IntStream;

class Main{
    public static void main(String[] args) {
        for(int i : IntStream.rangeClosed(1,100).toArray())
            if(Prime.isPrime(i))
                System.out.println(i + " es primo.");
    }
}

class Prime{

    public static boolean isPrime(int num){
        if(num < 2)
            return false;

        for(int i : IntStream.rangeClosed(2,num/2).toArray())
            if(num % i == 0)
                return false;

        return true;
    }
}