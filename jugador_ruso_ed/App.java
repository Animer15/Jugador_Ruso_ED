
package com.poniente.project.es.jugador_ruso_ed;

public class App {

    public static void main(String[] args) {

        Revolver r1 = new Revolver();
        r1.mirarPosiciones();
        r1.disparar();        
        
        Revolver r2 = new Revolver();
        r2.mirarPosiciones();
        r2.disparar();
        
        JugadorRuso jug1 = new JugadorRuso(1050);
        jug1.seDispara(r1);
        
        JugadorRuso jug2 = new JugadorRuso(2050);
        jug2.seDispara(r2);
        
        JugadorRuso jug3 = new JugadorRuso("amine");
        jug3.seDispara(r1);
        
        JugadorRuso jug4 = new JugadorRuso("angela");
        jug4.seDispara(r2);     
        
        r1.girarCilindro();
        r2.girarCilindro(10);
        
        
        JugadorRuso jug5 = new JugadorRuso("sara",1000);
        jug5.seDispara(r1);
       
        JugadorRuso jug6 = new JugadorRuso("jesus",2000);
        jug6.seDispara(r2);
        
        System.out.println(""+jug1.isVivo()
                             +jug2.isVivo()
                              +jug3.isVivo()
                             +jug4.isVivo()
                              +jug5.isVivo()
                              +jug6.isVivo());
 
    }
    
}
