/**
 * CurrencyV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class CurrencyV2  extends com.betfair.www.publicapi.types.global.v3.Currency  implements java.io.Serializable {
    private java.lang.Double minimumStake;

    private java.lang.Double minimumRangeStake;

    private java.lang.Double minimumBSPLayLiability;

    public CurrencyV2() {
    }

    public CurrencyV2(
           java.lang.String currencyCode,
           double rateGBP,
           java.lang.Double minimumStake,
           java.lang.Double minimumRangeStake,
           java.lang.Double minimumBSPLayLiability) {
        super(
            currencyCode,
            rateGBP);
        this.minimumStake = minimumStake;
        this.minimumRangeStake = minimumRangeStake;
        this.minimumBSPLayLiability = minimumBSPLayLiability;
    }


    /**
     * Gets the minimumStake value for this CurrencyV2.
     * 
     * @return minimumStake
     */
    public java.lang.Double getMinimumStake() {
        return minimumStake;
    }


    /**
     * Sets the minimumStake value for this CurrencyV2.
     * 
     * @param minimumStake
     */
    public void setMinimumStake(java.lang.Double minimumStake) {
        this.minimumStake = minimumStake;
    }


    /**
     * Gets the minimumRangeStake value for this CurrencyV2.
     * 
     * @return minimumRangeStake
     */
    public java.lang.Double getMinimumRangeStake() {
        return minimumRangeStake;
    }


    /**
     * Sets the minimumRangeStake value for this CurrencyV2.
     * 
     * @param minimumRangeStake
     */
    public void setMinimumRangeStake(java.lang.Double minimumRangeStake) {
        this.minimumRangeStake = minimumRangeStake;
    }


    /**
     * Gets the minimumBSPLayLiability value for this CurrencyV2.
     * 
     * @return minimumBSPLayLiability
     */
    public java.lang.Double getMinimumBSPLayLiability() {
        return minimumBSPLayLiability;
    }


    /**
     * Sets the minimumBSPLayLiability value for this CurrencyV2.
     * 
     * @param minimumBSPLayLiability
     */
    public void setMinimumBSPLayLiability(java.lang.Double minimumBSPLayLiability) {
        this.minimumBSPLayLiability = minimumBSPLayLiability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyV2)) return false;
        CurrencyV2 other = (CurrencyV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.minimumStake==null && other.getMinimumStake()==null) || 
             (this.minimumStake!=null &&
              this.minimumStake.equals(other.getMinimumStake()))) &&
            ((this.minimumRangeStake==null && other.getMinimumRangeStake()==null) || 
             (this.minimumRangeStake!=null &&
              this.minimumRangeStake.equals(other.getMinimumRangeStake()))) &&
            ((this.minimumBSPLayLiability==null && other.getMinimumBSPLayLiability()==null) || 
             (this.minimumBSPLayLiability!=null &&
              this.minimumBSPLayLiability.equals(other.getMinimumBSPLayLiability())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMinimumStake() != null) {
            _hashCode += getMinimumStake().hashCode();
        }
        if (getMinimumRangeStake() != null) {
            _hashCode += getMinimumRangeStake().hashCode();
        }
        if (getMinimumBSPLayLiability() != null) {
            _hashCode += getMinimumBSPLayLiability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CurrencyV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumStake");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumStake"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumRangeStake");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumRangeStake"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumBSPLayLiability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumBSPLayLiability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
