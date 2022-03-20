/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Vivienda 
{
    //atributos
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    //constructores
    public Vivienda (double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario)
    {
        this.precio = precio;
        this.numHabitaciones=numHabitaciones;
        this.superficie=superficie;
        this.parking=parking;
        this.estado=estado;
        this.propietario=propietario;
    }
    
    //getters
    public double getPrecio(){
        return precio;
    }
    public int getnumHabitaciones(){
        return numHabitaciones;
    }
    public double getSuperficie(){
        return superficie;
    }
    public boolean getParking(){
        return parking;
    }
    public String getEstado(){
        return estado;
    }
    public String getPropietario(){
        return propietario;
    }
    //setters
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setNumHabitaciones(int habitaciones){
        this.numHabitaciones=habitaciones;
    }
    public void setSuperficie(double superficie){
        this.superficie=superficie;
    }
    public void setParking(boolean parking){
        this.parking=parking;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void setPropietario(String propietario){
        this.propietario=propietario;
    }
    
    
    //metodos
    public void actualizarPrecio()
    {
        precio = precio - precio * 0.05;
    }   
    public void imprimirVivienda(Vivienda a){
        
        System.out.println("Precio: " + this.precio);
        System.out.println("Número de habitaciones: "+ this.numHabitaciones);
        System.out.println("Superficie en m2: " + this.superficie);
        System.out.println("¿Dispone de parking?: " + this.parking);
        System.out.println("Estado: "+ this.estado);
        System.out.println("Propietario: "+ this.propietario);
    } 
}