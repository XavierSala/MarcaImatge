package net.xaviersala;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GRect;

public class Cara {

    private static final int MARGE = 10;
    GImage cara;
    GRect rectangle;
    boolean rectangleVisible;

    public Cara(GImage imatge, GRect rectang) {

        cara = imatge;

        // Preparo el rectangle perquè aparegui i desaparegui
        rectangle = rectang;
        rectangle.setSize(imatge.getSize());
        rectangle.setLocation(imatge.getX()- MARGE/2, imatge.getY() - MARGE/2);
        rectangle.setSize(imatge.getHeight() + MARGE, imatge.getWidth() + MARGE);
        rectangle.setFilled(true);
        rectangle.setFillColor(Color.RED);
        rectangle.setVisible(false);

        // Afegir control de ratolí
        cara.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                rectangleVisible = !rectangleVisible;
                rectangle.setVisible(rectangleVisible);
            }

        });
    }
}
