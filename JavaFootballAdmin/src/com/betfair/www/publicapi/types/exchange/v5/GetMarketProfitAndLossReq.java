/**
 * GetMarketProfitAndLossReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMarketProfitAndLossReq  extends com.betfair.www.publicapi.types.exchange.v5.APIRequest  implements java.io.Serializable {
    private java.lang.String locale;

    private boolean includeSettledBets;

    private boolean includeBspBets;

    private int marketID;

    private boolean netOfCommission;

    public GetMarketProfitAndLossReq() {
    }

    public GetMarketProfitAndLossReq(
           com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader header,
           java.lang.String locale,
           boolean includeSettledBets,
           boolean includeBspBets,
           int marketID,
           boolean netOfCommission) {
        super(
            header);
        this.locale = locale;
        this.includeSettledBets = includeSettledBets;
        this.includeBspBets = includeBspBets;
        this.marketID = marketID;
        this.netOfCommission = netOfCommission;
    }


    /**
     * Gets the locale value for this GetMarketProfitAndLossReq.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this GetMarketProfitAndLossReq.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the includeSettledBets value for this GetMarketProfitAndLossReq.
     * 
     * @return includeSettledBets
     */
    public boolean isIncludeSettledBets() {
        return includeSettledBets;
    }


    /**
     * Sets the includeSettledBets value for this GetMarketProfitAndLossReq.
     * 
     * @param includeSettledBets
     */
    public void setIncludeSettledBets(boolean includeSettledBets) {
        this.includeSettledBets = includeSettledBets;
    }


    /**
     * Gets the includeBspBets value for this GetMarketProfitAndLossReq.
     * 
     * @return includeBspBets
     */
    public boolean isIncludeBspBets() {
        return includeBspBets;
    }


    /**
     * Sets the includeBspBets value for this GetMarketProfitAndLossReq.
     * 
     * @param includeBspBets
     */
    public void setIncludeBspBets(boolean includeBspBets) {
        this.includeBspBets = includeBspBets;
    }


    /**
     * Gets the marketID value for this GetMarketProfitAndLossReq.
     * 
     * @return marketID
     */
    public int getMarketID() {
        return marketID;
    }


    /**
     * Sets the marketID value for this GetMarketProfitAndLossReq.
     * 
     * @param marketID
     */
    public void setMarketID(int marketID) {
        this.marketID = marketID;
    }


    /**
     * Gets the netOfCommission value for this GetMarketProfitAndLossReq.
     * 
     * @return netOfCommission
     */
    public boolean isNetOfCommission() {
        return netOfCommission;
    }


    /**
     * Sets the netOfCommission value for this GetMarketProfitAndLossReq.
     * 
     * @param netOfCommission
     */
    public void setNetOfCommission(boolean netOfCommission) {
        this.netOfCommission = netOfCommission;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMarketProfitAndLossReq)) return false;
        GetMarketProfitAndLossReq other = (GetMarketProfitAndLossReq) obj;
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
            this.includeSettledBets == other.isIncludeSettledBets() &&
            this.includeBspBets == other.isIncludeBspBets() &&
            this.marketID == other.getMarketID() &&
            this.netOfCommission == other.isNetOfCommission();
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
        _hashCode += (isIncludeSettledBets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeBspBets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMarketID();
        _hashCode += (isNetOfCommission() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMarketProfitAndLossReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSettledBets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeSettledBets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeBspBets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeBspBets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netOfCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netOfCommission"));
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
