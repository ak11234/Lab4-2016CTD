/**
 * Created by Adam Kalman on 6/30/2016. Lab 4
 */
public class Main {
    public static void main(String[] args){
        LargeNumber n1 = new LargeNumber("21979006097993007202063791205781603194701973067");
        LargeNumber n2 = new LargeNumber("513821973481246926751192945");
        System.out.println(n1 + " + " + n2 + " = " + n1.plus(n2));
        LargeNumber n3 = new LargeNumber("1492");
        LargeNumber n4 = new LargeNumber("1066");
        System.out.println(n3 + " - " + n4 + " = " + n3.minus(n4));
    }
}