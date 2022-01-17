package packageTwo;

public class AccessModifierOne {
    private int num1;
    private int num2;

    protected String name;

    public String getName() {
        return name;
    }

    public AccessModifierOne() {
        this.num1 = 10;
        this.num2 = 20;
        this.name = "Subhash";
    }

}
