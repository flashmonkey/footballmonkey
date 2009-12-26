/**
 * GetBetLiteResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetBetLiteResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.BetLite betLite;

    private com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum errorCode;

    public GetBetLiteResp() {
    }

    public GetBetLiteResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.BetLite betLite,
           com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum errorCode) {
        super(
            header);
        this.betLite = betLite;
        this.errorCode = errorCode;
    }


    /**
     * Gets the betLite value for this GetBetLiteResp.
     * 
     * @return betLite
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetLite getBetLite() {
        return betLite;
    }


    /**
     * Sets the betLite value for this GetBetLiteResp.
     * 
     * @param betLite
     */
    public void setBetLite(com.betfair.www.publicapi.types.exchange.v5.BetLite betLite) {
        this.betLite = betLite;
    }


    /**
     * Gets the errorCode value for this GetBetLiteResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetBetLiteResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBetLiteResp)) return false;
        GetBetLiteResp other = (GetBetLiteResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.betLite==null && other.getBetLite()==null) || 
             (this.betLite!=null &&
              this.betLite.equals(other.getBetLite()))) &&
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
        int _hashCode = super.hashCode();
        if (getBetLite() != null) {
            _hashCode += getBetLite().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBetLiteResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetLiteResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betLite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betLite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetLite"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetErrorEnum"));
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
