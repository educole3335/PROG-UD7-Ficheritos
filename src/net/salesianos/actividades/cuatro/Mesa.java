package net.salesianos.actividades.cuatro;

public class Mesa {
    private String color;
    private int numPatas;

    public Mesa(String color, int numPatas) {
        this.color = color;
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return String.format("Mesa de color %s con %d patas", color, numPatas);
    }
}
