
package Caja;


public class Resultado {
    public static void main (String [] args){
        Caja cubo1 = new Caja (5, 7, 8);
        System.out.println ( "valores de altura "+cubo1.alto);
        System.out.println("valore de archo "+cubo1.ancho);
        System.out.println("valor de profundidad"+cubo1.profundo);
        System.out.println(" valor de Volumen"+cubo1.calculodvolumen());
    }   
}
