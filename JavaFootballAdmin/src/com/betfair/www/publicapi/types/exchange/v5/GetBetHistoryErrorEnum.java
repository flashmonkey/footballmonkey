/**
 * GetBetHistoryErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetBetHistoryErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetBetHistoryErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_EVENT_TYPE_ID = "INVALID_EVENT_TYPE_ID";
    public static final java.lang.String _NO_RESULTS = "NO_RESULTS";
    public static final java.lang.String _INVALID_RECORD_COUNT = "INVALID_RECORD_COUNT";
    public static final java.lang.String _INVALID_BET_STATUS = "INVALID_BET_STATUS";
    public static final java.lang.String _INVALID_MARKET_TYPE = "INVALID_MARKET_TYPE";
    public static final java.lang.String _INVALID_ORDER_BY = "INVALID_ORDER_BY";
    public static final java.lang.String _INVALID_START_RECORD = "INVALID_START_RECORD";
    public static final java.lang.String _INVALID_LOCALE_DEFAULTING_TO_ENGLISH = "INVALID_LOCALE_DEFAULTING_TO_ENGLISH";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final GetBetHistoryErrorEnum OK = new GetBetHistoryErrorEnum(_OK);
    public static final GetBetHistoryErrorEnum INVALID_EVENT_TYPE_ID = new GetBetHistoryErrorEnum(_INVALID_EVENT_TYPE_ID);
    public static final GetBetHistoryErrorEnum NO_RESULTS = new GetBetHistoryErrorEnum(_NO_RESULTS);
    public static final GetBetHistoryErrorEnum INVALID_RECORD_COUNT = new GetBetHistoryErrorEnum(_INVALID_RECORD_COUNT);
    public static final GetBetHistoryErrorEnum INVALID_BET_STATUS = new GetBetHistoryErrorEnum(_INVALID_BET_STATUS);
    public static final GetBetHistoryErrorEnum INVALID_MARKET_TYPE = new GetBetHistoryErrorEnum(_INVALID_MARKET_TYPE);
    public static final GetBetHistoryErrorEnum INVALID_ORDER_BY = new GetBetHistoryErrorEnum(_INVALID_ORDER_BY);
    public static final GetBetHistoryErrorEnum INVALID_START_RECORD = new GetBetHistoryErrorEnum(_INVALID_START_RECORD);
    public static final GetBetHistoryErrorEnum INVALID_LOCALE_DEFAULTING_TO_ENGLISH = new GetBetHistoryErrorEnum(_INVALID_LOCALE_DEFAULTING_TO_ENGLISH);
    public static final GetBetHistoryErrorEnum API_ERROR = new GetBetHistoryErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetBetHistoryErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetBetHistoryErrorEnum enumeration = (GetBetHistoryErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetBetHistoryErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetBetHistoryErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
