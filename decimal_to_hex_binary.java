import java.util.*;
/** ilkeratik.com
---> converting decimal values to other bases which smaller than 16.
 */

public class decimal_to_hex_binary{

    public static String hexcode(int num){
        //if num is less than 10 it return the num because of hexadecimal display
        if(num < 10) return String.valueOf(num);
        //if its more than 9 it return A to F char
        else return Character.toString ((char) (65 + num - 10));
    }
    
    public static String dectoanybase(int a, int b){
        String hex = "";
        int div, remain;
        div = a;
        //it will continue dividing decimal number till its division to b is equal 0
        while ( div > 0 ){
            //the significant part of division is remain part so we storing it
            remain = div % b;
            //keep dividing till reach 0
            div = div / b;
            //remained part matching with its hex code, no matter if we looking for hexadecimal result or not, but its valid for bases smaller than 16
            hex = hex + hexcode(remain);
        }
        //reversing the result so it supposed to be
        hex = new StringBuilder(hex).reverse().toString();
        return hex;
    }
    
    public static void main (String args[]){
        System.out.println("hex value: "+ dectoanybase(116512,2));

    }
}
