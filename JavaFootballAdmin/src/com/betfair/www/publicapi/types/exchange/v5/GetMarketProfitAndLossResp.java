/**
 * GetMarketProfitAndLossResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class GetMarketProfitAndLossResp  extends com.betfair.www.publicapi.types.exchange.v5.APIResponse  implements java.io.Serializable {
    private com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss[] annotations;

    private double commissionApplied;

    private java.lang.String currencyCode;

    private com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossErrorEnum errorCode;

    private boolean includesSettledBets;

    private boolean includesBspBets;

    private int marketId;

    private java.lang.String marketName;

    private com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus;

    private java.lang.String minorErrorCode;

    private java.lang.String unit;

    public GetMarketProfitAndLossResp() {
    }

    public GetMarketProfitAndLossResp(
           com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader header,
           com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss[] annotations,
           double commissionApplied,
           java.lang.String currencyCode,
           com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossErrorEnum errorCode,
           boolean includesSettledBets,
           boolean includesBspBets,
           int marketId,
           java.lang.String marketName,
           com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus,
           java.lang.String minorErrorCode,
           java.lang.String unit) {
        super(
            header);
        this.annotations = annotations;
        this.commissionApplied = commissionApplied;
        this.currencyCode = currencyCode;
        this.errorCode = errorCode;
        this.includesSettledBets = includesSettledBets;
        this.includesBspBets = includesBspBets;
        this.marketId = marketId;
        this.marketName = marketName;
        this.marketStatus = marketStatus;
        this.minorErrorCode = minorErrorCode;
        this.unit = unit;
    }


    /**
     * Gets the annotations value for this GetMarketProfitAndLossResp.
     * 
     * @return annotations
     */
    public com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss[] getAnnotations() {
        return annotations;
    }


    /**
     * Sets the annotations value for this GetMarketProfitAndLossResp.
     * 
     * @param annotations
     */
    public void setAnnotations(com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss[] annotations) {
        this.annotations = annotations;
    }


    /**
     * Gets the commissionApplied value for this GetMarketProfitAndLossResp.
     * 
     * @return commissionApplied
     */
    public double getCommissionApplied() {
        return commissionApplied;
    }


    /**
     * Sets the commissionApplied value for this GetMarketProfitAndLossResp.
     * 
     * @param commissionApplied
     */
    public void setCommissionApplied(double commissionApplied) {
        this.commissionApplied = commissionApplied;
    }


    /**
     * Gets the currencyCode value for this GetMarketProfitAndLossResp.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this GetMarketProfitAndLossResp.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the errorCode value for this GetMarketProfitAndLossResp.
     * 
     * @return errorCode
     */
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossErrorEnum getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetMarketProfitAndLossResp.
     * 
     * @param errorCode
     */
    public void setErrorCode(com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossErrorEnum errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the includesSettledBets value for this GetMarketProfitAndLossResp.
     * 
     * @return includesSettledBets
     */
    public boolean isIncludesSettledBets() {
        return includesSettledBets;
    }


    /**
     * Sets the includesSettledBets value for this GetMarketProfitAndLossResp.
     * 
     * @param includesSettledBets
     */
    public void setIncludesSettledBets(boolean includesSettledBets) {
        this.includesSettledBets = includesSettledBets;
    }


    /**
     * Gets the includesBspBets value for this GetMarketProfitAndLossResp.
     * 
     * @return includesBspBets
     */
    public boolean isIncludesBspBets() {
        return includesBspBets;
    }


    /**
     * Sets the includesBspBets value for this GetMarketProfitAndLossResp.
     * 
     * @param includesBspBets
     */
    public void setIncludesBspBets(boolean includesBspBets) {
        this.includesBspBets = includesBspBets;
    }


    /**
     * Gets the marketId value for this GetMarketProfitAndLossResp.
     * 
     * @return marketId
     */
    public int getMarketId() {
        return marketId;
    }


    /**
     * Sets the marketId value for this GetMarketProfitAndLossResp.
     * 
     * @param marketId
     */
    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }


    /**
     * Gets the marketName value for this GetMarketProfitAndLossResp.
     * 
     * @return marketName
     */
    public java.lang.String getMarketName() {
        return marketName;
    }


    /**
     * Sets the marketName value for this GetMarketProfitAndLossResp.
     * 
     * @param marketName
     */
    public void setMarketName(java.lang.String marketName) {
        this.marketName = marketName;
    }


    /**
     * Gets the marketStatus value for this GetMarketProfitAndLossResp.
     * 
     * @return marketStatus
     */
    public com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum getMarketStatus() {
        return marketStatus;
    }


    /**
     * Sets the marketStatus value for this GetMarketProfitAndLossResp.
     * 
     * @param marketStatus
     */
    public void setMarketStatus(com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum marketStatus) {
        this.marketStatus = marketStatus;
    }


    /**
     * Gets the minorErrorCode value for this GetMarketProfitAndLossResp.
     * 
     * @return minorErrorCode
     */
    public java.lang.String getMinorErrorCode() {
        return minorErrorCode;
    }


    /**
     * Sets the minorErrorCode value for this GetMarketProfitAndLossResp.
     * 
     * @param minorErrorCode
     */
    public void setMinorErrorCode(java.lang.String minorErrorCode) {
        this.minorErrorCode = minorErrorCode;
    }


    /**
     * Gets the unit value for this GetMarketProfitAndLossResp.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this GetMarketProfitAndLossResp.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMarketProfitAndLossResp)) return false;
        GetMarketProfitAndLossResp other = (GetMarketProfitAndLossResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.annotations==null && other.getAnnotations()==null) || 
             (this.annotations!=null &&
              java.util.Arrays.equals(this.annotations, other.getAnnotations()))) &&
            this.commissionApplied == other.getCommissionApplied() &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            this.includesSettledBets == other.isIncludesSettledBets() &&
            this.includesBspBets == other.isIncludesBspBets() &&
            this.marketId == other.getMarketId() &&
            ((this.marketName==null && other.getMarketName()==null) || 
             (this.marketName!=null &&
              this.marketName.equals(other.getMarketName()))) &&
            ((this.marketStatus==null && other.getMarketStatus()==null) || 
             (this.marketStatus!=null &&
              this.marketStatus.equals(other.getMarketStatus()))) &&
            ((this.minorErrorCode==null && other.getMinorErrorCode()==null) || 
             (this.minorErrorCode!=null &&
              this.minorErrorCode.equals(other.getMinorErrorCode()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        if (getAnnotations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnnotations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnnotations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getCommissionApplied()).hashCode();
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        _hashCode += (isIncludesSettledBets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludesBspBets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMarketId();
        if (getMarketName() != null) {
            _hashCode += getMarketName().hashCode();
        }
        if (getMarketStatus() != null) {
            _hashCode += getMarketStatus().hashCode();
        }
        if (getMinorErrorCode() != null) {
            _hashCode += getMinorErrorCode().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMarketProfitAndLossResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ProfitAndLoss"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ProfitAndLoss"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossErrorEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includesSettledBets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includesSettledBets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includesBspBets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includesBspBets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marketStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
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
