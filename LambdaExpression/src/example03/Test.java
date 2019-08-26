package example03;
//with lambda expression
public class Test {
    public static void main(String[] args) {
       Human man = ()->System.out.println("Man moving");
       man.move();
    }
}
