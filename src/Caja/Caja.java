
package Caja;

public class Caja {
        int ancho;
        int alto;
        int profundo ;
        
        
 public Caja(){
     System.out.println(" Proyecto Caja");
 }
 public Caja( int arg1, int arg2, int arg3){
     this.alto = arg1;
     this.ancho = arg2;
     this.profundo = arg3;
 }
 public int calculodvolumen(){
      int valores = ancho*alto*profundo;
      return valores;
 }
}
