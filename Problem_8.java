/*Write a program to print the countdown of days to submit the assignment */

class CountDown{

    public static void main(String[] args){
        int num = 7;

        while(num >= 0){
            if(num == 1){
                System.out.println(num + " day remaining");
            }
            else if(num == 0){
                System.out.println(num + " days Assignment is Overdue.");
            }
            else{
                System.out.println(num + " days remaining");
            }
            num--;
        }

    }
}