/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_1;
import java.util.*;
/**
 *
 * @author famil
 */
public class Prueba_1 {
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int cantidad = 0, deuda = 0, j=0;
     List<Integer> lista_Deuda = new ArrayList<>();
     Scanner reader = new Scanner(System.in);
    // recibe catidad de deudas
     while (true) {            
        System.out.println("Digite la cantidad de deudas:");
        cantidad = reader.nextInt();
     
        if (cantidad > 0){
            break;
        }
        System.out.println("El numero debe ser superior a 0");
     }
     //recibe valor de cada deuda y lo adiciona a la lista
     while ( j < cantidad){
        System.out.println("Digite deuda # " + (j+1) + ":" );
        deuda = reader.nextInt();
        
        if (deuda < 0 ){
            System.out.println("La deuda debe ser superior a 0");
        } else {
        lista_Deuda.add(deuda);
        j++;
        }
     }
        System.out.println("Dias de pago x deuda");
     // muestra los dias de pago x deuda   
     for (Object  i : calcular_Pagos(lista_Deuda)){
         System.out.println(" " + i);
     }  
     calcular_Pagos(lista_Deuda);
    }
     //calcula dia de pagos x deuda
     public static List calcular_Pagos (List <Integer> lista_Deuda){
        List<Integer> lista_Pago = new ArrayList<>(); 
        int aux = 1, dias = 0;
        /*Se multiplica la varible aux * 2 hasta llegar a un numero que sea >= a la deuda,
          esto se debe a que el valor actual de aux es igual a la sumatoria de todos los valores anteriores -1
        */          
        //se adiciona 1 dia por cada vez que la varible aux se multiplica
        //
        for (int i : lista_Deuda){
            while (aux <= i){
            aux = aux * 2;
            dias++;
            }
            lista_Pago.add(dias);
            aux = 1;
            dias = 0;
        }
     
        return lista_Pago;
    }
    
   
}
