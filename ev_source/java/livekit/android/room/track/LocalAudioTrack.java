package io.livekit.android.room.track;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import as.s6;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fr.d0;
import fr.g0;
import fr.z;
import io.livekit.android.audio.AudioBufferCallback;
import io.livekit.android.audio.AudioBufferCallbackDispatcher;
import io.livekit.android.audio.AudioProcessingController;
import io.livekit.android.audio.AudioProcessorInterface;
import io.livekit.android.audio.AudioRecordPrewarmer;
import io.livekit.android.audio.AudioRecordSamplesDispatcher;
import io.livekit.android.dagger.InjectionNames;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.util.StateFlowDelegate;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import ir.d1;
import ir.i;
import ir.j;
import ir.r;
import ir.t1;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.w;
import kr.d;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.AudioTrackSink;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import oo.u;
import sn.k;
import tn.v;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u00020\u0001:\u0002DEB]\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R'\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00170:8GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010\u001c\u001a\u0004\b=\u0010\u0019R\u0016\u0010C\u001a\u0004\u0018\u00010@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lio/livekit/android/room/track/LocalAudioTrack;", "Lio/livekit/android/room/track/AudioTrack;", "", DiagnosticsEntry.NAME_KEY, "Llivekit/org/webrtc/AudioTrack;", "mediaTrack", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "options", "Lio/livekit/android/audio/AudioProcessingController;", "audioProcessingController", "Lfr/z;", "dispatcher", "Lio/livekit/android/audio/AudioRecordSamplesDispatcher;", "audioRecordSamplesDispatcher", "Lio/livekit/android/audio/AudioBufferCallbackDispatcher;", "audioBufferCallbackDispatcher", "Lio/livekit/android/audio/AudioRecordPrewarmer;", "audioRecordPrewarmer", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Ljava/lang/String;Llivekit/org/webrtc/AudioTrack;Lio/livekit/android/room/track/LocalAudioTrackOptions;Lio/livekit/android/audio/AudioProcessingController;Lfr/z;Lio/livekit/android/audio/AudioRecordSamplesDispatcher;Lio/livekit/android/audio/AudioBufferCallbackDispatcher;Lio/livekit/android/audio/AudioRecordPrewarmer;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "", "Las/s6;", "getConstantFeatures", "()Ljava/util/Set;", "Lsn/z;", "prewarm", "()V", "stopPrewarm", "Llivekit/org/webrtc/AudioTrackSink;", "sink", "addSink", "(Llivekit/org/webrtc/AudioTrackSink;)V", "removeSink", "Lio/livekit/android/audio/AudioBufferCallback;", "callback", "setAudioBufferCallback", "(Lio/livekit/android/audio/AudioBufferCallback;)V", "dispose", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "Lio/livekit/android/audio/AudioProcessingController;", "Lfr/z;", "Lio/livekit/android/audio/AudioRecordSamplesDispatcher;", "Lio/livekit/android/audio/AudioBufferCallbackDispatcher;", "Lio/livekit/android/audio/AudioRecordPrewarmer;", "Lfr/d0;", "delegateScope", "Lfr/d0;", "Llivekit/org/webrtc/RtpTransceiver;", "transceiver", "Llivekit/org/webrtc/RtpTransceiver;", "getTransceiver$livekit_android_sdk_release", "()Llivekit/org/webrtc/RtpTransceiver;", "setTransceiver$livekit_android_sdk_release", "(Llivekit/org/webrtc/RtpTransceiver;)V", "trackSinks", "Ljava/util/Set;", "", "features$delegate", "Lio/livekit/android/util/StateFlowDelegate;", "getFeatures", "getFeatures$annotations", "features", "Llivekit/org/webrtc/RtpSender;", "getSender$livekit_android_sdk_release", "()Llivekit/org/webrtc/RtpSender;", InjectionNames.SENDER, "Companion", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalAudioTrack extends AudioTrack {
    static final /* synthetic */ u[] $$delegatedProperties = {e0.f20562a.h(new w(LocalAudioTrack.class, "features", "getFeatures()Ljava/util/Set;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AudioBufferCallbackDispatcher audioBufferCallbackDispatcher;
    private final AudioProcessingController audioProcessingController;
    private final AudioRecordPrewarmer audioRecordPrewarmer;
    private final AudioRecordSamplesDispatcher audioRecordSamplesDispatcher;
    private final d0 delegateScope;
    private final z dispatcher;

    /* renamed from: features$delegate, reason: from kotlin metadata */
    private final StateFlowDelegate features;
    private final LocalAudioTrackOptions options;
    private final Set<AudioTrackSink> trackSinks;
    private RtpTransceiver transceiver;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lio/livekit/android/room/track/LocalAudioTrack$Factory;", "", "create", "Lio/livekit/android/room/track/LocalAudioTrack;", DiagnosticsEntry.NAME_KEY, "", "mediaTrack", "Llivekit/org/webrtc/AudioTrack;", "options", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        LocalAudioTrack create(String name, livekit.org.webrtc.AudioTrack mediaTrack, LocalAudioTrackOptions options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAudioTrack(String str, livekit.org.webrtc.AudioTrack audioTrack, LocalAudioTrackOptions localAudioTrackOptions, final AudioProcessingController audioProcessingController, z zVar, AudioRecordSamplesDispatcher audioRecordSamplesDispatcher, AudioBufferCallbackDispatcher audioBufferCallbackDispatcher, AudioRecordPrewarmer audioRecordPrewarmer, RTCThreadToken rTCThreadToken) {
        super(str, audioTrack, rTCThreadToken);
        str.getClass();
        audioTrack.getClass();
        localAudioTrackOptions.getClass();
        audioProcessingController.getClass();
        zVar.getClass();
        audioRecordSamplesDispatcher.getClass();
        audioBufferCallbackDispatcher.getClass();
        audioRecordPrewarmer.getClass();
        rTCThreadToken.getClass();
        this.options = localAudioTrackOptions;
        this.audioProcessingController = audioProcessingController;
        this.dispatcher = zVar;
        this.audioRecordSamplesDispatcher = audioRecordSamplesDispatcher;
        this.audioBufferCallbackDispatcher = audioBufferCallbackDispatcher;
        this.audioRecordPrewarmer = audioRecordPrewarmer;
        d c5 = g0.c(zVar.plus(g0.f()));
        this.delegateScope = c5;
        this.trackSinks = new LinkedHashSet();
        final d1 d1Var = new d1(FlowDelegateKt.getFlow(new p(audioProcessingController) { // from class: io.livekit.android.room.track.LocalAudioTrack$features$2
            @Override // kotlin.jvm.internal.p, oo.r
            public Object get() {
                return ((AudioProcessingController) this.receiver).getCapturePostProcessor();
            }

            public void set(Object obj) {
                ((AudioProcessingController) this.receiver).setCapturePostProcessor((AudioProcessorInterface) obj);
            }
        }), FlowDelegateKt.getFlow(new p(audioProcessingController) { // from class: io.livekit.android.room.track.LocalAudioTrack$features$3
            @Override // kotlin.jvm.internal.p, oo.r
            public Object get() {
                return Boolean.valueOf(((AudioProcessingController) this.receiver).getBypassCapturePostProcessing());
            }

            public void set(Object obj) {
                ((AudioProcessingController) this.receiver).setBypassCapturePostProcessing(((Boolean) obj).booleanValue());
            }
        }), new LocalAudioTrack$features$4(null), 1);
        this.features = FlowDelegateKt.flowDelegate(r.E(new i() { // from class: io.livekit.android.room.track.LocalAudioTrack$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.track.LocalAudioTrack$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;
                final /* synthetic */ LocalAudioTrack this$0;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.track.LocalAudioTrack$special$$inlined$map$1$2", f = "LocalAudioTrack.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.track.LocalAudioTrack$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, LocalAudioTrack localAudioTrack) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = localAudioTrack;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    Set constantFeatures;
                    String str;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                k kVar = (k) obj;
                                constantFeatures = this.this$0.getConstantFeatures();
                                AudioProcessorInterface audioProcessorInterface = (AudioProcessorInterface) kVar.f31600a;
                                if (!((Boolean) kVar.f31601b).booleanValue()) {
                                    if (audioProcessorInterface != null) {
                                        str = audioProcessorInterface.getName();
                                    } else {
                                        str = null;
                                    }
                                    if (m.c(str, "krisp_noise_cancellation")) {
                                        constantFeatures.add(s6.TF_ENHANCED_NOISE_CANCELLATION);
                                    }
                                }
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(constantFeatures, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        }, c5, t1.f18063a, v.f33549a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<s6> getConstantFeatures() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.options.getEchoCancellation()) {
            linkedHashSet.add(s6.TF_ECHO_CANCELLATION);
        }
        if (this.options.getNoiseSuppression()) {
            linkedHashSet.add(s6.TF_NOISE_SUPPRESSION);
        }
        if (this.options.getAutoGainControl()) {
            linkedHashSet.add(s6.TF_AUTO_GAIN_CONTROL);
        }
        return linkedHashSet;
    }

    @Override // io.livekit.android.room.track.AudioTrack
    public void addSink(AudioTrackSink sink) {
        sink.getClass();
        synchronized (this.trackSinks) {
            this.trackSinks.add(sink);
            this.audioRecordSamplesDispatcher.registerSink(sink);
        }
    }

    @Override // io.livekit.android.room.track.Track
    public void dispose() {
        synchronized (this.trackSinks) {
            for (AudioTrackSink audioTrackSink : this.trackSinks) {
                this.trackSinks.remove(audioTrackSink);
                this.audioRecordSamplesDispatcher.unregisterSink(audioTrackSink);
            }
        }
        super.dispose();
    }

    public final Set<s6> getFeatures() {
        return (Set) this.features.getValue(this, $$delegatedProperties[0]);
    }

    public final RtpSender getSender$livekit_android_sdk_release() {
        RtpTransceiver rtpTransceiver = this.transceiver;
        if (rtpTransceiver != null) {
            return rtpTransceiver.getSender();
        }
        return null;
    }

    /* renamed from: getTransceiver$livekit_android_sdk_release, reason: from getter */
    public final RtpTransceiver getTransceiver() {
        return this.transceiver;
    }

    public final void prewarm() {
        this.audioRecordPrewarmer.prewarm();
    }

    @Override // io.livekit.android.room.track.AudioTrack
    public void removeSink(AudioTrackSink sink) {
        sink.getClass();
        synchronized (this.trackSinks) {
            this.trackSinks.remove(sink);
            this.audioRecordSamplesDispatcher.unregisterSink(sink);
        }
    }

    public final void setAudioBufferCallback(AudioBufferCallback callback) {
        this.audioBufferCallbackDispatcher.setBufferCallback(callback);
    }

    public final void setTransceiver$livekit_android_sdk_release(RtpTransceiver rtpTransceiver) {
        this.transceiver = rtpTransceiver;
    }

    public final void stopPrewarm() {
        this.audioRecordPrewarmer.stop();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/track/LocalAudioTrack$Companion;", "", "()V", "createTrack", "Lio/livekit/android/room/track/LocalAudioTrack;", "context", "Landroid/content/Context;", "factory", "Llivekit/org/webrtc/PeerConnectionFactory;", "options", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "audioTrackFactory", "Lio/livekit/android/room/track/LocalAudioTrack$Factory;", DiagnosticsEntry.NAME_KEY, "", "createTrack$livekit_android_sdk_release", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ LocalAudioTrack createTrack$livekit_android_sdk_release$default(Companion companion, Context context, PeerConnectionFactory peerConnectionFactory, LocalAudioTrackOptions localAudioTrackOptions, Factory factory, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                localAudioTrackOptions = new LocalAudioTrackOptions(false, false, false, false, false, 31, null);
            }
            if ((i10 & 16) != 0) {
                str = "";
            }
            return companion.createTrack$livekit_android_sdk_release(context, peerConnectionFactory, localAudioTrackOptions, factory, str);
        }

        public final LocalAudioTrack createTrack$livekit_android_sdk_release(Context context, PeerConnectionFactory factory, LocalAudioTrackOptions options, Factory audioTrackFactory, String name) {
            context.getClass();
            factory.getClass();
            options.getClass();
            audioTrackFactory.getClass();
            name.getClass();
            if (y5.c.a(context, "android.permission.RECORD_AUDIO") != 0) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.f(null, "Record audio permissions not granted, microphone recording will not be used.", new Object[0]);
                }
            }
            MediaConstraints mediaConstraints = new MediaConstraints();
            mediaConstraints.optional.addAll(ig.f.I(new MediaConstraints.KeyValuePair("googEchoCancellation", String.valueOf(options.getEchoCancellation())), new MediaConstraints.KeyValuePair("googAutoGainControl", String.valueOf(options.getAutoGainControl())), new MediaConstraints.KeyValuePair("googHighpassFilter", String.valueOf(options.getHighPassFilter())), new MediaConstraints.KeyValuePair("googNoiseSuppression", String.valueOf(options.getNoiseSuppression())), new MediaConstraints.KeyValuePair("googTypingNoiseDetection", String.valueOf(options.getTypingNoiseDetection()))));
            livekit.org.webrtc.AudioTrack createAudioTrack = factory.createAudioTrack(UUID.randomUUID().toString(), factory.createAudioSource(mediaConstraints));
            createAudioTrack.getClass();
            return audioTrackFactory.create(name, createAudioTrack, options);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getFeatures$annotations() {
    }
}
