package actividad_2_hub;

import java.util.Random;

class Mecanico {
    private String nombre;
    private int nivel;
    public int relizarMantencion(){
        int probabilidad=0;
        Random rnd=new Random();
        probabilidad=rnd.nextInt(2);
        return probabilidad;
    }
    public int cargadorCombustible(){
        return this.getNivel();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
