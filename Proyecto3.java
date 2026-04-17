package Proyecto;

import java.util.Scanner;

public class Proyecto3 {
    public static int calculoHoras(int n, String nom, int pago) {
        // Write you code here
       int horasExtras = 0;
       int pagoNormal = 0;
       int pagoExtra = 0;
       int totalPagar = 0; 
       int pagoDoble = pago*2;

       pagoNormal =n*pago;

        if(n>8){
            horasExtras = n-8;
            pagoNormal =8*pago;
            pagoExtra =horasExtras*pagoDoble;
       }else{
            horasExtras=0;
            pagoNormal =n*pago;
       }

       totalPagar = pagoNormal+pagoExtra;

       System.out.println("---------------");
       System.out.println("Empleado:  " + nom);
       System.out. println("Horas: " + n);
       System.out. println("Pago normal: " + pagoNormal);
       System.out. println("Pago extra: " + pagoExtra);
       System.out. println("Total a pagar: " + totalPagar);

       return totalPagar;
       
    }

    public static void main(String[] args) {
        int totalEmpleados = 0;
        int sumaPagos = 0;
        Scanner scanner = new Scanner(System.in);
        boolean condicion = true;
        
        do {
            System.out.println("Ingrese el Nombre del Empleado: ");
            String nombreEmpleado = scanner.nextLine();

            System.out.println("Ingrese las horas de trabajo: ");
            int horasTrabajadas = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Pago por hora: ");
            int pagoHoras = scanner.nextInt();
            scanner.nextLine();

            int total = calculoHoras(horasTrabajadas,nombreEmpleado, pagoHoras);

            sumaPagos += total;
            totalEmpleados ++;


            //------------------------------------------
            System.out.println("Desea Continuar (Si/No)");
            String respuesta = scanner.nextLine();
            if(respuesta.equalsIgnoreCase("Si")){
                condicion= true;
            }else{
                condicion= false;
            }
            //-------------------------------------------------

            
        } while (condicion);

        System.out.println("Total de empleados: " + totalEmpleados);
        System.out.println("Suma total de pagos: " + sumaPagos);

            
        scanner.close();
        
    }
    
}
