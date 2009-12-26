/**
 * CancelBetsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CancelBetsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CancelBetsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _BET_IN_PROGRESS = "BET_IN_PROGRESS";
    public static final java.lang.String _BBM_DAEMON_NOT_AVAILABLE = "BBM_DAEMON_NOT_AVAILABLE";
    public static final java.lang.String _INVALID_NUMER_OF_CANCELLATIONS = "INVALID_NUMER_OF_CANCELLATIONS";
    public static final java.lang.String _MARKET_TYPE_NOT_SUPPORTED = "MARKET_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _MARKET_STATUS_INVALID = "MARKET_STATUS_INVALID";
    public static final java.lang.String _MARKET_IDS_DONT_MATCH = "MARKET_IDS_DONT_MATCH";
    public static final java.lang.String _INVALID_MARKET_ID = "INVALID_MARKET_ID";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final CancelBetsErrorEnum OK = new CancelBetsErrorEnum(_OK);
    public static final CancelBetsErrorEnum BET_IN_PROGRESS = new CancelBetsErrorEnum(_BET_IN_PROGRESS);
    public static final CancelBetsErrorEnum BBM_DAEMON_NOT_AVAILABLE = new CancelBetsErrorEnum(_BBM_DAEMON_NOT_AVAILABLE);
    public static final CancelBetsErrorEnum INVALID_NUMER_OF_CANCELLATIONS = new CancelBetsErrorEnum(_INVALID_NUMER_OF_CANCELLATIONS);
    public static final CancelBetsErrorEnum MARKET_TYPE_NOT_SUPPORTED = new CancelBetsErrorEnum(_MARKET_TYPE_NOT_SUPPORTED);
    public static final CancelBetsErrorEnum MARKET_STATUS_INVALID = new CancelBetsErrorEnum(_MARKET_STATUS_INVALID);
    public static final CancelBetsErrorEnum MARKET_IDS_DONT_MATCH = new CancelBetsErrorEnum(_MARKET_IDS_DONT_MATCH);
    public static final CancelBetsErrorEnum INVALID_MARKET_ID = new CancelBetsErrorEnum(_INVALID_MARKET_ID);
    public static final CancelBetsErrorEnum API_ERROR = new CancelBetsErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static CancelBetsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CancelBetsErrorEnum enumeration = (CancelBetsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CancelBetsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CancelBetsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
