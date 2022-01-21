package test1;

public class Q2 {
    public static void main(String[] args) {
        char c;
        int i;
        c='a';
        System.out.println(c);
        i=c;
        i++;
        //c=i;//Java: incompatible types: possible lossy conversion from int to char
        c++;
        System.out.println(c);

    }
}
