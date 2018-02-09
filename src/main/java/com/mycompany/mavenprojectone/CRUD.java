/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectone;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrator
 */
public class CRUD {
    
    Session session = NewHibernateUtil.getSessionFactory().openSession();
    
    public void save(tblmusteri item)  {
    Transaction tr = session.beginTransaction();
    session.save(item);
    tr.commit();
    session.close();
    
    }
    
    
    
    
    
}
