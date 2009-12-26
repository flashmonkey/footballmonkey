/**
 * UpdateBetsResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class UpdateBetsResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResult[] betResults;

    private com.betfair.www.publicapi.types.exchange.v5.UpdateBetsErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    public UpdateBetsResp() {
    }

    public UpdateBetsResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResult[] betResults,
           com.betfair.www.publicapi.types.exchange.v5.UpdateBetsErrorEnum errorCode,
           java.lang.String minorErrorCode) {
        super(
            header);
        this.betResults = betResults;
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the betResults value for this UpdateBetsResp.
     * 
     * @return betResults
     */
    public com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResult[] getBetResults() {
        return betResults;
    }


    /**
     * Sets the betResults value for this UpdateBetsResp.
     * 
     * @param betResults
     */
    public void setBetResults(com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResult[] betResults) {
        this.betResults = betResults;
    }


    /**
     * Gets the errorCode value for this UpdateBetsResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.UpdateBetsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this UpdateBetsResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.UpdateBetsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this UpdateBetsResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this UpdateBetsResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBetsResp)) return false;
        UpdateBetsResp other = (UpdateBetsResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.betResults==null && other.getBetResults()==null) || 
             (this.betResults!=null &&
              java.util.Arrays.equals(this.betResults, other.getBetResults()))) &&
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
        if (getBetResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBetResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBetResults(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateBetsResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResult"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "UpdateBetsResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsErrorEnum"));
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
