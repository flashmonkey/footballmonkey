/**
 * GetAllMarketsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetAllMarketsReq  extends com.betfair.www.publicapi.types.exchange.v5.APIRequest  implements java.io.Serializable {
    private java.lang.String locale;

    private int[] eventTypeIds;

    private java.lang.String[] countries;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    public GetAllMarketsReq() {
    }

    public GetAllMarketsReq(
           com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader header,
           java.lang.String locale,
           int[] eventTypeIds,
           java.lang.String[] countries,
           java.util.Calendar fromDate,
           java.util.Calendar toDate) {
        super(
            header);
        this.locale = locale;
        this.eventTypeIds = eventTypeIds;
        this.countries = countries;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }


    /**
     * Gets the locale value for this GetAllMarketsReq.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this GetAllMarketsReq.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the eventTypeIds value for this GetAllMarketsReq.
     * 
     * @return eventTypeIds
     */
    public int[] getEventTypeIds() {
        return eventTypeIds;
    }


    /**
     * Sets the eventTypeIds value for this GetAllMarketsReq.
     * 
     * @param eventTypeIds
     */
    public void setEventTypeIds(int[] eventTypeIds) {
        this.eventTypeIds = eventTypeIds;
    }


    /**
     * Gets the countries value for this GetAllMarketsReq.
     * 
     * @return countries
     */
    public java.lang.String[] getCountries() {
        return countries;
    }


    /**
     * Sets the countries value for this GetAllMarketsReq.
     * 
     * @param countries
     */
    public void setCountries(java.lang.String[] countries) {
        this.countries = countries;
    }


    /**
     * Gets the fromDate value for this GetAllMarketsReq.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this GetAllMarketsReq.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this GetAllMarketsReq.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this GetAllMarketsReq.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllMarketsReq)) return false;
        GetAllMarketsReq other = (GetAllMarketsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.eventTypeIds==null && other.getEventTypeIds()==null) || 
             (this.eventTypeIds!=null &&
              java.util.Arrays.equals(this.eventTypeIds, other.getEventTypeIds()))) &&
            ((this.countries==null && other.getCountries()==null) || 
             (this.countries!=null &&
              java.util.Arrays.equals(this.countries, other.getCountries()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
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
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
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
        if (getCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllMarketsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAllMarketsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Country"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
