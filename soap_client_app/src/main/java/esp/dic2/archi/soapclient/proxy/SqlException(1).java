
package esp.dic2.archi.soapclient.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour sqlException complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="sqlException">
 *   <complexContent>
 *     <extension base="{http://finalproject.softarchitecture.dic2.esp/}exception">
 *       <sequence>
 *         <element name="nextException" type="{http://finalproject.softarchitecture.dic2.esp/}sqlException" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sqlException", propOrder = {
    "nextException"
})
public class SqlException
    extends Exception
{

    protected SqlException nextException;

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
