/**
 * GetMarketTradedVolumeCompressedErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMarketTradedVolumeCompressedErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetMarketTradedVolumeCompressedErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_CURRENCY = "INVALID_CURRENCY";
    public static final java.lang.String _INVALID_MARKET = "INVALID_MARKET";
    public static final java.lang.String _MARKET_TYPE_NOT_SUPPORTED = "MARKET_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _EVENT_CLOSED = "EVENT_CLOSED";
    public static final java.lang.String _EVENT_SUSPENDED = "EVENT_SUSPENDED";
    public static final java.lang.String _EVENT_INACTIVE = "EVENT_INACTIVE";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetMarketTradedVolumeCompressedErrorEnum OK = new GetMarketTradedVolumeCompressedErrorEnum(_OK);
    public static final GetMarketTradedVolumeCompressedErrorEnum INVALID_CURRENCY = new GetMarketTradedVolumeCompressedErrorEnum(_INVALID_CURRENCY);
    public static final GetMarketTradedVolumeCompressedErrorEnum INVALID_MARKET = new GetMarketTradedVolumeCompressedErrorEnum(_INVALID_MARKET);
    public static final GetMarketTradedVolumeCompressedErrorEnum MARKET_TYPE_NOT_SUPPORTED = new GetMarketTradedVolumeCompressedErrorEnum(_MARKET_TYPE_NOT_SUPPORTED);
    public static final GetMarketTradedVolumeCompressedErrorEnum EVENT_CLOSED = new GetMarketTradedVolumeCompressedErrorEnum(_EVENT_CLOSED);
    public static final GetMarketTradedVolumeCompressedErrorEnum EVENT_SUSPENDED = new GetMarketTradedVolumeCompressedErrorEnum(_EVENT_SUSPENDED);
    public static final GetMarketTradedVolumeCompressedErrorEnum EVENT_INACTIVE = new GetMarketTradedVolumeCompressedErrorEnum(_EVENT_INACTIVE);
    public static final GetMarketTradedVolumeCompressedErrorEnum API_ERROR = new GetMarketTradedVolumeCompressedErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetMarketTradedVolumeCompressedErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetMarketTradedVolumeCompressedErrorEnum enumeration = (GetMarketTradedVolumeCompressedErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetMarketTradedVolumeCompressedErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetMarketTradedVolumeCompressedErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeCompressedErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
