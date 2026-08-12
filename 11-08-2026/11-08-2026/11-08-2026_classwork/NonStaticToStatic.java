class NonStaticToStatic {
    static void show() {
        System.out.println("Static method");
    }

    void display() {
        show();
        System.out.println("Non-static method");
    }

    public static void main(String[] args) {
        NonStaticToStatic obj = new NonStaticToStatic();
        obj.display();
    }
}
