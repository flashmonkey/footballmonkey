/**
 * GetCompleteMarketPricesErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetCompleteMarketPricesErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetCompleteMarketPricesErrorEnum(java.lang.String value) {
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
    public static final GetCompleteMarketPricesErrorEnum OK = new GetCompleteMarketPricesErrorEnum(_OK);
    public static final GetCompleteMarketPricesErrorEnum INVALID_CURRENCY = new GetCompleteMarketPricesErrorEnum(_INVALID_CURRENCY);
    public static final GetCompleteMarketPricesErrorEnum INVALID_MARKET = new GetCompleteMarketPricesErrorEnum(_INVALID_MARKET);
    public static final GetCompleteMarketPricesErrorEnum MARKET_TYPE_NOT_SUPPORTED = new GetCompleteMarketPricesErrorEnum(_MARKET_TYPE_NOT_SUPPORTED);
    public static final GetCompleteMarketPricesErrorEnum EVENT_CLOSED = new GetCompleteMarketPricesErrorEnum(_EVENT_CLOSED);
    public static final GetCompleteMarketPricesErrorEnum EVENT_SUSPENDED = new GetCompleteMarketPricesErrorEnum(_EVENT_SUSPENDED);
    public static final GetCompleteMarketPricesErrorEnum EVENT_INACTIVE = new GetCompleteMarketPricesErrorEnum(_EVENT_INACTIVE);
    public static final GetCompleteMarketPricesErrorEnum API_ERROR = new GetCompleteMarketPricesErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetCompleteMarketPricesErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetCompleteMarketPricesErrorEnum enumeration = (GetCompleteMarketPricesErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetCompleteMarketPricesErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetCompleteMarketPricesErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCompleteMarketPricesErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
