/**
 * PlaceBetsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class PlaceBetsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PlaceBetsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _BETWEEN_1_AND_60_BETS_REQUIRED = "BETWEEN_1_AND_60_BETS_REQUIRED";
    public static final java.lang.String _EVENT_INACTIVE = "EVENT_INACTIVE";
    public static final java.lang.String _EVENT_CLOSED = "EVENT_CLOSED";
    public static final java.lang.String _EVENT_SUSPENDED = "EVENT_SUSPENDED";
    public static final java.lang.String _ACCOUNT_CLOSED = "ACCOUNT_CLOSED";
    public static final java.lang.String _ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED";
    public static final java.lang.String _AUTHORISATION_PENDING = "AUTHORISATION_PENDING";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _SITE_UPGRADE = "SITE_UPGRADE";
    public static final java.lang.String _BACK_LAY_COMBINATION = "BACK_LAY_COMBINATION";
    public static final java.lang.String _INVALID_MARKET = "INVALID_MARKET";
    public static final java.lang.String _MARKET_TYPE_NOT_SUPPORTED = "MARKET_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _DIFFERING_MARKETS = "DIFFERING_MARKETS";
    public static final java.lang.String _FROM_COUNTRY_FORBIDDEN = "FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _ACCOUNT_IS_EXCLUDED = "ACCOUNT_IS_EXCLUDED";
    public static final java.lang.String _BET_IN_PROGRESS = "BET_IN_PROGRESS";
    public static final java.lang.String _BBM_DAEMON_NOT_AVAILABLE = "BBM_DAEMON_NOT_AVAILABLE";
    public static final java.lang.String _BSP_BETTING_NOT_SUPPORTED = "BSP_BETTING_NOT_SUPPORTED";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final PlaceBetsErrorEnum OK = new PlaceBetsErrorEnum(_OK);
    public static final PlaceBetsErrorEnum BETWEEN_1_AND_60_BETS_REQUIRED = new PlaceBetsErrorEnum(_BETWEEN_1_AND_60_BETS_REQUIRED);
    public static final PlaceBetsErrorEnum EVENT_INACTIVE = new PlaceBetsErrorEnum(_EVENT_INACTIVE);
    public static final PlaceBetsErrorEnum EVENT_CLOSED = new PlaceBetsErrorEnum(_EVENT_CLOSED);
    public static final PlaceBetsErrorEnum EVENT_SUSPENDED = new PlaceBetsErrorEnum(_EVENT_SUSPENDED);
    public static final PlaceBetsErrorEnum ACCOUNT_CLOSED = new PlaceBetsErrorEnum(_ACCOUNT_CLOSED);
    public static final PlaceBetsErrorEnum ACCOUNT_SUSPENDED = new PlaceBetsErrorEnum(_ACCOUNT_SUSPENDED);
    public static final PlaceBetsErrorEnum AUTHORISATION_PENDING = new PlaceBetsErrorEnum(_AUTHORISATION_PENDING);
    public static final PlaceBetsErrorEnum INTERNAL_ERROR = new PlaceBetsErrorEnum(_INTERNAL_ERROR);
    public static final PlaceBetsErrorEnum SITE_UPGRADE = new PlaceBetsErrorEnum(_SITE_UPGRADE);
    public static final PlaceBetsErrorEnum BACK_LAY_COMBINATION = new PlaceBetsErrorEnum(_BACK_LAY_COMBINATION);
    public static final PlaceBetsErrorEnum INVALID_MARKET = new PlaceBetsErrorEnum(_INVALID_MARKET);
    public static final PlaceBetsErrorEnum MARKET_TYPE_NOT_SUPPORTED = new PlaceBetsErrorEnum(_MARKET_TYPE_NOT_SUPPORTED);
    public static final PlaceBetsErrorEnum DIFFERING_MARKETS = new PlaceBetsErrorEnum(_DIFFERING_MARKETS);
    public static final PlaceBetsErrorEnum FROM_COUNTRY_FORBIDDEN = new PlaceBetsErrorEnum(_FROM_COUNTRY_FORBIDDEN);
    public static final PlaceBetsErrorEnum ACCOUNT_IS_EXCLUDED = new PlaceBetsErrorEnum(_ACCOUNT_IS_EXCLUDED);
    public static final PlaceBetsErrorEnum BET_IN_PROGRESS = new PlaceBetsErrorEnum(_BET_IN_PROGRESS);
    public static final PlaceBetsErrorEnum BBM_DAEMON_NOT_AVAILABLE = new PlaceBetsErrorEnum(_BBM_DAEMON_NOT_AVAILABLE);
    public static final PlaceBetsErrorEnum BSP_BETTING_NOT_SUPPORTED = new PlaceBetsErrorEnum(_BSP_BETTING_NOT_SUPPORTED);
    public static final PlaceBetsErrorEnum API_ERROR = new PlaceBetsErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static PlaceBetsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PlaceBetsErrorEnum enumeration = (PlaceBetsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PlaceBetsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PlaceBetsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
