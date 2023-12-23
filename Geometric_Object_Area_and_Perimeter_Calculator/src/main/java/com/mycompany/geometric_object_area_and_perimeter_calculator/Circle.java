/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometric_object_area_and_perimeter_calculator;

import javax.swing.JOptionPane;

public class Circle implements Interface {

    private double raduis;
    private final double PI = 3.14;

    Circle() {
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        try {
            this.raduis = raduis;
            if (this.raduis <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
                this.raduis=0;
            }
            else
            JOptionPane.showMessageDialog(null, "You entered: " + this.raduis);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Circle(double raduis) {
        try {
            this.raduis = raduis;
            if (this.raduis <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
            }
            JOptionPane.showMessageDialog(null, "You entered: " + this.raduis);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public double getArea() {
        return PI * raduis * raduis;
    }

    public double getPerimeter() {
        return 2 * PI * raduis;
    }

    @Override
    public double getWidth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setWidth(double width) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHeight(double height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isFilled() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setFilled(boolean filled) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
