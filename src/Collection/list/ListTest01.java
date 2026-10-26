package Collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes  = new ArrayList();
        nomes.add("Gabriel");
        nomes.add("VoskyTv");

        for(Object nome  : nomes){
            System.out.println(nome);
        }

    }
}
