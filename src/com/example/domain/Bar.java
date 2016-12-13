package com.example.domain;

/**
 * Created by LunaFlores on 12/13/16.
 */
public class Bar {
    private Foo foo;

    public Bar() {
        System.out.println("In bar constructor newing up a foo");
        foo = new Foo();
        foo.packageString = "changed packagedString in bar";
        foo.protectedString ="changed protectedString in bar";
        foo.publicString = "changed publicString in bar";
        System.out.println("in bar constructor calling this.tostring");

        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Bar{" +
                "foo=" + foo +
                '}';
    }
}
