package sai;

import java.awt.event.ActionEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RunBmiGui2 implements ActionListener {
      // BmiGui3is its own runnable client program
      public static void main(String[] args) {
          RunBmiGui2 gui = new RunBmiGui2();
      }

      // onscreen components stored as fields
      private JFrame frame;
      private JTextField heightField;
     private JTextField weightField;
     private JLabel bmiLabel;
     private JButton computeButton;

     public RunBmiGui2() {
          // set up components
         heightField = new JTextField(50);
          weightField = new JTextField(50);
          bmiLabel = new JLabel("Type your height (in cm) and weight (in kg)");
          computeButton = new JButton("Compute");

          // attach GUI as event listener to Compute button
   computeButton.addActionListener(this);
          // layout
          JPanel north = new JPanel(new GridLayout(8, 8));
          north.add(new JLabel("Height (cm): "));
          north.add(heightField);
          north.add(new JLabel("Weight (kg): "));
          north.add(weightField);
         // overall frame
          frame = new JFrame("BMI");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLayout(new BorderLayout());
          frame.add(north, BorderLayout.NORTH);
          frame.add(bmiLabel, BorderLayout.CENTER);
         frame.add(computeButton, BorderLayout.SOUTH);
          frame.pack();
         frame.setVisible(true);
    }

  // Handles clicks on Compute button by computing the BMI.
     
public void actionPerformed(ActionEvent event) {
          // read height/weight info from text fields
          String heightText = heightField.getText();
          
double height = Double.parseDouble(heightText) / 100;
          String weightText = weightField.getText();
 
double weight = Double.parseDouble(weightText);

          // compute BMI and display it onscreen
          
double bmi = weight / (height * height) ;
         bmiLabel.setText("BMI: " + bmi);
      }
  }
