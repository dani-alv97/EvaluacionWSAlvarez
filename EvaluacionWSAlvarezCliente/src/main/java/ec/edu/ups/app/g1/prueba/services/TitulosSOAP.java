package ec.edu.ups.app.g1.prueba.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2021-01-20T19:54:05.001-05:00
 * Generated source version: 2.7.9
 * 
 */
@WebService(targetNamespace = "http://services.prueba.g1.app.ups.edu.ec/", name = "TitulosSOAP")
@XmlSeeAlso({ObjectFactory.class})
public interface TitulosSOAP {

    @WebMethod
    @RequestWrapper(localName = "registrarTitulo", targetNamespace = "http://services.prueba.g1.app.ups.edu.ec/", className = "ec.edu.ups.app.g1.prueba.services.RegistrarTitulo")
    @ResponseWrapper(localName = "registrarTituloResponse", targetNamespace = "http://services.prueba.g1.app.ups.edu.ec/", className = "ec.edu.ups.app.g1.prueba.services.RegistrarTituloResponse")
    public void registrarTitulo(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );
}
