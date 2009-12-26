/**
 * SubmitCardBillingAddressCheckLIMBMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class SubmitCardBillingAddressCheckLIMBMessage  implements java.io.Serializable {
    private java.lang.Integer messageId;

    private java.lang.String detailsCorrect;

    private java.lang.String nickName;

    private java.lang.String newAddress1;

    private java.lang.String newAddress2;

    private java.lang.String newAddress3;

    private java.lang.String newTown;

    private java.lang.String newCounty;

    private java.lang.String newZipCode;

    private java.lang.String newCountry;

    public SubmitCardBillingAddressCheckLIMBMessage() {
    }

    public SubmitCardBillingAddressCheckLIMBMessage(
           java.lang.Integer messageId,
           java.lang.String detailsCorrect,
           java.lang.String nickName,
           java.lang.String newAddress1,
           java.lang.String newAddress2,
           java.lang.String newAddress3,
           java.lang.String newTown,
           java.lang.String newCounty,
           java.lang.String newZipCode,
           java.lang.String newCountry) {
           this.messageId = messageId;
           this.detailsCorrect = detailsCorrect;
           this.nickName = nickName;
           this.newAddress1 = newAddress1;
           this.newAddress2 = newAddress2;
           this.newAddress3 = newAddress3;
           this.newTown = newTown;
           this.newCounty = newCounty;
           this.newZipCode = newZipCode;
           this.newCountry = newCountry;
    }


    /**
     * Gets the messageId value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the detailsCorrect value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return detailsCorrect
     */
    public java.lang.String getDetailsCorrect() {
        return detailsCorrect;
    }


    /**
     * Sets the detailsCorrect value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param detailsCorrect
     */
    public void setDetailsCorrect(java.lang.String detailsCorrect) {
        this.detailsCorrect = detailsCorrect;
    }


    /**
     * Gets the nickName value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the newAddress1 value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return newAddress1
     */
    public java.lang.String getNewAddress1() {
        return newAddress1;
    }


    /**
     * Sets the newAddress1 value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param newAddress1
     */
    public void setNewAddress1(java.lang.String newAddress1) {
        this.newAddress1 = newAddress1;
    }


    /**
     * Gets the newAddress2 value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return newAddress2
     */
    public java.lang.String getNewAddress2() {
        return newAddress2;
    }


    /**
     * Sets the newAddress2 value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param newAddress2
     */
    public void setNewAddress2(java.lang.String newAddress2) {
        this.newAddress2 = newAddress2;
    }


    /**
     * Gets the newAddress3 value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return newAddress3
     */
    public java.lang.String getNewAddress3() {
        return newAddress3;
    }


    /**
     * Sets the newAddress3 value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param newAddress3
     */
    public void setNewAddress3(java.lang.String newAddress3) {
        this.newAddress3 = newAddress3;
    }


    /**
     * Gets the newTown value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return newTown
     */
    public java.lang.String getNewTown() {
        return newTown;
    }


    /**
     * Sets the newTown value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param newTown
     */
    public void setNewTown(java.lang.String newTown) {
        this.newTown = newTown;
    }


    /**
     * Gets the newCounty value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return newCounty
     */
    public java.lang.String getNewCounty() {
        return newCounty;
    }


    /**
     * Sets the newCounty value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param newCounty
     */
    public void setNewCounty(java.lang.String newCounty) {
        this.newCounty = newCounty;
    }


    /**
     * Gets the newZipCode value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return newZipCode
     */
    public java.lang.String getNewZipCode() {
        return newZipCode;
    }


    /**
     * Sets the newZipCode value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param newZipCode
     */
    public void setNewZipCode(java.lang.String newZipCode) {
        this.newZipCode = newZipCode;
    }


    /**
     * Gets the newCountry value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @return newCountry
     */
    public java.lang.String getNewCountry() {
        return newCountry;
    }


    /**
     * Sets the newCountry value for this SubmitCardBillingAddressCheckLIMBMessage.
     * 
     * @param newCountry
     */
    public void setNewCountry(java.lang.String newCountry) {
        this.newCountry = newCountry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitCardBillingAddressCheckLIMBMessage)) return false;
        SubmitCardBillingAddressCheckLIMBMessage other = (SubmitCardBillingAddressCheckLIMBMessage) obj;
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
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.newAddress1==null && other.getNewAddress1()==null) || 
             (this.newAddress1!=null &&
              this.newAddress1.equals(other.getNewAddress1()))) &&
            ((this.newAddress2==null && other.getNewAddress2()==null) || 
             (this.newAddress2!=null &&
              this.newAddress2.equals(other.getNewAddress2()))) &&
            ((this.newAddress3==null && other.getNewAddress3()==null) || 
             (this.newAddress3!=null &&
              this.newAddress3.equals(other.getNewAddress3()))) &&
            ((this.newTown==null && other.getNewTown()==null) || 
             (this.newTown!=null &&
              this.newTown.equals(other.getNewTown()))) &&
            ((this.newCounty==null && other.getNewCounty()==null) || 
             (this.newCounty!=null &&
              this.newCounty.equals(other.getNewCounty()))) &&
            ((this.newZipCode==null && other.getNewZipCode()==null) || 
             (this.newZipCode!=null &&
              this.newZipCode.equals(other.getNewZipCode()))) &&
            ((this.newCountry==null && other.getNewCountry()==null) || 
             (this.newCountry!=null &&
              this.newCountry.equals(other.getNewCountry())));
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
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getNewAddress1() != null) {
            _hashCode += getNewAddress1().hashCode();
        }
        if (getNewAddress2() != null) {
            _hashCode += getNewAddress2().hashCode();
        }
        if (getNewAddress3() != null) {
            _hashCode += getNewAddress3().hashCode();
        }
        if (getNewTown() != null) {
            _hashCode += getNewTown().hashCode();
        }
        if (getNewCounty() != null) {
            _hashCode += getNewCounty().hashCode();
        }
        if (getNewZipCode() != null) {
            _hashCode += getNewZipCode().hashCode();
        }
        if (getNewCountry() != null) {
            _hashCode += getNewCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitCardBillingAddressCheckLIMBMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitCardBillingAddressCheckLIMBMessage"));
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
        elemField.setFieldName("nickName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nickName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newTown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newCountry"));
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
