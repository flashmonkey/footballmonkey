/**
 * RetrieveTCPrivacyPolicyChangeLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class RetrieveTCPrivacyPolicyChangeLIMBMessage  implements java.io.Serializable {
    private java.lang.Integer messageId;

    private java.util.Calendar enforceDate;

    private boolean indicator;

    private java.lang.String reasonForChange;

    public RetrieveTCPrivacyPolicyChangeLIMBMessage() {
    }

    public RetrieveTCPrivacyPolicyChangeLIMBMessage(
           java.lang.Integer messageId,
           java.util.Calendar enforceDate,
           boolean indicator,
           java.lang.String reasonForChange) {
           this.messageId = messageId;
           this.enforceDate = enforceDate;
           this.indicator = indicator;
           this.reasonForChange = reasonForChange;
    }


    /**
     * Gets the messageId value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the enforceDate value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @return enforceDate
     */
    public java.util.Calendar getEnforceDate() {
        return enforceDate;
    }


    /**
     * Sets the enforceDate value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @param enforceDate
     */
    public void setEnforceDate(java.util.Calendar enforceDate) {
        this.enforceDate = enforceDate;
    }


    /**
     * Gets the indicator value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @return indicator
     */
    public boolean isIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @param indicator
     */
    public void setIndicator(boolean indicator) {
        this.indicator = indicator;
    }


    /**
     * Gets the reasonForChange value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @return reasonForChange
     */
    public java.lang.String getReasonForChange() {
        return reasonForChange;
    }


    /**
     * Sets the reasonForChange value for this RetrieveTCPrivacyPolicyChangeLIMBMessage.
     * 
     * @param reasonForChange
     */
    public void setReasonForChange(java.lang.String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveTCPrivacyPolicyChangeLIMBMessage)) return false;
        RetrieveTCPrivacyPolicyChangeLIMBMessage other = (RetrieveTCPrivacyPolicyChangeLIMBMessage) obj;
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
            ((this.enforceDate==null && other.getEnforceDate()==null) || 
             (this.enforceDate!=null &&
              this.enforceDate.equals(other.getEnforceDate()))) &&
            this.indicator == other.isIndicator() &&
            ((this.reasonForChange==null && other.getReasonForChange()==null) || 
             (this.reasonForChange!=null &&
              this.reasonForChange.equals(other.getReasonForChange())));
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
        if (getEnforceDate() != null) {
            _hashCode += getEnforceDate().hashCode();
        }
        _hashCode += (isIndicator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReasonForChange() != null) {
            _hashCode += getReasonForChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveTCPrivacyPolicyChangeLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveTCPrivacyPolicyChangeLIMBMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enforceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonForChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonForChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
