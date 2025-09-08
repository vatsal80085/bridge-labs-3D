package oopspractice.inheritance1;

class Child extends Parent {
    Child(){
        super();
        System.out.println("Hey Child Constructor");
    }   
    public void subtract(int a, int b){
        System.out.println(a-b);
        super.add(a, b);
    } 
}
