/**
 * BFExchangeService_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.v5.BFExchangeService;

public class BFExchangeService_BindingStub extends org.apache.axis.client.Stub implements com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[30];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountFunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountFundsReq"), com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountFundsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelBets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsReq"), com.betfair.www.publicapi.types.exchange.v5.CancelBetsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelBetsByMarket");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketReq"), com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsReq"), com.betfair.www.publicapi.types.exchange.v5.UpdateBetsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("placeBets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsReq"), com.betfair.www.publicapi.types.exchange.v5.PlaceBetsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarket");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketReq"), com.betfair.www.publicapi.types.exchange.v5.GetMarketReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMarketResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarketInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketInfoReq"), com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketInfoResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarketPrices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesReq"), com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompleteMarketPricesCompressed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCompleteMarketPricesCompressedReq"), com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCompleteMarketPricesCompressedResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarketTradedVolumeCompressed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeCompressedReq"), com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeCompressedResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarketPricesCompressed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesCompressedReq"), com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesCompressedResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllMarkets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAllMarketsReq"), com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAllMarketsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInPlayMarkets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetInPlayMarketsReq"), com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetInPlayMarketsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPrivateMarkets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetPrivateMarketsReq"), com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetPrivateMarketsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentBets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsReq"), com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCoupon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCouponReq"), com.betfair.www.publicapi.types.exchange.v5.GetCouponReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCouponResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetCouponResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentBetsLite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsLiteReq"), com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsLiteResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMUBets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsReq"), com.betfair.www.publicapi.types.exchange.v5.GetMUBetsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMUBetsLite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsLiteReq"), com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsLiteResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDetailAvailableMktDepth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetDetailedAvailableMktDepthReq"), com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetDetailedAvailableMktDepthResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarketTradedVolume");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeReq"), com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBetHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryReq"), com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountStatementReq"), com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountStatementResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMarketProfitAndLoss");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossReq"), com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetReq"), com.betfair.www.publicapi.types.exchange.v5.GetBetReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetBetResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBetLite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetLiteReq"), com.betfair.www.publicapi.types.exchange.v5.GetBetLiteReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetLiteResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBetMatchesLite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetMatchesLiteReq"), com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetMatchesLiteResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSilks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksReq"), com.betfair.www.publicapi.types.exchange.v5.GetSilksReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetSilksResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSilksV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksV2Req"), com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Req.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksV2Resp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("heartbeat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "HeartbeatReq"), com.betfair.www.publicapi.types.exchange.v5.HeartbeatReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "HeartbeatResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    public BFExchangeService_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BFExchangeService_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BFExchangeService_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.AccountStatementEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementIncludeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.AccountStatementIncludeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementItem");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.AccountStatementItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "APIErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.APIErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "APIRequest");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.APIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "APIRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.APIRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "APIResponse");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.APIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "APIResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.APIResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfAccountStatementItem");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.AccountStatementItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AccountStatementItem");
            qName2 = new javax.xml.namespace.QName("", "AccountStatementItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfAvailabilityInfo");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.AvailabilityInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AvailabilityInfo");
            qName2 = new javax.xml.namespace.QName("", "AvailabilityInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfBet");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Bet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Bet");
            qName2 = new javax.xml.namespace.QName("", "Bet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfBetId");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("", "betId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfBetLite");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.BetLite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetLite");
            qName2 = new javax.xml.namespace.QName("", "BetLite");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfCancelBets");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBets[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBets");
            qName2 = new javax.xml.namespace.QName("", "CancelBets");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfCancelBetsByMarketResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResult");
            qName2 = new javax.xml.namespace.QName("", "CancelBetsByMarketResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfCancelBetsResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResult");
            qName2 = new javax.xml.namespace.QName("", "CancelBetsResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfCountryCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "Country");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfCouponLinks");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CouponLink[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponLink");
            qName2 = new javax.xml.namespace.QName("", "CouponLink");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfCouponMarket");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CouponMarket[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponMarket");
            qName2 = new javax.xml.namespace.QName("", "CouponMarket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfCouponSelection");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CouponSelection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponSelection");
            qName2 = new javax.xml.namespace.QName("", "CouponSelection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfEventId");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("", "EventId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfMarketDisplayDetail");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayDetail");
            qName2 = new javax.xml.namespace.QName("", "MarketDisplayDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfMarketDisplayDetailV2");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetailV2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayDetailV2");
            qName2 = new javax.xml.namespace.QName("", "MarketDisplayDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfMarketTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeEnum");
            qName2 = new javax.xml.namespace.QName("", "MarketTypeEnum");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfMatch");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Match[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Match");
            qName2 = new javax.xml.namespace.QName("", "Match");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfMatchLite");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MatchLite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MatchLite");
            qName2 = new javax.xml.namespace.QName("", "MatchLite");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfMUBet");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MUBet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MUBet");
            qName2 = new javax.xml.namespace.QName("", "MUBet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfMUBetLite");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MUBetLite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MUBetLite");
            qName2 = new javax.xml.namespace.QName("", "MUBetLite");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfPlaceBets");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBets[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBets");
            qName2 = new javax.xml.namespace.QName("", "PlaceBets");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfPlaceBetsResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResult");
            qName2 = new javax.xml.namespace.QName("", "PlaceBetsResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfPrice");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Price[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Price");
            qName2 = new javax.xml.namespace.QName("", "Price");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfPrivateMarket");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PrivateMarket[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PrivateMarket");
            qName2 = new javax.xml.namespace.QName("", "PrivateMarket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfProfitAndLoss");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ProfitAndLoss");
            qName2 = new javax.xml.namespace.QName("", "ProfitAndLoss");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfRacingSilk");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.RacingSilk[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RacingSilk");
            qName2 = new javax.xml.namespace.QName("", "RacingSilk");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfRacingSilkV2");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.RacingSilkV2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RacingSilkV2");
            qName2 = new javax.xml.namespace.QName("", "RacingSilk");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfRunner");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Runner[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Runner");
            qName2 = new javax.xml.namespace.QName("", "Runner");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfRunnerPrices");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.RunnerPrices[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RunnerPrices");
            qName2 = new javax.xml.namespace.QName("", "RunnerPrices");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfUpdateBets");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBets[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBets");
            qName2 = new javax.xml.namespace.QName("", "UpdateBets");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfUpdateBetsResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResult");
            qName2 = new javax.xml.namespace.QName("", "UpdateBetsResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ArrayOfVolumeInfo");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.VolumeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "VolumeInfo");
            qName2 = new javax.xml.namespace.QName("", "VolumeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "AvailabilityInfo");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.AvailabilityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Bet");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Bet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetCategoryTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.BetCategoryTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetLite");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.BetLite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetPersistenceTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.BetPersistenceTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetsOrderByEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.BetsOrderByEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.BetStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "BetTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.BetTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Breeding");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Breeding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBets");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsByMarketResultEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResultEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CancelBetsResultEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CancelBetsResultEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponLink");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CouponLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponMarket");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CouponMarket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "CouponSelection");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.CouponSelection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountFundsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountFundsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountFundsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountStatementErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountStatementReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAccountStatementResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAllMarketsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAllMarketsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetAllMarketsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetHistoryResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetLiteReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetLiteReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetLiteResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetMatchesLiteReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetMatchesLiteResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetBetResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetBetResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCompleteMarketPricesCompressedReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCompleteMarketPricesCompressedResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCompleteMarketPricesErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCouponErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCouponErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCouponReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCouponReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCouponResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCouponResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsLiteReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsLiteResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetCurrentBetsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetDetailedAvailableMktDepthReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetDetailedAvailableMktDepthResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetDetailedAvailMktDepthErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailMktDepthErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetInPlayMarketsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetInPlayMarketsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetInPlayMarketsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketInfoReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketInfoResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesCompressedReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesCompressedResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketPricesResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketProfitAndLossResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeCompressedErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeCompressedReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeCompressedResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMarketTradedVolumeResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMUBetsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsLiteReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsLiteResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMUBetsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetMUBetsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetPrivateMarketsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetPrivateMarketsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetPrivateMarketsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetSilksErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetSilksReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetSilksResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksV2Req");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Req.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "GetSilksV2Resp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "HandicapLine");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.HandicapLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "HeartbeatErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.HeartbeatErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "HeartbeatReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.HeartbeatReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "HeartbeatResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Market");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Market.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayDetail");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayDetailV2");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketDisplayDetailV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketDisplayErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketDisplayErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketLite");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketLite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketPrices");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketPrices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MarketTypeVariantEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MarketTypeVariantEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Match");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Match.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MatchLite");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MatchLite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MUBet");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MUBet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MUBetLite");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MUBetLite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "MultiWinnerOddsLine");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.MultiWinnerOddsLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBets");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBetsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBetsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PlaceBetsResultEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResultEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Price");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Price.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "PrivateMarket");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.PrivateMarket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "ProfitAndLoss");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.ProfitAndLoss.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RacingSilk");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.RacingSilk.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RacingSilkV2");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.RacingSilkV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "Runner");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.Runner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "RunnerPrices");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.RunnerPrices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "SortOrderEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.SortOrderEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBets");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBetsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBetsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResult");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "UpdateBetsResultEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResultEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/exchange/v5/", "VolumeInfo");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.exchange.v5.VolumeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp getAccountFunds(com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountFunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getAccountFunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp cancelBets(com.betfair.www.publicapi.types.exchange.v5.CancelBetsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cancelBets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "cancelBets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp cancelBetsByMarket(com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cancelBetsByMarket");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "cancelBetsByMarket"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp updateBets(com.betfair.www.publicapi.types.exchange.v5.UpdateBetsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateBets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "updateBets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp placeBets(com.betfair.www.publicapi.types.exchange.v5.PlaceBetsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("placeBets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "placeBets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMarketResp getMarket(com.betfair.www.publicapi.types.exchange.v5.GetMarketReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMarket");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMarket"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMarketResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp getMarketInfo(com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMarketInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMarketInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp getMarketPrices(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMarketPrices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMarketPrices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp getCompleteMarketPricesCompressed(com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCompleteMarketPricesCompressed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getCompleteMarketPricesCompressed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp getMarketTradedVolumeCompressed(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMarketTradedVolumeCompressed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMarketTradedVolumeCompressed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp getMarketPricesCompressed(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMarketPricesCompressed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMarketPricesCompressed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp getAllMarkets(com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAllMarkets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getAllMarkets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp getInPlayMarkets(com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getInPlayMarkets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getInPlayMarkets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp getPrivateMarkets(com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPrivateMarkets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getPrivateMarkets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp getCurrentBets(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCurrentBets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getCurrentBets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetCouponResp getCoupon(com.betfair.www.publicapi.types.exchange.v5.GetCouponReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCoupon");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getCoupon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCouponResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCouponResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetCouponResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp getCurrentBetsLite(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCurrentBetsLite");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getCurrentBetsLite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp getMUBets(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMUBets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMUBets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp getMUBetsLite(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMUBetsLite");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMUBetsLite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp getDetailAvailableMktDepth(com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDetailAvailableMktDepth");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getDetailAvailableMktDepth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp getMarketTradedVolume(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMarketTradedVolume");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMarketTradedVolume"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp getBetHistory(com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBetHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getBetHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp getAccountStatement(com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountStatement");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getAccountStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp getMarketProfitAndLoss(com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMarketProfitAndLoss");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getMarketProfitAndLoss"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetBetResp getBet(com.betfair.www.publicapi.types.exchange.v5.GetBetReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getBet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetBetResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp getBetLite(com.betfair.www.publicapi.types.exchange.v5.GetBetLiteReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBetLite");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getBetLite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp getBetMatchesLite(com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBetMatchesLite");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getBetMatchesLite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetSilksResp getSilks(com.betfair.www.publicapi.types.exchange.v5.GetSilksReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSilks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getSilks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetSilksResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetSilksResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetSilksResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp getSilksV2(com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Req request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSilksV2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "getSilksV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp heartbeat(com.betfair.www.publicapi.types.exchange.v5.HeartbeatReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("heartbeat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v5/BFExchangeService/", "heartbeat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
