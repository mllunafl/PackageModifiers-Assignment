package com.example;


import com.example.domain.Bar;
import com.example.domain.Foo;
import com.example.domain2.Bar2;
import com.example.domain2.Foo2;

public class Main {

    public static void main(String[] args) {
        System.out.println("In main newing Foo");
        Foo foo = new Foo();
        System.out.println("\nIn main newing Bar");
        Bar bar = new Bar();
        System.out.println("\nIn main newing Foo2");
        Foo2 foo2 = new Foo2();
        System.out.println("\nIn main newing Bar2");
        Bar2 bar2 = new Bar2();


    }
}
