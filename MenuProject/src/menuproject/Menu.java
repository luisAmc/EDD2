/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuproject;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Docente 2014
 */
public class Menu {

    private ActionListener action;
    private String text;
    private boolean isLeaf;
    private boolean isRoot;
    private ArrayList<Menu> menus;
    Scanner sc;

    public Menu() {
        isRoot = true;
        isLeaf = false;
        menus = new ArrayList<Menu>();
        sc = new Scanner(System.in);
    }

    public Menu(String name) {
        this.text = name;
        isLeaf = false;
        isRoot = false;
        menus = new ArrayList<Menu>();
    }

    public Menu(String name, ActionListener action) {
        this.text = name;
        this.action = action;
        isLeaf = true;
        isRoot = false;
    }

    public void addSubMenu(Menu submenu) {
        try {
            if (isLeaf) {
                this.isLeaf = false;
            }
            if (submenu != null) {
                this.menus.add(submenu);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void run() {
        try {
            int option;
            ArrayList<Menu> tmp = menus;
            while (true) {
                System.out.println("Seleccione un modulo:");
                print(tmp);
                option = InputSelection(tmp);
                while (option < 0 || option >= tmp.size()) {
                    System.out.println("\nOcurrio un error, vuelva a ingresar la seleccion de su modulo:");
                    print(tmp);
                    option = InputSelection(tmp);
                }
                if (tmp.get(option).isLeaf) {
                    tmp.get(option).action.actionPerformed(null);
                    tmp = menus;
                } else {
                    tmp = tmp.get(option).menus;
                }
                System.out.println();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void print(ArrayList<Menu> submenus) {
        for (int i = 0; i < submenus.size(); i++) {
            System.out.println((i + 1) + ") " + submenus.get(i).text);
        }
    }

    private int InputSelection(ArrayList<Menu> submenus) {
        sc = new Scanner(System.in);
        String option;
        int retVal = -1;
        option = sc.nextLine();
        for (int i = 0; i < option.length(); i++) {
            if (Character.isDigit(option.charAt(i))) {
                if (Integer.parseInt(option) > 0 && Integer.parseInt(option) <= submenus.size()) {
                    retVal = Integer.parseInt(option);
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        return retVal - 1;
    }
}
