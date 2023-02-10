public class Bird extends Animal{
    private int numberOfWings;

    public Bird(String name, int age, int numberOfWings) {
        super(name, age);
        this.numberOfWings = numberOfWings;
    }

    @Override
    public void print() {
        System.out.println("\nName: " + name+
                "\nAge: " + age +
                "\nNumber of Wings: "+ numberOfWings);
        System.out.println("\uD83E\uDD86");
    }
}
