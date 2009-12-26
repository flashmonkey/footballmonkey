/**
 * Market.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class Market  implements java.io.Serializable {
    private java.lang.String countryISO3;

    private boolean discountAllowed;

    private int eventTypeId;

    private long lastRefresh;

    private float marketBaseRate;

    private java.lang.String marketDescription;

    private boolean marketDescriptionHasDate;

    private java.util.Calendar marketDisplayTime;

    private int marketId;

    private com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus;

    private java.util.Calendar marketSuspendTime;

    private java.util.Calendar marketTime;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant;

    private java.lang.String menuPath;

    private int[] eventHierarchy;

    private java.lang.String name;

    private int numberOfWinners;

    private int parentEventId;

    private com.betfair.www.publicapi.types.exchange.v5.Runner[] runners;

    private java.lang.String unit;

    private java.lang.Double maxUnitValue;

    private java.lang.Double minUnitValue;

    private java.lang.Double interval;

    private boolean runnersMayBeAdded;

    private java.lang.String timezone;

    private int licenceId;

    private com.betfair.www.publicapi.types.exchange.v5.CouponLink[] couponLinks;

    private boolean bspMarket;

    public Market() {
    }

    public Market(
           java.lang.String countryISO3,
           boolean discountAllowed,
           int eventTypeId,
           long lastRefresh,
           float marketBaseRate,
           java.lang.String marketDescription,
           boolean marketDescriptionHasDate,
           java.util.Calendar marketDisplayTime,
           int marketId,
           com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus,
           java.util.Calendar marketSuspendTime,
           java.util.Calendar marketTime,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant,
           java.lang.String menuPath,
           int[] eventHierarchy,
           java.lang.String name,
           int numberOfWinners,
           int parentEventId,
           com.betfair.www.publicapi.types.exchange.v5.Runner[] runners,
           java.lang.String unit,
           java.lang.Double maxUnitValue,
           java.lang.Double minUnitValue,
           java.lang.Double interval,
           boolean runnersMayBeAdded,
           java.lang.String timezone,
           int licenceId,
           com.betfair.www.publicapi.types.exchange.v5.CouponLink[] couponLinks,
           boolean bspMarket) {
           this.countryISO3 = countryISO3;
           this.discountAllowed = discountAllowed;
           this.eventTypeId = eventTypeId;
           this.lastRefresh = lastRefresh;
           this.marketBaseRate = marketBaseRate;
           this.marketDescription = marketDescription;
           this.marketDescriptionHasDate = marketDescriptionHasDate;
           this.marketDisplayTime = marketDisplayTime;
           this.marketId = marketId;
           this.marketStatus = marketStatus;
           this.marketSuspendTime = marketSuspendTime;
           this.marketTime = marketTime;
           this.marketType = marketType;
           this.marketTypeVariant = marketTypeVariant;
           this.menuPath = menuPath;
           this.eventHierarchy = eventHierarchy;
           this.name = name;
           this.numberOfWinners = numberOfWinners;
           this.parentEventId = parentEventId;
           this.runners = runners;
           this.unit = unit;
           this.maxUnitValue = maxUnitValue;
           this.minUnitValue = minUnitValue;
           this.interval = interval;
           this.runnersMayBeAdded = runnersMayBeAdded;
           this.timezone = timezone;
           this.licenceId = licenceId;
           this.couponLinks = couponLinks;
           this.bspMarket = bspMarket;
    }


    /**
     * Gets the countryISO3 value for this Market.
     * 
     * @return countryISO3
     */
    public java.lang.String getCountryISO3() {
        return countryISO3;
    }


    /**
     * Sets the countryISO3 value for this Market.
     * 
     * @param countryISO3
     */
    public void setCountryISO3(java.lang.String countryISO3) {
        this.countryISO3 = countryISO3;
    }


    /**
     * Gets the discountAllowed value for this Market.
     * 
     * @return discountAllowed
     */
    public boolean isDiscountAllowed() {
        return discountAllowed;
    }


    /**
     * Sets the discountAllowed value for this Market.
     * 
     * @param discountAllowed
     */
    public void setDiscountAllowed(boolean discountAllowed) {
        this.discountAllowed = discountAllowed;
    }


    /**
     * Gets the eventTypeId value for this Market.
     * 
     * @return eventTypeId
     */
    public int getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this Market.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the lastRefresh value for this Market.
     * 
     * @return lastRefresh
     */
    public long getLastRefresh() {
        return lastRefresh;
    }


    /**
     * Sets the lastRefresh value for this Market.
     * 
     * @param lastRefresh
     */
    public void setLastRefresh(long lastRefresh) {
        this.lastRefresh = lastRefresh;
    }


    /**
     * Gets the marketBaseRate value for this Market.
     * 
     * @return marketBaseRate
     */
    public float getMarketBaseRate() {
        return marketBaseRate;
    }


    /**
     * Sets the marketBaseRate value for this Market.
     * 
     * @param marketBaseRate
     */
    public void setMarketBaseRate(float marketBaseRate) {
        this.marketBaseRate = marketBaseRate;
    }


    /**
     * Gets the marketDescription value for this Market.
     * 
     * @return marketDescription
     */
    public java.lang.String getMarketDescription() {
        return marketDescription;
    }


    /**
     * Sets the marketDescription value for this Market.
     * 
     * @param marketDescription
     */
    public void setMarketDescription(java.lang.String marketDescription) {
        this.marketDescription = marketDescription;
    }


    /**
     * Gets the marketDescriptionHasDate value for this Market.
     * 
     * @return marketDescriptionHasDate
     */
    public boolean isMarketDescriptionHasDate() {
        return marketDescriptionHasDate;
    }


    /**
     * Sets the marketDescriptionHasDate value for this Market.
     * 
     * @param marketDescriptionHasDate
     */
    public void setMarketDescriptionHasDate(boolean marketDescriptionHasDate) {
        this.marketDescriptionHasDate = marketDescriptionHasDate;
    }


    /**
     * Gets the marketDisplayTime value for this Market.
     * 
     * @return marketDisplayTime
     */
    public java.util.Calendar getMarketDisplayTime() {
        return marketDisplayTime;
    }


    /**
     * Sets the marketDisplayTime value for this Market.
     * 
     * @param marketDisplayTime
     */
    public void setMarketDisplayTime(java.util.Calendar marketDisplayTime) {
        this.marketDisplayTime = marketDisplayTime;
    }


    /**
     * Gets the marketId value for this Market.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this Market.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the marketStatus value for this Market.
     * 
     * @return marketStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum getMarketStatus() {
        return marketStatus;
    }


    /**
     * Sets the marketStatus value for this Market.
     * 
     * @param marketStatus
     */
    public void setMarketStatus(com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus) {
        this.marketStatus = marketStatus;
    }


    /**
     * Gets the marketSuspendTime value for this Market.
     * 
     * @return marketSuspendTime
     */
    public java.util.Calendar getMarketSuspendTime() {
        return marketSuspendTime;
    }


    /**
     * Sets the marketSuspendTime value for this Market.
     * 
     * @param marketSuspendTime
     */
    public void setMarketSuspendTime(java.util.Calendar marketSuspendTime) {
        this.marketSuspendTime = marketSuspendTime;
    }


    /**
     * Gets the marketTime value for this Market.
     * 
     * @return marketTime
     */
    public java.util.Calendar getMarketTime() {
        return marketTime;
    }


    /**
     * Sets the marketTime value for this Market.
     * 
     * @param marketTime
     */
    public void setMarketTime(java.util.Calendar marketTime) {
        this.marketTime = marketTime;
    }


    /**
     * Gets the marketType value for this Market.
     * 
     * @return marketType
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum getMarketType() {
        return marketType;
    }


    /**
     * Sets the marketType value for this Market.
     * 
     * @param marketType
     */
    public void setMarketType(com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum marketType) {
        this.marketType = marketType;
    }


    /**
     * Gets the marketTypeVariant value for this Market.
     * 
     * @return marketTypeVariant
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum getMarketTypeVariant() {
        return marketTypeVariant;
    }


    /**
     * Sets the marketTypeVariant value for this Market.
     * 
     * @param marketTypeVariant
     */
    public void setMarketTypeVariant(com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum marketTypeVariant) {
        this.marketTypeVariant = marketTypeVariant;
    }


    /**
     * Gets the menuPath value for this Market.
     * 
     * @return menuPath
     */
    public java.lang.String getMenuPath() {
        return menuPath;
    }


    /**
     * Sets the menuPath value for this Market.
     * 
     * @param menuPath
     */
    public void setMenuPath(java.lang.String menuPath) {
        this.menuPath = menuPath;
    }


    /**
     * Gets the eventHierarchy value for this Market.
     * 
     * @return eventHierarchy
     */
    public int[] getEventHierarchy() {
        return eventHierarchy;
    }


    /**
     * Sets the eventHierarchy value for this Market.
     * 
     * @param eventHierarchy
     */
    public void setEventHierarchy(int[] eventHierarchy) {
        this.eventHierarchy = eventHierarchy;
    }


    /**
     * Gets the name value for this Market.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Market.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfWinners value for this Market.
     * 
     * @return numberOfWinners
     */
    public int getNumberOfWinners() {
        return numberOfWinners;
    }


    /**
     * Sets the numberOfWinners value for this Market.
     * 
     * @param numberOfWinners
     */
    public void setNumberOfWinners(int numberOfWinners) {
        this.numberOfWinners = numberOfWinners;
    }


    /**
     * Gets the parentEventId value for this Market.
     * 
     * @return parentEventId
     */
    public int getParentEventId() {
        return parentEventId;
    }


    /**
     * Sets the parentEventId value for this Market.
     * 
     * @param parentEventId
     */
    public void setParentEventId(int parentEventId) {
        this.parentEventId = parentEventId;
    }


    /**
     * Gets the runners value for this Market.
     * 
     * @return runners
     */
    public com.betfair.www.publicapi.types.exchange.v5.Runner[] getRunners() {
        return runners;
    }


    /**
     * Sets the runners value for this Market.
     * 
     * @param runners
     */
    public void setRunners(com.betfair.www.publicapi.types.exchange.v5.Runner[] runners) {
        this.runners = runners;
    }


    /**
     * Gets the unit value for this Market.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Market.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the maxUnitValue value for this Market.
     * 
     * @return maxUnitValue
     */
    public java.lang.Double getMaxUnitValue() {
        return maxUnitValue;
    }


    /**
     * Sets the maxUnitValue value for this Market.
     * 
     * @param maxUnitValue
     */
    public void setMaxUnitValue(java.lang.Double maxUnitValue) {
        this.maxUnitValue = maxUnitValue;
    }


    /**
     * Gets the minUnitValue value for this Market.
     * 
     * @return minUnitValue
     */
    public java.lang.Double getMinUnitValue() {
        return minUnitValue;
    }


    /**
     * Sets the minUnitValue value for this Market.
     * 
     * @param minUnitValue
     */
    public void setMinUnitValue(java.lang.Double minUnitValue) {
        this.minUnitValue = minUnitValue;
    }


    /**
     * Gets the interval value for this Market.
     * 
     * @return interval
     */
    public java.lang.Double getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this Market.
     * 
     * @param interval
     */
    public void setInterval(java.lang.Double interval) {
        this.interval = interval;
    }


    /**
     * Gets the runnersMayBeAdded value for this Market.
     * 
     * @return runnersMayBeAdded
     */
    public boolean isRunnersMayBeAdded() {
        return runnersMayBeAdded;
    }


    /**
     * Sets the runnersMayBeAdded value for this Market.
     * 
     * @param runnersMayBeAdded
     */
    public void setRunnersMayBeAdded(boolean runnersMayBeAdded) {
        this.runnersMayBeAdded = runnersMayBeAdded;
    }


    /**
     * Gets the timezone value for this Market.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this Market.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the licenceId value for this Market.
     * 
     * @return licenceId
     */
    public int getLicenceId() {
        return licenceId;
    }


    /**
     * Sets the licenceId value for this Market.
     * 
     * @param licenceId
     */
    public void setLicenceId(int licenceId) {
        this.licenceId = licenceId;
    }


    /**
     * Gets the couponLinks value for this Market.
     * 
     * @return couponLinks
     */
    public com.betfair.www.publicapi.types.exchange.v5.CouponLink[] getCouponLinks() {
        return couponLinks;
    }


    /**
     * Sets the couponLinks value for this Market.
     * 
     * @param couponLinks
     */
    public void setCouponLinks(com.betfair.www.publicapi.types.exchange.v5.CouponLink[] couponLinks) {
        this.couponLinks = couponLinks;
    }


    /**
     * Gets the bspMarket value for this Market.
     * 
     * @return bspMarket
     */
    public boolean isBspMarket() {
        return bspMarket;
    }


    /**
     * Sets the bspMarket value for this Market.
     * 
     * @param bspMarket
     */
    public void setBspMarket(boolean bspMarket) {
        this.bspMarket = bspMarket;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Market)) return false;
        Market other = (Market) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryISO3==null && other.getCountryISO3()==null) || 
             (this.countryISO3!=null &&
              this.countryISO3.equals(other.getCountryISO3()))) &&
            this.discountAllowed == other.isDiscountAllowed() &&
            this.eventTypeId == other.getEventTypeId() &&
            this.lastRefresh == other.getLastRefresh() &&
            this.marketBaseRate == other.getMarketBaseRate() &&
            ((this.marketDescription==null && other.getMarketDescription()==null) || 
             (this.marketDescription!=null &&
              this.marketDescription.equals(other.getMarketDescription()))) &&
            this.marketDescriptionHasDate == other.isMarketDescriptionHasDate() &&
            ((this.marketDisplayTime==null && other.getMarketDisplayTime()==null) || 
             (this.marketDisplayTime!=null &&
              this.marketDisplayTime.equals(other.getMarketDisplayTime()))) &&
            this.marketId == other.getMarketId() &&
            ((this.marketStatus==null && other.getMarketStatus()==null) || 
             (this.marketStatus!=null &&
              this.marketStatus.equals(other.getMarketStatus()))) &&
            ((this.marketSuspendTime==null && other.getMarketSuspendTime()==null) || 
             (this.marketSuspendTime!=null &&
              this.marketSuspendTime.equals(other.getMarketSuspendTime()))) &&
            ((this.marketTime==null && other.getMarketTime()==null) || 
             (this.marketTime!=null &&
              this.marketTime.equals(other.getMarketTime()))) &&
            ((this.marketType==null && other.getMarketType()==null) || 
             (this.marketType!=null &&
              this.marketType.equals(other.getMarketType()))) &&
            ((this.marketTypeVariant==null && other.getMarketTypeVariant()==null) || 
             (this.marketTypeVariant!=null &&
              this.marketTypeVariant.equals(other.getMarketTypeVariant()))) &&
            ((this.menuPath==null && other.getMenuPath()==null) || 
             (this.menuPath!=null &&
              this.menuPath.equals(other.getMenuPath()))) &&
            ((this.eventHierarchy==null && other.getEventHierarchy()==null) || 
             (this.eventHierarchy!=null &&
              java.util.Arrays.equals(this.eventHierarchy, other.getEventHierarchy()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.numberOfWinners == other.getNumberOfWinners() &&
            this.parentEventId == other.getParentEventId() &&
            ((this.runners==null && other.getRunners()==null) || 
             (this.runners!=null &&
              java.util.Arrays.equals(this.runners, other.getRunners()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.maxUnitValue==null && other.getMaxUnitValue()==null) || 
             (this.maxUnitValue!=null &&
              this.maxUnitValue.equals(other.getMaxUnitValue()))) &&
            ((this.minUnitValue==null && other.getMinUnitValue()==null) || 
             (this.minUnitValue!=null &&
              this.minUnitValue.equals(other.getMinUnitValue()))) &&
            ((this.interval==null && other.getInterval()==null) || 
             (this.interval!=null &&
              this.interval.equals(other.getInterval()))) &&
            this.runnersMayBeAdded == other.isRunnersMayBeAdded() &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            this.licenceId == other.getLicenceId() &&
            ((this.couponLinks==null && other.getCouponLinks()==null) || 
             (this.couponLinks!=null &&
              java.util.Arrays.equals(this.couponLinks, other.getCouponLinks()))) &&
            this.bspMarket == other.isBspMarket();
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
        if (getCountryISO3() != null) {
            _hashCode += getCountryISO3().hashCode();
        }
        _hashCode += (isDiscountAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getEventTypeId();
        _hashCode += new Long(getLastRefresh()).hashCode();
        _hashCode += new Float(getMarketBaseRate()).hashCode();
        if (getMarketDescription() != null) {
            _hashCode += getMarketDescription().hashCode();
        }
        _hashCode += (isMarketDescriptionHasDate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMarketDisplayTime() != null) {
            _hashCode += getMarketDisplayTime().hashCode();
        }
        _hashCode += getMarketId();
        if (getMarketStatus() != null) {
            _hashCode += getMarketStatus().hashCode();
        }
        if (getMarketSuspendTime() != null) {
            _hashCode += getMarketSuspendTime().hashCode();
        }
        if (getMarketTime() != null) {
            _hashCode += getMarketTime().hashCode();
        }
        if (getMarketType() != null) {
            _hashCode += getMarketType().hashCode();
        }
        if (getMarketTypeVariant() != null) {
            _hashCode += getMarketTypeVariant().hashCode();
        }
        if (getMenuPath() != null) {
            _hashCode += getMenuPath().hashCode();
        }
        if (getEventHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getNumberOfWinners();
        _hashCode += getParentEventId();
        if (getRunners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getMaxUnitValue() != null) {
            _hashCode += getMaxUnitValue().hashCode();
        }
        if (getMinUnitValue() != null) {
            _hashCode += getMinUnitValue().hashCode();
        }
        if (getInterval() != null) {
            _hashCode += getInterval().hashCode();
        }
        _hashCode += (isRunnersMayBeAdded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        _hashCode += getLicenceId();
        if (getCouponLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCouponLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCouponLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isBspMarket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Market.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Market"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryISO3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryISO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("marketDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketDescriptionHasDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketDescriptionHasDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketDisplayTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketDisplayTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("menuPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EventId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWinners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfWinners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Runner"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Runner"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxUnitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxUnitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minUnitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minUnitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runnersMayBeAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runnersMayBeAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponLink"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CouponLink"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bspMarket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bspMarket"));
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
