package divideandconquer;

public class merge {
    //O(nlogn) time complexity
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted array:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    public static void mergeSort(int[] arr, int si, int ei) {
      if(si>=ei){
        return;
      }
        //kaam
      int mid=si +(ei-si)/2;
      mergeSort(arr, si, mid);
      mergeSort(arr, mid + 1, ei);
      merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i=si;//left part
        int j=mid+1;//right
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; k++;
            }else{
                temp[k]=arr[j];
                j++; k++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++; k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            j++; k++;
        }
        for(int k=0,i=si;k<temp.length;k++i++){
            //copying the temp array to original array
            arr[si+k]=temp[k];
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
