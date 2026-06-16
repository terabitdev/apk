package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class j0 extends x implements l0 {
    @Override // com.google.android.gms.internal.measurement.l0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel G = G();
        G.writeString(str);
        G.writeLong(j);
        H(G, 23);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel G = G();
        G.writeString(str);
        G.writeString(str2);
        z.b(G, bundle);
        H(G, 9);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void endAdUnitExposure(String str, long j) {
        Parcel G = G();
        G.writeString(str);
        G.writeLong(j);
        H(G, 24);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void generateEventId(n0 n0Var) {
        Parcel G = G();
        z.c(G, n0Var);
        H(G, 22);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCachedAppInstanceId(n0 n0Var) {
        Parcel G = G();
        z.c(G, n0Var);
        H(G, 19);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        Parcel G = G();
        G.writeString(str);
        G.writeString(str2);
        z.c(G, n0Var);
        H(G, 10);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenClass(n0 n0Var) {
        Parcel G = G();
        z.c(G, n0Var);
        H(G, 17);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenName(n0 n0Var) {
        Parcel G = G();
        z.c(G, n0Var);
        H(G, 16);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getGmpAppId(n0 n0Var) {
        Parcel G = G();
        z.c(G, n0Var);
        H(G, 21);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getMaxUserProperties(String str, n0 n0Var) {
        Parcel G = G();
        G.writeString(str);
        z.c(G, n0Var);
        H(G, 6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getUserProperties(String str, String str2, boolean z10, n0 n0Var) {
        Parcel G = G();
        G.writeString(str);
        G.writeString(str2);
        ClassLoader classLoader = z.f4056a;
        G.writeInt(z10 ? 1 : 0);
        z.c(G, n0Var);
        H(G, 5);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void initialize(e1.a aVar, v0 v0Var, long j) {
        Parcel G = G();
        z.c(G, aVar);
        z.b(G, v0Var);
        G.writeLong(j);
        H(G, 1);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        Parcel G = G();
        G.writeString(str);
        G.writeString(str2);
        z.b(G, bundle);
        G.writeInt(z10 ? 1 : 0);
        G.writeInt(1);
        G.writeLong(j);
        H(G, 2);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logHealthData(int i, String str, e1.a aVar, e1.a aVar2, e1.a aVar3) {
        Parcel G = G();
        G.writeInt(5);
        G.writeString("Error with data collection. Data lost.");
        z.c(G, aVar);
        z.c(G, aVar2);
        z.c(G, aVar3);
        H(G, 33);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityCreatedByScionActivityInfo(x0 x0Var, Bundle bundle, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        z.b(G, bundle);
        G.writeLong(j);
        H(G, 53);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityDestroyedByScionActivityInfo(x0 x0Var, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        G.writeLong(j);
        H(G, 54);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityPausedByScionActivityInfo(x0 x0Var, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        G.writeLong(j);
        H(G, 55);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityResumedByScionActivityInfo(x0 x0Var, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        G.writeLong(j);
        H(G, 56);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivitySaveInstanceStateByScionActivityInfo(x0 x0Var, n0 n0Var, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        z.c(G, n0Var);
        G.writeLong(j);
        H(G, 57);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStartedByScionActivityInfo(x0 x0Var, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        G.writeLong(j);
        H(G, 51);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStoppedByScionActivityInfo(x0 x0Var, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        G.writeLong(j);
        H(G, 52);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void registerOnMeasurementEventListener(s0 s0Var) {
        Parcel G = G();
        z.c(G, s0Var);
        H(G, 35);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void retrieveAndUploadBatches(p0 p0Var) {
        Parcel G = G();
        z.c(G, p0Var);
        H(G, 58);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel G = G();
        z.b(G, bundle);
        G.writeLong(j);
        H(G, 8);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setCurrentScreenByScionActivityInfo(x0 x0Var, String str, String str2, long j) {
        Parcel G = G();
        z.b(G, x0Var);
        G.writeString(str);
        G.writeString(str2);
        G.writeLong(j);
        H(G, 50);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setDataCollectionEnabled(boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setMeasurementEnabled(boolean z10, long j) {
        Parcel G = G();
        ClassLoader classLoader = z.f4056a;
        G.writeInt(z10 ? 1 : 0);
        G.writeLong(j);
        H(G, 11);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setUserProperty(String str, String str2, e1.a aVar, boolean z10, long j) {
        Parcel G = G();
        G.writeString("fcm");
        G.writeString("_ln");
        z.c(G, aVar);
        G.writeInt(1);
        G.writeLong(j);
        H(G, 4);
    }
}
