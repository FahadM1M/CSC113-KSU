package Lab6;

public abstract class FoodSupplement {
    protected int strength;
    protected int usage;
    protected int expirationDate;

    public FoodSupplement(int str, int use, int expDate) {
        this.strength = str;
        this.usage = use;
        this.expirationDate = expDate;
    }

    public abstract boolean isExpired(int today);

    public void display() {
        System.out.println("Strength: " + strength);
        System.out.println("Usage: " + usage);
        System.out.println("Expiration Date: " + expirationDate);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
}