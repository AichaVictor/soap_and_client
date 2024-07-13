
package esp.dic2.archi.soapclient.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ajoutUtilisateur complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="ajoutUtilisateur">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nom_user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mot_de_passe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajoutUtilisateur", propOrder = {
    "token",
    "nomUser",
    "motDePasse"
})
public class AjoutUtilisateur {

    protected String token;
    @XmlElement(name = "nom_user")
    protected String nomUser;
    @XmlElement(name = "mot_de_passe")
    protected String motDePasse;

    /**
     * Obtient la valeur de la propriété token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Définit la valeur de la propriété token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtient la valeur de la propriété nomUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUser() {
        return nomUser;
    }

    /**
     * Définit la valeur de la propriété nomUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUser(String value) {
        this.nomUser = value;
    }

    /**
     * Obtient la valeur de la propriété motDePasse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * Définit la valeur de la propriété motDePasse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotDePasse(String value) {
        this.motDePasse = value;
    }

}
