public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speak();
        Animal cat = new Cats();
        cat.speak();

        MathUtils m= new MathUtils();
        m.add(23.3, 121.2);
        m.add(23, 121, 21);
        m.add(23, 12);
        // MethodOverloading obj1 = new MethodOverloading();
        // MethodOverloading obj2 = new MethodOverRiding();
        // obj1.show();
        // obj2.show();
        // MethodOverloading obj3 = new MethodOverloading();
        // MethodOverRiding obj4 = new MethodOverRiding();
        // obj3.hide("7 crore");
        // obj4.hide();
    }
}
