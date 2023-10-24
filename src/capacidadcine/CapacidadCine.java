/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capacidadcine;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class CapacidadCine {
    private    Scanner teclado = new Scanner (System.in);
    public static void mostrarAsientos(String[][] asientos){
                // Mostrar asientos
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print("[ "+ asientos[i][j] +" ]" );
            }
            System.out.println("");
        }
    };
    
    public static String[][] cargarAsientos() {
        String asientos[][] = new String[10][10];
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = "L"; // L for available, you can change it to other codes if needed
            }
        }
        return asientos;
    }
       
    public static void reservarAsiento( String [][] asientos ){
           Scanner teclado = new Scanner (System.in);
         
        boolean bandera = false;   
        do {
              System.out.println("Ingrese cual asiento quiere reservar: (10 filas y 10 columnas)");
            int fila = teclado.nextInt() - 1;
            int columna = teclado.nextInt() - 1;
        if(!asientos[fila][columna].equals("L")){
            System.out.println("No se puede reservar porque esta ocupado el asiento");
        } else  asientos[fila][columna]  =    "X"  ; 
        
            System.out.println("Desea  hacer otra reserva ? s/n");
            bandera = teclado.next().equals("s") ? false:true;
         
       }while(!bandera)    ; 
    };
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String asientos [][];
        Scanner teclado = new Scanner (System.in);
        asientos = cargarAsientos();
      
        

        int opcion;
        
        do{
            System.out.println("Ingrese su opcion:");
            System.out.println("1-Mostrar asientos");
            System.out.println("2-Reservar asientos");
            System.out.println("3-Salir");
            opcion = teclado.nextInt();
            
            switch(opcion){
                
                case 1:
                    mostrarAsientos(asientos);
                    System.out.println("Ingrese enter para continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                
                case 2:
                 
                    reservarAsiento(asientos);
                    break;
                
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("ESa opcion no existe");
              

            }
            
        }while(opcion!=3);
           

        
    }
    
}
