import java.util.Scanner;

public class pallindrome {
       public static void main(String[] args) {
        int r,sum=0,temp;
        int n1 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        n1 = Integer.parseInt(in.next());


        temp=n1;
        while(n1>0){
            r=n1%10;  //getting remainder
            sum=(sum*10)+r;
            n1=n1/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

}


//public boolean isPalindrome(int x) {
//    String str = String.valueOf(x);
//    int start = 0;
//    int end = str.length() - 1;
//    while(start < end){
//        if(str.charAt(start++) != str.charAt(end--)) return false;
//    }
//    return true;
//}
