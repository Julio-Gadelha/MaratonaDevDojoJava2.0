package Interfaces.Database;

public class FileLoader  implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Carregando os arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo os arquivos");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
