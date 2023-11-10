/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojainformatica.DAO;

import com.mycompany.lojainformatica.models.Computadors;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author R I C H
 */
public class ComputrsDAO {

    static String url = "jdbc:mysql://host:3306/lojainformatica";
    static String login = "Rich";
    static String senha = "Rdzin.s7";

    public boolean cadastrar(Computadors computerss) {
        boolean retornar = false;
        Connection connect = null;
        PreparedStatement commSQL = null;

        try {
            //Chamando o drive do banco
            Class.forName("com.mysql.cj.jbdc.Driver");

            //Ligando a conexão com banco
            connect = DriverManager.getConnection(url, login, senha);

            commSQL = connect.prepareStatement("INSERT INTO computador (marca, processado, hd) VALUES(?,?)");
            commSQL.setString(1, computerss.getMarca());
            commSQL.setString(2, computerss.getHd());
            commSQL.setString(3, computerss.getProcessador());

            int afExl = commSQL.executeUpdate();

            if (afExl > 0) {
                retornar = true;
            }

        } catch (ClassNotFoundException ex) {
            retornar = false;

        } catch (SQLException ex) {
            retornar = false;
        } finally {
            if (connect != null) {
                try {
                    connect.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputrsDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return retornar;
    }

    public static ArrayList<Computadors> listar()  {

        ArrayList<Computadors> lista = new ArrayList<>();

        Connection connection = null;
        PreparedStatement commSQL = null;
        ResultSet res = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            DriverManager.getConnection(url, login, senha);

            commSQL = connection.prepareStatement("SELECT * FROM computador");

            res = commSQL.executeQuery();
            
            if(res != null){
                while(res.next()){
                    Computadors item = new Computadors();
                    item.setID(res.getInt("idPCs"));
                    item.setHd(res.getString("hd"));
                    item.setProcessador(res.getString("processador"));
                    
                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ComputrsDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ComputrsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputrsDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;
    }

}
