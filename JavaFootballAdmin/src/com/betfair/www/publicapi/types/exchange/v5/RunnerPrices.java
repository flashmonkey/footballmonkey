/**
 * RunnerPrices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.types.exchange.v5;

public class RunnerPrices  implements java.io.Serializable {
    private java.lang.Integer asianLineId;

    private com.betfair.www.publicapi.types.exchange.v5.Price[] bestPricesToBack;

    private com.betfair.www.publicapi.types.exchange.v5.Price[] bestPricesToLay;

    private java.lang.Double handicap;

    private double lastPriceMatched;

    private double reductionFactor;

    private int selectionId;

    private int sortOrder;

    private double totalAmountMatched;

    private java.lang.Boolean vacant;

    private java.lang.Double farBSP;

    private java.lang.Double nearBSP;

    private java.lang.Double actualBSP;

    public RunnerPrices() {
    }

    public RunnerPrices(
           java.lang.Integer asianLineId,
           com.betfair.www.publicapi.types.exchange.v5.Price[] bestPricesToBack,
           com.betfair.www.publicapi.types.exchange.v5.Price[] bestPricesToLay,
           java.lang.Double handicap,
           double lastPriceMatched,
           double reductionFactor,
           int selectionId,
           int sortOrder,
           double totalAmountMatched,
           java.lang.Boolean vacant,
           java.lang.Double farBSP,
           java.lang.Double nearBSP,
           java.lang.Double actualBSP) {
           this.asianLineId = asianLineId;
           this.bestPricesToBack = bestPricesToBack;
           this.bestPricesToLay = bestPricesToLay;
           this.handicap = handicap;
           this.lastPriceMatched = lastPriceMatched;
           this.reductionFactor = reductionFactor;
           this.selectionId = selectionId;
           this.sortOrder = sortOrder;
           this.totalAmountMatched = totalAmountMatched;
           this.vacant = vacant;
           this.farBSP = farBSP;
           this.nearBSP = nearBSP;
           this.actualBSP = actualBSP;
    }


    /**
     * Gets the asianLineId value for this RunnerPrices.
     * 
     * @return asianLineId
     */
    public java.lang.Integer getAsianLineId() {
        return asianLineId;
    }


    /**
     * Sets the asianLineId value for this RunnerPrices.
     * 
     * @param asianLineId
     */
    public void setAsianLineId(java.lang.Integer asianLineId) {
        this.asianLineId = asianLineId;
    }


    /**
     * Gets the bestPricesToBack value for this RunnerPrices.
     * 
     * @return bestPricesToBack
     */
    public com.betfair.www.publicapi.types.exchange.v5.Price[] getBestPricesToBack() {
        return bestPricesToBack;
    }


    /**
     * Sets the bestPricesToBack value for this RunnerPrices.
     * 
     * @param bestPricesToBack
     */
    public void setBestPricesToBack(com.betfair.www.publicapi.types.exchange.v5.Price[] bestPricesToBack) {
        this.bestPricesToBack = bestPricesToBack;
    }


    /**
     * Gets the bestPricesToLay value for this RunnerPrices.
     * 
     * @return bestPricesToLay
     */
    public com.betfair.www.publicapi.types.exchange.v5.Price[] getBestPricesToLay() {
        return bestPricesToLay;
    }


    /**
     * Sets the bestPricesToLay value for this RunnerPrices.
     * 
     * @param bestPricesToLay
     */
    public void setBestPricesToLay(com.betfair.www.publicapi.types.exchange.v5.Price[] bestPricesToLay) {
        this.bestPricesToLay = bestPricesToLay;
    }


    /**
     * Gets the handicap value for this RunnerPrices.
     * 
     * @return handicap
     */
    public java.lang.Double getHandicap() {
        return handicap;
    }


    /**
     * Sets the handicap value for this RunnerPrices.
     * 
     * @param handicap
     */
    public void setHandicap(java.lang.Double handicap) {
        this.handicap = handicap;
    }


    /**
     * Gets the lastPriceMatched value for this RunnerPrices.
     * 
     * @return lastPriceMatched
     */
    public double getLastPriceMatched() {
        return lastPriceMatched;
    }


    /**
     * Sets the lastPriceMatched value for this RunnerPrices.
     * 
     * @param lastPriceMatched
     */
    public void setLastPriceMatched(double lastPriceMatched) {
        this.lastPriceMatched = lastPriceMatched;
    }


    /**
     * Gets the reductionFactor value for this RunnerPrices.
     * 
     * @return reductionFactor
     */
    public double getReductionFactor() {
        return reductionFactor;
    }


    /**
     * Sets the reductionFactor value for this RunnerPrices.
     * 
     * @param reductionFactor
     */
    public void setReductionFactor(double reductionFactor) {
        this.reductionFactor = reductionFactor;
    }


    /**
     * Gets the selectionId value for this RunnerPrices.
     * 
     * @return selectionId
     */
    public int getSelectionId() {
        return selectionId;
    }


    /**
     * Sets the selectionId value for this RunnerPrices.
     * 
     * @param selectionId
     */
    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }


    /**
     * Gets the sortOrder value for this RunnerPrices.
     * 
     * @return sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this RunnerPrices.
     * 
     * @param sortOrder
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the totalAmountMatched value for this RunnerPrices.
     * 
     * @return totalAmountMatched
     */
    public double getTotalAmountMatched() {
        return totalAmountMatched;
    }


    /**
     * Sets the totalAmountMatched value for this RunnerPrices.
     * 
     * @param totalAmountMatched
     */
    public void setTotalAmountMatched(double totalAmountMatched) {
        this.totalAmountMatched = totalAmountMatched;
    }


    /**
     * Gets the vacant value for this RunnerPrices.
     * 
     * @return vacant
     */
    public java.lang.Boolean getVacant() {
        return vacant;
    }


    /**
     * Sets the vacant value for this RunnerPrices.
     * 
     * @param vacant
     */
    public void setVacant(java.lang.Boolean vacant) {
        this.vacant = vacant;
    }


    /**
     * Gets the farBSP value for this RunnerPrices.
     * 
     * @return farBSP
     */
    public java.lang.Double getFarBSP() {
        return farBSP;
    }


    /**
     * Sets the farBSP value for this RunnerPrices.
     * 
     * @param farBSP
     */
    public void setFarBSP(java.lang.Double farBSP) {
        this.farBSP = farBSP;
    }


    /**
     * Gets the nearBSP value for this RunnerPrices.
     * 
     * @return nearBSP
     */
    public java.lang.Double getNearBSP() {
        return nearBSP;
    }


    /**
     * Sets the nearBSP value for this RunnerPrices.
     * 
     * @param nearBSP
     */
    public void setNearBSP(java.lang.Double nearBSP) {
        this.nearBSP = nearBSP;
    }


    /**
     * Gets the actualBSP value for this RunnerPrices.
     * 
     * @return actualBSP
     */
    public java.lang.Double getActualBSP() {
        return actualBSP;
    }


    /**
     * Sets the actualBSP value for this RunnerPrices.
     * 
     * @param actualBSP
     */
    public void setActualBSP(java.lang.Double actualBSP) {
        this.actualBSP = actualBSP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunnerPrices)) return false;
        RunnerPrices other = (RunnerPrices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asianLineId==null && other.getAsianLineId()==null) || 
             (this.asianLineId!=null &&
              this.asianLineId.equals(other.getAsianLineId()))) &&
            ((this.bestPricesToBack==null && other.getBestPricesToBack()==null) || 
             (this.bestPricesToBack!=null &&
              java.util.Arrays.equals(this.bestPricesToBack, other.getBestPricesToBack()))) &&
            ((this.bestPricesToLay==null && other.getBestPricesToLay()==null) || 
             (this.bestPricesToLay!=null &&
              java.util.Arrays.equals(this.bestPricesToLay, other.getBestPricesToLay()))) &&
            ((this.handicap==null && other.getHandicap()==null) || 
             (this.handicap!=null &&
              this.handicap.equals(other.getHandicap()))) &&
            this.lastPriceMatched == other.getLastPriceMatched() &&
            this.reductionFactor == other.getReductionFactor() &&
            this.selectionId == other.getSelectionId() &&
            this.sortOrder == other.getSortOrder() &&
            this.totalAmountMatched == other.getTotalAmountMatched() &&
            ((this.vacant==null && other.getVacant()==null) || 
             (this.vacant!=null &&
              this.vacant.equals(other.getVacant()))) &&
            ((this.farBSP==null && other.getFarBSP()==null) || 
             (this.farBSP!=null &&
              this.farBSP.equals(other.getFarBSP()))) &&
            ((this.nearBSP==null && other.getNearBSP()==null) || 
             (this.nearBSP!=null &&
              this.nearBSP.equals(other.getNearBSP()))) &&
            ((this.actualBSP==null && other.getActualBSP()==null) || 
             (this.actualBSP!=null &&
              this.actualBSP.equals(other.getActualBSP())));
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
        if (getAsianLineId() != null) {
            _hashCode += getAsianLineId().hashCode();
        }
        if (getBestPricesToBack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBestPricesToBack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBestPricesToBack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBestPricesToLay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBestPricesToLay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBestPricesToLay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHandicap() != null) {
            _hashCode += getHandicap().hashCode();
        }
        _hashCode += new Double(getLastPriceMatched()).hashCode();
        _hashCode += new Double(getReductionFactor()).hashCode();
        _hashCode += getSelectionId();
        _hashCode += getSortOrder();
        _hashCode += new Double(getTotalAmountMatched()).hashCode();
        if (getVacant() != null) {
            _hashCode += getVacant().hashCode();
        }
        if (getFarBSP() != null) {
            _hashCode += getFarBSP().hashCode();
        }
        if (getNearBSP() != null) {
            _hashCode += getNearBSP().hashCode();
        }
        if (getActualBSP() != null) {
            _hashCode += getActualBSP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunnerPrices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RunnerPrices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asianLineId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asianLineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestPricesToBack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bestPricesToBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Price"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Price"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestPricesToLay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bestPricesToLay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Price"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Price"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handicap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handicap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPriceMatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastPriceMatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reductionFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reductionFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmountMatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmountMatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vacant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vacant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("farBSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "farBSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nearBSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nearBSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualBSP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualBSP"));
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
