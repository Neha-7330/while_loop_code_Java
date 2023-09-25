/*Problem Statement :- Write the program to count the odd digit of the given number.  */

class CountOdd{

    public static void main(String[] args){

        int num = 135;
        int count = 0;

        while(num != 0){
            int rem = num % 10;
            if (rem % 2 != 0){
                count++;
            }
            num = num / 10;
        }

        System.out.println("Count of odd digits : " + count);
    }
}