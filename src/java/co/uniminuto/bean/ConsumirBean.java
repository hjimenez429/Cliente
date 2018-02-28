/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uniminuto.bean;

import co.uniminuto.WebSerice.Consumo;
import javax.faces.bean.ManagedBean;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author jose
 */
@ManagedBean(name="consumirBean")
public class ConsumirBean {
    
    private int producto1;
    private int producto2;
    private String res;
    private String sumar;

    public void sumarProduct(){
       sumar=String.valueOf(producto1+producto2); 
    }

    public void sumarProductos(){
        sumarProduct();
        res=String.valueOf(consumirServicio(producto1+producto2));
        
    }

    

    public void setService(Consumo service) {
        this.service = service;
    }
    

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/taller1-war/consumo.wsdl")
    private Consumo service;

    private double consumirServicio(double valor) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        co.uniminuto.WebSerice.IvaWebservice port = service.getIvaWebservicePort();
        return port.consumirServicio(valor);
    }
    
    
    
    public int getProducto1() {
        return producto1;
    }

    public void setProducto1(int producto1) {
        this.producto1 = producto1;
    }

    public int getProducto2() {
        return producto2;
    }

    public void setProducto2(int producto2) {
        this.producto2 = producto2;
    }

    public Consumo getService() {
        return service;
    }
    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
    public String getSumar() {
        return sumar;
    }

    public void setSumar(String sumar) {
        this.sumar = sumar;
    }
}
