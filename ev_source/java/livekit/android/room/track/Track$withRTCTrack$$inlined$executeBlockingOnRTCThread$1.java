package io.livekit.android.room.track;

import android.gov.nist.javax.sip.parser.TokenNames;
import ho.l;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", TokenNames.T, "call", "()Ljava/lang/Object;", "io/livekit/android/webrtc/peerconnection/RTCThreadUtilsKt$executeBlockingOnRTCThread$1"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes4.dex */
public final class Track$withRTCTrack$$inlined$executeBlockingOnRTCThread$1<V> implements Callable {
    final /* synthetic */ l $action$inlined;
    final /* synthetic */ Object $defaultValue$inlined;
    final /* synthetic */ RTCThreadToken $token;
    final /* synthetic */ Track this$0;

    public Track$withRTCTrack$$inlined$executeBlockingOnRTCThread$1(RTCThreadToken rTCThreadToken, Track track, Object obj, l lVar) {
        this.$token = rTCThreadToken;
        this.this$0 = track;
        this.$defaultValue$inlined = obj;
        this.$action$inlined = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final T call() {
        if (this.$token.isDisposed()) {
            return null;
        }
        if (this.this$0.isDisposed$livekit_android_sdk_release()) {
            return this.$defaultValue$inlined;
        }
        return this.$action$inlined.invoke(this.this$0.getRtcTrack());
    }
}
