/**
 * SubmitLIMBMessageReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SubmitLIMBMessageReq  extends com.betfair.www.publicapi.types.global.v3.APIRequest  implements java.io.Serializable {
    private java.lang.String password;

    private com.betfair.www.publicapi.types.global.v3.SubmitPersonalLIMBMessage submitPersonalMessage;

    private com.betfair.www.publicapi.types.global.v3.SubmitTCPrivacyPolicyChangeLIMBMessage submitTCPrivacyPolicyChangeMessage;

    private com.betfair.www.publicapi.types.global.v3.SubmitPasswordChangeLIMBMessage submitPasswordChangeMessage;

    private com.betfair.www.publicapi.types.global.v3.SubmitBirthDateCheckLIMBMessage submitBirthDateCheckMessage;

    private com.betfair.www.publicapi.types.global.v3.SubmitAddressCheckLIMBMessage submitAddressCheckMessage;

    private com.betfair.www.publicapi.types.global.v3.SubmitContactDetailsCheckLIMBMessage submitContactDetailsCheckMessage;

    private com.betfair.www.publicapi.types.global.v3.SubmitChatNameChangeLIMBMessage submitChatNameChangeMessage;

    private com.betfair.www.publicapi.types.global.v3.SubmitCardBillingAddressCheckLIMBMessage[] submitCardBillingAddressCheckItems;

    public SubmitLIMBMessageReq() {
    }

    public SubmitLIMBMessageReq(
           com.betfair.www.publicapi.types.global.v3.APIRequestHeader header,
           java.lang.String password,
           com.betfair.www.publicapi.types.global.v3.SubmitPersonalLIMBMessage submitPersonalMessage,
           com.betfair.www.publicapi.types.global.v3.SubmitTCPrivacyPolicyChangeLIMBMessage submitTCPrivacyPolicyChangeMessage,
           com.betfair.www.publicapi.types.global.v3.SubmitPasswordChangeLIMBMessage submitPasswordChangeMessage,
           com.betfair.www.publicapi.types.global.v3.SubmitBirthDateCheckLIMBMessage submitBirthDateCheckMessage,
           com.betfair.www.publicapi.types.global.v3.SubmitAddressCheckLIMBMessage submitAddressCheckMessage,
           com.betfair.www.publicapi.types.global.v3.SubmitContactDetailsCheckLIMBMessage submitContactDetailsCheckMessage,
           com.betfair.www.publicapi.types.global.v3.SubmitChatNameChangeLIMBMessage submitChatNameChangeMessage,
           com.betfair.www.publicapi.types.global.v3.SubmitCardBillingAddressCheckLIMBMessage[] submitCardBillingAddressCheckItems) {
        super(
            header);
        this.password = password;
        this.submitPersonalMessage = submitPersonalMessage;
        this.submitTCPrivacyPolicyChangeMessage = submitTCPrivacyPolicyChangeMessage;
        this.submitPasswordChangeMessage = submitPasswordChangeMessage;
        this.submitBirthDateCheckMessage = submitBirthDateCheckMessage;
        this.submitAddressCheckMessage = submitAddressCheckMessage;
        this.submitContactDetailsCheckMessage = submitContactDetailsCheckMessage;
        this.submitChatNameChangeMessage = submitChatNameChangeMessage;
        this.submitCardBillingAddressCheckItems = submitCardBillingAddressCheckItems;
    }


    /**
     * Gets the password value for this SubmitLIMBMessageReq.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SubmitLIMBMessageReq.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the submitPersonalMessage value for this SubmitLIMBMessageReq.
     * 
     * @return submitPersonalMessage
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitPersonalLIMBMessage getSubmitPersonalMessage() {
        return submitPersonalMessage;
    }


    /**
     * Sets the submitPersonalMessage value for this SubmitLIMBMessageReq.
     * 
     * @param submitPersonalMessage
     */
    public void setSubmitPersonalMessage(com.betfair.www.publicapi.types.global.v3.SubmitPersonalLIMBMessage submitPersonalMessage) {
        this.submitPersonalMessage = submitPersonalMessage;
    }


    /**
     * Gets the submitTCPrivacyPolicyChangeMessage value for this SubmitLIMBMessageReq.
     * 
     * @return submitTCPrivacyPolicyChangeMessage
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitTCPrivacyPolicyChangeLIMBMessage getSubmitTCPrivacyPolicyChangeMessage() {
        return submitTCPrivacyPolicyChangeMessage;
    }


    /**
     * Sets the submitTCPrivacyPolicyChangeMessage value for this SubmitLIMBMessageReq.
     * 
     * @param submitTCPrivacyPolicyChangeMessage
     */
    public void setSubmitTCPrivacyPolicyChangeMessage(com.betfair.www.publicapi.types.global.v3.SubmitTCPrivacyPolicyChangeLIMBMessage submitTCPrivacyPolicyChangeMessage) {
        this.submitTCPrivacyPolicyChangeMessage = submitTCPrivacyPolicyChangeMessage;
    }


    /**
     * Gets the submitPasswordChangeMessage value for this SubmitLIMBMessageReq.
     * 
     * @return submitPasswordChangeMessage
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitPasswordChangeLIMBMessage getSubmitPasswordChangeMessage() {
        return submitPasswordChangeMessage;
    }


    /**
     * Sets the submitPasswordChangeMessage value for this SubmitLIMBMessageReq.
     * 
     * @param submitPasswordChangeMessage
     */
    public void setSubmitPasswordChangeMessage(com.betfair.www.publicapi.types.global.v3.SubmitPasswordChangeLIMBMessage submitPasswordChangeMessage) {
        this.submitPasswordChangeMessage = submitPasswordChangeMessage;
    }


    /**
     * Gets the submitBirthDateCheckMessage value for this SubmitLIMBMessageReq.
     * 
     * @return submitBirthDateCheckMessage
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitBirthDateCheckLIMBMessage getSubmitBirthDateCheckMessage() {
        return submitBirthDateCheckMessage;
    }


    /**
     * Sets the submitBirthDateCheckMessage value for this SubmitLIMBMessageReq.
     * 
     * @param submitBirthDateCheckMessage
     */
    public void setSubmitBirthDateCheckMessage(com.betfair.www.publicapi.types.global.v3.SubmitBirthDateCheckLIMBMessage submitBirthDateCheckMessage) {
        this.submitBirthDateCheckMessage = submitBirthDateCheckMessage;
    }


    /**
     * Gets the submitAddressCheckMessage value for this SubmitLIMBMessageReq.
     * 
     * @return submitAddressCheckMessage
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitAddressCheckLIMBMessage getSubmitAddressCheckMessage() {
        return submitAddressCheckMessage;
    }


    /**
     * Sets the submitAddressCheckMessage value for this SubmitLIMBMessageReq.
     * 
     * @param submitAddressCheckMessage
     */
    public void setSubmitAddressCheckMessage(com.betfair.www.publicapi.types.global.v3.SubmitAddressCheckLIMBMessage submitAddressCheckMessage) {
        this.submitAddressCheckMessage = submitAddressCheckMessage;
    }


    /**
     * Gets the submitContactDetailsCheckMessage value for this SubmitLIMBMessageReq.
     * 
     * @return submitContactDetailsCheckMessage
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitContactDetailsCheckLIMBMessage getSubmitContactDetailsCheckMessage() {
        return submitContactDetailsCheckMessage;
    }


    /**
     * Sets the submitContactDetailsCheckMessage value for this SubmitLIMBMessageReq.
     * 
     * @param submitContactDetailsCheckMessage
     */
    public void setSubmitContactDetailsCheckMessage(com.betfair.www.publicapi.types.global.v3.SubmitContactDetailsCheckLIMBMessage submitContactDetailsCheckMessage) {
        this.submitContactDetailsCheckMessage = submitContactDetailsCheckMessage;
    }


    /**
     * Gets the submitChatNameChangeMessage value for this SubmitLIMBMessageReq.
     * 
     * @return submitChatNameChangeMessage
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitChatNameChangeLIMBMessage getSubmitChatNameChangeMessage() {
        return submitChatNameChangeMessage;
    }


    /**
     * Sets the submitChatNameChangeMessage value for this SubmitLIMBMessageReq.
     * 
     * @param submitChatNameChangeMessage
     */
    public void setSubmitChatNameChangeMessage(com.betfair.www.publicapi.types.global.v3.SubmitChatNameChangeLIMBMessage submitChatNameChangeMessage) {
        this.submitChatNameChangeMessage = submitChatNameChangeMessage;
    }


    /**
     * Gets the submitCardBillingAddressCheckItems value for this SubmitLIMBMessageReq.
     * 
     * @return submitCardBillingAddressCheckItems
     */
    public com.betfair.www.publicapi.types.global.v3.SubmitCardBillingAddressCheckLIMBMessage[] getSubmitCardBillingAddressCheckItems() {
        return submitCardBillingAddressCheckItems;
    }


    /**
     * Sets the submitCardBillingAddressCheckItems value for this SubmitLIMBMessageReq.
     * 
     * @param submitCardBillingAddressCheckItems
     */
    public void setSubmitCardBillingAddressCheckItems(com.betfair.www.publicapi.types.global.v3.SubmitCardBillingAddressCheckLIMBMessage[] submitCardBillingAddressCheckItems) {
        this.submitCardBillingAddressCheckItems = submitCardBillingAddressCheckItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitLIMBMessageReq)) return false;
        SubmitLIMBMessageReq other = (SubmitLIMBMessageReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.submitPersonalMessage==null && other.getSubmitPersonalMessage()==null) || 
             (this.submitPersonalMessage!=null &&
              this.submitPersonalMessage.equals(other.getSubmitPersonalMessage()))) &&
            ((this.submitTCPrivacyPolicyChangeMessage==null && other.getSubmitTCPrivacyPolicyChangeMessage()==null) || 
             (this.submitTCPrivacyPolicyChangeMessage!=null &&
              this.submitTCPrivacyPolicyChangeMessage.equals(other.getSubmitTCPrivacyPolicyChangeMessage()))) &&
            ((this.submitPasswordChangeMessage==null && other.getSubmitPasswordChangeMessage()==null) || 
             (this.submitPasswordChangeMessage!=null &&
              this.submitPasswordChangeMessage.equals(other.getSubmitPasswordChangeMessage()))) &&
            ((this.submitBirthDateCheckMessage==null && other.getSubmitBirthDateCheckMessage()==null) || 
             (this.submitBirthDateCheckMessage!=null &&
              this.submitBirthDateCheckMessage.equals(other.getSubmitBirthDateCheckMessage()))) &&
            ((this.submitAddressCheckMessage==null && other.getSubmitAddressCheckMessage()==null) || 
             (this.submitAddressCheckMessage!=null &&
              this.submitAddressCheckMessage.equals(other.getSubmitAddressCheckMessage()))) &&
            ((this.submitContactDetailsCheckMessage==null && other.getSubmitContactDetailsCheckMessage()==null) || 
             (this.submitContactDetailsCheckMessage!=null &&
              this.submitContactDetailsCheckMessage.equals(other.getSubmitContactDetailsCheckMessage()))) &&
            ((this.submitChatNameChangeMessage==null && other.getSubmitChatNameChangeMessage()==null) || 
             (this.submitChatNameChangeMessage!=null &&
              this.submitChatNameChangeMessage.equals(other.getSubmitChatNameChangeMessage()))) &&
            ((this.submitCardBillingAddressCheckItems==null && other.getSubmitCardBillingAddressCheckItems()==null) || 
             (this.submitCardBillingAddressCheckItems!=null &&
              java.util.Arrays.equals(this.submitCardBillingAddressCheckItems, other.getSubmitCardBillingAddressCheckItems())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSubmitPersonalMessage() != null) {
            _hashCode += getSubmitPersonalMessage().hashCode();
        }
        if (getSubmitTCPrivacyPolicyChangeMessage() != null) {
            _hashCode += getSubmitTCPrivacyPolicyChangeMessage().hashCode();
        }
        if (getSubmitPasswordChangeMessage() != null) {
            _hashCode += getSubmitPasswordChangeMessage().hashCode();
        }
        if (getSubmitBirthDateCheckMessage() != null) {
            _hashCode += getSubmitBirthDateCheckMessage().hashCode();
        }
        if (getSubmitAddressCheckMessage() != null) {
            _hashCode += getSubmitAddressCheckMessage().hashCode();
        }
        if (getSubmitContactDetailsCheckMessage() != null) {
            _hashCode += getSubmitContactDetailsCheckMessage().hashCode();
        }
        if (getSubmitChatNameChangeMessage() != null) {
            _hashCode += getSubmitChatNameChangeMessage().hashCode();
        }
        if (getSubmitCardBillingAddressCheckItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubmitCardBillingAddressCheckItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubmitCardBillingAddressCheckItems(), i);
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
        new org.apache.axis.description.TypeDesc(SubmitLIMBMessageReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitLIMBMessageReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitPersonalMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitPersonalMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitPersonalLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitTCPrivacyPolicyChangeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitTCPrivacyPolicyChangeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitTCPrivacyPolicyChangeLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitPasswordChangeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitPasswordChangeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitPasswordChangeLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitBirthDateCheckMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitBirthDateCheckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitBirthDateCheckLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitAddressCheckMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitAddressCheckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitAddressCheckLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitContactDetailsCheckMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitContactDetailsCheckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitContactDetailsCheckLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitChatNameChangeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitChatNameChangeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitChatNameChangeLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitCardBillingAddressCheckItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitCardBillingAddressCheckItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitCardBillingAddressCheckLIMBMessage"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "submitCardBillingAddressCheckLIMBMessage"));
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
