/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asi.restaurantebcd.negocio.base;

import com.asi.restaurantbcd.modelo.Numerofiscal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author "Joaquin Sanchez SA101110"
 */
@Local
public interface BusquedasNumeroFiscalLocal {
    public List <Numerofiscal> buscarNumeroFiscal () throws Exception;
    
}