/*Write a program to check whether the number is  a palindrome number or not (2332) */

class PalindromeNum{

    public static void main(String[] args){

        int num = 2332;
        int temp = num;
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (rev == temp){
            System.out.println(temp + " is a Palindrome Number.");
        }
        else{
            System.out.println(temp + " is not a Palindrome Number.");
        }
    }

}
