/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio7;

/**
 *
 * @author otorradomiguez
 */
public class Psp_ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon b=new Buzon();
        Hilo leer1=new Hilo("l1",b);
        Hilo escribir1=new Hilo("e1",b,false);
        Hilo leer2=new Hilo("l2",b);
        Hilo escribir2=new Hilo("e2",b,false);
        Hilo leer3=new Hilo("l3",b);
        Hilo escribir3=new Hilo("e3",b,false);
        
        Hilo leer4=new Hilo("l4",b);
        Hilo escribir4=new Hilo("e4",b,false);
        Hilo leer5=new Hilo("l5",b);
        Hilo escribir5=new Hilo("e5",b,false);
        Hilo leer6=new Hilo("l6",b);
        Hilo escribir6=new Hilo("e6",b,false);
        
        Hilo leer7=new Hilo("l7",b);
        Hilo escribir7=new Hilo("e7",b,false);
        Hilo leer8=new Hilo("l8",b);
        Hilo escribir8=new Hilo("e8",b,false);
        Hilo leer9=new Hilo("l9",b);
        Hilo escribir9=new Hilo("e9",b,false);
        
        escribir1.start();
        leer1.start();
        leer2.start();
        leer3.start();
        escribir2.start();
        escribir3.start();
        
        escribir4.start();
        leer4.start();
        escribir5.start();
        leer5.start();
        escribir6.start();
        leer6.start();
        escribir7.start();
        leer7.start();
        escribir8.start();
        leer8.start();
        escribir9.start();
        leer9.start();
    }
    
}
