//In given question,we are assuming that only one element is unique in an array

import java.util.*;
public class UniqueNumber {
    static void unique(int arr[])
    {


        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int un=-1;   //variable u is used to print unique element of an array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            {
                un=arr[i];
            }
        }

        System.out.println("The unique element in an array is:"  + un);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt(); //size of array
        int arr[]=new int[size];
        System.out.println("Enter array "+size+" elements:");

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        unique(arr);

    }
}
