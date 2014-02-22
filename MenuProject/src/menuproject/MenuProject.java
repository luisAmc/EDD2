/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menuproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Docente 2014
 */
public class MenuProject {
    
    /**
     * @param args the command line arguments
     */
    private static void nuevoArchivo(){
        System.out.println("Es un nuevo capitulo en mi vida!!!");
    }
    private static void cerrarArchivo(){
        System.out.println("Estoy cerrando el archivo de mi corazon");
    }
    private static void sumarNumeros(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("a="));
        int b = Integer.parseInt(JOptionPane.showInputDialog("a="));
        int c = a + b;
        JOptionPane.showMessageDialog(null, String.valueOf(c));
    }
    private static void restarNumeros(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("a="));
        int b = Integer.parseInt(JOptionPane.showInputDialog("a="));
        int c = a - b;
        JOptionPane.showMessageDialog(null, String.valueOf(c));
    }
    private static void exeTinto(){
        System.out.println("Este vino es tinto");
    }
    private static void exeTunto(){
        System.out.println("Es un tunto manco");
    }
    private static void exeTento(){
        System.out.println("Es un Tento Dificil");
    }
    private static void mostrarAyuda(){
        System.out.println("Esta es la ayuda");
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        Menu nuevo = new Menu("Nuevo", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nuevoArchivo();
            }
        });
        Menu cerrar = new Menu("Cerrar", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarArchivo();
            }
        });
        Menu sumar = new Menu("Sumar", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sumarNumeros();
            }
        }
        );
        Menu restar = new Menu("Restar", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                restarNumeros();
            }
        });
        Menu tinto = new Menu("Tinto", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exeTinto();
            }
        });
        Menu tunto = new Menu("Tunto", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exeTunto();
            }
        });
        Menu tento = new Menu("Tento", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exeTento();
            }
        });
        Menu ayuda = new Menu("Ayuda", new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarAyuda();
            }
        });
        
        Menu archivo = new Menu("Archivo");
        archivo.addSubMenu(nuevo);
        archivo.addSubMenu(cerrar);
        // EXTRA: archivo.addSubMenu(nuevo, cerrar);
        
        Menu numeros = new Menu("Numeros");
        numeros.addSubMenu(sumar);
        numeros.addSubMenu(restar);
        
        Menu tanto = new Menu("Tanto");
        tanto.addSubMenu(tinto);
        tanto.addSubMenu(tunto);
        
        Menu tonto = new Menu("Tonto");
        tonto.addSubMenu(tanto);
        tonto.addSubMenu(tento);
        
        menu.addSubMenu(archivo);
        menu.addSubMenu(numeros);
        menu.addSubMenu(tonto);
        menu.addSubMenu(ayuda);
        
        menu.run();
        
       
    }
    
}
