package Enumeracao.Exercise2;

public class TestPedido {
    public static void main(String[] args) {
        StatusPedido status = StatusPedido.ENVIADO;
        switch (status) {
            case PENDENTE:
                System.out.println("Pedido pendente !");
                break;
            case PROCESSANDO:
                System.out.println("Pedido está sendo processado !");
                break;
            case ENVIADO:
                System.out.println("Pedido saiu para entrega !");
                break;
            case ENTREGUE:
                System.out.println("Pedido !");
                break;
        }
    }
}
