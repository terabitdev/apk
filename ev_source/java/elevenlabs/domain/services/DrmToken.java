package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import defpackage.f;
import ib.i;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/services/DrmToken;", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "", "contentKeyId", "expiresAtUnix", "", "widevineUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getContentKeyId", "getExpiresAtUnix", "()J", "getWidevineUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class DrmToken {
    private final String contentKeyId;
    private final long expiresAtUnix;
    private final String token;
    private final String widevineUrl;

    public DrmToken(String str, String str2, long j4, String str3) {
        i.s(str, str2, str3);
        this.token = str;
        this.contentKeyId = str2;
        this.expiresAtUnix = j4;
        this.widevineUrl = str3;
    }

    public static /* synthetic */ DrmToken copy$default(DrmToken drmToken, String str, String str2, long j4, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = drmToken.token;
        }
        if ((i10 & 2) != 0) {
            str2 = drmToken.contentKeyId;
        }
        if ((i10 & 4) != 0) {
            j4 = drmToken.expiresAtUnix;
        }
        if ((i10 & 8) != 0) {
            str3 = drmToken.widevineUrl;
        }
        String str4 = str3;
        return drmToken.copy(str, str2, j4, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentKeyId() {
        return this.contentKeyId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpiresAtUnix() {
        return this.expiresAtUnix;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWidevineUrl() {
        return this.widevineUrl;
    }

    public final DrmToken copy(String token, String contentKeyId, long expiresAtUnix, String widevineUrl) {
        token.getClass();
        contentKeyId.getClass();
        widevineUrl.getClass();
        return new DrmToken(token, contentKeyId, expiresAtUnix, widevineUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrmToken)) {
            return false;
        }
        DrmToken drmToken = (DrmToken) other;
        if (m.c(this.token, drmToken.token) && m.c(this.contentKeyId, drmToken.contentKeyId) && this.expiresAtUnix == drmToken.expiresAtUnix && m.c(this.widevineUrl, drmToken.widevineUrl)) {
            return true;
        }
        return false;
    }

    public final String getContentKeyId() {
        return this.contentKeyId;
    }

    public final long getExpiresAtUnix() {
        return this.expiresAtUnix;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getWidevineUrl() {
        return this.widevineUrl;
    }

    public int hashCode() {
        return this.widevineUrl.hashCode() + b.g(this.expiresAtUnix, c.c(this.token.hashCode() * 31, 31, this.contentKeyId), 31);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.contentKeyId;
        long j4 = this.expiresAtUnix;
        String str3 = this.widevineUrl;
        StringBuilder s10 = f.s("DrmToken(token=", str, ", contentKeyId=", str2, ", expiresAtUnix=");
        s10.append(j4);
        s10.append(", widevineUrl=");
        s10.append(str3);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
