/**
 * UpdatePaymentCardErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class UpdatePaymentCardErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UpdatePaymentCardErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_CARD_DETAILS = "INVALID_CARD_DETAILS";
    public static final java.lang.String _INVALID_PASSWORD = "INVALID_PASSWORD";
    public static final java.lang.String _ACCOUNT_INACTIVE = "ACCOUNT_INACTIVE";
    public static final java.lang.String _UNAUTHORIZED = "UNAUTHORIZED";
    public static final java.lang.String _INVALID_COUNTRY_CODE = "INVALID_COUNTRY_CODE";
    public static final java.lang.String _INVALID_CARD_ADDRESS = "INVALID_CARD_ADDRESS";
    public static final java.lang.String _INVALID_EXPIRY_DATE = "INVALID_EXPIRY_DATE";
    public static final java.lang.String _INVALID_START_DATE = "INVALID_START_DATE";
    public static final java.lang.String _INVALID_ZIP_CODE = "INVALID_ZIP_CODE";
    public static final java.lang.String _INVALID_ISSUE_NUMBER = "INVALID_ISSUE_NUMBER";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final java.lang.String _CARD_NOT_FOUND = "CARD_NOT_FOUND";
    public static final UpdatePaymentCardErrorEnum OK = new UpdatePaymentCardErrorEnum(_OK);
    public static final UpdatePaymentCardErrorEnum INVALID_CARD_DETAILS = new UpdatePaymentCardErrorEnum(_INVALID_CARD_DETAILS);
    public static final UpdatePaymentCardErrorEnum INVALID_PASSWORD = new UpdatePaymentCardErrorEnum(_INVALID_PASSWORD);
    public static final UpdatePaymentCardErrorEnum ACCOUNT_INACTIVE = new UpdatePaymentCardErrorEnum(_ACCOUNT_INACTIVE);
    public static final UpdatePaymentCardErrorEnum UNAUTHORIZED = new UpdatePaymentCardErrorEnum(_UNAUTHORIZED);
    public static final UpdatePaymentCardErrorEnum INVALID_COUNTRY_CODE = new UpdatePaymentCardErrorEnum(_INVALID_COUNTRY_CODE);
    public static final UpdatePaymentCardErrorEnum INVALID_CARD_ADDRESS = new UpdatePaymentCardErrorEnum(_INVALID_CARD_ADDRESS);
    public static final UpdatePaymentCardErrorEnum INVALID_EXPIRY_DATE = new UpdatePaymentCardErrorEnum(_INVALID_EXPIRY_DATE);
    public static final UpdatePaymentCardErrorEnum INVALID_START_DATE = new UpdatePaymentCardErrorEnum(_INVALID_START_DATE);
    public static final UpdatePaymentCardErrorEnum INVALID_ZIP_CODE = new UpdatePaymentCardErrorEnum(_INVALID_ZIP_CODE);
    public static final UpdatePaymentCardErrorEnum INVALID_ISSUE_NUMBER = new UpdatePaymentCardErrorEnum(_INVALID_ISSUE_NUMBER);
    public static final UpdatePaymentCardErrorEnum API_ERROR = new UpdatePaymentCardErrorEnum(_API_ERROR);
    public static final UpdatePaymentCardErrorEnum CARD_NOT_FOUND = new UpdatePaymentCardErrorEnum(_CARD_NOT_FOUND);
    public java.lang.String getValue() { return _value_;}
    public static UpdatePaymentCardErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UpdatePaymentCardErrorEnum enumeration = (UpdatePaymentCardErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UpdatePaymentCardErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UpdatePaymentCardErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "UpdatePaymentCardErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
