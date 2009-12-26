/**
 * SubmitContactDetailsCheckLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SubmitContactDetailsCheckLIMBMessage  implements java.io.Serializable {
    private java.lang.Integer messageId;

    private java.lang.String detailsCorrect;

    private java.lang.String newHomeTelephone;

    private java.lang.String newWorkTelephone;

    private java.lang.String newMobileTelephone;

    private java.lang.String newEmailAddress;

    public SubmitContactDetailsCheckLIMBMessage() {
    }

    public SubmitContactDetailsCheckLIMBMessage(
           java.lang.Integer messageId,
           java.lang.String detailsCorrect,
           java.lang.String newHomeTelephone,
           java.lang.String newWorkTelephone,
           java.lang.String newMobileTelephone,
           java.lang.String newEmailAddress) {
           this.messageId = messageId;
           this.detailsCorrect = detailsCorrect;
           this.newHomeTelephone = newHomeTelephone;
           this.newWorkTelephone = newWorkTelephone;
           this.newMobileTelephone = newMobileTelephone;
           this.newEmailAddress = newEmailAddress;
    }


    /**
     * Gets the messageId value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the detailsCorrect value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @return detailsCorrect
     */
    public java.lang.String getDetailsCorrect() {
        return detailsCorrect;
    }


    /**
     * Sets the detailsCorrect value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @param detailsCorrect
     */
    public void setDetailsCorrect(java.lang.String detailsCorrect) {
        this.detailsCorrect = detailsCorrect;
    }


    /**
     * Gets the newHomeTelephone value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @return newHomeTelephone
     */
    public java.lang.String getNewHomeTelephone() {
        return newHomeTelephone;
    }


    /**
     * Sets the newHomeTelephone value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @param newHomeTelephone
     */
    public void setNewHomeTelephone(java.lang.String newHomeTelephone) {
        this.newHomeTelephone = newHomeTelephone;
    }


    /**
     * Gets the newWorkTelephone value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @return newWorkTelephone
     */
    public java.lang.String getNewWorkTelephone() {
        return newWorkTelephone;
    }


    /**
     * Sets the newWorkTelephone value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @param newWorkTelephone
     */
    public void setNewWorkTelephone(java.lang.String newWorkTelephone) {
        this.newWorkTelephone = newWorkTelephone;
    }


    /**
     * Gets the newMobileTelephone value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @return newMobileTelephone
     */
    public java.lang.String getNewMobileTelephone() {
        return newMobileTelephone;
    }


    /**
     * Sets the newMobileTelephone value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @param newMobileTelephone
     */
    public void setNewMobileTelephone(java.lang.String newMobileTelephone) {
        this.newMobileTelephone = newMobileTelephone;
    }


    /**
     * Gets the newEmailAddress value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @return newEmailAddress
     */
    public java.lang.String getNewEmailAddress() {
        return newEmailAddress;
    }


    /**
     * Sets the newEmailAddress value for this SubmitContactDetailsCheckLIMBMessage.
     * 
     * @param newEmailAddress
     */
    public void setNewEmailAddress(java.lang.String newEmailAddress) {
        this.newEmailAddress = newEmailAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitContactDetailsCheckLIMBMessage)) return false;
        SubmitContactDetailsCheckLIMBMessage other = (SubmitContactDetailsCheckLIMBMessage) obj;
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
            ((this.newHomeTelephone==null && other.getNewHomeTelephone()==null) || 
             (this.newHomeTelephone!=null &&
              this.newHomeTelephone.equals(other.getNewHomeTelephone()))) &&
            ((this.newWorkTelephone==null && other.getNewWorkTelephone()==null) || 
             (this.newWorkTelephone!=null &&
              this.newWorkTelephone.equals(other.getNewWorkTelephone()))) &&
            ((this.newMobileTelephone==null && other.getNewMobileTelephone()==null) || 
             (this.newMobileTelephone!=null &&
              this.newMobileTelephone.equals(other.getNewMobileTelephone()))) &&
            ((this.newEmailAddress==null && other.getNewEmailAddress()==null) || 
             (this.newEmailAddress!=null &&
              this.newEmailAddress.equals(other.getNewEmailAddress())));
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
        if (getNewHomeTelephone() != null) {
            _hashCode += getNewHomeTelephone().hashCode();
        }
        if (getNewWorkTelephone() != null) {
            _hashCode += getNewWorkTelephone().hashCode();
        }
        if (getNewMobileTelephone() != null) {
            _hashCode += getNewMobileTelephone().hashCode();
        }
        if (getNewEmailAddress() != null) {
            _hashCode += getNewEmailAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitContactDetailsCheckLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitContactDetailsCheckLIMBMessage"));
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
        elemField.setFieldName("newHomeTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newHomeTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newWorkTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newWorkTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMobileTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newMobileTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newEmailAddress"));
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
