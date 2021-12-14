package basics;

public class StringsInJava {

    public static void main(String[] args) {
//        String firstName = "Afzal"; // has a comlete different reference value

//        char ch = str.charAt(2); // a = arr[2] Equivalant
//        System.out.println(ch);

//        // arr[2] = 1000;
//        // Afzal -> AfQal -> to achieve this -> use string concatination
//
//        String prev = str.substring(0, 2);
//        String after = str.substring(3);
//
//        str = prev + 'Q' + after; // has a different reference value
//        System.out.println(str);

//        String firstName = new String("Afzal"); // Differet ref id
//        String secondName = new String("Afzal"); // Differet ref id
//
//        System.out.println();
//
//        // Comparing the ref IDs
//        if (firstName == secondName) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//        // Compare with the data
//        if (firstName.equals(secondName)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        StringBuffer str = new StringBuffer();
        System.out.println(str);
        int capacity = str.capacity();
        System.out.println(capacity);

        str.append('A');
        str.append('f');
        str.append('z');
        str.append('a');
        str.append('l');

//        System.out.println(str);

        str.append(" Innomatics Hydra");
        System.out.println(str);
        System.out.println(str.length());

//        char ch = str.charAt(15);
//        System.out.println(ch);

        capacity = str.capacity();
        System.out.println(capacity);


        // Afzal Innomatics
//        str.replace(0, 1, "Z");
//
//        System.out.println(str);
//
//        str.reverse();
//        System.out.println(str);


    }

}
