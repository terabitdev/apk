package io.livekit.android.webrtc;

import android.gov.nist.javax.sdp.fields.AttributeField;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lio/livekit/android/webrtc/SdpFmtp;", "", "payload", "", "config", "", "(JLjava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getPayload", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toAttributeField", "Landroid/gov/nist/javax/sdp/fields/AttributeField;", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SdpFmtp {
    private final String config;
    private final long payload;

    public SdpFmtp(long j4, String str) {
        str.getClass();
        this.payload = j4;
        this.config = str;
    }

    public static /* synthetic */ SdpFmtp copy$default(SdpFmtp sdpFmtp, long j4, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = sdpFmtp.payload;
        }
        if ((i10 & 2) != 0) {
            str = sdpFmtp.config;
        }
        return sdpFmtp.copy(j4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getPayload() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    public final SdpFmtp copy(long payload, String config) {
        config.getClass();
        return new SdpFmtp(payload, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdpFmtp)) {
            return false;
        }
        SdpFmtp sdpFmtp = (SdpFmtp) other;
        if (this.payload == sdpFmtp.payload && m.c(this.config, sdpFmtp.config)) {
            return true;
        }
        return false;
    }

    public final String getConfig() {
        return this.config;
    }

    public final long getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.config.hashCode() + (Long.hashCode(this.payload) * 31);
    }

    public final AttributeField toAttributeField() {
        AttributeField attributeField = new AttributeField();
        attributeField.setName("fmtp");
        attributeField.setValue(this.payload + ' ' + this.config);
        return attributeField;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdpFmtp(payload=");
        sb.append(this.payload);
        sb.append(", config=");
        return f.m(sb, this.config, ')');
    }
}
