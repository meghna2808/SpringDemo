package org.example;

public class Dev {
    private Laptop laptop;
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }




    public Dev()
    {
        System.out.println("dev created");
    }
    public Dev(Laptop laptop)
    {
        this.laptop=laptop;
    }
    public void build()
    {

        System.out.println( "dev working" );
        laptop.compile();
    }
}
