package io.livekit.android.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lio/livekit/android/audio/AudioProcessorOptions;", "", "capturePostProcessor", "Lio/livekit/android/audio/AudioProcessorInterface;", "capturePostBypass", "", "renderPreProcessor", "renderPreBypass", "(Lio/livekit/android/audio/AudioProcessorInterface;ZLio/livekit/android/audio/AudioProcessorInterface;Z)V", "getCapturePostBypass", "()Z", "getCapturePostProcessor", "()Lio/livekit/android/audio/AudioProcessorInterface;", "getRenderPreBypass", "getRenderPreProcessor", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AudioProcessorOptions {
    private final boolean capturePostBypass;
    private final AudioProcessorInterface capturePostProcessor;
    private final boolean renderPreBypass;
    private final AudioProcessorInterface renderPreProcessor;

    public /* synthetic */ AudioProcessorOptions(AudioProcessorInterface audioProcessorInterface, boolean z6, AudioProcessorInterface audioProcessorInterface2, boolean z10, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : audioProcessorInterface, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? null : audioProcessorInterface2, (i10 & 8) != 0 ? false : z10);
    }

    public static /* synthetic */ AudioProcessorOptions copy$default(AudioProcessorOptions audioProcessorOptions, AudioProcessorInterface audioProcessorInterface, boolean z6, AudioProcessorInterface audioProcessorInterface2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            audioProcessorInterface = audioProcessorOptions.capturePostProcessor;
        }
        if ((i10 & 2) != 0) {
            z6 = audioProcessorOptions.capturePostBypass;
        }
        if ((i10 & 4) != 0) {
            audioProcessorInterface2 = audioProcessorOptions.renderPreProcessor;
        }
        if ((i10 & 8) != 0) {
            z10 = audioProcessorOptions.renderPreBypass;
        }
        return audioProcessorOptions.copy(audioProcessorInterface, z6, audioProcessorInterface2, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final AudioProcessorInterface getCapturePostProcessor() {
        return this.capturePostProcessor;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCapturePostBypass() {
        return this.capturePostBypass;
    }

    /* renamed from: component3, reason: from getter */
    public final AudioProcessorInterface getRenderPreProcessor() {
        return this.renderPreProcessor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRenderPreBypass() {
        return this.renderPreBypass;
    }

    public final AudioProcessorOptions copy(AudioProcessorInterface capturePostProcessor, boolean capturePostBypass, AudioProcessorInterface renderPreProcessor, boolean renderPreBypass) {
        return new AudioProcessorOptions(capturePostProcessor, capturePostBypass, renderPreProcessor, renderPreBypass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioProcessorOptions)) {
            return false;
        }
        AudioProcessorOptions audioProcessorOptions = (AudioProcessorOptions) other;
        if (m.c(this.capturePostProcessor, audioProcessorOptions.capturePostProcessor) && this.capturePostBypass == audioProcessorOptions.capturePostBypass && m.c(this.renderPreProcessor, audioProcessorOptions.renderPreProcessor) && this.renderPreBypass == audioProcessorOptions.renderPreBypass) {
            return true;
        }
        return false;
    }

    public final boolean getCapturePostBypass() {
        return this.capturePostBypass;
    }

    public final AudioProcessorInterface getCapturePostProcessor() {
        return this.capturePostProcessor;
    }

    public final boolean getRenderPreBypass() {
        return this.renderPreBypass;
    }

    public final AudioProcessorInterface getRenderPreProcessor() {
        return this.renderPreProcessor;
    }

    public int hashCode() {
        int hashCode;
        AudioProcessorInterface audioProcessorInterface = this.capturePostProcessor;
        int i10 = 0;
        if (audioProcessorInterface == null) {
            hashCode = 0;
        } else {
            hashCode = audioProcessorInterface.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.capturePostBypass);
        AudioProcessorInterface audioProcessorInterface2 = this.renderPreProcessor;
        if (audioProcessorInterface2 != null) {
            i10 = audioProcessorInterface2.hashCode();
        }
        return Boolean.hashCode(this.renderPreBypass) + ((f10 + i10) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioProcessorOptions(capturePostProcessor=");
        sb.append(this.capturePostProcessor);
        sb.append(", capturePostBypass=");
        sb.append(this.capturePostBypass);
        sb.append(", renderPreProcessor=");
        sb.append(this.renderPreProcessor);
        sb.append(", renderPreBypass=");
        return j0.c.n(sb, this.renderPreBypass, ')');
    }

    public AudioProcessorOptions(AudioProcessorInterface audioProcessorInterface, boolean z6, AudioProcessorInterface audioProcessorInterface2, boolean z10) {
        this.capturePostProcessor = audioProcessorInterface;
        this.capturePostBypass = z6;
        this.renderPreProcessor = audioProcessorInterface2;
        this.renderPreBypass = z10;
    }

    public AudioProcessorOptions() {
        this(null, false, null, false, 15, null);
    }
}
