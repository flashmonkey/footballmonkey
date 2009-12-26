/**
 * ViewProfileV2Resp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ViewProfileV2Resp  extends com.betfair.www.publicapi.types.global.v3.ViewProfileResp  implements java.io.Serializable {
    private java.lang.String tAN;

    private java.lang.String referAndEarnCode;

    private java.lang.String earthportID;

    private com.betfair.www.publicapi.types.global.v3.KYCStatusEnum kYCStatus;

    public ViewProfileV2Resp() {
    }

    public ViewProfileV2Resp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           java.lang.String minorErrorCode,
           com.betfair.www.publicapi.types.global.v3.ViewProfileErrorEnum errorCode,
           com.betfair.www.publicapi.types.global.v3.TitleEnum title,
           java.lang.String firstName,
           java.lang.String surname,
           java.lang.String userName,
           java.lang.String forumName,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String address3,
           java.lang.String townCity,
           java.lang.String countyState,
           java.lang.String postCode,
           java.lang.String countryOfResidence,
           java.lang.String homeTelephone,
           java.lang.String workTelephone,
           java.lang.String mobileTelephone,
           java.lang.String emailAddress,
           java.lang.String timeZone,
           java.lang.String currency,
           java.lang.Integer gamcareLimit,
           com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum gamcareFrequency,
           java.lang.Integer gamcareLossLimit,
           com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum gamcareLossLimitFrequency,
           java.util.Calendar gamcareUpdateDate,
           java.lang.String tAN,
           java.lang.String referAndEarnCode,
           java.lang.String earthportID,
           com.betfair.www.publicapi.types.global.v3.KYCStatusEnum kYCStatus) {
        super(
            header,
            minorErrorCode,
            errorCode,
            title,
            firstName,
            surname,
            userName,
            forumName,
            address1,
            address2,
            address3,
            townCity,
            countyState,
            postCode,
            countryOfResidence,
            homeTelephone,
            workTelephone,
            mobileTelephone,
            emailAddress,
            timeZone,
            currency,
            gamcareLimit,
            gamcareFrequency,
            gamcareLossLimit,
            gamcareLossLimitFrequency,
            gamcareUpdateDate);
        this.tAN = tAN;
        this.referAndEarnCode = referAndEarnCode;
        this.earthportID = earthportID;
        this.kYCStatus = kYCStatus;
    }


    /**
     * Gets the tAN value for this ViewProfileV2Resp.
     * 
     * @return tAN
     */
    public java.lang.String getTAN() {
        return tAN;
    }


    /**
     * Sets the tAN value for this ViewProfileV2Resp.
     * 
     * @param tAN
     */
    public void setTAN(java.lang.String tAN) {
        this.tAN = tAN;
    }


    /**
     * Gets the referAndEarnCode value for this ViewProfileV2Resp.
     * 
     * @return referAndEarnCode
     */
    public java.lang.String getReferAndEarnCode() {
        return referAndEarnCode;
    }


    /**
     * Sets the referAndEarnCode value for this ViewProfileV2Resp.
     * 
     * @param referAndEarnCode
     */
    public void setReferAndEarnCode(java.lang.String referAndEarnCode) {
        this.referAndEarnCode = referAndEarnCode;
    }


    /**
     * Gets the earthportID value for this ViewProfileV2Resp.
     * 
     * @return earthportID
     */
    public java.lang.String getEarthportID() {
        return earthportID;
    }


    /**
     * Sets the earthportID value for this ViewProfileV2Resp.
     * 
     * @param earthportID
     */
    public void setEarthportID(java.lang.String earthportID) {
        this.earthportID = earthportID;
    }


    /**
     * Gets the kYCStatus value for this ViewProfileV2Resp.
     * 
     * @return kYCStatus
     */
    public com.betfair.www.publicapi.types.global.v3.KYCStatusEnum getKYCStatus() {
        return kYCStatus;
    }


    /**
     * Sets the kYCStatus value for this ViewProfileV2Resp.
     * 
     * @param kYCStatus
     */
    public void setKYCStatus(com.betfair.www.publicapi.types.global.v3.KYCStatusEnum kYCStatus) {
        this.kYCStatus = kYCStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewProfileV2Resp)) return false;
        ViewProfileV2Resp other = (ViewProfileV2Resp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tAN==null && other.getTAN()==null) || 
             (this.tAN!=null &&
              this.tAN.equals(other.getTAN()))) &&
            ((this.referAndEarnCode==null && other.getReferAndEarnCode()==null) || 
             (this.referAndEarnCode!=null &&
              this.referAndEarnCode.equals(other.getReferAndEarnCode()))) &&
            ((this.earthportID==null && other.getEarthportID()==null) || 
             (this.earthportID!=null &&
              this.earthportID.equals(other.getEarthportID()))) &&
            ((this.kYCStatus==null && other.getKYCStatus()==null) || 
             (this.kYCStatus!=null &&
              this.kYCStatus.equals(other.getKYCStatus())));
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
        if (getTAN() != null) {
            _hashCode += getTAN().hashCode();
        }
        if (getReferAndEarnCode() != null) {
            _hashCode += getReferAndEarnCode().hashCode();
        }
        if (getEarthportID() != null) {
            _hashCode += getEarthportID().hashCode();
        }
        if (getKYCStatus() != null) {
            _hashCode += getKYCStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewProfileV2Resp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileV2Resp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referAndEarnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referAndEarnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earthportID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "earthportID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KYCStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kYCStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "KYCStatusEnum"));
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
