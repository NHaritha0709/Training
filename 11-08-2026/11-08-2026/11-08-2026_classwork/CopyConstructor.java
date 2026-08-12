class CopyConstructor {
    String name;

    CopyConstructor(String n) {
        name = n;
    }

    CopyConstructor(CopyConstructor obj) {
        name = obj.name;
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("Haritha");
        CopyConstructor obj2 = new CopyConstructor(obj1);

        System.out.println(obj2.name);
    }
}