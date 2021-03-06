/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asi.restaurantbcd.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author samaelopez
 */
@Embeddable
public class OrdenpedidoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idordenpedido")
    private int idordenpedido;
    @Basic(optional = false)
    @Column(name = "idsucursal")
    private int idsucursal;

    public OrdenpedidoPK() {
    }

    public OrdenpedidoPK(int idordenpedido, int idsucursal) {
        this.idordenpedido = idordenpedido;
        this.idsucursal = idsucursal;
    }

    public int getIdordenpedido() {
        return idordenpedido;
    }

    public void setIdordenpedido(int idordenpedido) {
        this.idordenpedido = idordenpedido;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idordenpedido;
        hash += (int) idsucursal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenpedidoPK)) {
            return false;
        }
        OrdenpedidoPK other = (OrdenpedidoPK) object;
        if (this.idordenpedido != other.idordenpedido) {
            return false;
        }
        if (this.idsucursal != other.idsucursal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.asi.restaurantbcd.modelo.OrdenpedidoPK[ idordenpedido=" + idordenpedido + ", idsucursal=" + idsucursal + " ]";
    }
    
}
