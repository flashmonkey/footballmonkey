/**
 * DepositFromPaymentCardReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class DepositFromPaymentCardReq  extends com.betfair.www.publicapi.types.global.v3.APIRequest  implements java.io.Serializable {
    private double amount;

    private java.lang.String cardIdentifier;

    private java.lang.String cv2;

    private java.lang.String password;

    public DepositFromPaymentCardReq() {
    }

    public DepositFromPaymentCardReq(
           com.betfair.www.publicapi.types.global.v3.APIRequestHeader header,
           double amount,
           java.lang.String cardIdentifier,
           java.lang.String cv2,
           java.lang.String password) {
        super(
            header);
        this.amount = amount;
        this.cardIdentifier = cardIdentifier;
        this.cv2 = cv2;
        this.password = password;
    }


    /**
     * Gets the amount value for this DepositFromPaymentCardReq.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DepositFromPaymentCardReq.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardIdentifier value for this DepositFromPaymentCardReq.
     * 
     * @return cardIdentifier
     */
    public java.lang.String getCardIdentifier() {
        return cardIdentifier;
    }


    /**
     * Sets the cardIdentifier value for this DepositFromPaymentCardReq.
     * 
     * @param cardIdentifier
     */
    public void setCardIdentifier(java.lang.String cardIdentifier) {
        this.cardIdentifier = cardIdentifier;
    }


    /**
     * Gets the cv2 value for this DepositFromPaymentCardReq.
     * 
     * @return cv2
     */
    public java.lang.String getCv2() {
        return cv2;
    }


    /**
     * Sets the cv2 value for this DepositFromPaymentCardReq.
     * 
     * @param cv2
     */
    public void setCv2(java.lang.String cv2) {
        this.cv2 = cv2;
    }


    /**
     * Gets the password value for this DepositFromPaymentCardReq.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this DepositFromPaymentCardReq.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositFromPaymentCardReq)) return false;
        DepositFromPaymentCardReq other = (DepositFromPaymentCardReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.amount == other.getAmount() &&
            ((this.cardIdentifier==null && other.getCardIdentifier()==null) || 
             (this.cardIdentifier!=null &&
              this.cardIdentifier.equals(other.getCardIdentifier()))) &&
            ((this.cv2==null && other.getCv2()==null) || 
             (this.cv2!=null &&
              this.cv2.equals(other.getCv2()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getCardIdentifier() != null) {
            _hashCode += getCardIdentifier().hashCode();
        }
        if (getCv2() != null) {
            _hashCode += getCv2().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositFromPaymentCardReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DepositFromPaymentCardReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cv2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
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
