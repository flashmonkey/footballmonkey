/**
 * PaymentCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class PaymentCard  implements java.io.Serializable {
    private java.lang.String nickName;

    private java.lang.String cardShortNumber;

    private java.lang.String expiryDate;

    private java.lang.String startDate;

    private java.lang.String issueNumber;

    private com.betfair.www.publicapi.types.global.v3.CardTypeEnum cardType;

    private java.lang.String issuingCountryIso3;

    private java.lang.Double totalDeposits;

    private java.lang.Double totalWithdrawals;

    private java.lang.Double netDeposits;

    private java.lang.String validationStatus;

    private java.lang.String billingName;

    private java.lang.String billingAddress1;

    private java.lang.String billingAddress2;

    private java.lang.String billingAddress3;

    private java.lang.String billingAddress4;

    private java.lang.String town;

    private java.lang.String county;

    private java.lang.String postcode;

    private java.lang.String billingCountryIso3;

    private com.betfair.www.publicapi.types.global.v3.PaymentCardStatusEnum cardStatus;

    public PaymentCard() {
    }

    public PaymentCard(
           java.lang.String nickName,
           java.lang.String cardShortNumber,
           java.lang.String expiryDate,
           java.lang.String startDate,
           java.lang.String issueNumber,
           com.betfair.www.publicapi.types.global.v3.CardTypeEnum cardType,
           java.lang.String issuingCountryIso3,
           java.lang.Double totalDeposits,
           java.lang.Double totalWithdrawals,
           java.lang.Double netDeposits,
           java.lang.String validationStatus,
           java.lang.String billingName,
           java.lang.String billingAddress1,
           java.lang.String billingAddress2,
           java.lang.String billingAddress3,
           java.lang.String billingAddress4,
           java.lang.String town,
           java.lang.String county,
           java.lang.String postcode,
           java.lang.String billingCountryIso3,
           com.betfair.www.publicapi.types.global.v3.PaymentCardStatusEnum cardStatus) {
           this.nickName = nickName;
           this.cardShortNumber = cardShortNumber;
           this.expiryDate = expiryDate;
           this.startDate = startDate;
           this.issueNumber = issueNumber;
           this.cardType = cardType;
           this.issuingCountryIso3 = issuingCountryIso3;
           this.totalDeposits = totalDeposits;
           this.totalWithdrawals = totalWithdrawals;
           this.netDeposits = netDeposits;
           this.validationStatus = validationStatus;
           this.billingName = billingName;
           this.billingAddress1 = billingAddress1;
           this.billingAddress2 = billingAddress2;
           this.billingAddress3 = billingAddress3;
           this.billingAddress4 = billingAddress4;
           this.town = town;
           this.county = county;
           this.postcode = postcode;
           this.billingCountryIso3 = billingCountryIso3;
           this.cardStatus = cardStatus;
    }


    /**
     * Gets the nickName value for this PaymentCard.
     * 
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this PaymentCard.
     * 
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the cardShortNumber value for this PaymentCard.
     * 
     * @return cardShortNumber
     */
    public java.lang.String getCardShortNumber() {
        return cardShortNumber;
    }


    /**
     * Sets the cardShortNumber value for this PaymentCard.
     * 
     * @param cardShortNumber
     */
    public void setCardShortNumber(java.lang.String cardShortNumber) {
        this.cardShortNumber = cardShortNumber;
    }


    /**
     * Gets the expiryDate value for this PaymentCard.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this PaymentCard.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the startDate value for this PaymentCard.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PaymentCard.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the issueNumber value for this PaymentCard.
     * 
     * @return issueNumber
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this PaymentCard.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the cardType value for this PaymentCard.
     * 
     * @return cardType
     */
    public com.betfair.www.publicapi.types.global.v3.CardTypeEnum getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this PaymentCard.
     * 
     * @param cardType
     */
    public void setCardType(com.betfair.www.publicapi.types.global.v3.CardTypeEnum cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the issuingCountryIso3 value for this PaymentCard.
     * 
     * @return issuingCountryIso3
     */
    public java.lang.String getIssuingCountryIso3() {
        return issuingCountryIso3;
    }


    /**
     * Sets the issuingCountryIso3 value for this PaymentCard.
     * 
     * @param issuingCountryIso3
     */
    public void setIssuingCountryIso3(java.lang.String issuingCountryIso3) {
        this.issuingCountryIso3 = issuingCountryIso3;
    }


    /**
     * Gets the totalDeposits value for this PaymentCard.
     * 
     * @return totalDeposits
     */
    public java.lang.Double getTotalDeposits() {
        return totalDeposits;
    }


    /**
     * Sets the totalDeposits value for this PaymentCard.
     * 
     * @param totalDeposits
     */
    public void setTotalDeposits(java.lang.Double totalDeposits) {
        this.totalDeposits = totalDeposits;
    }


    /**
     * Gets the totalWithdrawals value for this PaymentCard.
     * 
     * @return totalWithdrawals
     */
    public java.lang.Double getTotalWithdrawals() {
        return totalWithdrawals;
    }


    /**
     * Sets the totalWithdrawals value for this PaymentCard.
     * 
     * @param totalWithdrawals
     */
    public void setTotalWithdrawals(java.lang.Double totalWithdrawals) {
        this.totalWithdrawals = totalWithdrawals;
    }


    /**
     * Gets the netDeposits value for this PaymentCard.
     * 
     * @return netDeposits
     */
    public java.lang.Double getNetDeposits() {
        return netDeposits;
    }


    /**
     * Sets the netDeposits value for this PaymentCard.
     * 
     * @param netDeposits
     */
    public void setNetDeposits(java.lang.Double netDeposits) {
        this.netDeposits = netDeposits;
    }


    /**
     * Gets the validationStatus value for this PaymentCard.
     * 
     * @return validationStatus
     */
    public java.lang.String getValidationStatus() {
        return validationStatus;
    }


    /**
     * Sets the validationStatus value for this PaymentCard.
     * 
     * @param validationStatus
     */
    public void setValidationStatus(java.lang.String validationStatus) {
        this.validationStatus = validationStatus;
    }


    /**
     * Gets the billingName value for this PaymentCard.
     * 
     * @return billingName
     */
    public java.lang.String getBillingName() {
        return billingName;
    }


    /**
     * Sets the billingName value for this PaymentCard.
     * 
     * @param billingName
     */
    public void setBillingName(java.lang.String billingName) {
        this.billingName = billingName;
    }


    /**
     * Gets the billingAddress1 value for this PaymentCard.
     * 
     * @return billingAddress1
     */
    public java.lang.String getBillingAddress1() {
        return billingAddress1;
    }


    /**
     * Sets the billingAddress1 value for this PaymentCard.
     * 
     * @param billingAddress1
     */
    public void setBillingAddress1(java.lang.String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }


    /**
     * Gets the billingAddress2 value for this PaymentCard.
     * 
     * @return billingAddress2
     */
    public java.lang.String getBillingAddress2() {
        return billingAddress2;
    }


    /**
     * Sets the billingAddress2 value for this PaymentCard.
     * 
     * @param billingAddress2
     */
    public void setBillingAddress2(java.lang.String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }


    /**
     * Gets the billingAddress3 value for this PaymentCard.
     * 
     * @return billingAddress3
     */
    public java.lang.String getBillingAddress3() {
        return billingAddress3;
    }


    /**
     * Sets the billingAddress3 value for this PaymentCard.
     * 
     * @param billingAddress3
     */
    public void setBillingAddress3(java.lang.String billingAddress3) {
        this.billingAddress3 = billingAddress3;
    }


    /**
     * Gets the billingAddress4 value for this PaymentCard.
     * 
     * @return billingAddress4
     */
    public java.lang.String getBillingAddress4() {
        return billingAddress4;
    }


    /**
     * Sets the billingAddress4 value for this PaymentCard.
     * 
     * @param billingAddress4
     */
    public void setBillingAddress4(java.lang.String billingAddress4) {
        this.billingAddress4 = billingAddress4;
    }


    /**
     * Gets the town value for this PaymentCard.
     * 
     * @return town
     */
    public java.lang.String getTown() {
        return town;
    }


    /**
     * Sets the town value for this PaymentCard.
     * 
     * @param town
     */
    public void setTown(java.lang.String town) {
        this.town = town;
    }


    /**
     * Gets the county value for this PaymentCard.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this PaymentCard.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the postcode value for this PaymentCard.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this PaymentCard.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the billingCountryIso3 value for this PaymentCard.
     * 
     * @return billingCountryIso3
     */
    public java.lang.String getBillingCountryIso3() {
        return billingCountryIso3;
    }


    /**
     * Sets the billingCountryIso3 value for this PaymentCard.
     * 
     * @param billingCountryIso3
     */
    public void setBillingCountryIso3(java.lang.String billingCountryIso3) {
        this.billingCountryIso3 = billingCountryIso3;
    }


    /**
     * Gets the cardStatus value for this PaymentCard.
     * 
     * @return cardStatus
     */
    public com.betfair.www.publicapi.types.global.v3.PaymentCardStatusEnum getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this PaymentCard.
     * 
     * @param cardStatus
     */
    public void setCardStatus(com.betfair.www.publicapi.types.global.v3.PaymentCardStatusEnum cardStatus) {
        this.cardStatus = cardStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentCard)) return false;
        PaymentCard other = (PaymentCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.cardShortNumber==null && other.getCardShortNumber()==null) || 
             (this.cardShortNumber!=null &&
              this.cardShortNumber.equals(other.getCardShortNumber()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.issuingCountryIso3==null && other.getIssuingCountryIso3()==null) || 
             (this.issuingCountryIso3!=null &&
              this.issuingCountryIso3.equals(other.getIssuingCountryIso3()))) &&
            ((this.totalDeposits==null && other.getTotalDeposits()==null) || 
             (this.totalDeposits!=null &&
              this.totalDeposits.equals(other.getTotalDeposits()))) &&
            ((this.totalWithdrawals==null && other.getTotalWithdrawals()==null) || 
             (this.totalWithdrawals!=null &&
              this.totalWithdrawals.equals(other.getTotalWithdrawals()))) &&
            ((this.netDeposits==null && other.getNetDeposits()==null) || 
             (this.netDeposits!=null &&
              this.netDeposits.equals(other.getNetDeposits()))) &&
            ((this.validationStatus==null && other.getValidationStatus()==null) || 
             (this.validationStatus!=null &&
              this.validationStatus.equals(other.getValidationStatus()))) &&
            ((this.billingName==null && other.getBillingName()==null) || 
             (this.billingName!=null &&
              this.billingName.equals(other.getBillingName()))) &&
            ((this.billingAddress1==null && other.getBillingAddress1()==null) || 
             (this.billingAddress1!=null &&
              this.billingAddress1.equals(other.getBillingAddress1()))) &&
            ((this.billingAddress2==null && other.getBillingAddress2()==null) || 
             (this.billingAddress2!=null &&
              this.billingAddress2.equals(other.getBillingAddress2()))) &&
            ((this.billingAddress3==null && other.getBillingAddress3()==null) || 
             (this.billingAddress3!=null &&
              this.billingAddress3.equals(other.getBillingAddress3()))) &&
            ((this.billingAddress4==null && other.getBillingAddress4()==null) || 
             (this.billingAddress4!=null &&
              this.billingAddress4.equals(other.getBillingAddress4()))) &&
            ((this.town==null && other.getTown()==null) || 
             (this.town!=null &&
              this.town.equals(other.getTown()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.billingCountryIso3==null && other.getBillingCountryIso3()==null) || 
             (this.billingCountryIso3!=null &&
              this.billingCountryIso3.equals(other.getBillingCountryIso3()))) &&
            ((this.cardStatus==null && other.getCardStatus()==null) || 
             (this.cardStatus!=null &&
              this.cardStatus.equals(other.getCardStatus())));
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
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getCardShortNumber() != null) {
            _hashCode += getCardShortNumber().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getIssuingCountryIso3() != null) {
            _hashCode += getIssuingCountryIso3().hashCode();
        }
        if (getTotalDeposits() != null) {
            _hashCode += getTotalDeposits().hashCode();
        }
        if (getTotalWithdrawals() != null) {
            _hashCode += getTotalWithdrawals().hashCode();
        }
        if (getNetDeposits() != null) {
            _hashCode += getNetDeposits().hashCode();
        }
        if (getValidationStatus() != null) {
            _hashCode += getValidationStatus().hashCode();
        }
        if (getBillingName() != null) {
            _hashCode += getBillingName().hashCode();
        }
        if (getBillingAddress1() != null) {
            _hashCode += getBillingAddress1().hashCode();
        }
        if (getBillingAddress2() != null) {
            _hashCode += getBillingAddress2().hashCode();
        }
        if (getBillingAddress3() != null) {
            _hashCode += getBillingAddress3().hashCode();
        }
        if (getBillingAddress4() != null) {
            _hashCode += getBillingAddress4().hashCode();
        }
        if (getTown() != null) {
            _hashCode += getTown().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getBillingCountryIso3() != null) {
            _hashCode += getBillingCountryIso3().hashCode();
        }
        if (getCardStatus() != null) {
            _hashCode += getCardStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nickName"));
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
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CardTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuingCountryIso3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuingCountryIso3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDeposits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDeposits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWithdrawals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalWithdrawals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netDeposits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netDeposits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAddress4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("town");
        elemField.setXmlName(new javax.xml.namespace.QName("", "town"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCountryIso3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCountryIso3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentCardStatusEnum"));
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
