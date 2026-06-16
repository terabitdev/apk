package io.livekit.android.token;

import ig.f;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRequest", "Lio/livekit/android/token/TokenSourceRequest;", "Lio/livekit/android/token/TokenRequestOptions;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TokenSourceKt {
    public static final TokenSourceRequest toRequest(TokenRequestOptions tokenRequestOptions) {
        List H;
        tokenRequestOptions.getClass();
        if (tokenRequestOptions.getAgentName() == null && tokenRequestOptions.getAgentMetadata() == null) {
            H = null;
        } else {
            H = f.H(new RoomAgentDispatch(tokenRequestOptions.getAgentName(), tokenRequestOptions.getAgentMetadata()));
        }
        return new TokenSourceRequest(tokenRequestOptions.getRoomName(), tokenRequestOptions.getParticipantName(), tokenRequestOptions.getParticipantIdentity(), tokenRequestOptions.getParticipantMetadata(), tokenRequestOptions.getParticipantAttributes(), new RoomConfiguration((String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (Integer) null, H, 255, (kotlin.jvm.internal.f) null));
    }
}
