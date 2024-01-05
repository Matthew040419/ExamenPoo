/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.publishing_inc;

/**
 *
 * @author deyvi
 */
import java.util.List;

public class Publishing_Inc {
    
    public static void main(String[] args) {
        // Crear un programador
        Programador programador = new Programador("Alvaro", "Programador", "0451488742", 27, "Alvarot2@hotmail.com", "09888187455", List.of("HTML","Java", "Python"));
        programador.mostrarInformacion();
        System.out.println("---------");

        Ilustrador_Grafico ilustrador = new Ilustrador_Grafico("Sebastian", "Ilustrador Grafico", "1750081648", 45, "Sebasdel96@hotmail.com", "09876543470", List.of("Photoshop","Canva"));
        ilustrador.mostrarInformacion();
        System.out.println("---------");

        Gerente gerente = new Gerente("Santiago", "Gerente", "0504562179", 34, "Santiago12@hotmail.com", "0953784569", List.of(programador, ilustrador));
        gerente.mostrarInformacion();
        System.out.println("---------");

        Editor editor = new Editor("Matias", "Editor", "0145745444", 28, "Matias8969@hotmail.com", "0984918455", "Electronico");
        editor.mostrarInformacion();
        System.out.println("---------");
   }
}