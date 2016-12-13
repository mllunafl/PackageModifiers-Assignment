package com.example.domain2;

import com.example.domain.Foo;

/**
 * Created by LunaFlores on 12/13/16.
 */
public class Foo2 extends Foo {
    public Foo2() {
        System.out.println("In foo2 constructor calling toString: ");
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "Foo2{" + super.toString() +"}";
    }
}
