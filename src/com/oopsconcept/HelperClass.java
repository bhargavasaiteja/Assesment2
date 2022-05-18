package com.oopsconcept;

public class HelperClass {
    public double mult(double v, double v1) {
        return v*v1;
    }
}
class HelperClass2{
    public static void main(String[] args)
    {
    HelperClass s=new HelperClass();
    double dbs=s.mult(1.95,1.05);
        System.out.println("multiplication of two double valves is "+ dbs);
    }
}
