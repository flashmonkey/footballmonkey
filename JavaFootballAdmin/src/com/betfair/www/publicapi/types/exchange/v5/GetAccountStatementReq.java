/**
 * GetAccountStatementReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetAccountStatementReq  extends com.betfair.www.publicapi.types.exchange.v5.APIRequest  implements java.io.Serializable {
    private java.util.Calendar endDate;

    private com.betfair.www.publicapi.types.exchange.v5.AccountStatementIncludeEnum itemsIncluded;

    private boolean ignoreAutoTransfers;

    private int recordCount;

    private java.util.Calendar startDate;

    private int startRecord;

    private java.lang.String locale;

    public GetAccountStatementReq() {
    }

    public GetAccountStatementReq(
           com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader header,
           java.util.Calendar endDate,
           com.betfair.www.publicapi.types.exchange.v5.AccountStatementIncludeEnum itemsIncluded,
           boolean ignoreAutoTransfers,
           int recordCount,
           java.util.Calendar startDate,
           int startRecord,
           java.lang.String locale) {
        super(
            header);
        this.endDate = endDate;
        this.itemsIncluded = itemsIncluded;
        this.ignoreAutoTransfers = ignoreAutoTransfers;
        this.recordCount = recordCount;
        this.startDate = startDate;
        this.startRecord = startRecord;
        this.locale = locale;
    }


    /**
     * Gets the endDate value for this GetAccountStatementReq.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetAccountStatementReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the itemsIncluded value for this GetAccountStatementReq.
     * 
     * @return itemsIncluded
     */
    public com.betfair.www.publicapi.types.exchange.v5.AccountStatementIncludeEnum getItemsIncluded() {
        return itemsIncluded;
    }


    /**
     * Sets the itemsIncluded value for this GetAccountStatementReq.
     * 
     * @param itemsIncluded
     */
    public void setItemsIncluded(com.betfair.www.publicapi.types.exchange.v5.AccountStatementIncludeEnum itemsIncluded) {
        this.itemsIncluded = itemsIncluded;
    }


    /**
     * Gets the ignoreAutoTransfers value for this GetAccountStatementReq.
     * 
     * @return ignoreAutoTransfers
     */
    public boolean isIgnoreAutoTransfers() {
        return ignoreAutoTransfers;
    }


    /**
     * Sets the ignoreAutoTransfers value for this GetAccountStatementReq.
     * 
     * @param ignoreAutoTransfers
     */
    public void setIgnoreAutoTransfers(boolean ignoreAutoTransfers) {
        this.ignoreAutoTransfers = ignoreAutoTransfers;
    }


    /**
     * Gets the recordCount value for this GetAccountStatementReq.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this GetAccountStatementReq.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the startDate value for this GetAccountStatementReq.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetAccountStatementReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startRecord value for this GetAccountStatementReq.
     * 
     * @return startRecord
     */
    public int getStartRecord() {
        return startRecord;
    }


    /**
     * Sets the startRecord value for this GetAccountStatementReq.
     * 
     * @param startRecord
     */
    public void setStartRecord(int startRecord) {
        this.startRecord = startRecord;
    }


    /**
     * Gets the locale value for this GetAccountStatementReq.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this GetAccountStatementReq.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountStatementReq)) return false;
        GetAccountStatementReq other = (GetAccountStatementReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.itemsIncluded==null && other.getItemsIncluded()==null) || 
             (this.itemsIncluded!=null &&
              this.itemsIncluded.equals(other.getItemsIncluded()))) &&
            this.ignoreAutoTransfers == other.isIgnoreAutoTransfers() &&
            this.recordCount == other.getRecordCount() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            this.startRecord == other.getStartRecord() &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale())));
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
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getItemsIncluded() != null) {
            _hashCode += getItemsIncluded().hashCode();
        }
        _hashCode += (isIgnoreAutoTransfers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getRecordCount();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        _hashCode += getStartRecord();
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountStatementReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountStatementReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemsIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementIncludeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreAutoTransfers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignoreAutoTransfers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
