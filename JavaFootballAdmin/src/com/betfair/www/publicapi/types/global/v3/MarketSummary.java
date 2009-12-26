/**
 * MarketSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class MarketSummary  implements java.io.Serializable {
    private int eventTypeId;

    private int marketId;

    private java.lang.String marketName;

    private com.betfair.www.publicapi.types.global.v3.MarketTypeEnum marketType;

    private com.betfair.www.publicapi.types.global.v3.MarketTypeVariantEnum marketTypeVariant;

    private int menuLevel;

    private int orderIndex;

    private java.util.Calendar startTime;

    private java.lang.String timezone;

    private java.lang.String venue;

    private int betDelay;

    private int numberOfWinners;

    private int eventParentId;

    private int exchangeId;

    public MarketSummary() {
    }

    public MarketSummary(
           int eventTypeId,
           int marketId,
           java.lang.String marketName,
           com.betfair.www.publicapi.types.global.v3.MarketTypeEnum marketType,
           com.betfair.www.publicapi.types.global.v3.MarketTypeVariantEnum marketTypeVariant,
           int menuLevel,
           int orderIndex,
           java.util.Calendar startTime,
           java.lang.String timezone,
           java.lang.String venue,
           int betDelay,
           int numberOfWinners,
           int eventParentId,
           int exchangeId) {
           this.eventTypeId = eventTypeId;
           this.marketId = marketId;
           this.marketName = marketName;
           this.marketType = marketType;
           this.marketTypeVariant = marketTypeVariant;
           this.menuLevel = menuLevel;
           this.orderIndex = orderIndex;
           this.startTime = startTime;
           this.timezone = timezone;
           this.venue = venue;
           this.betDelay = betDelay;
           this.numberOfWinners = numberOfWinners;
           this.eventParentId = eventParentId;
           this.exchangeId = exchangeId;
    }


    /**
     * Gets the eventTypeId value for this MarketSummary.
     * 
     * @return eventTypeId
     */
    public int getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this MarketSummary.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the marketId value for this MarketSummary.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this MarketSummary.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the marketName value for this MarketSummary.
     * 
     * @return marketName
     */
    public java.lang.String getMarketName() {
        return marketName;
    }


    /**
     * Sets the marketName value for this MarketSummary.
     * 
     * @param marketName
     */
    public void setMarketName(java.lang.String marketName) {
        this.marketName = marketName;
    }


    /**
     * Gets the marketType value for this MarketSummary.
     * 
     * @return marketType
     */
    public com.betfair.www.publicapi.types.global.v3.MarketTypeEnum getMarketType() {
        return marketType;
    }


    /**
     * Sets the marketType value for this MarketSummary.
     * 
     * @param marketType
     */
    public void setMarketType(com.betfair.www.publicapi.types.global.v3.MarketTypeEnum marketType) {
        this.marketType = marketType;
    }


    /**
     * Gets the marketTypeVariant value for this MarketSummary.
     * 
     * @return marketTypeVariant
     */
    public com.betfair.www.publicapi.types.global.v3.MarketTypeVariantEnum getMarketTypeVariant() {
        return marketTypeVariant;
    }


    /**
     * Sets the marketTypeVariant value for this MarketSummary.
     * 
     * @param marketTypeVariant
     */
    public void setMarketTypeVariant(com.betfair.www.publicapi.types.global.v3.MarketTypeVariantEnum marketTypeVariant) {
        this.marketTypeVariant = marketTypeVariant;
    }


    /**
     * Gets the menuLevel value for this MarketSummary.
     * 
     * @return menuLevel
     */
    public int getMenuLevel() {
        return menuLevel;
    }


    /**
     * Sets the menuLevel value for this MarketSummary.
     * 
     * @param menuLevel
     */
    public void setMenuLevel(int menuLevel) {
        this.menuLevel = menuLevel;
    }


    /**
     * Gets the orderIndex value for this MarketSummary.
     * 
     * @return orderIndex
     */
    public int getOrderIndex() {
        return orderIndex;
    }


    /**
     * Sets the orderIndex value for this MarketSummary.
     * 
     * @param orderIndex
     */
    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }


    /**
     * Gets the startTime value for this MarketSummary.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this MarketSummary.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the timezone value for this MarketSummary.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this MarketSummary.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the venue value for this MarketSummary.
     * 
     * @return venue
     */
    public java.lang.String getVenue() {
        return venue;
    }


    /**
     * Sets the venue value for this MarketSummary.
     * 
     * @param venue
     */
    public void setVenue(java.lang.String venue) {
        this.venue = venue;
    }


    /**
     * Gets the betDelay value for this MarketSummary.
     * 
     * @return betDelay
     */
    public int getBetDelay() {
        return betDelay;
    }


    /**
     * Sets the betDelay value for this MarketSummary.
     * 
     * @param betDelay
     */
    public void setBetDelay(int betDelay) {
        this.betDelay = betDelay;
    }


    /**
     * Gets the numberOfWinners value for this MarketSummary.
     * 
     * @return numberOfWinners
     */
    public int getNumberOfWinners() {
        return numberOfWinners;
    }


    /**
     * Sets the numberOfWinners value for this MarketSummary.
     * 
     * @param numberOfWinners
     */
    public void setNumberOfWinners(int numberOfWinners) {
        this.numberOfWinners = numberOfWinners;
    }


    /**
     * Gets the eventParentId value for this MarketSummary.
     * 
     * @return eventParentId
     */
    public int getEventParentId() {
        return eventParentId;
    }


    /**
     * Sets the eventParentId value for this MarketSummary.
     * 
     * @param eventParentId
     */
    public void setEventParentId(int eventParentId) {
        this.eventParentId = eventParentId;
    }


    /**
     * Gets the exchangeId value for this MarketSummary.
     * 
     * @return exchangeId
     */
    public int getExchangeId() {
        return exchangeId;
    }


    /**
     * Sets the exchangeId value for this MarketSummary.
     * 
     * @param exchangeId
     */
    public void setExchangeId(int exchangeId) {
        this.exchangeId = exchangeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarketSummary)) return false;
        MarketSummary other = (MarketSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventTypeId == other.getEventTypeId() &&
            this.marketId == other.getMarketId() &&
            ((this.marketName==null && other.getMarketName()==null) || 
             (this.marketName!=null &&
              this.marketName.equals(other.getMarketName()))) &&
            ((this.marketType==null && other.getMarketType()==null) || 
             (this.marketType!=null &&
              this.marketType.equals(other.getMarketType()))) &&
            ((this.marketTypeVariant==null && other.getMarketTypeVariant()==null) || 
             (this.marketTypeVariant!=null &&
              this.marketTypeVariant.equals(other.getMarketTypeVariant()))) &&
            this.menuLevel == other.getMenuLevel() &&
            this.orderIndex == other.getOrderIndex() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.venue==null && other.getVenue()==null) || 
             (this.venue!=null &&
              this.venue.equals(other.getVenue()))) &&
            this.betDelay == other.getBetDelay() &&
            this.numberOfWinners == other.getNumberOfWinners() &&
            this.eventParentId == other.getEventParentId() &&
            this.exchangeId == other.getExchangeId();
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
        _hashCode += getEventTypeId();
        _hashCode += getMarketId();
        if (getMarketName() != null) {
            _hashCode += getMarketName().hashCode();
        }
        if (getMarketType() != null) {
            _hashCode += getMarketType().hashCode();
        }
        if (getMarketTypeVariant() != null) {
            _hashCode += getMarketTypeVariant().hashCode();
        }
        _hashCode += getMenuLevel();
        _hashCode += getOrderIndex();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getVenue() != null) {
            _hashCode += getVenue().hashCode();
        }
        _hashCode += getBetDelay();
        _hashCode += getNumberOfWinners();
        _hashCode += getEventParentId();
        _hashCode += getExchangeId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarketSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("marketType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketTypeVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketTypeVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketTypeVariantEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "venue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWinners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfWinners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventParentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exchangeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
