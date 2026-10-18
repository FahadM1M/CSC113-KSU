package Lab6;

public class Test {
    public static void main(String[] args) {
        Vitamin[] vList = new Vitamin[3];
        vList[0] = new Biotin(40, 3, 9);
        vList[1] = new Biotin(60, 1, 22);
        vList[2] = new Biotin(20, 4, 10);

        int expiredCount = 0;
        for (int i = 0; i < vList.length; i++) {
            if (((FoodSupplement) vList[i]).isExpired(11)) {
                expiredCount++;
            }
        }
        System.out.println("Number of expired objects: " + expiredCount);

        for (int i = 0; i < vList.length; i++) {
            System.out.println("Vitamin " + (i + 1) + " Information:");
            ((FoodSupplement) vList[i]).display();
            double dose = vList[i].calculateDose(64, 7);
            System.out.println("Needed Dose for 1 week (weight 64): " + dose);
            System.out.println("----------------------------");
        }
    }
}