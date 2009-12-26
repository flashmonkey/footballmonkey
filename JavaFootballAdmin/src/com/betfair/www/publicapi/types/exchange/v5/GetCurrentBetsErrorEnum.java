/**
 * GetCurrentBetsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetCurrentBetsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetCurrentBetsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_START_RECORD = "INVALID_START_RECORD";
    public static final java.lang.String _INVALID_MARKET_ID = "INVALID_MARKET_ID";
    public static final java.lang.String _INVALID_RECORD_COUNT = "INVALID_RECORD_COUNT";
    public static final java.lang.String _INVALID_BET_STATUS = "INVALID_BET_STATUS";
    public static final java.lang.String _INVALID_ORDER_BY_FOR_STATUS = "INVALID_ORDER_BY_FOR_STATUS";
    public static final java.lang.String _INVALID_LOCALE_DEFAULTING_TO_ENGLISH = "INVALID_LOCALE_DEFAULTING_TO_ENGLISH";
    public static final java.lang.String _NO_RESULTS = "NO_RESULTS";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetCurrentBetsErrorEnum OK = new GetCurrentBetsErrorEnum(_OK);
    public static final GetCurrentBetsErrorEnum INVALID_START_RECORD = new GetCurrentBetsErrorEnum(_INVALID_START_RECORD);
    public static final GetCurrentBetsErrorEnum INVALID_MARKET_ID = new GetCurrentBetsErrorEnum(_INVALID_MARKET_ID);
    public static final GetCurrentBetsErrorEnum INVALID_RECORD_COUNT = new GetCurrentBetsErrorEnum(_INVALID_RECORD_COUNT);
    public static final GetCurrentBetsErrorEnum INVALID_BET_STATUS = new GetCurrentBetsErrorEnum(_INVALID_BET_STATUS);
    public static final GetCurrentBetsErrorEnum INVALID_ORDER_BY_FOR_STATUS = new GetCurrentBetsErrorEnum(_INVALID_ORDER_BY_FOR_STATUS);
    public static final GetCurrentBetsErrorEnum INVALID_LOCALE_DEFAULTING_TO_ENGLISH = new GetCurrentBetsErrorEnum(_INVALID_LOCALE_DEFAULTING_TO_ENGLISH);
    public static final GetCurrentBetsErrorEnum NO_RESULTS = new GetCurrentBetsErrorEnum(_NO_RESULTS);
    public static final GetCurrentBetsErrorEnum API_ERROR = new GetCurrentBetsErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetCurrentBetsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetCurrentBetsErrorEnum enumeration = (GetCurrentBetsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetCurrentBetsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetCurrentBetsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
