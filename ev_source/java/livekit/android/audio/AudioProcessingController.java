package io.livekit.android.audio;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0006R\"\u0010\u001b\u001a\u00020\u00078g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\nR\"\u0010\u001f\u001a\u00020\u00078g@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\n¨\u0006 "}, d2 = {"Lio/livekit/android/audio/AudioProcessingController;", "", "Lio/livekit/android/audio/AudioProcessorInterface;", "processing", "Lsn/z;", "setCapturePostProcessing", "(Lio/livekit/android/audio/AudioProcessorInterface;)V", "", "bypass", "setBypassForCapturePostProcessing", "(Z)V", "setRenderPreProcessing", "setBypassForRenderPreProcessing", "getCapturePostProcessor", "()Lio/livekit/android/audio/AudioProcessorInterface;", "setCapturePostProcessor", "getCapturePostProcessor$annotations", "()V", "capturePostProcessor", "getRenderPreProcessor", "setRenderPreProcessor", "getRenderPreProcessor$annotations", "renderPreProcessor", "getBypassRenderPreProcessing", "()Z", "setBypassRenderPreProcessing", "getBypassRenderPreProcessing$annotations", "bypassRenderPreProcessing", "getBypassCapturePostProcessing", "setBypassCapturePostProcessing", "getBypassCapturePostProcessing$annotations", "bypassCapturePostProcessing", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface AudioProcessingController {
    boolean getBypassCapturePostProcessing();

    boolean getBypassRenderPreProcessing();

    AudioProcessorInterface getCapturePostProcessor();

    AudioProcessorInterface getRenderPreProcessor();

    void setBypassCapturePostProcessing(boolean z6);

    @sn.c
    void setBypassForCapturePostProcessing(boolean bypass);

    @sn.c
    void setBypassForRenderPreProcessing(boolean bypass);

    void setBypassRenderPreProcessing(boolean z6);

    @sn.c
    void setCapturePostProcessing(AudioProcessorInterface processing);

    void setCapturePostProcessor(AudioProcessorInterface audioProcessorInterface);

    @sn.c
    void setRenderPreProcessing(AudioProcessorInterface processing);

    void setRenderPreProcessor(AudioProcessorInterface audioProcessorInterface);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getBypassCapturePostProcessing$annotations() {
        }

        public static /* synthetic */ void getBypassRenderPreProcessing$annotations() {
        }

        public static /* synthetic */ void getCapturePostProcessor$annotations() {
        }

        public static /* synthetic */ void getRenderPreProcessor$annotations() {
        }
    }
}
