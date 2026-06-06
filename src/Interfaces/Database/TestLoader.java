package Interfaces.Database;

public class TestLoader {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
        System.out.println("-----------------");
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();

    }
}
