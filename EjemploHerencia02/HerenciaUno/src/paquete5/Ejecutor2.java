/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author PC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
        String nombre = "Jhandry";
        String apellido = "Solorzano";
        String id = "1105901902";
        int edad = 20;
        int numCreditos = 5;
        double costoCreditos = 30.00;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
        apellido, id, edad, numCreditos, costoCreditos);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}