/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */package characterstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * * * @author Student
 */
public class LAB1 {

    public static void main(String[] args) {
        String s = "Hello World!";
        try {
            FileWriter output = new FileWriter("data.dat");
            output.write("Hello World!");
            output.write("Welcome to java");
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
