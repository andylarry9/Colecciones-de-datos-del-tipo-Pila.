
package pila;

import java.util.Scanner;
import java.util.Stack;


public class DelimitadoresBalanceados {
    
    public static void main(String[] args) {
        
        String apertura = "([{";
        String clausura = ")]}";
        
        Stack pila = new Stack();
        
        String ecuacion ="";
        char c;
        int p=-1;
        int n=0;
        boolean balanceada=true;
        int opc=0;
        String tecla;
        Scanner teclado = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean isInt =false;
        
        do{
            do{
                System.out.println("----- MENU -----");
                System.out.println("1. INGRESAR UNA EXPRESION");
                System.out.println("2. SALIR");
                System.out.println("INGRESE UNA OPCION (1-2):");
                opc =input.nextInt();
                }while(opc<1 || opc > 2);
            switch(opc){
                case 1:
                    System.out.println("INGRESE UNA EXPRESION:");
                    input.nextLine();
                    ecuacion=input.nextLine();
                    for(int i=0;i<ecuacion.length();i++){
                     c=ecuacion.charAt(i);
                     p=(apertura+clausura).indexOf(c);
                     if(p>-1)
                     {
                         if(p<3)
                         {
                             pila.push(c);
                             n++;
                         }else
                         {
                             if(!pila.empty())
                             {
                               if(apertura.indexOf(pila.pop().toString())!=clausura.indexOf(c))
                               {
                                   System.out.println("LA EXPRESION NO ESTA BALANCEADA");
                                   balanceada=false;
                                   break;
                               } 
                             }else {
                                   System.out.println("LA EXPRESION NO ESTA BALANCEADA");
                                    balanceada=false;
                                   break;
                               }
                             }
                         }
                     }
                    if(pila.empty()&&n>0&&balanceada)
                    {
                        System.out.println("LA EXPRESION ESTA BALANCEADA");
                    }
                    System.out.println("----------------------");
                    System.out.println("PRESIONE UNA TECLA PARA CONTINUAR...");
                    try
                    {
                        tecla=teclado.nextLine();
                    }
                   catch(Exception e)
                   {}
                    break;
                case 2:
                    System.exit(0);
            }
            }while(true);
    }
            
        }
      
    
    

