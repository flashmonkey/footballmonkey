/**
 * ForgotPasswordResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ForgotPasswordResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.ForgotPasswordErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private java.lang.String question1;

    private java.lang.String question2;

    public ForgotPasswordResp() {
    }

    public ForgotPasswordResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.ForgotPasswordErrorEnum errorCode,
           java.lang.String minorErrorCode,
           java.lang.String question1,
           java.lang.String question2) {
        super(
            header);
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.question1 = question1;
        this.question2 = question2;
    }


    /**
     * Gets the errorCode value for this ForgotPasswordResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.ForgotPasswordErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ForgotPasswordResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.ForgotPasswordErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this ForgotPasswordResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this ForgotPasswordResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the question1 value for this ForgotPasswordResp.
     * 
     * @return question1
     */
    public java.lang.String getQuestion1() {
        return question1;
    }


    /**
     * Sets the question1 value for this ForgotPasswordResp.
     * 
     * @param question1
     */
    public void setQuestion1(java.lang.String question1) {
        this.question1 = question1;
    }


    /**
     * Gets the question2 value for this ForgotPasswordResp.
     * 
     * @return question2
     */
    public java.lang.String getQuestion2() {
        return question2;
    }


    /**
     * Sets the question2 value for this ForgotPasswordResp.
     * 
     * @param question2
     */
    public void setQuestion2(java.lang.String question2) {
        this.question2 = question2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForgotPasswordResp)) return false;
        ForgotPasswordResp other = (ForgotPasswordResp) obj;
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
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.question1==null && other.getQuestion1()==null) || 
             (this.question1!=null &&
              this.question1.equals(other.getQuestion1()))) &&
            ((this.question2==null && other.getQuestion2()==null) || 
             (this.question2!=null &&
              this.question2.equals(other.getQuestion2())));
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
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getQuestion1() != null) {
            _hashCode += getQuestion1().hashCode();
        }
        if (getQuestion2() != null) {
            _hashCode += getQuestion2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForgotPasswordResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "question1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "question2"));
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
