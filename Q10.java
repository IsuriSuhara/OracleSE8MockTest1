package test1;

public class Q10 {

        String s;

        int s1=this.hashCode();

        String s2=this.toString();

    public static void main(String[] args) {
        Q10 q=new Q10();
        System.out.println(q.s);//null
        System.out.println(q.s1);//1096979270
        System.out.println(q.s2);//test1.Q10@41629346

    }

}
