import java.util.Stack;

public class Q9 {
    public static void main(String[] args) {
        Stack s1 =new Stack();
        Stack s2= new Stack();
        processStack(s1,s2);
        System.out.println(s1+", "+s2);
    }
    public static void processStack(Stack m1,Stack m2){
        m1.push(100);
        m2.push(m1.peek());
    }
}
