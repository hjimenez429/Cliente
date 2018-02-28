
package co.uniminuto.WebSerice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.uniminuto.WebSerice package. 
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

    private final static QName _ConsumirServicio_QNAME = new QName("http://WebService.uniminuto.co/", "consumirServicio");
    private final static QName _ConsumirServicioResponse_QNAME = new QName("http://WebService.uniminuto.co/", "consumirServicioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.uniminuto.WebSerice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumirServicio }
     * 
     */
    public ConsumirServicio createConsumirServicio() {
        return new ConsumirServicio();
    }

    /**
     * Create an instance of {@link ConsumirServicioResponse }
     * 
     */
    public ConsumirServicioResponse createConsumirServicioResponse() {
        return new ConsumirServicioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumirServicio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.uniminuto.co/", name = "consumirServicio")
    public JAXBElement<ConsumirServicio> createConsumirServicio(ConsumirServicio value) {
        return new JAXBElement<ConsumirServicio>(_ConsumirServicio_QNAME, ConsumirServicio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumirServicioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.uniminuto.co/", name = "consumirServicioResponse")
    public JAXBElement<ConsumirServicioResponse> createConsumirServicioResponse(ConsumirServicioResponse value) {
        return new JAXBElement<ConsumirServicioResponse>(_ConsumirServicioResponse_QNAME, ConsumirServicioResponse.class, null, value);
    }

}
