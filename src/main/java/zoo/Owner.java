package zoo;

import javax.lang.model.type.NullType;
import java.util.*;

public class Owner {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.speak();
        dog.feed("jedzenie");
        dog.feed("jedzenie", 2);

        Food paroowa = new Food("parówka", 50000);

        Food trutka = new Food("trutka", 50000);

        Food marchewa = new Food("marchewka", 10000);

        Food smakołyk = new Food("smaczek", 5000);

        List<Food> smaczki = new ArrayList<>();
        smaczki.add(paroowa);
        smaczki.add(marchewa);
        smaczki.add(trutka);
        smaczki.add(smakołyk);

        for(Food smaczek: smaczki){
            dog.feed(smaczek);
        }

    }
}