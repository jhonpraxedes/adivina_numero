/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego;
import java.util.Scanner;
/**
 *
 * @author jhonpraxedes
 */
public class Juego {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("ADIVINA EL NUMERO QUE ESTOY PENSANDO TIENES 2 OPORTUNIDADES");
        int numero;
        
        do{
            System.out.println("introduce un numero entre 1 y 100 = ");
            numero= s.nextInt();
            
            if ((numero<1)||(numero>100)){
                System.out.println("EL NUMERO INTRODUCIDO DEBE ESTAR EN EL RANGO DE 1 A 100");
                System.out.println("INTENTA DE NUEVO");
                numero=s.nextInt();
            }
        }while((numero<1)||(numero>100));
        
        if(numero==23){
            System.out.println("CORRECTO FELICIDADES GANASTE UNA PINGA");
        }else{
            System.out.println("PERDEDOR SUERTE PARA LA PROXIMA");
        }
    }
}
