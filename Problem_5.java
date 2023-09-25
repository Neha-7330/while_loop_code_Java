/*Problem statement :- Write a program to print the square of even digit of given number. */

class EvenSquare{

    public static void main(String[] args){
        int num = 123456789;
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        while(rev != 0){
            int rem = rev % 10;
            if (rem % 2 == 0){
                System.out.println(rem * rem);
            }
            rev = rev / 10;
        }
    }
}