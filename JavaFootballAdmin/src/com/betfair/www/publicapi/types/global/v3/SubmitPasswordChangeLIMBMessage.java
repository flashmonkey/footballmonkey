/**
 * SubmitPasswordChangeLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SubmitPasswordChangeLIMBMessage  implements java.io.Serializable {
    private java.lang.Integer messageId;

    private java.lang.String newPassword;

    private java.lang.String newPasswordRepeat;

    public SubmitPasswordChangeLIMBMessage() {
    }

    public SubmitPasswordChangeLIMBMessage(
           java.lang.Integer messageId,
           java.lang.String newPassword,
           java.lang.String newPasswordRepeat) {
           this.messageId = messageId;
           this.newPassword = newPassword;
           this.newPasswordRepeat = newPasswordRepeat;
    }


    /**
     * Gets the messageId value for this SubmitPasswordChangeLIMBMessage.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this SubmitPasswordChangeLIMBMessage.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the newPassword value for this SubmitPasswordChangeLIMBMessage.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this SubmitPasswordChangeLIMBMessage.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the newPasswordRepeat value for this SubmitPasswordChangeLIMBMessage.
     * 
     * @return newPasswordRepeat
     */
    public java.lang.String getNewPasswordRepeat() {
        return newPasswordRepeat;
    }


    /**
     * Sets the newPasswordRepeat value for this SubmitPasswordChangeLIMBMessage.
     * 
     * @param newPasswordRepeat
     */
    public void setNewPasswordRepeat(java.lang.String newPasswordRepeat) {
        this.newPasswordRepeat = newPasswordRepeat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitPasswordChangeLIMBMessage)) return false;
        SubmitPasswordChangeLIMBMessage other = (SubmitPasswordChangeLIMBMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
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
        int _hashCode = 1;
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubmitPasswordChangeLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitPasswordChangeLIMBMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
