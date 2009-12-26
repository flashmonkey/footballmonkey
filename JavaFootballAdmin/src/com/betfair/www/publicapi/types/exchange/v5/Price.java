/**
 * Price.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class Price  implements java.io.Serializable {
    private double amountAvailable;

    private com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType;

    private int depth;

    private double price;

    public Price() {
    }

    public Price(
           double amountAvailable,
           com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType,
           int depth,
           double price) {
           this.amountAvailable = amountAvailable;
           this.betType = betType;
           this.depth = depth;
           this.price = price;
    }


    /**
     * Gets the amountAvailable value for this Price.
     * 
     * @return amountAvailable
     */
    public double getAmountAvailable() {
        return amountAvailable;
    }


    /**
     * Sets the amountAvailable value for this Price.
     * 
     * @param amountAvailable
     */
    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }


    /**
     * Gets the betType value for this Price.
     * 
     * @return betType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum getBetType() {
        return betType;
    }


    /**
     * Sets the betType value for this Price.
     * 
     * @param betType
     */
    public void setBetType(com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType) {
        this.betType = betType;
    }


    /**
     * Gets the depth value for this Price.
     * 
     * @return depth
     */
    public int getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this Price.
     * 
     * @param depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }


    /**
     * Gets the price value for this Price.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Price.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Price)) return false;
        Price other = (Price) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amountAvailable == other.getAmountAvailable() &&
            ((this.betType==null && other.getBetType()==null) || 
             (this.betType!=null &&
              this.betType.equals(other.getBetType()))) &&
            this.depth == other.getDepth() &&
            this.price == other.getPrice();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getAmountAvailable()).hashCode();
        if (getBetType() != null) {
            _hashCode += getBetType().hashCode();
        }
        _hashCode += getDepth();
        _hashCode += new Double(getPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Price.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Price"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
