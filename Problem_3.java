/*Problem Statement :- Write a program to count the digits of the given given number*/

class CountDigit{

    public static void main(String[] args){
        int count = 0;
        int num = 123456;

        while(num != 0){
            count++;
            num = num / 10;
        }

        System.out.println("Count of digit :- " + count);
    }
}