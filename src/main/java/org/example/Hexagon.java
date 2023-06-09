package org.example;

public class Hexagon extends Shape
{
    private double side;
    private double apotema;
    private double constant = 0.866;


    public Hexagon(Cpoint center, double side)
    {
        super(center);
        setSide(side);
    }

    public Hexagon(double side)
    {
        setSide(side);
    }

    public Hexagon()
    {
        this.side = 0.0;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side)
    {
        if(side<=0)
        {
            this.side= 0.0;
        }
        else
        {
            this.side = side;
        }
    }

    public double getApotema()
    {
        apotema = getSide()*constant;
        return apotema;
    }

    @Override
    public double area() {
        return perimeter()*(getApotema()/2);
    }

    @Override
    public double perimeter() {
        return getSide()*6;
    }
}
