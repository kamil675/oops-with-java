

class Feature{
     static void add(int a, int b){
        System.out.println(a+b);
    }
     static void add(double a, double b){
        System.out.println(a+b);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Feature.add(2,2);
        Feature.add(2.2,3.3);
    }
}
