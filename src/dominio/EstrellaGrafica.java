package dominio;

import java.awt.Color;
import java.awt.Graphics;

public class EstrellaGrafica extends Estrella implements Dibujable {
    private Color color;

    public EstrellaGrafica(int numPuntas, double centroX, double centroY, double longitudLado, Color color) {
        super(numPuntas, centroX, centroY, longitudLado);
        this.color = color;
    }

    @Override
    public void dibujar(Graphics dw) {
             dw.setColor(color);
            int[] xPoints = new int[getNumPuntas() * 2];
            int[] yPoints = new int[getNumPuntas() * 2];

            // Calcular los puntos de la estrella
        for (int i = 0; i < getNumPuntas(); i++) {
            double outerAngle = i * (2 * Math.PI / getNumPuntas());
            double innerAngle = outerAngle + (Math.PI / getNumPuntas());

            // Puntos exteriores
            xPoints[i * 2] = (int) (getCentroX() + getLongitudLado() * Math.cos(outerAngle));
            yPoints[i * 2] = (int) (getCentroY() - getLongitudLado() * Math.sin(outerAngle));

            // Puntos interiores
            xPoints[i * 2 + 1] = (int) (getCentroX() + (getLongitudLado() / 2) * Math.cos(innerAngle));
            yPoints[i * 2 + 1] = (int) (getCentroY() - (getLongitudLado() / 2) * Math.sin(innerAngle));
        }

        dw.drawPolygon(xPoints, yPoints, getNumPuntas()*2);
    }

    @Override
    public void setPosicion(double x, double y) {
        // Implementar lógica para establecer la posición si es necesario
    }
}
