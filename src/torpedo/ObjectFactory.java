
package torpedo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the torpedo package. 
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

    private final static QName _ShotResponse_QNAME = new QName("http://itlabor/torpedo", "shotResponse");
    private final static QName _Shot_QNAME = new QName("http://itlabor/torpedo", "shot");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: torpedo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShotResponse }
     * 
     */
    public ShotResponse createShotResponse() {
        return new ShotResponse();
    }

    /**
     * Create an instance of {@link Shot }
     * 
     */
    public Shot createShot() {
        return new Shot();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShotResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itlabor/torpedo", name = "shotResponse")
    public JAXBElement<ShotResponse> createShotResponse(ShotResponse value) {
        return new JAXBElement<ShotResponse>(_ShotResponse_QNAME, ShotResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://itlabor/torpedo", name = "shot")
    public JAXBElement<Shot> createShot(Shot value) {
        return new JAXBElement<Shot>(_Shot_QNAME, Shot.class, null, value);
    }

}
