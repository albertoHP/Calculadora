/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.*;
import javax.swing.JOptionPane;
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
        
        JOptionPane.showMessageDialog(null,"Calculadora de ecuaciones lineales");
        
        /**
         * Entrada de constantes
         */
        
        do{
            Scanner leer = new Scanner(System.in);
            try
            {
                for(i=0;i<=2;i++){
            
            //System.out.println("Ecuacion 1, Ingrese el valor de la constante "+(i+1));
            ecuacion1[0][i]=Integer.parseInt(JOptionPane.showInputDialog("Ecuacion 1" +
               " Ingrese el valor "+(i+1)));
            
            //System.out.println("Ecuacion 2, Ingrese el valor de la constante "+(i+1));
            ecuacion2[0][i]=Integer.parseInt(JOptionPane.showInputDialog("Ecuacion 2" +
               " Ingrese el valor "+(i+1)));
        }
                break;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Valor ingresado no es un numero",
  "Ecuaciones lineales", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null, "El programa se reiniciara",
  "Ecuaciones lineales", JOptionPane.WARNING_MESSAGE);
            }
            
        }while(true);
        
        /**
         * Se muestran las ecuaciones
         * 
         */
        
        
        
         String result="";
           for ( i=0; i<= 2; i++)
            {
          result+= "("+ecuacion1[0][i]+")";
          if(i==0){
              result+="x + ";
          }
          if(i==1){
              result+=" y =";
          }
        }
    JOptionPane.showMessageDialog(null,"La ecuacion 1 es: "+result);
    
    String resultt="";
           for ( i=0; i<= 2; i++)
            {
          resultt+= "("+ecuacion2[0][i] + ")";
          if(i==0){
              resultt+="x + ";
          }
          if(i==1){
              resultt+="y =";
          }
        }
    JOptionPane.showMessageDialog(null,"La ecuacion 2 es: "+resultt);
        
        
        
        
        //System.out.println("Sus ecuaciones son");
        
        //for(i=0;i<=2;i++){
          //  System.out.print(ecuacion1[0][i]);
            //if(i==0){
              //  System.out.print("x"+"\t");
            //}
            
            //if(i==1){
             //   System.out.print("y = ");
            //}
            
            
        //}
        
        //System.out.println();
        
        //for(i=0;i<=2;i++){
          //  System.out.print(ecuacion2[0][i]);
            //if(i==0){
              //  System.out.print("x"+"\t");
            //}
            
            //if(i==1){
              //  System.out.print("y = ");
            //}
        //}
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
        
        JOptionPane.showMessageDialog(null,"Los valores son: x="+x+"  y="+y);
       
        //System.out.println("Los valores son");
        //System.out.print("x="+x+"\t");
        
        //System.out.print("y="+y);
        
        //System.out.println();
        
        
        
        
        
        
        
            
            
            
        
            
            
            
        
        
        
        
        
        
        
    }
    
}
