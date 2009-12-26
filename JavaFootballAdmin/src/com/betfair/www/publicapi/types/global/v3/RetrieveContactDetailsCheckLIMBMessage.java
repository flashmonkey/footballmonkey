/**
 * RetrieveContactDetailsCheckLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class RetrieveContactDetailsCheckLIMBMessage  implements java.io.Serializable {
    private java.lang.Integer messageId;

    private java.util.Calendar enforceDate;

    private boolean indicator;

    private java.lang.String homeTelephone;

    private java.lang.String workTelephone;

    private java.lang.String mobileTelephone;

    private java.lang.String emailAddress;

    public RetrieveContactDetailsCheckLIMBMessage() {
    }

    public RetrieveContactDetailsCheckLIMBMessage(
           java.lang.Integer messageId,
           java.util.Calendar enforceDate,
           boolean indicator,
           java.lang.String homeTelephone,
           java.lang.String workTelephone,
           java.lang.String mobileTelephone,
           java.lang.String emailAddress) {
           this.messageId = messageId;
           this.enforceDate = enforceDate;
           this.indicator = indicator;
           this.homeTelephone = homeTelephone;
           this.workTelephone = workTelephone;
           this.mobileTelephone = mobileTelephone;
           this.emailAddress = emailAddress;
    }


    /**
     * Gets the messageId value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the enforceDate value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @return enforceDate
     */
    public java.util.Calendar getEnforceDate() {
        return enforceDate;
    }


    /**
     * Sets the enforceDate value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @param enforceDate
     */
    public void setEnforceDate(java.util.Calendar enforceDate) {
        this.enforceDate = enforceDate;
    }


    /**
     * Gets the indicator value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @return indicator
     */
    public boolean isIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @param indicator
     */
    public void setIndicator(boolean indicator) {
        this.indicator = indicator;
    }


    /**
     * Gets the homeTelephone value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @return homeTelephone
     */
    public java.lang.String getHomeTelephone() {
        return homeTelephone;
    }


    /**
     * Sets the homeTelephone value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @param homeTelephone
     */
    public void setHomeTelephone(java.lang.String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }


    /**
     * Gets the workTelephone value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @return workTelephone
     */
    public java.lang.String getWorkTelephone() {
        return workTelephone;
    }


    /**
     * Sets the workTelephone value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @param workTelephone
     */
    public void setWorkTelephone(java.lang.String workTelephone) {
        this.workTelephone = workTelephone;
    }


    /**
     * Gets the mobileTelephone value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @return mobileTelephone
     */
    public java.lang.String getMobileTelephone() {
        return mobileTelephone;
    }


    /**
     * Sets the mobileTelephone value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @param mobileTelephone
     */
    public void setMobileTelephone(java.lang.String mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }


    /**
     * Gets the emailAddress value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this RetrieveContactDetailsCheckLIMBMessage.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveContactDetailsCheckLIMBMessage)) return false;
        RetrieveContactDetailsCheckLIMBMessage other = (RetrieveContactDetailsCheckLIMBMessage) obj;
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
            ((this.homeTelephone==null && other.getHomeTelephone()==null) || 
             (this.homeTelephone!=null &&
              this.homeTelephone.equals(other.getHomeTelephone()))) &&
            ((this.workTelephone==null && other.getWorkTelephone()==null) || 
             (this.workTelephone!=null &&
              this.workTelephone.equals(other.getWorkTelephone()))) &&
            ((this.mobileTelephone==null && other.getMobileTelephone()==null) || 
             (this.mobileTelephone!=null &&
              this.mobileTelephone.equals(other.getMobileTelephone()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress())));
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
        if (getHomeTelephone() != null) {
            _hashCode += getHomeTelephone().hashCode();
        }
        if (getWorkTelephone() != null) {
            _hashCode += getWorkTelephone().hashCode();
        }
        if (getMobileTelephone() != null) {
            _hashCode += getMobileTelephone().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveContactDetailsCheckLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveContactDetailsCheckLIMBMessage"));
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
        elemField.setFieldName("homeTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homeTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
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
