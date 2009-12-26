/**
 * CreateAccountResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class CreateAccountResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private int accountId;

    private com.betfair.www.publicapi.types.global.v3.AccountStatusEnum accountStatus;

    private com.betfair.www.publicapi.types.global.v3.CreateAccountErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private java.lang.String tan;

    private int userId;

    private com.betfair.www.publicapi.types.global.v3.ValidationErrorsEnum[] validationErrors;

    public CreateAccountResp() {
    }

    public CreateAccountResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           int accountId,
           com.betfair.www.publicapi.types.global.v3.AccountStatusEnum accountStatus,
           com.betfair.www.publicapi.types.global.v3.CreateAccountErrorEnum errorCode,
           java.lang.String minorErrorCode,
           java.lang.String tan,
           int userId,
           com.betfair.www.publicapi.types.global.v3.ValidationErrorsEnum[] validationErrors) {
        super(
            header);
        this.accountId = accountId;
        this.accountStatus = accountStatus;
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.tan = tan;
        this.userId = userId;
        this.validationErrors = validationErrors;
    }


    /**
     * Gets the accountId value for this CreateAccountResp.
     * 
     * @return accountId
     */
    public int getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CreateAccountResp.
     * 
     * @param accountId
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountStatus value for this CreateAccountResp.
     * 
     * @return accountStatus
     */
    public com.betfair.www.publicapi.types.global.v3.AccountStatusEnum getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this CreateAccountResp.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(com.betfair.www.publicapi.types.global.v3.AccountStatusEnum accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the errorCode value for this CreateAccountResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.CreateAccountErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this CreateAccountResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.CreateAccountErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this CreateAccountResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this CreateAccountResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the tan value for this CreateAccountResp.
     * 
     * @return tan
     */
    public java.lang.String getTan() {
        return tan;
    }


    /**
     * Sets the tan value for this CreateAccountResp.
     * 
     * @param tan
     */
    public void setTan(java.lang.String tan) {
        this.tan = tan;
    }


    /**
     * Gets the userId value for this CreateAccountResp.
     * 
     * @return userId
     */
    public int getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this CreateAccountResp.
     * 
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }


    /**
     * Gets the validationErrors value for this CreateAccountResp.
     * 
     * @return validationErrors
     */
    public com.betfair.www.publicapi.types.global.v3.ValidationErrorsEnum[] getValidationErrors() {
        return validationErrors;
    }


    /**
     * Sets the validationErrors value for this CreateAccountResp.
     * 
     * @param validationErrors
     */
    public void setValidationErrors(com.betfair.www.publicapi.types.global.v3.ValidationErrorsEnum[] validationErrors) {
        this.validationErrors = validationErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAccountResp)) return false;
        CreateAccountResp other = (CreateAccountResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.accountId == other.getAccountId() &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.tan==null && other.getTan()==null) || 
             (this.tan!=null &&
              this.tan.equals(other.getTan()))) &&
            this.userId == other.getUserId() &&
            ((this.validationErrors==null && other.getValidationErrors()==null) || 
             (this.validationErrors!=null &&
              java.util.Arrays.equals(this.validationErrors, other.getValidationErrors())));
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
        _hashCode += getAccountId();
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getTan() != null) {
            _hashCode += getTan().hashCode();
        }
        _hashCode += getUserId();
        if (getValidationErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidationErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidationErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAccountResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AccountStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ValidationErrorsEnum"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ValidationErrorsEnum"));
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
