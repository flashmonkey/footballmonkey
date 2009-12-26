/**
 * DeletePaymentCardErrorEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class DeletePaymentCardErrorEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeletePaymentCardErrorEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_CARD_DETAILS = "INVALID_CARD_DETAILS";
    public static final java.lang.String _INVALID_PASSWORD = "INVALID_PASSWORD";
    public static final java.lang.String _ACCOUNT_INACTIVE = "ACCOUNT_INACTIVE";
    public static final java.lang.String _UNAUTHORIZED = "UNAUTHORIZED";
    public static final java.lang.String _CARD_NOT_DELETED = "CARD_NOT_DELETED";
    public static final java.lang.String _API_ERROR = "API_ERROR";
    public static final DeletePaymentCardErrorEnum OK = new DeletePaymentCardErrorEnum(_OK);
    public static final DeletePaymentCardErrorEnum INVALID_CARD_DETAILS = new DeletePaymentCardErrorEnum(_INVALID_CARD_DETAILS);
    public static final DeletePaymentCardErrorEnum INVALID_PASSWORD = new DeletePaymentCardErrorEnum(_INVALID_PASSWORD);
    public static final DeletePaymentCardErrorEnum ACCOUNT_INACTIVE = new DeletePaymentCardErrorEnum(_ACCOUNT_INACTIVE);
    public static final DeletePaymentCardErrorEnum UNAUTHORIZED = new DeletePaymentCardErrorEnum(_UNAUTHORIZED);
    public static final DeletePaymentCardErrorEnum CARD_NOT_DELETED = new DeletePaymentCardErrorEnum(_CARD_NOT_DELETED);
    public static final DeletePaymentCardErrorEnum API_ERROR = new DeletePaymentCardErrorEnum(_API_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static DeletePaymentCardErrorEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DeletePaymentCardErrorEnum enumeration = (DeletePaymentCardErrorEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeletePaymentCardErrorEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeletePaymentCardErrorEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardErrorEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
