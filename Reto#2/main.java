import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        if(anagram.verification("indio", "onidi"))
            System.out.println("Es un anagrama.");
        else
            System.out.println("No es un anagrama.");
            
        if(anagram.verification("pepo", "popeye"))
            System.out.println("Es un anagrama.");
        else
            System.out.println("No es un anagrama.");

        if(anagram.verification("indio", "indio"))
            System.out.println("Es un anagrama.");
        else
            System.out.println("No es un anagrama.");

        if(anagram.verification("marinero", "reinomar"))
            System.out.println("Es un anagrama.");
        else
            System.out.println("No es un anagrama.");
    }
}

class Anagram{

    public boolean verification(String first, String second){
        if(first.equals(second) || first.length() != second.length())
            return false;

        char[] firstArrayChar = new char[first.length()];
        char[] secondArrayChar = new char[second.length()];

        for(int i = 0; i < first.length(); i++){
            firstArrayChar[i] = first.charAt(i);
            secondArrayChar[i] = second.charAt(i);
        }

        Arrays.sort(firstArrayChar);
        Arrays.sort(secondArrayChar);

        for(int i = 0; i < first.length(); i++)
            if(firstArrayChar[i] != secondArrayChar[i])
                return false;
                
        return true;
    }
}