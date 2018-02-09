/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectone;

/**
 *
 * @author Administrator
 */
public class runner {
  
    public static void main(String[] args) {
        CRUD  crd = new CRUD();
        tblmusteri mst = new tblmusteri();
        mst.setId(1);
        mst.setAdi("Muhammet Ali KAYA");
        crd.save(mst);
                
    }
            
}
