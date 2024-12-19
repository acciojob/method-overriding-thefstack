package com.driver;



public class Main {
    // Task 1: Create class A
public static class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends A
public static class B extends A {
    // Task 4: Override method meth of class A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        B objB = new B();

        // Call the overridden method
        objB.meth(); // Task 5: Call overridden method
        B objB1 = new B();
        objB1.meth();
    }
}