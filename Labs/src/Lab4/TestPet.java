package Lab4;

public class TestPet {
    public static void main(String[] args) {
        Pet myPet = new Pet("Bella", "Ahmad", 4);
        Cat myCat = new Cat("Luna", "Sarah", 3, 46.5);
        Dog myDog = new Dog("Rex", "Fahad", 5, 55.0, 25.0);

        System.out.println(myPet.toString());
        
        System.out.println(myCat.toString());
        System.out.println("Cat feeding amount: " + myCat.feedingAmt() + " ml");
        
        System.out.println(myDog.toString());
        System.out.println("Dog feeding amount: " + myDog.feedingAmt() + " ml");
    }
}