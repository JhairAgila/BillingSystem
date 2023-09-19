/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author SONY VAIO
 */
public class DAOPedido extends DAOMain {
        public List getList(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        if(!session.getTransaction().isActive()){
            session.beginTransaction();
        }
        Query query = session.createQuery("from Pedido");
        return query.list();
    }
}
