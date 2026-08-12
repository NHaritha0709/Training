class StaticToNonStatic {
    void show() {
        System.out.println("Non-static method");
    }

    static void display() {
        StaticToNonStatic obj = new StaticToNonStatic();
        obj.show();
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        display();
    }
}