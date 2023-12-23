/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.geometric_object_area_and_perimeter_calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Geometric_Object_Area_and_Perimeter_Calculator {

    public static void main(String[] args) {
        project p = new project();
    }
}

class project extends JFrame {

    double number, number2;
    String check, check2="Circle";
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    Square s = new Square();
    JPanel p1, p2, p3,p4;
    JLabel width, length, height, raduis,v1,v2;
    JButton Calc, Area, Perimeter,Submit;
    JTextField Width, Height, Length, Raduis,ans,ans2;
    String name[] = {"Circle", "Rectangle", "Square"};
    JComboBox<String> comboBox = new JComboBox<>(name);
     

    public project() {
        setTitle("Geometric_Object_Area_and_Perimeter_Calculator");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calc = new JButton("Calculate and Display");
        comboBox.addActionListener(new x1());
        Calc.addActionListener(new x3());
        Area = new JButton("Area");
        Area.addActionListener(new x2());
        Perimeter = new JButton("Perimeter");
        Perimeter.addActionListener(new x4());
        Submit = new JButton("Submit");
        Submit.addActionListener(new x5());
        p1 = new JPanel(new GridLayout(2, 1));
        p1.add(Calc);
        width = new JLabel("Width of Rectangle");
        Width = new JTextField(1);
        height = new JLabel("Height of Rectangle");
        Height = new JTextField(1);
        length = new JLabel("Length of Square");
        Length = new JTextField(1);
        raduis = new JLabel("Raduis of Circle");
        Raduis = new JTextField(1);
        ans = new JTextField(10);
        ans2 = new JTextField(10);

        p2 = new JPanel();
        p2.add(width);
        p2.add(Width);
        p2.add(height);
        p2.add(Height);
        p2.add(length);
        p2.add(Length);
        p2.add(raduis);
        p2.add(Raduis);
        p2.setLayout(new GridLayout(5, 2));
        p3 = new JPanel();
        v1 = new JLabel("The Area is :");
        v2 = new JLabel("The Perimeter is :");
        p3.add(comboBox);
        p3.add(Area);
        p3.add(Perimeter);
        p4 = new JPanel();
        p4.add(v1);
        p4.add(ans2);
        p4.add(v2);
        p4.add(ans);
        p2.add(Submit);
        p4.setLayout(new GridLayout(1, 2));
        setLayout(new BorderLayout());       
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.EAST);
        add(p4, BorderLayout.SOUTH);
        setResizable(false);
        setVisible(true);
    }



    class x1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            check2 = (String) comboBox.getSelectedItem();
        }

    }




class x5 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
             if (check2.equals("Circle")) {
                try {
                    number = Double.parseDouble(Raduis.getText());
                    c.setRaduis(number);
                } catch (java.lang.NumberFormatException k) {
                    JOptionPane.showMessageDialog(null, "Please input the required field for Circle ");
                }
            } else if (check2.equals("Rectangle")) {
                try {
                    number = Double.parseDouble(Height.getText());
                    number2 = Double.parseDouble(Width.getText());
                    r.setHeight(number);
                    r.setWidth(number2);
                } catch (java.lang.NumberFormatException k) {
                    JOptionPane.showMessageDialog(null, "Please input the required fields field for Rectangle ");
                }
            } else if (check2.equals("Square")) {
                try {
                    number = Double.parseDouble(Length.getText());
                    s.setWidth(number);
                } catch (java.lang.NumberFormatException k) {
                    JOptionPane.showMessageDialog(null, "Please input the required  field for Square ");
                }
            }
        }
    
}


    class x2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            check = "Area";
        }

    }

    class x4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            check = "Perimeter";
        }

    }
    class x3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (check.equals("Perimeter")) {
                if (check2.equals("Circle")) {
                    JOptionPane.showMessageDialog(null, "The Perimeter of Circle is : " + c.getPerimeter());
                    ans.setText(String.valueOf(c.getPerimeter()));
                } else if (check2.equals("Rectangle")) {
                    JOptionPane.showMessageDialog(null, "The Perimeter of Rectangle is : " + r.getPerimeter());
                    ans.setText(String.valueOf(r.getPerimeter()));

                } else {
                    JOptionPane.showMessageDialog(null, "The Perimeter of Square is : " + s.getPerimeter());
                    ans.setText(String.valueOf(s.getPerimeter()));
                }
            } else {
                if (check2.equals("Circle")) {
                    JOptionPane.showMessageDialog(null, "The Area of Circle is : " + c.getArea());
                    ans2.setText(String.valueOf(c.getArea()));

                } else if (check2.equals("Rectangle")) {
                    JOptionPane.showMessageDialog(null, "The Area of Rectangle is : " + r.getArea());
                    ans2.setText(String.valueOf(r.getArea()));

                } else {
                    JOptionPane.showMessageDialog(null, "The Area of Square is : " + s.getArea());
                   ans2.setText(String.valueOf(s.getArea()));
                }
            }

        }

    }
}