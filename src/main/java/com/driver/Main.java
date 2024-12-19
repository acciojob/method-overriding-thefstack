package com.driver;

public class Main {
    
public static class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
public static class B extends A {
    // Task 4: Override method meth of class A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
    public static void main(String[] args) {
        B obj = new B();

        // Call the overridden method
        obj.meth(); // Task 5: Call overridden method
        B obj1 = new B();
        obj1.meth();
    }
}