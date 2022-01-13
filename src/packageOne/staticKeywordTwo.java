package packageOne;

public class staticKeywordTwo {
    static void greeting(String name) {
        System.out.println("Good Morning, " + name + "!");
    }

    public static void main(String[] args) {
//        AccessModifierOne obj = new AccessModifierOne();
//        System.out.println(obj.a);
//        System.out.println(obj.b);
        // for a class variable, we must have an object created in order to access it.

        // Static

        System.out.println(staticKeywordOne.staticVariable);
        staticKeywordOne.printMessage();


        staticKeywordTwo.greeting("Afzal");

//        int[] arr = {1, 2, 3};
//        Arrays.sort(arr); // sort() is a Static function in inbuilt Arrays class

    }
}
