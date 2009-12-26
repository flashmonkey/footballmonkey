/**
 * MUBet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class MUBet  implements java.io.Serializable {
    private int asianLineId;

    private long betId;

    private long transactionId;

    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus;

    private com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType;

    private com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType;

    private com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType;

    private int marketId;

    private java.util.Calendar matchedDate;

    private double size;

    private java.lang.Double bspLiability;

    private java.util.Calendar placedDate;

    private double price;

    private int selectionId;

    private double handicap;

    public MUBet() {
    }

    public MUBet(
           int asianLineId,
           long betId,
           long transactionId,
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus,
           com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType,
           com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType,
           com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType,
           int marketId,
           java.util.Calendar matchedDate,
           double size,
           java.lang.Double bspLiability,
           java.util.Calendar placedDate,
           double price,
           int selectionId,
           double handicap) {
           this.asianLineId = asianLineId;
           this.betId = betId;
           this.transactionId = transactionId;
           this.betStatus = betStatus;
           this.betType = betType;
           this.betCategoryType = betCategoryType;
           this.betPersistenceType = betPersistenceType;
           this.marketId = marketId;
           this.matchedDate = matchedDate;
           this.size = size;
           this.bspLiability = bspLiability;
           this.placedDate = placedDate;
           this.price = price;
           this.selectionId = selectionId;
           this.handicap = handicap;
    }


    /**
     * Gets the asianLineId value for this MUBet.
     * 
     * @return asianLineId
     */
    public int getAsianLineId() {
        return asianLineId;
    }


    /**
     * Sets the asianLineId value for this MUBet.
     * 
     * @param asianLineId
     */
    public void setAsianLineId(int asianLineId) {
        this.asianLineId = asianLineId;
    }


    /**
     * Gets the betId value for this MUBet.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this MUBet.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the transactionId value for this MUBet.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this MUBet.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the betStatus value for this MUBet.
     * 
     * @return betStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetStatus() {
        return betStatus;
    }


    /**
     * Sets the betStatus value for this MUBet.
     * 
     * @param betStatus
     */
    public void setBetStatus(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus) {
        this.betStatus = betStatus;
    }


    /**
     * Gets the betType value for this MUBet.
     * 
     * @return betType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum getBetType() {
        return betType;
    }


    /**
     * Sets the betType value for this MUBet.
     * 
     * @param betType
     */
    public void setBetType(com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType) {
        this.betType = betType;
    }


    /**
     * Gets the betCategoryType value for this MUBet.
     * 
     * @return betCategoryType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }


    /**
     * Sets the betCategoryType value for this MUBet.
     * 
     * @param betCategoryType
     */
    public void setBetCategoryType(com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType) {
        this.betCategoryType = betCategoryType;
    }


    /**
     * Gets the betPersistenceType value for this MUBet.
     * 
     * @return betPersistenceType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum getBetPersistenceType() {
        return betPersistenceType;
    }


    /**
     * Sets the betPersistenceType value for this MUBet.
     * 
     * @param betPersistenceType
     */
    public void setBetPersistenceType(com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum betPersistenceType) {
        this.betPersistenceType = betPersistenceType;
    }


    /**
     * Gets the marketId value for this MUBet.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this MUBet.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the matchedDate value for this MUBet.
     * 
     * @return matchedDate
     */
    public java.util.Calendar getMatchedDate() {
        return matchedDate;
    }


    /**
     * Sets the matchedDate value for this MUBet.
     * 
     * @param matchedDate
     */
    public void setMatchedDate(java.util.Calendar matchedDate) {
        this.matchedDate = matchedDate;
    }


    /**
     * Gets the size value for this MUBet.
     * 
     * @return size
     */
    public double getSize() {
        return size;
    }


    /**
     * Sets the size value for this MUBet.
     * 
     * @param size
     */
    public void setSize(double size) {
        this.size = size;
    }


    /**
     * Gets the bspLiability value for this MUBet.
     * 
     * @return bspLiability
     */
    public java.lang.Double getBspLiability() {
        return bspLiability;
    }


    /**
     * Sets the bspLiability value for this MUBet.
     * 
     * @param bspLiability
     */
    public void setBspLiability(java.lang.Double bspLiability) {
        this.bspLiability = bspLiability;
    }


    /**
     * Gets the placedDate value for this MUBet.
     * 
     * @return placedDate
     */
    public java.util.Calendar getPlacedDate() {
        return placedDate;
    }


    /**
     * Sets the placedDate value for this MUBet.
     * 
     * @param placedDate
     */
    public void setPlacedDate(java.util.Calendar placedDate) {
        this.placedDate = placedDate;
    }


    /**
     * Gets the price value for this MUBet.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this MUBet.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the selectionId value for this MUBet.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this MUBet.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }


    /**
     * Gets the handicap value for this MUBet.
     * 
     * @return handicap
     */
    public double getHandicap() {
        return handicap;
    }


    /**
     * Sets the handicap value for this MUBet.
     * 
     * @param handicap
     */
    public void setHandicap(double handicap) {
        this.handicap = handicap;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MUBet)) return false;
        MUBet other = (MUBet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.asianLineId == other.getAsianLineId() &&
            this.betId == other.getBetId() &&
            this.transactionId == other.getTransactionId() &&
            ((this.betStatus==null && other.getBetStatus()==null) || 
             (this.betStatus!=null &&
              this.betStatus.equals(other.getBetStatus()))) &&
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
            ((this.matchedDate==null && other.getMatchedDate()==null) || 
             (this.matchedDate!=null &&
              this.matchedDate.equals(other.getMatchedDate()))) &&
            this.size == other.getSize() &&
            ((this.bspLiability==null && other.getBspLiability()==null) || 
             (this.bspLiability!=null &&
              this.bspLiability.equals(other.getBspLiability()))) &&
            ((this.placedDate==null && other.getPlacedDate()==null) || 
             (this.placedDate!=null &&
              this.placedDate.equals(other.getPlacedDate()))) &&
            this.price == other.getPrice() &&
            this.selectionId == other.getSelectionId() &&
            this.handicap == other.getHandicap();
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
        _hashCode += new Long(getBetId()).hashCode();
        _hashCode += new Long(getTransactionId()).hashCode();
        if (getBetStatus() != null) {
            _hashCode += getBetStatus().hashCode();
        }
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
        if (getMatchedDate() != null) {
            _hashCode += getMatchedDate().hashCode();
        }
        _hashCode += new Double(getSize()).hashCode();
        if (getBspLiability() != null) {
            _hashCode += getBspLiability().hashCode();
        }
        if (getPlacedDate() != null) {
            _hashCode += getPlacedDate().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        _hashCode += getSelectionId();
        _hashCode += new Double(getHandicap()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MUBet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MUBet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asianLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asianLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("betStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum"));
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
        elemField.setFieldName("matchedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bspLiability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bspLiability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("handicap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handicap"));
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
