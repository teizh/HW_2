public class Horse extends Animal {
    private int numberOfLegs;

    public Horse(String name, int age, int numberOfLegs) {
        super(name, age);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void print() {
        System.out.println("\nName: " + name+
                "\nAge: " + age +
                "\nNumber of Legs: "+ numberOfLegs);
        System.out.println("\uD83D\uDC34");
    }
}
