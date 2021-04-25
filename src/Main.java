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
       /* CheckSongOnRepeat();*/
        /*MultipleChoiceExercise();*/
       /* double mealPrice = CalculateMealPrice(100, 0.20, 0.08);
        int numberOfPerson;
        System.out.println("Please input number of person: ");
        Scanner input = new Scanner(System.in);
        numberOfPerson = input.nextInt();
        double mealPriceEachPerson = mealPrice / numberOfPerson;
        System.out.println("meal price for each person is: " + mealPriceEachPerson);*/
        /*Triangle test1 = new Triangle(10,20, 30, 40, 50);
        double result = test1.FindArea();
        System.out.println("result is: " + result);*/

        //Using StudentProfile

        StudentProfile test2 = new StudentProfile("uyen", "ho", 1988, 4.0, "computer Siences");
        double year = test2.IncrementExpectedGraduationYear();
        System.out.println(year);
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

    public static void MultipleChoiceExercise()
    {
        // implement a multiple-choice question
        //1st
        String question = "Where is the crossfit 399 located?";
        String answerOne= "Avenue K";
        String answerTwo = "Damansara";
        String answerThree = "London";
        System.out.println("Here is the question:" + question);
        System.out.println("please select one of the answer below: ");
        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(answerThree);
        System.out.println("Please enter your answerer: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println(userInput);
        if (userInput.equals(answerOne))
        {
            System.out.println("DING DONG!YOUR ANSWER IS CORRECT");
        }
        else
        {
            System.out.println("YOUR ANSWER IS INCORRECT");
        }
    }

    public static double CalculateMealPrice(double ListMealPrice, double tipRate, double taxRate)
    {
        double tips = ListMealPrice * tipRate;
        double tax = ListMealPrice * taxRate;
        double totalMealPrice = ListMealPrice + tips + tax;
        System.out.println("your meal price is: " + totalMealPrice);
        return  totalMealPrice;
    }

    public static double CalculateEmployeeSalary(double houPerWeek,double salaryPerHour, double numberOfVacationDays)
    {
        double numberofVacationHours = numberOfVacationDays * 8;
        double grossSalary = houPerWeek * salaryPerHour - salaryPerHour*numberofVacationHours;
        return grossSalary;
    }
}

