public class Dog {
    private String name;
    private int age;
    private boolean isSleeping;

    public Dog(String n, int a, boolean i) {
        name = n;
        age = a;
        isSleeping = i;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsSleeping() {
        return isSleeping;
    }

    public String toString() {
        return name + " goes woof woof!!!";
    }

}

