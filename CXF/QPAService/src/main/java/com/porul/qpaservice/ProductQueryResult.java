
package com.porul.qpaservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="resultItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="productName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="maker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "resultItem"
})
@XmlRootElement(name = "productQueryResult")
public class ProductQueryResult {

    @XmlElement(required = true)
    protected List<ProductQueryResult.ResultItem> resultItem;

    /**
     * Gets the value of the resultItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductQueryResult.ResultItem }
     * 
     * 
     */
    public List<ProductQueryResult.ResultItem> getResultItem() {
        if (resultItem == null) {
            resultItem = new ArrayList<ProductQueryResult.ResultItem>();
        }
        return this.resultItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="productName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="maker" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResultItem {

        @XmlAttribute(name = "productId")
        protected String productId;
        @XmlAttribute(name = "productName")
        protected String productName;
        @XmlAttribute(name = "maker")
        protected String maker;
        @XmlAttribute(name = "price")
        protected Double price;

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductId(String value) {
            this.productId = value;
        }

        /**
         * Gets the value of the productName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Sets the value of the productName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * Gets the value of the maker property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaker() {
            return maker;
        }

        /**
         * Sets the value of the maker property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaker(String value) {
            this.maker = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setPrice(Double value) {
            this.price = value;
        }

    }

}
