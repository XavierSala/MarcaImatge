package net.xaviersala;

import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * Plantilla base per fer un programa fent servir les llibreries
 * ACM.
 *
 */
public class App extends GraphicsProgram
{
    /**
    *
    */
   private static final long serialVersionUID = 1299094805237490891L;
   private static final int AMPLADAPANTALLA = 400;
   private static final int ALTURAPANTALLA = 400;

    /**
     * Programa principal...
     */
    @Override
    public final void run() {
       setSize(AMPLADAPANTALLA, ALTURAPANTALLA);
       GImage imatge = new GImage("13c1.jpg");

       GRect rectangle = new GRect(0,0);
       add(rectangle);
       add(imatge, (AMPLADAPANTALLA-imatge.getWidth())/2, (ALTURAPANTALLA-imatge.getHeight())/2);

       Cara cara = new Cara(imatge, rectangle);
    }




}
