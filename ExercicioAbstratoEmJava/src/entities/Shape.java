package entities;

import entities.enums.Color;
// CLASS E METODO ABSTRATO NAO PODEM SER INSTANCIADOS.
public abstract class Shape {               // POR EXISTIR UM METODO ABSTRATO A CLASS TAMBEM SE TORNA
    private Color color;
    public Shape() {

    }
    public Shape(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();          // DECLARAÇÃO METODO ABSTRATO
}
