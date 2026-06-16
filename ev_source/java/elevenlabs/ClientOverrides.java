package io.elevenlabs;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/ClientOverrides;", "", "source", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ClientOverrides {
    private final String source;
    private final String version;

    public /* synthetic */ ClientOverrides(String str, String str2, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ ClientOverrides copy$default(ClientOverrides clientOverrides, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = clientOverrides.source;
        }
        if ((i10 & 2) != 0) {
            str2 = clientOverrides.version;
        }
        return clientOverrides.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final ClientOverrides copy(String source, String version) {
        return new ClientOverrides(source, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientOverrides)) {
            return false;
        }
        ClientOverrides clientOverrides = (ClientOverrides) other;
        if (m.c(this.source, clientOverrides.source) && m.c(this.version, clientOverrides.version)) {
            return true;
        }
        return false;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        String str = this.source;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.version;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return h.c("ClientOverrides(source=", this.source, ", version=", this.version, Separators.RPAREN);
    }

    public ClientOverrides(String str, String str2) {
        this.source = str;
        this.version = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClientOverrides() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
