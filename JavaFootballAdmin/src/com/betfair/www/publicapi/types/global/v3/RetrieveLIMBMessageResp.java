/**
 * RetrieveLIMBMessageResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class RetrieveLIMBMessageResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private int totalMessagesCount;

    private com.betfair.www.publicapi.types.global.v3.RetrievePersonalLIMBMessage retrievePersonalMessage;

    private com.betfair.www.publicapi.types.global.v3.RetrieveTCPrivacyPolicyChangeLIMBMessage retrieveTCPrivacyPolicyChangeMessage;

    private com.betfair.www.publicapi.types.global.v3.RetrievePasswordChangeLIMBMessage retrievePasswordChangeMessage;

    private com.betfair.www.publicapi.types.global.v3.RetrieveBirthDateCheckLIMBMessage retrieveBirthDateCheckMessage;

    private com.betfair.www.publicapi.types.global.v3.RetrieveAddressCheckLIMBMessage retrieveAddressCheckMessage;

    private com.betfair.www.publicapi.types.global.v3.RetrieveContactDetailsCheckLIMBMessage retrieveContactDetailsCheckMessage;

    private com.betfair.www.publicapi.types.global.v3.RetrieveChatNameChangeLIMBMessage retrieveChatNameChangeMessage;

    private com.betfair.www.publicapi.types.global.v3.RetrieveCardBillingAddressCheckLIMBMessage[] retrieveCardBillingAddressCheckItems;

    public RetrieveLIMBMessageResp() {
    }

    public RetrieveLIMBMessageResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageErrorEnum errorCode,
           java.lang.String minorErrorCode,
           int totalMessagesCount,
           com.betfair.www.publicapi.types.global.v3.RetrievePersonalLIMBMessage retrievePersonalMessage,
           com.betfair.www.publicapi.types.global.v3.RetrieveTCPrivacyPolicyChangeLIMBMessage retrieveTCPrivacyPolicyChangeMessage,
           com.betfair.www.publicapi.types.global.v3.RetrievePasswordChangeLIMBMessage retrievePasswordChangeMessage,
           com.betfair.www.publicapi.types.global.v3.RetrieveBirthDateCheckLIMBMessage retrieveBirthDateCheckMessage,
           com.betfair.www.publicapi.types.global.v3.RetrieveAddressCheckLIMBMessage retrieveAddressCheckMessage,
           com.betfair.www.publicapi.types.global.v3.RetrieveContactDetailsCheckLIMBMessage retrieveContactDetailsCheckMessage,
           com.betfair.www.publicapi.types.global.v3.RetrieveChatNameChangeLIMBMessage retrieveChatNameChangeMessage,
           com.betfair.www.publicapi.types.global.v3.RetrieveCardBillingAddressCheckLIMBMessage[] retrieveCardBillingAddressCheckItems) {
        super(
            header);
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.totalMessagesCount = totalMessagesCount;
        this.retrievePersonalMessage = retrievePersonalMessage;
        this.retrieveTCPrivacyPolicyChangeMessage = retrieveTCPrivacyPolicyChangeMessage;
        this.retrievePasswordChangeMessage = retrievePasswordChangeMessage;
        this.retrieveBirthDateCheckMessage = retrieveBirthDateCheckMessage;
        this.retrieveAddressCheckMessage = retrieveAddressCheckMessage;
        this.retrieveContactDetailsCheckMessage = retrieveContactDetailsCheckMessage;
        this.retrieveChatNameChangeMessage = retrieveChatNameChangeMessage;
        this.retrieveCardBillingAddressCheckItems = retrieveCardBillingAddressCheckItems;
    }


    /**
     * Gets the errorCode value for this RetrieveLIMBMessageResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this RetrieveLIMBMessageResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this RetrieveLIMBMessageResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this RetrieveLIMBMessageResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the totalMessagesCount value for this RetrieveLIMBMessageResp.
     * 
     * @return totalMessagesCount
     */
    public int getTotalMessagesCount() {
        return totalMessagesCount;
    }


    /**
     * Sets the totalMessagesCount value for this RetrieveLIMBMessageResp.
     * 
     * @param totalMessagesCount
     */
    public void setTotalMessagesCount(int totalMessagesCount) {
        this.totalMessagesCount = totalMessagesCount;
    }


    /**
     * Gets the retrievePersonalMessage value for this RetrieveLIMBMessageResp.
     * 
     * @return retrievePersonalMessage
     */
    public com.betfair.www.publicapi.types.global.v3.RetrievePersonalLIMBMessage getRetrievePersonalMessage() {
        return retrievePersonalMessage;
    }


    /**
     * Sets the retrievePersonalMessage value for this RetrieveLIMBMessageResp.
     * 
     * @param retrievePersonalMessage
     */
    public void setRetrievePersonalMessage(com.betfair.www.publicapi.types.global.v3.RetrievePersonalLIMBMessage retrievePersonalMessage) {
        this.retrievePersonalMessage = retrievePersonalMessage;
    }


    /**
     * Gets the retrieveTCPrivacyPolicyChangeMessage value for this RetrieveLIMBMessageResp.
     * 
     * @return retrieveTCPrivacyPolicyChangeMessage
     */
    public com.betfair.www.publicapi.types.global.v3.RetrieveTCPrivacyPolicyChangeLIMBMessage getRetrieveTCPrivacyPolicyChangeMessage() {
        return retrieveTCPrivacyPolicyChangeMessage;
    }


    /**
     * Sets the retrieveTCPrivacyPolicyChangeMessage value for this RetrieveLIMBMessageResp.
     * 
     * @param retrieveTCPrivacyPolicyChangeMessage
     */
    public void setRetrieveTCPrivacyPolicyChangeMessage(com.betfair.www.publicapi.types.global.v3.RetrieveTCPrivacyPolicyChangeLIMBMessage retrieveTCPrivacyPolicyChangeMessage) {
        this.retrieveTCPrivacyPolicyChangeMessage = retrieveTCPrivacyPolicyChangeMessage;
    }


    /**
     * Gets the retrievePasswordChangeMessage value for this RetrieveLIMBMessageResp.
     * 
     * @return retrievePasswordChangeMessage
     */
    public com.betfair.www.publicapi.types.global.v3.RetrievePasswordChangeLIMBMessage getRetrievePasswordChangeMessage() {
        return retrievePasswordChangeMessage;
    }


    /**
     * Sets the retrievePasswordChangeMessage value for this RetrieveLIMBMessageResp.
     * 
     * @param retrievePasswordChangeMessage
     */
    public void setRetrievePasswordChangeMessage(com.betfair.www.publicapi.types.global.v3.RetrievePasswordChangeLIMBMessage retrievePasswordChangeMessage) {
        this.retrievePasswordChangeMessage = retrievePasswordChangeMessage;
    }


    /**
     * Gets the retrieveBirthDateCheckMessage value for this RetrieveLIMBMessageResp.
     * 
     * @return retrieveBirthDateCheckMessage
     */
    public com.betfair.www.publicapi.types.global.v3.RetrieveBirthDateCheckLIMBMessage getRetrieveBirthDateCheckMessage() {
        return retrieveBirthDateCheckMessage;
    }


    /**
     * Sets the retrieveBirthDateCheckMessage value for this RetrieveLIMBMessageResp.
     * 
     * @param retrieveBirthDateCheckMessage
     */
    public void setRetrieveBirthDateCheckMessage(com.betfair.www.publicapi.types.global.v3.RetrieveBirthDateCheckLIMBMessage retrieveBirthDateCheckMessage) {
        this.retrieveBirthDateCheckMessage = retrieveBirthDateCheckMessage;
    }


    /**
     * Gets the retrieveAddressCheckMessage value for this RetrieveLIMBMessageResp.
     * 
     * @return retrieveAddressCheckMessage
     */
    public com.betfair.www.publicapi.types.global.v3.RetrieveAddressCheckLIMBMessage getRetrieveAddressCheckMessage() {
        return retrieveAddressCheckMessage;
    }


    /**
     * Sets the retrieveAddressCheckMessage value for this RetrieveLIMBMessageResp.
     * 
     * @param retrieveAddressCheckMessage
     */
    public void setRetrieveAddressCheckMessage(com.betfair.www.publicapi.types.global.v3.RetrieveAddressCheckLIMBMessage retrieveAddressCheckMessage) {
        this.retrieveAddressCheckMessage = retrieveAddressCheckMessage;
    }


    /**
     * Gets the retrieveContactDetailsCheckMessage value for this RetrieveLIMBMessageResp.
     * 
     * @return retrieveContactDetailsCheckMessage
     */
    public com.betfair.www.publicapi.types.global.v3.RetrieveContactDetailsCheckLIMBMessage getRetrieveContactDetailsCheckMessage() {
        return retrieveContactDetailsCheckMessage;
    }


    /**
     * Sets the retrieveContactDetailsCheckMessage value for this RetrieveLIMBMessageResp.
     * 
     * @param retrieveContactDetailsCheckMessage
     */
    public void setRetrieveContactDetailsCheckMessage(com.betfair.www.publicapi.types.global.v3.RetrieveContactDetailsCheckLIMBMessage retrieveContactDetailsCheckMessage) {
        this.retrieveContactDetailsCheckMessage = retrieveContactDetailsCheckMessage;
    }


    /**
     * Gets the retrieveChatNameChangeMessage value for this RetrieveLIMBMessageResp.
     * 
     * @return retrieveChatNameChangeMessage
     */
    public com.betfair.www.publicapi.types.global.v3.RetrieveChatNameChangeLIMBMessage getRetrieveChatNameChangeMessage() {
        return retrieveChatNameChangeMessage;
    }


    /**
     * Sets the retrieveChatNameChangeMessage value for this RetrieveLIMBMessageResp.
     * 
     * @param retrieveChatNameChangeMessage
     */
    public void setRetrieveChatNameChangeMessage(com.betfair.www.publicapi.types.global.v3.RetrieveChatNameChangeLIMBMessage retrieveChatNameChangeMessage) {
        this.retrieveChatNameChangeMessage = retrieveChatNameChangeMessage;
    }


    /**
     * Gets the retrieveCardBillingAddressCheckItems value for this RetrieveLIMBMessageResp.
     * 
     * @return retrieveCardBillingAddressCheckItems
     */
    public com.betfair.www.publicapi.types.global.v3.RetrieveCardBillingAddressCheckLIMBMessage[] getRetrieveCardBillingAddressCheckItems() {
        return retrieveCardBillingAddressCheckItems;
    }


    /**
     * Sets the retrieveCardBillingAddressCheckItems value for this RetrieveLIMBMessageResp.
     * 
     * @param retrieveCardBillingAddressCheckItems
     */
    public void setRetrieveCardBillingAddressCheckItems(com.betfair.www.publicapi.types.global.v3.RetrieveCardBillingAddressCheckLIMBMessage[] retrieveCardBillingAddressCheckItems) {
        this.retrieveCardBillingAddressCheckItems = retrieveCardBillingAddressCheckItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveLIMBMessageResp)) return false;
        RetrieveLIMBMessageResp other = (RetrieveLIMBMessageResp) obj;
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
            this.totalMessagesCount == other.getTotalMessagesCount() &&
            ((this.retrievePersonalMessage==null && other.getRetrievePersonalMessage()==null) || 
             (this.retrievePersonalMessage!=null &&
              this.retrievePersonalMessage.equals(other.getRetrievePersonalMessage()))) &&
            ((this.retrieveTCPrivacyPolicyChangeMessage==null && other.getRetrieveTCPrivacyPolicyChangeMessage()==null) || 
             (this.retrieveTCPrivacyPolicyChangeMessage!=null &&
              this.retrieveTCPrivacyPolicyChangeMessage.equals(other.getRetrieveTCPrivacyPolicyChangeMessage()))) &&
            ((this.retrievePasswordChangeMessage==null && other.getRetrievePasswordChangeMessage()==null) || 
             (this.retrievePasswordChangeMessage!=null &&
              this.retrievePasswordChangeMessage.equals(other.getRetrievePasswordChangeMessage()))) &&
            ((this.retrieveBirthDateCheckMessage==null && other.getRetrieveBirthDateCheckMessage()==null) || 
             (this.retrieveBirthDateCheckMessage!=null &&
              this.retrieveBirthDateCheckMessage.equals(other.getRetrieveBirthDateCheckMessage()))) &&
            ((this.retrieveAddressCheckMessage==null && other.getRetrieveAddressCheckMessage()==null) || 
             (this.retrieveAddressCheckMessage!=null &&
              this.retrieveAddressCheckMessage.equals(other.getRetrieveAddressCheckMessage()))) &&
            ((this.retrieveContactDetailsCheckMessage==null && other.getRetrieveContactDetailsCheckMessage()==null) || 
             (this.retrieveContactDetailsCheckMessage!=null &&
              this.retrieveContactDetailsCheckMessage.equals(other.getRetrieveContactDetailsCheckMessage()))) &&
            ((this.retrieveChatNameChangeMessage==null && other.getRetrieveChatNameChangeMessage()==null) || 
             (this.retrieveChatNameChangeMessage!=null &&
              this.retrieveChatNameChangeMessage.equals(other.getRetrieveChatNameChangeMessage()))) &&
            ((this.retrieveCardBillingAddressCheckItems==null && other.getRetrieveCardBillingAddressCheckItems()==null) || 
             (this.retrieveCardBillingAddressCheckItems!=null &&
              java.util.Arrays.equals(this.retrieveCardBillingAddressCheckItems, other.getRetrieveCardBillingAddressCheckItems())));
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
        _hashCode += getTotalMessagesCount();
        if (getRetrievePersonalMessage() != null) {
            _hashCode += getRetrievePersonalMessage().hashCode();
        }
        if (getRetrieveTCPrivacyPolicyChangeMessage() != null) {
            _hashCode += getRetrieveTCPrivacyPolicyChangeMessage().hashCode();
        }
        if (getRetrievePasswordChangeMessage() != null) {
            _hashCode += getRetrievePasswordChangeMessage().hashCode();
        }
        if (getRetrieveBirthDateCheckMessage() != null) {
            _hashCode += getRetrieveBirthDateCheckMessage().hashCode();
        }
        if (getRetrieveAddressCheckMessage() != null) {
            _hashCode += getRetrieveAddressCheckMessage().hashCode();
        }
        if (getRetrieveContactDetailsCheckMessage() != null) {
            _hashCode += getRetrieveContactDetailsCheckMessage().hashCode();
        }
        if (getRetrieveChatNameChangeMessage() != null) {
            _hashCode += getRetrieveChatNameChangeMessage().hashCode();
        }
        if (getRetrieveCardBillingAddressCheckItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRetrieveCardBillingAddressCheckItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRetrieveCardBillingAddressCheckItems(), i);
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
        new org.apache.axis.description.TypeDesc(RetrieveLIMBMessageResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveLIMBMessageResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveLIMBMessageErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMessagesCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMessagesCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrievePersonalMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrievePersonalMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrievePersonalLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveTCPrivacyPolicyChangeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveTCPrivacyPolicyChangeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveTCPrivacyPolicyChangeLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrievePasswordChangeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrievePasswordChangeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrievePasswordChangeLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveBirthDateCheckMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveBirthDateCheckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveBirthDateCheckLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveAddressCheckMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveAddressCheckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveAddressCheckLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveContactDetailsCheckMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveContactDetailsCheckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveContactDetailsCheckLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveChatNameChangeMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveChatNameChangeMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveChatNameChangeLIMBMessage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveCardBillingAddressCheckItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveCardBillingAddressCheckItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveCardBillingAddressCheckLIMBMessage"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "retrieveCardBillingAddressCheckLIMBMessage"));
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
