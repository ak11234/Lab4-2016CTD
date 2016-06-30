/**
 * Created by Adam Kalman on 6/30/2016. Lab 4
 */
public class Main {
    public static void main(String[] args){
        LargeNumber n1 = new LargeNumber("21979006097993007202063791205781603194701973067");
        LargeNumber n2 = new LargeNumber("513821973481246926751192945");
        System.out.println(n1 + " + " + n2 + " = " + n1.plus(n2));
        LargeNumber n3 = new LargeNumber("357");
        LargeNumber n4 = new LargeNumber("100");
        System.out.println(n3 + " - " + n4 + " = " + n3.minus(n4));
        LargeNumber n5 = new LargeNumber("1213");
        LargeNumber n6 = new LargeNumber("201");
        System.out.println(n5 + " * " + "2" + " = " + n5.timesByOne(2));
        System.out.println(n5 + " * " + n6 + " = " + n5.times(n6));
    }
}