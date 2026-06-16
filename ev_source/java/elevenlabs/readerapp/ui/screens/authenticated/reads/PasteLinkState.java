package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/PasteLinkState;", "", "url", "", "navigateToUrl", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getNavigateToUrl", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PasteLinkState {
    public static final int $stable = 0;
    private final String error;
    private final String navigateToUrl;
    private final String url;

    public /* synthetic */ PasteLinkState(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? "" : str3);
    }

    public static /* synthetic */ PasteLinkState copy$default(PasteLinkState pasteLinkState, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pasteLinkState.url;
        }
        if ((i10 & 2) != 0) {
            str2 = pasteLinkState.navigateToUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = pasteLinkState.error;
        }
        return pasteLinkState.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNavigateToUrl() {
        return this.navigateToUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final PasteLinkState copy(String url, String navigateToUrl, String error) {
        url.getClass();
        error.getClass();
        return new PasteLinkState(url, navigateToUrl, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PasteLinkState)) {
            return false;
        }
        PasteLinkState pasteLinkState = (PasteLinkState) other;
        if (kotlin.jvm.internal.m.c(this.url, pasteLinkState.url) && kotlin.jvm.internal.m.c(this.navigateToUrl, pasteLinkState.navigateToUrl) && kotlin.jvm.internal.m.c(this.error, pasteLinkState.error)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getNavigateToUrl() {
        return this.navigateToUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.url.hashCode() * 31;
        String str = this.navigateToUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.error.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public String toString() {
        return defpackage.f.l(this.error, Separators.RPAREN, defpackage.f.s("PasteLinkState(url=", this.url, ", navigateToUrl=", this.navigateToUrl, ", error="));
    }

    public PasteLinkState(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.url = str;
        this.navigateToUrl = str2;
        this.error = str3;
    }

    public PasteLinkState() {
        this(null, null, null, 7, null);
    }
}
