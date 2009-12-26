/**
 * PlaceBets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class PlaceBets  implements java.io.Serializable {
    private int asianLineId;

    private com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType;

    private com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType;

    private com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType;

    private int marketId;

    private double price;

    private int selectionId;

    private java.lang.Double size;

    private java.lang.Double bspLiability;

    public PlaceBets() {
    }

    public PlaceBets(
           int asianLineId,
           com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType,
           com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType,
           com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType,
           int marketId,
           double price,
           int selectionId,
           java.lang.Double size,
           java.lang.Double bspLiability) {
           this.asianLineId = asianLineId;
           this.betType = betType;
           this.betCategoryType = betCategoryType;
           this.betPersistenceType = betPersistenceType;
           this.marketId = marketId;
           this.price = price;
           this.selectionId = selectionId;
           this.size = size;
           this.bspLiability = bspLiability;
    }


    /**
     * Gets the asianLineId value for this PlaceBets.
     * 
     * @return asianLineId
     */
    public int getAsianLineId() {
        return asianLineId;
    }


    /**
     * Sets the asianLineId value for this PlaceBets.
     * 
     * @param asianLineId
     */
    public void setAsianLineId(int asianLineId) {
        this.asianLineId = asianLineId;
    }


    /**
     * Gets the betType value for this PlaceBets.
     * 
     * @return betType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum getBetType() {
        return betType;
    }


    /**
     * Sets the betType value for this PlaceBets.
     * 
     * @param betType
     */
    public void setBetType(com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType) {
        this.betType = betType;
    }


    /**
     * Gets the betCategoryType value for this PlaceBets.
     * 
     * @return betCategoryType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }


    /**
     * Sets the betCategoryType value for this PlaceBets.
     * 
     * @param betCategoryType
     */
    public void setBetCategoryType(com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType) {
        this.betCategoryType = betCategoryType;
    }


    /**
     * Gets the betPersistenceType value for this PlaceBets.
     * 
     * @return betPersistenceType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum getBetPersistenceType() {
        return betPersistenceType;
    }


    /**
     * Sets the betPersistenceType value for this PlaceBets.
     * 
     * @param betPersistenceType
     */
    public void setBetPersistenceType(com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType) {
        this.betPersistenceType = betPersistenceType;
    }


    /**
     * Gets the marketId value for this PlaceBets.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this PlaceBets.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the price value for this PlaceBets.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PlaceBets.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the selectionId value for this PlaceBets.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this PlaceBets.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }


    /**
     * Gets the size value for this PlaceBets.
     * 
     * @return size
     */
    public java.lang.Double getSize() {
        return size;
    }


    /**
     * Sets the size value for this PlaceBets.
     * 
     * @param size
     */
    public void setSize(java.lang.Double size) {
        this.size = size;
    }


    /**
     * Gets the bspLiability value for this PlaceBets.
     * 
     * @return bspLiability
     */
    public java.lang.Double getBspLiability() {
        return bspLiability;
    }


    /**
     * Sets the bspLiability value for this PlaceBets.
     * 
     * @param bspLiability
     */
    public void setBspLiability(java.lang.Double bspLiability) {
        this.bspLiability = bspLiability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceBets)) return false;
        PlaceBets other = (PlaceBets) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.asianLineId == other.getAsianLineId() &&
            ((this.betType==null && other.getBetType()==null) || 
             (this.betType!=null &&
              this.betType.equals(other.getBetType()))) &&
            ((this.betCategoryType==null && other.getBetCategoryType()==null) || 
             (this.betCategoryType!=null &&
              this.betCategoryType.equals(other.getBetCategoryType()))) &&
            ((this.betPersistenceType==null && other.getBetPersistenceType()==null) || 
             (this.betPersistenceType!=null &&
              this.betPersistenceType.equals(other.getBetPersistenceType()))) &&
            this.marketId == other.getMarketId() &&
            this.price == other.getPrice() &&
            this.selectionId == other.getSelectionId() &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.bspLiability==null && other.getBspLiability()==null) || 
             (this.bspLiability!=null &&
              this.bspLiability.equals(other.getBspLiability())));
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
        _hashCode += getAsianLineId();
        if (getBetType() != null) {
            _hashCode += getBetType().hashCode();
        }
        if (getBetCategoryType() != null) {
            _hashCode += getBetCategoryType().hashCode();
        }
        if (getBetPersistenceType() != null) {
            _hashCode += getBetPersistenceType().hashCode();
        }
        _hashCode += getMarketId();
        _hashCode += new Double(getPrice()).hashCode();
        _hashCode += getSelectionId();
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getBspLiability() != null) {
            _hashCode += getBspLiability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlaceBets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asianLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asianLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetCategoryTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betPersistenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betPersistenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetPersistenceTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bspLiability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bspLiability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
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
