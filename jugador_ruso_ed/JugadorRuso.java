package com.poniente.project.es.jugador_ruso_ed;


public class JugadorRuso {
    private int id;
    private String nombre;
    private boolean vivo;
    
    /**
     * El constructor del clase JugadorRuso con un parametro ID jugador.
     */
    public JugadorRuso(int id){
        this.id = id;
        vivo = true;
    }
    
    /**
     * El constructor del clase JugadorRuso con un parametro Nombre jugador.
     */
    public JugadorRuso(String nombre){
        this.nombre = nombre;
        vivo = true;
    }
    
    /**
     * El constructor del clase JugadorRuso con dos parametros nombre, id 
     * y su estado.
     */
    public JugadorRuso(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        vivo = true;
    }
    
    /**
     * Metodo que devuelve el estado del jugador si es vivo o no.
     */
    public boolean seDispara(Revolver r){
        System.out.println("El jugador ruso con id="+id+"/nombre="+nombre+" se apunta con el revolver");
        /**
         * Una condicion para controlar el estado del jugador.
         * de ne pas mourir et qu'il est vivant.
         */
        if(r.disparar()){
            System.out.println("<Bala disparada>");
            vivo = false;
        } else {
            System.out.println("Esta ronda he tenido suerte");
        }
        return vivo;
    }
    
    public boolean isVivo(){
        return vivo;
    }
}
