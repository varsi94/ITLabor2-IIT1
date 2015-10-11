
package torpedo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shotResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shotResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shotResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shotResponse", propOrder = {
    "shotResult"
})
public class ShotResponse {

    protected boolean shotResult;

    /**
     * Gets the value of the shotResult property.
     * 
     */
    public boolean isShotResult() {
        return shotResult;
    }

    /**
     * Sets the value of the shotResult property.
     * 
     */
    public void setShotResult(boolean value) {
        this.shotResult = value;
    }

}
