package io.livekit.android.token;

import com.auth0.android.jwt.c;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.h;
import sn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0007R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0007R/\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001a\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001d\u0010.\u001a\u0004\u0018\u00010*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u0007R\u0013\u00102\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0013\u00106\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00108\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b7\u00105R\u0013\u0010:\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b9\u00105¨\u0006;"}, d2 = {"Lio/livekit/android/token/TokenPayload;", "", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/livekit/android/token/TokenPayload;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "Lcom/auth0/android/jwt/c;", "jwt", "Lcom/auth0/android/jwt/c;", "getJwt", "()Lcom/auth0/android/jwt/c;", "name$delegate", "Lsn/h;", "getName", DiagnosticsEntry.NAME_KEY, "identity$delegate", "getIdentity", "identity", "metadata$delegate", "getMetadata", "metadata", "", "attributes$delegate", "getAttributes", "()Ljava/util/Map;", "getAttributes$annotations", "()V", "attributes", "Lio/livekit/android/token/VideoGrants;", "video$delegate", "getVideo", "()Lio/livekit/android/token/VideoGrants;", "video", "getIssuer", "issuer", "getSubject", "subject", "Ljava/util/Date;", "getExpiresAt", "()Ljava/util/Date;", "expiresAt", "getNotBefore", "notBefore", "getIssuedAt", "issuedAt", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class TokenPayload {

    /* renamed from: attributes$delegate, reason: from kotlin metadata */
    private final h attributes;

    /* renamed from: identity$delegate, reason: from kotlin metadata */
    private final h identity;
    private final c jwt;

    /* renamed from: metadata$delegate, reason: from kotlin metadata */
    private final h metadata;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    private final h name;
    private final String token;

    /* renamed from: video$delegate, reason: from kotlin metadata */
    private final h video;

    public TokenPayload(String str) {
        str.getClass();
        this.token = str;
        this.jwt = new c(str);
        TokenPayload$name$2 tokenPayload$name$2 = new TokenPayload$name$2(this);
        i iVar = i.f31598c;
        this.name = a.d(iVar, tokenPayload$name$2);
        this.identity = a.d(iVar, new TokenPayload$identity$2(this));
        this.metadata = a.d(iVar, new TokenPayload$metadata$2(this));
        this.attributes = a.d(iVar, new TokenPayload$attributes$2(this));
        this.video = a.d(iVar, new TokenPayload$video$2(this));
    }

    public static /* synthetic */ TokenPayload copy$default(TokenPayload tokenPayload, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenPayload.token;
        }
        return tokenPayload.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final TokenPayload copy(String token) {
        token.getClass();
        return new TokenPayload(token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof TokenPayload) && m.c(this.token, ((TokenPayload) other).token)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAttributes() {
        return (Map) this.attributes.getValue();
    }

    public final Date getExpiresAt() {
        return this.jwt.f5168c.f5171c;
    }

    public final String getIdentity() {
        return (String) this.identity.getValue();
    }

    public final Date getIssuedAt() {
        return this.jwt.f5168c.f5173e;
    }

    public final String getIssuer() {
        return this.jwt.f5168c.f5169a;
    }

    public final c getJwt() {
        return this.jwt;
    }

    public final String getMetadata() {
        return (String) this.metadata.getValue();
    }

    public final String getName() {
        return (String) this.name.getValue();
    }

    public final Date getNotBefore() {
        return this.jwt.f5168c.f5172d;
    }

    public final String getSubject() {
        return this.jwt.f5168c.f5170b;
    }

    public final String getToken() {
        return this.token;
    }

    public final VideoGrants getVideo() {
        return (VideoGrants) this.video.getValue();
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return f.m(new StringBuilder("TokenPayload(token="), this.token, ')');
    }

    public static /* synthetic */ void getAttributes$annotations() {
    }
}
