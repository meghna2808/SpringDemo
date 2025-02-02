package org.example;

public class Dev {
    private int age;
    public Dev()
    {
        System.out.println("dev created");
    }
    public Dev(int age)
    {
        this.age=age;
    }
    public void build()
    {

        System.out.println( "dev working" );
        System.out.println(age);
//        laptop.compile();
    }
}
