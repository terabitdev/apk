package io.livekit.android.room.datastream.incoming;

import as.l7;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$DataStream;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u000fH&¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\rJ*\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H&¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;", "", "", "topic", "Lkotlin/Function2;", "Lio/livekit/android/room/datastream/incoming/TextStreamReceiver;", "Lio/livekit/android/room/participant/Participant$Identity;", "Lsn/z;", "Lio/livekit/android/room/datastream/incoming/TextStreamHandler;", "handler", "registerTextStreamHandler", "(Ljava/lang/String;Lho/p;)V", "unregisterTextStreamHandler", "(Ljava/lang/String;)V", "Lio/livekit/android/room/datastream/incoming/ByteStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/ByteStreamHandler;", "registerByteStreamHandler", "unregisterByteStreamHandler", "Llivekit/LivekitModels$DataStream$Header;", "header", "fromIdentity", "Las/l7;", "encryptionType", "handleStreamHeader-qaitkU4", "(Llivekit/LivekitModels$DataStream$Header;Ljava/lang/String;Las/l7;)V", "handleStreamHeader", "Llivekit/LivekitModels$DataStream$Chunk;", "chunk", "handleDataChunk", "(Llivekit/LivekitModels$DataStream$Chunk;Las/l7;)V", "Llivekit/LivekitModels$DataStream$Trailer;", "trailer", "handleStreamTrailer", "(Llivekit/LivekitModels$DataStream$Trailer;Las/l7;)V", "clearOpenStreams", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface IncomingDataStreamManager {
    void clearOpenStreams();

    void handleDataChunk(LivekitModels$DataStream.Chunk chunk, l7 encryptionType);

    /* renamed from: handleStreamHeader-qaitkU4 */
    void mo2539handleStreamHeaderqaitkU4(LivekitModels$DataStream.Header header, String fromIdentity, l7 encryptionType);

    void handleStreamTrailer(LivekitModels$DataStream.Trailer trailer, l7 encryptionType);

    void registerByteStreamHandler(String topic, p handler);

    void registerTextStreamHandler(String topic, p handler);

    void unregisterByteStreamHandler(String topic);

    void unregisterTextStreamHandler(String topic);
}
