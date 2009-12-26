/**
 * BFExchangeService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.betfair.www.publicapi.v5.BFExchangeService;

public interface BFExchangeService_PortType extends java.rmi.Remote {
    public com.betfair.www.publicapi.types.exchange.v5.GetSilksResp getSilks(com.betfair.www.publicapi.types.exchange.v5.GetSilksReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp getSilksV2(com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Req request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp getAccountFunds(com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp heartbeat(com.betfair.www.publicapi.types.exchange.v5.HeartbeatReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp cancelBets(com.betfair.www.publicapi.types.exchange.v5.CancelBetsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp cancelBetsByMarket(com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp updateBets(com.betfair.www.publicapi.types.exchange.v5.UpdateBetsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp placeBets(com.betfair.www.publicapi.types.exchange.v5.PlaceBetsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketResp getMarket(com.betfair.www.publicapi.types.exchange.v5.GetMarketReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp getMarketInfo(com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp getMarketPrices(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp getCompleteMarketPricesCompressed(com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp getMarketTradedVolumeCompressed(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp getMarketPricesCompressed(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp getAllMarkets(com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp getInPlayMarkets(com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp getPrivateMarkets(com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp getCurrentBets(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp getCurrentBetsLite(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp getMUBets(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp getMUBetsLite(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp getDetailAvailableMktDepth(com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp getMarketTradedVolume(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp getBetHistory(com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp getAccountStatement(com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementReq req) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp getMarketProfitAndLoss(com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetBetResp getBet(com.betfair.www.publicapi.types.exchange.v5.GetBetReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetCouponResp getCoupon(com.betfair.www.publicapi.types.exchange.v5.GetCouponReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp getBetLite(com.betfair.www.publicapi.types.exchange.v5.GetBetLiteReq request) throws java.rmi.RemoteException;
    public com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp getBetMatchesLite(com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteReq request) throws java.rmi.RemoteException;
}
