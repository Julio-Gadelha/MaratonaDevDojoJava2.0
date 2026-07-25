package Exceptions.Exercicio;

public class Exercicio1 {
   public  static void main(String[] args) {
        try{
            int resultado = dividir(10,0);
            System.out.println("Resultado =  " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro =  " +e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println(" fim do erro lançado");
        }
    }

    public static  int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Numero ilegal,tente novamente");
        }
        return a / b;
    }
}
