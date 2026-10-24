package Collection.Test;

import Collection.Equals.Smartphone;

public class Equals1 {
   public  static void main(String[] args) {
       Smartphone s1 = new Smartphone("TwjdbuU67","Apple");
       Smartphone s2 = new Smartphone("TwjdbuU67","Apple");
       System.out.println(s1.equals(s2));
    }
}
