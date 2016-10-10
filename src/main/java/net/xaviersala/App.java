package net.xaviersala;

import acm.graphics.GLabel;
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
   private static final int AMPLADAPANTALLA = 1024;
   private static final int ALTURAPANTALLA = 768;

    /**
     * Programa principal...
     */
    @Override
    public final void run() {
       setSize(AMPLADAPANTALLA, ALTURAPANTALLA);

       clicaPerComencar();
    }





/**
 * Clica per començar.
 */
private void clicaPerComencar() {
    GLabel label = new GLabel("Clica per començar");
    double x = (getWidth() - label.getWidth()) / 2;
    double y = (getHeight() + label.getAscent()) / 2;
    add(label, x, y);
    waitForClick();
    remove(label);
}

}
