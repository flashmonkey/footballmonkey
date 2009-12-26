/**
 * UpdateBets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class UpdateBets  implements java.io.Serializable {
    private long betId;

    private java.lang.Double newPrice;

    private double newSize;

    private java.lang.Double oldPrice;

    private double oldSize;

    private com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum oldBetPersistenceType;

    private com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum newBetPersistenceType;

    public UpdateBets() {
    }

    public UpdateBets(
           long betId,
           java.lang.Double newPrice,
           double newSize,
           java.lang.Double oldPrice,
           double oldSize,
           com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum oldBetPersistenceType,
           com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum newBetPersistenceType) {
           this.betId = betId;
           this.newPrice = newPrice;
           this.newSize = newSize;
           this.oldPrice = oldPrice;
           this.oldSize = oldSize;
           this.oldBetPersistenceType = oldBetPersistenceType;
           this.newBetPersistenceType = newBetPersistenceType;
    }


    /**
     * Gets the betId value for this UpdateBets.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this UpdateBets.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the newPrice value for this UpdateBets.
     * 
     * @return newPrice
     */
    public java.lang.Double getNewPrice() {
        return newPrice;
    }


    /**
     * Sets the newPrice value for this UpdateBets.
     * 
     * @param newPrice
     */
    public void setNewPrice(java.lang.Double newPrice) {
        this.newPrice = newPrice;
    }


    /**
     * Gets the newSize value for this UpdateBets.
     * 
     * @return newSize
     */
    public double getNewSize() {
        return newSize;
    }


    /**
     * Sets the newSize value for this UpdateBets.
     * 
     * @param newSize
     */
    public void setNewSize(double newSize) {
        this.newSize = newSize;
    }


    /**
     * Gets the oldPrice value for this UpdateBets.
     * 
     * @return oldPrice
     */
    public java.lang.Double getOldPrice() {
        return oldPrice;
    }


    /**
     * Sets the oldPrice value for this UpdateBets.
     * 
     * @param oldPrice
     */
    public void setOldPrice(java.lang.Double oldPrice) {
        this.oldPrice = oldPrice;
    }


    /**
     * Gets the oldSize value for this UpdateBets.
     * 
     * @return oldSize
     */
    public double getOldSize() {
        return oldSize;
    }


    /**
     * Sets the oldSize value for this UpdateBets.
     * 
     * @param oldSize
     */
    public void setOldSize(double oldSize) {
        this.oldSize = oldSize;
    }


    /**
     * Gets the oldBetPersistenceType value for this UpdateBets.
     * 
     * @return oldBetPersistenceType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum getOldBetPersistenceType() {
        return oldBetPersistenceType;
    }


    /**
     * Sets the oldBetPersistenceType value for this UpdateBets.
     * 
     * @param oldBetPersistenceType
     */
    public void setOldBetPersistenceType(com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum oldBetPersistenceType) {
        this.oldBetPersistenceType = oldBetPersistenceType;
    }


    /**
     * Gets the newBetPersistenceType value for this UpdateBets.
     * 
     * @return newBetPersistenceType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum getNewBetPersistenceType() {
        return newBetPersistenceType;
    }


    /**
     * Sets the newBetPersistenceType value for this UpdateBets.
     * 
     * @param newBetPersistenceType
     */
    public void setNewBetPersistenceType(com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum newBetPersistenceType) {
        this.newBetPersistenceType = newBetPersistenceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBets)) return false;
        UpdateBets other = (UpdateBets) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.betId == other.getBetId() &&
            ((this.newPrice==null && other.getNewPrice()==null) || 
             (this.newPrice!=null &&
              this.newPrice.equals(other.getNewPrice()))) &&
            this.newSize == other.getNewSize() &&
            ((this.oldPrice==null && other.getOldPrice()==null) || 
             (this.oldPrice!=null &&
              this.oldPrice.equals(other.getOldPrice()))) &&
            this.oldSize == other.getOldSize() &&
            ((this.oldBetPersistenceType==null && other.getOldBetPersistenceType()==null) || 
             (this.oldBetPersistenceType!=null &&
              this.oldBetPersistenceType.equals(other.getOldBetPersistenceType()))) &&
            ((this.newBetPersistenceType==null && other.getNewBetPersistenceType()==null) || 
             (this.newBetPersistenceType!=null &&
              this.newBetPersistenceType.equals(other.getNewBetPersistenceType())));
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
        _hashCode += new Long(getBetId()).hashCode();
        if (getNewPrice() != null) {
            _hashCode += getNewPrice().hashCode();
        }
        _hashCode += new Double(getNewSize()).hashCode();
        if (getOldPrice() != null) {
            _hashCode += getOldPrice().hashCode();
        }
        _hashCode += new Double(getOldSize()).hashCode();
        if (getOldBetPersistenceType() != null) {
            _hashCode += getOldBetPersistenceType().hashCode();
        }
        if (getNewBetPersistenceType() != null) {
            _hashCode += getNewBetPersistenceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldBetPersistenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldBetPersistenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetPersistenceTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBetPersistenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newBetPersistenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetPersistenceTypeEnum"));
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
