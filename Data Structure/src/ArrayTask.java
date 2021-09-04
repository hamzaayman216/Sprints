import java.util.*;
public class ArrayTask {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int temp=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}