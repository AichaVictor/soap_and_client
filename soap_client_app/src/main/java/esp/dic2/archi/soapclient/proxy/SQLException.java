
package esp.dic2.archi.soapclient.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SQLException complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="SQLException">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SQLState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nextException" type="{http://finalproject.softarchitecture.dic2.esp/}sqlException" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SQLException", propOrder = {
    "sqlState",
    "errorCode",
    "message",
    "nextException"
})
public class SQLException {

    @XmlElement(name = "SQLState")
    protected String sqlState;
    protected int errorCode;
    protected String message;
    protected SqlException nextException;

    /**
     * Obtient la valeur de la propriété sqlState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQLState() {
        return sqlState;
    }

    /**
     * Définit la valeur de la propriété sqlState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQLState(String value) {
        this.sqlState = value;
    }

    /**
     * Obtient la valeur de la propriété errorCode.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Définit la valeur de la propriété errorCode.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propriété nextException.
     * 
     * @return
     *     possible object is
     *     {@link SqlException }
     *     
     */
    public SqlException getNextException() {
        return nextException;
    }

    /**
     * Définit la valeur de la propriété nextException.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlException }
     *     
     */
    public void setNextException(SqlException value) {
        this.nextException = value;
    }

}
