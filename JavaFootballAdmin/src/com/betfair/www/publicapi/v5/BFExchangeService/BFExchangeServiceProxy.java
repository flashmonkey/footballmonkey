package com.betfair.www.publicapi.v5.BFExchangeService;

public class BFExchangeServiceProxy implements com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_PortType {
  private String _endpoint = null;
  private com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_PortType bFExchangeService_PortType = null;
  
  public BFExchangeServiceProxy() {
    _initBFExchangeServiceProxy();
  }
  
  public BFExchangeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBFExchangeServiceProxy();
  }
  
  private void _initBFExchangeServiceProxy() {
    try {
      bFExchangeService_PortType = (new com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_ServiceLocator()).getBFExchangeService();
      if (bFExchangeService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bFExchangeService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bFExchangeService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bFExchangeService_PortType != null)
      ((javax.xml.rpc.Stub)bFExchangeService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.betfair.www.publicapi.v5.BFExchangeService.BFExchangeService_PortType getBFExchangeService_PortType() {
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType;
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetSilksResp getSilks(com.betfair.www.publicapi.types.exchange.v5.GetSilksReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getSilks(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Resp getSilksV2(com.betfair.www.publicapi.types.exchange.v5.GetSilksV2Req request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getSilksV2(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsResp getAccountFunds(com.betfair.www.publicapi.types.exchange.v5.GetAccountFundsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getAccountFunds(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.HeartbeatResp heartbeat(com.betfair.www.publicapi.types.exchange.v5.HeartbeatReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.heartbeat(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.CancelBetsResp cancelBets(com.betfair.www.publicapi.types.exchange.v5.CancelBetsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.cancelBets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketResp cancelBetsByMarket(com.betfair.www.publicapi.types.exchange.v5.CancelBetsByMarketReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.cancelBetsByMarket(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.UpdateBetsResp updateBets(com.betfair.www.publicapi.types.exchange.v5.UpdateBetsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.updateBets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.PlaceBetsResp placeBets(com.betfair.www.publicapi.types.exchange.v5.PlaceBetsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.placeBets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMarketResp getMarket(com.betfair.www.publicapi.types.exchange.v5.GetMarketReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMarket(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoResp getMarketInfo(com.betfair.www.publicapi.types.exchange.v5.GetMarketInfoReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMarketInfo(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesResp getMarketPrices(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMarketPrices(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedResp getCompleteMarketPricesCompressed(com.betfair.www.publicapi.types.exchange.v5.GetCompleteMarketPricesCompressedReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getCompleteMarketPricesCompressed(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedResp getMarketTradedVolumeCompressed(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeCompressedReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMarketTradedVolumeCompressed(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedResp getMarketPricesCompressed(com.betfair.www.publicapi.types.exchange.v5.GetMarketPricesCompressedReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMarketPricesCompressed(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsResp getAllMarkets(com.betfair.www.publicapi.types.exchange.v5.GetAllMarketsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getAllMarkets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsResp getInPlayMarkets(com.betfair.www.publicapi.types.exchange.v5.GetInPlayMarketsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getInPlayMarkets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsResp getPrivateMarkets(com.betfair.www.publicapi.types.exchange.v5.GetPrivateMarketsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getPrivateMarkets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsResp getCurrentBets(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getCurrentBets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteResp getCurrentBetsLite(com.betfair.www.publicapi.types.exchange.v5.GetCurrentBetsLiteReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getCurrentBetsLite(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMUBetsResp getMUBets(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMUBets(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteResp getMUBetsLite(com.betfair.www.publicapi.types.exchange.v5.GetMUBetsLiteReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMUBetsLite(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthResp getDetailAvailableMktDepth(com.betfair.www.publicapi.types.exchange.v5.GetDetailedAvailableMktDepthReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getDetailAvailableMktDepth(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeResp getMarketTradedVolume(com.betfair.www.publicapi.types.exchange.v5.GetMarketTradedVolumeReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMarketTradedVolume(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryResp getBetHistory(com.betfair.www.publicapi.types.exchange.v5.GetBetHistoryReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getBetHistory(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementResp getAccountStatement(com.betfair.www.publicapi.types.exchange.v5.GetAccountStatementReq req) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getAccountStatement(req);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossResp getMarketProfitAndLoss(com.betfair.www.publicapi.types.exchange.v5.GetMarketProfitAndLossReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getMarketProfitAndLoss(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetBetResp getBet(com.betfair.www.publicapi.types.exchange.v5.GetBetReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getBet(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetCouponResp getCoupon(com.betfair.www.publicapi.types.exchange.v5.GetCouponReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getCoupon(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetBetLiteResp getBetLite(com.betfair.www.publicapi.types.exchange.v5.GetBetLiteReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getBetLite(request);
  }
  
  public com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteResp getBetMatchesLite(com.betfair.www.publicapi.types.exchange.v5.GetBetMatchesLiteReq request) throws java.rmi.RemoteException{
    if (bFExchangeService_PortType == null)
      _initBFExchangeServiceProxy();
    return bFExchangeService_PortType.getBetMatchesLite(request);
  }
  
  
}