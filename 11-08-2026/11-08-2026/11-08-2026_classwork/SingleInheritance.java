class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class SingleInheritance extends Animal {
    void sleep() {
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance();
        obj.eat();
        obj.sleep();
    }
}