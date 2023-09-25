/*Write a program which tkes number from the user. 
  if the number is even print that number in everse order or iif the number is odd print that number in
  revrse ordr by difference of 2.
 */

class RevNum{

    public static void main(String[] args){
        int num = 6;
        if (num % 2 == 0){
            while(num >= 1){
                System.out.println(num);
                num--;
            }
        }
        else{
            while(num >= 1){
                System.out.println(num);
                num = num - 2;
            }
        }
    }
}