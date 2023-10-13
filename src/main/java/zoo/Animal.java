package zoo;

public class Animal {
    public String specie;
    public int age;
    public float weight;
    public double height;
    boolean isAlive;
    void speak(){
            System.out.println("hello, my specie is " + specie + " and my age is " + age);
    }
    void feed(String food){
        System.out.println("I ate " + food);
    }
    void feed(String food, int number){
        System.out.println("I ate "+ number + " " + food);
    }
}
