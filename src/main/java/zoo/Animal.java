package zoo;

public class Animal {
    String specie;
    char gender;
    int age;
    boolean isAlive = true;
    boolean isHungry = true;
    int caloriestTofull;

    long duzaLiczba;
    float liczbaZmiennoprzecinkowa;
    double liczbaZmiennoprzecinkowaZDwomaMiejscamiPoPrzecinku;

    long caloriesCounter = 0L;

    public Animal(String specie) {
        this.specie = specie;
    }

    public void speak() {
        System.out.println("My name is " + specie);
    }
    public void feed(String food) {
        System.out.println(food);
    }

    public void feed(String food, int amount) {
        System.out.println(food + amount);
    }
    public void feed(Food food) {
        if (food.foodType.equals("trutka")) {
            System.out.println("Zeżarłem trutkę. Umieram sobie.");
            isAlive = false;
        }

        if (!isAlive) {
            System.out.println("Leże i nie żyje.");
        } else {
            System.out.println("Jem sobie : " + food.foodType + " która ma " + food.calories + " kalorii.");
            caloriesCounter += food.calories;
            System.out.println("Dziś zjadłem " + caloriesCounter + " kalorii.");
        }
    }
}