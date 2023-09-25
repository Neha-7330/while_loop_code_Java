/*Problem Statement :- Write a program to print the sum of all even numbers and multiplication of odd 
 number between 1 to 10.
 */

class AddMultiply{

    public static void main(String[] args){
        int i = 1;
        int num = 10;
        int sum = 0;
        int multi = 1;

        while(i <=  num){
            if(i % 2 == 0 ){
                sum = sum + i;
            }
            else{
                multi = multi * i;
            }
            i++;
        }

        System.out.println("Sum of even numbers :- " + sum);
        System.out.println("Multiplication of odd number :- " + multi);
    }
}