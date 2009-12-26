/**
 * AccountStatementItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class AccountStatementItem  implements java.io.Serializable {
    private double accountBalance;

    private double amount;

    private double avgPrice;

    private long betId;

    private double betSize;

    private com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType;

    private com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType;

    private java.lang.String commissionRate;

    private int eventId;

    private int eventTypeId;

    private java.lang.String fullMarketName;

    private double grossBetAmount;

    private java.lang.String marketName;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType;

    private java.util.Calendar placedDate;

    private int selectionId;

    private java.lang.String selectionName;

    private java.util.Calendar settledDate;

    private java.util.Calendar startDate;

    private com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum transactionType;

    private long transactionId;

    private com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum winLose;

    public AccountStatementItem() {
    }

    public AccountStatementItem(
           double accountBalance,
           double amount,
           double avgPrice,
           long betId,
           double betSize,
           com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType,
           com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType,
           java.lang.String commissionRate,
           int eventId,
           int eventTypeId,
           java.lang.String fullMarketName,
           double grossBetAmount,
           java.lang.String marketName,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType,
           java.util.Calendar placedDate,
           int selectionId,
           java.lang.String selectionName,
           java.util.Calendar settledDate,
           java.util.Calendar startDate,
           com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum transactionType,
           long transactionId,
           com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum winLose) {
           this.accountBalance = accountBalance;
           this.amount = amount;
           this.avgPrice = avgPrice;
           this.betId = betId;
           this.betSize = betSize;
           this.betType = betType;
           this.betCategoryType = betCategoryType;
           this.commissionRate = commissionRate;
           this.eventId = eventId;
           this.eventTypeId = eventTypeId;
           this.fullMarketName = fullMarketName;
           this.grossBetAmount = grossBetAmount;
           this.marketName = marketName;
           this.marketType = marketType;
           this.placedDate = placedDate;
           this.selectionId = selectionId;
           this.selectionName = selectionName;
           this.settledDate = settledDate;
           this.startDate = startDate;
           this.transactionType = transactionType;
           this.transactionId = transactionId;
           this.winLose = winLose;
    }


    /**
     * Gets the accountBalance value for this AccountStatementItem.
     * 
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this AccountStatementItem.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the amount value for this AccountStatementItem.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AccountStatementItem.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the avgPrice value for this AccountStatementItem.
     * 
     * @return avgPrice
     */
    public double getAvgPrice() {
        return avgPrice;
    }


    /**
     * Sets the avgPrice value for this AccountStatementItem.
     * 
     * @param avgPrice
     */
    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }


    /**
     * Gets the betId value for this AccountStatementItem.
     * 
     * @return betId
     */
    public long getBetId() {
        return betId;
    }


    /**
     * Sets the betId value for this AccountStatementItem.
     * 
     * @param betId
     */
    public void setBetId(long betId) {
        this.betId = betId;
    }


    /**
     * Gets the betSize value for this AccountStatementItem.
     * 
     * @return betSize
     */
    public double getBetSize() {
        return betSize;
    }


    /**
     * Sets the betSize value for this AccountStatementItem.
     * 
     * @param betSize
     */
    public void setBetSize(double betSize) {
        this.betSize = betSize;
    }


    /**
     * Gets the betType value for this AccountStatementItem.
     * 
     * @return betType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum getBetType() {
        return betType;
    }


    /**
     * Sets the betType value for this AccountStatementItem.
     * 
     * @param betType
     */
    public void setBetType(com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum betType) {
        this.betType = betType;
    }


    /**
     * Gets the betCategoryType value for this AccountStatementItem.
     * 
     * @return betCategoryType
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum getBetCategoryType() {
        return betCategoryType;
    }


    /**
     * Sets the betCategoryType value for this AccountStatementItem.
     * 
     * @param betCategoryType
     */
    public void setBetCategoryType(com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum betCategoryType) {
        this.betCategoryType = betCategoryType;
    }


    /**
     * Gets the commissionRate value for this AccountStatementItem.
     * 
     * @return commissionRate
     */
    public java.lang.String getCommissionRate() {
        return commissionRate;
    }


    /**
     * Sets the commissionRate value for this AccountStatementItem.
     * 
     * @param commissionRate
     */
    public void setCommissionRate(java.lang.String commissionRate) {
        this.commissionRate = commissionRate;
    }


    /**
     * Gets the eventId value for this AccountStatementItem.
     * 
     * @return eventId
     */
    public int getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this AccountStatementItem.
     * 
     * @param eventId
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the eventTypeId value for this AccountStatementItem.
     * 
     * @return eventTypeId
     */
    public int getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this AccountStatementItem.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the fullMarketName value for this AccountStatementItem.
     * 
     * @return fullMarketName
     */
    public java.lang.String getFullMarketName() {
        return fullMarketName;
    }


    /**
     * Sets the fullMarketName value for this AccountStatementItem.
     * 
     * @param fullMarketName
     */
    public void setFullMarketName(java.lang.String fullMarketName) {
        this.fullMarketName = fullMarketName;
    }


    /**
     * Gets the grossBetAmount value for this AccountStatementItem.
     * 
     * @return grossBetAmount
     */
    public double getGrossBetAmount() {
        return grossBetAmount;
    }


    /**
     * Sets the grossBetAmount value for this AccountStatementItem.
     * 
     * @param grossBetAmount
     */
    public void setGrossBetAmount(double grossBetAmount) {
        this.grossBetAmount = grossBetAmount;
    }


    /**
     * Gets the marketName value for this AccountStatementItem.
     * 
     * @return marketName
     */
    public java.lang.String getMarketName() {
        return marketName;
    }


    /**
     * Sets the marketName value for this AccountStatementItem.
     * 
     * @param marketName
     */
    public void setMarketName(java.lang.String marketName) {
        this.marketName = marketName;
    }


    /**
     * Gets the marketType value for this AccountStatementItem.
     * 
     * @return marketType
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum getMarketType() {
        return marketType;
    }


    /**
     * Sets the marketType value for this AccountStatementItem.
     * 
     * @param marketType
     */
    public void setMarketType(com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType) {
        this.marketType = marketType;
    }


    /**
     * Gets the placedDate value for this AccountStatementItem.
     * 
     * @return placedDate
     */
    public java.util.Calendar getPlacedDate() {
        return placedDate;
    }


    /**
     * Sets the placedDate value for this AccountStatementItem.
     * 
     * @param placedDate
     */
    public void setPlacedDate(java.util.Calendar placedDate) {
        this.placedDate = placedDate;
    }


    /**
     * Gets the selectionId value for this AccountStatementItem.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this AccountStatementItem.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }


    /**
     * Gets the selectionName value for this AccountStatementItem.
     * 
     * @return selectionName
     */
    public java.lang.String getSelectionName() {
        return selectionName;
    }


    /**
     * Sets the selectionName value for this AccountStatementItem.
     * 
     * @param selectionName
     */
    public void setSelectionName(java.lang.String selectionName) {
        this.selectionName = selectionName;
    }


    /**
     * Gets the settledDate value for this AccountStatementItem.
     * 
     * @return settledDate
     */
    public java.util.Calendar getSettledDate() {
        return settledDate;
    }


    /**
     * Sets the settledDate value for this AccountStatementItem.
     * 
     * @param settledDate
     */
    public void setSettledDate(java.util.Calendar settledDate) {
        this.settledDate = settledDate;
    }


    /**
     * Gets the startDate value for this AccountStatementItem.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AccountStatementItem.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the transactionType value for this AccountStatementItem.
     * 
     * @return transactionType
     */
    public com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this AccountStatementItem.
     * 
     * @param transactionType
     */
    public void setTransactionType(com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the transactionId value for this AccountStatementItem.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AccountStatementItem.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the winLose value for this AccountStatementItem.
     * 
     * @return winLose
     */
    public com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum getWinLose() {
        return winLose;
    }


    /**
     * Sets the winLose value for this AccountStatementItem.
     * 
     * @param winLose
     */
    public void setWinLose(com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum winLose) {
        this.winLose = winLose;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountStatementItem)) return false;
        AccountStatementItem other = (AccountStatementItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountBalance == other.getAccountBalance() &&
            this.amount == other.getAmount() &&
            this.avgPrice == other.getAvgPrice() &&
            this.betId == other.getBetId() &&
            this.betSize == other.getBetSize() &&
            ((this.betType==null && other.getBetType()==null) || 
             (this.betType!=null &&
              this.betType.equals(other.getBetType()))) &&
            ((this.betCategoryType==null && other.getBetCategoryType()==null) || 
             (this.betCategoryType!=null &&
              this.betCategoryType.equals(other.getBetCategoryType()))) &&
            ((this.commissionRate==null && other.getCommissionRate()==null) || 
             (this.commissionRate!=null &&
              this.commissionRate.equals(other.getCommissionRate()))) &&
            this.eventId == other.getEventId() &&
            this.eventTypeId == other.getEventTypeId() &&
            ((this.fullMarketName==null && other.getFullMarketName()==null) || 
             (this.fullMarketName!=null &&
              this.fullMarketName.equals(other.getFullMarketName()))) &&
            this.grossBetAmount == other.getGrossBetAmount() &&
            ((this.marketName==null && other.getMarketName()==null) || 
             (this.marketName!=null &&
              this.marketName.equals(other.getMarketName()))) &&
            ((this.marketType==null && other.getMarketType()==null) || 
             (this.marketType!=null &&
              this.marketType.equals(other.getMarketType()))) &&
            ((this.placedDate==null && other.getPlacedDate()==null) || 
             (this.placedDate!=null &&
              this.placedDate.equals(other.getPlacedDate()))) &&
            this.selectionId == other.getSelectionId() &&
            ((this.selectionName==null && other.getSelectionName()==null) || 
             (this.selectionName!=null &&
              this.selectionName.equals(other.getSelectionName()))) &&
            ((this.settledDate==null && other.getSettledDate()==null) || 
             (this.settledDate!=null &&
              this.settledDate.equals(other.getSettledDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            this.transactionId == other.getTransactionId() &&
            ((this.winLose==null && other.getWinLose()==null) || 
             (this.winLose!=null &&
              this.winLose.equals(other.getWinLose())));
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
        _hashCode += new Double(getAccountBalance()).hashCode();
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += new Double(getAvgPrice()).hashCode();
        _hashCode += new Long(getBetId()).hashCode();
        _hashCode += new Double(getBetSize()).hashCode();
        if (getBetType() != null) {
            _hashCode += getBetType().hashCode();
        }
        if (getBetCategoryType() != null) {
            _hashCode += getBetCategoryType().hashCode();
        }
        if (getCommissionRate() != null) {
            _hashCode += getCommissionRate().hashCode();
        }
        _hashCode += getEventId();
        _hashCode += getEventTypeId();
        if (getFullMarketName() != null) {
            _hashCode += getFullMarketName().hashCode();
        }
        _hashCode += new Double(getGrossBetAmount()).hashCode();
        if (getMarketName() != null) {
            _hashCode += getMarketName().hashCode();
        }
        if (getMarketType() != null) {
            _hashCode += getMarketType().hashCode();
        }
        if (getPlacedDate() != null) {
            _hashCode += getPlacedDate().hashCode();
        }
        _hashCode += getSelectionId();
        if (getSelectionName() != null) {
            _hashCode += getSelectionName().hashCode();
        }
        if (getSettledDate() != null) {
            _hashCode += getSettledDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        _hashCode += new Long(getTransactionId()).hashCode();
        if (getWinLose() != null) {
            _hashCode += getWinLose().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountStatementItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avgPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avgPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetCategoryTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullMarketName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullMarketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossBetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grossBetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winLose");
        elemField.setXmlName(new javax.xml.namespace.QName("", "winLose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementEnum"));
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
