import java.util.Scanner;

public class Main {

    public static void getSpeedSteel(int secondsInput){
        double distanceTraveled = secondsInput * 16400;
        System.out.println("After " + secondsInput + " seconds, the sound will have traveled " + distanceTraveled + " feet.");

    }

    public static void getSpeedWater(int secondsInput){
        double distanceTraveled = secondsInput * 4900;
        System.out.println("After " + secondsInput + " seconds, the sound will have traveled " + distanceTraveled + " feet.");

    }

    public static void getSpeedAir(int secondsInput){
        double distanceTraveled = secondsInput * 1100;
        System.out.println("After " + secondsInput + " seconds, the sound will have traveled " + distanceTraveled + " feet.");

    }

    public static int getChoice(){
        Scanner menu1scnr = new Scanner(System.in);
        int userInput = menu1scnr.nextInt();

        while (userInput > 4 || userInput < 1){
            System.out.println("Please enter a number 1-4");
            userInput = menu1scnr.nextInt();
        }
        return userInput;
    }

    public static void initialDisplay(){
        System.out.println("Welcome to the Speed of Sound Calculator");
        System.out.println("1. Air");
        System.out.println("2. Water");
        System.out.println("3. Steel");
        System.out.println("4. Exit");
    }

    public static void main (String[] args){
        Scanner mainScnr = new Scanner(System.in);

        initialDisplay();

        int choice = getChoice();
        System.out.println(choice);

        int seconds;

        switch(choice){
            case 1:
                System.out.println("You would like to calculate the speed of sound through AIR");
                System.out.println("How many seconds will the sound be traveling for?");
                seconds = mainScnr.nextInt();

                while (seconds < 0){
                    System.out.println("Please enter an amount of seconds greater than 0");
                    seconds = mainScnr.nextInt();
                }
                getSpeedAir(seconds);
            break;
            case 2:
                System.out.println("You would like to calculate the speed of sound through WATER");
                System.out.println("How many seconds will the sound be traveling for?");
                seconds = mainScnr.nextInt();

                while (seconds < 0){
                    System.out.println("Please enter an amount of seconds greater than 0");
                    seconds = mainScnr.nextInt();
                }
                getSpeedWater(seconds);
            break;
            case 3:
                System.out.println("You would like to calculate the speed of sound through STEEL");
                System.out.println("How many seconds will the sound be traveling for?");
                seconds = mainScnr.nextInt();

                while (seconds < 0){
                    System.out.println("Please enter an amount of seconds greater than 0");
                    seconds = mainScnr.nextInt();
                }
                getSpeedSteel(seconds);

            break;
            case 4:
                System.exit(0);
            break;
            default:
                System.out.println("Something must have gone wrong");
        }
    }
}
