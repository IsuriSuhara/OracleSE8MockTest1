package q18;
import q18.Bozo.*;

public class TypeBozo implements Bozo {
    public TypeBozo(){
        //type=1;//type in interface is final
    }
    public void jump(){
        System.out.println("Jumping: "+type);
    }
    public static void main(String[] args) {
        TypeBozo tb = new TypeBozo();
        tb.jump();

    }
}
