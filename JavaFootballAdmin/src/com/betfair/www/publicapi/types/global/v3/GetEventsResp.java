/**
 * GetEventsResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.global.v3;

public class GetEventsResp  extends com.betfair.www.publicapi.types.global.v3.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum errorCode;

    private com.betfair.www.publicapi.types.global.v3.BFEvent[] eventItems;

    private int eventParentId;

    private com.betfair.www.publicapi.types.global.v3.MarketSummary[] marketItems;

    private com.betfair.www.publicapi.types.global.v3.CouponLink[] couponLinks;

    private java.lang.String minorErrorCode;

    public GetEventsResp() {
    }

    public GetEventsResp(
           com.betfair.www.publicapi.types.global.v3.APIResponseHeader header,
           com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum errorCode,
           com.betfair.www.publicapi.types.global.v3.BFEvent[] eventItems,
           int eventParentId,
           com.betfair.www.publicapi.types.global.v3.MarketSummary[] marketItems,
           com.betfair.www.publicapi.types.global.v3.CouponLink[] couponLinks,
           java.lang.String minorErrorCode) {
        super(
            header);
        this.errorCode = errorCode;
        this.eventItems = eventItems;
        this.eventParentId = eventParentId;
        this.marketItems = marketItems;
        this.couponLinks = couponLinks;
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the errorCode value for this GetEventsResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetEventsResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the eventItems value for this GetEventsResp.
     * 
     * @return eventItems
     */
    public com.betfair.www.publicapi.types.global.v3.BFEvent[] getEventItems() {
        return eventItems;
    }


    /**
     * Sets the eventItems value for this GetEventsResp.
     * 
     * @param eventItems
     */
    public void setEventItems(com.betfair.www.publicapi.types.global.v3.BFEvent[] eventItems) {
        this.eventItems = eventItems;
    }


    /**
     * Gets the eventParentId value for this GetEventsResp.
     * 
     * @return eventParentId
     */
    public int getEventParentId() {
        return eventParentId;
    }


    /**
     * Sets the eventParentId value for this GetEventsResp.
     * 
     * @param eventParentId
     */
    public void setEventParentId(int eventParentId) {
        this.eventParentId = eventParentId;
    }


    /**
     * Gets the marketItems value for this GetEventsResp.
     * 
     * @return marketItems
     */
    public com.betfair.www.publicapi.types.global.v3.MarketSummary[] getMarketItems() {
        return marketItems;
    }


    /**
     * Sets the marketItems value for this GetEventsResp.
     * 
     * @param marketItems
     */
    public void setMarketItems(com.betfair.www.publicapi.types.global.v3.MarketSummary[] marketItems) {
        this.marketItems = marketItems;
    }


    /**
     * Gets the couponLinks value for this GetEventsResp.
     * 
     * @return couponLinks
     */
    public com.betfair.www.publicapi.types.global.v3.CouponLink[] getCouponLinks() {
        return couponLinks;
    }


    /**
     * Sets the couponLinks value for this GetEventsResp.
     * 
     * @param couponLinks
     */
    public void setCouponLinks(com.betfair.www.publicapi.types.global.v3.CouponLink[] couponLinks) {
        this.couponLinks = couponLinks;
    }


    /**
     * Gets the minorErrorCode value for this GetEventsResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetEventsResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEventsResp)) return false;
        GetEventsResp other = (GetEventsResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.eventItems==null && other.getEventItems()==null) || 
             (this.eventItems!=null &&
              java.util.Arrays.equals(this.eventItems, other.getEventItems()))) &&
            this.eventParentId == other.getEventParentId() &&
            ((this.marketItems==null && other.getMarketItems()==null) || 
             (this.marketItems!=null &&
              java.util.Arrays.equals(this.marketItems, other.getMarketItems()))) &&
            ((this.couponLinks==null && other.getCouponLinks()==null) || 
             (this.couponLinks!=null &&
              java.util.Arrays.equals(this.couponLinks, other.getCouponLinks()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getEventItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getEventParentId();
        if (getMarketItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCouponLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCouponLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCouponLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEventsResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "BFEvent"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "BFEvent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventParentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketSummary"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MarketSummary"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "couponLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CouponLink"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CouponLink"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
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
