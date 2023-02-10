public class Whale extends Animal{
private int numberOfFins;

    public Whale(String name, int age, int numberOfFins) {
        super(name, age);
        this.numberOfFins = numberOfFins;
    }

    @Override
    public void print() {
        System.out.println("\nName: " + name+
                "\nAge: " + age +
                "\nNumber of Fins: "+ numberOfFins);
        System.out.println("\uD83D\uDC33");
    }
}
