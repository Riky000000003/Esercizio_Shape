package org.example;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {

    public void testRectangleIntersectionTrue()
    {
        //in questo test controllo se mi esce il rettangolo di intersezione o no
        //se non funziona il risultato dell'output tutto 0.0, altrimenti si vedranno risultati
        //un esempio per farlo funzionare center(6,4) center2(9,4.5)
        //un'altro esempio rettangolo1 base:6 , height: 4 Cx: 4, Cy: 6
        //altro esempio rettangolo2 base: 8, height: 5, Cx: 9, Cy: 3.5

        //inizializzo i miei centri
        Cpoint center = new Cpoint(-5.5,-3.5);
        Cpoint center2 = new Cpoint(-8,-6);

        //creo i miei 2 rettangoli
        Rectangle r = new Rectangle(center,7,3);
        Rectangle r2 = new Rectangle(center2,6,4);

        //Creazione del rettangolo di intersezione
        Rectangle r3 = r.rectangleIntersection(r,r2);

        //stampa
        System.out.println("Le sue coordinate: (" + r3.getCenterX() + "," + r3.getCenterY()+ ")");
        System.out.println("La sua base: "+r3.getBase() + " La sua altezza:" + r3.getHeight());
        System.out.println("La sua Area: " +r3.area() + " il suo perimetro: " + r3.perimeter());
    }
}