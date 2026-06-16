package io.livekit.android.token;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lio/livekit/android/token/LiteralTokenSource;", "Lio/livekit/android/token/FixedTokenSource;", "", "serverUrl", "participantToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/livekit/android/token/TokenSourceResponse;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lwn/c;)Ljava/lang/Object;", "Ljava/lang/String;", "getServerUrl", "()Ljava/lang/String;", "getParticipantToken", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LiteralTokenSource implements FixedTokenSource {
    private final String participantToken;
    private final String serverUrl;

    public LiteralTokenSource(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.serverUrl = str;
        this.participantToken = str2;
    }

    @Override // io.livekit.android.token.FixedTokenSource
    public Object fetch(c<? super TokenSourceResponse> cVar) {
        return new TokenSourceResponse(this.serverUrl, this.participantToken, (String) null, (String) null, 12, (f) null);
    }

    public final String getParticipantToken() {
        return this.participantToken;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }
}
