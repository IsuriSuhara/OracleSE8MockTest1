package test1;

public class Q11 {
    public static void main(String[] args) {
        String mys="good";
        char[] myc={'g','o','o','d'};
        String newstr=null;
        for(char ch:myc){
            newstr+=ch;
        }
        System.out.println(newstr);//nullgood
        System.out.println((newstr == mys)+ " " + (newstr.equals(mys)));

        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++){
            System.out.println(i + " " + j);//only if the j<i condition can evaluate true will this statement get printed.
        }
        System.out.println(i + " " + j);
    }
}
