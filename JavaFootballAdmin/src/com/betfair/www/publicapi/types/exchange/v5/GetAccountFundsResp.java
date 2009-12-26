/**
 * GetAccountFundsResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetAccountFundsResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private double availBalance;

    private double balance;

    private double commissionRetain;

    private double creditLimit;

    private int currentBetfairPoints;

    private double expoLimit;

    private double exposure;

    private int holidaysAvailable;

    private java.lang.String minorErrorCode;

    private double nextDiscount;

    private double withdrawBalance;

    private com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsErrorEnum errorCode;

    public GetAccountFundsResp() {
    }

    public GetAccountFundsResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           double availBalance,
           double balance,
           double commissionRetain,
           double creditLimit,
           int currentBetfairPoints,
           double expoLimit,
           double exposure,
           int holidaysAvailable,
           java.lang.String minorErrorCode,
           double nextDiscount,
           double withdrawBalance,
           com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsErrorEnum errorCode) {
        super(
            header);
        this.availBalance = availBalance;
        this.balance = balance;
        this.commissionRetain = commissionRetain;
        this.creditLimit = creditLimit;
        this.currentBetfairPoints = currentBetfairPoints;
        this.expoLimit = expoLimit;
        this.exposure = exposure;
        this.holidaysAvailable = holidaysAvailable;
        this.minorErrorCode = minorErrorCode;
        this.nextDiscount = nextDiscount;
        this.withdrawBalance = withdrawBalance;
        this.errorCode = errorCode;
    }


    /**
     * Gets the availBalance value for this GetAccountFundsResp.
     * 
     * @return availBalance
     */
    public double getAvailBalance() {
        return availBalance;
    }


    /**
     * Sets the availBalance value for this GetAccountFundsResp.
     * 
     * @param availBalance
     */
    public void setAvailBalance(double availBalance) {
        this.availBalance = availBalance;
    }


    /**
     * Gets the balance value for this GetAccountFundsResp.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this GetAccountFundsResp.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the commissionRetain value for this GetAccountFundsResp.
     * 
     * @return commissionRetain
     */
    public double getCommissionRetain() {
        return commissionRetain;
    }


    /**
     * Sets the commissionRetain value for this GetAccountFundsResp.
     * 
     * @param commissionRetain
     */
    public void setCommissionRetain(double commissionRetain) {
        this.commissionRetain = commissionRetain;
    }


    /**
     * Gets the creditLimit value for this GetAccountFundsResp.
     * 
     * @return creditLimit
     */
    public double getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this GetAccountFundsResp.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the currentBetfairPoints value for this GetAccountFundsResp.
     * 
     * @return currentBetfairPoints
     */
    public int getCurrentBetfairPoints() {
        return currentBetfairPoints;
    }


    /**
     * Sets the currentBetfairPoints value for this GetAccountFundsResp.
     * 
     * @param currentBetfairPoints
     */
    public void setCurrentBetfairPoints(int currentBetfairPoints) {
        this.currentBetfairPoints = currentBetfairPoints;
    }


    /**
     * Gets the expoLimit value for this GetAccountFundsResp.
     * 
     * @return expoLimit
     */
    public double getExpoLimit() {
        return expoLimit;
    }


    /**
     * Sets the expoLimit value for this GetAccountFundsResp.
     * 
     * @param expoLimit
     */
    public void setExpoLimit(double expoLimit) {
        this.expoLimit = expoLimit;
    }


    /**
     * Gets the exposure value for this GetAccountFundsResp.
     * 
     * @return exposure
     */
    public double getExposure() {
        return exposure;
    }


    /**
     * Sets the exposure value for this GetAccountFundsResp.
     * 
     * @param exposure
     */
    public void setExposure(double exposure) {
        this.exposure = exposure;
    }


    /**
     * Gets the holidaysAvailable value for this GetAccountFundsResp.
     * 
     * @return holidaysAvailable
     */
    public int getHolidaysAvailable() {
        return holidaysAvailable;
    }


    /**
     * Sets the holidaysAvailable value for this GetAccountFundsResp.
     * 
     * @param holidaysAvailable
     */
    public void setHolidaysAvailable(int holidaysAvailable) {
        this.holidaysAvailable = holidaysAvailable;
    }


    /**
     * Gets the minorErrorCode value for this GetAccountFundsResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetAccountFundsResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the nextDiscount value for this GetAccountFundsResp.
     * 
     * @return nextDiscount
     */
    public double getNextDiscount() {
        return nextDiscount;
    }


    /**
     * Sets the nextDiscount value for this GetAccountFundsResp.
     * 
     * @param nextDiscount
     */
    public void setNextDiscount(double nextDiscount) {
        this.nextDiscount = nextDiscount;
    }


    /**
     * Gets the withdrawBalance value for this GetAccountFundsResp.
     * 
     * @return withdrawBalance
     */
    public double getWithdrawBalance() {
        return withdrawBalance;
    }


    /**
     * Sets the withdrawBalance value for this GetAccountFundsResp.
     * 
     * @param withdrawBalance
     */
    public void setWithdrawBalance(double withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }


    /**
     * Gets the errorCode value for this GetAccountFundsResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetAccountFundsResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountFundsResp)) return false;
        GetAccountFundsResp other = (GetAccountFundsResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.availBalance == other.getAvailBalance() &&
            this.balance == other.getBalance() &&
            this.commissionRetain == other.getCommissionRetain() &&
            this.creditLimit == other.getCreditLimit() &&
            this.currentBetfairPoints == other.getCurrentBetfairPoints() &&
            this.expoLimit == other.getExpoLimit() &&
            this.exposure == other.getExposure() &&
            this.holidaysAvailable == other.getHolidaysAvailable() &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            this.nextDiscount == other.getNextDiscount() &&
            this.withdrawBalance == other.getWithdrawBalance() &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        _hashCode += new Double(getAvailBalance()).hashCode();
        _hashCode += new Double(getBalance()).hashCode();
        _hashCode += new Double(getCommissionRetain()).hashCode();
        _hashCode += new Double(getCreditLimit()).hashCode();
        _hashCode += getCurrentBetfairPoints();
        _hashCode += new Double(getExpoLimit()).hashCode();
        _hashCode += new Double(getExposure()).hashCode();
        _hashCode += getHolidaysAvailable();
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        _hashCode += new Double(getNextDiscount()).hashCode();
        _hashCode += new Double(getWithdrawBalance()).hashCode();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountFundsResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountFundsResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionRetain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionRetain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBetfairPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentBetfairPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expoLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expoLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidaysAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holidaysAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "withdrawBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountFundsErrorEnum"));
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
