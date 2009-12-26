/**
 * ForgotPasswordReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ForgotPasswordReq  extends com.betfair.www.publicapi.types.global.v3.APIRequest  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String emailAddress;

    private java.lang.String countryOfResidence;

    private java.lang.String forgottenPasswordAnswer1;

    private java.lang.String forgottenPasswordAnswer2;

    private java.lang.String newPassword;

    private java.lang.String newPasswordRepeat;

    public ForgotPasswordReq() {
    }

    public ForgotPasswordReq(
           com.betfair.www.publicapi.types.global.v3.APIRequestHeader header,
           java.lang.String username,
           java.lang.String emailAddress,
           java.lang.String countryOfResidence,
           java.lang.String forgottenPasswordAnswer1,
           java.lang.String forgottenPasswordAnswer2,
           java.lang.String newPassword,
           java.lang.String newPasswordRepeat) {
        super(
            header);
        this.username = username;
        this.emailAddress = emailAddress;
        this.countryOfResidence = countryOfResidence;
        this.forgottenPasswordAnswer1 = forgottenPasswordAnswer1;
        this.forgottenPasswordAnswer2 = forgottenPasswordAnswer2;
        this.newPassword = newPassword;
        this.newPasswordRepeat = newPasswordRepeat;
    }


    /**
     * Gets the username value for this ForgotPasswordReq.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ForgotPasswordReq.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the emailAddress value for this ForgotPasswordReq.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this ForgotPasswordReq.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the countryOfResidence value for this ForgotPasswordReq.
     * 
     * @return countryOfResidence
     */
    public java.lang.String getCountryOfResidence() {
        return countryOfResidence;
    }


    /**
     * Sets the countryOfResidence value for this ForgotPasswordReq.
     * 
     * @param countryOfResidence
     */
    public void setCountryOfResidence(java.lang.String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }


    /**
     * Gets the forgottenPasswordAnswer1 value for this ForgotPasswordReq.
     * 
     * @return forgottenPasswordAnswer1
     */
    public java.lang.String getForgottenPasswordAnswer1() {
        return forgottenPasswordAnswer1;
    }


    /**
     * Sets the forgottenPasswordAnswer1 value for this ForgotPasswordReq.
     * 
     * @param forgottenPasswordAnswer1
     */
    public void setForgottenPasswordAnswer1(java.lang.String forgottenPasswordAnswer1) {
        this.forgottenPasswordAnswer1 = forgottenPasswordAnswer1;
    }


    /**
     * Gets the forgottenPasswordAnswer2 value for this ForgotPasswordReq.
     * 
     * @return forgottenPasswordAnswer2
     */
    public java.lang.String getForgottenPasswordAnswer2() {
        return forgottenPasswordAnswer2;
    }


    /**
     * Sets the forgottenPasswordAnswer2 value for this ForgotPasswordReq.
     * 
     * @param forgottenPasswordAnswer2
     */
    public void setForgottenPasswordAnswer2(java.lang.String forgottenPasswordAnswer2) {
        this.forgottenPasswordAnswer2 = forgottenPasswordAnswer2;
    }


    /**
     * Gets the newPassword value for this ForgotPasswordReq.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this ForgotPasswordReq.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the newPasswordRepeat value for this ForgotPasswordReq.
     * 
     * @return newPasswordRepeat
     */
    public java.lang.String getNewPasswordRepeat() {
        return newPasswordRepeat;
    }


    /**
     * Sets the newPasswordRepeat value for this ForgotPasswordReq.
     * 
     * @param newPasswordRepeat
     */
    public void setNewPasswordRepeat(java.lang.String newPasswordRepeat) {
        this.newPasswordRepeat = newPasswordRepeat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForgotPasswordReq)) return false;
        ForgotPasswordReq other = (ForgotPasswordReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.countryOfResidence==null && other.getCountryOfResidence()==null) || 
             (this.countryOfResidence!=null &&
              this.countryOfResidence.equals(other.getCountryOfResidence()))) &&
            ((this.forgottenPasswordAnswer1==null && other.getForgottenPasswordAnswer1()==null) || 
             (this.forgottenPasswordAnswer1!=null &&
              this.forgottenPasswordAnswer1.equals(other.getForgottenPasswordAnswer1()))) &&
            ((this.forgottenPasswordAnswer2==null && other.getForgottenPasswordAnswer2()==null) || 
             (this.forgottenPasswordAnswer2!=null &&
              this.forgottenPasswordAnswer2.equals(other.getForgottenPasswordAnswer2()))) &&
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword()))) &&
            ((this.newPasswordRepeat==null && other.getNewPasswordRepeat()==null) || 
             (this.newPasswordRepeat!=null &&
              this.newPasswordRepeat.equals(other.getNewPasswordRepeat())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getCountryOfResidence() != null) {
            _hashCode += getCountryOfResidence().hashCode();
        }
        if (getForgottenPasswordAnswer1() != null) {
            _hashCode += getForgottenPasswordAnswer1().hashCode();
        }
        if (getForgottenPasswordAnswer2() != null) {
            _hashCode += getForgottenPasswordAnswer2().hashCode();
        }
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        if (getNewPasswordRepeat() != null) {
            _hashCode += getNewPasswordRepeat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForgotPasswordReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfResidence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryOfResidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgottenPasswordAnswer1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forgottenPasswordAnswer1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgottenPasswordAnswer2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forgottenPasswordAnswer2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPasswordRepeat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newPasswordRepeat"));
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
