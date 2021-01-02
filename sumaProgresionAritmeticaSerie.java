
package prueba3;

import javax.swing.JOptionPane;

public class prueba3 {
   public static void main(String[] args) {
          int x,n,sum=0;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n: "));
        for(int i=0;i<n+1;i++){
            sum+=Math.pow(x,i);
        }        
        JOptionPane.showMessageDialog(null,"El resultado es: "+sum);    
    }
    
}