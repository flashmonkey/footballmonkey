/**
 * PaymentsErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class PaymentsErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentsErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _ACCOUNT_SUSPENDED = "ACCOUNT_SUSPENDED";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final java.lang.String _CARD_AMOUNT_OUTSIDE_LIMIT = "CARD_AMOUNT_OUTSIDE_LIMIT";
    public static final java.lang.String _CARD_EXPIRED = "CARD_EXPIRED";
    public static final java.lang.String _CARD_LOCKED = "CARD_LOCKED";
    public static final java.lang.String _CARD_NOT_FOUND = "CARD_NOT_FOUND";
    public static final java.lang.String _DEPOSIT_DECLINED = "DEPOSIT_DECLINED";
    public static final java.lang.String _DEPOSIT_LIMIT_EXCEEDED = "DEPOSIT_LIMIT_EXCEEDED";
    public static final java.lang.String _EXCEEDS_BALANCE = "EXCEEDS_BALANCE";
    public static final java.lang.String _CARD_NOT_VALIDATED = "CARD_NOT_VALIDATED";
    public static final java.lang.String _INVALID_AMOUNT = "INVALID_AMOUNT";
    public static final java.lang.String _INVALID_CARD_CV2 = "INVALID_CARD_CV2";
    public static final java.lang.String _INVALID_CARD_DETAILS = "INVALID_CARD_DETAILS";
    public static final java.lang.String _INVALID_EXPIRY_DATE = "INVALID_EXPIRY_DATE";
    public static final java.lang.String _INVALID_MASTERCARD = "INVALID_MASTERCARD";
    public static final java.lang.String _INVALID_PASSWORD = "INVALID_PASSWORD";
    public static final java.lang.String _CFT_MAX_WITHDRAWAL_LIMIT = "CFT_MAX_WITHDRAWAL_LIMIT";
    public static final java.lang.String _NEGATIVE_NET_DEPOSITS = "NEGATIVE_NET_DEPOSITS";
    public static final java.lang.String _NON_STERLING_TO_UK_MASTERCARD = "NON_STERLING_TO_UK_MASTERCARD";
    public static final java.lang.String _NON_ZERO_NON_NEG_NET_DEPOSITS = "NON_ZERO_NON_NEG_NET_DEPOSITS";
    public static final java.lang.String _UNAUTHORIZED = "UNAUTHORIZED";
    public static final java.lang.String _VISA_WITHDRAWAL_NOT_POSSIBLE = "VISA_WITHDRAWAL_NOT_POSSIBLE";
    public static final java.lang.String _DUPLICATE_WITHDRAWAL = "DUPLICATE_WITHDRAWAL";
    public static final PaymentsErrorEnum OK = new PaymentsErrorEnum(_OK);
    public static final PaymentsErrorEnum ACCOUNT_SUSPENDED = new PaymentsErrorEnum(_ACCOUNT_SUSPENDED);
    public static final PaymentsErrorEnum API_ERROR = new PaymentsErrorEnum(_API_ERROR);
    public static final PaymentsErrorEnum CARD_AMOUNT_OUTSIDE_LIMIT = new PaymentsErrorEnum(_CARD_AMOUNT_OUTSIDE_LIMIT);
    public static final PaymentsErrorEnum CARD_EXPIRED = new PaymentsErrorEnum(_CARD_EXPIRED);
    public static final PaymentsErrorEnum CARD_LOCKED = new PaymentsErrorEnum(_CARD_LOCKED);
    public static final PaymentsErrorEnum CARD_NOT_FOUND = new PaymentsErrorEnum(_CARD_NOT_FOUND);
    public static final PaymentsErrorEnum DEPOSIT_DECLINED = new PaymentsErrorEnum(_DEPOSIT_DECLINED);
    public static final PaymentsErrorEnum DEPOSIT_LIMIT_EXCEEDED = new PaymentsErrorEnum(_DEPOSIT_LIMIT_EXCEEDED);
    public static final PaymentsErrorEnum EXCEEDS_BALANCE = new PaymentsErrorEnum(_EXCEEDS_BALANCE);
    public static final PaymentsErrorEnum CARD_NOT_VALIDATED = new PaymentsErrorEnum(_CARD_NOT_VALIDATED);
    public static final PaymentsErrorEnum INVALID_AMOUNT = new PaymentsErrorEnum(_INVALID_AMOUNT);
    public static final PaymentsErrorEnum INVALID_CARD_CV2 = new PaymentsErrorEnum(_INVALID_CARD_CV2);
    public static final PaymentsErrorEnum INVALID_CARD_DETAILS = new PaymentsErrorEnum(_INVALID_CARD_DETAILS);
    public static final PaymentsErrorEnum INVALID_EXPIRY_DATE = new PaymentsErrorEnum(_INVALID_EXPIRY_DATE);
    public static final PaymentsErrorEnum INVALID_MASTERCARD = new PaymentsErrorEnum(_INVALID_MASTERCARD);
    public static final PaymentsErrorEnum INVALID_PASSWORD = new PaymentsErrorEnum(_INVALID_PASSWORD);
    public static final PaymentsErrorEnum CFT_MAX_WITHDRAWAL_LIMIT = new PaymentsErrorEnum(_CFT_MAX_WITHDRAWAL_LIMIT);
    public static final PaymentsErrorEnum NEGATIVE_NET_DEPOSITS = new PaymentsErrorEnum(_NEGATIVE_NET_DEPOSITS);
    public static final PaymentsErrorEnum NON_STERLING_TO_UK_MASTERCARD = new PaymentsErrorEnum(_NON_STERLING_TO_UK_MASTERCARD);
    public static final PaymentsErrorEnum NON_ZERO_NON_NEG_NET_DEPOSITS = new PaymentsErrorEnum(_NON_ZERO_NON_NEG_NET_DEPOSITS);
    public static final PaymentsErrorEnum UNAUTHORIZED = new PaymentsErrorEnum(_UNAUTHORIZED);
    public static final PaymentsErrorEnum VISA_WITHDRAWAL_NOT_POSSIBLE = new PaymentsErrorEnum(_VISA_WITHDRAWAL_NOT_POSSIBLE);
    public static final PaymentsErrorEnum DUPLICATE_WITHDRAWAL = new PaymentsErrorEnum(_DUPLICATE_WITHDRAWAL);
    public java.lang.String getValue() { return _value_;}
    public static PaymentsErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentsErrorEnum enumeration = (PaymentsErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentsErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentsErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentsErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
