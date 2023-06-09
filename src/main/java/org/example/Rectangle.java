package org.example;

public class Rectangle extends Shape
{
    private double base;
    private double height;
    public Rectangle(Cpoint center, double base, double height)
    {
        super(center);
        setBase(base);
        setHeight(height);
    }
    public Rectangle(double base, double height)
    {
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base<=0)
        {
            this.base = 0;
        }
        else
        {
            this.base = base;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=0)
        {
            this.height = 0;
        }
        else
        {
            this.height = height;
        }
    }

    @Override
    public double area() {
        return getBase()*getHeight();
    }

    @Override
    public double perimeter() {
        return (getBase()+getHeight())*2;
    }

    public Rectangle rectangleIntersection(Rectangle r, Rectangle r2)
    {
        //trovare i vertici del primo rettangolo
        double a = r.getCenterX()-(r.getBase()/2); //left
        double b = r.getCenterX()+(r.getBase()/2); //right
        double c = r.getCenterY()+(r.getHeight()/2); //top
        double d = r.getCenterY()-(r.getHeight()/2); //bottom

        //trovare i vertici del secondo rettangolo
        double e = r2.getCenterX()-(r2.getBase()/2); //left
        double f = r2.getCenterX()+(r2.getBase()/2); //right
        double g = r2.getCenterY()+(r2.getHeight()/2); //top
        double h = r2.getCenterY()-(r2.getHeight()/2); //bottom

        //Calcolare le intersezioni tra vertici
        double intersectionLeft = Math.max(a, e);
        double intersectionRight = Math.min(b, f);
        double intersectionTop = Math.min(c, g);
        double intersectionBottom = Math.max(d, h);

        //calcolare le intersezioni tra la lunghezza e altezza
        double intersectionWidth = intersectionRight - intersectionLeft;
        double intersectionHeight = intersectionTop - intersectionBottom;

        //controllo se è esiste l'intersezione
        if(intersectionWidth>0 && intersectionHeight>0)
        {
            double intersectionCenterX = (intersectionLeft + intersectionRight) / 2;
            double intersectionCenterY = (intersectionTop + intersectionBottom) / 2;
            Cpoint center = new Cpoint(intersectionCenterX, intersectionCenterY);
            Rectangle r3 = new Rectangle(center,intersectionWidth,intersectionHeight);
            return r3;
            // return new Rectangle(center,intersectionWidth,intersectionHeight);
        }
        else
        {
            Rectangle r3 = new Rectangle(0,0);
            return r3;
        }
    }

}
