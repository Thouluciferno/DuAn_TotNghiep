/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.bean;

import javax.swing.JMenuItem;

/**
 *
 * @author Nhu Y
 */
public class MenuBean {
    private String kind;
    private JMenuItem mnu;

    public MenuBean() {
    }

    public MenuBean(String kind, JMenuItem mnu) {
        this.kind = kind;
        this.mnu = mnu;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JMenuItem getMnu() {
        return mnu;
    }

    public void setMnu(JMenuItem mnu) {
        this.mnu = mnu;
    }
    
    
}
