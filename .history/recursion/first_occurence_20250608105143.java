import java.util.*;
public class first_occurence{
    public static void main(String[] args){
        

    }
    public static int firstocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstocc(arr,key,i+1);
    }
}