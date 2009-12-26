/**
 * GetEventTypesResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class GetEventTypesResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.EventType[] eventTypeItems;

    private java.lang.String minorErrorCode;

    private com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum errorCode;

    public GetEventTypesResp() {
    }

    public GetEventTypesResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.EventType[] eventTypeItems,
           java.lang.String minorErrorCode,
           com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum errorCode) {
        super(
            header);
        this.eventTypeItems = eventTypeItems;
        this.minorErrorCode = minorErrorCode;
        this.errorCode = errorCode;
    }


    /**
     * Gets the eventTypeItems value for this GetEventTypesResp.
     * 
     * @return eventTypeItems
     */
    public com.betfair.www.publicapi.types.global.v3.EventType[] getEventTypeItems() {
        return eventTypeItems;
    }


    /**
     * Sets the eventTypeItems value for this GetEventTypesResp.
     * 
     * @param eventTypeItems
     */
    public void setEventTypeItems(com.betfair.www.publicapi.types.global.v3.EventType[] eventTypeItems) {
        this.eventTypeItems = eventTypeItems;
    }


    /**
     * Gets the minorErrorCode value for this GetEventTypesResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetEventTypesResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the errorCode value for this GetEventTypesResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetEventTypesResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEventTypesResp)) return false;
        GetEventTypesResp other = (GetEventTypesResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventTypeItems==null && other.getEventTypeItems()==null) || 
             (this.eventTypeItems!=null &&
              java.util.Arrays.equals(this.eventTypeItems, other.getEventTypeItems()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        if (getEventTypeItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventTypeItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventTypeItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEventTypesResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventTypesResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTypeItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "EventType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EventType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsErrorEnum"));
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
