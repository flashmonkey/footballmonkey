/**
 * UpdateBetsResultEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class UpdateBetsResultEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UpdateBetsResultEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _BET_IN_PROGRESS = "BET_IN_PROGRESS";
    public static final java.lang.String _BBM_DAEMON_NOT_AVAILABLE = "BBM_DAEMON_NOT_AVAILABLE";
    public static final java.lang.String _BET_CANCELLED_REMAINING_UNMATCHED = "BET_CANCELLED_REMAINING_UNMATCHED";
    public static final java.lang.String _BET_CANNOT_BE_ACCEPTED = "BET_CANNOT_BE_ACCEPTED";
    public static final java.lang.String _BET_NOT_CANCELLED = "BET_NOT_CANCELLED";
    public static final java.lang.String _BET_TAKEN_OR_LAPSED = "BET_TAKEN_OR_LAPSED";
    public static final java.lang.String _CANCELLED_NOT_PLACED = "CANCELLED_NOT_PLACED";
    public static final java.lang.String _ERROR_LINE_EXPO_BET_CANCELLED_NOT_PLACED = "ERROR_LINE_EXPO_BET_CANCELLED_NOT_PLACED";
    public static final java.lang.String _EVENT_CLOSED_CANNOT_MODIFY_BET = "EVENT_CLOSED_CANNOT_MODIFY_BET";
    public static final java.lang.String _EXCEEDED_EXPOSURE_OR_AVAILABLE_TO_BET_BALANCE = "EXCEEDED_EXPOSURE_OR_AVAILABLE_TO_BET_BALANCE";
    public static final java.lang.String _EXPOSURE_CALCULATION_ERROR = "EXPOSURE_CALCULATION_ERROR";
    public static final java.lang.String _EXPOSURE_CALCULATION_IN_PROGRESS = "EXPOSURE_CALCULATION_IN_PROGRESS";
    public static final java.lang.String _FROM_COUNTRY_ON_EVENT_FORBIDDEN = "FROM_COUNTRY_ON_EVENT_FORBIDDEN";
    public static final java.lang.String _INPLAY_FROM_COUNTRY_FORBIDDEN = "INPLAY_FROM_COUNTRY_FORBIDDEN";
    public static final java.lang.String _INSUFFICIENT_BALANCE = "INSUFFICIENT_BALANCE";
    public static final java.lang.String _INVALID_BET_ID = "INVALID_BET_ID";
    public static final java.lang.String _INVALID_OLD_PRICE = "INVALID_OLD_PRICE";
    public static final java.lang.String _INVALID_OLD_SIZE = "INVALID_OLD_SIZE";
    public static final java.lang.String _INVALID_PRICE = "INVALID_PRICE";
    public static final java.lang.String _INVALID_PRICE_AND_SIZE = "INVALID_PRICE_AND_SIZE";
    public static final java.lang.String _INVALID_SIZE = "INVALID_SIZE";
    public static final java.lang.String _LOSS_LIMIT_EXCEEDED = "LOSS_LIMIT_EXCEEDED";
    public static final java.lang.String _NEW_BET_SUBMITTED_SUCCESSFULLY = "NEW_BET_SUBMITTED_SUCCESSFULLY";
    public static final java.lang.String _NOT_PLACED_EXPOSURE_EXCEEDED = "NOT_PLACED_EXPOSURE_EXCEEDED";
    public static final java.lang.String _NOT_PLACED_REMAINING_CANCELLED = "NOT_PLACED_REMAINING_CANCELLED";
    public static final java.lang.String _OK_REMAINING_CANCELLED = "OK_REMAINING_CANCELLED";
    public static final java.lang.String _PARTIAL_CANCELLATION = "PARTIAL_CANCELLATION";
    public static final java.lang.String _REMAINING_SIZE_CANCELLED = "REMAINING_SIZE_CANCELLED";
    public static final java.lang.String _RUNNER_REMOVED = "RUNNER_REMOVED";
    public static final java.lang.String _SITE_UPGRADE = "SITE_UPGRADE";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _VACANT_TRAP = "VACANT_TRAP";
    public static final java.lang.String _WRONG_MININUM_PERMITTED_BET_SIZE = "WRONG_MININUM_PERMITTED_BET_SIZE";
    public static final java.lang.String _BSP_BETS_CANNOT_BE_CANCELLED = "BSP_BETS_CANNOT_BE_CANCELLED";
    public static final java.lang.String _BSP_BETTING_NOT_ALLOWED = "BSP_BETTING_NOT_ALLOWED";
    public static final java.lang.String _BSP_BETTING_NOT_SUPPORTED = "BSP_BETTING_NOT_SUPPORTED";
    public static final java.lang.String _BSP_INVALID_PRICE_LIMIT = "BSP_INVALID_PRICE_LIMIT";
    public static final java.lang.String _BSP_MOC_BETS_EDITING_NOT_PERMITTED = "BSP_MOC_BETS_EDITING_NOT_PERMITTED";
    public static final java.lang.String _INVALID_BSP_BET_UPDATE = "INVALID_BSP_BET_UPDATE";
    public static final java.lang.String _INVALID_INPUTS = "INVALID_INPUTS";
    public static final java.lang.String _PERSISTENCE_MODIFICATION_SUCCESS = "PERSISTENCE_MODIFICATION_SUCCESS";
    public static final java.lang.String _INVALID_NEW_PRICE_LIMIT = "INVALID_NEW_PRICE_LIMIT";
    public static final java.lang.String _BSP_INVALID_PERSISTENCE = "BSP_INVALID_PERSISTENCE";
    public static final UpdateBetsResultEnum OK = new UpdateBetsResultEnum(_OK);
    public static final UpdateBetsResultEnum BET_IN_PROGRESS = new UpdateBetsResultEnum(_BET_IN_PROGRESS);
    public static final UpdateBetsResultEnum BBM_DAEMON_NOT_AVAILABLE = new UpdateBetsResultEnum(_BBM_DAEMON_NOT_AVAILABLE);
    public static final UpdateBetsResultEnum BET_CANCELLED_REMAINING_UNMATCHED = new UpdateBetsResultEnum(_BET_CANCELLED_REMAINING_UNMATCHED);
    public static final UpdateBetsResultEnum BET_CANNOT_BE_ACCEPTED = new UpdateBetsResultEnum(_BET_CANNOT_BE_ACCEPTED);
    public static final UpdateBetsResultEnum BET_NOT_CANCELLED = new UpdateBetsResultEnum(_BET_NOT_CANCELLED);
    public static final UpdateBetsResultEnum BET_TAKEN_OR_LAPSED = new UpdateBetsResultEnum(_BET_TAKEN_OR_LAPSED);
    public static final UpdateBetsResultEnum CANCELLED_NOT_PLACED = new UpdateBetsResultEnum(_CANCELLED_NOT_PLACED);
    public static final UpdateBetsResultEnum ERROR_LINE_EXPO_BET_CANCELLED_NOT_PLACED = new UpdateBetsResultEnum(_ERROR_LINE_EXPO_BET_CANCELLED_NOT_PLACED);
    public static final UpdateBetsResultEnum EVENT_CLOSED_CANNOT_MODIFY_BET = new UpdateBetsResultEnum(_EVENT_CLOSED_CANNOT_MODIFY_BET);
    public static final UpdateBetsResultEnum EXCEEDED_EXPOSURE_OR_AVAILABLE_TO_BET_BALANCE = new UpdateBetsResultEnum(_EXCEEDED_EXPOSURE_OR_AVAILABLE_TO_BET_BALANCE);
    public static final UpdateBetsResultEnum EXPOSURE_CALCULATION_ERROR = new UpdateBetsResultEnum(_EXPOSURE_CALCULATION_ERROR);
    public static final UpdateBetsResultEnum EXPOSURE_CALCULATION_IN_PROGRESS = new UpdateBetsResultEnum(_EXPOSURE_CALCULATION_IN_PROGRESS);
    public static final UpdateBetsResultEnum FROM_COUNTRY_ON_EVENT_FORBIDDEN = new UpdateBetsResultEnum(_FROM_COUNTRY_ON_EVENT_FORBIDDEN);
    public static final UpdateBetsResultEnum INPLAY_FROM_COUNTRY_FORBIDDEN = new UpdateBetsResultEnum(_INPLAY_FROM_COUNTRY_FORBIDDEN);
    public static final UpdateBetsResultEnum INSUFFICIENT_BALANCE = new UpdateBetsResultEnum(_INSUFFICIENT_BALANCE);
    public static final UpdateBetsResultEnum INVALID_BET_ID = new UpdateBetsResultEnum(_INVALID_BET_ID);
    public static final UpdateBetsResultEnum INVALID_OLD_PRICE = new UpdateBetsResultEnum(_INVALID_OLD_PRICE);
    public static final UpdateBetsResultEnum INVALID_OLD_SIZE = new UpdateBetsResultEnum(_INVALID_OLD_SIZE);
    public static final UpdateBetsResultEnum INVALID_PRICE = new UpdateBetsResultEnum(_INVALID_PRICE);
    public static final UpdateBetsResultEnum INVALID_PRICE_AND_SIZE = new UpdateBetsResultEnum(_INVALID_PRICE_AND_SIZE);
    public static final UpdateBetsResultEnum INVALID_SIZE = new UpdateBetsResultEnum(_INVALID_SIZE);
    public static final UpdateBetsResultEnum LOSS_LIMIT_EXCEEDED = new UpdateBetsResultEnum(_LOSS_LIMIT_EXCEEDED);
    public static final UpdateBetsResultEnum NEW_BET_SUBMITTED_SUCCESSFULLY = new UpdateBetsResultEnum(_NEW_BET_SUBMITTED_SUCCESSFULLY);
    public static final UpdateBetsResultEnum NOT_PLACED_EXPOSURE_EXCEEDED = new UpdateBetsResultEnum(_NOT_PLACED_EXPOSURE_EXCEEDED);
    public static final UpdateBetsResultEnum NOT_PLACED_REMAINING_CANCELLED = new UpdateBetsResultEnum(_NOT_PLACED_REMAINING_CANCELLED);
    public static final UpdateBetsResultEnum OK_REMAINING_CANCELLED = new UpdateBetsResultEnum(_OK_REMAINING_CANCELLED);
    public static final UpdateBetsResultEnum PARTIAL_CANCELLATION = new UpdateBetsResultEnum(_PARTIAL_CANCELLATION);
    public static final UpdateBetsResultEnum REMAINING_SIZE_CANCELLED = new UpdateBetsResultEnum(_REMAINING_SIZE_CANCELLED);
    public static final UpdateBetsResultEnum RUNNER_REMOVED = new UpdateBetsResultEnum(_RUNNER_REMOVED);
    public static final UpdateBetsResultEnum SITE_UPGRADE = new UpdateBetsResultEnum(_SITE_UPGRADE);
    public static final UpdateBetsResultEnum UNKNOWN_ERROR = new UpdateBetsResultEnum(_UNKNOWN_ERROR);
    public static final UpdateBetsResultEnum VACANT_TRAP = new UpdateBetsResultEnum(_VACANT_TRAP);
    public static final UpdateBetsResultEnum WRONG_MININUM_PERMITTED_BET_SIZE = new UpdateBetsResultEnum(_WRONG_MININUM_PERMITTED_BET_SIZE);
    public static final UpdateBetsResultEnum BSP_BETS_CANNOT_BE_CANCELLED = new UpdateBetsResultEnum(_BSP_BETS_CANNOT_BE_CANCELLED);
    public static final UpdateBetsResultEnum BSP_BETTING_NOT_ALLOWED = new UpdateBetsResultEnum(_BSP_BETTING_NOT_ALLOWED);
    public static final UpdateBetsResultEnum BSP_BETTING_NOT_SUPPORTED = new UpdateBetsResultEnum(_BSP_BETTING_NOT_SUPPORTED);
    public static final UpdateBetsResultEnum BSP_INVALID_PRICE_LIMIT = new UpdateBetsResultEnum(_BSP_INVALID_PRICE_LIMIT);
    public static final UpdateBetsResultEnum BSP_MOC_BETS_EDITING_NOT_PERMITTED = new UpdateBetsResultEnum(_BSP_MOC_BETS_EDITING_NOT_PERMITTED);
    public static final UpdateBetsResultEnum INVALID_BSP_BET_UPDATE = new UpdateBetsResultEnum(_INVALID_BSP_BET_UPDATE);
    public static final UpdateBetsResultEnum INVALID_INPUTS = new UpdateBetsResultEnum(_INVALID_INPUTS);
    public static final UpdateBetsResultEnum PERSISTENCE_MODIFICATION_SUCCESS = new UpdateBetsResultEnum(_PERSISTENCE_MODIFICATION_SUCCESS);
    public static final UpdateBetsResultEnum INVALID_NEW_PRICE_LIMIT = new UpdateBetsResultEnum(_INVALID_NEW_PRICE_LIMIT);
    public static final UpdateBetsResultEnum BSP_INVALID_PERSISTENCE = new UpdateBetsResultEnum(_BSP_INVALID_PERSISTENCE);
    public java.lang.String getValue() { return _value_;}
    public static UpdateBetsResultEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UpdateBetsResultEnum enumeration = (UpdateBetsResultEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UpdateBetsResultEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UpdateBetsResultEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResultEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
