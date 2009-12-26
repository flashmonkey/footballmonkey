/**
 * ViewProfileResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ViewProfileResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private java.lang.String minorErrorCode;

    private com.betfair.www.publicapi.types.global.v3.ViewProfileErrorEnum errorCode;

    private com.betfair.www.publicapi.types.global.v3.TitleEnum title;

    private java.lang.String firstName;

    private java.lang.String surname;

    private java.lang.String userName;

    private java.lang.String forumName;

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

    private java.lang.String currency;

    private java.lang.Integer gamcareLimit;

    private com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum gamcareFrequency;

    private java.lang.Integer gamcareLossLimit;

    private com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum gamcareLossLimitFrequency;

    private java.util.Calendar gamcareUpdateDate;

    public ViewProfileResp() {
    }

    public ViewProfileResp(
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
           java.util.Calendar gamcareUpdateDate) {
        super(
            header);
        this.minorErrorCode = minorErrorCode;
        this.errorCode = errorCode;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.userName = userName;
        this.forumName = forumName;
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
        this.currency = currency;
        this.gamcareLimit = gamcareLimit;
        this.gamcareFrequency = gamcareFrequency;
        this.gamcareLossLimit = gamcareLossLimit;
        this.gamcareLossLimitFrequency = gamcareLossLimitFrequency;
        this.gamcareUpdateDate = gamcareUpdateDate;
    }


    /**
     * Gets the minorErrorCode value for this ViewProfileResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this ViewProfileResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the errorCode value for this ViewProfileResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.ViewProfileErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ViewProfileResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.ViewProfileErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the title value for this ViewProfileResp.
     * 
     * @return title
     */
    public com.betfair.www.publicapi.types.global.v3.TitleEnum getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ViewProfileResp.
     * 
     * @param title
     */
    public void setTitle(com.betfair.www.publicapi.types.global.v3.TitleEnum title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this ViewProfileResp.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this ViewProfileResp.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the surname value for this ViewProfileResp.
     * 
     * @return surname
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this ViewProfileResp.
     * 
     * @param surname
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }


    /**
     * Gets the userName value for this ViewProfileResp.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ViewProfileResp.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the forumName value for this ViewProfileResp.
     * 
     * @return forumName
     */
    public java.lang.String getForumName() {
        return forumName;
    }


    /**
     * Sets the forumName value for this ViewProfileResp.
     * 
     * @param forumName
     */
    public void setForumName(java.lang.String forumName) {
        this.forumName = forumName;
    }


    /**
     * Gets the address1 value for this ViewProfileResp.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this ViewProfileResp.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this ViewProfileResp.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this ViewProfileResp.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this ViewProfileResp.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this ViewProfileResp.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the townCity value for this ViewProfileResp.
     * 
     * @return townCity
     */
    public java.lang.String getTownCity() {
        return townCity;
    }


    /**
     * Sets the townCity value for this ViewProfileResp.
     * 
     * @param townCity
     */
    public void setTownCity(java.lang.String townCity) {
        this.townCity = townCity;
    }


    /**
     * Gets the countyState value for this ViewProfileResp.
     * 
     * @return countyState
     */
    public java.lang.String getCountyState() {
        return countyState;
    }


    /**
     * Sets the countyState value for this ViewProfileResp.
     * 
     * @param countyState
     */
    public void setCountyState(java.lang.String countyState) {
        this.countyState = countyState;
    }


    /**
     * Gets the postCode value for this ViewProfileResp.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this ViewProfileResp.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the countryOfResidence value for this ViewProfileResp.
     * 
     * @return countryOfResidence
     */
    public java.lang.String getCountryOfResidence() {
        return countryOfResidence;
    }


    /**
     * Sets the countryOfResidence value for this ViewProfileResp.
     * 
     * @param countryOfResidence
     */
    public void setCountryOfResidence(java.lang.String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }


    /**
     * Gets the homeTelephone value for this ViewProfileResp.
     * 
     * @return homeTelephone
     */
    public java.lang.String getHomeTelephone() {
        return homeTelephone;
    }


    /**
     * Sets the homeTelephone value for this ViewProfileResp.
     * 
     * @param homeTelephone
     */
    public void setHomeTelephone(java.lang.String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }


    /**
     * Gets the workTelephone value for this ViewProfileResp.
     * 
     * @return workTelephone
     */
    public java.lang.String getWorkTelephone() {
        return workTelephone;
    }


    /**
     * Sets the workTelephone value for this ViewProfileResp.
     * 
     * @param workTelephone
     */
    public void setWorkTelephone(java.lang.String workTelephone) {
        this.workTelephone = workTelephone;
    }


    /**
     * Gets the mobileTelephone value for this ViewProfileResp.
     * 
     * @return mobileTelephone
     */
    public java.lang.String getMobileTelephone() {
        return mobileTelephone;
    }


    /**
     * Sets the mobileTelephone value for this ViewProfileResp.
     * 
     * @param mobileTelephone
     */
    public void setMobileTelephone(java.lang.String mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }


    /**
     * Gets the emailAddress value for this ViewProfileResp.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this ViewProfileResp.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the timeZone value for this ViewProfileResp.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this ViewProfileResp.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the currency value for this ViewProfileResp.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ViewProfileResp.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the gamcareLimit value for this ViewProfileResp.
     * 
     * @return gamcareLimit
     */
    public java.lang.Integer getGamcareLimit() {
        return gamcareLimit;
    }


    /**
     * Sets the gamcareLimit value for this ViewProfileResp.
     * 
     * @param gamcareLimit
     */
    public void setGamcareLimit(java.lang.Integer gamcareLimit) {
        this.gamcareLimit = gamcareLimit;
    }


    /**
     * Gets the gamcareFrequency value for this ViewProfileResp.
     * 
     * @return gamcareFrequency
     */
    public com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum getGamcareFrequency() {
        return gamcareFrequency;
    }


    /**
     * Sets the gamcareFrequency value for this ViewProfileResp.
     * 
     * @param gamcareFrequency
     */
    public void setGamcareFrequency(com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum gamcareFrequency) {
        this.gamcareFrequency = gamcareFrequency;
    }


    /**
     * Gets the gamcareLossLimit value for this ViewProfileResp.
     * 
     * @return gamcareLossLimit
     */
    public java.lang.Integer getGamcareLossLimit() {
        return gamcareLossLimit;
    }


    /**
     * Sets the gamcareLossLimit value for this ViewProfileResp.
     * 
     * @param gamcareLossLimit
     */
    public void setGamcareLossLimit(java.lang.Integer gamcareLossLimit) {
        this.gamcareLossLimit = gamcareLossLimit;
    }


    /**
     * Gets the gamcareLossLimitFrequency value for this ViewProfileResp.
     * 
     * @return gamcareLossLimitFrequency
     */
    public com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum getGamcareLossLimitFrequency() {
        return gamcareLossLimitFrequency;
    }


    /**
     * Sets the gamcareLossLimitFrequency value for this ViewProfileResp.
     * 
     * @param gamcareLossLimitFrequency
     */
    public void setGamcareLossLimitFrequency(com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum gamcareLossLimitFrequency) {
        this.gamcareLossLimitFrequency = gamcareLossLimitFrequency;
    }


    /**
     * Gets the gamcareUpdateDate value for this ViewProfileResp.
     * 
     * @return gamcareUpdateDate
     */
    public java.util.Calendar getGamcareUpdateDate() {
        return gamcareUpdateDate;
    }


    /**
     * Sets the gamcareUpdateDate value for this ViewProfileResp.
     * 
     * @param gamcareUpdateDate
     */
    public void setGamcareUpdateDate(java.util.Calendar gamcareUpdateDate) {
        this.gamcareUpdateDate = gamcareUpdateDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewProfileResp)) return false;
        ViewProfileResp other = (ViewProfileResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.forumName==null && other.getForumName()==null) || 
             (this.forumName!=null &&
              this.forumName.equals(other.getForumName()))) &&
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.gamcareLimit==null && other.getGamcareLimit()==null) || 
             (this.gamcareLimit!=null &&
              this.gamcareLimit.equals(other.getGamcareLimit()))) &&
            ((this.gamcareFrequency==null && other.getGamcareFrequency()==null) || 
             (this.gamcareFrequency!=null &&
              this.gamcareFrequency.equals(other.getGamcareFrequency()))) &&
            ((this.gamcareLossLimit==null && other.getGamcareLossLimit()==null) || 
             (this.gamcareLossLimit!=null &&
              this.gamcareLossLimit.equals(other.getGamcareLossLimit()))) &&
            ((this.gamcareLossLimitFrequency==null && other.getGamcareLossLimitFrequency()==null) || 
             (this.gamcareLossLimitFrequency!=null &&
              this.gamcareLossLimitFrequency.equals(other.getGamcareLossLimitFrequency()))) &&
            ((this.gamcareUpdateDate==null && other.getGamcareUpdateDate()==null) || 
             (this.gamcareUpdateDate!=null &&
              this.gamcareUpdateDate.equals(other.getGamcareUpdateDate())));
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
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getForumName() != null) {
            _hashCode += getForumName().hashCode();
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getGamcareLimit() != null) {
            _hashCode += getGamcareLimit().hashCode();
        }
        if (getGamcareFrequency() != null) {
            _hashCode += getGamcareFrequency().hashCode();
        }
        if (getGamcareLossLimit() != null) {
            _hashCode += getGamcareLossLimit().hashCode();
        }
        if (getGamcareLossLimitFrequency() != null) {
            _hashCode += getGamcareLossLimitFrequency().hashCode();
        }
        if (getGamcareUpdateDate() != null) {
            _hashCode += getGamcareUpdateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewProfileResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TitleEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forumName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forumName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamcareLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gamcareLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamcareFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gamcareFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GamcareLimitFreqEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamcareLossLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gamcareLossLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamcareLossLimitFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gamcareLossLimitFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GamcareLimitFreqEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gamcareUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gamcareUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
