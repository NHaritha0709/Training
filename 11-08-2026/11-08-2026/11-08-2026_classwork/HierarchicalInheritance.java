class HierarchicalInheritance {
    void display() {
        System.out.println("Parent class");
    }
}

class Child1 extends HierarchicalInheritance {
    void show1() {
        System.out.println("First child class");
    }
}

class Child2 extends HierarchicalInheritance {
    void show2() {
        System.out.println("Second child class");
    }

    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();

        obj1.display();
        obj1.show1();

        obj2.display();
        obj2.show2();
    }
}