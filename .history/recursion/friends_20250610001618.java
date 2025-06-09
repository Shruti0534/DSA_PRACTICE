/*
 * given n friends each one can pair or single, find no of ways people can stand in single or can be paired up
 */
import java.util.*;
public class friends{
    public static void main(String args[]){
        System.out.println(friends(3));

    }
    public static int friends(int n){
        //base case
        if(n<=2){
            return n;
        }
        //kaaam=single-friends(n-1) + couple-friends(n-2)*(n-1)
        return friends(n-1) + (n-1)*friends(n-2);
    }
    //binary strings problem-print all binary strings of size n without consecutive ones
    publec static int binary(int n,int lastPlace, StringBuilder str){
        //base case 
        if(n==0){
            System.out.println(str);
            return 1;
        }
    }

    }
}