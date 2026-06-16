package io.livekit.android.webrtc;

import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.livekit.android.audio.AudioProcessorInterface;
import io.livekit.android.audio.AudioProcessorOptions;
import io.livekit.android.audio.AuthedAudioProcessingController;
import io.livekit.android.audio.AuthedAudioProcessorInterface;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.MutableStateFlowDelegate;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.AudioProcessingFactory;
import livekit.org.webrtc.ExternalAudioProcessingFactory;
import oo.u;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR/\u0010&\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0016R/\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010\u0016R+\u0010/\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u001bR+\u00103\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010-\"\u0004\b2\u0010\u001b¨\u00065"}, d2 = {"Lio/livekit/android/webrtc/CustomAudioProcessingFactory;", "Lio/livekit/android/audio/AuthedAudioProcessingController;", "<init>", "()V", "Lio/livekit/android/audio/AudioProcessorOptions;", "audioProcessorOptions", "(Lio/livekit/android/audio/AudioProcessorOptions;)V", "Lio/livekit/android/audio/AudioProcessorInterface;", "Llivekit/org/webrtc/ExternalAudioProcessingFactory$AudioProcessing;", "toAudioProcessing", "(Lio/livekit/android/audio/AudioProcessorInterface;)Llivekit/org/webrtc/ExternalAudioProcessingFactory$AudioProcessing;", "Llivekit/org/webrtc/AudioProcessingFactory;", "getAudioProcessingFactory", "()Llivekit/org/webrtc/AudioProcessingFactory;", "", "url", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lsn/z;", "authenticate", "(Ljava/lang/String;Ljava/lang/String;)V", "processing", "setCapturePostProcessing", "(Lio/livekit/android/audio/AudioProcessorInterface;)V", "setRenderPreProcessing", "", "bypass", "setBypassForCapturePostProcessing", "(Z)V", "setBypassForRenderPreProcessing", "Llivekit/org/webrtc/ExternalAudioProcessingFactory;", "externalAudioProcessor", "Llivekit/org/webrtc/ExternalAudioProcessingFactory;", "<set-?>", "capturePostProcessor$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getCapturePostProcessor", "()Lio/livekit/android/audio/AudioProcessorInterface;", "setCapturePostProcessor", "capturePostProcessor", "renderPreProcessor$delegate", "getRenderPreProcessor", "setRenderPreProcessor", "renderPreProcessor", "bypassCapturePostProcessing$delegate", "getBypassCapturePostProcessing", "()Z", "setBypassCapturePostProcessing", "bypassCapturePostProcessing", "bypassRenderPreProcessing$delegate", "getBypassRenderPreProcessing", "setBypassRenderPreProcessing", "bypassRenderPreProcessing", "AudioProcessingBridge", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CustomAudioProcessingFactory implements AuthedAudioProcessingController {
    static final /* synthetic */ u[] $$delegatedProperties;

    /* renamed from: bypassCapturePostProcessing$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate bypassCapturePostProcessing;

    /* renamed from: bypassRenderPreProcessing$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate bypassRenderPreProcessing;

    /* renamed from: capturePostProcessor$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate capturePostProcessor;
    private final ExternalAudioProcessingFactory externalAudioProcessor;

    /* renamed from: renderPreProcessor$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate renderPreProcessor;

    static {
        q qVar = new q(CustomAudioProcessingFactory.class, "capturePostProcessor", "getCapturePostProcessor()Lio/livekit/android/audio/AudioProcessorInterface;", 0);
        f0 f0Var = e0.f20562a;
        $$delegatedProperties = new u[]{f0Var.e(qVar), n.l(CustomAudioProcessingFactory.class, "renderPreProcessor", "getRenderPreProcessor()Lio/livekit/android/audio/AudioProcessorInterface;", 0, f0Var), n.l(CustomAudioProcessingFactory.class, "bypassCapturePostProcessing", "getBypassCapturePostProcessing()Z", 0, f0Var), n.l(CustomAudioProcessingFactory.class, "bypassRenderPreProcessing", "getBypassRenderPreProcessing()Z", 0, f0Var)};
    }

    public CustomAudioProcessingFactory() {
        this.externalAudioProcessor = new ExternalAudioProcessingFactory();
        this.capturePostProcessor = FlowDelegateKt.flowDelegate(null, new CustomAudioProcessingFactory$capturePostProcessor$2(this));
        this.renderPreProcessor = FlowDelegateKt.flowDelegate(null, new CustomAudioProcessingFactory$renderPreProcessor$2(this));
        Boolean bool = Boolean.FALSE;
        this.bypassCapturePostProcessing = FlowDelegateKt.flowDelegate(bool, new CustomAudioProcessingFactory$bypassCapturePostProcessing$2(this));
        this.bypassRenderPreProcessing = FlowDelegateKt.flowDelegate(bool, new CustomAudioProcessingFactory$bypassRenderPreProcessing$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalAudioProcessingFactory.AudioProcessing toAudioProcessing(AudioProcessorInterface audioProcessorInterface) {
        return new AudioProcessingBridge(audioProcessorInterface);
    }

    @Override // io.livekit.android.audio.AuthedAudioProcessingController
    public void authenticate(String url, String token) {
        AuthedAudioProcessorInterface authedAudioProcessorInterface;
        url.getClass();
        token.getClass();
        AudioProcessorInterface capturePostProcessor = getCapturePostProcessor();
        AuthedAudioProcessorInterface authedAudioProcessorInterface2 = null;
        if (capturePostProcessor instanceof AuthedAudioProcessorInterface) {
            authedAudioProcessorInterface = (AuthedAudioProcessorInterface) capturePostProcessor;
        } else {
            authedAudioProcessorInterface = null;
        }
        if (authedAudioProcessorInterface != null) {
            authedAudioProcessorInterface.authenticate(url, token);
        }
        AudioProcessorInterface renderPreProcessor = getRenderPreProcessor();
        if (renderPreProcessor instanceof AuthedAudioProcessorInterface) {
            authedAudioProcessorInterface2 = (AuthedAudioProcessorInterface) renderPreProcessor;
        }
        if (authedAudioProcessorInterface2 != null) {
            authedAudioProcessorInterface2.authenticate(url, token);
        }
    }

    public final AudioProcessingFactory getAudioProcessingFactory() {
        return this.externalAudioProcessor;
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public boolean getBypassCapturePostProcessing() {
        return ((Boolean) this.bypassCapturePostProcessing.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public boolean getBypassRenderPreProcessing() {
        return ((Boolean) this.bypassRenderPreProcessing.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public AudioProcessorInterface getCapturePostProcessor() {
        return (AudioProcessorInterface) this.capturePostProcessor.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public AudioProcessorInterface getRenderPreProcessor() {
        return (AudioProcessorInterface) this.renderPreProcessor.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public void setBypassCapturePostProcessing(boolean z6) {
        this.bypassCapturePostProcessing.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z6));
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    @sn.c
    public void setBypassForCapturePostProcessing(boolean bypass) {
        setBypassCapturePostProcessing(bypass);
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    @sn.c
    public void setBypassForRenderPreProcessing(boolean bypass) {
        setBypassRenderPreProcessing(bypass);
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public void setBypassRenderPreProcessing(boolean z6) {
        this.bypassRenderPreProcessing.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z6));
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    @sn.c
    public void setCapturePostProcessing(AudioProcessorInterface processing) {
        setCapturePostProcessor(processing);
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public void setCapturePostProcessor(AudioProcessorInterface audioProcessorInterface) {
        this.capturePostProcessor.setValue(this, $$delegatedProperties[0], audioProcessorInterface);
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    @sn.c
    public void setRenderPreProcessing(AudioProcessorInterface processing) {
        setRenderPreProcessor(processing);
    }

    @Override // io.livekit.android.audio.AudioProcessingController
    public void setRenderPreProcessor(AudioProcessorInterface audioProcessorInterface) {
        this.renderPreProcessor.setValue(this, $$delegatedProperties[1], audioProcessorInterface);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0005¨\u0006\u0019"}, d2 = {"Lio/livekit/android/webrtc/CustomAudioProcessingFactory$AudioProcessingBridge;", "Llivekit/org/webrtc/ExternalAudioProcessingFactory$AudioProcessing;", "Lio/livekit/android/audio/AudioProcessorInterface;", "audioProcessing", "<init>", "(Lio/livekit/android/audio/AudioProcessorInterface;)V", "", "sampleRateHz", "numChannels", "Lsn/z;", "initialize", "(II)V", "newRate", "reset", "(I)V", "numBands", "numFrames", "Ljava/nio/ByteBuffer;", "buffer", "process", "(IILjava/nio/ByteBuffer;)V", "Lio/livekit/android/audio/AudioProcessorInterface;", "getAudioProcessing", "()Lio/livekit/android/audio/AudioProcessorInterface;", "setAudioProcessing", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class AudioProcessingBridge implements ExternalAudioProcessingFactory.AudioProcessing {
        private AudioProcessorInterface audioProcessing;

        public /* synthetic */ AudioProcessingBridge(AudioProcessorInterface audioProcessorInterface, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : audioProcessorInterface);
        }

        public final AudioProcessorInterface getAudioProcessing() {
            return this.audioProcessing;
        }

        @Override // livekit.org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
        public void initialize(int sampleRateHz, int numChannels) {
            AudioProcessorInterface audioProcessorInterface = this.audioProcessing;
            if (audioProcessorInterface != null) {
                audioProcessorInterface.initializeAudioProcessing(sampleRateHz, numChannels);
            }
        }

        @Override // livekit.org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
        public void process(int numBands, int numFrames, ByteBuffer buffer) {
            AudioProcessorInterface audioProcessorInterface = this.audioProcessing;
            if (audioProcessorInterface != null) {
                buffer.getClass();
                audioProcessorInterface.processAudio(numBands, numFrames, buffer);
            }
        }

        @Override // livekit.org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
        public void reset(int newRate) {
            AudioProcessorInterface audioProcessorInterface = this.audioProcessing;
            if (audioProcessorInterface != null) {
                audioProcessorInterface.resetAudioProcessing(newRate);
            }
        }

        public final void setAudioProcessing(AudioProcessorInterface audioProcessorInterface) {
            this.audioProcessing = audioProcessorInterface;
        }

        public AudioProcessingBridge(AudioProcessorInterface audioProcessorInterface) {
            this.audioProcessing = audioProcessorInterface;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AudioProcessingBridge() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomAudioProcessingFactory(AudioProcessorOptions audioProcessorOptions) {
        this();
        audioProcessorOptions.getClass();
        setCapturePostProcessor(audioProcessorOptions.getCapturePostProcessor());
        setRenderPreProcessor(audioProcessorOptions.getRenderPreProcessor());
        setBypassCapturePostProcessing(audioProcessorOptions.getCapturePostBypass());
        setBypassRenderPreProcessing(audioProcessorOptions.getRenderPreBypass());
    }
}
