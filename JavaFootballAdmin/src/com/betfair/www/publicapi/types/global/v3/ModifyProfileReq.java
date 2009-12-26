/**
 * ModifyProfileReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ModifyProfileReq  extends com.betfair.www.publicapi.types.global.v3.APIRequest  implements java.io.Serializable {
    private java.lang.String password;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String address3;

    private java.lang.String townCity;

    private java.lang.String countyState;

    private java.lang.String postCode;

    private java.lang.String countryOfResidence;

    private java.lang.String homeTelephone;

    private java.lang.String workTelephone;

    private java.lang.String mobileTelephone;

    private java.lang.String emailAddress;

    private java.lang.String timeZone;

    private java.lang.Integer depositLimit;

    private com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum depositLimitFrequency;

    private java.lang.Integer lossLimit;

    private com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum lossLimitFrequency;

    public ModifyProfileReq() {
    }

    public ModifyProfileReq(
           com.betfair.www.publicapi.types.global.v3.APIRequestHeader header,
           java.lang.String password,
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
           java.lang.Integer depositLimit,
           com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum depositLimitFrequency,
           java.lang.Integer lossLimit,
           com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum lossLimitFrequency) {
        super(
            header);
        this.password = password;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.townCity = townCity;
        this.countyState = countyState;
        this.postCode = postCode;
        this.countryOfResidence = countryOfResidence;
        this.homeTelephone = homeTelephone;
        this.workTelephone = workTelephone;
        this.mobileTelephone = mobileTelephone;
        this.emailAddress = emailAddress;
        this.timeZone = timeZone;
        this.depositLimit = depositLimit;
        this.depositLimitFrequency = depositLimitFrequency;
        this.lossLimit = lossLimit;
        this.lossLimitFrequency = lossLimitFrequency;
    }


    /**
     * Gets the password value for this ModifyProfileReq.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ModifyProfileReq.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the address1 value for this ModifyProfileReq.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this ModifyProfileReq.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this ModifyProfileReq.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this ModifyProfileReq.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this ModifyProfileReq.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this ModifyProfileReq.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the townCity value for this ModifyProfileReq.
     * 
     * @return townCity
     */
    public java.lang.String getTownCity() {
        return townCity;
    }


    /**
     * Sets the townCity value for this ModifyProfileReq.
     * 
     * @param townCity
     */
    public void setTownCity(java.lang.String townCity) {
        this.townCity = townCity;
    }


    /**
     * Gets the countyState value for this ModifyProfileReq.
     * 
     * @return countyState
     */
    public java.lang.String getCountyState() {
        return countyState;
    }


    /**
     * Sets the countyState value for this ModifyProfileReq.
     * 
     * @param countyState
     */
    public void setCountyState(java.lang.String countyState) {
        this.countyState = countyState;
    }


    /**
     * Gets the postCode value for this ModifyProfileReq.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this ModifyProfileReq.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the countryOfResidence value for this ModifyProfileReq.
     * 
     * @return countryOfResidence
     */
    public java.lang.String getCountryOfResidence() {
        return countryOfResidence;
    }


    /**
     * Sets the countryOfResidence value for this ModifyProfileReq.
     * 
     * @param countryOfResidence
     */
    public void setCountryOfResidence(java.lang.String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }


    /**
     * Gets the homeTelephone value for this ModifyProfileReq.
     * 
     * @return homeTelephone
     */
    public java.lang.String getHomeTelephone() {
        return homeTelephone;
    }


    /**
     * Sets the homeTelephone value for this ModifyProfileReq.
     * 
     * @param homeTelephone
     */
    public void setHomeTelephone(java.lang.String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }


    /**
     * Gets the workTelephone value for this ModifyProfileReq.
     * 
     * @return workTelephone
     */
    public java.lang.String getWorkTelephone() {
        return workTelephone;
    }


    /**
     * Sets the workTelephone value for this ModifyProfileReq.
     * 
     * @param workTelephone
     */
    public void setWorkTelephone(java.lang.String workTelephone) {
        this.workTelephone = workTelephone;
    }


    /**
     * Gets the mobileTelephone value for this ModifyProfileReq.
     * 
     * @return mobileTelephone
     */
    public java.lang.String getMobileTelephone() {
        return mobileTelephone;
    }


    /**
     * Sets the mobileTelephone value for this ModifyProfileReq.
     * 
     * @param mobileTelephone
     */
    public void setMobileTelephone(java.lang.String mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }


    /**
     * Gets the emailAddress value for this ModifyProfileReq.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this ModifyProfileReq.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the timeZone value for this ModifyProfileReq.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this ModifyProfileReq.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the depositLimit value for this ModifyProfileReq.
     * 
     * @return depositLimit
     */
    public java.lang.Integer getDepositLimit() {
        return depositLimit;
    }


    /**
     * Sets the depositLimit value for this ModifyProfileReq.
     * 
     * @param depositLimit
     */
    public void setDepositLimit(java.lang.Integer depositLimit) {
        this.depositLimit = depositLimit;
    }


    /**
     * Gets the depositLimitFrequency value for this ModifyProfileReq.
     * 
     * @return depositLimitFrequency
     */
    public com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum getDepositLimitFrequency() {
        return depositLimitFrequency;
    }


    /**
     * Sets the depositLimitFrequency value for this ModifyProfileReq.
     * 
     * @param depositLimitFrequency
     */
    public void setDepositLimitFrequency(com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum depositLimitFrequency) {
        this.depositLimitFrequency = depositLimitFrequency;
    }


    /**
     * Gets the lossLimit value for this ModifyProfileReq.
     * 
     * @return lossLimit
     */
    public java.lang.Integer getLossLimit() {
        return lossLimit;
    }


    /**
     * Sets the lossLimit value for this ModifyProfileReq.
     * 
     * @param lossLimit
     */
    public void setLossLimit(java.lang.Integer lossLimit) {
        this.lossLimit = lossLimit;
    }


    /**
     * Gets the lossLimitFrequency value for this ModifyProfileReq.
     * 
     * @return lossLimitFrequency
     */
    public com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum getLossLimitFrequency() {
        return lossLimitFrequency;
    }


    /**
     * Sets the lossLimitFrequency value for this ModifyProfileReq.
     * 
     * @param lossLimitFrequency
     */
    public void setLossLimitFrequency(com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum lossLimitFrequency) {
        this.lossLimitFrequency = lossLimitFrequency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyProfileReq)) return false;
        ModifyProfileReq other = (ModifyProfileReq) obj;
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
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
            ((this.townCity==null && other.getTownCity()==null) || 
             (this.townCity!=null &&
              this.townCity.equals(other.getTownCity()))) &&
            ((this.countyState==null && other.getCountyState()==null) || 
             (this.countyState!=null &&
              this.countyState.equals(other.getCountyState()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.countryOfResidence==null && other.getCountryOfResidence()==null) || 
             (this.countryOfResidence!=null &&
              this.countryOfResidence.equals(other.getCountryOfResidence()))) &&
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
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.depositLimit==null && other.getDepositLimit()==null) || 
             (this.depositLimit!=null &&
              this.depositLimit.equals(other.getDepositLimit()))) &&
            ((this.depositLimitFrequency==null && other.getDepositLimitFrequency()==null) || 
             (this.depositLimitFrequency!=null &&
              this.depositLimitFrequency.equals(other.getDepositLimitFrequency()))) &&
            ((this.lossLimit==null && other.getLossLimit()==null) || 
             (this.lossLimit!=null &&
              this.lossLimit.equals(other.getLossLimit()))) &&
            ((this.lossLimitFrequency==null && other.getLossLimitFrequency()==null) || 
             (this.lossLimitFrequency!=null &&
              this.lossLimitFrequency.equals(other.getLossLimitFrequency())));
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
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
        }
        if (getTownCity() != null) {
            _hashCode += getTownCity().hashCode();
        }
        if (getCountyState() != null) {
            _hashCode += getCountyState().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getCountryOfResidence() != null) {
            _hashCode += getCountryOfResidence().hashCode();
        }
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
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getDepositLimit() != null) {
            _hashCode += getDepositLimit().hashCode();
        }
        if (getDepositLimitFrequency() != null) {
            _hashCode += getDepositLimitFrequency().hashCode();
        }
        if (getLossLimit() != null) {
            _hashCode += getLossLimit().hashCode();
        }
        if (getLossLimitFrequency() != null) {
            _hashCode += getLossLimitFrequency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyProfileReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyProfileReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("townCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "townCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countyState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfResidence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryOfResidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositLimitFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositLimitFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GamcareLimitFreqEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lossLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossLimitFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lossLimitFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GamcareLimitFreqEnum"));
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
