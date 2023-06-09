package org.example;

public class Shape
{
    private Cpoint center;

    public Shape(Cpoint center)
    {
        this.center = center;
    }

    public double getCenterX(){
        return center.getAsseX();
    }

    public double getCenterY(){
        return center.getAsseY();
    }

    public Shape()
    {
        center = new Cpoint(0.0,0.0);
    }

    public double area()
    {
        return 0.0;
    }

    public double perimeter()
    {
        return 0.0;
    }

}
