/**
 * DepositFromPaymentCardResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;


/**
 * Result of a DepositFromPaymentCardReq.  If errorCode is set to
 * CARD_AMOUNT_OUTSIDE_LIMIT then minAmount and maxAmount 
 * 			  will be set.  If errorCode is set to DEPOSIT_LIMIT_EXCEEDED then
 * maxAmount will be set.
 */
public class DepositFromPaymentCardResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum errorCode;

    private double fee;

    private double maxAmount;

    private double minAmount;

    private java.lang.String minorErrorCode;

    private double netAmount;

    private java.lang.String transactionId;

    public DepositFromPaymentCardResp() {
    }

    public DepositFromPaymentCardResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum errorCode,
           double fee,
           double maxAmount,
           double minAmount,
           java.lang.String minorErrorCode,
           double netAmount,
           java.lang.String transactionId) {
        super(
            header);
        this.errorCode = errorCode;
        this.fee = fee;
        this.maxAmount = maxAmount;
        this.minAmount = minAmount;
        this.minorErrorCode = minorErrorCode;
        this.netAmount = netAmount;
        this.transactionId = transactionId;
    }


    /**
     * Gets the errorCode value for this DepositFromPaymentCardResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this DepositFromPaymentCardResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the fee value for this DepositFromPaymentCardResp.
     * 
     * @return fee
     */
    public double getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this DepositFromPaymentCardResp.
     * 
     * @param fee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }


    /**
     * Gets the maxAmount value for this DepositFromPaymentCardResp.
     * 
     * @return maxAmount
     */
    public double getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this DepositFromPaymentCardResp.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the minAmount value for this DepositFromPaymentCardResp.
     * 
     * @return minAmount
     */
    public double getMinAmount() {
        return minAmount;
    }


    /**
     * Sets the minAmount value for this DepositFromPaymentCardResp.
     * 
     * @param minAmount
     */
    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }


    /**
     * Gets the minorErrorCode value for this DepositFromPaymentCardResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this DepositFromPaymentCardResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the netAmount value for this DepositFromPaymentCardResp.
     * 
     * @return netAmount
     */
    public double getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this DepositFromPaymentCardResp.
     * 
     * @param netAmount
     */
    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the transactionId value for this DepositFromPaymentCardResp.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DepositFromPaymentCardResp.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositFromPaymentCardResp)) return false;
        DepositFromPaymentCardResp other = (DepositFromPaymentCardResp) obj;
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
            this.fee == other.getFee() &&
            this.maxAmount == other.getMaxAmount() &&
            this.minAmount == other.getMinAmount() &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            this.netAmount == other.getNetAmount() &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        _hashCode += new Double(getFee()).hashCode();
        _hashCode += new Double(getMaxAmount()).hashCode();
        _hashCode += new Double(getMinAmount()).hashCode();
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        _hashCode += new Double(getNetAmount()).hashCode();
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositFromPaymentCardResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DepositFromPaymentCardResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentsErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
