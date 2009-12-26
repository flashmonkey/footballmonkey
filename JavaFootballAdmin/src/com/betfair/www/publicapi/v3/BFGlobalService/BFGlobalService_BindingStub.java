/**
 * BFGlobalService_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.v3.BFGlobalService;

public class BFGlobalService_BindingStub extends org.apache.axis.client.Stub implements com.betfair.www.publicapi.v3.BFGlobalService.BFGlobalService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[28];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LoginReq"), com.betfair.www.publicapi.types.global.v3.LoginReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LoginResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.LoginResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveLIMBMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveLIMBMessageReq"), com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveLIMBMessageResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitLIMBMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitLIMBMessageReq"), com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitLIMBMessageResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LogoutReq"), com.betfair.www.publicapi.types.global.v3.LogoutReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LogoutResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.LogoutResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("keepAlive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "KeepAliveReq"), com.betfair.www.publicapi.types.global.v3.KeepAliveReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "KeepAliveResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.KeepAliveResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsReq"), com.betfair.www.publicapi.types.global.v3.GetEventsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.GetEventsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActiveEventTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventTypesReq"), com.betfair.www.publicapi.types.global.v3.GetEventTypesReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventTypesResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.GetEventTypesResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllEventTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventTypesReq"), com.betfair.www.publicapi.types.global.v3.GetEventTypesReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventTypesResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.GetEventTypesResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriptionInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetSubscriptionInfoReq"), com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetSubscriptionInfoResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("depositFromPaymentCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DepositFromPaymentCardReq"), com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DepositFromPaymentCardResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPaymentCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AddPaymentCardReq"), com.betfair.www.publicapi.types.global.v3.AddPaymentCardReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AddPaymentCardResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePaymentCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardReq"), com.betfair.www.publicapi.types.global.v3.DeletePaymentCardReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePaymentCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "UpdatePaymentCardReq"), com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "UpdatePaymentCardResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPaymentCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetPaymentCardReq"), com.betfair.www.publicapi.types.global.v3.GetPaymentCardReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetPaymentCardResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("withdrawToPaymentCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "WithdrawToPaymentCardReq"), com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "WithdrawToPaymentCardResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("selfExclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SelfExcludeReq"), com.betfair.www.publicapi.types.global.v3.SelfExcludeReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SelfExcludeResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.SelfExcludeResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("convertCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyReq"), com.betfair.www.publicapi.types.global.v3.ConvertCurrencyReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllCurrencies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesReq"), com.betfair.www.publicapi.types.global.v3.GetCurrenciesReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllCurrenciesV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesV2Req"), com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Req.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesV2Resp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viewReferAndEarn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewReferAndEarnReq"), com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewReferAndEarnResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viewProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileReq"), com.betfair.www.publicapi.types.global.v3.ViewProfileReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.ViewProfileResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viewProfileV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileV2Req"), com.betfair.www.publicapi.types.global.v3.ViewProfileV2Req.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileV2Resp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyProfileReq"), com.betfair.www.publicapi.types.global.v3.ModifyProfileReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyProfileResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.ModifyProfileResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountReq"), com.betfair.www.publicapi.types.global.v3.CreateAccountReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.CreateAccountResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forgotPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordReq"), com.betfair.www.publicapi.types.global.v3.ForgotPasswordReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyPasswordReq"), com.betfair.www.publicapi.types.global.v3.ModifyPasswordReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyPasswordResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setChatName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SetChatNameReq"), com.betfair.www.publicapi.types.global.v3.SetChatNameReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SetChatNameResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.SetChatNameResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferFunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TransferFundsReq"), com.betfair.www.publicapi.types.global.v3.TransferFundsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TransferFundsResp"));
        oper.setReturnClass(com.betfair.www.publicapi.types.global.v3.TransferFundsResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

    }

    public BFGlobalService_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BFGlobalService_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BFGlobalService_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AccountStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.AccountStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AccountTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.AccountTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AddPaymentCardErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.AddPaymentCardErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AddPaymentCardReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.AddPaymentCardReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "AddPaymentCardResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "APIErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.APIErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "APIRequest");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.APIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "APIRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.APIRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "APIResponse");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.APIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "APIResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.APIResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfBFEvent");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.BFEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "BFEvent");
            qName2 = new javax.xml.namespace.QName("", "BFEvent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfCouponLinks");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CouponLink[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CouponLink");
            qName2 = new javax.xml.namespace.QName("", "CouponLink");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfCurrency");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.Currency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "Currency");
            qName2 = new javax.xml.namespace.QName("", "Currency");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfCurrencyV2");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CurrencyV2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CurrencyV2");
            qName2 = new javax.xml.namespace.QName("", "CurrencyV2");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfEventType");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.EventType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "EventType");
            qName2 = new javax.xml.namespace.QName("", "EventType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfLIMBValidationErrorsEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LIMBValidationErrorsEnum[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LIMBValidationErrorsEnum");
            qName2 = new javax.xml.namespace.QName("", "LIMBValidationErrorsEnum");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfMarketSummary");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.MarketSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketSummary");
            qName2 = new javax.xml.namespace.QName("", "MarketSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfPaymentCard");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.PaymentCard[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentCard");
            qName2 = new javax.xml.namespace.QName("", "PaymentCard");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfRetrieveCardBillingAddressCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveCardBillingAddressCheckLIMBMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveCardBillingAddressCheckLIMBMessage");
            qName2 = new javax.xml.namespace.QName("", "retrieveCardBillingAddressCheckLIMBMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfServiceCall");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ServiceCall[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ServiceCall");
            qName2 = new javax.xml.namespace.QName("", "ServiceCall");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfSubmitCardBillingAddressCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitCardBillingAddressCheckLIMBMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitCardBillingAddressCheckLIMBMessage");
            qName2 = new javax.xml.namespace.QName("", "submitCardBillingAddressCheckLIMBMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfSubscription");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.Subscription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "Subscription");
            qName2 = new javax.xml.namespace.QName("", "Subscription");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ArrayOfValidationErrorsEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ValidationErrorsEnum[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ValidationErrorsEnum");
            qName2 = new javax.xml.namespace.QName("", "ValidationErrorsEnum");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "BFEvent");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.BFEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "BillingPeriodEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.BillingPeriodEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CardTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CardTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ConvertCurrencyErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ConvertCurrencyReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ConvertCurrencyResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CouponLink");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CouponLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CreateAccountErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CreateAccountReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CreateAccountResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CreateAccountResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "Currency");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "CurrencyV2");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.CurrencyV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.DeletePaymentCardErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.DeletePaymentCardReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DeletePaymentCardResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DepositFromPaymentCardReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "DepositFromPaymentCardResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "EventType");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.EventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ForgotPasswordErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ForgotPasswordReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ForgotPasswordResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GamcareLimitFreqEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GamcareLimitFreqEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GenderEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GenderEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetCurrenciesReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesV2Req");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Req.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetCurrenciesV2Resp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetEventsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetEventsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetEventsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventTypesReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetEventTypesReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetEventTypesResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetEventTypesResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetPaymentCardErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetPaymentCardErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetPaymentCardReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetPaymentCardReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetPaymentCardResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetSubscriptionInfoReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "GetSubscriptionInfoResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "KeepAliveReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.KeepAliveReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "KeepAliveResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.KeepAliveResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "KYCStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.KYCStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LIMBValidationErrorsEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LIMBValidationErrorsEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LoginErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LoginErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LoginReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LoginReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LoginResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LoginResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LogoutErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LogoutErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LogoutReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LogoutReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "LogoutResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.LogoutResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketSummary");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.MarketSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.MarketTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "MarketTypeVariantEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.MarketTypeVariantEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyPasswordErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ModifyPasswordErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyPasswordReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ModifyPasswordReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyPasswordResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyProfileErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ModifyProfileErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyProfileReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ModifyProfileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ModifyProfileResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ModifyProfileResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentCard");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.PaymentCard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentCardStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.PaymentCardStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PaymentsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.PaymentsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "PrivacyPolicyChangeResponseEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.PrivacyPolicyChangeResponseEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RegionEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RegionEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveAddressCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveAddressCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveBirthDateCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveBirthDateCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveCardBillingAddressCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveCardBillingAddressCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveChatNameChangeLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveChatNameChangeLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveContactDetailsCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveContactDetailsCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveLIMBMessageErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveLIMBMessageReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveLIMBMessageResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrievePasswordChangeLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrievePasswordChangeLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrievePersonalLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrievePersonalLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "RetrieveTCPrivacyPolicyChangeLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.RetrieveTCPrivacyPolicyChangeLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SecurityQuestion1Enum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SecurityQuestion1Enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SecurityQuestion2Enum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SecurityQuestion2Enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SelfExcludeErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SelfExcludeErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SelfExcludeReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SelfExcludeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SelfExcludeResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SelfExcludeResp.class;
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
            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ServiceCall");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ServiceCall.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ServiceEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ServiceEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SetChatNameErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SetChatNameErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SetChatNameReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SetChatNameReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SetChatNameResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SetChatNameResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitAddressCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitAddressCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitBirthDateCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitBirthDateCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitCardBillingAddressCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitCardBillingAddressCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitChatNameChangeLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitChatNameChangeLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitContactDetailsCheckLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitContactDetailsCheckLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitLIMBMessageErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitLIMBMessageReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitLIMBMessageResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitPasswordChangeLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitPasswordChangeLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitPersonalLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitPersonalLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubmitTCPrivacyPolicyChangeLIMBMessage");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubmitTCPrivacyPolicyChangeLIMBMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "Subscription");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.Subscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "SubscriptionStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.SubscriptionStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TitleEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.TitleEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TransferFundsErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.TransferFundsErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TransferFundsReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.TransferFundsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "TransferFundsResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.TransferFundsResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "UpdatePaymentCardErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "UpdatePaymentCardReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "UpdatePaymentCardResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ValidationErrorsEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ValidationErrorsEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewProfileErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewProfileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewProfileResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileV2Req");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewProfileV2Req.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewProfileV2Resp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewReferAndEarnErrorEnum");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnErrorEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewReferAndEarnReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "ViewReferAndEarnResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "WithdrawToPaymentCardReq");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.betfair.com/publicapi/types/global/v3/", "WithdrawToPaymentCardResp");
            cachedSerQNames.add(qName);
            cls = com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp.class;
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

    public com.betfair.www.publicapi.types.global.v3.LoginResp login(com.betfair.www.publicapi.types.global.v3.LoginReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.LoginResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.LoginResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.LoginResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp retrieveLIMBMessage(com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("retrieveLIMBMessage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "retrieveLIMBMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.RetrieveLIMBMessageResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp submitLIMBMessage(com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("submitLIMBMessage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "submitLIMBMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.SubmitLIMBMessageResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.LogoutResp logout(com.betfair.www.publicapi.types.global.v3.LogoutReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.LogoutResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.LogoutResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.LogoutResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.KeepAliveResp keepAlive(com.betfair.www.publicapi.types.global.v3.KeepAliveReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("keepAlive");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "keepAlive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.KeepAliveResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.KeepAliveResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.KeepAliveResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.GetEventsResp getEvents(com.betfair.www.publicapi.types.global.v3.GetEventsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "getEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.GetEventsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.GetEventsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.GetEventsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.GetEventTypesResp getActiveEventTypes(com.betfair.www.publicapi.types.global.v3.GetEventTypesReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getActiveEventTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "getActiveEventTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.GetEventTypesResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.GetEventTypesResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.GetEventTypesResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.GetEventTypesResp getAllEventTypes(com.betfair.www.publicapi.types.global.v3.GetEventTypesReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAllEventTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "getAllEventTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.GetEventTypesResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.GetEventTypesResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.GetEventTypesResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp getSubscriptionInfo(com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubscriptionInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "getSubscriptionInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.GetSubscriptionInfoResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp depositFromPaymentCard(com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("depositFromPaymentCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "depositFromPaymentCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.DepositFromPaymentCardResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp addPaymentCard(com.betfair.www.publicapi.types.global.v3.AddPaymentCardReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("addPaymentCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "addPaymentCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.AddPaymentCardResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp deletePaymentCard(com.betfair.www.publicapi.types.global.v3.DeletePaymentCardReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deletePaymentCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "deletePaymentCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.DeletePaymentCardResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp updatePaymentCard(com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updatePaymentCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "updatePaymentCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.UpdatePaymentCardResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp getPaymentCard(com.betfair.www.publicapi.types.global.v3.GetPaymentCardReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPaymentCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "getPaymentCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.GetPaymentCardResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp withdrawToPaymentCard(com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("withdrawToPaymentCard");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "withdrawToPaymentCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.WithdrawToPaymentCardResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.SelfExcludeResp selfExclude(com.betfair.www.publicapi.types.global.v3.SelfExcludeReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("selfExclude");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "selfExclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.SelfExcludeResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.SelfExcludeResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.SelfExcludeResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp convertCurrency(com.betfair.www.publicapi.types.global.v3.ConvertCurrencyReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("convertCurrency");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "convertCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.ConvertCurrencyResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp getAllCurrencies(com.betfair.www.publicapi.types.global.v3.GetCurrenciesReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAllCurrencies");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "getAllCurrencies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.GetCurrenciesResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp getAllCurrenciesV2(com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Req request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAllCurrenciesV2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "getAllCurrenciesV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.GetCurrenciesV2Resp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp viewReferAndEarn(com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("viewReferAndEarn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "viewReferAndEarn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.ViewReferAndEarnResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.ViewProfileResp viewProfile(com.betfair.www.publicapi.types.global.v3.ViewProfileReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("viewProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "viewProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.ViewProfileResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.ViewProfileResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.ViewProfileResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp viewProfileV2(com.betfair.www.publicapi.types.global.v3.ViewProfileV2Req request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("viewProfileV2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "viewProfileV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.ViewProfileV2Resp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.ModifyProfileResp modifyProfile(com.betfair.www.publicapi.types.global.v3.ModifyProfileReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("modifyProfile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "modifyProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.ModifyProfileResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.ModifyProfileResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.ModifyProfileResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.CreateAccountResp createAccount(com.betfair.www.publicapi.types.global.v3.CreateAccountReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("createAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "createAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.CreateAccountResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.CreateAccountResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.CreateAccountResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp forgotPassword(com.betfair.www.publicapi.types.global.v3.ForgotPasswordReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("forgotPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "forgotPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.ForgotPasswordResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp modifyPassword(com.betfair.www.publicapi.types.global.v3.ModifyPasswordReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("modifyPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "modifyPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.ModifyPasswordResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.SetChatNameResp setChatName(com.betfair.www.publicapi.types.global.v3.SetChatNameReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("setChatName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "setChatName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.SetChatNameResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.SetChatNameResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.SetChatNameResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.betfair.www.publicapi.types.global.v3.TransferFundsResp transferFunds(com.betfair.www.publicapi.types.global.v3.TransferFundsReq request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("transferFunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.betfair.com/publicapi/v3/BFGlobalService/", "transferFunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.betfair.www.publicapi.types.global.v3.TransferFundsResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.betfair.www.publicapi.types.global.v3.TransferFundsResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.betfair.www.publicapi.types.global.v3.TransferFundsResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
