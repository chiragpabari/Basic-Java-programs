import java.util.Scanner;

public class SecondMax {
static int maximum(int arr[])
{
    int a=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>a)
        {
            a=arr[i];  // variable a is used to store the largest element of an array
        }
    }
    return a;
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
        int max=maximum(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]=Integer.MIN_VALUE;     //Manipulating an array such that largest element of an array is replaced with minus infinity
                                              //That means 2nd largest element of orignal array is now largest element of mainpulated array
            }
        }
        int secondmax= maximum(arr);         //second max variable will store the value of second largest element of an array
        System.out.println("The second largest element of an array is: "+secondmax);


    }
}
