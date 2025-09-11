// package oopspractice.polymorphism;

public class MethodOverloading {

    public void show(){
        System.out.println("Method Overloading");
    }

    public void hide(String str){
        System.out.println(str);
        System.out.println("NuclearCodes");
    }

    public void add(){

    }
    public int add(int a, double b){
        return a+(int)b;
    }
    public static void main(String[] args) {
        MethodOverloading o = new MethodOverloading();
        o.add(0,2.4);

    }
}