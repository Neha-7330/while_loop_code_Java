/*Problem Statement :- Write a program to calculate the factorial of the given number */

class Factorial{

    public static void main(String[] args){
        int num = 4;
        int i = 1;
        int fact = 1;
        while(i <= num){
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}