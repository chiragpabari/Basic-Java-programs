public class StringReverse {
    public static void strrev(String input,int index)
    {
        if(index==0)                   //Base case
        {
            System.out.println(input.charAt(index));  //Printing first character of string at last
            return;
        }
        System.out.print(input.charAt(index));  //printing character at each index
        strrev(input,index-1);             //Decrementing index value
    }
    public static void main(String[] args) {

          String input= "ChiragPabari";          //string input
          strrev(input,input.length()-1);   //Initial value of index will be one less than string length
    }
}
