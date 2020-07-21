
package com.mycompany.operaciones;


//Importando la bilbioteca de JOptionPane
import javax.swing.JOptionPane;

//Método Main 
public class Main {
    
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog ("Dígite el primer número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog ("Dígite el segundo número"));
        
        //Creamos el objeto de la Operación
        Operacion op = new Operacion();
        
        //Operaciones exactas sin decimales
        int suma  = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int mult   = op.multiplicar(n1, n2);
        int div  = op.dividir(n1, n2);
        
        //Nos muestra nuestro resultado
        op.mostrarResultados(suma, resta, mult, div);
    }
}
