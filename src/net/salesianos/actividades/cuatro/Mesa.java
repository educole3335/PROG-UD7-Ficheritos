package net.salesianos.actividades.cuatro;
import java.io.Serializable;

public class Mesa implements Serializable {
    private String color;
    private int numeroPatas;

    public Mesa(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    @Override
    public String toString() {
        return "Mesa [Color: " + color + ", Número de patas: " + numeroPatas + "]";
    }
}

