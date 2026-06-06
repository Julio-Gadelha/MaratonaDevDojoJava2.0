package Interfaces.Database;

public class DataBaseLoader  implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados !");
    }

    @Override
    public void remove() {
        System.out.println("Removendo os dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permossões no banco de dados");
    }
}
