/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;



/**
 *
 * @author Noemí
 */
public class Burbuja {
    
    public static void main(String []  args){
        int n=10;
        int [] arreglo = new int[n];
        for (int i=0; i<n; i++){
            arreglo[i] = (int)(Math.random() * 100) + 1;
        }
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
        bubbleSort(arreglo);
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
    }
    
    public static void bubbleSort(int [] arreglo){
        int n = arreglo.length;
        
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-i-1; j++){
                
                if (arreglo[j] > arreglo[j+1]){
                    // intercambiar: swap
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temporal;
                }
            }
        }
        
    }
}
