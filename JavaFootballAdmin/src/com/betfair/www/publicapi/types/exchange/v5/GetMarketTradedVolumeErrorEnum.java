/**
 * GetMarketTradedVolumeErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMarketTradedVolumeErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetMarketTradedVolumeErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _NO_RESULTS = "NO_RESULTS";
    public static final java.lang.String _INVALID_MARKET = "INVALID_MARKET";
    public static final java.lang.String _INVALID_RUNNER = "INVALID_RUNNER";
    public static final java.lang.String _INVALID_ASIAN_LINE = "INVALID_ASIAN_LINE";
    public static final java.lang.String _MARKET_CLOSED = "MARKET_CLOSED";
    public static final java.lang.String _MARKET_TYPE_NOT_SUPPORTED = "MARKET_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetMarketTradedVolumeErrorEnum OK = new GetMarketTradedVolumeErrorEnum(_OK);
    public static final GetMarketTradedVolumeErrorEnum NO_RESULTS = new GetMarketTradedVolumeErrorEnum(_NO_RESULTS);
    public static final GetMarketTradedVolumeErrorEnum INVALID_MARKET = new GetMarketTradedVolumeErrorEnum(_INVALID_MARKET);
    public static final GetMarketTradedVolumeErrorEnum INVALID_RUNNER = new GetMarketTradedVolumeErrorEnum(_INVALID_RUNNER);
    public static final GetMarketTradedVolumeErrorEnum INVALID_ASIAN_LINE = new GetMarketTradedVolumeErrorEnum(_INVALID_ASIAN_LINE);
    public static final GetMarketTradedVolumeErrorEnum MARKET_CLOSED = new GetMarketTradedVolumeErrorEnum(_MARKET_CLOSED);
    public static final GetMarketTradedVolumeErrorEnum MARKET_TYPE_NOT_SUPPORTED = new GetMarketTradedVolumeErrorEnum(_MARKET_TYPE_NOT_SUPPORTED);
    public static final GetMarketTradedVolumeErrorEnum INVALID_CURRENCY = new GetMarketTradedVolumeErrorEnum(_INVALID_CURRENCY);
    public static final GetMarketTradedVolumeErrorEnum API_ERROR = new GetMarketTradedVolumeErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetMarketTradedVolumeErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetMarketTradedVolumeErrorEnum enumeration = (GetMarketTradedVolumeErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetMarketTradedVolumeErrorEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMarketTradedVolumeErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
