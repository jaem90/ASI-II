/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asi.restaurantebcd.negocio.base;

import com.asi.restaurantbcd.modelo.Medida;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface BusquedasMedidasLocal {
       /**
     * Obtiene la lista de estado documentos.
     * @return List Estado documento.
     * @throws Exception Error generico.
     */
     List <Medida> buscarMedida() throws Exception;
}
