package io.elevenlabs.readerapp.core;

import android.gov.nist.core.Separators;
import io.elevenlabs.readerapp.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/core/ConfigState;", "", "minVersion", "", "currentVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMinVersion", "()Ljava/lang/String;", "getCurrentVersion", "showForceUpgradeDialog", "", "getShowForceUpgradeDialog", "()Z", "compareVersions", "", "version1", "version2", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ConfigState {
    public static final int $stable = 0;
    private final String currentVersion;
    private final String minVersion;
    private final boolean showForceUpgradeDialog;

    public ConfigState(String str, String str2) {
        boolean z6;
        str.getClass();
        str2.getClass();
        this.minVersion = str;
        this.currentVersion = str2;
        if (compareVersions(str, str2) > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.showForceUpgradeDialog = z6;
    }

    private final int compareVersions(String version1, String version2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        List z02 = wq.n.z0(version1, new String[]{Separators.DOT, "-"}, 6);
        List z03 = wq.n.z0(version2, new String[]{Separators.DOT, "-"}, 6);
        String str = (String) tn.o.z0(0, z02);
        Integer num6 = null;
        if (str != null) {
            num = u.Y(str);
        } else {
            num = null;
        }
        String str2 = (String) tn.o.z0(1, z02);
        if (str2 != null) {
            num2 = u.Y(str2);
        } else {
            num2 = null;
        }
        String str3 = (String) tn.o.z0(2, z02);
        if (str3 != null) {
            num3 = u.Y(str3);
        } else {
            num3 = null;
        }
        String str4 = (String) tn.o.z0(0, z03);
        if (str4 != null) {
            num4 = u.Y(str4);
        } else {
            num4 = null;
        }
        String str5 = (String) tn.o.z0(1, z03);
        if (str5 != null) {
            num5 = u.Y(str5);
        } else {
            num5 = null;
        }
        String str6 = (String) tn.o.z0(2, z03);
        if (str6 != null) {
            num6 = u.Y(str6);
        }
        if (num == null || num4 == null || num.intValue() <= num4.intValue()) {
            if (num == null || num4 == null || num.intValue() >= num4.intValue()) {
                if (num2 == null || num5 == null || num2.intValue() <= num5.intValue()) {
                    if (num2 == null || num5 == null || num2.intValue() >= num5.intValue()) {
                        if (num3 == null || num6 == null || num3.intValue() <= num6.intValue()) {
                            if (num3 == null || num6 == null || num3.intValue() >= num6.intValue()) {
                                return 0;
                            }
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        }
        return 1;
    }

    public static /* synthetic */ ConfigState copy$default(ConfigState configState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = configState.minVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = configState.currentVersion;
        }
        return configState.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMinVersion() {
        return this.minVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentVersion() {
        return this.currentVersion;
    }

    public final ConfigState copy(String minVersion, String currentVersion) {
        minVersion.getClass();
        currentVersion.getClass();
        return new ConfigState(minVersion, currentVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigState)) {
            return false;
        }
        ConfigState configState = (ConfigState) other;
        if (kotlin.jvm.internal.m.c(this.minVersion, configState.minVersion) && kotlin.jvm.internal.m.c(this.currentVersion, configState.currentVersion)) {
            return true;
        }
        return false;
    }

    public final String getCurrentVersion() {
        return this.currentVersion;
    }

    public final String getMinVersion() {
        return this.minVersion;
    }

    public final boolean getShowForceUpgradeDialog() {
        return this.showForceUpgradeDialog;
    }

    public int hashCode() {
        return this.currentVersion.hashCode() + (this.minVersion.hashCode() * 31);
    }

    public String toString() {
        return z.h.c("ConfigState(minVersion=", this.minVersion, ", currentVersion=", this.currentVersion, Separators.RPAREN);
    }

    public ConfigState() {
        this(null, null, 3, null);
    }

    public /* synthetic */ ConfigState(String str, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
