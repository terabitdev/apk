package io.livekit.android.room.datastream.incoming;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.SystemClock;
import as.l7;
import com.google.android.gms.internal.play_billing.b;
import com.google.protobuf.c6;
import et.d;
import ho.p;
import hr.n;
import io.livekit.android.room.datastream.ByteStreamInfo;
import io.livekit.android.room.datastream.StreamException;
import io.livekit.android.room.datastream.StreamInfo;
import io.livekit.android.room.datastream.TextStreamInfo;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$DataStream;
import livekit.f;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002;<B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\f2\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000fJ5\u0010%\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\f2\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0010j\u0002`$H\u0016¢\u0006\u0004\b%\u0010!J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000fJ*\u0010)\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0003RT\u00107\u001aB\u0012\f\u0012\n 4*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n 4*\u0004\u0018\u00010505 4* \u0012\f\u0012\n 4*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n 4*\u0004\u0018\u00010505\u0018\u000106038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R±\u0001\u00109\u001a\u009e\u0001\u0012\f\u0012\n 4*\u0004\u0018\u00010\f0\f\u0012:\u00128\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b 4*\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010j\u0004\u0018\u0001`\u001e0\u0010j\u0002`\u001e 4*N\u0012\f\u0012\n 4*\u0004\u0018\u00010\f0\f\u0012:\u00128\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b 4*\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010j\u0004\u0018\u0001`\u001e0\u0010j\u0002`\u001e\u0018\u000106038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R±\u0001\u0010:\u001a\u009e\u0001\u0012\f\u0012\n 4*\u0004\u0018\u00010\f0\f\u0012:\u00128\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b 4*\u001c\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010j\u0004\u0018\u0001`$0\u0010j\u0002`$ 4*N\u0012\f\u0012\n 4*\u0004\u0018\u00010\f0\f\u0012:\u00128\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b 4*\u001c\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010j\u0004\u0018\u0001`$0\u0010j\u0002`$\u0018\u000106038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl;", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;", "<init>", "()V", "Lio/livekit/android/room/datastream/StreamInfo;", ParameterNames.INFO, "Lio/livekit/android/room/participant/Participant$Identity;", "fromIdentity", "Lsn/z;", "openStream-Fe0n8cs", "(Lio/livekit/android/room/datastream/StreamInfo;Ljava/lang/String;)V", "openStream", "", "id", "closeStream", "(Ljava/lang/String;)V", "Lkotlin/Function2;", "Lhr/n;", "", "Lio/livekit/android/room/datastream/incoming/AnyStreamHandler;", "getHandlerForInfo", "(Lio/livekit/android/room/datastream/StreamInfo;)Lho/p;", "Llivekit/LivekitModels$DataStream$Header;", "header", "Las/l7;", "encryptionType", "streamInfoFromHeader", "(Llivekit/LivekitModels$DataStream$Header;Las/l7;)Lio/livekit/android/room/datastream/StreamInfo;", "topic", "Lio/livekit/android/room/datastream/incoming/TextStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/TextStreamHandler;", "handler", "registerTextStreamHandler", "(Ljava/lang/String;Lho/p;)V", "unregisterTextStreamHandler", "Lio/livekit/android/room/datastream/incoming/ByteStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/ByteStreamHandler;", "registerByteStreamHandler", "unregisterByteStreamHandler", "handleStreamHeader-qaitkU4", "(Llivekit/LivekitModels$DataStream$Header;Ljava/lang/String;Las/l7;)V", "handleStreamHeader", "Llivekit/LivekitModels$DataStream$Chunk;", "chunk", "handleDataChunk", "(Llivekit/LivekitModels$DataStream$Chunk;Las/l7;)V", "Llivekit/LivekitModels$DataStream$Trailer;", "trailer", "handleStreamTrailer", "(Llivekit/LivekitModels$DataStream$Trailer;Las/l7;)V", "clearOpenStreams", "", "kotlin.jvm.PlatformType", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl$Descriptor;", "", "openStreams", "Ljava/util/Map;", "textStreamHandlers", "byteStreamHandlers", "Companion", "Descriptor", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class IncomingDataStreamManagerImpl implements IncomingDataStreamManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Descriptor> openStreams = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, p> textStreamHandlers = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, p> byteStreamHandlers = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeStream(String id2) {
        Map<String, Descriptor> map = this.openStreams;
        map.getClass();
        synchronized (map) {
            Descriptor descriptor = this.openStreams.get(id2);
            if (descriptor == null) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.a(null, "Attempted to close stream " + id2 + ", but no descriptor was found.", new Object[0]);
                }
                return;
            }
            descriptor.getChannel().m(null);
            long elapsedRealtime = SystemClock.elapsedRealtime() - descriptor.getOpenTime();
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.a(null, "Closed stream " + id2 + ", (open for " + elapsedRealtime + "ms", new Object[0]);
            }
            this.openStreams.remove(id2);
        }
    }

    private final p getHandlerForInfo(StreamInfo info) {
        if (info instanceof ByteStreamInfo) {
            return new IncomingDataStreamManagerImpl$getHandlerForInfo$1(this.byteStreamHandlers.get(info.getTopic()), info);
        }
        if (info instanceof TextStreamInfo) {
            return new IncomingDataStreamManagerImpl$getHandlerForInfo$2(this.textStreamHandlers.get(info.getTopic()), info);
        }
        c6.p();
        return null;
    }

    /* renamed from: openStream-Fe0n8cs, reason: not valid java name */
    private final void m2553openStreamFe0n8cs(StreamInfo info, String fromIdentity) {
        if (this.openStreams.containsKey(info.getId())) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Stream already open for id " + info.getId(), new Object[0]);
                return;
            }
            return;
        }
        p handlerForInfo = getHandlerForInfo(info);
        n createChannelForStreamReceiver = INSTANCE.createChannelForStreamReceiver();
        Descriptor descriptor = new Descriptor(info, SystemClock.elapsedRealtime(), createChannelForStreamReceiver, 0L, 8, null);
        Map<String, Descriptor> map = this.openStreams;
        map.getClass();
        map.put(info.getId(), descriptor);
        createChannelForStreamReceiver.l(new IncomingDataStreamManagerImpl$openStream$2(this, info));
        LKLog.Companion companion2 = LKLog.INSTANCE;
        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.a(null, "Opened stream " + info.getId(), new Object[0]);
        }
        try {
            handlerForInfo.invoke(createChannelForStreamReceiver, Participant.Identity.m2604boximpl(fromIdentity));
        } catch (Exception e10) {
            LKLog.Companion companion3 = LKLog.INSTANCE;
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.b(e10, "Unhandled exception when invoking stream handler!", new Object[0]);
            }
        }
    }

    private final StreamInfo streamInfoFromHeader(LivekitModels$DataStream.Header header, l7 encryptionType) {
        int i10;
        try {
            f contentHeaderCase = header.getContentHeaderCase();
            if (contentHeaderCase == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[contentHeaderCase.ordinal()];
            }
            if (i10 != -1) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new RuntimeException();
                        }
                    } else {
                        LivekitModels$DataStream.ByteHeader byteHeader = header.getByteHeader();
                        byteHeader.getClass();
                        return new ByteStreamInfo(header, byteHeader, encryptionType);
                    }
                } else {
                    LivekitModels$DataStream.TextHeader textHeader = header.getTextHeader();
                    textHeader.getClass();
                    return new TextStreamInfo(header, textHeader, encryptionType);
                }
            }
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(null, "received header with non-set content header. streamId: " + header.getStreamId() + ", topic: " + header.getTopic(), new Object[0]);
                return null;
            }
        } catch (Exception e10) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.b(e10, "Exception when processing new stream header.", new Object[0]);
            }
        }
        return null;
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void clearOpenStreams() {
        Map<String, Descriptor> map = this.openStreams;
        map.getClass();
        synchronized (map) {
            try {
                Iterator it = o.g1(this.openStreams.values()).iterator();
                while (it.hasNext()) {
                    ((Descriptor) it.next()).getChannel().m(new StreamException.TerminatedException(null, 1, null));
                }
                this.openStreams.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void handleDataChunk(LivekitModels$DataStream.Chunk chunk, l7 encryptionType) {
        Descriptor descriptor;
        chunk.getClass();
        encryptionType.getClass();
        com.google.protobuf.p content = chunk.getContent();
        if (content == null || (descriptor = this.openStreams.get(chunk.getStreamId())) == null) {
            return;
        }
        if (encryptionType != descriptor.getStreamInfo().getEncryptionType()) {
            descriptor.getChannel().m(new StreamException.EncryptionTypeMismatch("Encryption type mismatch for stream " + chunk.getStreamId() + ". Expected " + descriptor.getStreamInfo().getEncryptionType() + ", got " + encryptionType));
        }
        long readLength = descriptor.getReadLength() + content.size();
        Long totalSize = descriptor.getStreamInfo().getTotalSize();
        if (totalSize != null && readLength > totalSize.longValue()) {
            descriptor.getChannel().m(new StreamException.LengthExceededException());
            return;
        }
        descriptor.setReadLength(readLength);
        n channel = descriptor.getChannel();
        byte[] m10 = content.m();
        m10.getClass();
        channel.d(m10);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    /* renamed from: handleStreamHeader-qaitkU4 */
    public void mo2539handleStreamHeaderqaitkU4(LivekitModels$DataStream.Header header, String fromIdentity, l7 encryptionType) {
        header.getClass();
        fromIdentity.getClass();
        encryptionType.getClass();
        StreamInfo streamInfoFromHeader = streamInfoFromHeader(header, encryptionType);
        if (streamInfoFromHeader == null) {
            return;
        }
        m2553openStreamFe0n8cs(streamInfoFromHeader, fromIdentity);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void handleStreamTrailer(LivekitModels$DataStream.Trailer trailer, l7 encryptionType) {
        trailer.getClass();
        encryptionType.getClass();
        Descriptor descriptor = this.openStreams.get(trailer.getStreamId());
        if (descriptor == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Received trailer for unknown stream: " + trailer.getStreamId(), new Object[0]);
                return;
            }
            return;
        }
        if (encryptionType != descriptor.getStreamInfo().getEncryptionType()) {
            descriptor.getChannel().m(new StreamException.EncryptionTypeMismatch("Encryption type mismatch for stream " + trailer.getStreamId() + ". Expected " + descriptor.getStreamInfo().getEncryptionType() + ", got " + encryptionType));
        }
        Long totalSize = descriptor.getStreamInfo().getTotalSize();
        if (totalSize != null && descriptor.getReadLength() != totalSize.longValue()) {
            descriptor.getChannel().m(new StreamException.IncompleteException());
            return;
        }
        String reason = trailer.getReason();
        if (reason != null && reason.length() != 0) {
            descriptor.getChannel().m(new StreamException.AbnormalEndException(reason));
        } else {
            descriptor.getChannel().m(null);
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void registerByteStreamHandler(String topic, p handler) {
        topic.getClass();
        handler.getClass();
        Map<String, p> map = this.byteStreamHandlers;
        map.getClass();
        synchronized (map) {
            if (!this.byteStreamHandlers.containsKey(topic)) {
                Map<String, p> map2 = this.byteStreamHandlers;
                map2.getClass();
                map2.put(topic, handler);
            } else {
                throw new IllegalArgumentException("A byte stream handler for topic " + topic + " has already been set.");
            }
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void registerTextStreamHandler(String topic, p handler) {
        topic.getClass();
        handler.getClass();
        Map<String, p> map = this.textStreamHandlers;
        map.getClass();
        synchronized (map) {
            if (!this.textStreamHandlers.containsKey(topic)) {
                Map<String, p> map2 = this.textStreamHandlers;
                map2.getClass();
                map2.put(topic, handler);
            } else {
                throw new IllegalArgumentException("A text stream handler for topic " + topic + " has already been set.");
            }
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void unregisterByteStreamHandler(String topic) {
        topic.getClass();
        Map<String, p> map = this.byteStreamHandlers;
        map.getClass();
        synchronized (map) {
            this.byteStreamHandlers.remove(topic);
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void unregisterTextStreamHandler(String topic) {
        topic.getClass();
        Map<String, p> map = this.textStreamHandlers;
        map.getClass();
        synchronized (map) {
            this.textStreamHandlers.remove(topic);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl$Companion;", "", "<init>", "()V", "Lhr/n;", "", "createChannelForStreamReceiver", "()Lhr/n;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final n createChannelForStreamReceiver() {
            return a.b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 4, hr.a.f12536a);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0011R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl$Descriptor;", "", "Lio/livekit/android/room/datastream/StreamInfo;", "streamInfo", "", "openTime", "Lhr/n;", "", "channel", "readLength", "<init>", "(Lio/livekit/android/room/datastream/StreamInfo;JLhr/n;J)V", "component1", "()Lio/livekit/android/room/datastream/StreamInfo;", "component2", "()J", "component3", "()Lhr/n;", "component4", "copy", "(Lio/livekit/android/room/datastream/StreamInfo;JLhr/n;J)Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl$Descriptor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/livekit/android/room/datastream/StreamInfo;", "getStreamInfo", "J", "getOpenTime", "Lhr/n;", "getChannel", "getReadLength", "setReadLength", "(J)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Descriptor {
        private final n channel;
        private final long openTime;
        private long readLength;
        private final StreamInfo streamInfo;

        public Descriptor(StreamInfo streamInfo, long j4, n nVar, long j10) {
            streamInfo.getClass();
            nVar.getClass();
            this.streamInfo = streamInfo;
            this.openTime = j4;
            this.channel = nVar;
            this.readLength = j10;
        }

        public static /* synthetic */ Descriptor copy$default(Descriptor descriptor, StreamInfo streamInfo, long j4, n nVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                streamInfo = descriptor.streamInfo;
            }
            if ((i10 & 2) != 0) {
                j4 = descriptor.openTime;
            }
            if ((i10 & 4) != 0) {
                nVar = descriptor.channel;
            }
            if ((i10 & 8) != 0) {
                j10 = descriptor.readLength;
            }
            n nVar2 = nVar;
            return descriptor.copy(streamInfo, j4, nVar2, j10);
        }

        /* renamed from: component1, reason: from getter */
        public final StreamInfo getStreamInfo() {
            return this.streamInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final long getOpenTime() {
            return this.openTime;
        }

        /* renamed from: component3, reason: from getter */
        public final n getChannel() {
            return this.channel;
        }

        /* renamed from: component4, reason: from getter */
        public final long getReadLength() {
            return this.readLength;
        }

        public final Descriptor copy(StreamInfo streamInfo, long openTime, n channel, long readLength) {
            streamInfo.getClass();
            channel.getClass();
            return new Descriptor(streamInfo, openTime, channel, readLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Descriptor)) {
                return false;
            }
            Descriptor descriptor = (Descriptor) other;
            if (m.c(this.streamInfo, descriptor.streamInfo) && this.openTime == descriptor.openTime && m.c(this.channel, descriptor.channel) && this.readLength == descriptor.readLength) {
                return true;
            }
            return false;
        }

        public final n getChannel() {
            return this.channel;
        }

        public final long getOpenTime() {
            return this.openTime;
        }

        public final long getReadLength() {
            return this.readLength;
        }

        public final StreamInfo getStreamInfo() {
            return this.streamInfo;
        }

        public int hashCode() {
            return Long.hashCode(this.readLength) + ((this.channel.hashCode() + b.g(this.openTime, this.streamInfo.hashCode() * 31, 31)) * 31);
        }

        public final void setReadLength(long j4) {
            this.readLength = j4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Descriptor(streamInfo=");
            sb.append(this.streamInfo);
            sb.append(", openTime=");
            sb.append(this.openTime);
            sb.append(", channel=");
            sb.append(this.channel);
            sb.append(", readLength=");
            return b.m(sb, this.readLength, ')');
        }

        public /* synthetic */ Descriptor(StreamInfo streamInfo, long j4, n nVar, long j10, int i10, kotlin.jvm.internal.f fVar) {
            this(streamInfo, j4, nVar, (i10 & 8) != 0 ? 0L : j10);
        }
    }
}
