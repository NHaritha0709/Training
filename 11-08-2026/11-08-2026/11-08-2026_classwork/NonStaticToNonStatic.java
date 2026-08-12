class NonStaticToNonStatic {
    void show() {
        System.out.println("Non-static method");
    }

    void display() {
        show();
        System.out.println("Another non-static method");
    }

    public static void main(String[] args) {
        NonStaticToNonStatic obj = new NonStaticToNonStatic();
        obj.display();
    }
}
