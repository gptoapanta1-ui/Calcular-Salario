/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosalarioe;

/**
 *
 * @author Hp
 */
public class Empleado {
     String nombre;
    double[] sueldos;

    public Empleado(String nombre, double[] sueldos) {
        this.nombre = nombre;
        this.sueldos = sueldos;
        
    }
// Generamoss get y set para extenciones 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getSueldos() {
        return sueldos;
    }

    public void setSueldos(double[] sueldos) {
        this.sueldos = sueldos;
    }
    
}
