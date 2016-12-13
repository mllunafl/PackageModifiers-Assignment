package com.example.domain;

/**
 * Created by LunaFlores on 12/13/16.
 */
public class Foo {
    public String publicString = "public string";
    protected String protectedString = "protected string";
    String packageString = "package string";
    private String privateString = "private string";

    public Foo() {
        System.out.println("In Foo constructor calling this.toString" + this.toString());
    }

    @Override
    public String toString() {
        return "Foo{" +
                "publicString='" + publicString + '\'' +
                ", protectedString='" + protectedString + '\'' +
                ", packageString='" + packageString + '\'' +
                ", privateString='" + privateString + '\'' +
                '}';
    }
}
