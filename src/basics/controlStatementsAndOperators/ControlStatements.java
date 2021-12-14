package basics.controlStatementsAndOperators;

public class ControlStatements {

    public static void main(String[] args) {

////        Control Statements
//
//        int x = 20;
//        int y = 30;
//
//        if (x >= 20) {
//
//          // TODO
////            System.out.print("X is greater or equal to 20\n");
//            System.out.print("X is greater or equal to 20 \t");
//
//        } else if (y < 50) {
//
//            // TODO
//            System.out.println("Y is less than 50");
//
//        } else if (y > 100){
//
//            // TODO
//            System.out.println("None of the above conditions are true");
//        } else {
//
//        }

//        System.out.print("Control Statements executed");

        // 9 10 12(if true) 15 28
        // 9 10 17(if true) 20 28
        // 9 10 22 25 28

        /*
        *       Output
        *
        * X is greater or equal to 20
        * Control Statements executed
        *
        *
        * */


//        if (the highway is not busy on a Saturday) {
//
//            if (starbucks is open){
//
//                // I am gonna buy a cup of coffee for myself
//
//            }
//
//            //Take my own car to the office
//
//        } else {
//
//            //taking the public transport / metro
//        }

        // End of control

//        45(if true) -> 46 -> 47(true) -> 48 -> 49 -> 53
//        45(if true) -> 46 -> 47(false) -> 53
//        45(if false)-> 55 -> 57


        // Variables
        int age = 27;

        String name1 = "Afzal"; // He is 27
        String name2 = "Swanand"; // He is 24
        String name3 = "Raghu"; // He is 27
        String name4 = "Swati"; // She is 23
        String name5 = "Subhash"; // He is 28 and works at Google


//        boolean isTrue = [<, >, >=, <=, ==]


//        if (age > 25) {
//
//            if (name1 == "Afzal") {
//                System.out.println("Afzal is the instructor to Java Batch at Innomatics");
//            } else if (name3 == "Raghu") {
//                System.out.println("Raghu is a student in the Java Batch at Innomatics");
//            } else {
//                System.out.println("Subhash is an employee at Google");
//            }
//
//            // Afzal, Raghu, Subhash
//
//        } else {
//          // Swanand, Swati
//        }

        int val = 2;
        switch (val) {
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            default:
                System.out.println("not a valid input");
        }

//        Scanner s = new Scanner(System.in);
//
//        int age = s.nextInt();
//        String name = s.nextLine();
//        String sentence = "I am " + name + ". Based out of Delhi but originally from Kerala. I am " + age + " years old.";
//
//        System.out.println(sentence);
    }

}
