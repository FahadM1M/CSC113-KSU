package Lab5;

public class TestPet {
    public static void main(String[] args) {
        Cat c1 = new Cat("Luna", "Sarah", 3, 46.5);
        Dog d1 = new Dog("Rex", "Fahad", 5, 55.0, 25.0);
        
        c1.display();
        System.out.println(c1.feedingAmt());
        
        d1.display();
        System.out.println(d1.feedingAmt());
    }
}