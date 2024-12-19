package com.driver;

// Task 1: Create class A
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends A
class B extends A {
    // Task 4: Override method meth of class A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        B objB = new B();

        // Call the overridden method
        System.out.println(objB.meth()); // Task 5: Call overridden method
    }
}