/**
 * SubmitBirthDateCheckLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SubmitBirthDateCheckLIMBMessage  implements java.io.Serializable {
    private java.lang.Integer messageId;

    private java.lang.String detailsCorrect;

    private java.util.Calendar correctBirthDate;

    public SubmitBirthDateCheckLIMBMessage() {
    }

    public SubmitBirthDateCheckLIMBMessage(
           java.lang.Integer messageId,
           java.lang.String detailsCorrect,
           java.util.Calendar correctBirthDate) {
           this.messageId = messageId;
           this.detailsCorrect = detailsCorrect;
           this.correctBirthDate = correctBirthDate;
    }


    /**
     * Gets the messageId value for this SubmitBirthDateCheckLIMBMessage.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this SubmitBirthDateCheckLIMBMessage.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the detailsCorrect value for this SubmitBirthDateCheckLIMBMessage.
     * 
     * @return detailsCorrect
     */
    public java.lang.String getDetailsCorrect() {
        return detailsCorrect;
    }


    /**
     * Sets the detailsCorrect value for this SubmitBirthDateCheckLIMBMessage.
     * 
     * @param detailsCorrect
     */
    public void setDetailsCorrect(java.lang.String detailsCorrect) {
        this.detailsCorrect = detailsCorrect;
    }


    /**
     * Gets the correctBirthDate value for this SubmitBirthDateCheckLIMBMessage.
     * 
     * @return correctBirthDate
     */
    public java.util.Calendar getCorrectBirthDate() {
        return correctBirthDate;
    }


    /**
     * Sets the correctBirthDate value for this SubmitBirthDateCheckLIMBMessage.
     * 
     * @param correctBirthDate
     */
    public void setCorrectBirthDate(java.util.Calendar correctBirthDate) {
        this.correctBirthDate = correctBirthDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitBirthDateCheckLIMBMessage)) return false;
        SubmitBirthDateCheckLIMBMessage other = (SubmitBirthDateCheckLIMBMessage) obj;
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
            ((this.detailsCorrect==null && other.getDetailsCorrect()==null) || 
             (this.detailsCorrect!=null &&
              this.detailsCorrect.equals(other.getDetailsCorrect()))) &&
            ((this.correctBirthDate==null && other.getCorrectBirthDate()==null) || 
             (this.correctBirthDate!=null &&
              this.correctBirthDate.equals(other.getCorrectBirthDate())));
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
        if (getDetailsCorrect() != null) {
            _hashCode += getDetailsCorrect().hashCode();
        }
        if (getCorrectBirthDate() != null) {
            _hashCode += getCorrectBirthDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitBirthDateCheckLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitBirthDateCheckLIMBMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailsCorrect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailsCorrect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctBirthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correctBirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
