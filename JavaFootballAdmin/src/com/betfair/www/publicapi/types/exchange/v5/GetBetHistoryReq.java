/**
 * GetBetHistoryReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetBetHistoryReq  extends com.betfair.www.publicapi.types.exchange.v5.APIRequest  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betTypesIncluded;

    private boolean detailed;

    private int[] eventTypeIds;

    private int marketId;

    private java.lang.String locale;

    private java.lang.String timezone;

    private com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum[] marketTypesIncluded;

    private java.util.Calendar placedDateFrom;

    private java.util.Calendar placedDateTo;

    private int recordCount;

    private com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum sortBetsBy;

    private int startRecord;

    public GetBetHistoryReq() {
    }

    public GetBetHistoryReq(
           com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader header,
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betTypesIncluded,
           boolean detailed,
           int[] eventTypeIds,
           int marketId,
           java.lang.String locale,
           java.lang.String timezone,
           com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum[] marketTypesIncluded,
           java.util.Calendar placedDateFrom,
           java.util.Calendar placedDateTo,
           int recordCount,
           com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum sortBetsBy,
           int startRecord) {
        super(
            header);
        this.betTypesIncluded = betTypesIncluded;
        this.detailed = detailed;
        this.eventTypeIds = eventTypeIds;
        this.marketId = marketId;
        this.locale = locale;
        this.timezone = timezone;
        this.marketTypesIncluded = marketTypesIncluded;
        this.placedDateFrom = placedDateFrom;
        this.placedDateTo = placedDateTo;
        this.recordCount = recordCount;
        this.sortBetsBy = sortBetsBy;
        this.startRecord = startRecord;
    }


    /**
     * Gets the betTypesIncluded value for this GetBetHistoryReq.
     * 
     * @return betTypesIncluded
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetTypesIncluded() {
        return betTypesIncluded;
    }


    /**
     * Sets the betTypesIncluded value for this GetBetHistoryReq.
     * 
     * @param betTypesIncluded
     */
    public void setBetTypesIncluded(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betTypesIncluded) {
        this.betTypesIncluded = betTypesIncluded;
    }


    /**
     * Gets the detailed value for this GetBetHistoryReq.
     * 
     * @return detailed
     */
    public boolean isDetailed() {
        return detailed;
    }


    /**
     * Sets the detailed value for this GetBetHistoryReq.
     * 
     * @param detailed
     */
    public void setDetailed(boolean detailed) {
        this.detailed = detailed;
    }


    /**
     * Gets the eventTypeIds value for this GetBetHistoryReq.
     * 
     * @return eventTypeIds
     */
    public int[] getEventTypeIds() {
        return eventTypeIds;
    }


    /**
     * Sets the eventTypeIds value for this GetBetHistoryReq.
     * 
     * @param eventTypeIds
     */
    public void setEventTypeIds(int[] eventTypeIds) {
        this.eventTypeIds = eventTypeIds;
    }


    /**
     * Gets the marketId value for this GetBetHistoryReq.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this GetBetHistoryReq.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the locale value for this GetBetHistoryReq.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this GetBetHistoryReq.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the timezone value for this GetBetHistoryReq.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this GetBetHistoryReq.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the marketTypesIncluded value for this GetBetHistoryReq.
     * 
     * @return marketTypesIncluded
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum[] getMarketTypesIncluded() {
        return marketTypesIncluded;
    }


    /**
     * Sets the marketTypesIncluded value for this GetBetHistoryReq.
     * 
     * @param marketTypesIncluded
     */
    public void setMarketTypesIncluded(com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum[] marketTypesIncluded) {
        this.marketTypesIncluded = marketTypesIncluded;
    }


    /**
     * Gets the placedDateFrom value for this GetBetHistoryReq.
     * 
     * @return placedDateFrom
     */
    public java.util.Calendar getPlacedDateFrom() {
        return placedDateFrom;
    }


    /**
     * Sets the placedDateFrom value for this GetBetHistoryReq.
     * 
     * @param placedDateFrom
     */
    public void setPlacedDateFrom(java.util.Calendar placedDateFrom) {
        this.placedDateFrom = placedDateFrom;
    }


    /**
     * Gets the placedDateTo value for this GetBetHistoryReq.
     * 
     * @return placedDateTo
     */
    public java.util.Calendar getPlacedDateTo() {
        return placedDateTo;
    }


    /**
     * Sets the placedDateTo value for this GetBetHistoryReq.
     * 
     * @param placedDateTo
     */
    public void setPlacedDateTo(java.util.Calendar placedDateTo) {
        this.placedDateTo = placedDateTo;
    }


    /**
     * Gets the recordCount value for this GetBetHistoryReq.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this GetBetHistoryReq.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the sortBetsBy value for this GetBetHistoryReq.
     * 
     * @return sortBetsBy
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum getSortBetsBy() {
        return sortBetsBy;
    }


    /**
     * Sets the sortBetsBy value for this GetBetHistoryReq.
     * 
     * @param sortBetsBy
     */
    public void setSortBetsBy(com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum sortBetsBy) {
        this.sortBetsBy = sortBetsBy;
    }


    /**
     * Gets the startRecord value for this GetBetHistoryReq.
     * 
     * @return startRecord
     */
    public int getStartRecord() {
        return startRecord;
    }


    /**
     * Sets the startRecord value for this GetBetHistoryReq.
     * 
     * @param startRecord
     */
    public void setStartRecord(int startRecord) {
        this.startRecord = startRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBetHistoryReq)) return false;
        GetBetHistoryReq other = (GetBetHistoryReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.betTypesIncluded==null && other.getBetTypesIncluded()==null) || 
             (this.betTypesIncluded!=null &&
              this.betTypesIncluded.equals(other.getBetTypesIncluded()))) &&
            this.detailed == other.isDetailed() &&
            ((this.eventTypeIds==null && other.getEventTypeIds()==null) || 
             (this.eventTypeIds!=null &&
              java.util.Arrays.equals(this.eventTypeIds, other.getEventTypeIds()))) &&
            this.marketId == other.getMarketId() &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.marketTypesIncluded==null && other.getMarketTypesIncluded()==null) || 
             (this.marketTypesIncluded!=null &&
              java.util.Arrays.equals(this.marketTypesIncluded, other.getMarketTypesIncluded()))) &&
            ((this.placedDateFrom==null && other.getPlacedDateFrom()==null) || 
             (this.placedDateFrom!=null &&
              this.placedDateFrom.equals(other.getPlacedDateFrom()))) &&
            ((this.placedDateTo==null && other.getPlacedDateTo()==null) || 
             (this.placedDateTo!=null &&
              this.placedDateTo.equals(other.getPlacedDateTo()))) &&
            this.recordCount == other.getRecordCount() &&
            ((this.sortBetsBy==null && other.getSortBetsBy()==null) || 
             (this.sortBetsBy!=null &&
              this.sortBetsBy.equals(other.getSortBetsBy()))) &&
            this.startRecord == other.getStartRecord();
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
        if (getBetTypesIncluded() != null) {
            _hashCode += getBetTypesIncluded().hashCode();
        }
        _hashCode += (isDetailed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEventTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventTypeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventTypeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMarketId();
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getMarketTypesIncluded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketTypesIncluded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketTypesIncluded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlacedDateFrom() != null) {
            _hashCode += getPlacedDateFrom().hashCode();
        }
        if (getPlacedDateTo() != null) {
            _hashCode += getPlacedDateTo().hashCode();
        }
        _hashCode += getRecordCount();
        if (getSortBetsBy() != null) {
            _hashCode += getSortBetsBy().hashCode();
        }
        _hashCode += getStartRecord();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBetHistoryReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betTypesIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betTypesIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketTypesIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketTypesIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeEnum"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MarketTypeEnum"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placedDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placedDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placedDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBetsBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortBetsBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetsOrderByEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startRecord"));
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
