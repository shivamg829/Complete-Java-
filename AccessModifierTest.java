class AccessModifier {
    public int publicVar;
    protected int protectedVar;
    int defaultVar;
    private int privateVar;

    public AccessModifier() {
        this.publicVar = 10;
        this.protectedVar = 20;
        this.defaultVar = 30;
        this.privateVar = 40;
    }

    public void publicMethod() {
        System.out.println("Public method");
        privateMethod();
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method: " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }
}

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        
        obj.publicVar = 100;
        obj.protectedVar = 200;
        obj.defaultVar = 300;
        
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.getPrivateVar());
        
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }
}