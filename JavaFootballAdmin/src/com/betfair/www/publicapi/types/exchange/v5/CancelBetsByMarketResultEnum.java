/**
 * CancelBetsByMarketResultEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CancelBetsByMarketResultEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CancelBetsByMarketResultEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _MARKET_STATUS_INVALID = "MARKET_STATUS_INVALID";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _INVALID_MARKET = "INVALID_MARKET";
    public static final java.lang.String _NO_UNMATCHED_BETS = "NO_UNMATCHED_BETS";
    public static final java.lang.String _INPLAY_FORBIDDEN = "INPLAY_FORBIDDEN";
    public static final java.lang.String _FROM_COUNTRY_FORBIDDEN = "FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _INPLAY_FROM_COUNTRY_FORBIDDEN = "INPLAY_FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _SITE_UPGRADE = "SITE_UPGRADE";
    public static final java.lang.String _BET_NOT_CANCELLED = "BET_NOT_CANCELLED";
    public static final CancelBetsByMarketResultEnum OK = new CancelBetsByMarketResultEnum(_OK);
    public static final CancelBetsByMarketResultEnum MARKET_STATUS_INVALID = new CancelBetsByMarketResultEnum(_MARKET_STATUS_INVALID);
    public static final CancelBetsByMarketResultEnum UNKNOWN_ERROR = new CancelBetsByMarketResultEnum(_UNKNOWN_ERROR);
    public static final CancelBetsByMarketResultEnum INVALID_MARKET = new CancelBetsByMarketResultEnum(_INVALID_MARKET);
    public static final CancelBetsByMarketResultEnum NO_UNMATCHED_BETS = new CancelBetsByMarketResultEnum(_NO_UNMATCHED_BETS);
    public static final CancelBetsByMarketResultEnum INPLAY_FORBIDDEN = new CancelBetsByMarketResultEnum(_INPLAY_FORBIDDEN);
    public static final CancelBetsByMarketResultEnum FROM_COUNTRY_FORBIDDEN = new CancelBetsByMarketResultEnum(_FROM_COUNTRY_FORBIDDEN);
    public static final CancelBetsByMarketResultEnum INPLAY_FROM_COUNTRY_FORBIDDEN = new CancelBetsByMarketResultEnum(_INPLAY_FROM_COUNTRY_FORBIDDEN);
    public static final CancelBetsByMarketResultEnum SITE_UPGRADE = new CancelBetsByMarketResultEnum(_SITE_UPGRADE);
    public static final CancelBetsByMarketResultEnum BET_NOT_CANCELLED = new CancelBetsByMarketResultEnum(_BET_NOT_CANCELLED);
    public java.lang.String getValue() { return _value_;}
    public static CancelBetsByMarketResultEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CancelBetsByMarketResultEnum enumeration = (CancelBetsByMarketResultEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CancelBetsByMarketResultEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CancelBetsByMarketResultEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResultEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
