/**
 * GetCurrentBetsLiteReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetCurrentBetsLiteReq  extends com.betfair.www.publicapi.types.exchange.v5.APIRequest  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus;

    private int marketId;

    private com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum orderBy;

    private int recordCount;

    private int startRecord;

    private boolean noTotalRecordCount;

    public GetCurrentBetsLiteReq() {
    }

    public GetCurrentBetsLiteReq(
           com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader header,
           com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus,
           int marketId,
           com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum orderBy,
           int recordCount,
           int startRecord,
           boolean noTotalRecordCount) {
        super(
            header);
        this.betStatus = betStatus;
        this.marketId = marketId;
        this.orderBy = orderBy;
        this.recordCount = recordCount;
        this.startRecord = startRecord;
        this.noTotalRecordCount = noTotalRecordCount;
    }


    /**
     * Gets the betStatus value for this GetCurrentBetsLiteReq.
     * 
     * @return betStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum getBetStatus() {
        return betStatus;
    }


    /**
     * Sets the betStatus value for this GetCurrentBetsLiteReq.
     * 
     * @param betStatus
     */
    public void setBetStatus(com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum betStatus) {
        this.betStatus = betStatus;
    }


    /**
     * Gets the marketId value for this GetCurrentBetsLiteReq.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this GetCurrentBetsLiteReq.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the orderBy value for this GetCurrentBetsLiteReq.
     * 
     * @return orderBy
     */
    public com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this GetCurrentBetsLiteReq.
     * 
     * @param orderBy
     */
    public void setOrderBy(com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the recordCount value for this GetCurrentBetsLiteReq.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this GetCurrentBetsLiteReq.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the startRecord value for this GetCurrentBetsLiteReq.
     * 
     * @return startRecord
     */
    public int getStartRecord() {
        return startRecord;
    }


    /**
     * Sets the startRecord value for this GetCurrentBetsLiteReq.
     * 
     * @param startRecord
     */
    public void setStartRecord(int startRecord) {
        this.startRecord = startRecord;
    }


    /**
     * Gets the noTotalRecordCount value for this GetCurrentBetsLiteReq.
     * 
     * @return noTotalRecordCount
     */
    public boolean isNoTotalRecordCount() {
        return noTotalRecordCount;
    }


    /**
     * Sets the noTotalRecordCount value for this GetCurrentBetsLiteReq.
     * 
     * @param noTotalRecordCount
     */
    public void setNoTotalRecordCount(boolean noTotalRecordCount) {
        this.noTotalRecordCount = noTotalRecordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentBetsLiteReq)) return false;
        GetCurrentBetsLiteReq other = (GetCurrentBetsLiteReq) obj;
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
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            this.recordCount == other.getRecordCount() &&
            this.startRecord == other.getStartRecord() &&
            this.noTotalRecordCount == other.isNoTotalRecordCount();
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
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        _hashCode += getRecordCount();
        _hashCode += getStartRecord();
        _hashCode += (isNoTotalRecordCount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentBetsLiteReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsLiteReq"));
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
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetsOrderByEnum"));
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
        elemField.setFieldName("noTotalRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noTotalRecordCount"));
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
