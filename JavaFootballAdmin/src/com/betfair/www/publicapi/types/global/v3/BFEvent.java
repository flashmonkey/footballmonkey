/**
 * BFEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class BFEvent  implements java.io.Serializable {
    private int eventId;

    private java.lang.String eventName;

    private int eventTypeId;

    private int menuLevel;

    private int orderIndex;

    private java.util.Calendar startTime;

    private java.lang.String timezone;

    public BFEvent() {
    }

    public BFEvent(
           int eventId,
           java.lang.String eventName,
           int eventTypeId,
           int menuLevel,
           int orderIndex,
           java.util.Calendar startTime,
           java.lang.String timezone) {
           this.eventId = eventId;
           this.eventName = eventName;
           this.eventTypeId = eventTypeId;
           this.menuLevel = menuLevel;
           this.orderIndex = orderIndex;
           this.startTime = startTime;
           this.timezone = timezone;
    }


    /**
     * Gets the eventId value for this BFEvent.
     * 
     * @return eventId
     */
    public int getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this BFEvent.
     * 
     * @param eventId
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the eventName value for this BFEvent.
     * 
     * @return eventName
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this BFEvent.
     * 
     * @param eventName
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }


    /**
     * Gets the eventTypeId value for this BFEvent.
     * 
     * @return eventTypeId
     */
    public int getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this BFEvent.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the menuLevel value for this BFEvent.
     * 
     * @return menuLevel
     */
    public int getMenuLevel() {
        return menuLevel;
    }


    /**
     * Sets the menuLevel value for this BFEvent.
     * 
     * @param menuLevel
     */
    public void setMenuLevel(int menuLevel) {
        this.menuLevel = menuLevel;
    }


    /**
     * Gets the orderIndex value for this BFEvent.
     * 
     * @return orderIndex
     */
    public int getOrderIndex() {
        return orderIndex;
    }


    /**
     * Sets the orderIndex value for this BFEvent.
     * 
     * @param orderIndex
     */
    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }


    /**
     * Gets the startTime value for this BFEvent.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this BFEvent.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the timezone value for this BFEvent.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this BFEvent.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BFEvent)) return false;
        BFEvent other = (BFEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventId == other.getEventId() &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName()))) &&
            this.eventTypeId == other.getEventTypeId() &&
            this.menuLevel == other.getMenuLevel() &&
            this.orderIndex == other.getOrderIndex() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone())));
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
        _hashCode += getEventId();
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        _hashCode += getEventTypeId();
        _hashCode += getMenuLevel();
        _hashCode += getOrderIndex();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BFEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "BFEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
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
