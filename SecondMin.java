import java.util.Scanner;
public class SecondMin {
    static int minimum(int arr[])
    {
        int a=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<a)
            {
                a=arr[i];  // variable a is used to store the smallest element of an array
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
        int max=minimum(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]=Integer.MAX_VALUE;     //Manipulating an array such that smallest element of an array is replaced with plus infinity
                //That means 2nd smallest element of orignal array is now smallest element of mainpulated array
            }
        }
        int secondmin= minimum(arr);         //second max variable will store the value of second largest element of an array
        System.out.println("The second smallest element of an array is: "+secondmin);


    }
}
