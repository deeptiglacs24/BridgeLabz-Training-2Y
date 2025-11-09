package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testMethods() {
        methodPublic();     
        methodProtected();   
        
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.testMethods();
    }
}
