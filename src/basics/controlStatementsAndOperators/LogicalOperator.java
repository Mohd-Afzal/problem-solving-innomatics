package basics.controlStatementsAndOperators;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
            Logical Operators
                1. Logical AND operator
                    I will go on a data if (Sunday and weather should be pleasant)

                    AND - &&

                    if (criteria-1 && criteria-2) {
                        make a decision / perform the action
                    }

                    AND Operators
                        1. Both the left and right expression should evaluate to a boolean value
                        2. True && True = True
                        3. True && False = False
                        4. False && True = False
                        5. False && False = False

                        Binary - 0 1
                        1 - ON/True, 0 - OFF/False

                        AND Operator - Truth Table
                        1 1 1
                        1 0 0
                        0 1 0
                        0 0 0

            2. Logical OR operator
                if either of the conditions is true then the whole statement is true. Operator - ||

                OR Operators
                        1. Both the left and right expression should evaluate to a boolean value
                        2. True || True = True
                        3. True || False = True
                        4. False || True = True
                        5. False || False = False


                        || Operator - Truth Table
                        1 1 1
                        1 0 1
                        0 1 1
                        0 0 0


            3. NOT operator
               Negation - Opposite
               Looks Like - !

               NOT Operators
                        1. It applies on a single expression - expression should be a boolean
                        2. ! True = False
                        3. ! False = True
        */


        /*
        *       I am your decision Maker! Let's see whether you are lucky enough to get a date :P
        *
        *
        * Tell me which day of the week is it? Sunday/Monday/Tuesday
        *
        * Also, tell me if the weather is pleasant or not? Yes/No
        *
        *
        * ******* Processing the final decision *********
        *
        * You are lucky! You will enjoy your evening! / You are an unlucky fellow :P
        *
        *
        * We are Done at this point!
        *
        * */


        System.out.println("\tI am your decision Maker! Let's see whether you are lucky enough to get a date :P\n\n");

//        Input Statement
        System.out.print("Tell me which day of the week is it? ");
//        Write down the rules that must be followed while writing an identifier
//        Camel Case
        String weekdayName = s.next();
        System.out.println("\n");
//        System.out.println(); \n

        System.out.print("Also, tell me if the weather is pleasant or not? ");
        String isPleasant = s.next();
        System.out.println("\n\n");

        System.out.println("******* Processing the final decision *********\n");
//        System.out.println(); \n


//        Logical Thinking/Decision Making

        // something.equals(other) -> something == other

//        criteria-1
        boolean isSunday = (weekdayName.equals("Sunday"));

//        criteria-2
        boolean isWeatherPleasant = (isPleasant.equals("Yes"));


        if ((weekdayName.equals("Sunday")) && (isPleasant.equals("Yes"))) {
            System.out.println("You are lucky! You will enjoy your evening!");
        } else {
            System.out.println("You are an unlucky fellow :P");
        }

        System.out.println("\n\n ********** We are Done at this point! ********** ");

    }
}
