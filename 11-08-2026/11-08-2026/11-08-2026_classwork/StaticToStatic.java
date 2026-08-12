class StaticToStatic {
    static void show() {
        System.out.println("Static method");
    }

    static void display() {
        show();
        System.out.println("Another static method");
    }

    public static void main(String[] args) {
        display();
    }
}