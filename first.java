class Animal{
int legs;
void eat(){
    System.out.println("i am eating food");
}
}

public class first {
    public static void main(String[] args) {
    Animal cat= new Animal(); //object ceation..
    cat.legs= 4;
    System.out.println(cat.legs);
    cat.eat();
}
}
