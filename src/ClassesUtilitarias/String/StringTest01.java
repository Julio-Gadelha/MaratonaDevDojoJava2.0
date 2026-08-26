package ClassesUtilitarias.String;

import java.util.Locale;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        System.out.println(nome.charAt(2));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase(Locale.ROOT));
    }
}
