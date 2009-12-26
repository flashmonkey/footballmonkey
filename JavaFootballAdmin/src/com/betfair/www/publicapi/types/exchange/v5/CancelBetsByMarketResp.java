/**
 * CancelBetsByMarketResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CancelBetsByMarketResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResult[] results;

    private com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    public CancelBetsByMarketResp() {
    }

    public CancelBetsByMarketResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResult[] results,
           com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketErrorEnum errorCode,
           java.lang.String minorErrorCode) {
        super(
            header);
        this.results = results;
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the results value for this CancelBetsByMarketResp.
     * 
     * @return results
     */
    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResult[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this CancelBetsByMarketResp.
     * 
     * @param results
     */
    public void setResults(com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResult[] results) {
        this.results = results;
    }


    /**
     * Gets the errorCode value for this CancelBetsByMarketResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this CancelBetsByMarketResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this CancelBetsByMarketResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this CancelBetsByMarketResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelBetsByMarketResp)) return false;
        CancelBetsByMarketResp other = (CancelBetsByMarketResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
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
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelBetsByMarketResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResult"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CancelBetsByMarketResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketErrorEnum"));
        elemField.setNillable(false);
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
