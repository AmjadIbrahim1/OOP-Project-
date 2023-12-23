/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometric_object_area_and_perimeter_calculator;

import javax.swing.JOptionPane;

public class Rectangle implements Interface {

    protected double width;
    private double height;
    protected String color;
    protected boolean filled;

    Rectangle() {
    }

    public Rectangle(double width, double height) {
        try {
            this.width = width;
            if (this.width <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
            }
            JOptionPane.showMessageDialog(null, "You entered: " + this.width);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            this.height = height;
            if (this.height <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
            }
            JOptionPane.showMessageDialog(null, "You entered: " + this.height);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        try {
            this.width = width;
            if (this.width <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
            }
            JOptionPane.showMessageDialog(null, "You entered: " + this.width);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            this.height = height;
            if (this.height <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
            }
            JOptionPane.showMessageDialog(null, "You entered: " + this.height);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        this.filled = filled;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        try {
            this.width = width;
            if (this.width <= 0) {   
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
            this.width=0;
            }
            else
            JOptionPane.showMessageDialog(null, "You entered: " + this.width);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        try {
            this.height = height;
            if (this.height <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid number. Please enter a number greater than 0.");
            this.height=0;
            }
            else
            JOptionPane.showMessageDialog(null, "You entered: " + this.height);
        } catch (java.util.InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
  
        this.filled = filled;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getRaduis() {
        System.out.println("Doesn't have a raduis to calc");
        return 0;
    }

    @Override
    public void setRaduis(double raduis) {
        System.out.println("No raduis for this");
    }
}
