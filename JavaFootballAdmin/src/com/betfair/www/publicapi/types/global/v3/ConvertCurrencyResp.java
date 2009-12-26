/**
 * ConvertCurrencyResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ConvertCurrencyResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private double convertedAmount;

    private com.betfair.www.publicapi.types.global.v3.ConvertCurrencyErrorEnum errorCode;

    public ConvertCurrencyResp() {
    }

    public ConvertCurrencyResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           double convertedAmount,
           com.betfair.www.publicapi.types.global.v3.ConvertCurrencyErrorEnum errorCode) {
        super(
            header);
        this.convertedAmount = convertedAmount;
        this.errorCode = errorCode;
    }


    /**
     * Gets the convertedAmount value for this ConvertCurrencyResp.
     * 
     * @return convertedAmount
     */
    public double getConvertedAmount() {
        return convertedAmount;
    }


    /**
     * Sets the convertedAmount value for this ConvertCurrencyResp.
     * 
     * @param convertedAmount
     */
    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }


    /**
     * Gets the errorCode value for this ConvertCurrencyResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.ConvertCurrencyErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ConvertCurrencyResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.ConvertCurrencyErrorEnum errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertCurrencyResp)) return false;
        ConvertCurrencyResp other = (ConvertCurrencyResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.convertedAmount == other.getConvertedAmount() &&
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
        _hashCode += new Double(getConvertedAmount()).hashCode();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertCurrencyResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "convertedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyErrorEnum"));
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
