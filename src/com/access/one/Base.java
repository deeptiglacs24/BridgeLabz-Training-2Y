package com.access.one;

public class Base {
    public void methodPublic() {
        System.out.println("Public method");
    }

    protected void methodProtected() {
        System.out.println("Protected method");
    }

    void methodDefault() {  // package-private access
        System.out.println("Default (package-private) method");
    }

    private void methodPrivate() {
        System.out.println("Private method");
    }

    // Methods to test access inside Base class
    public void testAccess() {
        methodPublic();
        methodProtected();
        methodDefault();
        methodPrivate();
    }
}
