/**
 * AccountStatementEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class AccountStatementEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountStatementEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _RESULT_WON = "RESULT_WON";
    public static final java.lang.String _RESULT_LOST = "RESULT_LOST";
    public static final java.lang.String _RESULT_ERR = "RESULT_ERR";
    public static final java.lang.String _RESULT_FIX = "RESULT_FIX";
    public static final java.lang.String _RESULT_NOT_APPLICABLE = "RESULT_NOT_APPLICABLE";
    public static final java.lang.String _ACCOUNT_CREDIT = "ACCOUNT_CREDIT";
    public static final java.lang.String _ACCOUNT_DEBIT = "ACCOUNT_DEBIT";
    public static final java.lang.String _COMMISSION_REVERSAL = "COMMISSION_REVERSAL";
    public static final AccountStatementEnum OK = new AccountStatementEnum(_OK);
    public static final AccountStatementEnum RESULT_WON = new AccountStatementEnum(_RESULT_WON);
    public static final AccountStatementEnum RESULT_LOST = new AccountStatementEnum(_RESULT_LOST);
    public static final AccountStatementEnum RESULT_ERR = new AccountStatementEnum(_RESULT_ERR);
    public static final AccountStatementEnum RESULT_FIX = new AccountStatementEnum(_RESULT_FIX);
    public static final AccountStatementEnum RESULT_NOT_APPLICABLE = new AccountStatementEnum(_RESULT_NOT_APPLICABLE);
    public static final AccountStatementEnum ACCOUNT_CREDIT = new AccountStatementEnum(_ACCOUNT_CREDIT);
    public static final AccountStatementEnum ACCOUNT_DEBIT = new AccountStatementEnum(_ACCOUNT_DEBIT);
    public static final AccountStatementEnum COMMISSION_REVERSAL = new AccountStatementEnum(_COMMISSION_REVERSAL);
    public java.lang.String getValue() { return _value_;}
    public static AccountStatementEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountStatementEnum enumeration = (AccountStatementEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountStatementEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountStatementEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
