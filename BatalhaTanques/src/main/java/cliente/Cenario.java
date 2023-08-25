/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author gabriel.omsantos
 */

import tanque.*;
public class Cenario {
    
    public static void main(String[] args) {
    Tanque t1=new Tanque(CoresRGB.RED, CoresRGB.BLUE, 2, 4);
    t1.movLeste();
    t1.movLeste();
    t1.movLeste();
    t1.atirar(2);
        System.out.println("X="+t1.retPosicaoX()+" Y="+t1.retPosicaoY()); 
    
    }
}
