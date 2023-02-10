public class Main {
    public static void main(String[] args) {

        /*Whale whale = new Whale("Moby Dick", 12, 4);
        Bird bird = new Bird("Donald The Duck", 3, 2);
        Horse horse = new Horse("Spirit", 5, 4);*/

        Animal animals[] = {createObject("horse"), createObject("whale"), createObject("bird")};

        for (int i = 0; i < animals.length; i++) {
            animals[i].print();
        }



    }

    public static Animal createObject(String className) {

        switch (className) {
            case "whale":
                Whale whale1 = new Whale("Moby Dick", 12, 4);
                return whale1;
            case "bird":
                Bird bird1= new Bird("Donald The Duck", 3, 2);
                return bird1;
            case "horse":
                Horse horse1 = new Horse("Spirit", 5, 4);
                return horse1;

        }
        return null;

    }
}