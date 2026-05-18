package Interfaces;

public class TestLoader {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
    }
}
