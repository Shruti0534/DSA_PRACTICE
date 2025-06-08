import java.util.*;
public class first_occurence{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
       System.out.println(firstocc(arr,target,0));

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
    public static int  lastocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound= lastocc(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}