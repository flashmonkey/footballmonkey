/**
 * PrivateMarket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class PrivateMarket  implements java.io.Serializable {
    private java.lang.String name;

    private int marketId;

    private java.lang.String menuPath;

    private int[] eventHierarchy;

    public PrivateMarket() {
    }

    public PrivateMarket(
           java.lang.String name,
           int marketId,
           java.lang.String menuPath,
           int[] eventHierarchy) {
           this.name = name;
           this.marketId = marketId;
           this.menuPath = menuPath;
           this.eventHierarchy = eventHierarchy;
    }


    /**
     * Gets the name value for this PrivateMarket.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PrivateMarket.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the marketId value for this PrivateMarket.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this PrivateMarket.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the menuPath value for this PrivateMarket.
     * 
     * @return menuPath
     */
    public java.lang.String getMenuPath() {
        return menuPath;
    }


    /**
     * Sets the menuPath value for this PrivateMarket.
     * 
     * @param menuPath
     */
    public void setMenuPath(java.lang.String menuPath) {
        this.menuPath = menuPath;
    }


    /**
     * Gets the eventHierarchy value for this PrivateMarket.
     * 
     * @return eventHierarchy
     */
    public int[] getEventHierarchy() {
        return eventHierarchy;
    }


    /**
     * Sets the eventHierarchy value for this PrivateMarket.
     * 
     * @param eventHierarchy
     */
    public void setEventHierarchy(int[] eventHierarchy) {
        this.eventHierarchy = eventHierarchy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrivateMarket)) return false;
        PrivateMarket other = (PrivateMarket) obj;
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
            this.marketId == other.getMarketId() &&
            ((this.menuPath==null && other.getMenuPath()==null) || 
             (this.menuPath!=null &&
              this.menuPath.equals(other.getMenuPath()))) &&
            ((this.eventHierarchy==null && other.getEventHierarchy()==null) || 
             (this.eventHierarchy!=null &&
              java.util.Arrays.equals(this.eventHierarchy, other.getEventHierarchy())));
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
        _hashCode += getMarketId();
        if (getMenuPath() != null) {
            _hashCode += getMenuPath().hashCode();
        }
        if (getEventHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrivateMarket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PrivateMarket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EventId"));
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
