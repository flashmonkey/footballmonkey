/**
 * TransferFundsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class TransferFundsReq  extends com.betfair.www.publicapi.types.global.v3.APIRequest  implements java.io.Serializable {
    private int sourceWalletId;

    private int targetWalletId;

    private double amount;

    public TransferFundsReq() {
    }

    public TransferFundsReq(
           com.betfair.www.publicapi.types.global.v3.APIRequestHeader header,
           int sourceWalletId,
           int targetWalletId,
           double amount) {
        super(
            header);
        this.sourceWalletId = sourceWalletId;
        this.targetWalletId = targetWalletId;
        this.amount = amount;
    }


    /**
     * Gets the sourceWalletId value for this TransferFundsReq.
     * 
     * @return sourceWalletId
     */
    public int getSourceWalletId() {
        return sourceWalletId;
    }


    /**
     * Sets the sourceWalletId value for this TransferFundsReq.
     * 
     * @param sourceWalletId
     */
    public void setSourceWalletId(int sourceWalletId) {
        this.sourceWalletId = sourceWalletId;
    }


    /**
     * Gets the targetWalletId value for this TransferFundsReq.
     * 
     * @return targetWalletId
     */
    public int getTargetWalletId() {
        return targetWalletId;
    }


    /**
     * Sets the targetWalletId value for this TransferFundsReq.
     * 
     * @param targetWalletId
     */
    public void setTargetWalletId(int targetWalletId) {
        this.targetWalletId = targetWalletId;
    }


    /**
     * Gets the amount value for this TransferFundsReq.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferFundsReq.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferFundsReq)) return false;
        TransferFundsReq other = (TransferFundsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.sourceWalletId == other.getSourceWalletId() &&
            this.targetWalletId == other.getTargetWalletId() &&
            this.amount == other.getAmount();
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
        _hashCode += getSourceWalletId();
        _hashCode += getTargetWalletId();
        _hashCode += new Double(getAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferFundsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TransferFundsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceWalletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceWalletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWalletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetWalletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
