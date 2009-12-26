/**
 * MatchLite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class MatchLite  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus;

    private java.util.Calendar matchedDate;

    private double priceMatched;

    private double sizeMatched;

    private long transactionId;

    public MatchLite() {
    }

    public MatchLite(
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus,
           java.util.Calendar matchedDate,
           double priceMatched,
           double sizeMatched,
           long transactionId) {
           this.betStatus = betStatus;
           this.matchedDate = matchedDate;
           this.priceMatched = priceMatched;
           this.sizeMatched = sizeMatched;
           this.transactionId = transactionId;
    }


    /**
     * Gets the betStatus value for this MatchLite.
     * 
     * @return betStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetStatus() {
        return betStatus;
    }


    /**
     * Sets the betStatus value for this MatchLite.
     * 
     * @param betStatus
     */
    public void setBetStatus(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus) {
        this.betStatus = betStatus;
    }


    /**
     * Gets the matchedDate value for this MatchLite.
     * 
     * @return matchedDate
     */
    public java.util.Calendar getMatchedDate() {
        return matchedDate;
    }


    /**
     * Sets the matchedDate value for this MatchLite.
     * 
     * @param matchedDate
     */
    public void setMatchedDate(java.util.Calendar matchedDate) {
        this.matchedDate = matchedDate;
    }


    /**
     * Gets the priceMatched value for this MatchLite.
     * 
     * @return priceMatched
     */
    public double getPriceMatched() {
        return priceMatched;
    }


    /**
     * Sets the priceMatched value for this MatchLite.
     * 
     * @param priceMatched
     */
    public void setPriceMatched(double priceMatched) {
        this.priceMatched = priceMatched;
    }


    /**
     * Gets the sizeMatched value for this MatchLite.
     * 
     * @return sizeMatched
     */
    public double getSizeMatched() {
        return sizeMatched;
    }


    /**
     * Sets the sizeMatched value for this MatchLite.
     * 
     * @param sizeMatched
     */
    public void setSizeMatched(double sizeMatched) {
        this.sizeMatched = sizeMatched;
    }


    /**
     * Gets the transactionId value for this MatchLite.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this MatchLite.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchLite)) return false;
        MatchLite other = (MatchLite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.betStatus==null && other.getBetStatus()==null) || 
             (this.betStatus!=null &&
              this.betStatus.equals(other.getBetStatus()))) &&
            ((this.matchedDate==null && other.getMatchedDate()==null) || 
             (this.matchedDate!=null &&
              this.matchedDate.equals(other.getMatchedDate()))) &&
            this.priceMatched == other.getPriceMatched() &&
            this.sizeMatched == other.getSizeMatched() &&
            this.transactionId == other.getTransactionId();
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
        if (getBetStatus() != null) {
            _hashCode += getBetStatus().hashCode();
        }
        if (getMatchedDate() != null) {
            _hashCode += getMatchedDate().hashCode();
        }
        _hashCode += new Double(getPriceMatched()).hashCode();
        _hashCode += new Double(getSizeMatched()).hashCode();
        _hashCode += new Long(getTransactionId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchLite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MatchLite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceMatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceMatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeMatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeMatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
