
package com.master.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.master.service package.
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

    private final static QName _Hello_QNAME = new QName("http://service.master.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.master.com/", "helloResponse");
    private final static QName _Contact_QNAME = new QName("http://service.master.com/", "Contact");
    private final static QName _ContactResponse_QNAME = new QName("http://service.master.com/", "ContactResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.master.service
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     *
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     *
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Contact }
     *
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ContactResponse }
     *
     */
    public ContactResponse createContactResponse() {
        return new ContactResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.master.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.master.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.master.com/", name = "Contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.master.com/", name = "ContactResponse")
    public JAXBElement<ContactResponse> createContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_ContactResponse_QNAME, ContactResponse.class, null, value);
    }

}
