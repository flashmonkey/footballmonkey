/**
 * MarketLite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class MarketLite  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus;

    private java.util.Calendar marketSuspendTime;

    private java.util.Calendar marketTime;

    private int numberOfRunners;

    private int delay;

    private boolean reconciled;

    private boolean openForBspBetting;

    public MarketLite() {
    }

    public MarketLite(
           com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus,
           java.util.Calendar marketSuspendTime,
           java.util.Calendar marketTime,
           int numberOfRunners,
           int delay,
           boolean reconciled,
           boolean openForBspBetting) {
           this.marketStatus = marketStatus;
           this.marketSuspendTime = marketSuspendTime;
           this.marketTime = marketTime;
           this.numberOfRunners = numberOfRunners;
           this.delay = delay;
           this.reconciled = reconciled;
           this.openForBspBetting = openForBspBetting;
    }


    /**
     * Gets the marketStatus value for this MarketLite.
     * 
     * @return marketStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum getMarketStatus() {
        return marketStatus;
    }


    /**
     * Sets the marketStatus value for this MarketLite.
     * 
     * @param marketStatus
     */
    public void setMarketStatus(com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus) {
        this.marketStatus = marketStatus;
    }


    /**
     * Gets the marketSuspendTime value for this MarketLite.
     * 
     * @return marketSuspendTime
     */
    public java.util.Calendar getMarketSuspendTime() {
        return marketSuspendTime;
    }


    /**
     * Sets the marketSuspendTime value for this MarketLite.
     * 
     * @param marketSuspendTime
     */
    public void setMarketSuspendTime(java.util.Calendar marketSuspendTime) {
        this.marketSuspendTime = marketSuspendTime;
    }


    /**
     * Gets the marketTime value for this MarketLite.
     * 
     * @return marketTime
     */
    public java.util.Calendar getMarketTime() {
        return marketTime;
    }


    /**
     * Sets the marketTime value for this MarketLite.
     * 
     * @param marketTime
     */
    public void setMarketTime(java.util.Calendar marketTime) {
        this.marketTime = marketTime;
    }


    /**
     * Gets the numberOfRunners value for this MarketLite.
     * 
     * @return numberOfRunners
     */
    public int getNumberOfRunners() {
        return numberOfRunners;
    }


    /**
     * Sets the numberOfRunners value for this MarketLite.
     * 
     * @param numberOfRunners
     */
    public void setNumberOfRunners(int numberOfRunners) {
        this.numberOfRunners = numberOfRunners;
    }


    /**
     * Gets the delay value for this MarketLite.
     * 
     * @return delay
     */
    public int getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this MarketLite.
     * 
     * @param delay
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }


    /**
     * Gets the reconciled value for this MarketLite.
     * 
     * @return reconciled
     */
    public boolean isReconciled() {
        return reconciled;
    }


    /**
     * Sets the reconciled value for this MarketLite.
     * 
     * @param reconciled
     */
    public void setReconciled(boolean reconciled) {
        this.reconciled = reconciled;
    }


    /**
     * Gets the openForBspBetting value for this MarketLite.
     * 
     * @return openForBspBetting
     */
    public boolean isOpenForBspBetting() {
        return openForBspBetting;
    }


    /**
     * Sets the openForBspBetting value for this MarketLite.
     * 
     * @param openForBspBetting
     */
    public void setOpenForBspBetting(boolean openForBspBetting) {
        this.openForBspBetting = openForBspBetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarketLite)) return false;
        MarketLite other = (MarketLite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.marketStatus==null && other.getMarketStatus()==null) || 
             (this.marketStatus!=null &&
              this.marketStatus.equals(other.getMarketStatus()))) &&
            ((this.marketSuspendTime==null && other.getMarketSuspendTime()==null) || 
             (this.marketSuspendTime!=null &&
              this.marketSuspendTime.equals(other.getMarketSuspendTime()))) &&
            ((this.marketTime==null && other.getMarketTime()==null) || 
             (this.marketTime!=null &&
              this.marketTime.equals(other.getMarketTime()))) &&
            this.numberOfRunners == other.getNumberOfRunners() &&
            this.delay == other.getDelay() &&
            this.reconciled == other.isReconciled() &&
            this.openForBspBetting == other.isOpenForBspBetting();
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
        if (getMarketStatus() != null) {
            _hashCode += getMarketStatus().hashCode();
        }
        if (getMarketSuspendTime() != null) {
            _hashCode += getMarketSuspendTime().hashCode();
        }
        if (getMarketTime() != null) {
            _hashCode += getMarketTime().hashCode();
        }
        _hashCode += getNumberOfRunners();
        _hashCode += getDelay();
        _hashCode += (isReconciled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOpenForBspBetting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarketLite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketLite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketSuspendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketSuspendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRunners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfRunners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconciled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openForBspBetting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openForBspBetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
