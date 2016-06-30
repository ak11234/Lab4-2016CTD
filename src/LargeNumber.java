import java.awt.*;
import java.util.Stack;

/**
 * Created by Adam Kalman on 6/30/2016. For lab 4
 */
public class LargeNumber {

    public static void main(String[] args){
        //Test private methods here
        LargeNumber n1 = new LargeNumber("555111222");
        System.out.println(leftPad("123456", 2));
    }

    private String strNum;

    public LargeNumber(String number){
        strNum=number;
    }
    private static String leftPad(String nums, int zeros){
        String result="";
        for (int k=1 ; k<=zeros ; k++){
            result += "0";
        }
        return result+nums;
    }
    public String toString(){
        return strNum;
    }
    public LargeNumber plus(LargeNumber other){
        //First get lengths to see if we need to pad
        int len,lenother,difference,finallen;
        len=strNum.length();
        lenother=other.strNum.length();
        if (len<lenother){
            difference=lenother-len;
            finallen=lenother;
            strNum =leftPad(strNum,difference);
        }
        else if (len>lenother){
            difference=len-lenother;
            finallen=len;
            other.strNum=leftPad(other.strNum,difference);
        } else {
            finallen=len;
        }
        //Now adding time.
        int num1,num2,sum,remainder=0;
        Stack <String> answerstack = new Stack <String>();
        String strSum;
        for (int c=finallen ; c>0 ; c--){
            num1=Integer.parseInt(strNum.substring(c-1,c));
            num2=Integer.parseInt(other.strNum.substring(c-1,c));
            sum=num1+num2+remainder;
            remainder=0;
            strSum=Integer.toString(sum);
            if (sum>9){
                //split nums and do stuff
                answerstack.push(strSum.substring(1,2));
                remainder=Integer.parseInt(strSum.substring(0,1));
            } else {
                answerstack.push(strSum);
            }
        }
        LargeNumber result = new LargeNumber("");
        for (int k=answerstack.size() ; k>=1 ; k--){
            result.strNum+=answerstack.pop();
        }
        System.out.println(answerstack);
        System.out.println(strNum);
        return result;
    }
}
