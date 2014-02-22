/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menuproject;

import java.awt.event.ActionListener;

/**
 *
 * @author Docente 2014
 */
public class Menu {
    private ActionListener action;
    private String text;
    private boolean isLeaf;
    private boolean isRoot;
    public Menu() {
        isRoot = true;
    }
    public Menu(String name){
        this.text = name;
        isLeaf = false;
        isRoot = false;
    }
    
    public Menu(String name, ActionListener action){
        this.text = name;
        this.action = action;
        isLeaf = true;
        isRoot = false;
    }
    public void addSubMenu(Menu submenu){
    }
    
    public void run(){
        while (true){
        
        }
    }
}
