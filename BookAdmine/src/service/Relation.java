
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour relation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="relation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auteur_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="book_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relation", propOrder = {
    "auteurId",
    "bookId",
    "id"
})
public class Relation {

    @XmlElement(name = "auteur_id")
    protected int auteurId;
    @XmlElement(name = "book_id")
    protected int bookId;
    protected int id;

    /**
     * Obtient la valeur de la propri�t� auteurId.
     * 
     */
    public int getAuteurId() {
        return auteurId;
    }

    /**
     * D�finit la valeur de la propri�t� auteurId.
     * 
     */
    public void setAuteurId(int value) {
        this.auteurId = value;
    }

    /**
     * Obtient la valeur de la propri�t� bookId.
     * 
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * D�finit la valeur de la propri�t� bookId.
     * 
     */
    public void setBookId(int value) {
        this.bookId = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
