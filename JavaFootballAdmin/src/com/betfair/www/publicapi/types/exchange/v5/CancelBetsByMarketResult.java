/**
 * CancelBetsByMarketResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CancelBetsByMarketResult  implements java.io.Serializable {
    private int marketId;

    private com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResultEnum resultCode;

    public CancelBetsByMarketResult() {
    }

    public CancelBetsByMarketResult(
           int marketId,
           com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResultEnum resultCode) {
           this.marketId = marketId;
           this.resultCode = resultCode;
    }


    /**
     * Gets the marketId value for this CancelBetsByMarketResult.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this CancelBetsByMarketResult.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the resultCode value for this CancelBetsByMarketResult.
     * 
     * @return resultCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResultEnum getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this CancelBetsByMarketResult.
     * 
     * @param resultCode
     */
    public void setResultCode(com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResultEnum resultCode) {
        this.resultCode = resultCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelBetsByMarketResult)) return false;
        CancelBetsByMarketResult other = (CancelBetsByMarketResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.marketId == other.getMarketId() &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelBetsByMarketResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResultEnum"));
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
