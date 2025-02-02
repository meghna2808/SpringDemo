package org.example;

public class Dev {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public Dev()
    {
        System.out.println("dev created");
    }
    public Dev(int age)
    {
        this.age=age;
        System.out.println(age);
    }

    public void build()
    {

        System.out.println( "dev working" );
    }
}
