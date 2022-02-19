
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vh367
 */
public class Ejercicio2 {
   public static void main(String[] args) {
       int number, par = 0, impar = 0, num5=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("ingrese el rango de la matriz");
      number = sc.nextInt();
      int[] arrNumbers = new int[number];
      System.out.println("ingrese elementos de la matriz ");
      for(int a = 0; a < number; a++)
      {
          
         arrNumbers[a] = sc.nextInt();
       
      }
      for(int a = 0; a < number; a++)
      {
        
         if(arrNumbers[a] % 2 == 0)
             
         {
         arrNumbers[a]=1;
           par=par+arrNumbers[a];
             
           
         }
        if(arrNumbers[a]==5 )
        {
            
            arrNumbers[a]=5;
             num5=num5+arrNumbers[a];
            
            
             
         } if (arrNumbers[a]%2!=0&& arrNumbers[a]==5) {
          arrNumbers[a]=3;
        impar=impar+arrNumbers[a];
            
          
         }
         {
                 
         }      
         
      }
      int resultado= par+impar+num5;
       System.out.println("resultado:"+resultado);
      sc.close();
   }
    
                
            
   }

