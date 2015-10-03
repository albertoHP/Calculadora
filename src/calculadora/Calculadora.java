/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import javax.swing.JOptionPane;
import calculadora.ecuaciondelarecta;
import javax.swing.JCheckBox;

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
        int seguir;
        
        do{
        
        JCheckBox chec=new JCheckBox("Prueba");
       
int seleccion = JOptionPane.showOptionDialog( null,"Seleccione una opcion",
  "Calculadora",JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
  new Object[] { "Ecuaciones lineales", "Ecuacion de la recta",},"opcion 1");
      
 
        
        
        
        
        
        
        
        
        
        if(seleccion==1){
            ecuaciondelarecta er;
            er = new ecuaciondelarecta();
            er.ecuacion();
        }else{
        
            
            
            int  i, j;
        double resultado;
        double ecuacion1[][]= new double[1][3];
        double ecuacion2[][]= new double[1][3];
        
        JOptionPane.showMessageDialog(null,"Calculadora de ecuaciones lineales");
        
        /**
         * Entrada de constantes
         */
        
        do{
            
            try
            {
                for(i=0;i<=2;i++){
            
            
            ecuacion1[0][i]=Integer.parseInt(JOptionPane.showInputDialog("Ecuacion 1" +
               " Ingrese el valor "+(i+1)));
            
            
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
       
        
        
        
        
        
        }
        
        
         seguir=JOptionPane.showConfirmDialog(null,"¿Desea volver a utilizar la calculadora?");
              if (JOptionPane.OK_OPTION == seguir){
   
                seguir=1;
                }
                 else{
    
                seguir=2;
              }
        
    }while(seguir==1);
        JOptionPane.showMessageDialog(null, "Gracias por utilizar la calculadora.",
  "Calculadora", JOptionPane.WARNING_MESSAGE);
       
    
    }
    
}
