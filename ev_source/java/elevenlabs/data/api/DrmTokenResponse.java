package io.elevenlabs.data.api;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001eR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010\u001bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b9\u0010.\u001a\u0004\b8\u0010\u001b¨\u0006<"}, d2 = {"Lio/elevenlabs/data/api/DrmTokenResponse;", "", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "contentKeyId", "", "expiresAtUnix", "fairplayUrl", "widevineUrl", "fairplayCertificateUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/api/DrmTokenResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/api/DrmTokenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "getToken$annotations", "()V", "getContentKeyId", "getContentKeyId$annotations", "J", "getExpiresAtUnix", "getExpiresAtUnix$annotations", "getFairplayUrl", "getFairplayUrl$annotations", "getWidevineUrl", "getWidevineUrl$annotations", "getFairplayCertificateUrl", "getFairplayCertificateUrl$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class DrmTokenResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String contentKeyId;
    private final long expiresAtUnix;
    private final String fairplayCertificateUrl;
    private final String fairplayUrl;
    private final String token;
    private final String widevineUrl;

    public /* synthetic */ DrmTokenResponse(int i10, String str, String str2, long j4, String str3, String str4, String str5, c1 c1Var) {
        if (63 == (i10 & 63)) {
            this.token = str;
            this.contentKeyId = str2;
            this.expiresAtUnix = j4;
            this.fairplayUrl = str3;
            this.widevineUrl = str4;
            this.fairplayCertificateUrl = str5;
            return;
        }
        t0.j(i10, 63, DrmTokenResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ DrmTokenResponse copy$default(DrmTokenResponse drmTokenResponse, String str, String str2, long j4, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = drmTokenResponse.token;
        }
        if ((i10 & 2) != 0) {
            str2 = drmTokenResponse.contentKeyId;
        }
        if ((i10 & 4) != 0) {
            j4 = drmTokenResponse.expiresAtUnix;
        }
        if ((i10 & 8) != 0) {
            str3 = drmTokenResponse.fairplayUrl;
        }
        if ((i10 & 16) != 0) {
            str4 = drmTokenResponse.widevineUrl;
        }
        if ((i10 & 32) != 0) {
            str5 = drmTokenResponse.fairplayCertificateUrl;
        }
        String str6 = str5;
        String str7 = str3;
        long j10 = j4;
        return drmTokenResponse.copy(str, str2, j10, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$data_release(DrmTokenResponse self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.token);
        output.V(serialDesc, 1, self.contentKeyId);
        output.h0(serialDesc, 2, self.expiresAtUnix);
        output.V(serialDesc, 3, self.fairplayUrl);
        output.V(serialDesc, 4, self.widevineUrl);
        output.V(serialDesc, 5, self.fairplayCertificateUrl);
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
    public final String getFairplayUrl() {
        return this.fairplayUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWidevineUrl() {
        return this.widevineUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFairplayCertificateUrl() {
        return this.fairplayCertificateUrl;
    }

    public final DrmTokenResponse copy(String token, String contentKeyId, long expiresAtUnix, String fairplayUrl, String widevineUrl, String fairplayCertificateUrl) {
        token.getClass();
        contentKeyId.getClass();
        fairplayUrl.getClass();
        widevineUrl.getClass();
        fairplayCertificateUrl.getClass();
        return new DrmTokenResponse(token, contentKeyId, expiresAtUnix, fairplayUrl, widevineUrl, fairplayCertificateUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrmTokenResponse)) {
            return false;
        }
        DrmTokenResponse drmTokenResponse = (DrmTokenResponse) other;
        if (m.c(this.token, drmTokenResponse.token) && m.c(this.contentKeyId, drmTokenResponse.contentKeyId) && this.expiresAtUnix == drmTokenResponse.expiresAtUnix && m.c(this.fairplayUrl, drmTokenResponse.fairplayUrl) && m.c(this.widevineUrl, drmTokenResponse.widevineUrl) && m.c(this.fairplayCertificateUrl, drmTokenResponse.fairplayCertificateUrl)) {
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

    public final String getFairplayCertificateUrl() {
        return this.fairplayCertificateUrl;
    }

    public final String getFairplayUrl() {
        return this.fairplayUrl;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getWidevineUrl() {
        return this.widevineUrl;
    }

    public int hashCode() {
        return this.fairplayCertificateUrl.hashCode() + c.c(c.c(com.google.android.gms.internal.play_billing.b.g(this.expiresAtUnix, c.c(this.token.hashCode() * 31, 31, this.contentKeyId), 31), 31, this.fairplayUrl), 31, this.widevineUrl);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.contentKeyId;
        long j4 = this.expiresAtUnix;
        String str3 = this.fairplayUrl;
        String str4 = this.widevineUrl;
        String str5 = this.fairplayCertificateUrl;
        StringBuilder s10 = f.s("DrmTokenResponse(token=", str, ", contentKeyId=", str2, ", expiresAtUnix=");
        s10.append(j4);
        s10.append(", fairplayUrl=");
        s10.append(str3);
        f.x(s10, ", widevineUrl=", str4, ", fairplayCertificateUrl=", str5);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/api/DrmTokenResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/api/DrmTokenResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return DrmTokenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getContentKeyId$annotations() {
    }

    public static /* synthetic */ void getExpiresAtUnix$annotations() {
    }

    public static /* synthetic */ void getFairplayCertificateUrl$annotations() {
    }

    public static /* synthetic */ void getFairplayUrl$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static /* synthetic */ void getWidevineUrl$annotations() {
    }

    public DrmTokenResponse(String str, String str2, long j4, String str3, String str4, String str5) {
        c.v(str, str2, str3, str4, str5);
        this.token = str;
        this.contentKeyId = str2;
        this.expiresAtUnix = j4;
        this.fairplayUrl = str3;
        this.widevineUrl = str4;
        this.fairplayCertificateUrl = str5;
    }
}
