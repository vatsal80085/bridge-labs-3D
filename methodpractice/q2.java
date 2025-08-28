package methodpractice;

public class q2 {
    public static void main(String[] args) {
        float tempcelsius=37;
        float ans = checktemp(tempcelsius);
        System.out.println(ans);
    }
    public static float checktemp(float celsius){
        float fahrenheit=((9/5)*celsius)+32;
        return fahrenheit;
    }
}
