/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojainformatica.models;

/**
 *
 * @author R I C H
 */
public class Computadors {
   private static String marca = "RichardMiranda";
    private String hd;
    private String processador;
    private int idPC;

    
    //Contrutor vazio
    public  Computadors(){
        
    }
    
    
//Contrutor Instaciado
    public Computadors(int idPC, String hd, String processador) {
        this.idPC = idPC;
        this.hd = hd;
        this.processador = processador;
    }
    

    public int getID() {
        return idPC;
    }

    public void setID(int id) {
        this.idPC = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
