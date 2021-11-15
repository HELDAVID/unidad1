package actividad_2_hub;

public class Avion {
    /*
    Metodos reservados para la automatizacion de las bases
     */
private String modelo;
private int Combustible=100;
private int Kilometraje;
private int CantidadVuelos;
private int CantidadMantenciones;
private boolean matencion=true;
private Mecanico mecanico;
 
public void recibirMantencion(int realizacion){
    if(realizacion==1){
        this.setMatencion(true);
        System.out.println("El mecanico"+this.getMecanico().getNombre()+"pudo mantener la mantencion");
        this.setCantidadMantenciones(this.getCantidadMantenciones() + 1);
        }else{
        System.out.println("el mecamico"+this.getMecanico().getNombre()+"no pudo relizar la mantencion");
    }
    this.setCombustible(this.getCombustible() + 20);
  System.out.println("se cargaron 20 de combustible");
  if(   this.getCombustible()>100);{
    this.setCombustible(100);
}
}
private void verificarMantencion(){
    int restoMantencion=0;
    restoMantencion=this.getCantidadVuelos()%5;
    if(restoMantencion==0&&this.getKilometraje()!=0){
        this.setMatencion(false);}
        else{
        this.setMatencion(true);
         }
    }
public void realizarVuelo(int tipoViaje){
    if(this.matencion==false){
        System.out.println("no se puede realizar el vulo, primero mantencion del avion"+this.getModelo());
    }else{
        if(this.Combustible<50){
            System.out.println("no se puede relizar el vuelo por falta de combustible");
            
        }else{
            if(tipoViaje==1){
                this.Kilometraje+=500;
                this.Combustible-=50;
                System.out.println("se hizo un viaje nacional");
                this.CantidadVuelos++;
                verificarMantencion();
            }else{
                this.Kilometraje+=800;
                this.Combustible-=80;
                this.CantidadVuelos++;
                System.out.println("se hizo un viaje internacional!");
                verificarMantencion();
                
            }
        }
    }
}
public void actualizarCombustible(int tipo){
  switch (tipo){
      case 1:
          this.Combustible+=100;
          break;
      case 2:
          this.Combustible+=50;
          break;
  }  
  if(this.Combustible>100){
      this.Combustible=100;
      }
    System.out.println("cargar de combustible relaizada por "+this.mecanico.getNombre()+"!");
    
}

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the Combustible
     */
    public int getCombustible() {
        return Combustible;
    }

    /**
     * @param Combustible the Combustible to set
     */
    public void setCombustible(int Combustible) {
        this.Combustible = Combustible;
    }

    /**
     * @return the Kilometraje
     */
    public int getKilometraje() {
        return Kilometraje;
    }

    /**
     * @param Kilometraje the Kilometraje to set
     */
    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    /**
     * @return the CantidadVuelos
     */
    public int getCantidadVuelos() {
        return CantidadVuelos;
    }

    /**
     * @param CantidadVuelos the CantidadVuelos to set
     */
    public void setCantidadVuelos(int CantidadVuelos) {
        this.CantidadVuelos = CantidadVuelos;
    }

    /**
     * @return the CantidadMantenciones
     */
    public int getCantidadMantenciones() {
        return CantidadMantenciones;
    }

    /**
     * @param CantidadMantenciones the CantidadMantenciones to set
     */
    public void setCantidadMantenciones(int CantidadMantenciones) {
        this.CantidadMantenciones = CantidadMantenciones;
    }

    /**
     * @return the matencion
     */
    public boolean isMatencion() {
        return matencion;
    }

    /**
     * @param matencion the matencion to set
     */
    public void setMatencion(boolean matencion) {
        this.matencion = matencion;
    }

    /**
     * @return the mecanico
     */
    public Mecanico getMecanico() {
        return mecanico;
    }

    /**
     * @param mecanico the mecanico to set
     */
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}
