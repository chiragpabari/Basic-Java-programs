public class triplet {

    static void tripl(int arr[], int sum) {
        int count = 0; // count variable will store number of times target sum will be achieved

        //sum=x+y+z
        //arr[i]=x,arr[j]=y,arr[k]=z
         for (int i = 0; i < arr.length; i++)  {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == sum) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int arr1[] = {4,2,0,3,3};
        tripl(arr1, 6);
    }
}
