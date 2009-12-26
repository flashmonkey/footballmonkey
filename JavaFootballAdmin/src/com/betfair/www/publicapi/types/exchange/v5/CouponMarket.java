/**
 * CouponMarket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CouponMarket  implements java.io.Serializable {
    private int marketId;

    private java.lang.String marketName;

    private int exchangeId;

    private java.lang.String parentEventName;

    private com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant;

    private java.lang.String marketInfo;

    private java.util.Calendar startTime;

    private int betDelay;

    private com.betfair.www.publicapi.types.exchange.v5.CouponSelection[] couponSelectionItems;

    public CouponMarket() {
    }

    public CouponMarket(
           int marketId,
           java.lang.String marketName,
           int exchangeId,
           java.lang.String parentEventName,
           com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant,
           java.lang.String marketInfo,
           java.util.Calendar startTime,
           int betDelay,
           com.betfair.www.publicapi.types.exchange.v5.CouponSelection[] couponSelectionItems) {
           this.marketId = marketId;
           this.marketName = marketName;
           this.exchangeId = exchangeId;
           this.parentEventName = parentEventName;
           this.marketStatus = marketStatus;
           this.marketType = marketType;
           this.marketTypeVariant = marketTypeVariant;
           this.marketInfo = marketInfo;
           this.startTime = startTime;
           this.betDelay = betDelay;
           this.couponSelectionItems = couponSelectionItems;
    }


    /**
     * Gets the marketId value for this CouponMarket.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this CouponMarket.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the marketName value for this CouponMarket.
     * 
     * @return marketName
     */
    public java.lang.String getMarketName() {
        return marketName;
    }


    /**
     * Sets the marketName value for this CouponMarket.
     * 
     * @param marketName
     */
    public void setMarketName(java.lang.String marketName) {
        this.marketName = marketName;
    }


    /**
     * Gets the exchangeId value for this CouponMarket.
     * 
     * @return exchangeId
     */
    public int getExchangeId() {
        return exchangeId;
    }


    /**
     * Sets the exchangeId value for this CouponMarket.
     * 
     * @param exchangeId
     */
    public void setExchangeId(int exchangeId) {
        this.exchangeId = exchangeId;
    }


    /**
     * Gets the parentEventName value for this CouponMarket.
     * 
     * @return parentEventName
     */
    public java.lang.String getParentEventName() {
        return parentEventName;
    }


    /**
     * Sets the parentEventName value for this CouponMarket.
     * 
     * @param parentEventName
     */
    public void setParentEventName(java.lang.String parentEventName) {
        this.parentEventName = parentEventName;
    }


    /**
     * Gets the marketStatus value for this CouponMarket.
     * 
     * @return marketStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum getMarketStatus() {
        return marketStatus;
    }


    /**
     * Sets the marketStatus value for this CouponMarket.
     * 
     * @param marketStatus
     */
    public void setMarketStatus(com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus) {
        this.marketStatus = marketStatus;
    }


    /**
     * Gets the marketType value for this CouponMarket.
     * 
     * @return marketType
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum getMarketType() {
        return marketType;
    }


    /**
     * Sets the marketType value for this CouponMarket.
     * 
     * @param marketType
     */
    public void setMarketType(com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType) {
        this.marketType = marketType;
    }


    /**
     * Gets the marketTypeVariant value for this CouponMarket.
     * 
     * @return marketTypeVariant
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum getMarketTypeVariant() {
        return marketTypeVariant;
    }


    /**
     * Sets the marketTypeVariant value for this CouponMarket.
     * 
     * @param marketTypeVariant
     */
    public void setMarketTypeVariant(com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant) {
        this.marketTypeVariant = marketTypeVariant;
    }


    /**
     * Gets the marketInfo value for this CouponMarket.
     * 
     * @return marketInfo
     */
    public java.lang.String getMarketInfo() {
        return marketInfo;
    }


    /**
     * Sets the marketInfo value for this CouponMarket.
     * 
     * @param marketInfo
     */
    public void setMarketInfo(java.lang.String marketInfo) {
        this.marketInfo = marketInfo;
    }


    /**
     * Gets the startTime value for this CouponMarket.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this CouponMarket.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the betDelay value for this CouponMarket.
     * 
     * @return betDelay
     */
    public int getBetDelay() {
        return betDelay;
    }


    /**
     * Sets the betDelay value for this CouponMarket.
     * 
     * @param betDelay
     */
    public void setBetDelay(int betDelay) {
        this.betDelay = betDelay;
    }


    /**
     * Gets the couponSelectionItems value for this CouponMarket.
     * 
     * @return couponSelectionItems
     */
    public com.betfair.www.publicapi.types.exchange.v5.CouponSelection[] getCouponSelectionItems() {
        return couponSelectionItems;
    }


    /**
     * Sets the couponSelectionItems value for this CouponMarket.
     * 
     * @param couponSelectionItems
     */
    public void setCouponSelectionItems(com.betfair.www.publicapi.types.exchange.v5.CouponSelection[] couponSelectionItems) {
        this.couponSelectionItems = couponSelectionItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CouponMarket)) return false;
        CouponMarket other = (CouponMarket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.marketId == other.getMarketId() &&
            ((this.marketName==null && other.getMarketName()==null) || 
             (this.marketName!=null &&
              this.marketName.equals(other.getMarketName()))) &&
            this.exchangeId == other.getExchangeId() &&
            ((this.parentEventName==null && other.getParentEventName()==null) || 
             (this.parentEventName!=null &&
              this.parentEventName.equals(other.getParentEventName()))) &&
            ((this.marketStatus==null && other.getMarketStatus()==null) || 
             (this.marketStatus!=null &&
              this.marketStatus.equals(other.getMarketStatus()))) &&
            ((this.marketType==null && other.getMarketType()==null) || 
             (this.marketType!=null &&
              this.marketType.equals(other.getMarketType()))) &&
            ((this.marketTypeVariant==null && other.getMarketTypeVariant()==null) || 
             (this.marketTypeVariant!=null &&
              this.marketTypeVariant.equals(other.getMarketTypeVariant()))) &&
            ((this.marketInfo==null && other.getMarketInfo()==null) || 
             (this.marketInfo!=null &&
              this.marketInfo.equals(other.getMarketInfo()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            this.betDelay == other.getBetDelay() &&
            ((this.couponSelectionItems==null && other.getCouponSelectionItems()==null) || 
             (this.couponSelectionItems!=null &&
              java.util.Arrays.equals(this.couponSelectionItems, other.getCouponSelectionItems())));
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
        _hashCode += getMarketId();
        if (getMarketName() != null) {
            _hashCode += getMarketName().hashCode();
        }
        _hashCode += getExchangeId();
        if (getParentEventName() != null) {
            _hashCode += getParentEventName().hashCode();
        }
        if (getMarketStatus() != null) {
            _hashCode += getMarketStatus().hashCode();
        }
        if (getMarketType() != null) {
            _hashCode += getMarketType().hashCode();
        }
        if (getMarketTypeVariant() != null) {
            _hashCode += getMarketTypeVariant().hashCode();
        }
        if (getMarketInfo() != null) {
            _hashCode += getMarketInfo().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        _hashCode += getBetDelay();
        if (getCouponSelectionItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCouponSelectionItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCouponSelectionItems(), i);
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
        new org.apache.axis.description.TypeDesc(CouponMarket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponMarket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exchangeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEventName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentEventName"));
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
        elemField.setFieldName("marketType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketTypeVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketTypeVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeVariantEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponSelectionItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponSelectionItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponSelection"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CouponSelection"));
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
