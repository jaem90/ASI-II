/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asi.restaurantebdc.controller.compras;

import com.asi.restaurantbcd.modelo.Compra;
import com.asi.restaurantbcd.modelo.CompraDetalle;
import com.asi.restaurantbcd.modelo.Estado;
import com.asi.restaurantbcd.modelo.Proveedor;
import com.asi.restaurantbcd.util.Utilidades;
import com.asi.restaurantebcd.controller.seguridad.SessionUsr;
import com.asi.restaurantebcd.negocio.base.BusquedasComprasLocal;
import com.asi.restaurantebcd.negocio.base.CrudBDCLocal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author samaelopez
 */
@Named(value = "compraBean")
@ViewScoped
public class CompraBean {


    
      //<editor-fold  defaultstate="collapsed" desc="Constructor" >
    /**
     * Creates a new instance of CompraBean
     */
    public CompraBean() {
    }
    //</editor-fold >
   
      //<editor-fold  defaultstate="collapsed" desc="Variables" >
    private Integer nodocu;
    private String observacion;
    private String estado;
    private String usr;
    private String codigo;
    private String serie;
    private String nombreProveedor;
    private Proveedor proveedor;
            SessionUsr sesion = Utilidades.findBean("sessionBean");
    private Date fecha;
    private String mensaje;
    private Compra compraEnca;
    private List < CompraDetalle > lstCompradeta =  new ArrayList<>();
    private List < Proveedor > lstProveedor =  new ArrayList<>();
     @EJB
     CrudBDCLocal crud;
     @EJB
     BusquedasComprasLocal ejbBusComp;
   
    //</editor-fold >
   
      @PostConstruct
    public void postConstruction(){
        try{
//            if(sesion == null){
//                System.out.println("redirect docs");
//                alert("Debe Iniciar Sesion",FacesMessage.SEVERITY_FATAL);
//                FacesContext.getCurrentInstance().getViewRoot().
//                        getViewMap().clear();
//            String url = "http://localhost:8080/RestaurantBDC";
//            FacesContext.getCurrentInstance().getExternalContext().
//                    redirect(url);
//            } 
        } catch (Exception e) {
        }
    }
      //<editor-fold  defaultstate="collapsed" desc="Metodos" >
   /**
    * 
    */
   public void nuevaCompra() {
       lstCompradeta.clear();
       nodocu = null;
        estado = null;
       nombreProveedor = null;
       fecha = null;
       observacion = null;
       usr = null;
       codigo = null;
       serie = null;
       
       
   }
   /**
    * 
    */
   public void guardarCompra() {
       
        try {
            compraEnca = new Compra();
            
            compraEnca.setCodigoFactura(codigo);
            compraEnca.setCompraDetalleList(lstCompradeta);
            compraEnca.setFechaCompra(new Date());
            compraEnca.setIdCompra(ejbBusComp.obtenerCorreltivoCompra());
            Estado est = crud.buscarEntidad(Estado.class, 99);
            compraEnca.setIdEstado(est);
            compraEnca.setIdProveedor(proveedor);
            compraEnca.setIdSucursal(sesion.getSucursal());
            compraEnca.setIdUsuario(sesion.getUsuario());
            compraEnca.setSerieFactura(serie);
        } catch (Exception ex) {
            Logger.getLogger(CompraBean.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   }
  /**
    * 
    */
   public void anularCompra() {
       
   }
  /**
    * 
    */
   public void buscarCompra() {
       
   }
  /**
    * 
    */
   public void imprimitCompra() {
       
   }
         public void alert(String mensaje, FacesMessage.Severity faces) {
        FacesMessage message = new FacesMessage(faces,
                "Mensaje", mensaje);
         
        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

       //</editor-fold >
   
      //<editor-fold  defaultstate="collapsed" desc="Getter y Setter" >
 public Integer getNodocu() {
        return nodocu;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
 

    public void setNodocu(Integer nodocu) {
        this.nodocu = nodocu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Proveedor> getLstProveedor() {
        return lstProveedor;
    }

    public void setLstProveedor(List<Proveedor> lstProveedor) {
        this.lstProveedor = lstProveedor;
    }

    public List<CompraDetalle> getLstCompradeta() {
        return lstCompradeta;
    }

    public void setLstCompradeta(List<CompraDetalle> lstCompradeta) {
        this.lstCompradeta = lstCompradeta;
    }


    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Compra getCompraEnca() {
        return compraEnca;
    }

    public void setCompraEnca(Compra compraEnca) {
        this.compraEnca = compraEnca;
    }
    //</editor-fold >

   
    
}
