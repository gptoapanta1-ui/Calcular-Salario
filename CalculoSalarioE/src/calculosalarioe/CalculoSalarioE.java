/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculosalarioe;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class CalculoSalarioE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //creamos una intefase con el metodo solid open close donde nnos permite agregar clases yno editar lo que a tenemos ahora elcodigo esta mas 
        //acecible por si mañena cambia el sueldo

        /*System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la cantidad de sueldos: ");
        int n = sc.nextInt();

        double[] sueldos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = sc.nextDouble();
        }

        Empleado emp = new Empleado(nombre, sueldos);

        double promedio = CalculoNomina.calcularPromedio(emp.sueldos);
        boolean aceptable = CalculoNomina.sueldoAceptable(promedio);

        System.out.print("¿Desea aplicar bono? (1=Sí / 0=No): ");
        int op = sc.nextInt();

        if (op == 1) {
            promedio = CalculoNomina.aplicarBono(promedio);
        }

        ReporteNomina.mostrar(emp, promedio, aceptable);

        sc.close();*/

        Empleado emp = new Empleado("Ana", new double[]{450, 520, 510});

        double promedio = CalculoNomina.calcularPromedio(emp.getSueldos());

        promedio = CalculoNomina.aplicarBono(promedio);

        ReglaSalario regla = new ReglaBase();
        boolean aceptable = regla.esAceptable(promedio);

        ReporteNomina.mostrar(emp, promedio, aceptable);
    }
}
    
