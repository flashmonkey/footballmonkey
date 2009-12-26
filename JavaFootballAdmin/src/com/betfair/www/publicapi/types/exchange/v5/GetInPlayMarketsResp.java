/**
 * GetInPlayMarketsResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetInPlayMarketsResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsErrorEnum errorCode;

    private java.lang.String marketData;

    private java.lang.String minorErrorCode;

    public GetInPlayMarketsResp() {
    }

    public GetInPlayMarketsResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsErrorEnum errorCode,
           java.lang.String marketData,
           java.lang.String minorErrorCode) {
        super(
            header);
        this.errorCode = errorCode;
        this.marketData = marketData;
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the errorCode value for this GetInPlayMarketsResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetInPlayMarketsResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the marketData value for this GetInPlayMarketsResp.
     * 
     * @return marketData
     */
    public java.lang.String getMarketData() {
        return marketData;
    }


    /**
     * Sets the marketData value for this GetInPlayMarketsResp.
     * 
     * @param marketData
     */
    public void setMarketData(java.lang.String marketData) {
        this.marketData = marketData;
    }


    /**
     * Gets the minorErrorCode value for this GetInPlayMarketsResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetInPlayMarketsResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInPlayMarketsResp)) return false;
        GetInPlayMarketsResp other = (GetInPlayMarketsResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.marketData==null && other.getMarketData()==null) || 
             (this.marketData!=null &&
              this.marketData.equals(other.getMarketData()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMarketData() != null) {
            _hashCode += getMarketData().hashCode();
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInPlayMarketsResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetInPlayMarketsResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetInPlayMarketsErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
