/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.*;
/**
 *
 * @author alberto
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  i, j;
        double resultado;
        double ecuacion1[][]= new double[1][3];
        double ecuacion2[][]= new double[1][3];
        
        
        
        /**
         * Entrada de constantes
         */
        
        do{
            Scanner leer = new Scanner(System.in);
            try
            {
                for(i=0;i<=2;i++){
            
            System.out.println("Ecuacion 1, Ingrese el valor de la constante "+(i+1));
            ecuacion1[0][i]=leer.nextDouble();
            
            System.out.println("Ecuacion 2, Ingrese el valor de la constante "+(i+1));
            ecuacion2[0][i]=leer.nextDouble();
        }
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("¡Ingrese un numero porfavor!");
                System.out.println("El programa se a reiniciado");
            }
            
        }while(true);
        
        /**
         * Se muestran las ecuaciones
         */
        
        System.out.println("Sus ecuaciones son");
        for(i=0;i<=2;i++){
            System.out.print(ecuacion1[0][i]+"\t");
            
        }
        
        System.out.println();
        for(i=0;i<=2;i++){
            System.out.print(ecuacion2[0][i]+"\t");
        }
        double Multiplicador, Multiplicador2;
        Multiplicador=ecuacion1[0][0];
        Multiplicador2=ecuacion2[0][0];
        
        
        /**
         * Se multiplican las ecuaciones para igualarse
         */
        
        for(i=0;i<=2;i++){
            
            ecuacion1[0][i]=ecuacion1[0][i]*Multiplicador2;
            ecuacion2[0][i]=ecuacion2[0][i]*Multiplicador;
        }
        
        System.out.println();
        
        
        /**
         * Se restan los coeficientes de x, si no dan 0 se multiplica por -1
         */
        double r;
        
        r=ecuacion1[0][0]-ecuacion2[0][0];
        if(r!=0){
            
            for(i=0;i<=2;i++){
            ecuacion1[0][i]=ecuacion1[0][i]*(-1);
        }
            r=ecuacion1[0][0]-ecuacion2[0][0];
            
        }
        
        
       
        
        
        /**
         * Se crea un arreglo final para despejar variable y
         */
        
        System.out.println();
        
        
        double ecuacionfinal[][]=new double[1][2];
        
        ecuacionfinal[0][0]=ecuacion1[0][1]+ecuacion2[0][1];
        ecuacionfinal[0][1]=ecuacion1[0][2]+ecuacion2[0][2];
        
        System.out.println();
        System.out.println();
        
        double x, y;
        
        
        /**
         * Se calcula x e y
         */
        y=ecuacionfinal[0][1]/ecuacionfinal[0][0];
        x=(ecuacion1[0][2]-(ecuacion1[0][1]*y))/ecuacion1[0][0];
        
        
        /**
         * Se muestran los valores
         */
        
        System.out.println("Los valores son");
        System.out.print("x="+x+"\t");
        
        System.out.print("y="+y);
        
        System.out.println();
        
        
        
        
        
        
        
            
            
            
        
            
            
            
        
        
        
        
        
        
        
    }
    
}
