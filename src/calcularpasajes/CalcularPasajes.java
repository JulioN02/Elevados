package calcularpasajes;

import java.util.Scanner;

public class CalcularPasajes {

    public static void main(String[] args) {
        double tarifa, tarifaBasica, tarifaFinal;
        String Nombre, Alta = "ALTA", Baja = "BAJA", Compañia, Temporada, Volar = "VOLAR", ALAS = "ALAS";
        int edad;
        Boolean Estudiante;
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("----------------------------COMPANIA DE TURISMO ELEVADOS--------------------------");
        System.out.println("Ingrese los siguientes datos para generar su Factura del Pasaje.");
        
        //Entrada Nombre
        System.out.println("Ingrese su nombre");
        Nombre = sc2.nextLine();
        System.out.println("\r");

        //Entrada Tarifa
        System.out.println("Ingrese la tarifa Basica");
        Scanner sc = new Scanner(System.in);
        tarifa = sc.nextDouble();
        tarifaBasica = tarifa;
        System.out.println("\r");

        //Entrada Temporada
        System.out.println("Ingrese la temporada. ALTA / BAJA");
        Temporada = sc2.nextLine();
        System.out.println("\r");

        //Entrada Compañia
        System.out.println("Ingrese la compañia para de su preferencia. VOLAR / ALAS");
        Compañia = sc2.nextLine();

        //Si eligio la temporada ALTA
        if (Temporada.equals(Alta)) {
            //Si eligio la compañia ALAS
            if (Compañia.equals(ALAS)) {
                double tarifaParcial1 = tarifaBasica * 0.20;
                double tarifaTotalParcial1 = tarifaBasica - tarifaParcial1;
                tarifaBasica = tarifaTotalParcial1;
                System.out.println("Aplica 20% de descuento en la tarifa");
            }
            //Si eligio la compañia VOLAR
            if (Compañia.equals(Volar)) {
                double tarifaParcial2 = tarifaBasica * 0.30;
                double tarifaTotalParcial2 = tarifaBasica - tarifaParcial2;
                tarifaBasica = tarifaTotalParcial2;
                System.out.println("Aplica 30% de descuento en la tarifa");
            }
            System.out.println("Su tarifa basica con descuento de la compania " + Compañia + " en temporada " + Temporada + " es de " + tarifaBasica);
        }
        System.out.println("\r");

        //Entrada Edad
        System.out.println("Ingrese su edad");
        Scanner sc3 = new Scanner(System.in);
        edad = sc3.nextInt();
        //Si es menor de edad
        if (edad < 18) {
            double tarifaParcial3 = tarifaBasica * 0.50;
            double tarifaTotalParcial3 = tarifaBasica - tarifaParcial3;
            tarifaBasica = tarifaParcial3;
            System.out.println("Descuento del 50% aplicado por ser menor de edad, su tarifa basica es de: " + tarifaBasica);
        }
        System.out.println("\r");

        //Entrada Estudiante
        System.out.println("¿Es estudiante? Escriba true o false");
        Scanner sc4 = new Scanner(System.in);
        Estudiante = sc4.nextBoolean();
        //Si es estudiante
        if (Estudiante == true) {
            //Si es mayor o igual a 18 años
            if (edad >= 18) {
                //Si eligio la compañia ALAS
                if (Compañia.equals(ALAS)) {
                    //Si eligio la temporada BAJA 
                    if (Temporada.equals(Baja)) {
                        double tarifaParcial4 = tarifaBasica * 0.10;
                        double tarifaTotalParcial4 = tarifaBasica - tarifaParcial4;
                        tarifaBasica = tarifaTotalParcial4;
                        System.out.println("Aplica descuento del 10% en la tarifa");
                    }
                }
            }
        }
        System.out.println("\r");
        tarifaFinal = tarifaBasica;
        //Formato de salida de las entradas en forma de Factura siguiendo el tema de la actividad Empresa de Turismo.
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("--------------------FACTURA-------------------");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Tarifa basica: " + tarifa);
        System.out.println("Temporada: " + Temporada);
        System.out.println("Compañia: " + Compañia);
        System.out.println("Edad: " + edad);
        System.out.println("Estudiante: " + Estudiante);
        System.out.println("Tarifa total con descuentos: " + tarifaFinal);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");    
    }
}
