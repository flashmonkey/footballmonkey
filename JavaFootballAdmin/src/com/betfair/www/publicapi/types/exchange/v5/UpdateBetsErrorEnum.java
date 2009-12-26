/**
 * UpdateBetsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class UpdateBetsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UpdateBetsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _BET_IN_PROGRESS = "BET_IN_PROGRESS";
    public static final java.lang.String _BBM_DAEMON_NOT_AVAILABLE = "BBM_DAEMON_NOT_AVAILABLE";
    public static final java.lang.String _ACCOUNT_PENDING = "ACCOUNT_PENDING";
    public static final java.lang.String _ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED";
    public static final java.lang.String _ACCOUNT_CLOSED = "ACCOUNT_CLOSED";
    public static final java.lang.String _INVALID_NUMBER_OF_BETS = "INVALID_NUMBER_OF_BETS";
    public static final java.lang.String _INVALID_MARKET_ID = "INVALID_MARKET_ID";
    public static final java.lang.String _MARKET_STATUS_INVALID = "MARKET_STATUS_INVALID";
    public static final java.lang.String _FROM_COUNTRY_FORBIDDEN = "FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final java.lang.String _MARKET_TYPE_NOT_SUPPORTED = "MARKET_TYPE_NOT_SUPPORTED";
    public static final UpdateBetsErrorEnum OK = new UpdateBetsErrorEnum(_OK);
    public static final UpdateBetsErrorEnum BET_IN_PROGRESS = new UpdateBetsErrorEnum(_BET_IN_PROGRESS);
    public static final UpdateBetsErrorEnum BBM_DAEMON_NOT_AVAILABLE = new UpdateBetsErrorEnum(_BBM_DAEMON_NOT_AVAILABLE);
    public static final UpdateBetsErrorEnum ACCOUNT_PENDING = new UpdateBetsErrorEnum(_ACCOUNT_PENDING);
    public static final UpdateBetsErrorEnum ACCOUNT_SUSPENDED = new UpdateBetsErrorEnum(_ACCOUNT_SUSPENDED);
    public static final UpdateBetsErrorEnum ACCOUNT_CLOSED = new UpdateBetsErrorEnum(_ACCOUNT_CLOSED);
    public static final UpdateBetsErrorEnum INVALID_NUMBER_OF_BETS = new UpdateBetsErrorEnum(_INVALID_NUMBER_OF_BETS);
    public static final UpdateBetsErrorEnum INVALID_MARKET_ID = new UpdateBetsErrorEnum(_INVALID_MARKET_ID);
    public static final UpdateBetsErrorEnum MARKET_STATUS_INVALID = new UpdateBetsErrorEnum(_MARKET_STATUS_INVALID);
    public static final UpdateBetsErrorEnum FROM_COUNTRY_FORBIDDEN = new UpdateBetsErrorEnum(_FROM_COUNTRY_FORBIDDEN);
    public static final UpdateBetsErrorEnum API_ERROR = new UpdateBetsErrorEnum(_API_ERROR);
    public static final UpdateBetsErrorEnum MARKET_TYPE_NOT_SUPPORTED = new UpdateBetsErrorEnum(_MARKET_TYPE_NOT_SUPPORTED);
    public java.lang.String getValue() { return _value_;}
    public static UpdateBetsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UpdateBetsErrorEnum enumeration = (UpdateBetsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UpdateBetsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UpdateBetsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
