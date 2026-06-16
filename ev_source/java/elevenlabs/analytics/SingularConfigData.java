package io.elevenlabs.analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.google.protobuf.c6;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/analytics/SingularConfigData;", "", "apiKey", "", "secret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getSecret", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SingularConfigData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String METADATA_SINGULAR_API_KEY = "net.singular.api-key";
    private static final String METADATA_SINGULAR_SECRET = "net.singular.secret-key";
    private final String apiKey;
    private final String secret;

    public SingularConfigData(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.apiKey = str;
        this.secret = str2;
    }

    public static /* synthetic */ SingularConfigData copy$default(SingularConfigData singularConfigData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = singularConfigData.apiKey;
        }
        if ((i10 & 2) != 0) {
            str2 = singularConfigData.secret;
        }
        return singularConfigData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    public final SingularConfigData copy(String apiKey, String secret) {
        apiKey.getClass();
        secret.getClass();
        return new SingularConfigData(apiKey, secret);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingularConfigData)) {
            return false;
        }
        SingularConfigData singularConfigData = (SingularConfigData) other;
        if (m.c(this.apiKey, singularConfigData.apiKey) && m.c(this.secret, singularConfigData.secret)) {
            return true;
        }
        return false;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        return this.secret.hashCode() + (this.apiKey.hashCode() * 31);
    }

    public String toString() {
        return h.c("SingularConfigData(apiKey=", this.apiKey, ", secret=", this.secret, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/analytics/SingularConfigData$Companion;", "", "<init>", "()V", "METADATA_SINGULAR_API_KEY", "", "METADATA_SINGULAR_SECRET", "fromMetadata", "Lio/elevenlabs/analytics/SingularConfigData;", "context", "Landroid/content/Context;", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final SingularConfigData fromMetadata(Context context) {
            String str;
            context.getClass();
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            String str2 = null;
            if (bundle != null) {
                str = bundle.getString(SingularConfigData.METADATA_SINGULAR_API_KEY);
            } else {
                str = null;
            }
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                str2 = bundle2.getString(SingularConfigData.METADATA_SINGULAR_SECRET);
            }
            if (str != null) {
                if (str2 != null) {
                    return new SingularConfigData(str, str2);
                }
                c6.x("Singular secret not found in AndroidManifest.xml");
                return null;
            }
            c6.x("Singular API key not found in AndroidManifest.xml");
            return null;
        }

        private Companion() {
        }
    }
}
