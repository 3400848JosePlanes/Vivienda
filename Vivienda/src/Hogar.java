/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Hogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivienda casa = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        System.out.println("Precio : " + casa.precio);
        System.out.println("Número de habitaciones: "+ casa.numHabitaciones);
        System.out.println("Superficie en m2: " + casa.superficie);
        System.out.println("¿Dispone de parking?: " + casa.parking);
        System.out.println("Estado: "+ casa.estado);
        System.out.println("Propietario: "+ casa.propietario);
    }
    
}
