package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public interface l0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(n0 n0Var);

    void getAppInstanceId(n0 n0Var);

    void getCachedAppInstanceId(n0 n0Var);

    void getConditionalUserProperties(String str, String str2, n0 n0Var);

    void getCurrentScreenClass(n0 n0Var);

    void getCurrentScreenName(n0 n0Var);

    void getGmpAppId(n0 n0Var);

    void getMaxUserProperties(String str, n0 n0Var);

    void getSessionId(n0 n0Var);

    void getTestFlag(n0 n0Var, int i);

    void getUserProperties(String str, String str2, boolean z10, n0 n0Var);

    void initForTests(Map map);

    void initialize(e1.a aVar, v0 v0Var, long j);

    void isDataCollectionEnabled(n0 n0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j);

    void logHealthData(int i, String str, e1.a aVar, e1.a aVar2, e1.a aVar3);

    void onActivityCreated(e1.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(x0 x0Var, Bundle bundle, long j);

    void onActivityDestroyed(e1.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(x0 x0Var, long j);

    void onActivityPaused(e1.a aVar, long j);

    void onActivityPausedByScionActivityInfo(x0 x0Var, long j);

    void onActivityResumed(e1.a aVar, long j);

    void onActivityResumedByScionActivityInfo(x0 x0Var, long j);

    void onActivitySaveInstanceState(e1.a aVar, n0 n0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(x0 x0Var, n0 n0Var, long j);

    void onActivityStarted(e1.a aVar, long j);

    void onActivityStartedByScionActivityInfo(x0 x0Var, long j);

    void onActivityStopped(e1.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(x0 x0Var, long j);

    void performAction(Bundle bundle, n0 n0Var, long j);

    void registerOnMeasurementEventListener(s0 s0Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(p0 p0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(e1.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(x0 x0Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(s0 s0Var);

    void setInstanceIdProvider(u0 u0Var);

    void setMeasurementEnabled(boolean z10, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, e1.a aVar, boolean z10, long j);

    void unregisterOnMeasurementEventListener(s0 s0Var);
}
