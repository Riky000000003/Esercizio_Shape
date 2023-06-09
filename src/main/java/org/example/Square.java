package org.example;

public class Square extends Shape
{
    private double side;

    public Square(Cpoint center, double side) {
        super(center);
        setSide(side);
    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0)
        {
            this.side = 0;
        }
        else
        {
            this.side = side;
        }
    }

    @Override
    public double perimeter() {
        return getSide()*4;
    }

    @Override
    public double area() {
        return getSide()*getSide();
    }
}
