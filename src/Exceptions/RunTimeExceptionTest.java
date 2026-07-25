package Exceptions;

public class RunTimeExceptionTest {
    public static void main(String[] args) {

        try {
            System.out.println("Abrindo arquivo ");
            throw  new RuntimeException();
        } catch (Exception e) {
           e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO ");
        }
    }
}
