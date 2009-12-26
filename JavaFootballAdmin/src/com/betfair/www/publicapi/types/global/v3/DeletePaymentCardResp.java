/**
 * DeletePaymentCardResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class DeletePaymentCardResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.DeletePaymentCardErrorEnum errorCode;

    private java.lang.String minorErrorCode;

    private java.lang.String nickName;

    private java.lang.String billingName;

    private java.lang.String cardShortNumber;

    private com.betfair.www.publicapi.types.global.v3.CardTypeEnum cardType;

    private java.lang.String issuingCountry;

    private java.lang.String expiryDate;

    public DeletePaymentCardResp() {
    }

    public DeletePaymentCardResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.DeletePaymentCardErrorEnum errorCode,
           java.lang.String minorErrorCode,
           java.lang.String nickName,
           java.lang.String billingName,
           java.lang.String cardShortNumber,
           com.betfair.www.publicapi.types.global.v3.CardTypeEnum cardType,
           java.lang.String issuingCountry,
           java.lang.String expiryDate) {
        super(
            header);
        this.errorCode = errorCode;
        this.minorErrorCode = minorErrorCode;
        this.nickName = nickName;
        this.billingName = billingName;
        this.cardShortNumber = cardShortNumber;
        this.cardType = cardType;
        this.issuingCountry = issuingCountry;
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the errorCode value for this DeletePaymentCardResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.DeletePaymentCardErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this DeletePaymentCardResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.DeletePaymentCardErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the minorErrorCode value for this DeletePaymentCardResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this DeletePaymentCardResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the nickName value for this DeletePaymentCardResp.
     * 
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this DeletePaymentCardResp.
     * 
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the billingName value for this DeletePaymentCardResp.
     * 
     * @return billingName
     */
    public java.lang.String getBillingName() {
        return billingName;
    }


    /**
     * Sets the billingName value for this DeletePaymentCardResp.
     * 
     * @param billingName
     */
    public void setBillingName(java.lang.String billingName) {
        this.billingName = billingName;
    }


    /**
     * Gets the cardShortNumber value for this DeletePaymentCardResp.
     * 
     * @return cardShortNumber
     */
    public java.lang.String getCardShortNumber() {
        return cardShortNumber;
    }


    /**
     * Sets the cardShortNumber value for this DeletePaymentCardResp.
     * 
     * @param cardShortNumber
     */
    public void setCardShortNumber(java.lang.String cardShortNumber) {
        this.cardShortNumber = cardShortNumber;
    }


    /**
     * Gets the cardType value for this DeletePaymentCardResp.
     * 
     * @return cardType
     */
    public com.betfair.www.publicapi.types.global.v3.CardTypeEnum getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this DeletePaymentCardResp.
     * 
     * @param cardType
     */
    public void setCardType(com.betfair.www.publicapi.types.global.v3.CardTypeEnum cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the issuingCountry value for this DeletePaymentCardResp.
     * 
     * @return issuingCountry
     */
    public java.lang.String getIssuingCountry() {
        return issuingCountry;
    }


    /**
     * Sets the issuingCountry value for this DeletePaymentCardResp.
     * 
     * @param issuingCountry
     */
    public void setIssuingCountry(java.lang.String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }


    /**
     * Gets the expiryDate value for this DeletePaymentCardResp.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this DeletePaymentCardResp.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletePaymentCardResp)) return false;
        DeletePaymentCardResp other = (DeletePaymentCardResp) obj;
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
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.billingName==null && other.getBillingName()==null) || 
             (this.billingName!=null &&
              this.billingName.equals(other.getBillingName()))) &&
            ((this.cardShortNumber==null && other.getCardShortNumber()==null) || 
             (this.cardShortNumber!=null &&
              this.cardShortNumber.equals(other.getCardShortNumber()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.issuingCountry==null && other.getIssuingCountry()==null) || 
             (this.issuingCountry!=null &&
              this.issuingCountry.equals(other.getIssuingCountry()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate())));
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
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getBillingName() != null) {
            _hashCode += getBillingName().hashCode();
        }
        if (getCardShortNumber() != null) {
            _hashCode += getCardShortNumber().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getIssuingCountry() != null) {
            _hashCode += getIssuingCountry().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeletePaymentCardResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
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
        elemField.setFieldName("billingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardShortNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardShortNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CardTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
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
