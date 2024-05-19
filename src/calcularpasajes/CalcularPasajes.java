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
        
        System.out.println("Ingrese su nombre");
        Nombre = sc2.nextLine();
        System.out.println("\r");

        System.out.println("Ingrese la tarifa Basica");
        Scanner sc = new Scanner(System.in);
        tarifa = sc.nextDouble();
        tarifaBasica = tarifa;
        System.out.println("\r");

        System.out.println("Ingrese la temporada. ALTA / BAJA");
        Temporada = sc2.nextLine();
        System.out.println("\r");

        System.out.println("Ingrese la compañia para de su preferencia. VOLAR / ALAS");
        Compañia = sc2.nextLine();

        if (Temporada.equals(Alta)) {
            if (Compañia.equals(ALAS)) {
                double tarifaParcial1 = tarifaBasica * 0.20;
                double tarifaTotalParcial1 = tarifaBasica - tarifaParcial1;
                tarifaBasica = tarifaTotalParcial1;
                System.out.println("Aplica 20% de descuento en la tarifa");
            }
            if (Compañia.equals(Volar)) {
                double tarifaParcial2 = tarifaBasica * 0.30;
                double tarifaTotalParcial2 = tarifaBasica - tarifaParcial2;
                tarifaBasica = tarifaTotalParcial2;
                System.out.println("Aplica 30% de descuento en la tarifa");
            }
            System.out.println("Su tarifa basica con descuento de la compania " + Compañia + " en temporada " + Temporada + " es de " + tarifaBasica);
        }
        System.out.println("\r");

        System.out.println("Ingrese su edad");
        Scanner sc3 = new Scanner(System.in);
        edad = sc3.nextInt();
        if (edad < 18) {
            double tarifaParcial3 = tarifaBasica * 0.50;
            double tarifaTotalParcial3 = tarifaBasica - tarifaParcial3;
            tarifaBasica = tarifaParcial3;
            System.out.println("Descuento del 50% aplicado por ser menor de edad, su tarifa basica es de: " + tarifaBasica);
        }
        System.out.println("\r");

        System.out.println("¿Es estudiante? Escriba true o false");
        Scanner sc4 = new Scanner(System.in);
        Estudiante = sc4.nextBoolean();
        if (Estudiante == true) {
            if (edad >= 18) {
                if (Compañia.equals(ALAS)) {
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
