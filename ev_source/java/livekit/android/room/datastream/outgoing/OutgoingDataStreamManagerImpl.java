package io.livekit.android.room.datastream.outgoing;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import as.c7;
import as.l7;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import com.google.protobuf.o;
import defpackage.f;
import et.d;
import ho.p;
import io.livekit.android.e2ee.E2EEManager;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.datastream.ByteStreamInfo;
import io.livekit.android.room.datastream.StreamBytesOptions;
import io.livekit.android.room.datastream.StreamException;
import io.livekit.android.room.datastream.StreamInfo;
import io.livekit.android.room.datastream.StreamTextOptions;
import io.livekit.android.room.datastream.TextStreamInfo;
import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$DataStream;
import livekit.b;
import livekit.e;
import livekit.g;
import livekit.i;
import p.n;
import sn.l;
import sn.m;
import sn.z;
import tn.t;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002,-B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%RT\u0010*\u001aB\u0012\f\u0012\n '*\u0004\u0018\u00010\u00100\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010(0( '* \u0012\f\u0012\n '*\u0004\u0018\u00010\u00100\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010(0(\u0018\u00010)0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManagerImpl;", "Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManager;", "Lio/livekit/android/room/RTCEngine;", "engine", "<init>", "(Lio/livekit/android/room/RTCEngine;)V", "Lio/livekit/android/room/datastream/StreamInfo;", ParameterNames.INFO, "", "Lio/livekit/android/room/participant/Participant$Identity;", "destinationIdentities", "Lsn/m;", "Lsn/z;", "openStream-0E7RQCE", "(Lio/livekit/android/room/datastream/StreamInfo;Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "openStream", "", "streamId", "", "dataChunk", "sendChunk-0E7RQCE", "(Ljava/lang/String;[BLwn/c;)Ljava/lang/Object;", "sendChunk", "reason", "closeStream", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/datastream/StreamTextOptions;", "options", "Lio/livekit/android/room/datastream/outgoing/TextStreamSender;", "streamText", "(Lio/livekit/android/room/datastream/StreamTextOptions;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/datastream/StreamBytesOptions;", "Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;", "streamBytes", "(Lio/livekit/android/room/datastream/StreamBytesOptions;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/RTCEngine;", "getEngine", "()Lio/livekit/android/room/RTCEngine;", "", "kotlin.jvm.PlatformType", "Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManagerImpl$Descriptor;", "", "openStreams", "Ljava/util/Map;", "Descriptor", "ManagerStreamDestination", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OutgoingDataStreamManagerImpl implements OutgoingDataStreamManager {
    private final RTCEngine engine;
    private final Map<String, Descriptor> openStreams;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0007\u001a\u00028\u00002(\u0010\r\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bj\b\u0012\u0004\u0012\u00028\u0000`\fH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManagerImpl$ManagerStreamDestination;", TokenNames.T, "Lio/livekit/android/room/datastream/outgoing/StreamDestination;", "", "streamId", "<init>", "(Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManagerImpl;Ljava/lang/String;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function2;", "", "", "", "Lio/livekit/android/room/datastream/outgoing/DataChunker;", "chunker", "Lsn/m;", "Lsn/z;", "write-0E7RQCE", "(Ljava/lang/Object;Lho/p;Lwn/c;)Ljava/lang/Object;", "write", "reason", "close", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Ljava/lang/String;", "getStreamId", "()Ljava/lang/String;", "", "isOpen", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public final class ManagerStreamDestination<T> implements StreamDestination<T> {
        private final String streamId;
        final /* synthetic */ OutgoingDataStreamManagerImpl this$0;

        public ManagerStreamDestination(OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl, String str) {
            str.getClass();
            this.this$0 = outgoingDataStreamManagerImpl;
            this.streamId = str;
        }

        @Override // io.livekit.android.room.datastream.outgoing.StreamDestination
        public Object close(String str, c<? super z> cVar) {
            Object closeStream = this.this$0.closeStream(this.streamId, str, cVar);
            if (closeStream == a.f37986a) {
                return closeStream;
            }
            return z.f31622a;
        }

        public final String getStreamId() {
            return this.streamId;
        }

        @Override // io.livekit.android.room.datastream.outgoing.StreamDestination
        public boolean isOpen() {
            Map map = this.this$0.openStreams;
            map.getClass();
            return map.containsKey(this.streamId);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007c -> B:10:0x007f). Please report as a decompilation issue!!! */
        @Override // io.livekit.android.room.datastream.outgoing.StreamDestination
        /* renamed from: write-0E7RQCE, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo2570write0E7RQCE(T t10, p pVar, c<? super m> cVar) {
            OutgoingDataStreamManagerImpl$ManagerStreamDestination$write$1 outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1;
            int i10;
            Iterator it;
            ManagerStreamDestination<T> managerStreamDestination;
            if (cVar instanceof OutgoingDataStreamManagerImpl$ManagerStreamDestination$write$1) {
                outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1 = (OutgoingDataStreamManagerImpl$ManagerStreamDestination$write$1) cVar;
                int i11 = outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.result;
                    i10 = outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            it = (Iterator) outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.L$1;
                            managerStreamDestination = (ManagerStreamDestination) outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.L$0;
                            sn.a.g(obj);
                            Object m2569sendChunk0E7RQCE = ((m) obj).f31603a;
                            if (m2569sendChunk0E7RQCE instanceof l) {
                                return m2569sendChunk0E7RQCE;
                            }
                            if (it.hasNext()) {
                                byte[] bArr = (byte[]) it.next();
                                OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl = managerStreamDestination.this$0;
                                String str = managerStreamDestination.streamId;
                                outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.L$0 = managerStreamDestination;
                                outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.L$1 = it;
                                outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.label = 1;
                                m2569sendChunk0E7RQCE = outgoingDataStreamManagerImpl.m2569sendChunk0E7RQCE(str, bArr, outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1);
                                a aVar = a.f37986a;
                                if (m2569sendChunk0E7RQCE == aVar) {
                                    return aVar;
                                }
                                if (m2569sendChunk0E7RQCE instanceof l) {
                                }
                                if (it.hasNext()) {
                                    return z.f31622a;
                                }
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        if (!isOpen()) {
                            return new l(new StreamException.TerminatedException("Stream is closed!"));
                        }
                        it = ((List) pVar.invoke(t10, new Integer(RTCEngine.MAX_DATA_PACKET_SIZE))).iterator();
                        managerStreamDestination = this;
                        if (it.hasNext()) {
                        }
                    }
                }
            }
            outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1 = new OutgoingDataStreamManagerImpl$ManagerStreamDestination$write$1(this, cVar);
            Object obj2 = outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.result;
            i10 = outgoingDataStreamManagerImpl$ManagerStreamDestination$write$1.label;
            if (i10 == 0) {
            }
        }
    }

    public OutgoingDataStreamManagerImpl(RTCEngine rTCEngine) {
        rTCEngine.getClass();
        this.engine = rTCEngine;
        this.openStreams = Collections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object closeStream(String str, String str2, c<? super z> cVar) {
        OutgoingDataStreamManagerImpl$closeStream$1 outgoingDataStreamManagerImpl$closeStream$1;
        int i10;
        a aVar;
        String str3;
        LivekitModels$DataPacket livekitModels$DataPacket;
        OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl;
        Object m2529sendDatagIAlus$livekit_android_sdk_release;
        String str4;
        OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl2;
        if (cVar instanceof OutgoingDataStreamManagerImpl$closeStream$1) {
            outgoingDataStreamManagerImpl$closeStream$1 = (OutgoingDataStreamManagerImpl$closeStream$1) cVar;
            int i11 = outgoingDataStreamManagerImpl$closeStream$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                outgoingDataStreamManagerImpl$closeStream$1.label = i11 - Integer.MIN_VALUE;
                Object obj = outgoingDataStreamManagerImpl$closeStream$1.result;
                i10 = outgoingDataStreamManagerImpl$closeStream$1.label;
                aVar = a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            str4 = (String) outgoingDataStreamManagerImpl$closeStream$1.L$1;
                            outgoingDataStreamManagerImpl2 = (OutgoingDataStreamManagerImpl) outgoingDataStreamManagerImpl$closeStream$1.L$0;
                            sn.a.g(obj);
                            m2529sendDatagIAlus$livekit_android_sdk_release = ((m) obj).f31603a;
                            if (m2529sendDatagIAlus$livekit_android_sdk_release instanceof l) {
                                LKLog.Companion companion = LKLog.INSTANCE;
                                Throwable a10 = m.a(m2529sendDatagIAlus$livekit_android_sdk_release);
                                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                    d.f(a10, "Error when closing stream!", new Object[0]);
                                }
                            }
                            outgoingDataStreamManagerImpl2.openStreams.remove(str4);
                            LKLog.Companion companion2 = LKLog.INSTANCE;
                            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                d.a(null, f.i("Closed send stream ", str4), new Object[0]);
                            }
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    livekitModels$DataPacket = (LivekitModels$DataPacket) outgoingDataStreamManagerImpl$closeStream$1.L$2;
                    str3 = (String) outgoingDataStreamManagerImpl$closeStream$1.L$1;
                    outgoingDataStreamManagerImpl = (OutgoingDataStreamManagerImpl) outgoingDataStreamManagerImpl$closeStream$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    Descriptor descriptor = this.openStreams.get(str);
                    if (descriptor != null) {
                        livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                        newBuilder.b(descriptor.getDestinationIdentityStrings());
                        c7 c7Var = c7.RELIABLE;
                        newBuilder.f(c7Var);
                        i newBuilder2 = LivekitModels$DataStream.Trailer.newBuilder();
                        newBuilder2.c(str);
                        if (str2 != null) {
                            newBuilder2.b(str2);
                        }
                        newBuilder.o((LivekitModels$DataStream.Trailer) newBuilder2.build());
                        LivekitModels$DataPacket livekitModels$DataPacket2 = (LivekitModels$DataPacket) newBuilder.build();
                        RTCEngine rTCEngine = this.engine;
                        outgoingDataStreamManagerImpl$closeStream$1.L$0 = this;
                        outgoingDataStreamManagerImpl$closeStream$1.L$1 = str;
                        outgoingDataStreamManagerImpl$closeStream$1.L$2 = livekitModels$DataPacket2;
                        outgoingDataStreamManagerImpl$closeStream$1.label = 1;
                        if (rTCEngine.waitForBufferStatusLow$livekit_android_sdk_release(c7Var, outgoingDataStreamManagerImpl$closeStream$1) != aVar) {
                            str3 = str;
                            livekitModels$DataPacket = livekitModels$DataPacket2;
                            outgoingDataStreamManagerImpl = this;
                        }
                        return aVar;
                    }
                    throw new StreamException.UnknownStreamException();
                }
                RTCEngine rTCEngine2 = outgoingDataStreamManagerImpl.engine;
                livekitModels$DataPacket.getClass();
                outgoingDataStreamManagerImpl$closeStream$1.L$0 = outgoingDataStreamManagerImpl;
                outgoingDataStreamManagerImpl$closeStream$1.L$1 = str3;
                outgoingDataStreamManagerImpl$closeStream$1.L$2 = null;
                outgoingDataStreamManagerImpl$closeStream$1.label = 2;
                m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine2.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, outgoingDataStreamManagerImpl$closeStream$1);
                if (m2529sendDatagIAlus$livekit_android_sdk_release != aVar) {
                    str4 = str3;
                    outgoingDataStreamManagerImpl2 = outgoingDataStreamManagerImpl;
                    if (m2529sendDatagIAlus$livekit_android_sdk_release instanceof l) {
                    }
                    outgoingDataStreamManagerImpl2.openStreams.remove(str4);
                    LKLog.Companion companion22 = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                        d.a(null, f.i("Closed send stream ", str4), new Object[0]);
                    }
                    return z.f31622a;
                }
                return aVar;
            }
        }
        outgoingDataStreamManagerImpl$closeStream$1 = new OutgoingDataStreamManagerImpl$closeStream$1(this, cVar);
        Object obj2 = outgoingDataStreamManagerImpl$closeStream$1.result;
        i10 = outgoingDataStreamManagerImpl$closeStream$1.label;
        aVar = a.f37986a;
        if (i10 == 0) {
        }
        RTCEngine rTCEngine22 = outgoingDataStreamManagerImpl.engine;
        livekitModels$DataPacket.getClass();
        outgoingDataStreamManagerImpl$closeStream$1.L$0 = outgoingDataStreamManagerImpl;
        outgoingDataStreamManagerImpl$closeStream$1.L$1 = str3;
        outgoingDataStreamManagerImpl$closeStream$1.L$2 = null;
        outgoingDataStreamManagerImpl$closeStream$1.label = 2;
        m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine22.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, outgoingDataStreamManagerImpl$closeStream$1);
        if (m2529sendDatagIAlus$livekit_android_sdk_release != aVar) {
        }
        return aVar;
    }

    public static /* synthetic */ Object closeStream$default(OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl, String str, String str2, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return outgoingDataStreamManagerImpl.closeStream(str, str2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* renamed from: openStream-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2567openStream0E7RQCE(StreamInfo streamInfo, List<Participant.Identity> list, c<? super m> cVar) {
        OutgoingDataStreamManagerImpl$openStream$1 outgoingDataStreamManagerImpl$openStream$1;
        int i10;
        OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl;
        StreamInfo streamInfo2;
        ArrayList arrayList;
        Object obj;
        if (cVar instanceof OutgoingDataStreamManagerImpl$openStream$1) {
            outgoingDataStreamManagerImpl$openStream$1 = (OutgoingDataStreamManagerImpl$openStream$1) cVar;
            int i11 = outgoingDataStreamManagerImpl$openStream$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                outgoingDataStreamManagerImpl$openStream$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = outgoingDataStreamManagerImpl$openStream$1.result;
                i10 = outgoingDataStreamManagerImpl$openStream$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ?? r12 = (List) outgoingDataStreamManagerImpl$openStream$1.L$2;
                        StreamInfo streamInfo3 = (StreamInfo) outgoingDataStreamManagerImpl$openStream$1.L$1;
                        outgoingDataStreamManagerImpl = (OutgoingDataStreamManagerImpl) outgoingDataStreamManagerImpl$openStream$1.L$0;
                        sn.a.g(obj2);
                        obj = ((m) obj2).f31603a;
                        arrayList = r12;
                        streamInfo2 = streamInfo3;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj2);
                    if (!this.openStreams.containsKey(streamInfo.getId())) {
                        ArrayList arrayList2 = new ArrayList(tn.p.a0(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Participant.Identity) it.next()).m2610unboximpl());
                        }
                        livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                        newBuilder.b(arrayList2);
                        newBuilder.f(c7.RELIABLE);
                        e newBuilder2 = LivekitModels$DataStream.Header.newBuilder();
                        newBuilder2.e(streamInfo.getId());
                        newBuilder2.h(streamInfo.getTopic());
                        newBuilder2.g(streamInfo.getTimestampMs());
                        newBuilder2.b(streamInfo.getAttributes());
                        Long totalSize = streamInfo.getTotalSize();
                        if (totalSize != null) {
                            newBuilder2.i(totalSize.longValue());
                        }
                        if (streamInfo instanceof ByteStreamInfo) {
                            newBuilder2.d(((ByteStreamInfo) streamInfo).getMimeType());
                            b newBuilder3 = LivekitModels$DataStream.ByteHeader.newBuilder();
                            newBuilder3.b(newBuilder3.getName());
                            newBuilder2.c((LivekitModels$DataStream.ByteHeader) newBuilder3.build());
                        } else if (streamInfo instanceof TextStreamInfo) {
                            g newBuilder4 = LivekitModels$DataStream.TextHeader.newBuilder();
                            TextStreamInfo textStreamInfo = (TextStreamInfo) streamInfo;
                            newBuilder4.d(textStreamInfo.getOperationType().toProto());
                            newBuilder4.f(textStreamInfo.getVersion());
                            if (textStreamInfo.getReplyToStreamId() != null) {
                                newBuilder4.e(textStreamInfo.getReplyToStreamId());
                            }
                            newBuilder4.b(textStreamInfo.getAttachedStreamIds());
                            newBuilder4.c(textStreamInfo.getGenerated());
                            newBuilder2.f((LivekitModels$DataStream.TextHeader) newBuilder4.build());
                        }
                        newBuilder.n((LivekitModels$DataStream.Header) newBuilder2.build());
                        LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder.build();
                        RTCEngine rTCEngine = this.engine;
                        livekitModels$DataPacket.getClass();
                        outgoingDataStreamManagerImpl$openStream$1.L$0 = this;
                        outgoingDataStreamManagerImpl$openStream$1.L$1 = streamInfo;
                        outgoingDataStreamManagerImpl$openStream$1.L$2 = arrayList2;
                        outgoingDataStreamManagerImpl$openStream$1.label = 1;
                        Object m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, outgoingDataStreamManagerImpl$openStream$1);
                        a aVar = a.f37986a;
                        if (m2529sendDatagIAlus$livekit_android_sdk_release == aVar) {
                            return aVar;
                        }
                        outgoingDataStreamManagerImpl = this;
                        streamInfo2 = streamInfo;
                        arrayList = arrayList2;
                        obj = m2529sendDatagIAlus$livekit_android_sdk_release;
                    } else {
                        throw new StreamException.AlreadyOpenedException();
                    }
                }
                if (!(obj instanceof l)) {
                    return obj;
                }
                Descriptor descriptor = new Descriptor(streamInfo2, arrayList, 0L, null, 12, null);
                Map<String, Descriptor> map = outgoingDataStreamManagerImpl.openStreams;
                map.getClass();
                map.put(streamInfo2.getId(), descriptor);
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.a(null, "Opened send stream " + streamInfo2.getId(), new Object[0]);
                }
                return z.f31622a;
            }
        }
        outgoingDataStreamManagerImpl$openStream$1 = new OutgoingDataStreamManagerImpl$openStream$1(this, cVar);
        Object obj22 = outgoingDataStreamManagerImpl$openStream$1.result;
        i10 = outgoingDataStreamManagerImpl$openStream$1.label;
        if (i10 == 0) {
        }
        if (!(obj instanceof l)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: openStream-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m2568openStream0E7RQCE$default(OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl, StreamInfo streamInfo, List list, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = t.f33547a;
        }
        return outgoingDataStreamManagerImpl.m2567openStream0E7RQCE(streamInfo, list, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: sendChunk-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2569sendChunk0E7RQCE(String str, byte[] bArr, c<? super m> cVar) {
        OutgoingDataStreamManagerImpl$sendChunk$1 outgoingDataStreamManagerImpl$sendChunk$1;
        int i10;
        a aVar;
        LivekitModels$DataPacket livekitModels$DataPacket;
        OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl;
        Object m2529sendDatagIAlus$livekit_android_sdk_release;
        if (cVar instanceof OutgoingDataStreamManagerImpl$sendChunk$1) {
            outgoingDataStreamManagerImpl$sendChunk$1 = (OutgoingDataStreamManagerImpl$sendChunk$1) cVar;
            int i11 = outgoingDataStreamManagerImpl$sendChunk$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                outgoingDataStreamManagerImpl$sendChunk$1.label = i11 - Integer.MIN_VALUE;
                Object obj = outgoingDataStreamManagerImpl$sendChunk$1.result;
                i10 = outgoingDataStreamManagerImpl$sendChunk$1.label;
                aVar = a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return ((m) obj).f31603a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    livekitModels$DataPacket = (LivekitModels$DataPacket) outgoingDataStreamManagerImpl$sendChunk$1.L$1;
                    outgoingDataStreamManagerImpl = (OutgoingDataStreamManagerImpl) outgoingDataStreamManagerImpl$sendChunk$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    Descriptor descriptor = this.openStreams.get(str);
                    if (descriptor != null) {
                        long andIncrement = descriptor.getNextChunkIndex().getAndIncrement();
                        livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                        newBuilder.b(descriptor.getDestinationIdentityStrings());
                        c7 c7Var = c7.RELIABLE;
                        newBuilder.f(c7Var);
                        livekit.c newBuilder2 = LivekitModels$DataStream.Chunk.newBuilder();
                        newBuilder2.d(str);
                        o oVar = com.google.protobuf.p.f7115b;
                        newBuilder2.c(com.google.protobuf.p.d(bArr, 0, bArr.length));
                        newBuilder2.b(andIncrement);
                        newBuilder.m((LivekitModels$DataStream.Chunk) newBuilder2.build());
                        livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder.build();
                        RTCEngine rTCEngine = this.engine;
                        outgoingDataStreamManagerImpl$sendChunk$1.L$0 = this;
                        outgoingDataStreamManagerImpl$sendChunk$1.L$1 = livekitModels$DataPacket;
                        outgoingDataStreamManagerImpl$sendChunk$1.label = 1;
                        if (rTCEngine.waitForBufferStatusLow$livekit_android_sdk_release(c7Var, outgoingDataStreamManagerImpl$sendChunk$1) != aVar) {
                            outgoingDataStreamManagerImpl = this;
                        }
                        return aVar;
                    }
                    throw new StreamException.UnknownStreamException();
                }
                RTCEngine rTCEngine2 = outgoingDataStreamManagerImpl.engine;
                livekitModels$DataPacket.getClass();
                outgoingDataStreamManagerImpl$sendChunk$1.L$0 = null;
                outgoingDataStreamManagerImpl$sendChunk$1.L$1 = null;
                outgoingDataStreamManagerImpl$sendChunk$1.label = 2;
                m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine2.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, outgoingDataStreamManagerImpl$sendChunk$1);
                if (m2529sendDatagIAlus$livekit_android_sdk_release != aVar) {
                    return aVar;
                }
                return m2529sendDatagIAlus$livekit_android_sdk_release;
            }
        }
        outgoingDataStreamManagerImpl$sendChunk$1 = new OutgoingDataStreamManagerImpl$sendChunk$1(this, cVar);
        Object obj2 = outgoingDataStreamManagerImpl$sendChunk$1.result;
        i10 = outgoingDataStreamManagerImpl$sendChunk$1.label;
        aVar = a.f37986a;
        if (i10 == 0) {
        }
        RTCEngine rTCEngine22 = outgoingDataStreamManagerImpl.engine;
        livekitModels$DataPacket.getClass();
        outgoingDataStreamManagerImpl$sendChunk$1.L$0 = null;
        outgoingDataStreamManagerImpl$sendChunk$1.L$1 = null;
        outgoingDataStreamManagerImpl$sendChunk$1.label = 2;
        m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine22.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, outgoingDataStreamManagerImpl$sendChunk$1);
        if (m2529sendDatagIAlus$livekit_android_sdk_release != aVar) {
        }
    }

    public final RTCEngine getEngine() {
        return this.engine;
    }

    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    /* renamed from: sendFile-0E7RQCE */
    public Object mo2559sendFile0E7RQCE(File file, StreamBytesOptions streamBytesOptions, c<? super m> cVar) {
        return OutgoingDataStreamManager.DefaultImpls.m2561sendFile0E7RQCE(this, file, streamBytesOptions, cVar);
    }

    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    /* renamed from: sendText-0E7RQCE */
    public Object mo2560sendText0E7RQCE(String str, StreamTextOptions streamTextOptions, c<? super m> cVar) {
        return OutgoingDataStreamManager.DefaultImpls.m2563sendText0E7RQCE(this, str, streamTextOptions, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object streamBytes(StreamBytesOptions streamBytesOptions, c<? super ByteStreamSender> cVar) {
        OutgoingDataStreamManagerImpl$streamBytes$1 outgoingDataStreamManagerImpl$streamBytes$1;
        int i10;
        boolean z6;
        l7 l7Var;
        Object obj;
        String str;
        OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl;
        ByteStreamInfo byteStreamInfo;
        if (cVar instanceof OutgoingDataStreamManagerImpl$streamBytes$1) {
            outgoingDataStreamManagerImpl$streamBytes$1 = (OutgoingDataStreamManagerImpl$streamBytes$1) cVar;
            int i11 = outgoingDataStreamManagerImpl$streamBytes$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                outgoingDataStreamManagerImpl$streamBytes$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = outgoingDataStreamManagerImpl$streamBytes$1.result;
                i10 = outgoingDataStreamManagerImpl$streamBytes$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = (String) outgoingDataStreamManagerImpl$streamBytes$1.L$2;
                        byteStreamInfo = (ByteStreamInfo) outgoingDataStreamManagerImpl$streamBytes$1.L$1;
                        outgoingDataStreamManagerImpl = (OutgoingDataStreamManagerImpl) outgoingDataStreamManagerImpl$streamBytes$1.L$0;
                        sn.a.g(obj2);
                        obj = ((m) obj2).f31603a;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj2);
                    String streamId = streamBytesOptions.getStreamId();
                    String topic = streamBytesOptions.getTopic();
                    long time = new Date().getTime();
                    Long totalSize = streamBytesOptions.getTotalSize();
                    Map<String, String> attributes = streamBytesOptions.getAttributes();
                    String mimeType = streamBytesOptions.getMimeType();
                    String name = streamBytesOptions.getName();
                    E2EEManager e2EEManager = this.engine.getE2EEManager();
                    if (e2EEManager != null) {
                        z6 = e2EEManager.isDataChannelEncryptionEnabled();
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        l7Var = l7.GCM;
                    } else {
                        l7Var = l7.NONE;
                    }
                    ByteStreamInfo byteStreamInfo2 = new ByteStreamInfo(streamId, topic, time, totalSize, attributes, mimeType, name, l7Var);
                    String streamId2 = streamBytesOptions.getStreamId();
                    List<Participant.Identity> destinationIdentities = streamBytesOptions.getDestinationIdentities();
                    outgoingDataStreamManagerImpl$streamBytes$1.L$0 = this;
                    outgoingDataStreamManagerImpl$streamBytes$1.L$1 = byteStreamInfo2;
                    outgoingDataStreamManagerImpl$streamBytes$1.L$2 = streamId2;
                    outgoingDataStreamManagerImpl$streamBytes$1.label = 1;
                    Object m2567openStream0E7RQCE = m2567openStream0E7RQCE(byteStreamInfo2, destinationIdentities, outgoingDataStreamManagerImpl$streamBytes$1);
                    a aVar = a.f37986a;
                    if (m2567openStream0E7RQCE == aVar) {
                        return aVar;
                    }
                    obj = m2567openStream0E7RQCE;
                    str = streamId2;
                    outgoingDataStreamManagerImpl = this;
                    byteStreamInfo = byteStreamInfo2;
                }
                if (!(obj instanceof l)) {
                    Throwable a10 = m.a(obj);
                    if (a10 == null) {
                        throw new StreamException.TerminatedException("Unknown failure when opening the stream!");
                    }
                    throw a10;
                }
                return new ByteStreamSender(byteStreamInfo, new ManagerStreamDestination(outgoingDataStreamManagerImpl, str));
            }
        }
        outgoingDataStreamManagerImpl$streamBytes$1 = new OutgoingDataStreamManagerImpl$streamBytes$1(this, cVar);
        Object obj22 = outgoingDataStreamManagerImpl$streamBytes$1.result;
        i10 = outgoingDataStreamManagerImpl$streamBytes$1.label;
        if (i10 == 0) {
        }
        if (!(obj instanceof l)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object streamText(StreamTextOptions streamTextOptions, c<? super TextStreamSender> cVar) {
        OutgoingDataStreamManagerImpl$streamText$1 outgoingDataStreamManagerImpl$streamText$1;
        int i10;
        boolean z6;
        l7 l7Var;
        String streamId;
        Object m2567openStream0E7RQCE;
        OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl;
        TextStreamInfo textStreamInfo;
        if (cVar instanceof OutgoingDataStreamManagerImpl$streamText$1) {
            outgoingDataStreamManagerImpl$streamText$1 = (OutgoingDataStreamManagerImpl$streamText$1) cVar;
            int i11 = outgoingDataStreamManagerImpl$streamText$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                outgoingDataStreamManagerImpl$streamText$1.label = i11 - Integer.MIN_VALUE;
                Object obj = outgoingDataStreamManagerImpl$streamText$1.result;
                i10 = outgoingDataStreamManagerImpl$streamText$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        streamId = (String) outgoingDataStreamManagerImpl$streamText$1.L$2;
                        textStreamInfo = (TextStreamInfo) outgoingDataStreamManagerImpl$streamText$1.L$1;
                        outgoingDataStreamManagerImpl = (OutgoingDataStreamManagerImpl) outgoingDataStreamManagerImpl$streamText$1.L$0;
                        sn.a.g(obj);
                        m2567openStream0E7RQCE = ((m) obj).f31603a;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    String streamId2 = streamTextOptions.getStreamId();
                    String topic = streamTextOptions.getTopic();
                    long time = new Date().getTime();
                    Long totalSize = streamTextOptions.getTotalSize();
                    Map<String, String> attributes = streamTextOptions.getAttributes();
                    TextStreamInfo.OperationType operationType = streamTextOptions.getOperationType();
                    int version = streamTextOptions.getVersion();
                    String replyToStreamId = streamTextOptions.getReplyToStreamId();
                    List<String> attachedStreamIds = streamTextOptions.getAttachedStreamIds();
                    E2EEManager e2EEManager = this.engine.getE2EEManager();
                    if (e2EEManager != null) {
                        z6 = e2EEManager.isDataChannelEncryptionEnabled();
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        l7Var = l7.GCM;
                    } else {
                        l7Var = l7.NONE;
                    }
                    TextStreamInfo textStreamInfo2 = new TextStreamInfo(streamId2, topic, time, totalSize, attributes, operationType, version, replyToStreamId, attachedStreamIds, false, l7Var);
                    streamId = streamTextOptions.getStreamId();
                    List<Participant.Identity> destinationIdentities = streamTextOptions.getDestinationIdentities();
                    outgoingDataStreamManagerImpl$streamText$1.L$0 = this;
                    outgoingDataStreamManagerImpl$streamText$1.L$1 = textStreamInfo2;
                    outgoingDataStreamManagerImpl$streamText$1.L$2 = streamId;
                    outgoingDataStreamManagerImpl$streamText$1.label = 1;
                    m2567openStream0E7RQCE = m2567openStream0E7RQCE(textStreamInfo2, destinationIdentities, outgoingDataStreamManagerImpl$streamText$1);
                    a aVar = a.f37986a;
                    if (m2567openStream0E7RQCE == aVar) {
                        return aVar;
                    }
                    outgoingDataStreamManagerImpl = this;
                    textStreamInfo = textStreamInfo2;
                }
                if (!(m2567openStream0E7RQCE instanceof l)) {
                    Throwable a10 = m.a(m2567openStream0E7RQCE);
                    if (a10 == null) {
                        throw new StreamException.TerminatedException("Unknown failure when opening the stream!");
                    }
                    throw a10;
                }
                return new TextStreamSender(textStreamInfo, new ManagerStreamDestination(outgoingDataStreamManagerImpl, streamId));
            }
        }
        outgoingDataStreamManagerImpl$streamText$1 = new OutgoingDataStreamManagerImpl$streamText$1(this, cVar);
        Object obj2 = outgoingDataStreamManagerImpl$streamText$1.result;
        i10 = outgoingDataStreamManagerImpl$streamText$1.label;
        if (i10 == 0) {
        }
        if (!(m2567openStream0E7RQCE instanceof l)) {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManagerImpl$Descriptor;", "", ParameterNames.INFO, "Lio/livekit/android/room/datastream/StreamInfo;", "destinationIdentityStrings", "", "", "writtenLength", "", "nextChunkIndex", "Ljava/util/concurrent/atomic/AtomicLong;", "(Lio/livekit/android/room/datastream/StreamInfo;Ljava/util/List;JLjava/util/concurrent/atomic/AtomicLong;)V", "getDestinationIdentityStrings", "()Ljava/util/List;", "getInfo", "()Lio/livekit/android/room/datastream/StreamInfo;", "getNextChunkIndex", "()Ljava/util/concurrent/atomic/AtomicLong;", "getWrittenLength", "()J", "setWrittenLength", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Descriptor {
        private final List<String> destinationIdentityStrings;
        private final StreamInfo info;
        private final AtomicLong nextChunkIndex;
        private long writtenLength;

        public /* synthetic */ Descriptor(StreamInfo streamInfo, List list, long j4, AtomicLong atomicLong, int i10, kotlin.jvm.internal.f fVar) {
            this(streamInfo, list, (i10 & 4) != 0 ? 0L : j4, (i10 & 8) != 0 ? new AtomicLong(0L) : atomicLong);
        }

        public static /* synthetic */ Descriptor copy$default(Descriptor descriptor, StreamInfo streamInfo, List list, long j4, AtomicLong atomicLong, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                streamInfo = descriptor.info;
            }
            if ((i10 & 2) != 0) {
                list = descriptor.destinationIdentityStrings;
            }
            if ((i10 & 4) != 0) {
                j4 = descriptor.writtenLength;
            }
            if ((i10 & 8) != 0) {
                atomicLong = descriptor.nextChunkIndex;
            }
            AtomicLong atomicLong2 = atomicLong;
            return descriptor.copy(streamInfo, list, j4, atomicLong2);
        }

        /* renamed from: component1, reason: from getter */
        public final StreamInfo getInfo() {
            return this.info;
        }

        public final List<String> component2() {
            return this.destinationIdentityStrings;
        }

        /* renamed from: component3, reason: from getter */
        public final long getWrittenLength() {
            return this.writtenLength;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomicLong getNextChunkIndex() {
            return this.nextChunkIndex;
        }

        public final Descriptor copy(StreamInfo info, List<String> destinationIdentityStrings, long writtenLength, AtomicLong nextChunkIndex) {
            info.getClass();
            destinationIdentityStrings.getClass();
            nextChunkIndex.getClass();
            return new Descriptor(info, destinationIdentityStrings, writtenLength, nextChunkIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Descriptor)) {
                return false;
            }
            Descriptor descriptor = (Descriptor) other;
            if (kotlin.jvm.internal.m.c(this.info, descriptor.info) && kotlin.jvm.internal.m.c(this.destinationIdentityStrings, descriptor.destinationIdentityStrings) && this.writtenLength == descriptor.writtenLength && kotlin.jvm.internal.m.c(this.nextChunkIndex, descriptor.nextChunkIndex)) {
                return true;
            }
            return false;
        }

        public final List<String> getDestinationIdentityStrings() {
            return this.destinationIdentityStrings;
        }

        public final StreamInfo getInfo() {
            return this.info;
        }

        public final AtomicLong getNextChunkIndex() {
            return this.nextChunkIndex;
        }

        public final long getWrittenLength() {
            return this.writtenLength;
        }

        public int hashCode() {
            return this.nextChunkIndex.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.writtenLength, n.d(this.info.hashCode() * 31, 31, this.destinationIdentityStrings), 31);
        }

        public final void setWrittenLength(long j4) {
            this.writtenLength = j4;
        }

        public String toString() {
            return "Descriptor(info=" + this.info + ", destinationIdentityStrings=" + this.destinationIdentityStrings + ", writtenLength=" + this.writtenLength + ", nextChunkIndex=" + this.nextChunkIndex + ')';
        }

        public Descriptor(StreamInfo streamInfo, List<String> list, long j4, AtomicLong atomicLong) {
            streamInfo.getClass();
            list.getClass();
            atomicLong.getClass();
            this.info = streamInfo;
            this.destinationIdentityStrings = list;
            this.writtenLength = j4;
            this.nextChunkIndex = atomicLong;
        }
    }
}
