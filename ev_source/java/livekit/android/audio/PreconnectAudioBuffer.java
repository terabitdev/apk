package io.livekit.android.audio;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.SystemClock;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import defpackage.f;
import io.livekit.android.room.Room;
import io.livekit.android.room.datastream.StreamBytesOptions;
import io.livekit.android.room.datastream.outgoing.BaseStreamSender;
import io.livekit.android.room.datastream.outgoing.ByteStreamSender;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.AudioTrackSink;
import sn.h;
import sn.k;
import sn.l;
import sn.m;
import sn.z;
import tn.a0;
import tn.o;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ?\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010.¨\u00065"}, d2 = {"Lio/livekit/android/audio/PreconnectAudioBuffer;", "Llivekit/org/webrtc/AudioTrackSink;", "Lxq/b;", "timeout", "<init>", "(JLkotlin/jvm/internal/f;)V", "Lsn/z;", "startRecording", "()V", "stopRecording", SDPKeywords.CLEAR, "Ljava/nio/ByteBuffer;", "audioData", "", "bitsPerSample", "sampleRate", "numberOfChannels", "numberOfFrames", "", "absoluteCaptureTimestampMs", "onData", "(Ljava/nio/ByteBuffer;IIIIJ)V", "Lio/livekit/android/room/Room;", "room", "", "trackSid", "", "Lio/livekit/android/room/participant/Participant$Identity;", "agentIdentities", "topic", "sendAudioData", "(Lio/livekit/android/room/Room;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "outputStreamLock", "Ljava/lang/Object;", "Ljava/io/ByteArrayOutputStream;", "outputStream$delegate", "Lsn/h;", "getOutputStream", "()Ljava/io/ByteArrayOutputStream;", "outputStream", "", "collectedBytes", "[B", "tempArray", "initialTime", "J", TokenNames.I, "", "isRecording", "Z", "timeoutMs", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PreconnectAudioBuffer implements AudioTrackSink {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_TOPIC = "lk.agent.pre-connect-audio-buffer";
    private static final long TIMEOUT;
    private int bitsPerSample;
    private byte[] collectedBytes;
    private long initialTime;
    private boolean isRecording;
    private int numberOfChannels;

    /* renamed from: outputStream$delegate, reason: from kotlin metadata */
    private final h outputStream;
    private final Object outputStreamLock;
    private int sampleRate;
    private final byte[] tempArray;
    private final long timeoutMs;

    static {
        xq.a aVar = xq.b.f38124b;
        TIMEOUT = g.n(10, d.SECONDS);
    }

    private PreconnectAudioBuffer(long j4) {
        this.outputStreamLock = new Object();
        this.outputStream = sn.a.e(PreconnectAudioBuffer$outputStream$2.INSTANCE);
        this.tempArray = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
        this.initialTime = -1L;
        this.bitsPerSample = 16;
        this.sampleRate = 48000;
        this.numberOfChannels = 1;
        this.isRecording = true;
        this.timeoutMs = xq.b.d(j4);
    }

    private final ByteArrayOutputStream getOutputStream() {
        return (ByteArrayOutputStream) this.outputStream.getValue();
    }

    public static /* synthetic */ Object sendAudioData$default(PreconnectAudioBuffer preconnectAudioBuffer, Room room, String str, List list, String str2, wn.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = DEFAULT_TOPIC;
        }
        return preconnectAudioBuffer.sendAudioData(room, str, list, str2, cVar);
    }

    public final void clear() {
        stopRecording();
        this.collectedBytes = new byte[0];
    }

    @Override // livekit.org.webrtc.AudioTrackSink
    public void onData(ByteBuffer audioData, int bitsPerSample, int sampleRate, int numberOfChannels, int numberOfFrames, long absoluteCaptureTimestampMs) {
        audioData.getClass();
        if (this.isRecording) {
            if (this.initialTime == -1) {
                this.initialTime = SystemClock.elapsedRealtime();
            }
            this.bitsPerSample = bitsPerSample;
            this.sampleRate = sampleRate;
            this.numberOfChannels = numberOfChannels;
            if (SystemClock.elapsedRealtime() - this.initialTime > this.timeoutMs) {
                return;
            }
            audioData.rewind();
            synchronized (this.outputStreamLock) {
                try {
                    if (audioData.hasArray()) {
                        getOutputStream().write(audioData.array(), audioData.arrayOffset(), audioData.capacity());
                    } else {
                        while (audioData.hasRemaining()) {
                            audioData.get(this.tempArray, 0, Math.min(this.tempArray.length, audioData.remaining()));
                            getOutputStream().write(this.tempArray);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(4:(1:(1:(5:12|13|14|(1:18)|19)(2:21|22))(7:23|24|25|26|14|(2:16|18)|19))(8:34|35|36|37|(1:42)|43|(5:45|26|14|(0)|19)|32)|30|(5:33|13|14|(0)|19)|32)(1:47))(3:56|(2:58|(2:60|(2:64|65))(5:66|(1:68)(1:72)|69|(1:71)|32))|19)|48|49|50|(5:52|37|(2:39|42)|43|(0))|32))|73|6|(0)(0)|48|49|50|(0)|32) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016b, code lost:
    
        r8 = r3;
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAudioData(Room room, String str, List<Participant.Identity> list, String str2, wn.c<? super z> cVar) {
        PreconnectAudioBuffer$sendAudioData$1 preconnectAudioBuffer$sendAudioData$1;
        int i10;
        xn.a aVar;
        byte[] byteArray;
        String str3;
        PreconnectAudioBuffer preconnectAudioBuffer;
        List<Participant.Identity> list2;
        byte[] bArr;
        ByteStreamSender byteStreamSender;
        Object m2556writegIAlus;
        byte[] bArr2;
        List<Participant.Identity> list3;
        PreconnectAudioBuffer preconnectAudioBuffer2;
        Throwable a10;
        byte[] bArr3;
        List<Participant.Identity> list4;
        PreconnectAudioBuffer preconnectAudioBuffer3;
        List<Participant.Identity> list5;
        float length;
        if (cVar instanceof PreconnectAudioBuffer$sendAudioData$1) {
            preconnectAudioBuffer$sendAudioData$1 = (PreconnectAudioBuffer$sendAudioData$1) cVar;
            int i11 = preconnectAudioBuffer$sendAudioData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                preconnectAudioBuffer$sendAudioData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = preconnectAudioBuffer$sendAudioData$1.result;
                i10 = preconnectAudioBuffer$sendAudioData$1.label;
                z zVar = z.f31622a;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    bArr3 = (byte[]) preconnectAudioBuffer$sendAudioData$1.L$2;
                                    list4 = (List) preconnectAudioBuffer$sendAudioData$1.L$1;
                                    preconnectAudioBuffer3 = (PreconnectAudioBuffer) preconnectAudioBuffer$sendAudioData$1.L$0;
                                    sn.a.g(obj);
                                    preconnectAudioBuffer2 = preconnectAudioBuffer3;
                                    bArr2 = bArr3;
                                    list5 = list4;
                                    length = (bArr2.length / ((preconnectAudioBuffer2.numberOfChannels * preconnectAudioBuffer2.bitsPerSample) / 8)) / preconnectAudioBuffer2.sampleRate;
                                    LKLog.Companion companion = LKLog.INSTANCE;
                                    if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                        StringBuilder sb = new StringBuilder("Sent ");
                                        sb.append(length);
                                        sb.append("s (");
                                        sb.append(bArr2.length / UserMetadata.MAX_ATTRIBUTE_SIZE);
                                        sb.append("KB) of audio data to ");
                                        sb.append(list5.size());
                                        sb.append(" agent(s) (");
                                        et.d.c(null, f.m(sb, o.E0(list5, Separators.COMMA, null, null, null, 62), ')'), new Object[0]);
                                    }
                                    return zVar;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            byteStreamSender = (ByteStreamSender) preconnectAudioBuffer$sendAudioData$1.L$3;
                            bArr2 = (byte[]) preconnectAudioBuffer$sendAudioData$1.L$2;
                            list3 = (List) preconnectAudioBuffer$sendAudioData$1.L$1;
                            preconnectAudioBuffer2 = (PreconnectAudioBuffer) preconnectAudioBuffer$sendAudioData$1.L$0;
                            try {
                                sn.a.g(obj);
                                list5 = list3;
                            } catch (Exception e10) {
                                e = e10;
                                list2 = list3;
                                preconnectAudioBuffer = preconnectAudioBuffer2;
                                bArr = bArr2;
                            }
                            length = (bArr2.length / ((preconnectAudioBuffer2.numberOfChannels * preconnectAudioBuffer2.bitsPerSample) / 8)) / preconnectAudioBuffer2.sampleRate;
                            LKLog.Companion companion2 = LKLog.INSTANCE;
                            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                                StringBuilder sb2 = new StringBuilder("Sent ");
                                sb2.append(length);
                                sb2.append("s (");
                                sb2.append(bArr2.length / UserMetadata.MAX_ATTRIBUTE_SIZE);
                                sb2.append("KB) of audio data to ");
                                sb2.append(list5.size());
                                sb2.append(" agent(s) (");
                                et.d.c(null, f.m(sb2, o.E0(list5, Separators.COMMA, null, null, null, 62), ')'), new Object[0]);
                            }
                            return zVar;
                        }
                        byteStreamSender = (ByteStreamSender) preconnectAudioBuffer$sendAudioData$1.L$3;
                        bArr = (byte[]) preconnectAudioBuffer$sendAudioData$1.L$2;
                        list2 = (List) preconnectAudioBuffer$sendAudioData$1.L$1;
                        preconnectAudioBuffer = (PreconnectAudioBuffer) preconnectAudioBuffer$sendAudioData$1.L$0;
                        try {
                            sn.a.g(obj);
                            m2556writegIAlus = ((m) obj).f31603a;
                            if ((m2556writegIAlus instanceof l) && (a10 = m.a(m2556writegIAlus)) != null) {
                                throw a10;
                            }
                            preconnectAudioBuffer$sendAudioData$1.L$0 = preconnectAudioBuffer;
                            preconnectAudioBuffer$sendAudioData$1.L$1 = list2;
                            preconnectAudioBuffer$sendAudioData$1.L$2 = bArr;
                            preconnectAudioBuffer$sendAudioData$1.L$3 = byteStreamSender;
                            preconnectAudioBuffer$sendAudioData$1.label = 3;
                        } catch (Exception e11) {
                            e = e11;
                        }
                        if (BaseStreamSender.close$default(byteStreamSender, null, preconnectAudioBuffer$sendAudioData$1, 1, null) != aVar) {
                            bArr2 = bArr;
                            list3 = list2;
                            preconnectAudioBuffer2 = preconnectAudioBuffer;
                            list5 = list3;
                            length = (bArr2.length / ((preconnectAudioBuffer2.numberOfChannels * preconnectAudioBuffer2.bitsPerSample) / 8)) / preconnectAudioBuffer2.sampleRate;
                            LKLog.Companion companion22 = LKLog.INSTANCE;
                            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                            }
                            return zVar;
                        }
                        return aVar;
                        String localizedMessage = e.getLocalizedMessage();
                        preconnectAudioBuffer$sendAudioData$1.L$0 = preconnectAudioBuffer;
                        preconnectAudioBuffer$sendAudioData$1.L$1 = list2;
                        preconnectAudioBuffer$sendAudioData$1.L$2 = bArr;
                        preconnectAudioBuffer$sendAudioData$1.L$3 = null;
                        preconnectAudioBuffer$sendAudioData$1.label = 4;
                        if (byteStreamSender.close(localizedMessage, preconnectAudioBuffer$sendAudioData$1) != aVar) {
                            bArr3 = bArr;
                            list4 = list2;
                            preconnectAudioBuffer3 = preconnectAudioBuffer;
                            preconnectAudioBuffer2 = preconnectAudioBuffer3;
                            bArr2 = bArr3;
                            list5 = list4;
                            length = (bArr2.length / ((preconnectAudioBuffer2.numberOfChannels * preconnectAudioBuffer2.bitsPerSample) / 8)) / preconnectAudioBuffer2.sampleRate;
                            LKLog.Companion companion222 = LKLog.INSTANCE;
                            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                            }
                            return zVar;
                        }
                        return aVar;
                    }
                    byteArray = (byte[]) preconnectAudioBuffer$sendAudioData$1.L$2;
                    list2 = (List) preconnectAudioBuffer$sendAudioData$1.L$1;
                    preconnectAudioBuffer = (PreconnectAudioBuffer) preconnectAudioBuffer$sendAudioData$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    if (!list.isEmpty()) {
                        byteArray = getOutputStream().toByteArray();
                        if (byteArray.length <= 1024) {
                            LKLog.Companion companion3 = LKLog.INSTANCE;
                            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                et.d.c(null, "Audio data size too small, nothing to send.", new Object[0]);
                                return zVar;
                            }
                        } else {
                            LocalParticipant localParticipant = room.getLocalParticipant();
                            k kVar = new k("sampleRate", String.valueOf(this.sampleRate));
                            k kVar2 = new k("channels", String.valueOf(this.numberOfChannels));
                            if (str == null) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            StreamBytesOptions streamBytesOptions = new StreamBytesOptions(str2, a0.J(kVar, kVar2, new k("trackId", str3)), null, list, null, "preconnect-audio-buffer", new Long(byteArray.length), 20, null);
                            preconnectAudioBuffer$sendAudioData$1.L$0 = this;
                            preconnectAudioBuffer$sendAudioData$1.L$1 = list;
                            preconnectAudioBuffer$sendAudioData$1.L$2 = byteArray;
                            preconnectAudioBuffer$sendAudioData$1.label = 1;
                            obj = localParticipant.streamBytes(streamBytesOptions, preconnectAudioBuffer$sendAudioData$1);
                            if (obj != aVar) {
                                preconnectAudioBuffer = this;
                                list2 = list;
                            }
                            return aVar;
                        }
                    }
                    return zVar;
                }
                ByteStreamSender byteStreamSender2 = (ByteStreamSender) obj;
                byteArray.getClass();
                preconnectAudioBuffer$sendAudioData$1.L$0 = preconnectAudioBuffer;
                preconnectAudioBuffer$sendAudioData$1.L$1 = list2;
                preconnectAudioBuffer$sendAudioData$1.L$2 = byteArray;
                preconnectAudioBuffer$sendAudioData$1.L$3 = byteStreamSender2;
                preconnectAudioBuffer$sendAudioData$1.label = 2;
                m2556writegIAlus = byteStreamSender2.m2556writegIAlus(byteArray, preconnectAudioBuffer$sendAudioData$1);
                if (m2556writegIAlus != aVar) {
                    bArr = byteArray;
                    byteStreamSender = byteStreamSender2;
                    if (m2556writegIAlus instanceof l) {
                        throw a10;
                    }
                    preconnectAudioBuffer$sendAudioData$1.L$0 = preconnectAudioBuffer;
                    preconnectAudioBuffer$sendAudioData$1.L$1 = list2;
                    preconnectAudioBuffer$sendAudioData$1.L$2 = bArr;
                    preconnectAudioBuffer$sendAudioData$1.L$3 = byteStreamSender;
                    preconnectAudioBuffer$sendAudioData$1.label = 3;
                    if (BaseStreamSender.close$default(byteStreamSender, null, preconnectAudioBuffer$sendAudioData$1, 1, null) != aVar) {
                    }
                }
                return aVar;
            }
        }
        preconnectAudioBuffer$sendAudioData$1 = new PreconnectAudioBuffer$sendAudioData$1(this, cVar);
        Object obj2 = preconnectAudioBuffer$sendAudioData$1.result;
        i10 = preconnectAudioBuffer$sendAudioData$1.label;
        z zVar2 = z.f31622a;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        ByteStreamSender byteStreamSender22 = (ByteStreamSender) obj2;
        byteArray.getClass();
        preconnectAudioBuffer$sendAudioData$1.L$0 = preconnectAudioBuffer;
        preconnectAudioBuffer$sendAudioData$1.L$1 = list2;
        preconnectAudioBuffer$sendAudioData$1.L$2 = byteArray;
        preconnectAudioBuffer$sendAudioData$1.L$3 = byteStreamSender22;
        preconnectAudioBuffer$sendAudioData$1.label = 2;
        m2556writegIAlus = byteStreamSender22.m2556writegIAlus(byteArray, preconnectAudioBuffer$sendAudioData$1);
        if (m2556writegIAlus != aVar) {
        }
        return aVar;
    }

    public final void startRecording() {
        this.isRecording = true;
    }

    public final void stopRecording() {
        synchronized (this.outputStreamLock) {
            if (this.isRecording) {
                byte[] byteArray = getOutputStream().toByteArray();
                byteArray.getClass();
                this.collectedBytes = byteArray;
                this.isRecording = false;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Lio/livekit/android/audio/PreconnectAudioBuffer$Companion;", "", "<init>", "()V", "Lxq/b;", "TIMEOUT", "J", "getTIMEOUT-UwyO8pc", "()J", "", "DEFAULT_TOPIC", "Ljava/lang/String;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        /* renamed from: getTIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m2515getTIMEOUTUwyO8pc() {
            return PreconnectAudioBuffer.TIMEOUT;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PreconnectAudioBuffer(long j4, kotlin.jvm.internal.f fVar) {
        this(j4);
    }
}
