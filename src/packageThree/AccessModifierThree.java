package packageThree;

import packageTwo.AccessModifierOne;

public class AccessModifierThree {

    public static void main(String[] args) {
        AccessModifierOne obj = new AccessModifierOne();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
