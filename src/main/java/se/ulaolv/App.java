package se.ulaolv;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] mydices = throwAllFive();

        do {

            if (count == 0) {
                throwAllFive();
                for(int i : mydices){
                    System.out.println(i);
                }
                count++;
            } else{
                System.out.println("Do you want to save die #1 ? (Y/N)");
                String dice_1 = scanner.nextLine();
                System.out.println("Do you want to save die #2 ? (Y/N)");
                String dice_2 = scanner.nextLine();
                System.out.println("Do you want to save die #3 ? (Y/N)");
                String dice_3 = scanner.nextLine();
                System.out.println("Do you want to save die #4 ? (Y/N)");
                String dice_4 = scanner.nextLine();
                System.out.println("Do you want to save die #5 ? (Y/N)");
                String dice_5 = scanner.nextLine();

                if(dice_1.charAt(0)=='N' || dice_1.charAt(0)=='n'){
                    mydices[0] = throwDie();

                }else if(dice_2.charAt(0)=='N' || dice_2.charAt(0)=='n'){
                    mydices[1] = throwDie();
                }else if(dice_3.charAt(0)=='N' || dice_3.charAt(0)=='n'){
                    mydices[2] = throwDie();
                }else if(dice_4.charAt(0)=='N' || dice_4.charAt(0)=='n'){
                    mydices[3] = throwDie();
                }else if(dice_5.charAt(0)=='N' || dice_5.charAt(0)=='n'){
                    mydices[4] = throwDie();
                }count++;
                for(int i : mydices){
                    System.out.println(i);
                }

            }


        } while (count < 3);

    }
    private static int throwDie() {
        Random random = new Random();
        int die = random.nextInt(6) + 1;
        return die;
    }
    private static int[] throwAllFive() {

        int[] newArray = new int[5];
        for(int i = 0; i < 5; i++){
            newArray[i] = throwDie();
        }

        return newArray;
    }
}
