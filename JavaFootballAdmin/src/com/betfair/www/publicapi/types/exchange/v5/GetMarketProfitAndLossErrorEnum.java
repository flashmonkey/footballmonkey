/**
 * GetMarketProfitAndLossErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMarketProfitAndLossErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetMarketProfitAndLossErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_MARKET = "INVALID_MARKET";
    public static final java.lang.String _UNSUPPORTED_MARKET_TYPE = "UNSUPPORTED_MARKET_TYPE";
    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _MARKET_CLOSED = "MARKET_CLOSED";
    public static final java.lang.String _INVALID_LOCALE_DEFAULTING_TO_ENGLISH = "INVALID_LOCALE_DEFAULTING_TO_ENGLISH";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetMarketProfitAndLossErrorEnum INVALID_MARKET = new GetMarketProfitAndLossErrorEnum(_INVALID_MARKET);
    public static final GetMarketProfitAndLossErrorEnum UNSUPPORTED_MARKET_TYPE = new GetMarketProfitAndLossErrorEnum(_UNSUPPORTED_MARKET_TYPE);
    public static final GetMarketProfitAndLossErrorEnum OK = new GetMarketProfitAndLossErrorEnum(_OK);
    public static final GetMarketProfitAndLossErrorEnum MARKET_CLOSED = new GetMarketProfitAndLossErrorEnum(_MARKET_CLOSED);
    public static final GetMarketProfitAndLossErrorEnum INVALID_LOCALE_DEFAULTING_TO_ENGLISH = new GetMarketProfitAndLossErrorEnum(_INVALID_LOCALE_DEFAULTING_TO_ENGLISH);
    public static final GetMarketProfitAndLossErrorEnum API_ERROR = new GetMarketProfitAndLossErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetMarketProfitAndLossErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetMarketProfitAndLossErrorEnum enumeration = (GetMarketProfitAndLossErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetMarketProfitAndLossErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetMarketProfitAndLossErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
