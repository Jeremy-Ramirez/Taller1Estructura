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
        retornaPosicionF("aaaaa");//Prueba de ejercicio #1
        replaceOA("Buenos dias a todos!", 2);//Prueba de ejercicio #2
        int [] x = {1,2,3,4,5,6,7,7,8};
        System.out.println(Comparar(x));//Prueba de ejercicio #3
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
    
    //PROBLEMA #3...............................................................
    public static int Comparar(int[]arreglo){
        return Comparar1(arreglo,0,arreglo.length-1,0);
    }
    private static int Comparar1(int[] arreglo, int low, int high, int var){
        if(low>high && arreglo[0]==0){
            return low+1;
        }else if(low>high && arreglo[0]!=0){
            return low;
        }
        else{
            int mid= (low+high)/2;
            if(mid==arreglo[mid]-arreglo[var] ){
               return Comparar1(arreglo, mid+1, high, var);
            }else if(arreglo[mid]==arreglo[mid-1]){
               return mid;
            }else if(arreglo[mid]==arreglo[mid+1]){
                return mid+1 ;
            }
            else {
               return Comparar1(arreglo, low, mid-1,var);
            }
        }
        
    }
        
    
}
