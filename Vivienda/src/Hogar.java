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
        Vivienda casa = new Vivienda(120000, 4, 100, true, "buen estado", "Adrian Gimenez");
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        
        casa.imprimirVivienda(casa);
        
    }
    
}
