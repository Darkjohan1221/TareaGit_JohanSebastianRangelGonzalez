/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareagit_johansebastianrangelgonzalez;

import java.util.Locale;

/**
 *
 * @author Johan Sebastian Rangel González
 */
public class Tabla {

    protected int num;

    public Tabla(int num) {
        this.num = num;
    }

    public String tablaDeMultiplicar() {
        StringBuilder tabla = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            int resultado = this.num * i;
            tabla.append(this.num + "*" + i + "=" + resultado + "\n");
        }
        return tabla.toString();
    }

    public int multiplicar(int num) {
        return this.num * num;
    }
    
    
}
