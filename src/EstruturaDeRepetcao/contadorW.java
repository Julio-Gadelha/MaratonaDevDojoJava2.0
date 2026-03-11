package EstruturaDeRepetcao;

public class contadorW {
    public static void main(String[] args) {

        int count = 12;
        while(count <10){
            System.out.println(++count);
//            count += 1 ;
        }
        count = 0 ;
        do{
            System.out.println("Dentro do while" + count);
            count ++;
        } while (count < 10 );
    }
}
