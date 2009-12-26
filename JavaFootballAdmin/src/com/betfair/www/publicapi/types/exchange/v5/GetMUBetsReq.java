/**
 * GetMUBetsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMUBetsReq  extends com.betfair.www.publicapi.types.exchange.v5.APIRequest  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus;

    private int marketId;

    private long[] betIds;

    private com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum orderBy;

    private com.betfair.www.publicapi.types.exchange.v5.SortOrderEnum sortOrder;

    private int recordCount;

    private int startRecord;

    private java.util.Calendar matchedSince;

    private boolean excludeLastSecond;

    public GetMUBetsReq() {
    }

    public GetMUBetsReq(
           com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader header,
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus,
           int marketId,
           long[] betIds,
           com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum orderBy,
           com.betfair.www.publicapi.types.exchange.v5.SortOrderEnum sortOrder,
           int recordCount,
           int startRecord,
           java.util.Calendar matchedSince,
           boolean excludeLastSecond) {
        super(
            header);
        this.betStatus = betStatus;
        this.marketId = marketId;
        this.betIds = betIds;
        this.orderBy = orderBy;
        this.sortOrder = sortOrder;
        this.recordCount = recordCount;
        this.startRecord = startRecord;
        this.matchedSince = matchedSince;
        this.excludeLastSecond = excludeLastSecond;
    }


    /**
     * Gets the betStatus value for this GetMUBetsReq.
     * 
     * @return betStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetStatus() {
        return betStatus;
    }


    /**
     * Sets the betStatus value for this GetMUBetsReq.
     * 
     * @param betStatus
     */
    public void setBetStatus(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus) {
        this.betStatus = betStatus;
    }


    /**
     * Gets the marketId value for this GetMUBetsReq.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this GetMUBetsReq.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the betIds value for this GetMUBetsReq.
     * 
     * @return betIds
     */
    public long[] getBetIds() {
        return betIds;
    }


    /**
     * Sets the betIds value for this GetMUBetsReq.
     * 
     * @param betIds
     */
    public void setBetIds(long[] betIds) {
        this.betIds = betIds;
    }


    /**
     * Gets the orderBy value for this GetMUBetsReq.
     * 
     * @return orderBy
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this GetMUBetsReq.
     * 
     * @param orderBy
     */
    public void setOrderBy(com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the sortOrder value for this GetMUBetsReq.
     * 
     * @return sortOrder
     */
    public com.betfair.www.publicapi.types.exchange.v5.SortOrderEnum getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this GetMUBetsReq.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.betfair.www.publicapi.types.exchange.v5.SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the recordCount value for this GetMUBetsReq.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this GetMUBetsReq.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the startRecord value for this GetMUBetsReq.
     * 
     * @return startRecord
     */
    public int getStartRecord() {
        return startRecord;
    }


    /**
     * Sets the startRecord value for this GetMUBetsReq.
     * 
     * @param startRecord
     */
    public void setStartRecord(int startRecord) {
        this.startRecord = startRecord;
    }


    /**
     * Gets the matchedSince value for this GetMUBetsReq.
     * 
     * @return matchedSince
     */
    public java.util.Calendar getMatchedSince() {
        return matchedSince;
    }


    /**
     * Sets the matchedSince value for this GetMUBetsReq.
     * 
     * @param matchedSince
     */
    public void setMatchedSince(java.util.Calendar matchedSince) {
        this.matchedSince = matchedSince;
    }


    /**
     * Gets the excludeLastSecond value for this GetMUBetsReq.
     * 
     * @return excludeLastSecond
     */
    public boolean isExcludeLastSecond() {
        return excludeLastSecond;
    }


    /**
     * Sets the excludeLastSecond value for this GetMUBetsReq.
     * 
     * @param excludeLastSecond
     */
    public void setExcludeLastSecond(boolean excludeLastSecond) {
        this.excludeLastSecond = excludeLastSecond;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMUBetsReq)) return false;
        GetMUBetsReq other = (GetMUBetsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.betStatus==null && other.getBetStatus()==null) || 
             (this.betStatus!=null &&
              this.betStatus.equals(other.getBetStatus()))) &&
            this.marketId == other.getMarketId() &&
            ((this.betIds==null && other.getBetIds()==null) || 
             (this.betIds!=null &&
              java.util.Arrays.equals(this.betIds, other.getBetIds()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            this.recordCount == other.getRecordCount() &&
            this.startRecord == other.getStartRecord() &&
            ((this.matchedSince==null && other.getMatchedSince()==null) || 
             (this.matchedSince!=null &&
              this.matchedSince.equals(other.getMatchedSince()))) &&
            this.excludeLastSecond == other.isExcludeLastSecond();
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
        if (getBetStatus() != null) {
            _hashCode += getBetStatus().hashCode();
        }
        _hashCode += getMarketId();
        if (getBetIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBetIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBetIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        _hashCode += getRecordCount();
        _hashCode += getStartRecord();
        if (getMatchedSince() != null) {
            _hashCode += getMatchedSince().hashCode();
        }
        _hashCode += (isExcludeLastSecond() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMUBetsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "betId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetsOrderByEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "SortOrderEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeLastSecond");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excludeLastSecond"));
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
