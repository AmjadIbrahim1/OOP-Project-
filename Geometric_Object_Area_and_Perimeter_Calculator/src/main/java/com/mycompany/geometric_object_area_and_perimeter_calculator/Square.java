/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometric_object_area_and_perimeter_calculator;


public class Square extends Rectangle {

    public Square() {
    }

    public Square(double width, double height) {
        super(width, height);
    }

    public Square(double width, double height, String color, boolean filled) {
        super(width, height, color, filled);
    }
    

    public double getArea()
    {
        return width*width;
    }
    public double getPerimeter()
    {
        return (width)*4;
    }
    
}
