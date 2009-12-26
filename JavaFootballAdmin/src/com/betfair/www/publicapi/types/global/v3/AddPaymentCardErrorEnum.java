/**
 * AddPaymentCardErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class AddPaymentCardErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AddPaymentCardErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_CARD_DETAILS = "INVALID_CARD_DETAILS";
    public static final java.lang.String _INVALID_CARD_CV2 = "INVALID_CARD_CV2";
    public static final java.lang.String _INVALID_PASSWORD = "INVALID_PASSWORD";
    public static final java.lang.String _ACCOUNT_INACTIVE = "ACCOUNT_INACTIVE";
    public static final java.lang.String _UNAUTHORIZED = "UNAUTHORIZED";
    public static final java.lang.String _INVALID_EXPIRY_DATE = "INVALID_EXPIRY_DATE";
    public static final java.lang.String _INVALID_START_DATE = "INVALID_START_DATE";
    public static final java.lang.String _INVALID_CARD_NUMBER = "INVALID_CARD_NUMBER";
    public static final java.lang.String _INVALID_ZIP_CODE = "INVALID_ZIP_CODE";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_BILLING_NAME = "INVALID_BILLING_NAME";
    public static final java.lang.String _INVALID_CARD_ADDRESS = "INVALID_CARD_ADDRESS";
    public static final java.lang.String _CARD_ALREADY_EXISTS = "CARD_ALREADY_EXISTS";
    public static final java.lang.String _AGE_VERIFICATION_REQUIRED = "AGE_VERIFICATION_REQUIRED";
    public static final java.lang.String _NOT_FUNDED_WITH_FIRST_CARD = "NOT_FUNDED_WITH_FIRST_CARD";
    public static final java.lang.String _CARD_NOT_VALID_FOR_ACCOUNT_CURRENCY = "CARD_NOT_VALID_FOR_ACCOUNT_CURRENCY";
    public static final java.lang.String _INVALID_CARD_TYPE = "INVALID_CARD_TYPE";
    public static final java.lang.String _MAXIMUM_NUMBER_OF_CARDS_REACHED = "MAXIMUM_NUMBER_OF_CARDS_REACHED";
    public static final java.lang.String _INVALID_ISSUE_NUMBER = "INVALID_ISSUE_NUMBER";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final AddPaymentCardErrorEnum OK = new AddPaymentCardErrorEnum(_OK);
    public static final AddPaymentCardErrorEnum INVALID_CARD_DETAILS = new AddPaymentCardErrorEnum(_INVALID_CARD_DETAILS);
    public static final AddPaymentCardErrorEnum INVALID_CARD_CV2 = new AddPaymentCardErrorEnum(_INVALID_CARD_CV2);
    public static final AddPaymentCardErrorEnum INVALID_PASSWORD = new AddPaymentCardErrorEnum(_INVALID_PASSWORD);
    public static final AddPaymentCardErrorEnum ACCOUNT_INACTIVE = new AddPaymentCardErrorEnum(_ACCOUNT_INACTIVE);
    public static final AddPaymentCardErrorEnum UNAUTHORIZED = new AddPaymentCardErrorEnum(_UNAUTHORIZED);
    public static final AddPaymentCardErrorEnum INVALID_EXPIRY_DATE = new AddPaymentCardErrorEnum(_INVALID_EXPIRY_DATE);
    public static final AddPaymentCardErrorEnum INVALID_START_DATE = new AddPaymentCardErrorEnum(_INVALID_START_DATE);
    public static final AddPaymentCardErrorEnum INVALID_CARD_NUMBER = new AddPaymentCardErrorEnum(_INVALID_CARD_NUMBER);
    public static final AddPaymentCardErrorEnum INVALID_ZIP_CODE = new AddPaymentCardErrorEnum(_INVALID_ZIP_CODE);
    public static final AddPaymentCardErrorEnum INVALID_COUNTRY_CODE = new AddPaymentCardErrorEnum(_INVALID_COUNTRY_CODE);
    public static final AddPaymentCardErrorEnum INVALID_BILLING_NAME = new AddPaymentCardErrorEnum(_INVALID_BILLING_NAME);
    public static final AddPaymentCardErrorEnum INVALID_CARD_ADDRESS = new AddPaymentCardErrorEnum(_INVALID_CARD_ADDRESS);
    public static final AddPaymentCardErrorEnum CARD_ALREADY_EXISTS = new AddPaymentCardErrorEnum(_CARD_ALREADY_EXISTS);
    public static final AddPaymentCardErrorEnum AGE_VERIFICATION_REQUIRED = new AddPaymentCardErrorEnum(_AGE_VERIFICATION_REQUIRED);
    public static final AddPaymentCardErrorEnum NOT_FUNDED_WITH_FIRST_CARD = new AddPaymentCardErrorEnum(_NOT_FUNDED_WITH_FIRST_CARD);
    public static final AddPaymentCardErrorEnum CARD_NOT_VALID_FOR_ACCOUNT_CURRENCY = new AddPaymentCardErrorEnum(_CARD_NOT_VALID_FOR_ACCOUNT_CURRENCY);
    public static final AddPaymentCardErrorEnum INVALID_CARD_TYPE = new AddPaymentCardErrorEnum(_INVALID_CARD_TYPE);
    public static final AddPaymentCardErrorEnum MAXIMUM_NUMBER_OF_CARDS_REACHED = new AddPaymentCardErrorEnum(_MAXIMUM_NUMBER_OF_CARDS_REACHED);
    public static final AddPaymentCardErrorEnum INVALID_ISSUE_NUMBER = new AddPaymentCardErrorEnum(_INVALID_ISSUE_NUMBER);
    public static final AddPaymentCardErrorEnum API_ERROR = new AddPaymentCardErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static AddPaymentCardErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AddPaymentCardErrorEnum enumeration = (AddPaymentCardErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AddPaymentCardErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AddPaymentCardErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AddPaymentCardErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
