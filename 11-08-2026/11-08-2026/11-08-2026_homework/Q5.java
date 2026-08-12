package q5;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("Cow moos");
    }
}

public class Q5 {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();
        Cow w = new Cow();

        d.eat();
        d.bark();

        c.eat();
        c.meow();

        w.eat();
        w.moo();
    }
}