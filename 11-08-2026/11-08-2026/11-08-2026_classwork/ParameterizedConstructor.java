class ParameterizedConstructor {
    String name;
    int age;

    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Haritha", 20);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}