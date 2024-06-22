package parcial.examenfinal;

import java.util.Scanner;


public class ExamenFinal {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        boolean running = true;
        
        while(running){
            
            System.out.println("Que accion desea realizar");
            System.out.println("1. Abrir cuenta de ahorro");
            System.out.println("2. Solicitar credito");
            System.out.println("4. Abonar a la cuenta de ahorros");
            System.out.println("5. Retirar de la cuenta de ahorros");
            System.out.println("6. Salir");
            int opc = scn.nextInt();
            
            switch(opc){
                
                case 1:
                    
                    System.out.println("Que tipo de persona es?");
                    System.out.println("1. Independiente");
                    System.out.println("2. Empleado");
                    int opc2 = scn.nextInt();
                    
                    switch(opc){
                        
                        case 1:
                        break;
                        
                        case 2:
                        break;
                        
                        
                    }
                break;
                
                case 2:
                break;
                
                case 3:
                break;
                
                case 4:
                break;    
                
                case 6:
                    running = false;
                break;
                
            }
            
        }
        
        
        
        
        
    }
}

