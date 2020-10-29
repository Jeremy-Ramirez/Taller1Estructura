/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author User
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        retornaPosicionF("aaaaa");//Prueba de problema #1
        replaceOA("Buenos dias a todos!", 2);//Prueba de problema #2
    }
    //PROBLEMA #1...............................................................
    public static void retornaPosicionF(String s){
        retornaPosicion(s,0);
    }
    
    private static void retornaPosicion(String palabra,int indice){
        char letra = palabra.charAt(indice);
        if(Character.isUpperCase(letra)){
          System.out.println("La  Letra en Mayuscula es: "+letra);
          System.out.println("La posicion es: " +indice);
          
      }else if(indice == palabra.length()-1){
          System.out.println("-1");
      }else{
          retornaPosicion(palabra,indice+1);
      }
          
      
    }
    
    
    //PROBLEMA #2...............................................................
    public static void replaceOA(String cadena,int n){
        replaceOA1(cadena,n,0);
    }
    
    private static void replaceOA1(String s, int numero,int indice){
        
        if(numero==0){
            System.out.println("palabra:  "+s);
        }else if(indice==s.length()){
            System.out.println("No");
        }
        else{
            s=s.replaceFirst("o", "a");
            replaceOA1(s,numero-1, indice+1);
        } 
        
    }
    
}
