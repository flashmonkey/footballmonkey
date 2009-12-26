/**
 * ServiceEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class ServiceEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADD_PAYMENT_CARD = "ADD_PAYMENT_CARD";
    public static final java.lang.String _DELETE_PAYMENT_CARD = "DELETE_PAYMENT_CARD";
    public static final java.lang.String _GET_PAYMENT_CARD = "GET_PAYMENT_CARD";
    public static final java.lang.String _UPDATE_PAYMENT_CARD = "UPDATE_PAYMENT_CARD";
    public static final java.lang.String _LOGIN = "LOGIN";
    public static final java.lang.String _GET_BET = "GET_BET";
    public static final java.lang.String _PLACE_BETS = "PLACE_BETS";
    public static final java.lang.String _WITHDRAW_TO_PAYMENT_CARD = "WITHDRAW_TO_PAYMENT_CARD";
    public static final java.lang.String _EDIT_BETS = "EDIT_BETS";
    public static final java.lang.String _DEPOSIT_FROM_PAYMENT_CARD = "DEPOSIT_FROM_PAYMENT_CARD";
    public static final java.lang.String _CANCEL_BETS = "CANCEL_BETS";
    public static final java.lang.String _DO_KEEP_ALIVE = "DO_KEEP_ALIVE";
    public static final java.lang.String _GET_ACCOUNT_STATEMENT = "GET_ACCOUNT_STATEMENT";
    public static final java.lang.String _LOAD_MARKET_PROFIT_LOSS = "LOAD_MARKET_PROFIT_LOSS";
    public static final java.lang.String _GET_CURRENT_BETS = "GET_CURRENT_BETS";
    public static final java.lang.String _LOAD_ACCOUNT_FUNDS = "LOAD_ACCOUNT_FUNDS";
    public static final java.lang.String _LOAD_BET_HISTORY = "LOAD_BET_HISTORY";
    public static final java.lang.String _LOAD_DETAILED_AVAIL_MKT_DEPTH = "LOAD_DETAILED_AVAIL_MKT_DEPTH";
    public static final java.lang.String _GET_MARKET_TRADED_VOLUME = "GET_MARKET_TRADED_VOLUME";
    public static final java.lang.String _LOAD_EVENTS = "LOAD_EVENTS";
    public static final java.lang.String _LOAD_EVENT_TYPES = "LOAD_EVENT_TYPES";
    public static final java.lang.String _LOAD_MARKET = "LOAD_MARKET";
    public static final java.lang.String _LOAD_MARKET_PRICES = "LOAD_MARKET_PRICES";
    public static final java.lang.String _LOAD_MARKET_PRICES_COMPRESSED = "LOAD_MARKET_PRICES_COMPRESSED";
    public static final java.lang.String _LOAD_SERVICE_ANNOUNCEMENTS = "LOAD_SERVICE_ANNOUNCEMENTS";
    public static final java.lang.String _LOAD_SUBSCRIPTION_INFO = "LOAD_SUBSCRIPTION_INFO";
    public static final java.lang.String _CREATE_ACCOUNT = "CREATE_ACCOUNT";
    public static final java.lang.String _CONVERT_CURRENCY = "CONVERT_CURRENCY";
    public static final java.lang.String _GET_CURRENCIES = "GET_CURRENCIES";
    public static final java.lang.String _FORGOT_PASSWORD = "FORGOT_PASSWORD";
    public static final java.lang.String _MODIFY_PASSWORD = "MODIFY_PASSWORD";
    public static final java.lang.String _VIEW_PROFILE = "VIEW_PROFILE";
    public static final java.lang.String _MODIFY_PROFILE = "MODIFY_PROFILE";
    public static final java.lang.String _LOGOUT = "LOGOUT";
    public static final java.lang.String _RETRIEVE_LIMB_MESSAGE = "RETRIEVE_LIMB_MESSAGE";
    public static final java.lang.String _SUBMIT_LIMB_MESSAGE = "SUBMIT_LIMB_MESSAGE";
    public static final java.lang.String _GET_MARGIN_MARKET_PRICES = "GET_MARGIN_MARKET_PRICES";
    public static final java.lang.String _GET_MARGIN_MARKET_PRICES_COMPRESSED = "GET_MARGIN_MARKET_PRICES_COMPRESSED";
    public static final java.lang.String _GENERATE_REGISTERED_MARGIN_PRICES = "GENERATE_REGISTERED_MARGIN_PRICES";
    public static final java.lang.String _MARGINLOGIN = "MARGINLOGIN";
    public static final java.lang.String _TRANSFER_FUNDS = "TRANSFER_FUNDS";
    public static final java.lang.String _ADD_VENDORSUBSCRIPTION = "ADD_VENDORSUBSCRIPTION";
    public static final java.lang.String _UPDATE_VENDORSUBSCRIPTION = "UPDATE_VENDORSUBSCRIPTION";
    public static final java.lang.String _CANCEL_VENDORSUBSCRIPTION = "CANCEL_VENDORSUBSCRIPTION";
    public static final java.lang.String _GET_VENDOR_USERS = "GET_VENDOR_USERS";
    public static final java.lang.String _GET_VENDORSUBSCRIPTION_INFO = "GET_VENDORSUBSCRIPTION_INFO";
    public static final java.lang.String _GET_VENDOR_INFO = "GET_VENDOR_INFO";
    public static final ServiceEnum ADD_PAYMENT_CARD = new ServiceEnum(_ADD_PAYMENT_CARD);
    public static final ServiceEnum DELETE_PAYMENT_CARD = new ServiceEnum(_DELETE_PAYMENT_CARD);
    public static final ServiceEnum GET_PAYMENT_CARD = new ServiceEnum(_GET_PAYMENT_CARD);
    public static final ServiceEnum UPDATE_PAYMENT_CARD = new ServiceEnum(_UPDATE_PAYMENT_CARD);
    public static final ServiceEnum LOGIN = new ServiceEnum(_LOGIN);
    public static final ServiceEnum GET_BET = new ServiceEnum(_GET_BET);
    public static final ServiceEnum PLACE_BETS = new ServiceEnum(_PLACE_BETS);
    public static final ServiceEnum WITHDRAW_TO_PAYMENT_CARD = new ServiceEnum(_WITHDRAW_TO_PAYMENT_CARD);
    public static final ServiceEnum EDIT_BETS = new ServiceEnum(_EDIT_BETS);
    public static final ServiceEnum DEPOSIT_FROM_PAYMENT_CARD = new ServiceEnum(_DEPOSIT_FROM_PAYMENT_CARD);
    public static final ServiceEnum CANCEL_BETS = new ServiceEnum(_CANCEL_BETS);
    public static final ServiceEnum DO_KEEP_ALIVE = new ServiceEnum(_DO_KEEP_ALIVE);
    public static final ServiceEnum GET_ACCOUNT_STATEMENT = new ServiceEnum(_GET_ACCOUNT_STATEMENT);
    public static final ServiceEnum LOAD_MARKET_PROFIT_LOSS = new ServiceEnum(_LOAD_MARKET_PROFIT_LOSS);
    public static final ServiceEnum GET_CURRENT_BETS = new ServiceEnum(_GET_CURRENT_BETS);
    public static final ServiceEnum LOAD_ACCOUNT_FUNDS = new ServiceEnum(_LOAD_ACCOUNT_FUNDS);
    public static final ServiceEnum LOAD_BET_HISTORY = new ServiceEnum(_LOAD_BET_HISTORY);
    public static final ServiceEnum LOAD_DETAILED_AVAIL_MKT_DEPTH = new ServiceEnum(_LOAD_DETAILED_AVAIL_MKT_DEPTH);
    public static final ServiceEnum GET_MARKET_TRADED_VOLUME = new ServiceEnum(_GET_MARKET_TRADED_VOLUME);
    public static final ServiceEnum LOAD_EVENTS = new ServiceEnum(_LOAD_EVENTS);
    public static final ServiceEnum LOAD_EVENT_TYPES = new ServiceEnum(_LOAD_EVENT_TYPES);
    public static final ServiceEnum LOAD_MARKET = new ServiceEnum(_LOAD_MARKET);
    public static final ServiceEnum LOAD_MARKET_PRICES = new ServiceEnum(_LOAD_MARKET_PRICES);
    public static final ServiceEnum LOAD_MARKET_PRICES_COMPRESSED = new ServiceEnum(_LOAD_MARKET_PRICES_COMPRESSED);
    public static final ServiceEnum LOAD_SERVICE_ANNOUNCEMENTS = new ServiceEnum(_LOAD_SERVICE_ANNOUNCEMENTS);
    public static final ServiceEnum LOAD_SUBSCRIPTION_INFO = new ServiceEnum(_LOAD_SUBSCRIPTION_INFO);
    public static final ServiceEnum CREATE_ACCOUNT = new ServiceEnum(_CREATE_ACCOUNT);
    public static final ServiceEnum CONVERT_CURRENCY = new ServiceEnum(_CONVERT_CURRENCY);
    public static final ServiceEnum GET_CURRENCIES = new ServiceEnum(_GET_CURRENCIES);
    public static final ServiceEnum FORGOT_PASSWORD = new ServiceEnum(_FORGOT_PASSWORD);
    public static final ServiceEnum MODIFY_PASSWORD = new ServiceEnum(_MODIFY_PASSWORD);
    public static final ServiceEnum VIEW_PROFILE = new ServiceEnum(_VIEW_PROFILE);
    public static final ServiceEnum MODIFY_PROFILE = new ServiceEnum(_MODIFY_PROFILE);
    public static final ServiceEnum LOGOUT = new ServiceEnum(_LOGOUT);
    public static final ServiceEnum RETRIEVE_LIMB_MESSAGE = new ServiceEnum(_RETRIEVE_LIMB_MESSAGE);
    public static final ServiceEnum SUBMIT_LIMB_MESSAGE = new ServiceEnum(_SUBMIT_LIMB_MESSAGE);
    public static final ServiceEnum GET_MARGIN_MARKET_PRICES = new ServiceEnum(_GET_MARGIN_MARKET_PRICES);
    public static final ServiceEnum GET_MARGIN_MARKET_PRICES_COMPRESSED = new ServiceEnum(_GET_MARGIN_MARKET_PRICES_COMPRESSED);
    public static final ServiceEnum GENERATE_REGISTERED_MARGIN_PRICES = new ServiceEnum(_GENERATE_REGISTERED_MARGIN_PRICES);
    public static final ServiceEnum MARGINLOGIN = new ServiceEnum(_MARGINLOGIN);
    public static final ServiceEnum TRANSFER_FUNDS = new ServiceEnum(_TRANSFER_FUNDS);
    public static final ServiceEnum ADD_VENDORSUBSCRIPTION = new ServiceEnum(_ADD_VENDORSUBSCRIPTION);
    public static final ServiceEnum UPDATE_VENDORSUBSCRIPTION = new ServiceEnum(_UPDATE_VENDORSUBSCRIPTION);
    public static final ServiceEnum CANCEL_VENDORSUBSCRIPTION = new ServiceEnum(_CANCEL_VENDORSUBSCRIPTION);
    public static final ServiceEnum GET_VENDOR_USERS = new ServiceEnum(_GET_VENDOR_USERS);
    public static final ServiceEnum GET_VENDORSUBSCRIPTION_INFO = new ServiceEnum(_GET_VENDORSUBSCRIPTION_INFO);
    public static final ServiceEnum GET_VENDOR_INFO = new ServiceEnum(_GET_VENDOR_INFO);
    public java.lang.String getValue() { return _value_;}
    public static ServiceEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServiceEnum enumeration = (ServiceEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServiceEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ServiceEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ServiceEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
