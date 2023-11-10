/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lojainformatica;

import com.mycompany.lojainformatica.DAO.ComputrsDAO;
import com.mycompany.lojainformatica.views.ConsultaPeca;
import com.mycompany.lojainformatica.views.ValidaPeca;

/**
 *
 * @author R I C H
 */
public class Lojainformatica {

    public static void main(String[] args) {
        ComputrsDAO connx = new ComputrsDAO();
       // connx.createTables();
       
        ConsultaPeca teste = new ConsultaPeca();
        
        teste.setVisible(true);
        
        ValidaPeca test2 = new ValidaPeca();
        
        test2.setVisible(true);
    }
}
