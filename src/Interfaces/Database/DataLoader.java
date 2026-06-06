package Interfaces.Database;

public interface DataLoader {
    public static final int MAX_DATA_ZIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões no sistema");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retriveMaxDataSize na interface ");
    }
}
