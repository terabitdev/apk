package io.livekit.android.room.datastream.outgoing;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.livekit.android.room.datastream.StreamBytesOptions;
import io.livekit.android.room.datastream.StreamTextOptions;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.l;
import sn.m;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0007H\u0097@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManager;", "", "Lio/livekit/android/room/datastream/StreamTextOptions;", "options", "Lio/livekit/android/room/datastream/outgoing/TextStreamSender;", "streamText", "(Lio/livekit/android/room/datastream/StreamTextOptions;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/datastream/StreamBytesOptions;", "Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;", "streamBytes", "(Lio/livekit/android/room/datastream/StreamBytesOptions;Lwn/c;)Ljava/lang/Object;", "", ParameterNames.TEXT, "Lsn/m;", "Lio/livekit/android/room/datastream/TextStreamInfo;", "sendText-0E7RQCE", "(Ljava/lang/String;Lio/livekit/android/room/datastream/StreamTextOptions;Lwn/c;)Ljava/lang/Object;", "sendText", "Ljava/io/File;", "file", "Lio/livekit/android/room/datastream/ByteStreamInfo;", "sendFile-0E7RQCE", "(Ljava/io/File;Lio/livekit/android/room/datastream/StreamBytesOptions;Lwn/c;)Ljava/lang/Object;", "sendFile", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface OutgoingDataStreamManager {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
        
            if (io.livekit.android.room.datastream.outgoing.BaseStreamSender.close$default(r7, null, r0, 1, null) == r6) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:14:0x0030, B:15:0x00a7, B:21:0x0040, B:22:0x0096, B:25:0x0048, B:26:0x0075, B:28:0x0079, B:30:0x007f, B:31:0x0086, B:36:0x009b, B:39:0x0055, B:40:0x0067, B:45:0x005c), top: B:7:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:14:0x0030, B:15:0x00a7, B:21:0x0040, B:22:0x0096, B:25:0x0048, B:26:0x0075, B:28:0x0079, B:30:0x007f, B:31:0x0086, B:36:0x009b, B:39:0x0055, B:40:0x0067, B:45:0x005c), top: B:7:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* renamed from: sendFile-0E7RQCE, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m2561sendFile0E7RQCE(OutgoingDataStreamManager outgoingDataStreamManager, File file, StreamBytesOptions streamBytesOptions, c<? super m> cVar) {
            OutgoingDataStreamManager$sendFile$1 outgoingDataStreamManager$sendFile$1;
            int i10;
            Object obj;
            Object writeFile;
            ByteStreamSender byteStreamSender;
            Throwable th;
            try {
                if (cVar instanceof OutgoingDataStreamManager$sendFile$1) {
                    outgoingDataStreamManager$sendFile$1 = (OutgoingDataStreamManager$sendFile$1) cVar;
                    int i11 = outgoingDataStreamManager$sendFile$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        outgoingDataStreamManager$sendFile$1.label = i11 - Integer.MIN_VALUE;
                        Object obj2 = outgoingDataStreamManager$sendFile$1.result;
                        i10 = outgoingDataStreamManager$sendFile$1.label;
                        obj = a.f37986a;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            byteStreamSender = (ByteStreamSender) outgoingDataStreamManager$sendFile$1.L$0;
                                            sn.a.g(obj2);
                                            return byteStreamSender.getInfo();
                                        }
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    th = (Throwable) outgoingDataStreamManager$sendFile$1.L$0;
                                    sn.a.g(obj2);
                                    return sn.a.b(th);
                                }
                                byteStreamSender = (ByteStreamSender) outgoingDataStreamManager$sendFile$1.L$0;
                                sn.a.g(obj2);
                                writeFile = ((m) obj2).f31603a;
                                if (!(writeFile instanceof l)) {
                                    Throwable a10 = m.a(writeFile);
                                    if (a10 == null) {
                                        a10 = new Exception("Unknown error.");
                                    }
                                    String message = a10.getMessage();
                                    outgoingDataStreamManager$sendFile$1.L$0 = a10;
                                    outgoingDataStreamManager$sendFile$1.label = 3;
                                    if (byteStreamSender.close(message, outgoingDataStreamManager$sendFile$1) != obj) {
                                        th = a10;
                                        return sn.a.b(th);
                                    }
                                } else {
                                    outgoingDataStreamManager$sendFile$1.L$0 = byteStreamSender;
                                    outgoingDataStreamManager$sendFile$1.label = 4;
                                }
                                return obj;
                            }
                            file = (File) outgoingDataStreamManager$sendFile$1.L$0;
                            sn.a.g(obj2);
                        } else {
                            sn.a.g(obj2);
                            outgoingDataStreamManager$sendFile$1.L$0 = file;
                            outgoingDataStreamManager$sendFile$1.label = 1;
                            obj2 = outgoingDataStreamManager.streamBytes(streamBytesOptions, outgoingDataStreamManager$sendFile$1);
                            if (obj2 == obj) {
                                return obj;
                            }
                        }
                        ByteStreamSender byteStreamSender2 = (ByteStreamSender) obj2;
                        outgoingDataStreamManager$sendFile$1.L$0 = byteStreamSender2;
                        outgoingDataStreamManager$sendFile$1.label = 2;
                        writeFile = ByteStreamSenderKt.writeFile(byteStreamSender2, file, outgoingDataStreamManager$sendFile$1);
                        if (writeFile == obj) {
                            byteStreamSender = byteStreamSender2;
                            if (!(writeFile instanceof l)) {
                            }
                            return obj;
                        }
                        return obj;
                    }
                }
                if (i10 == 0) {
                }
                ByteStreamSender byteStreamSender22 = (ByteStreamSender) obj2;
                outgoingDataStreamManager$sendFile$1.L$0 = byteStreamSender22;
                outgoingDataStreamManager$sendFile$1.label = 2;
                writeFile = ByteStreamSenderKt.writeFile(byteStreamSender22, file, outgoingDataStreamManager$sendFile$1);
                if (writeFile == obj) {
                }
            } catch (Exception e10) {
                return new l(e10);
            }
            outgoingDataStreamManager$sendFile$1 = new OutgoingDataStreamManager$sendFile$1(cVar);
            Object obj22 = outgoingDataStreamManager$sendFile$1.result;
            i10 = outgoingDataStreamManager$sendFile$1.label;
            obj = a.f37986a;
        }

        /* renamed from: sendFile-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ Object m2562sendFile0E7RQCE$default(OutgoingDataStreamManager outgoingDataStreamManager, File file, StreamBytesOptions streamBytesOptions, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    streamBytesOptions = new StreamBytesOptions(null, null, null, null, null, null, null, 127, null);
                }
                return outgoingDataStreamManager.mo2559sendFile0E7RQCE(file, streamBytesOptions, cVar);
            }
            a9.a.y("Super calls with default arguments not supported in this target, function: sendFile-0E7RQCE");
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
        
            if (io.livekit.android.room.datastream.outgoing.BaseStreamSender.close$default(r7, null, r0, 1, null) == r6) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:14:0x0030, B:15:0x00a7, B:21:0x0040, B:22:0x0096, B:25:0x0048, B:26:0x0075, B:28:0x0079, B:30:0x007f, B:31:0x0086, B:36:0x009b, B:39:0x0055, B:40:0x0067, B:45:0x005c), top: B:7:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:14:0x0030, B:15:0x00a7, B:21:0x0040, B:22:0x0096, B:25:0x0048, B:26:0x0075, B:28:0x0079, B:30:0x007f, B:31:0x0086, B:36:0x009b, B:39:0x0055, B:40:0x0067, B:45:0x005c), top: B:7:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* renamed from: sendText-0E7RQCE, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m2563sendText0E7RQCE(OutgoingDataStreamManager outgoingDataStreamManager, String str, StreamTextOptions streamTextOptions, c<? super m> cVar) {
            OutgoingDataStreamManager$sendText$1 outgoingDataStreamManager$sendText$1;
            int i10;
            Object obj;
            Object m2556writegIAlus;
            TextStreamSender textStreamSender;
            Throwable th;
            try {
                if (cVar instanceof OutgoingDataStreamManager$sendText$1) {
                    outgoingDataStreamManager$sendText$1 = (OutgoingDataStreamManager$sendText$1) cVar;
                    int i11 = outgoingDataStreamManager$sendText$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        outgoingDataStreamManager$sendText$1.label = i11 - Integer.MIN_VALUE;
                        Object obj2 = outgoingDataStreamManager$sendText$1.result;
                        i10 = outgoingDataStreamManager$sendText$1.label;
                        obj = a.f37986a;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            textStreamSender = (TextStreamSender) outgoingDataStreamManager$sendText$1.L$0;
                                            sn.a.g(obj2);
                                            return textStreamSender.getInfo();
                                        }
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    th = (Throwable) outgoingDataStreamManager$sendText$1.L$0;
                                    sn.a.g(obj2);
                                    return sn.a.b(th);
                                }
                                textStreamSender = (TextStreamSender) outgoingDataStreamManager$sendText$1.L$0;
                                sn.a.g(obj2);
                                m2556writegIAlus = ((m) obj2).f31603a;
                                if (!(m2556writegIAlus instanceof l)) {
                                    Throwable a10 = m.a(m2556writegIAlus);
                                    if (a10 == null) {
                                        a10 = new Exception("Unknown error.");
                                    }
                                    String message = a10.getMessage();
                                    outgoingDataStreamManager$sendText$1.L$0 = a10;
                                    outgoingDataStreamManager$sendText$1.label = 3;
                                    if (textStreamSender.close(message, outgoingDataStreamManager$sendText$1) != obj) {
                                        th = a10;
                                        return sn.a.b(th);
                                    }
                                } else {
                                    outgoingDataStreamManager$sendText$1.L$0 = textStreamSender;
                                    outgoingDataStreamManager$sendText$1.label = 4;
                                }
                                return obj;
                            }
                            str = (String) outgoingDataStreamManager$sendText$1.L$0;
                            sn.a.g(obj2);
                        } else {
                            sn.a.g(obj2);
                            outgoingDataStreamManager$sendText$1.L$0 = str;
                            outgoingDataStreamManager$sendText$1.label = 1;
                            obj2 = outgoingDataStreamManager.streamText(streamTextOptions, outgoingDataStreamManager$sendText$1);
                            if (obj2 == obj) {
                                return obj;
                            }
                        }
                        TextStreamSender textStreamSender2 = (TextStreamSender) obj2;
                        outgoingDataStreamManager$sendText$1.L$0 = textStreamSender2;
                        outgoingDataStreamManager$sendText$1.label = 2;
                        m2556writegIAlus = textStreamSender2.m2556writegIAlus(str, outgoingDataStreamManager$sendText$1);
                        if (m2556writegIAlus == obj) {
                            textStreamSender = textStreamSender2;
                            if (!(m2556writegIAlus instanceof l)) {
                            }
                            return obj;
                        }
                        return obj;
                    }
                }
                if (i10 == 0) {
                }
                TextStreamSender textStreamSender22 = (TextStreamSender) obj2;
                outgoingDataStreamManager$sendText$1.L$0 = textStreamSender22;
                outgoingDataStreamManager$sendText$1.label = 2;
                m2556writegIAlus = textStreamSender22.m2556writegIAlus(str, outgoingDataStreamManager$sendText$1);
                if (m2556writegIAlus == obj) {
                }
            } catch (Exception e10) {
                return new l(e10);
            }
            outgoingDataStreamManager$sendText$1 = new OutgoingDataStreamManager$sendText$1(cVar);
            Object obj22 = outgoingDataStreamManager$sendText$1.result;
            i10 = outgoingDataStreamManager$sendText$1.label;
            obj = a.f37986a;
        }

        /* renamed from: sendText-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ Object m2564sendText0E7RQCE$default(OutgoingDataStreamManager outgoingDataStreamManager, String str, StreamTextOptions streamTextOptions, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    streamTextOptions = new StreamTextOptions(null, null, null, null, null, 0, null, null, null, 511, null);
                }
                return outgoingDataStreamManager.mo2560sendText0E7RQCE(str, streamTextOptions, cVar);
            }
            a9.a.y("Super calls with default arguments not supported in this target, function: sendText-0E7RQCE");
            return null;
        }

        public static /* synthetic */ Object streamText$default(OutgoingDataStreamManager outgoingDataStreamManager, StreamTextOptions streamTextOptions, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    streamTextOptions = new StreamTextOptions(null, null, null, null, null, 0, null, null, null, 511, null);
                }
                return outgoingDataStreamManager.streamText(streamTextOptions, cVar);
            }
            a9.a.y("Super calls with default arguments not supported in this target, function: streamText");
            return null;
        }
    }

    /* renamed from: sendFile-0E7RQCE, reason: not valid java name */
    Object mo2559sendFile0E7RQCE(File file, StreamBytesOptions streamBytesOptions, c<? super m> cVar);

    /* renamed from: sendText-0E7RQCE, reason: not valid java name */
    Object mo2560sendText0E7RQCE(String str, StreamTextOptions streamTextOptions, c<? super m> cVar);

    Object streamBytes(StreamBytesOptions streamBytesOptions, c<? super ByteStreamSender> cVar);

    Object streamText(StreamTextOptions streamTextOptions, c<? super TextStreamSender> cVar);
}
