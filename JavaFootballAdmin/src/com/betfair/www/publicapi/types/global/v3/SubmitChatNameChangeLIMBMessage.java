/**
 * SubmitChatNameChangeLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SubmitChatNameChangeLIMBMessage  implements java.io.Serializable {
    private java.lang.Integer messageId;

    private java.lang.String newChatName;

    public SubmitChatNameChangeLIMBMessage() {
    }

    public SubmitChatNameChangeLIMBMessage(
           java.lang.Integer messageId,
           java.lang.String newChatName) {
           this.messageId = messageId;
           this.newChatName = newChatName;
    }


    /**
     * Gets the messageId value for this SubmitChatNameChangeLIMBMessage.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this SubmitChatNameChangeLIMBMessage.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the newChatName value for this SubmitChatNameChangeLIMBMessage.
     * 
     * @return newChatName
     */
    public java.lang.String getNewChatName() {
        return newChatName;
    }


    /**
     * Sets the newChatName value for this SubmitChatNameChangeLIMBMessage.
     * 
     * @param newChatName
     */
    public void setNewChatName(java.lang.String newChatName) {
        this.newChatName = newChatName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitChatNameChangeLIMBMessage)) return false;
        SubmitChatNameChangeLIMBMessage other = (SubmitChatNameChangeLIMBMessage) obj;
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
            ((this.newChatName==null && other.getNewChatName()==null) || 
             (this.newChatName!=null &&
              this.newChatName.equals(other.getNewChatName())));
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
        if (getNewChatName() != null) {
            _hashCode += getNewChatName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitChatNameChangeLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitChatNameChangeLIMBMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newChatName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newChatName"));
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
