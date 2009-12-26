/**
 * MarketDisplayDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class MarketDisplayDetail  implements java.io.Serializable {
    private int marketId;

    private com.betfair.www.publicapi.types.exchange.v5.RacingSilk[] racingSilks;

    private com.betfair.www.publicapi.types.exchange.v5.MarketDisplayErrorEnum errorCode;

    public MarketDisplayDetail() {
    }

    public MarketDisplayDetail(
           int marketId,
           com.betfair.www.publicapi.types.exchange.v5.RacingSilk[] racingSilks,
           com.betfair.www.publicapi.types.exchange.v5.MarketDisplayErrorEnum errorCode) {
           this.marketId = marketId;
           this.racingSilks = racingSilks;
           this.errorCode = errorCode;
    }


    /**
     * Gets the marketId value for this MarketDisplayDetail.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this MarketDisplayDetail.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the racingSilks value for this MarketDisplayDetail.
     * 
     * @return racingSilks
     */
    public com.betfair.www.publicapi.types.exchange.v5.RacingSilk[] getRacingSilks() {
        return racingSilks;
    }


    /**
     * Sets the racingSilks value for this MarketDisplayDetail.
     * 
     * @param racingSilks
     */
    public void setRacingSilks(com.betfair.www.publicapi.types.exchange.v5.RacingSilk[] racingSilks) {
        this.racingSilks = racingSilks;
    }


    /**
     * Gets the errorCode value for this MarketDisplayDetail.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketDisplayErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this MarketDisplayDetail.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.MarketDisplayErrorEnum errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarketDisplayDetail)) return false;
        MarketDisplayDetail other = (MarketDisplayDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.marketId == other.getMarketId() &&
            ((this.racingSilks==null && other.getRacingSilks()==null) || 
             (this.racingSilks!=null &&
              java.util.Arrays.equals(this.racingSilks, other.getRacingSilks()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        _hashCode += getMarketId();
        if (getRacingSilks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRacingSilks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRacingSilks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarketDisplayDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("racingSilks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "racingSilks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RacingSilk"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "RacingSilk"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayErrorEnum"));
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
