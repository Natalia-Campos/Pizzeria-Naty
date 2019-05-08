/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.dao;

import org.persona.cliente.Cliente;

/**
 *
 * @author Giselle
 */
public class ClienteDaoHibernateImp implements ClienteDao {
private final SessionFactory sessionFactory;
    public ClienteDaoHibernateImpl(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
    }
    
    @Override
    public Cliente BuscarClienteApellido(String apellido) {
      Session session = sessionFactory.openSession();
        
     Criteria Builder builder = session.getCriteriaBuilder();
     Criteria Query<Cliente> query = builder.createQuery(Cliente.class);
     Root<Cliente> root = query.from(Cliente.class);
     query.select(root); query.where(builder.equal(root.get("apellido"), apellido));
     Cliente cliente = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return cliente;
    }

    @Override
    public Cliente BuscarClienteNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente ActualizarClienteNomb(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
