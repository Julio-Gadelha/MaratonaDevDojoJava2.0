package Collection.list;

import Collection.Equals.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneList02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("TwjdbuU67", "Apple");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("585875", "Sansung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);


        for (Smartphone smartphone : smartphones ) {
            System.out.println(smartphone);
        }

    }
}
