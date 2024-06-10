public class Main {

    static void targetsum(int arr[],int sum)
    {
        int count=0; //count variable will store number of times target sum will be achieved
        for (int i=0;i<arr.length;i++)

        {
            for(int j=i+1;j<arr.length;j++){

                    if(arr[i]+arr[j]==sum) //selecting an element and adding to its next elements
                    {
                        count++;
                    }
            }
        }

        System.out.println(count);

    }
    public static void main(String[] args) {


        int arr1[]={4,2,18,0,7};
        targetsum(arr1,11);



    }
}