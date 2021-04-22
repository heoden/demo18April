import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Main {
    //create program which have data presenting
    // Student's age
    //Student GPA
    //student first initial
    //Student last initial
    //Whether student has perfect attendance so far
    public static void main(String[] args) {
      /*  System.out.println("print out string");
        int studentAge = 15;
        double gpaOfStudent = 3.5;
        String firstName = "TestABCXYZ";
        char IndexFirstName = firstName.charAt(3);
        boolean hasPerfectAttendance;
        System.out.println(studentAge);
        System.out.println(IndexFirstName);
        //concattenating string in java

        String name = firstName + " " + "lastName";
        System.out.println(name);

        System.out.println("what is the new GPA: ");
        Scanner input = new Scanner(System.in);
        gpaOfStudent = input.nextDouble();

        System.out.println("student: " + firstName + " " + "A" + "has current GPA is" + gpaOfStudent);*/

        // Write program "fortune teller flow control" with IF else
        //start
      /*  int inputtedNumber = 0;
        System.out.println("Please input number from 1 to 10: ");
        Scanner input = new Scanner(System.in);
        System.out.println("input number is" + inputtedNumber);
        inputtedNumber = input.nextInt();
        if(inputtedNumber <= 5)
        {
            System.out.println("Enjoy the good lick a friends bring to you");
        }
        else {
            System.out.println("Your shoe selection will make you happy today");
        }*/

        //Write code for loops to check if current song on repeat
        CheckSongOnRepeat();
    }

    public static void CheckSongOnRepeat()
    {
        Boolean isCurrentSongOnRepeat = true;
        Scanner inputValue = new Scanner(System.in);

        while(isCurrentSongOnRepeat)
        {
            String userInput = inputValue.next();
            System.out.println("Here is user input:" + userInput);
            System.out.println("Would you like to stop the song: ");
            if(userInput.equals("Yes"))
            {
                isCurrentSongOnRepeat = false;
            }
        }
        System.out.println("Playing same song again");
    }






}

