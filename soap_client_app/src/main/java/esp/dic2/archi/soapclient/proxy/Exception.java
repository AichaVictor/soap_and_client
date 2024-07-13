
package esp.dic2.archi.soapclient.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour exception complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="exception">
 *   <complexContent>
 *     <extension base="{http://finalproject.softarchitecture.dic2.esp/}throwable">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exception")
@XmlSeeAlso({
    SqlException.class
})
public class Exception
    extends Throwable
{


}
