
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _AddAuteur_QNAME = new QName("http://service/", "addAuteur");
    private final static QName _ReadBooksResponse_QNAME = new QName("http://service/", "readBooksResponse");
    private final static QName _GetAuteurResponse_QNAME = new QName("http://service/", "getAuteurResponse");
    private final static QName _GetRelationResponse_QNAME = new QName("http://service/", "getRelationResponse");
    private final static QName _AddBookResponse_QNAME = new QName("http://service/", "AddBookResponse");
    private final static QName _GetDispoBookResponse_QNAME = new QName("http://service/", "GetDispoBookResponse");
    private final static QName _GetDispoBook_QNAME = new QName("http://service/", "GetDispoBook");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://service/", "deleteBookResponse");
    private final static QName _ReadBooks_QNAME = new QName("http://service/", "readBooks");
    private final static QName _DeleteBook_QNAME = new QName("http://service/", "deleteBook");
    private final static QName _GetBookByIdResponse_QNAME = new QName("http://service/", "getBookByIdResponse");
    private final static QName _AddBook_QNAME = new QName("http://service/", "AddBook");
    private final static QName _AddAuteurResponse_QNAME = new QName("http://service/", "addAuteurResponse");
    private final static QName _GetBookById_QNAME = new QName("http://service/", "getBookById");
    private final static QName _AddRelation_QNAME = new QName("http://service/", "addRelation");
    private final static QName _GetAuteur_QNAME = new QName("http://service/", "getAuteur");
    private final static QName _GetRelation_QNAME = new QName("http://service/", "getRelation");
    private final static QName _AddRelationResponse_QNAME = new QName("http://service/", "addRelationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuteurResponse }
     * 
     */
    public GetAuteurResponse createGetAuteurResponse() {
        return new GetAuteurResponse();
    }

    /**
     * Create an instance of {@link GetRelationResponse }
     * 
     */
    public GetRelationResponse createGetRelationResponse() {
        return new GetRelationResponse();
    }

    /**
     * Create an instance of {@link ReadBooksResponse }
     * 
     */
    public ReadBooksResponse createReadBooksResponse() {
        return new ReadBooksResponse();
    }

    /**
     * Create an instance of {@link AddAuteur }
     * 
     */
    public AddAuteur createAddAuteur() {
        return new AddAuteur();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetDispoBookResponse }
     * 
     */
    public GetDispoBookResponse createGetDispoBookResponse() {
        return new GetDispoBookResponse();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AddAuteurResponse }
     * 
     */
    public AddAuteurResponse createAddAuteurResponse() {
        return new AddAuteurResponse();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link GetBookByIdResponse }
     * 
     */
    public GetBookByIdResponse createGetBookByIdResponse() {
        return new GetBookByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link ReadBooks }
     * 
     */
    public ReadBooks createReadBooks() {
        return new ReadBooks();
    }

    /**
     * Create an instance of {@link GetDispoBook }
     * 
     */
    public GetDispoBook createGetDispoBook() {
        return new GetDispoBook();
    }

    /**
     * Create an instance of {@link AddRelationResponse }
     * 
     */
    public AddRelationResponse createAddRelationResponse() {
        return new AddRelationResponse();
    }

    /**
     * Create an instance of {@link AddRelation }
     * 
     */
    public AddRelation createAddRelation() {
        return new AddRelation();
    }

    /**
     * Create an instance of {@link GetAuteur }
     * 
     */
    public GetAuteur createGetAuteur() {
        return new GetAuteur();
    }

    /**
     * Create an instance of {@link GetRelation }
     * 
     */
    public GetRelation createGetRelation() {
        return new GetRelation();
    }

    /**
     * Create an instance of {@link GetBookById }
     * 
     */
    public GetBookById createGetBookById() {
        return new GetBookById();
    }

    /**
     * Create an instance of {@link BookItem }
     * 
     */
    public BookItem createBookItem() {
        return new BookItem();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link Relation }
     * 
     */
    public Relation createRelation() {
        return new Relation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addAuteur")
    public JAXBElement<AddAuteur> createAddAuteur(AddAuteur value) {
        return new JAXBElement<AddAuteur>(_AddAuteur_QNAME, AddAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "readBooksResponse")
    public JAXBElement<ReadBooksResponse> createReadBooksResponse(ReadBooksResponse value) {
        return new JAXBElement<ReadBooksResponse>(_ReadBooksResponse_QNAME, ReadBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAuteurResponse")
    public JAXBElement<GetAuteurResponse> createGetAuteurResponse(GetAuteurResponse value) {
        return new JAXBElement<GetAuteurResponse>(_GetAuteurResponse_QNAME, GetAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getRelationResponse")
    public JAXBElement<GetRelationResponse> createGetRelationResponse(GetRelationResponse value) {
        return new JAXBElement<GetRelationResponse>(_GetRelationResponse_QNAME, GetRelationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AddBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDispoBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetDispoBookResponse")
    public JAXBElement<GetDispoBookResponse> createGetDispoBookResponse(GetDispoBookResponse value) {
        return new JAXBElement<GetDispoBookResponse>(_GetDispoBookResponse_QNAME, GetDispoBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDispoBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetDispoBook")
    public JAXBElement<GetDispoBook> createGetDispoBook(GetDispoBook value) {
        return new JAXBElement<GetDispoBook>(_GetDispoBook_QNAME, GetDispoBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "readBooks")
    public JAXBElement<ReadBooks> createReadBooks(ReadBooks value) {
        return new JAXBElement<ReadBooks>(_ReadBooks_QNAME, ReadBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getBookByIdResponse")
    public JAXBElement<GetBookByIdResponse> createGetBookByIdResponse(GetBookByIdResponse value) {
        return new JAXBElement<GetBookByIdResponse>(_GetBookByIdResponse_QNAME, GetBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AddBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addAuteurResponse")
    public JAXBElement<AddAuteurResponse> createAddAuteurResponse(AddAuteurResponse value) {
        return new JAXBElement<AddAuteurResponse>(_AddAuteurResponse_QNAME, AddAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getBookById")
    public JAXBElement<GetBookById> createGetBookById(GetBookById value) {
        return new JAXBElement<GetBookById>(_GetBookById_QNAME, GetBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addRelation")
    public JAXBElement<AddRelation> createAddRelation(AddRelation value) {
        return new JAXBElement<AddRelation>(_AddRelation_QNAME, AddRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAuteur")
    public JAXBElement<GetAuteur> createGetAuteur(GetAuteur value) {
        return new JAXBElement<GetAuteur>(_GetAuteur_QNAME, GetAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getRelation")
    public JAXBElement<GetRelation> createGetRelation(GetRelation value) {
        return new JAXBElement<GetRelation>(_GetRelation_QNAME, GetRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRelationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addRelationResponse")
    public JAXBElement<AddRelationResponse> createAddRelationResponse(AddRelationResponse value) {
        return new JAXBElement<AddRelationResponse>(_AddRelationResponse_QNAME, AddRelationResponse.class, null, value);
    }

}
