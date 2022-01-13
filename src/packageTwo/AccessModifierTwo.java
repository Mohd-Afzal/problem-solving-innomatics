package packageTwo;

public class AccessModifierTwo {

    // default, public, private and protected
    public static void main(String[] args) {
        AccessModifierOne obj = new AccessModifierOne();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
