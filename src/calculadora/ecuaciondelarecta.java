/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author alberto
 */
public class ecuaciondelarecta {
    
    public void ecuacion(){

        double x1,y1,x2,y2,m,b;
        Scanner leer = new Scanner(System.in);
        try{
        System.out.print("Ingrese x1");
        x1=leer.nextDouble(); 
        System.out.print("Ingrese y1");
        y1=leer.nextDouble();
       
        System.out.print("Ingrese x2");
        x2=leer.nextDouble();
        
        System.out.print("Ingrese y2");
        y2=leer.nextDouble();
       
      
       if(x2==x1)
            System.out.println("Error");
       if(x2!=x1){
       m=(y2-y1)/(x2-x1);
       b=y1-m*x1;
       System.out.print("La Ecuacion de la recta es: Y="+ m + "X + "+b );}
      }
      catch(Exception e){
          
       
          System.out.println("ERROR");
        
        
                }
   }
    
}


