/**
 * ConvertCurrencyReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ConvertCurrencyReq  extends com.betfair.www.publicapi.types.global.v3.APIRequest  implements java.io.Serializable {
    private double amount;

    private java.lang.String fromCurrency;

    private java.lang.String toCurrency;

    public ConvertCurrencyReq() {
    }

    public ConvertCurrencyReq(
           com.betfair.www.publicapi.types.global.v3.APIRequestHeader header,
           double amount,
           java.lang.String fromCurrency,
           java.lang.String toCurrency) {
        super(
            header);
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }


    /**
     * Gets the amount value for this ConvertCurrencyReq.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ConvertCurrencyReq.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the fromCurrency value for this ConvertCurrencyReq.
     * 
     * @return fromCurrency
     */
    public java.lang.String getFromCurrency() {
        return fromCurrency;
    }


    /**
     * Sets the fromCurrency value for this ConvertCurrencyReq.
     * 
     * @param fromCurrency
     */
    public void setFromCurrency(java.lang.String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }


    /**
     * Gets the toCurrency value for this ConvertCurrencyReq.
     * 
     * @return toCurrency
     */
    public java.lang.String getToCurrency() {
        return toCurrency;
    }


    /**
     * Sets the toCurrency value for this ConvertCurrencyReq.
     * 
     * @param toCurrency
     */
    public void setToCurrency(java.lang.String toCurrency) {
        this.toCurrency = toCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertCurrencyReq)) return false;
        ConvertCurrencyReq other = (ConvertCurrencyReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.amount == other.getAmount() &&
            ((this.fromCurrency==null && other.getFromCurrency()==null) || 
             (this.fromCurrency!=null &&
              this.fromCurrency.equals(other.getFromCurrency()))) &&
            ((this.toCurrency==null && other.getToCurrency()==null) || 
             (this.toCurrency!=null &&
              this.toCurrency.equals(other.getToCurrency())));
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
        _hashCode += new Double(getAmount()).hashCode();
        if (getFromCurrency() != null) {
            _hashCode += getFromCurrency().hashCode();
        }
        if (getToCurrency() != null) {
            _hashCode += getToCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertCurrencyReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCurrency"));
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
