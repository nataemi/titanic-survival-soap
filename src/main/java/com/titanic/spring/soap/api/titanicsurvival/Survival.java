//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.27 at 04:14:16 PM CET 
//


package com.titanic.spring.soap.api.titanicsurvival;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wouldSurvive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CauseOfDeath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wouldSurvive",
    "causeOfDeath"
})
@XmlRootElement(name = "Survival")
public class Survival {

    protected boolean wouldSurvive;
    @XmlElement(name = "CauseOfDeath", required = true)
    protected List<String> causeOfDeath;

    /**
     * Gets the value of the wouldSurvive property.
     * 
     */
    public boolean isWouldSurvive() {
        return wouldSurvive;
    }

    /**
     * Sets the value of the wouldSurvive property.
     * 
     */
    public void setWouldSurvive(boolean value) {
        this.wouldSurvive = value;
    }

    /**
     * Gets the value of the causeOfDeath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causeOfDeath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCauseOfDeath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCauseOfDeath() {
        if (causeOfDeath == null) {
            causeOfDeath = new ArrayList<String>();
        }
        return this.causeOfDeath;
    }

}
