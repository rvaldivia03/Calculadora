/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.Scanner;

/**
 *
 * @author atsuchiya
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Entre Primer numero");
            double a = sc.nextDouble();
            
        System.out.println("Entre 2do numero");
            double b = sc.nextDouble();
            
            
            
            System.out.println("Presione 1 para sumar");
            System.out.println("Presione 2 para restar");
            System.out.println("Presione 3 para multiplicar");
            System.out.println("Presione 4 para dividir");
            System.out.println("Presione 0 para salir");
            
            int option = sc.nextInt();
      
                switch (option) {
                    case 1: System.out.println("La suma es " + (a+b));
                        break;
                    case 2: System.out.println("La resta es " + (a-b));
                        break;
                    case 3: System.out.println("La multiplicacion es " + (a*b));
                        break;
                    case 4:
                        if(b != 0){
                        System.out.println("La division es " + (a/b));
                        }else
                            System.err.println("Burro");
                        break;
                    case 0 : System.out.println("BYEEE");
                        break;
                }   
            }   
        }   
    
