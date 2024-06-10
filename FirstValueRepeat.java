import java.util.Scanner;

public class FirstValueRepeat {
         static int fvr(int arr[])
         {
             int a=-1;
             for(int i=0;i<arr.length;i++)
             {
                 for(int j=i+1;j<arr.length;j++)
                 {
                     if(arr[i]==arr[j])
                     {
                         a=arr[i];
                         return a;
                     }
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
        if(fvr(arr)==-1){
            System.out.println("No element is repeated in given array");
        }

       else{
            System.out.println("The first repeated element in given array is "+fvr(arr));
        }
    }

}
