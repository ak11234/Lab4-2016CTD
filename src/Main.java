/**
 * Created by Adam Kalman on 6/30/2016. Lab 4
 */
public class Main {
    public static void main(String[] args){
        LargeNumber n1 = new LargeNumber("11111"); //5-1s
        System.out.println(n1);
        LargeNumber n2 = new LargeNumber("222222");//6-2s
        System.out.println(n2);
        System.out.println(n1.plus(n2));

    }
}
