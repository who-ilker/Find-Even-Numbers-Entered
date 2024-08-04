import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        int numEntered, sumNumEntered = 0, flag = 0;

        System.out.print("Enter a number: ");
        numEntered = inp.nextInt();

        for(int i = 0; i <= numEntered; ++i){
            if (i % 3 == 0 && i % 4 == 0){
                sumNumEntered += i;
                flag++;
            }
        }

        if (flag == 0) {
            System.out.println("No numbers divisible by 3 and 4 in the given range.");
        } else {
            System.out.println("Average of the numbers divisible by 3 and 4: " + (double)sumNumEntered / flag);
        }
    }
}
