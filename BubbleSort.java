
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,8,6,4,2};
        bubbleSortRecursion(arr, 4,0);
        System.out.println(Arrays.toString(arr));
        }
    static void bubbleSortRecursion(int[] arr,int n,int i){
        if(n==0){
            return;
        }
        else if(i<n && arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            bubbleSortRecursion(arr, n,i+1);
        }
        else if(i<n && arr[i]<arr[i+1]){
              bubbleSortRecursion(arr,n,i+1);
        }
        else{
            bubbleSortRecursion(arr, n-1, 0);
        }


    }
    
}
