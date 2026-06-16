package io.elevenlabs.domain;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jy\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0014\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u000bHÖ\u0081\u0004J\n\u00100\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0014¨\u00061"}, d2 = {"Lio/elevenlabs/domain/Configuration;", "", "debugMode", "", "apiUrl", "", "apiWs", "useMockedPodcasts", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "appVersionName", "appVersionCode", "", "revenueCatKey", "appCheckMock", "appFlavor", "Lio/elevenlabs/domain/AppFlavor;", "isE2eTesting", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/AppFlavor;Z)V", "getDebugMode", "()Z", "getApiUrl", "()Ljava/lang/String;", "getApiWs", "getUseMockedPodcasts", "getPackageName", "getAppVersionName", "getAppVersionCode", "()I", "getRevenueCatKey", "getAppCheckMock", "getAppFlavor", "()Lio/elevenlabs/domain/AppFlavor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Configuration {
    private final String apiUrl;
    private final String apiWs;
    private final String appCheckMock;
    private final AppFlavor appFlavor;
    private final int appVersionCode;
    private final String appVersionName;
    private final boolean debugMode;
    private final boolean isE2eTesting;
    private final String packageName;
    private final String revenueCatKey;
    private final boolean useMockedPodcasts;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Configuration(boolean z6, String str, String str2, boolean z10, String str3, String str4, int i10, String str5, String str6, AppFlavor appFlavor, boolean z11, int i11, f fVar) {
        this(z6, str, str2, z10, str3, str4, i10, str5, str6, appFlavor, r12);
        boolean z12;
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, boolean z6, String str, String str2, boolean z10, String str3, String str4, int i10, String str5, String str6, AppFlavor appFlavor, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z6 = configuration.debugMode;
        }
        if ((i11 & 2) != 0) {
            str = configuration.apiUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = configuration.apiWs;
        }
        if ((i11 & 8) != 0) {
            z10 = configuration.useMockedPodcasts;
        }
        if ((i11 & 16) != 0) {
            str3 = configuration.packageName;
        }
        if ((i11 & 32) != 0) {
            str4 = configuration.appVersionName;
        }
        if ((i11 & 64) != 0) {
            i10 = configuration.appVersionCode;
        }
        if ((i11 & 128) != 0) {
            str5 = configuration.revenueCatKey;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str6 = configuration.appCheckMock;
        }
        if ((i11 & 512) != 0) {
            appFlavor = configuration.appFlavor;
        }
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z11 = configuration.isE2eTesting;
        }
        AppFlavor appFlavor2 = appFlavor;
        boolean z12 = z11;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        int i12 = i10;
        String str10 = str3;
        String str11 = str2;
        return configuration.copy(z6, str, str11, z10, str10, str9, i12, str7, str8, appFlavor2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDebugMode() {
        return this.debugMode;
    }

    /* renamed from: component10, reason: from getter */
    public final AppFlavor getAppFlavor() {
        return this.appFlavor;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsE2eTesting() {
        return this.isE2eTesting;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApiUrl() {
        return this.apiUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApiWs() {
        return this.apiWs;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseMockedPodcasts() {
        return this.useMockedPodcasts;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAppVersionCode() {
        return this.appVersionCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRevenueCatKey() {
        return this.revenueCatKey;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAppCheckMock() {
        return this.appCheckMock;
    }

    public final Configuration copy(boolean debugMode, String apiUrl, String apiWs, boolean useMockedPodcasts, String packageName, String appVersionName, int appVersionCode, String revenueCatKey, String appCheckMock, AppFlavor appFlavor, boolean isE2eTesting) {
        c.v(apiUrl, apiWs, packageName, appVersionName, revenueCatKey);
        appFlavor.getClass();
        return new Configuration(debugMode, apiUrl, apiWs, useMockedPodcasts, packageName, appVersionName, appVersionCode, revenueCatKey, appCheckMock, appFlavor, isE2eTesting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        if (this.debugMode == configuration.debugMode && m.c(this.apiUrl, configuration.apiUrl) && m.c(this.apiWs, configuration.apiWs) && this.useMockedPodcasts == configuration.useMockedPodcasts && m.c(this.packageName, configuration.packageName) && m.c(this.appVersionName, configuration.appVersionName) && this.appVersionCode == configuration.appVersionCode && m.c(this.revenueCatKey, configuration.revenueCatKey) && m.c(this.appCheckMock, configuration.appCheckMock) && this.appFlavor == configuration.appFlavor && this.isE2eTesting == configuration.isE2eTesting) {
            return true;
        }
        return false;
    }

    public final String getApiUrl() {
        return this.apiUrl;
    }

    public final String getApiWs() {
        return this.apiWs;
    }

    public final String getAppCheckMock() {
        return this.appCheckMock;
    }

    public final AppFlavor getAppFlavor() {
        return this.appFlavor;
    }

    public final int getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final boolean getDebugMode() {
        return this.debugMode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getRevenueCatKey() {
        return this.revenueCatKey;
    }

    public final boolean getUseMockedPodcasts() {
        return this.useMockedPodcasts;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(c.b(this.appVersionCode, c.c(c.c(b.f(c.c(c.c(Boolean.hashCode(this.debugMode) * 31, 31, this.apiUrl), 31, this.apiWs), 31, this.useMockedPodcasts), 31, this.packageName), 31, this.appVersionName), 31), 31, this.revenueCatKey);
        String str = this.appCheckMock;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.isE2eTesting) + ((this.appFlavor.hashCode() + ((c5 + hashCode) * 31)) * 31);
    }

    public final boolean isE2eTesting() {
        return this.isE2eTesting;
    }

    public String toString() {
        boolean z6 = this.debugMode;
        String str = this.apiUrl;
        String str2 = this.apiWs;
        boolean z10 = this.useMockedPodcasts;
        String str3 = this.packageName;
        String str4 = this.appVersionName;
        int i10 = this.appVersionCode;
        String str5 = this.revenueCatKey;
        String str6 = this.appCheckMock;
        AppFlavor appFlavor = this.appFlavor;
        boolean z11 = this.isE2eTesting;
        StringBuilder sb = new StringBuilder("Configuration(debugMode=");
        sb.append(z6);
        sb.append(", apiUrl=");
        sb.append(str);
        sb.append(", apiWs=");
        defpackage.f.y(sb, str2, ", useMockedPodcasts=", z10, ", packageName=");
        defpackage.f.x(sb, str3, ", appVersionName=", str4, ", appVersionCode=");
        sb.append(i10);
        sb.append(", revenueCatKey=");
        sb.append(str5);
        sb.append(", appCheckMock=");
        sb.append(str6);
        sb.append(", appFlavor=");
        sb.append(appFlavor);
        sb.append(", isE2eTesting=");
        return n.j(Separators.RPAREN, sb, z11);
    }

    public Configuration(boolean z6, String str, String str2, boolean z10, String str3, String str4, int i10, String str5, String str6, AppFlavor appFlavor, boolean z11) {
        c.v(str, str2, str3, str4, str5);
        appFlavor.getClass();
        this.debugMode = z6;
        this.apiUrl = str;
        this.apiWs = str2;
        this.useMockedPodcasts = z10;
        this.packageName = str3;
        this.appVersionName = str4;
        this.appVersionCode = i10;
        this.revenueCatKey = str5;
        this.appCheckMock = str6;
        this.appFlavor = appFlavor;
        this.isE2eTesting = z11;
    }
}
