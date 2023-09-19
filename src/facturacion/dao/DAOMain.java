/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.dao;

import facturacion.model.Pedido;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author SONY VAIO
 */
public class DAOMain {
    
    public Object guardar(Object object){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        if(session.getTransaction().isActive()){
            session.getTransaction().commit();
            session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        session.beginTransaction();
        Object object1 = session.save(object);
        session.getTransaction().commit();
        return object1;
    }
    
    public void guardarOActualizar(Object object){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        if (session.getTransaction().isActive()){
            session.getTransaction().commit();
            session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        session.beginTransaction();
        session.saveOrUpdate(object);
        session.getTransaction().commit();
    }
    
    public void eliminar(Object object){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        if(!session.getTransaction().isActive()){
            session.beginTransaction();
        }
        session.delete(object);
        session.getTransaction().commit();
    }
    
    public void eliminarBaseDatos(List<Pedido> lista){
        for( Pedido ped : lista ){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            if(!session.getTransaction().isActive()){
            session.beginTransaction();
            }
            session.delete(ped);
            session.getTransaction().commit();
        }
    }
    
}   
