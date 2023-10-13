package zoo;

public class Owner {

    public static void main(String[] args){
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.specie = "dog";
        animal1.age = 5;
        animal1.isAlive = false;
        animal1.speak();

        animal2.specie = "iggor";
        animal2.age = -2;
        animal1.isAlive = true;
        animal2.speak();
        animal2.feed("egg", 10);

    }
}
