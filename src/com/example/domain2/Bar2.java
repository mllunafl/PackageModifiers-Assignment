package com.example.domain2;

import com.example.domain.Foo;

/**
 * Created by LunaFlores on 12/13/16.
 */
public class Bar2 {
    private Foo foo;

    public Bar2() {
        System.out.println("in bar2 constructor");
        foo = new Foo();
        foo.publicString = "changed publicString in bar2";
        System.out.println("in bar2 constructor calling toString");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Bar2{" +
                "foo=" + foo +
                '}';
    }
}
