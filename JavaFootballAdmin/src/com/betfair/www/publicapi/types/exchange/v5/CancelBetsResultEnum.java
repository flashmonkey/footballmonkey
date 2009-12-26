/**
 * CancelBetsResultEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CancelBetsResultEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CancelBetsResultEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _BET_IN_PROGRESS = "BET_IN_PROGRESS";
    public static final java.lang.String _BBM_DAEMON_NOT_AVAILABLE = "BBM_DAEMON_NOT_AVAILABLE";
    public static final java.lang.String _INVALID_BET_ID = "INVALID_BET_ID";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _TAKEN_OR_LAPSED = "TAKEN_OR_LAPSED";
    public static final java.lang.String _REMAINING_CANCELLED = "REMAINING_CANCELLED";
    public static final java.lang.String _INPLAY_FORBIDDEN = "INPLAY_FORBIDDEN";
    public static final java.lang.String _FROM_COUNTRY_FORBIDDEN = "FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _INPLAY_FROM_COUNTRY_FORBIDDEN = "INPLAY_FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _SITE_UPGRADE = "SITE_UPGRADE";
    public static final java.lang.String _BET_NOT_CANCELLED = "BET_NOT_CANCELLED";
    public static final java.lang.String _BSP_BETS_CANNOT_BE_CANCELLED = "BSP_BETS_CANNOT_BE_CANCELLED";
    public static final CancelBetsResultEnum OK = new CancelBetsResultEnum(_OK);
    public static final CancelBetsResultEnum BET_IN_PROGRESS = new CancelBetsResultEnum(_BET_IN_PROGRESS);
    public static final CancelBetsResultEnum BBM_DAEMON_NOT_AVAILABLE = new CancelBetsResultEnum(_BBM_DAEMON_NOT_AVAILABLE);
    public static final CancelBetsResultEnum INVALID_BET_ID = new CancelBetsResultEnum(_INVALID_BET_ID);
    public static final CancelBetsResultEnum UNKNOWN_ERROR = new CancelBetsResultEnum(_UNKNOWN_ERROR);
    public static final CancelBetsResultEnum TAKEN_OR_LAPSED = new CancelBetsResultEnum(_TAKEN_OR_LAPSED);
    public static final CancelBetsResultEnum REMAINING_CANCELLED = new CancelBetsResultEnum(_REMAINING_CANCELLED);
    public static final CancelBetsResultEnum INPLAY_FORBIDDEN = new CancelBetsResultEnum(_INPLAY_FORBIDDEN);
    public static final CancelBetsResultEnum FROM_COUNTRY_FORBIDDEN = new CancelBetsResultEnum(_FROM_COUNTRY_FORBIDDEN);
    public static final CancelBetsResultEnum INPLAY_FROM_COUNTRY_FORBIDDEN = new CancelBetsResultEnum(_INPLAY_FROM_COUNTRY_FORBIDDEN);
    public static final CancelBetsResultEnum SITE_UPGRADE = new CancelBetsResultEnum(_SITE_UPGRADE);
    public static final CancelBetsResultEnum BET_NOT_CANCELLED = new CancelBetsResultEnum(_BET_NOT_CANCELLED);
    public static final CancelBetsResultEnum BSP_BETS_CANNOT_BE_CANCELLED = new CancelBetsResultEnum(_BSP_BETS_CANNOT_BE_CANCELLED);
    public java.lang.String getValue() { return _value_;}
    public static CancelBetsResultEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CancelBetsResultEnum enumeration = (CancelBetsResultEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CancelBetsResultEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CancelBetsResultEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResultEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
