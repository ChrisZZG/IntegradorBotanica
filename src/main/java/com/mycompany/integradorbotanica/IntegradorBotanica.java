/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.integradorbotanica;

/**
 *
 * @author EQUIPO
 */
public class IntegradorBotanica {

    public static void main(String[] args) {
        
        Arbol arbolito = new Arbol();
        Flor florcita = new Flor();
        Arbusto arbustito = new Arbusto();
        
        System.out.println("METODOS DE CADA CLASE HIJA");
        System.out.println("Arbol: ");
        arbolito.decirHola();
        System.out.println("-----------------");
        System.out.println("Flor: ");
        florcita.decirHola();
        System.out.println("-------------------");
        System.out.println("Arbusto: ");
        arbustito.decirHola();
        System.out.println("--------------------");
        
        
    }
}
