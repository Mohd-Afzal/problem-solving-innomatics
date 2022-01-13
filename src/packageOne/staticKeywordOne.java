package packageOne;

public class staticKeywordOne {
    int a;
    int b;

    // Creating a static class variable -- Dont require a constructor to initialize the value of a static variable
    static int staticVariable = 999;

    // Static block - will have a look at static block
    static {
        int c = 90;
        int variable = 100;
    }

    static void printMessage() {
        System.out.println("Hey! I am a static function - called without binding to an object!");
    }

    staticKeywordOne() {
        this.a = 10;
        this.b = 20;
//        this.staticVariable = 000; // Must not be practiced
    }



}
