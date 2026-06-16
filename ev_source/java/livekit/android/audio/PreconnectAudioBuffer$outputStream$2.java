package io.livekit.android.audio;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/ByteArrayOutputStream;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PreconnectAudioBuffer$outputStream$2 extends n implements ho.a {
    public static final PreconnectAudioBuffer$outputStream$2 INSTANCE = new PreconnectAudioBuffer$outputStream$2();

    public PreconnectAudioBuffer$outputStream$2() {
        super(0);
    }

    @Override // ho.a
    public final ByteArrayOutputStream invoke() {
        return new ByteArrayOutputStream();
    }
}
