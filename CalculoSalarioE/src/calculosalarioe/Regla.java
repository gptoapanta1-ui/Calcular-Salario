/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosalarioe;

/**
 *
 * @author Hp
 */
public class Regla implements ReglaSalario {

    @Override
    public boolean esAceptable(double promedio) {
     return promedio >= 600;
    }
    
}
