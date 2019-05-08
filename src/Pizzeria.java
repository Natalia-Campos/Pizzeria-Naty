/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**Atributos en pizzeria y constructor de pizzeria
 * 
 * @author Giselle
 */
public class Pizzeria {
  private String NombrePizzeria;
  private String Direccion;
  private int TelefonoPizzeria;
  private int CuitPizzeria; 
  private String Localidad; 

    public String getNombrePizzeria() {
        return NombrePizzeria;
    }

    public void setNombrePizzeria(String NombrePizzeria) {
        this.NombrePizzeria = NombrePizzeria;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefonoPizzeria() {
        return TelefonoPizzeria;
    }

    public void setTelefonoPizzeria(int TelefonoPizzeria) {
        this.TelefonoPizzeria = TelefonoPizzeria;
    }

    public int getCuitPizzeria() {
        return CuitPizzeria;
    }

    public void setCuitPizzeria(int CuitPizzeria) {
        this.CuitPizzeria = CuitPizzeria;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public Pizzeria(String NombrePizzeria, String Direccion, int TelefonoPizzeria, int CuitPizzeria, String Localidad) {
        this.NombrePizzeria = NombrePizzeria;
        this.Direccion = Direccion;
        this.TelefonoPizzeria = TelefonoPizzeria;
        this.CuitPizzeria = CuitPizzeria;
        this.Localidad = Localidad;
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
