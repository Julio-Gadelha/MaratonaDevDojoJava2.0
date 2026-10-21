package ClassesUtilitarias.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aa ";
        String texto = "Abaab ";
        Pattern pattern  =  Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto : " + matcher);
        System.out.println("indice : 023235  ");
        System.out.println("regex:  " + regex);
        System.out.println(" Posição encontrada ");
    }
}
