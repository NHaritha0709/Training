class Grandparent {
    void showGrandparent() {
        System.out.println("Grandparent");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("Parent");
    }
}

class MultilevelInheritance extends Parent {
    void showChild() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        MultilevelInheritance obj = new MultilevelInheritance();
        obj.showGrandparent();
        obj.showParent();
        obj.showChild();
    }
}
