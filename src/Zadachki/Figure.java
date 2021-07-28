package Zadachki;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

abstract class Figure {
    private double volume;

    public Figure(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }
}
class SolidOfRevolution extends Figure{
    private double radius;

    public SolidOfRevolution(double volume, double radius){
        super(volume);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}

class Ball extends SolidOfRevolution{
    public Ball(double radius){
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}

class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius, double height){
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}

class Pyramid extends Figure{
    private double height;
    private double s;

    public Pyramid(double height, double s){
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}

class Box extends Figure {
    private ArrayList<Figure> figures = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(Figure figure) {
        if (available >= figure.getVolume()) {
            figures.add(figure);
            available -= figure.getVolume();
            return true;
        } else {
            return false;
        }
    }
}

