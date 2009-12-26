/**
 * AccountStatusEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class AccountStatusEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountStatusEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _A = "A";
    public static final java.lang.String _C = "C";
    public static final java.lang.String _D = "D";
    public static final java.lang.String _L = "L";
    public static final java.lang.String _P = "P";
    public static final java.lang.String _S = "S";
    public static final java.lang.String _T = "T";
    public static final java.lang.String _X = "X";
    public static final java.lang.String _Z = "Z";
    public static final AccountStatusEnum A = new AccountStatusEnum(_A);
    public static final AccountStatusEnum C = new AccountStatusEnum(_C);
    public static final AccountStatusEnum D = new AccountStatusEnum(_D);
    public static final AccountStatusEnum L = new AccountStatusEnum(_L);
    public static final AccountStatusEnum P = new AccountStatusEnum(_P);
    public static final AccountStatusEnum S = new AccountStatusEnum(_S);
    public static final AccountStatusEnum T = new AccountStatusEnum(_T);
    public static final AccountStatusEnum X = new AccountStatusEnum(_X);
    public static final AccountStatusEnum Z = new AccountStatusEnum(_Z);
    public java.lang.String getValue() { return _value_;}
    public static AccountStatusEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountStatusEnum enumeration = (AccountStatusEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountStatusEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountStatusEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AccountStatusEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
