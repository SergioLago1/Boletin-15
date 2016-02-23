/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg15;

/**
 *
 * @author slagogonzalez
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Empregado empleado = new Empregado(1,"Miguel","Torrecilla",26);
        Xogador xogador = new Xogador(2,"Jhon","Güidetti",23,11,"Delantero");
        Adestrador adestrador = new Adestrador(3,"Eduardo","Berizzo",19,"1A");
        Maxaxista masaxista = new Maxaxista(4,"Angel","Cota",16,"Profesional",2);
        empleado.concentrarse();
        xogador.concentrarse();
        adestrador.concentrarse();
        masaxista.concentrarse();
        empleado.viaxar();
        xogador.viaxar();
        adestrador.viaxar();
        masaxista.viaxar(); 
        System.out.println(xogador.getEdade()); 
    }
    
}