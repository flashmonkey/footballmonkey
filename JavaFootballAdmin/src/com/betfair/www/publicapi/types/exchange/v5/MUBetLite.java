/**
 * MUBetLite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class MUBetLite  implements java.io.Serializable {
    private long betId;

    private long transactionId;

    private int marketId;

    private double size;

    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus;

    private com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType;

    private com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType;

    private java.lang.Double bspLiability;

    public MUBetLite() {
    }

    public MUBetLite(
           long betId,
           long transactionId,
           int marketId,
           double size,
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus,
           com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType,
           com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType,
           java.lang.Double bspLiability) {
           this.betId = betId;
           this.transactionId = transactionId;
           this.marketId = marketId;
           this.size = size;
           this.betStatus = betStatus;
           this.betCategoryType = betCategoryType;
           this.betPersistenceType = betPersistenceType;
           this.bspLiability = bspLiability;
    }


    /**
     * Gets the betId value for this MUBetLite.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this MUBetLite.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the transactionId value for this MUBetLite.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this MUBetLite.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the marketId value for this MUBetLite.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this MUBetLite.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the size value for this MUBetLite.
     * 
     * @return size
     */
    public double getSize() {
        return size;
    }


    /**
     * Sets the size value for this MUBetLite.
     * 
     * @param size
     */
    public void setSize(double size) {
        this.size = size;
    }


    /**
     * Gets the betStatus value for this MUBetLite.
     * 
     * @return betStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetStatus() {
        return betStatus;
    }


    /**
     * Sets the betStatus value for this MUBetLite.
     * 
     * @param betStatus
     */
    public void setBetStatus(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus) {
        this.betStatus = betStatus;
    }


    /**
     * Gets the betCategoryType value for this MUBetLite.
     * 
     * @return betCategoryType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }


    /**
     * Sets the betCategoryType value for this MUBetLite.
     * 
     * @param betCategoryType
     */
    public void setBetCategoryType(com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType) {
        this.betCategoryType = betCategoryType;
    }


    /**
     * Gets the betPersistenceType value for this MUBetLite.
     * 
     * @return betPersistenceType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum getBetPersistenceType() {
        return betPersistenceType;
    }


    /**
     * Sets the betPersistenceType value for this MUBetLite.
     * 
     * @param betPersistenceType
     */
    public void setBetPersistenceType(com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType) {
        this.betPersistenceType = betPersistenceType;
    }


    /**
     * Gets the bspLiability value for this MUBetLite.
     * 
     * @return bspLiability
     */
    public java.lang.Double getBspLiability() {
        return bspLiability;
    }


    /**
     * Sets the bspLiability value for this MUBetLite.
     * 
     * @param bspLiability
     */
    public void setBspLiability(java.lang.Double bspLiability) {
        this.bspLiability = bspLiability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MUBetLite)) return false;
        MUBetLite other = (MUBetLite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.betId == other.getBetId() &&
            this.transactionId == other.getTransactionId() &&
            this.marketId == other.getMarketId() &&
            this.size == other.getSize() &&
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
        _hashCode += new Long(getTransactionId()).hashCode();
        _hashCode += getMarketId();
        _hashCode += new Double(getSize()).hashCode();
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
        new org.apache.axis.description.TypeDesc(MUBetLite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MUBetLite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
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
