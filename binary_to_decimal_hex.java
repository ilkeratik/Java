import java.util.*;


public class binarytodecimaloctal{

    public static int binarytodecimal(String s){
        int sum = 0;
        int len =  s.length();
        for(int i = 0; i < len ; i++){
            //if char-number at the current index is 0 then we add 2^i to sum
            if( s.charAt(i) == '1') {
                sum += Math.pow(2, len - i -1) ;
            }
        }
        return sum;
    }

    public static String hexcode(int num){
        //if num is less than 10 it return the num because of hexadecimal display
        if(num < 10) return String.valueOf(num);
        //if its more than 9 it return A to F char
        else return Character.toString ((char) (65 + num - 10));
    }

    public static String binarytohex(String s){
        int len = s.length(), part, sum = 0;
        //initialized null string
        String hex = "";
        //checking the size of string if the size is multiple of 4, part number would be exactly the division
        if ( len % 4 == 0){
            part = len / 4;
        }
       //if its not a multiple of 4 then we have to divide string part+1 because the last one can be less than size 4, we will fill rest with 0 logically
        else{
            part = (len / 4) + 1;
        }
        //each 4 character size group will represent a character from hexadecimal display
        for( int i = 0; i < part ; i++){
            for ( int j = 0; j < 4; j++){
                //if the index is bigger than bounds we will consider its value as 0, this will happen when the last part has less than 4 elements
                //next conduct will check wheter the value at current index is 1 or 0, if it is 1 will add 2^j to sum of particular group
                if((len - 1 - (i * 4 + j)) >= 0 && s.charAt(len - 1 - (i * 4 + j)) == '1'){
                        sum += Math.pow(2 , j);
                }
            }
        hex = hex + hexcode(sum);
        sum = 0;
        }
        return new StringBuilder(hex).reverse().toString();

    }

    public static void main (String args[]){
        System.out.println("hex value: " + binarytohex("1101100"));
        System.out.println("decimal value: " + binarytodecimal("1101100"));
    }


}
