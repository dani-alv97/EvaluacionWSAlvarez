
package ec.edu.ups.app.g1.prueba.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.app.g1.prueba.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegistrarTitulo_QNAME = new QName("http://services.prueba.g1.app.ups.edu.ec/", "registrarTitulo");
    private final static QName _RegistrarTituloResponse_QNAME = new QName("http://services.prueba.g1.app.ups.edu.ec/", "registrarTituloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.app.g1.prueba.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarTitulo }
     * 
     */
    public RegistrarTitulo createRegistrarTitulo() {
        return new RegistrarTitulo();
    }

    /**
     * Create an instance of {@link RegistrarTituloResponse }
     * 
     */
    public RegistrarTituloResponse createRegistrarTituloResponse() {
        return new RegistrarTituloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.prueba.g1.app.ups.edu.ec/", name = "registrarTitulo")
    public JAXBElement<RegistrarTitulo> createRegistrarTitulo(RegistrarTitulo value) {
        return new JAXBElement<RegistrarTitulo>(_RegistrarTitulo_QNAME, RegistrarTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTituloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.prueba.g1.app.ups.edu.ec/", name = "registrarTituloResponse")
    public JAXBElement<RegistrarTituloResponse> createRegistrarTituloResponse(RegistrarTituloResponse value) {
        return new JAXBElement<RegistrarTituloResponse>(_RegistrarTituloResponse_QNAME, RegistrarTituloResponse.class, null, value);
    }

}
