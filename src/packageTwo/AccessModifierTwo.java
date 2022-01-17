package packageTwo;

public class AccessModifierTwo {

    // default, public, private and protected
    public static void main(String[] args) {
        AccessModifierOne obj = new AccessModifierOne(); // public
        System.out.println(obj.name);
        obj.getName();

//        System.out.println(obj.num1); // private
//        System.out.println(obj.num2); // private
    }
}
