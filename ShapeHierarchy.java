/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author NeelS
 */
public class ShapeHierarchy {
    public static void main(String[] args) {
        
    Shape[] test = {new Cube(5), new Tetrahedron(3), new Circle(2)};
    for(Shape i: test){
            System.out.println(i.getClass()+"\n Area:"+i.getArea());
            if(i instanceof ThreeDimensionalShape)
                System.out.println("Volume: "+((ThreeDimensionalShape)i).getVolume());
}
}
}
abstract class Shape{
    public abstract double getArea();
}

abstract class TwoDimensionalShape extends Shape{
    
}
class Circle extends TwoDimensionalShape{
    double radius;
    public Circle(double r){
        radius=r;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class Square extends TwoDimensionalShape{
    double length;
    public Square(double x){
        length=x;
    }
    public double getArea(){
        return length*length;
    }
}
class Triangle extends TwoDimensionalShape{
    double s1; double s2; double s3;
    public Triangle(double x, double y, double z){
        s1=x; s2=y; s3=z;
    }
    public double getArea(){
        double semip = .5*(s1+s2+s3);
        return Math.sqrt(semip*(semip-s1)*(semip-s2)*(semip-s3));
    }
}
abstract class ThreeDimensionalShape extends Shape{
    public abstract double getVolume();
}
class Cube extends ThreeDimensionalShape{
    double length;
    public Cube(double x){
        length=x;
    }
    public double getArea(){
        return length*length*6;
    }
    public double getVolume(){
        return length*length*length;
    }
}
class Sphere extends ThreeDimensionalShape{
    double radius;
    public Sphere(double r){
        radius=r;
    }
    public double getArea(){
        return 4*3.14*radius*radius;
    }
    public double getVolume(){
        return 3.14*4/3*radius*radius*radius;
    }
}
class Tetrahedron extends ThreeDimensionalShape{
    double s;
    public Tetrahedron(double x){
        s = x;
    }
    public double getArea(){
        return s*s*Math.sqrt(3)/4*4;
    }
    public double getVolume(){
        return Math.sqrt(2)/12*s*s*s;
    }
}
