/**
 * MarketPrices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class MarketPrices  implements java.io.Serializable {
    private java.lang.String currencyCode;

    private int delay;

    private boolean discountAllowed;

    private long lastRefresh;

    private float marketBaseRate;

    private int marketId;

    private java.lang.String marketInfo;

    private java.lang.String removedRunners;

    private com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus;

    private int numberOfWinners;

    private boolean bspMarket;

    private com.betfair.www.publicapi.types.exchange.v5.RunnerPrices[] runnerPrices;

    public MarketPrices() {
    }

    public MarketPrices(
           java.lang.String currencyCode,
           int delay,
           boolean discountAllowed,
           long lastRefresh,
           float marketBaseRate,
           int marketId,
           java.lang.String marketInfo,
           java.lang.String removedRunners,
           com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus,
           int numberOfWinners,
           boolean bspMarket,
           com.betfair.www.publicapi.types.exchange.v5.RunnerPrices[] runnerPrices) {
           this.currencyCode = currencyCode;
           this.delay = delay;
           this.discountAllowed = discountAllowed;
           this.lastRefresh = lastRefresh;
           this.marketBaseRate = marketBaseRate;
           this.marketId = marketId;
           this.marketInfo = marketInfo;
           this.removedRunners = removedRunners;
           this.marketStatus = marketStatus;
           this.numberOfWinners = numberOfWinners;
           this.bspMarket = bspMarket;
           this.runnerPrices = runnerPrices;
    }


    /**
     * Gets the currencyCode value for this MarketPrices.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this MarketPrices.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the delay value for this MarketPrices.
     * 
     * @return delay
     */
    public int getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this MarketPrices.
     * 
     * @param delay
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }


    /**
     * Gets the discountAllowed value for this MarketPrices.
     * 
     * @return discountAllowed
     */
    public boolean isDiscountAllowed() {
        return discountAllowed;
    }


    /**
     * Sets the discountAllowed value for this MarketPrices.
     * 
     * @param discountAllowed
     */
    public void setDiscountAllowed(boolean discountAllowed) {
        this.discountAllowed = discountAllowed;
    }


    /**
     * Gets the lastRefresh value for this MarketPrices.
     * 
     * @return lastRefresh
     */
    public long getLastRefresh() {
        return lastRefresh;
    }


    /**
     * Sets the lastRefresh value for this MarketPrices.
     * 
     * @param lastRefresh
     */
    public void setLastRefresh(long lastRefresh) {
        this.lastRefresh = lastRefresh;
    }


    /**
     * Gets the marketBaseRate value for this MarketPrices.
     * 
     * @return marketBaseRate
     */
    public float getMarketBaseRate() {
        return marketBaseRate;
    }


    /**
     * Sets the marketBaseRate value for this MarketPrices.
     * 
     * @param marketBaseRate
     */
    public void setMarketBaseRate(float marketBaseRate) {
        this.marketBaseRate = marketBaseRate;
    }


    /**
     * Gets the marketId value for this MarketPrices.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this MarketPrices.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the marketInfo value for this MarketPrices.
     * 
     * @return marketInfo
     */
    public java.lang.String getMarketInfo() {
        return marketInfo;
    }


    /**
     * Sets the marketInfo value for this MarketPrices.
     * 
     * @param marketInfo
     */
    public void setMarketInfo(java.lang.String marketInfo) {
        this.marketInfo = marketInfo;
    }


    /**
     * Gets the removedRunners value for this MarketPrices.
     * 
     * @return removedRunners
     */
    public java.lang.String getRemovedRunners() {
        return removedRunners;
    }


    /**
     * Sets the removedRunners value for this MarketPrices.
     * 
     * @param removedRunners
     */
    public void setRemovedRunners(java.lang.String removedRunners) {
        this.removedRunners = removedRunners;
    }


    /**
     * Gets the marketStatus value for this MarketPrices.
     * 
     * @return marketStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum getMarketStatus() {
        return marketStatus;
    }


    /**
     * Sets the marketStatus value for this MarketPrices.
     * 
     * @param marketStatus
     */
    public void setMarketStatus(com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus) {
        this.marketStatus = marketStatus;
    }


    /**
     * Gets the numberOfWinners value for this MarketPrices.
     * 
     * @return numberOfWinners
     */
    public int getNumberOfWinners() {
        return numberOfWinners;
    }


    /**
     * Sets the numberOfWinners value for this MarketPrices.
     * 
     * @param numberOfWinners
     */
    public void setNumberOfWinners(int numberOfWinners) {
        this.numberOfWinners = numberOfWinners;
    }


    /**
     * Gets the bspMarket value for this MarketPrices.
     * 
     * @return bspMarket
     */
    public boolean isBspMarket() {
        return bspMarket;
    }


    /**
     * Sets the bspMarket value for this MarketPrices.
     * 
     * @param bspMarket
     */
    public void setBspMarket(boolean bspMarket) {
        this.bspMarket = bspMarket;
    }


    /**
     * Gets the runnerPrices value for this MarketPrices.
     * 
     * @return runnerPrices
     */
    public com.betfair.www.publicapi.types.exchange.v5.RunnerPrices[] getRunnerPrices() {
        return runnerPrices;
    }


    /**
     * Sets the runnerPrices value for this MarketPrices.
     * 
     * @param runnerPrices
     */
    public void setRunnerPrices(com.betfair.www.publicapi.types.exchange.v5.RunnerPrices[] runnerPrices) {
        this.runnerPrices = runnerPrices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarketPrices)) return false;
        MarketPrices other = (MarketPrices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            this.delay == other.getDelay() &&
            this.discountAllowed == other.isDiscountAllowed() &&
            this.lastRefresh == other.getLastRefresh() &&
            this.marketBaseRate == other.getMarketBaseRate() &&
            this.marketId == other.getMarketId() &&
            ((this.marketInfo==null && other.getMarketInfo()==null) || 
             (this.marketInfo!=null &&
              this.marketInfo.equals(other.getMarketInfo()))) &&
            ((this.removedRunners==null && other.getRemovedRunners()==null) || 
             (this.removedRunners!=null &&
              this.removedRunners.equals(other.getRemovedRunners()))) &&
            ((this.marketStatus==null && other.getMarketStatus()==null) || 
             (this.marketStatus!=null &&
              this.marketStatus.equals(other.getMarketStatus()))) &&
            this.numberOfWinners == other.getNumberOfWinners() &&
            this.bspMarket == other.isBspMarket() &&
            ((this.runnerPrices==null && other.getRunnerPrices()==null) || 
             (this.runnerPrices!=null &&
              java.util.Arrays.equals(this.runnerPrices, other.getRunnerPrices())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        _hashCode += getDelay();
        _hashCode += (isDiscountAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLastRefresh()).hashCode();
        _hashCode += new Float(getMarketBaseRate()).hashCode();
        _hashCode += getMarketId();
        if (getMarketInfo() != null) {
            _hashCode += getMarketInfo().hashCode();
        }
        if (getRemovedRunners() != null) {
            _hashCode += getRemovedRunners().hashCode();
        }
        if (getMarketStatus() != null) {
            _hashCode += getMarketStatus().hashCode();
        }
        _hashCode += getNumberOfWinners();
        _hashCode += (isBspMarket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRunnerPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunnerPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunnerPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarketPrices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketPrices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastRefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketBaseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketBaseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedRunners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removedRunners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWinners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfWinners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bspMarket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bspMarket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runnerPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runnerPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RunnerPrices"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "RunnerPrices"));
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
