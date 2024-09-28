package com.example;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInnerInstance();
    }
}

class Outer {
    private class Inner {
        void display() {
            System.out.println("This is a private inner class method.");
        }
    }

    void createInnerInstance() {
        Inner inner = new Inner();
        inner.display();
    }
}
