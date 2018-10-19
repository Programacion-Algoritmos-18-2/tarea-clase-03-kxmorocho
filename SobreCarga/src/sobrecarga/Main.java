/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        
        }
        
        Scanner scanner1 = new Scanner(System.in);
        Trabajador t1 = new Trabajador();
        
        System.out.println("Sueldo mensual 1 o por semanas 2");
        int numero_sueldo = scanner1.nextInt();
        scanner1.nextInt();
        
        if(numero_sueldo==1){
             System.out.println("Ingrese el sueldo mensual");
             double sueldo = scanner.nextDouble();
            t1.agregar_sueldo(sueldo);
        }else{
            System.out.println("Ingrese sueldo semana 1:");
            double sueldo1 = scanner.nextDouble();
            System.out.println("Ingrese sueldo semana 2");
            double sueldo2 = scanner.nextDouble();
            System.out.println("Ingrese sueldo semana 3");
            double sueldo3 = scanner.nextDouble();
            System.out.println("Ingrese sueldo semana 4");
            double sueldo4 = scanner.nextDouble();
            t1.agregar_sueldo(sueldo1, sueldo2, sueldo3, sueldo4);
        }
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        
        
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());
        
                

    }
    
}
