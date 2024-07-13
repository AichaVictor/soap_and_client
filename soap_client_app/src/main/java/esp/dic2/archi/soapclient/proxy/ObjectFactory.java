
package esp.dic2.archi.soapclient.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esp.dic2.archi.soapclient.proxy package. 
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

    private final static QName _SQLException_QNAME = new QName("http://finalproject.softarchitecture.dic2.esp/", "SQLException");
    private final static QName _AjoutUtilisateur_QNAME = new QName("http://finalproject.softarchitecture.dic2.esp/", "ajoutUtilisateur");
    private final static QName _AjoutUtilisateurResponse_QNAME = new QName("http://finalproject.softarchitecture.dic2.esp/", "ajoutUtilisateurResponse");
    private final static QName _Authentification_QNAME = new QName("http://finalproject.softarchitecture.dic2.esp/", "authentification");
    private final static QName _AuthentificationResponse_QNAME = new QName("http://finalproject.softarchitecture.dic2.esp/", "authentificationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esp.dic2.archi.soapclient.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     * @return
     *     the new instance of {@link SQLException }
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link AjoutUtilisateur }
     * 
     * @return
     *     the new instance of {@link AjoutUtilisateur }
     */
    public AjoutUtilisateur createAjoutUtilisateur() {
        return new AjoutUtilisateur();
    }

    /**
     * Create an instance of {@link AjoutUtilisateurResponse }
     * 
     * @return
     *     the new instance of {@link AjoutUtilisateurResponse }
     */
    public AjoutUtilisateurResponse createAjoutUtilisateurResponse() {
        return new AjoutUtilisateurResponse();
    }

    /**
     * Create an instance of {@link Authentification }
     * 
     * @return
     *     the new instance of {@link Authentification }
     */
    public Authentification createAuthentification() {
        return new Authentification();
    }

    /**
     * Create an instance of {@link AuthentificationResponse }
     * 
     * @return
     *     the new instance of {@link AuthentificationResponse }
     */
    public AuthentificationResponse createAuthentificationResponse() {
        return new AuthentificationResponse();
    }

    /**
     * Create an instance of {@link SqlException }
     * 
     * @return
     *     the new instance of {@link SqlException }
     */
    public SqlException createSqlException() {
        return new SqlException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     * @return
     *     the new instance of {@link Throwable }
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     * @return
     *     the new instance of {@link StackTraceElement }
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}
     */
    @XmlElementDecl(namespace = "http://finalproject.softarchitecture.dic2.esp/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutUtilisateur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AjoutUtilisateur }{@code >}
     */
    @XmlElementDecl(namespace = "http://finalproject.softarchitecture.dic2.esp/", name = "ajoutUtilisateur")
    public JAXBElement<AjoutUtilisateur> createAjoutUtilisateur(AjoutUtilisateur value) {
        return new JAXBElement<>(_AjoutUtilisateur_QNAME, AjoutUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutUtilisateurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AjoutUtilisateurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://finalproject.softarchitecture.dic2.esp/", name = "ajoutUtilisateurResponse")
    public JAXBElement<AjoutUtilisateurResponse> createAjoutUtilisateurResponse(AjoutUtilisateurResponse value) {
        return new JAXBElement<>(_AjoutUtilisateurResponse_QNAME, AjoutUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentification }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Authentification }{@code >}
     */
    @XmlElementDecl(namespace = "http://finalproject.softarchitecture.dic2.esp/", name = "authentification")
    public JAXBElement<Authentification> createAuthentification(Authentification value) {
        return new JAXBElement<>(_Authentification_QNAME, Authentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthentificationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthentificationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://finalproject.softarchitecture.dic2.esp/", name = "authentificationResponse")
    public JAXBElement<AuthentificationResponse> createAuthentificationResponse(AuthentificationResponse value) {
        return new JAXBElement<>(_AuthentificationResponse_QNAME, AuthentificationResponse.class, null, value);
    }

}
