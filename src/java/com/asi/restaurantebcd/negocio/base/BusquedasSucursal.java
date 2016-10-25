/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asi.restaurantebcd.negocio.base;

import com.asi.restaurantbcd.modelo.Compania;
import com.asi.restaurantbcd.modelo.Sucursal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author siman
 */
@Stateless
public class BusquedasSucursal implements BusquedasSucursalLocal{
    @PersistenceContext(unitName = "RestaurantBDC-WebPU")
    private EntityManager em;

    @Override
    public List<Sucursal> buscarSucursal(Compania idCompania) throws Exception {
        
        StringBuilder jpql = new StringBuilder();
        jpql.append("SELECT a FROM Sucursal a where a.idcompania = :c");
        Query query = em.createQuery(jpql.toString()).setParameter("c", idCompania);
        return query.getResultList();   
    }

    
}