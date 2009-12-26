/**
 * PlaceBetsResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class PlaceBetsResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResult[] betResults;

    private com.betfair.www.publicapi.types.exchange.v5.PlaceBetsErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    public PlaceBetsResp() {
    }

    public PlaceBetsResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResult[] betResults,
           com.betfair.www.publicapi.types.exchange.v5.PlaceBetsErrorEnum errorCode,
           java.lang.String minorErrorCode) {
        super(
            header);
        this.betResults = betResults;
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the betResults value for this PlaceBetsResp.
     * 
     * @return betResults
     */
    public com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResult[] getBetResults() {
        return betResults;
    }


    /**
     * Sets the betResults value for this PlaceBetsResp.
     * 
     * @param betResults
     */
    public void setBetResults(com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResult[] betResults) {
        this.betResults = betResults;
    }


    /**
     * Gets the errorCode value for this PlaceBetsResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.PlaceBetsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this PlaceBetsResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.PlaceBetsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this PlaceBetsResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this PlaceBetsResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlaceBetsResp)) return false;
        PlaceBetsResp other = (PlaceBetsResp) obj;
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
        new org.apache.axis.description.TypeDesc(PlaceBetsResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResult"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "PlaceBetsResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsErrorEnum"));
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
