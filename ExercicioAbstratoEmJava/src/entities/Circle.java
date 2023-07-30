package entities;

import entities.enums.Color;

// CLASSE SUBCLASSE QUE EXTENDE A CLASSE ABSTRATA SHAPE
public class Circle extends Shape{
    private Double radius;   // RAIO DO CIRCULO
    public Circle() {
        super();
    }
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {                  // METODO SUBSCRITO MEDINDO VALOR DO CIRCULO
        return Math.PI * radius * radius;    // AREA DE UM CIRCULO É PI * RADIUS AO QUADRADO
    }
}
