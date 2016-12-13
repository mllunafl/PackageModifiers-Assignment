package com.example.domain2;

import com.example.domain.Foo;

/**
 * Created by LunaFlores on 12/13/16.
 */
public class Foo2 extends Foo {
    public Foo2() {
        System.out.println("In foo2 constructor calling super.toString: ");
        System.out.println(super.toString());
        System.out.println("In foo2 constructor calling super.toString: ");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Foo2{" + super.toString() +"}";
    }
}
