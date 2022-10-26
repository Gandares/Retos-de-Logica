import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args){
        CountingWords cw = new CountingWords();
        cw.getWords("Un Par es un contenedor para almacenar una tupla de dos objetos. Java realmente no proporciona ninguna implementación de la clase Pair. Esta publicación discutirá varias alternativas a la clase Pair en Java.");
    }
}

class Pair
{
    String word;
    int number;

    Pair(String s, int i){
        word = s;
        number = i;
    }

    public void add(){
        number++;
    }

    public String getKey(){
        return word;
    }

    public int getNumber(){
        return number;
    }
}

class CountingWords{

    List<Pair> Recount = new ArrayList<>();

    CountingWords(){}
    
    public void getWords(String sentence){

        String[] Words = sentence.split(" ");
        Words = ToLowerCase(Words);
        Words = RemoveSpecialCharacters(Words);

        for(int i = 0; i < Words.length; i++){
            char[] ordenado = SortWord(Words[i]);
            
            if(!SameWord(ordenado)){
                Recount.add(new Pair(Words[i], 1));
            }
        }

        ShowValues();
    }

    private String[] ToLowerCase(String[] words){
        for(int i = 0; i < words.length; i++)
            words[i] = words[i].toLowerCase();

        return words;
    }

    private String[] RemoveSpecialCharacters(String[] words){
        for(int i = 0; i < words.length; i++)
            words[i] = words[i].replaceAll("[^a-zA-Z0-9á-ú]", "");
        
        return words;
    }

    private char[] SortWord(String word){
        char[] sorted = new char[word.length()];
        for(int i = 0; i < word.length(); i++)
            sorted[i] = word.charAt(i);

        Arrays.sort(sorted);
        return sorted;
    }

    private boolean SameWord(char[] ordenado){
        for(int j = 0; j < Recount.size(); j++){
            char[] RecountWordOrdenada = SortWord(Recount.get(j).getKey());
            if(RecountWordOrdenada.length == ordenado.length){
                boolean same = true;
                for(int k = 0; k < ordenado.length; k++)
                    if(ordenado[k] != RecountWordOrdenada[k])
                        same = false;

                if(same == true){
                    Recount.get(j).add();
                    return true;
                }
            }
        }
        return false;
    }

    private void ShowValues(){
        for(int i = 0; i < Recount.size(); i++)
            System.out.println(Recount.get(i).getKey() + " -> " + Recount.get(i).getNumber());
    }
}