/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Juanes
 * @author Yaider
 */
public class MetodosDeOrdenamiento {
    public void ordenamientoShell(int[] vector) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {  
                cambios = false;
                for (i = salto; i < vector.length; i++) 
                {
                    if (vector[i - salto] > vector[i]) {
                        aux = vector[i];                
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true;              
                    }
                }
            }
        }
    }
}
