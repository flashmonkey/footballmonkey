/**
 * Breeding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class Breeding  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String bred;

    private java.lang.String yearBorn;

    public Breeding() {
    }

    public Breeding(
           java.lang.String name,
           java.lang.String bred,
           java.lang.String yearBorn) {
           this.name = name;
           this.bred = bred;
           this.yearBorn = yearBorn;
    }


    /**
     * Gets the name value for this Breeding.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Breeding.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the bred value for this Breeding.
     * 
     * @return bred
     */
    public java.lang.String getBred() {
        return bred;
    }


    /**
     * Sets the bred value for this Breeding.
     * 
     * @param bred
     */
    public void setBred(java.lang.String bred) {
        this.bred = bred;
    }


    /**
     * Gets the yearBorn value for this Breeding.
     * 
     * @return yearBorn
     */
    public java.lang.String getYearBorn() {
        return yearBorn;
    }


    /**
     * Sets the yearBorn value for this Breeding.
     * 
     * @param yearBorn
     */
    public void setYearBorn(java.lang.String yearBorn) {
        this.yearBorn = yearBorn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Breeding)) return false;
        Breeding other = (Breeding) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.bred==null && other.getBred()==null) || 
             (this.bred!=null &&
              this.bred.equals(other.getBred()))) &&
            ((this.yearBorn==null && other.getYearBorn()==null) || 
             (this.yearBorn!=null &&
              this.yearBorn.equals(other.getYearBorn())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getBred() != null) {
            _hashCode += getBred().hashCode();
        }
        if (getYearBorn() != null) {
            _hashCode += getYearBorn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Breeding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Breeding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearBorn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yearBorn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
