/**
 * CouponSelection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class CouponSelection  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.Runner runner;

    private java.lang.Double backOdds;

    private java.lang.Double layOdds;

    public CouponSelection() {
    }

    public CouponSelection(
           com.betfair.www.publicapi.types.exchange.v5.Runner runner,
           java.lang.Double backOdds,
           java.lang.Double layOdds) {
           this.runner = runner;
           this.backOdds = backOdds;
           this.layOdds = layOdds;
    }


    /**
     * Gets the runner value for this CouponSelection.
     * 
     * @return runner
     */
    public com.betfair.www.publicapi.types.exchange.v5.Runner getRunner() {
        return runner;
    }


    /**
     * Sets the runner value for this CouponSelection.
     * 
     * @param runner
     */
    public void setRunner(com.betfair.www.publicapi.types.exchange.v5.Runner runner) {
        this.runner = runner;
    }


    /**
     * Gets the backOdds value for this CouponSelection.
     * 
     * @return backOdds
     */
    public java.lang.Double getBackOdds() {
        return backOdds;
    }


    /**
     * Sets the backOdds value for this CouponSelection.
     * 
     * @param backOdds
     */
    public void setBackOdds(java.lang.Double backOdds) {
        this.backOdds = backOdds;
    }


    /**
     * Gets the layOdds value for this CouponSelection.
     * 
     * @return layOdds
     */
    public java.lang.Double getLayOdds() {
        return layOdds;
    }


    /**
     * Sets the layOdds value for this CouponSelection.
     * 
     * @param layOdds
     */
    public void setLayOdds(java.lang.Double layOdds) {
        this.layOdds = layOdds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CouponSelection)) return false;
        CouponSelection other = (CouponSelection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.runner==null && other.getRunner()==null) || 
             (this.runner!=null &&
              this.runner.equals(other.getRunner()))) &&
            ((this.backOdds==null && other.getBackOdds()==null) || 
             (this.backOdds!=null &&
              this.backOdds.equals(other.getBackOdds()))) &&
            ((this.layOdds==null && other.getLayOdds()==null) || 
             (this.layOdds!=null &&
              this.layOdds.equals(other.getLayOdds())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRunner() != null) {
            _hashCode += getRunner().hashCode();
        }
        if (getBackOdds() != null) {
            _hashCode += getBackOdds().hashCode();
        }
        if (getLayOdds() != null) {
            _hashCode += getLayOdds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CouponSelection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponSelection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Runner"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backOdds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backOdds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layOdds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layOdds"));
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
