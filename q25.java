package test1;

public class q25 {
    public static void main(String[] args) throws Exception {
        String[] sa = {"a", "b", "c"};
        for(String s :  sa){
            if("b".equals(s)) continue;
            System.out.println(s);
            if("b".equals(s)) break;
            System.out.println(s+" again");
        }
    }
}
