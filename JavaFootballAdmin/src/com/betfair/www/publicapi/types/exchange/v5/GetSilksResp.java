/**
 * GetSilksResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetSilksResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.GetSilksErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetail[] marketDisplayDetails;

    public GetSilksResp() {
    }

    public GetSilksResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.GetSilksErrorEnum errorCode,
           java.lang.String minorErrorCode,
           com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetail[] marketDisplayDetails) {
        super(
            header);
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.marketDisplayDetails = marketDisplayDetails;
    }


    /**
     * Gets the errorCode value for this GetSilksResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetSilksErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetSilksResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetSilksErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this GetSilksResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetSilksResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the marketDisplayDetails value for this GetSilksResp.
     * 
     * @return marketDisplayDetails
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetail[] getMarketDisplayDetails() {
        return marketDisplayDetails;
    }


    /**
     * Sets the marketDisplayDetails value for this GetSilksResp.
     * 
     * @param marketDisplayDetails
     */
    public void setMarketDisplayDetails(com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetail[] marketDisplayDetails) {
        this.marketDisplayDetails = marketDisplayDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSilksResp)) return false;
        GetSilksResp other = (GetSilksResp) obj;
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
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.marketDisplayDetails==null && other.getMarketDisplayDetails()==null) || 
             (this.marketDisplayDetails!=null &&
              java.util.Arrays.equals(this.marketDisplayDetails, other.getMarketDisplayDetails())));
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
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getMarketDisplayDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketDisplayDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketDisplayDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSilksResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketDisplayDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketDisplayDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayDetail"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MarketDisplayDetail"));
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
