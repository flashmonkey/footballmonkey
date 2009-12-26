/**
 * Runner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class Runner  implements java.io.Serializable {
    private int asianLineId;

    private double handicap;

    private java.lang.String name;

    private int selectionId;

    public Runner() {
    }

    public Runner(
           int asianLineId,
           double handicap,
           java.lang.String name,
           int selectionId) {
           this.asianLineId = asianLineId;
           this.handicap = handicap;
           this.name = name;
           this.selectionId = selectionId;
    }


    /**
     * Gets the asianLineId value for this Runner.
     * 
     * @return asianLineId
     */
    public int getAsianLineId() {
        return asianLineId;
    }


    /**
     * Sets the asianLineId value for this Runner.
     * 
     * @param asianLineId
     */
    public void setAsianLineId(int asianLineId) {
        this.asianLineId = asianLineId;
    }


    /**
     * Gets the handicap value for this Runner.
     * 
     * @return handicap
     */
    public double getHandicap() {
        return handicap;
    }


    /**
     * Sets the handicap value for this Runner.
     * 
     * @param handicap
     */
    public void setHandicap(double handicap) {
        this.handicap = handicap;
    }


    /**
     * Gets the name value for this Runner.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Runner.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the selectionId value for this Runner.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this Runner.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Runner)) return false;
        Runner other = (Runner) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.asianLineId == other.getAsianLineId() &&
            this.handicap == other.getHandicap() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.selectionId == other.getSelectionId();
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
        _hashCode += getAsianLineId();
        _hashCode += new Double(getHandicap()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getSelectionId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Runner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Runner"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asianLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asianLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handicap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handicap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
