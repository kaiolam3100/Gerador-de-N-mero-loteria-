
package loteria;

import static java.lang.Math.random;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;


public class Loteria {

    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<>();
        Random gerador = new Random();
        int qnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de números que irá sortear: "));
        
        
        for(int i = 0; i < qnt; i++){
        int n = gerador.nextInt(80);
        arr.add(n);
        System.out.println(arr);
        

        
        }
    JOptionPane.showMessageDialog(null, "<html>Os números gerados foram (anote): "+ arr + "<br></html>");
   
    }
    
}
