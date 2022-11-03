class Main {
    public static void main(String[] args){
        System.out.println(Binary.DecimalToBinary(10));
        System.out.println(Binary.DecimalToBinary(29));
    }
}

class Binary{

    public static StringBuilder DecimalToBinary(int number){
        StringBuilder binary = new StringBuilder();

        while(number > 0){
            if(number%2 == 1)
                binary.append("1");
            else
                binary.append("0");
            number = number / 2;
        }

        return binary.reverse();
    }

}