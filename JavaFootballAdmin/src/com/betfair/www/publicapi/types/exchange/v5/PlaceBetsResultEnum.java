/**
 * PlaceBetsResultEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class PlaceBetsResultEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PlaceBetsResultEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _BET_IN_PROGRESS = "BET_IN_PROGRESS";
    public static final java.lang.String _BBM_DAEMON_NOT_AVAILABLE = "BBM_DAEMON_NOT_AVAILABLE";
    public static final java.lang.String _ACCOUNT_CLOSED = "ACCOUNT_CLOSED";
    public static final java.lang.String _ACCOUNT_IS_EXCLUDED = "ACCOUNT_IS_EXCLUDED";
    public static final java.lang.String _ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED";
    public static final java.lang.String _CANNOT_ACCEPT_BET = "CANNOT_ACCEPT_BET";
    public static final java.lang.String _EXPOSURE_CALCULATION_IN_PROGRESS = "EXPOSURE_CALCULATION_IN_PROGRESS";
    public static final java.lang.String _EXPOSURE_OR_AVAILABLE_BALANCE_EXCEEDED = "EXPOSURE_OR_AVAILABLE_BALANCE_EXCEEDED";
    public static final java.lang.String _FROM_COUNTRY_ON_EVENT_FORBIDDEN = "FROM_COUNTRY_ON_EVENT_FORBIDDEN";
    public static final java.lang.String _INPLAY_FROM_COUNTRY_FORBIDDEN = "INPLAY_FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _INSUFFICIENT_BALANCE = "INSUFFICIENT_BALANCE";
    public static final java.lang.String _INVALID_ASIAN_LINE_ID = "INVALID_ASIAN_LINE_ID";
    public static final java.lang.String _INVALID_BET_TYPE = "INVALID_BET_TYPE";
    public static final java.lang.String _INVALID_INCREMENT = "INVALID_INCREMENT";
    public static final java.lang.String _INVALID_MARKET = "INVALID_MARKET";
    public static final java.lang.String _INVALID_PRICE = "INVALID_PRICE";
    public static final java.lang.String _INVALID_SELECTION = "INVALID_SELECTION";
    public static final java.lang.String _INVALID_SIZE = "INVALID_SIZE";
    public static final java.lang.String _LINES_OUT_OF_RANGE = "LINES_OUT_OF_RANGE";
    public static final java.lang.String _LOSS_LIMIT_EXCEEDED = "LOSS_LIMIT_EXCEEDED";
    public static final java.lang.String _SELECTION_REMOVED = "SELECTION_REMOVED";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _VACANT_TRAP = "VACANT_TRAP";
    public static final java.lang.String _EVENT_CLOSED = "EVENT_CLOSED";
    public static final java.lang.String _AUTHORISATION_PENDING = "AUTHORISATION_PENDING";
    public static final java.lang.String _BSP_BETTING_NOT_ALLOWED = "BSP_BETTING_NOT_ALLOWED";
    public static final java.lang.String _BSP_BETTING_NOT_SUPPORTED = "BSP_BETTING_NOT_SUPPORTED";
    public static final java.lang.String _BSP_MULTIPLE_BETS_NOT_ALLOWED = "BSP_MULTIPLE_BETS_NOT_ALLOWED";
    public static final java.lang.String _EVENT_RECONCILED = "EVENT_RECONCILED";
    public static final java.lang.String _INVALID_PERSISTENCE = "INVALID_PERSISTENCE";
    public static final java.lang.String _ACCOUNT_LOCKED = "ACCOUNT_LOCKED";
    public static final PlaceBetsResultEnum OK = new PlaceBetsResultEnum(_OK);
    public static final PlaceBetsResultEnum BET_IN_PROGRESS = new PlaceBetsResultEnum(_BET_IN_PROGRESS);
    public static final PlaceBetsResultEnum BBM_DAEMON_NOT_AVAILABLE = new PlaceBetsResultEnum(_BBM_DAEMON_NOT_AVAILABLE);
    public static final PlaceBetsResultEnum ACCOUNT_CLOSED = new PlaceBetsResultEnum(_ACCOUNT_CLOSED);
    public static final PlaceBetsResultEnum ACCOUNT_IS_EXCLUDED = new PlaceBetsResultEnum(_ACCOUNT_IS_EXCLUDED);
    public static final PlaceBetsResultEnum ACCOUNT_SUSPENDED = new PlaceBetsResultEnum(_ACCOUNT_SUSPENDED);
    public static final PlaceBetsResultEnum CANNOT_ACCEPT_BET = new PlaceBetsResultEnum(_CANNOT_ACCEPT_BET);
    public static final PlaceBetsResultEnum EXPOSURE_CALCULATION_IN_PROGRESS = new PlaceBetsResultEnum(_EXPOSURE_CALCULATION_IN_PROGRESS);
    public static final PlaceBetsResultEnum EXPOSURE_OR_AVAILABLE_BALANCE_EXCEEDED = new PlaceBetsResultEnum(_EXPOSURE_OR_AVAILABLE_BALANCE_EXCEEDED);
    public static final PlaceBetsResultEnum FROM_COUNTRY_ON_EVENT_FORBIDDEN = new PlaceBetsResultEnum(_FROM_COUNTRY_ON_EVENT_FORBIDDEN);
    public static final PlaceBetsResultEnum INPLAY_FROM_COUNTRY_FORBIDDEN = new PlaceBetsResultEnum(_INPLAY_FROM_COUNTRY_FORBIDDEN);
    public static final PlaceBetsResultEnum INSUFFICIENT_BALANCE = new PlaceBetsResultEnum(_INSUFFICIENT_BALANCE);
    public static final PlaceBetsResultEnum INVALID_ASIAN_LINE_ID = new PlaceBetsResultEnum(_INVALID_ASIAN_LINE_ID);
    public static final PlaceBetsResultEnum INVALID_BET_TYPE = new PlaceBetsResultEnum(_INVALID_BET_TYPE);
    public static final PlaceBetsResultEnum INVALID_INCREMENT = new PlaceBetsResultEnum(_INVALID_INCREMENT);
    public static final PlaceBetsResultEnum INVALID_MARKET = new PlaceBetsResultEnum(_INVALID_MARKET);
    public static final PlaceBetsResultEnum INVALID_PRICE = new PlaceBetsResultEnum(_INVALID_PRICE);
    public static final PlaceBetsResultEnum INVALID_SELECTION = new PlaceBetsResultEnum(_INVALID_SELECTION);
    public static final PlaceBetsResultEnum INVALID_SIZE = new PlaceBetsResultEnum(_INVALID_SIZE);
    public static final PlaceBetsResultEnum LINES_OUT_OF_RANGE = new PlaceBetsResultEnum(_LINES_OUT_OF_RANGE);
    public static final PlaceBetsResultEnum LOSS_LIMIT_EXCEEDED = new PlaceBetsResultEnum(_LOSS_LIMIT_EXCEEDED);
    public static final PlaceBetsResultEnum SELECTION_REMOVED = new PlaceBetsResultEnum(_SELECTION_REMOVED);
    public static final PlaceBetsResultEnum UNKNOWN_ERROR = new PlaceBetsResultEnum(_UNKNOWN_ERROR);
    public static final PlaceBetsResultEnum VACANT_TRAP = new PlaceBetsResultEnum(_VACANT_TRAP);
    public static final PlaceBetsResultEnum EVENT_CLOSED = new PlaceBetsResultEnum(_EVENT_CLOSED);
    public static final PlaceBetsResultEnum AUTHORISATION_PENDING = new PlaceBetsResultEnum(_AUTHORISATION_PENDING);
    public static final PlaceBetsResultEnum BSP_BETTING_NOT_ALLOWED = new PlaceBetsResultEnum(_BSP_BETTING_NOT_ALLOWED);
    public static final PlaceBetsResultEnum BSP_BETTING_NOT_SUPPORTED = new PlaceBetsResultEnum(_BSP_BETTING_NOT_SUPPORTED);
    public static final PlaceBetsResultEnum BSP_MULTIPLE_BETS_NOT_ALLOWED = new PlaceBetsResultEnum(_BSP_MULTIPLE_BETS_NOT_ALLOWED);
    public static final PlaceBetsResultEnum EVENT_RECONCILED = new PlaceBetsResultEnum(_EVENT_RECONCILED);
    public static final PlaceBetsResultEnum INVALID_PERSISTENCE = new PlaceBetsResultEnum(_INVALID_PERSISTENCE);
    public static final PlaceBetsResultEnum ACCOUNT_LOCKED = new PlaceBetsResultEnum(_ACCOUNT_LOCKED);
    public java.lang.String getValue() { return _value_;}
    public static PlaceBetsResultEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PlaceBetsResultEnum enumeration = (PlaceBetsResultEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PlaceBetsResultEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PlaceBetsResultEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResultEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
