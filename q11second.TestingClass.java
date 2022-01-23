package q11second;
import q11first.*;

public class TestingClass {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.print((q11first.First.hello==hello)+" ");
        System.out.print((q11first.First.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
        System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
        System.out.println(hello == ("Hel"+lo).intern());

    }
}
