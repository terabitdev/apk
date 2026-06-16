package io.livekit.android.token;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lio/livekit/android/token/SandboxTokenServerOptions;", "", "baseUrl", "", "(Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SandboxTokenServerOptions {
    private final String baseUrl;

    public /* synthetic */ SandboxTokenServerOptions(String str, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ SandboxTokenServerOptions copy$default(SandboxTokenServerOptions sandboxTokenServerOptions, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sandboxTokenServerOptions.baseUrl;
        }
        return sandboxTokenServerOptions.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final SandboxTokenServerOptions copy(String baseUrl) {
        return new SandboxTokenServerOptions(baseUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof SandboxTokenServerOptions) && m.c(this.baseUrl, ((SandboxTokenServerOptions) other).baseUrl)) {
            return true;
        }
        return false;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public int hashCode() {
        String str = this.baseUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return defpackage.f.m(new StringBuilder("SandboxTokenServerOptions(baseUrl="), this.baseUrl, ')');
    }

    public SandboxTokenServerOptions(String str) {
        this.baseUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SandboxTokenServerOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
