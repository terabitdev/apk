package io.elevenlabs;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/ClientToolResult;", "", FirebaseAnalytics.Param.SUCCESS, "", "result", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Z", "getResult", "()Ljava/lang/String;", "getError", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ClientToolResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final String result;
    private final boolean success;

    public ClientToolResult(boolean z6, String str, String str2) {
        str.getClass();
        this.success = z6;
        this.result = str;
        this.error = str2;
    }

    public static /* synthetic */ ClientToolResult copy$default(ClientToolResult clientToolResult, boolean z6, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = clientToolResult.success;
        }
        if ((i10 & 2) != 0) {
            str = clientToolResult.result;
        }
        if ((i10 & 4) != 0) {
            str2 = clientToolResult.error;
        }
        return clientToolResult.copy(z6, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ClientToolResult copy(boolean success, String result, String error) {
        result.getClass();
        return new ClientToolResult(success, result, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientToolResult)) {
            return false;
        }
        ClientToolResult clientToolResult = (ClientToolResult) other;
        if (this.success == clientToolResult.success && m.c(this.result, clientToolResult.result) && m.c(this.error, clientToolResult.error)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(Boolean.hashCode(this.success) * 31, 31, this.result);
        String str = this.error;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        boolean z6 = this.success;
        String str = this.result;
        String str2 = this.error;
        StringBuilder sb = new StringBuilder("ClientToolResult(success=");
        sb.append(z6);
        sb.append(", result=");
        sb.append(str);
        sb.append(", error=");
        return f.l(str2, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lio/elevenlabs/ClientToolResult$Companion;", "", "<init>", "()V", FirebaseAnalytics.Param.SUCCESS, "Lio/elevenlabs/ClientToolResult;", "result", "", "failure", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final ClientToolResult failure(String error) {
            error.getClass();
            return new ClientToolResult(false, "", error);
        }

        public final ClientToolResult success(String result) {
            result.getClass();
            return new ClientToolResult(true, result, null, 4, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClientToolResult(boolean z6, String str, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, str, (i10 & 4) != 0 ? null : str2);
    }
}
