package test1;

public class Q7 {
    public void switchString(String input){
        switch (input){
            case "a":System.out.println("apple");
            case "b":System.out.println("bat");
            break;
            case "B":System.out.println("Bigbat");
            //default:System.out.println("none");
        }

    }

    public static void main(String[] args) {
        Q7 test=new Q7();
        test.switchString("B");
    }
}
