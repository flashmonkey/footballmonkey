/**
 * WithdrawToPaymentCardResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class WithdrawToPaymentCardResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private double amountWithdrawn;

    private com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum errorCode;

    private double maxAmount;

    private java.lang.String minorErrorCode;

    public WithdrawToPaymentCardResp() {
    }

    public WithdrawToPaymentCardResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           double amountWithdrawn,
           com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum errorCode,
           double maxAmount,
           java.lang.String minorErrorCode) {
        super(
            header);
        this.amountWithdrawn = amountWithdrawn;
        this.errorCode = errorCode;
        this.maxAmount = maxAmount;
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the amountWithdrawn value for this WithdrawToPaymentCardResp.
     * 
     * @return amountWithdrawn
     */
    public double getAmountWithdrawn() {
        return amountWithdrawn;
    }


    /**
     * Sets the amountWithdrawn value for this WithdrawToPaymentCardResp.
     * 
     * @param amountWithdrawn
     */
    public void setAmountWithdrawn(double amountWithdrawn) {
        this.amountWithdrawn = amountWithdrawn;
    }


    /**
     * Gets the errorCode value for this WithdrawToPaymentCardResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this WithdrawToPaymentCardResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the maxAmount value for this WithdrawToPaymentCardResp.
     * 
     * @return maxAmount
     */
    public double getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this WithdrawToPaymentCardResp.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the minorErrorCode value for this WithdrawToPaymentCardResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this WithdrawToPaymentCardResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WithdrawToPaymentCardResp)) return false;
        WithdrawToPaymentCardResp other = (WithdrawToPaymentCardResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.amountWithdrawn == other.getAmountWithdrawn() &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            this.maxAmount == other.getMaxAmount() &&
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
        _hashCode += new Double(getAmountWithdrawn()).hashCode();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        _hashCode += new Double(getMaxAmount()).hashCode();
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WithdrawToPaymentCardResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "WithdrawToPaymentCardResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountWithdrawn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountWithdrawn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentsErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
