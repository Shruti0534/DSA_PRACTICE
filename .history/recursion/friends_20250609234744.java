/*
 * given n friends each one can pair or single, find no of ways people can stand in single or can be paired up
 */
import java.util.*;
public class friends{
    public static void main(String args[]){

    }
    public static int friends(int n){
        //base case
        if(n<=2){
            return n;
        }
        //kaaam
        return friends(n-1) + (n-1)*friends(n-2);
    }
}