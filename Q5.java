package test1;

import com.sun.jdi.ClassType;
import com.sun.source.tree.ClassTree;

public class Q5 {
    public static void main(String[] args) {
        String mstr="500";

        long ms=Long.valueOf(mstr);
        int mss=Integer.valueOf(mstr).byteValue();
        long msss=Long.parseLong(mstr);
        //long ls = (new Long()).parseLong(mStr);
        //long ls1=new Long(mstr);//this is decrapecated.
        //int is=new Integer(mstr);//this is decrapecated.
        //long ls2=new Long()).parseLong(mStr);//but this does not work.
        System.out.println(((Object)ms).getClass().getName());
        //System.out.println(ls1);
    }
}
