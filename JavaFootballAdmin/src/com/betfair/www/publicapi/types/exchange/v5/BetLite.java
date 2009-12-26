/**
 * BetLite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class BetLite  implements java.io.Serializable {
    private long betId;

    private int marketId;

    private double matchedSize;

    private double remainingSize;

    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus;

    private com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType;

    private com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType;

    private java.lang.Double bspLiability;

    public BetLite() {
    }

    public BetLite(
           long betId,
           int marketId,
           double matchedSize,
           double remainingSize,
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus,
           com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType,
           com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType,
           java.lang.Double bspLiability) {
           this.betId = betId;
           this.marketId = marketId;
           this.matchedSize = matchedSize;
           this.remainingSize = remainingSize;
           this.betStatus = betStatus;
           this.betCategoryType = betCategoryType;
           this.betPersistenceType = betPersistenceType;
           this.bspLiability = bspLiability;
    }


    /**
     * Gets the betId value for this BetLite.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this BetLite.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the marketId value for this BetLite.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this BetLite.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the matchedSize value for this BetLite.
     * 
     * @return matchedSize
     */
    public double getMatchedSize() {
        return matchedSize;
    }


    /**
     * Sets the matchedSize value for this BetLite.
     * 
     * @param matchedSize
     */
    public void setMatchedSize(double matchedSize) {
        this.matchedSize = matchedSize;
    }


    /**
     * Gets the remainingSize value for this BetLite.
     * 
     * @return remainingSize
     */
    public double getRemainingSize() {
        return remainingSize;
    }


    /**
     * Sets the remainingSize value for this BetLite.
     * 
     * @param remainingSize
     */
    public void setRemainingSize(double remainingSize) {
        this.remainingSize = remainingSize;
    }


    /**
     * Gets the betStatus value for this BetLite.
     * 
     * @return betStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetStatus() {
        return betStatus;
    }


    /**
     * Sets the betStatus value for this BetLite.
     * 
     * @param betStatus
     */
    public void setBetStatus(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus) {
        this.betStatus = betStatus;
    }


    /**
     * Gets the betCategoryType value for this BetLite.
     * 
     * @return betCategoryType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }


    /**
     * Sets the betCategoryType value for this BetLite.
     * 
     * @param betCategoryType
     */
    public void setBetCategoryType(com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType) {
        this.betCategoryType = betCategoryType;
    }


    /**
     * Gets the betPersistenceType value for this BetLite.
     * 
     * @return betPersistenceType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum getBetPersistenceType() {
        return betPersistenceType;
    }


    /**
     * Sets the betPersistenceType value for this BetLite.
     * 
     * @param betPersistenceType
     */
    public void setBetPersistenceType(com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType) {
        this.betPersistenceType = betPersistenceType;
    }


    /**
     * Gets the bspLiability value for this BetLite.
     * 
     * @return bspLiability
     */
    public java.lang.Double getBspLiability() {
        return bspLiability;
    }


    /**
     * Sets the bspLiability value for this BetLite.
     * 
     * @param bspLiability
     */
    public void setBspLiability(java.lang.Double bspLiability) {
        this.bspLiability = bspLiability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BetLite)) return false;
        BetLite other = (BetLite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.betId == other.getBetId() &&
            this.marketId == other.getMarketId() &&
            this.matchedSize == other.getMatchedSize() &&
            this.remainingSize == other.getRemainingSize() &&
            ((this.betStatus==null && other.getBetStatus()==null) || 
             (this.betStatus!=null &&
              this.betStatus.equals(other.getBetStatus()))) &&
            ((this.betCategoryType==null && other.getBetCategoryType()==null) || 
             (this.betCategoryType!=null &&
              this.betCategoryType.equals(other.getBetCategoryType()))) &&
            ((this.betPersistenceType==null && other.getBetPersistenceType()==null) || 
             (this.betPersistenceType!=null &&
              this.betPersistenceType.equals(other.getBetPersistenceType()))) &&
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
        _hashCode += new Long(getBetId()).hashCode();
        _hashCode += getMarketId();
        _hashCode += new Double(getMatchedSize()).hashCode();
        _hashCode += new Double(getRemainingSize()).hashCode();
        if (getBetStatus() != null) {
            _hashCode += getBetStatus().hashCode();
        }
        if (getBetCategoryType() != null) {
            _hashCode += getBetCategoryType().hashCode();
        }
        if (getBetPersistenceType() != null) {
            _hashCode += getBetPersistenceType().hashCode();
        }
        if (getBspLiability() != null) {
            _hashCode += getBspLiability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BetLite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetLite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchedSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainingSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum"));
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
