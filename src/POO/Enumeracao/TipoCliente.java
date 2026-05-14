package POO.Enumeracao;

public enum TipoCliente {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public   final int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
