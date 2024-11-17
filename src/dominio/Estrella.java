package dominio;
public class Estrella extends FiguraGeometrica {
    private int numPuntas;
    private double centroX;
    private double centroY;
    private double longitudLado;

    public Estrella(int numPuntas, double centroX, double centroY, double longitudLado) {
        if (numPuntas % 2 == 0) {
            throw new IllegalArgumentException("El número de puntas debe ser impar.");
        }
        this.numPuntas = numPuntas;
        this.centroX = centroX;
        this.centroY = centroY;
        this.longitudLado = longitudLado;
    }

    public int getNumPuntas() {
        return numPuntas;
    }

    public double getCentroX() {
        return centroX;
    }

    public double getCentroY() {
        return centroY;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    @Override
    public double perimetro() {
        return numPuntas * longitudLado; // Perímetro simplificado
    }

    @Override
    public double area() {
        // Implementación simplificada del área
        return (numPuntas * longitudLado * longitudLado) / 2; // Cálculo básico
    }
}