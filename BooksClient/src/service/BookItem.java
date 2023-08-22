
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour bookItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bookItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auteurs" type="{http://service/}auteur" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbDispo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbExamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookItem", propOrder = {
    "auteurs",
    "code",
    "date",
    "nbDispo",
    "nbExamp",
    "titre"
})
public class BookItem {

    @XmlElement(nillable = true)
    protected List<Auteur> auteurs;
    protected int code;
    protected String date;
    protected int nbDispo;
    protected int nbExamp;
    protected String titre;

    /**
     * Gets the value of the auteurs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auteurs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuteurs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Auteur }
     * 
     * 
     */
    public List<Auteur> getAuteurs() {
        if (auteurs == null) {
            auteurs = new ArrayList<Auteur>();
        }
        return this.auteurs;
    }

    /**
     * Obtient la valeur de la propriété code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propriété nbDispo.
     * 
     */
    public int getNbDispo() {
        return nbDispo;
    }

    /**
     * Définit la valeur de la propriété nbDispo.
     * 
     */
    public void setNbDispo(int value) {
        this.nbDispo = value;
    }

    /**
     * Obtient la valeur de la propriété nbExamp.
     * 
     */
    public int getNbExamp() {
        return nbExamp;
    }

    /**
     * Définit la valeur de la propriété nbExamp.
     * 
     */
    public void setNbExamp(int value) {
        this.nbExamp = value;
    }

    /**
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

}
