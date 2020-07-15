/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaidercordoba_juanlopez;

import metodos.MetodosDeOrdenamiento;

/**
 *
 * @author Juanes
 * @author Yaider
 */
public class YaiderCordoba_juanLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosDeOrdenamiento orden = new MetodosDeOrdenamiento();
        int [] vector = {50,3,5,10,9,11,1,25,19};
        orden.ordenamientoShell(vector);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
    }
    
}
