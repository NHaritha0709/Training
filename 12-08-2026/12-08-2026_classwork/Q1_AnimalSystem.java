abstract class Q1_Animal {
    public void eat() {
        System.out.println("This animal is eating food.");
    }
    public abstract void sound();
}

class Q1_Dog extends Q1_Animal {
    @Override
    public void sound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Q1_Cat extends Q1_Animal {
    @Override
    public void sound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

class Q1_Cow extends Q1_Animal {
    @Override
    public void sound() {
        System.out.println("Cow says: Moo! Moo!");
    }
}

public class Q1_AnimalSystem {
    public static void main(String[] args) {
        Q1_Animal dog = new Q1_Dog();
        Q1_Animal cat = new Q1_Cat();
        Q1_Animal cow = new Q1_Cow();

        dog.eat();   dog.sound();
        cat.eat();   cat.sound();
        cow.eat();   cow.sound();
    }
}