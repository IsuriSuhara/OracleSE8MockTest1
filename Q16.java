package test1;

public class Q16 {
    public static Object testInts(Integer obj, int var){
        obj = ++var;
        obj++;
        return obj;
    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        System.out.println (testInts(val1++, ++val2));//12
        System.out.println(val1+" "+val2);//6 10
    }
}
