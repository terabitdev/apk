package io.livekit.android.room.track;

import com.google.android.gms.internal.play_billing.b;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lio/livekit/android/room/track/LocalAudioTrackOptions;", "", "noiseSuppression", "", "echoCancellation", "autoGainControl", "highPassFilter", "typingNoiseDetection", "(ZZZZZ)V", "getAutoGainControl", "()Z", "getEchoCancellation", "getHighPassFilter", "getNoiseSuppression", "getTypingNoiseDetection", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class LocalAudioTrackOptions {
    private final boolean autoGainControl;
    private final boolean echoCancellation;
    private final boolean highPassFilter;
    private final boolean noiseSuppression;
    private final boolean typingNoiseDetection;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LocalAudioTrackOptions(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, int i10, f fVar) {
        this(z6, z10, z11, z12, r7);
        boolean z14;
        z6 = (i10 & 1) != 0 ? true : z6;
        z10 = (i10 & 2) != 0 ? true : z10;
        z11 = (i10 & 4) != 0 ? true : z11;
        z12 = (i10 & 8) != 0 ? true : z12;
        if ((i10 & 16) != 0) {
            z14 = true;
        } else {
            z14 = z13;
        }
    }

    public static /* synthetic */ LocalAudioTrackOptions copy$default(LocalAudioTrackOptions localAudioTrackOptions, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = localAudioTrackOptions.noiseSuppression;
        }
        if ((i10 & 2) != 0) {
            z10 = localAudioTrackOptions.echoCancellation;
        }
        if ((i10 & 4) != 0) {
            z11 = localAudioTrackOptions.autoGainControl;
        }
        if ((i10 & 8) != 0) {
            z12 = localAudioTrackOptions.highPassFilter;
        }
        if ((i10 & 16) != 0) {
            z13 = localAudioTrackOptions.typingNoiseDetection;
        }
        boolean z14 = z13;
        boolean z15 = z11;
        return localAudioTrackOptions.copy(z6, z10, z15, z12, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNoiseSuppression() {
        return this.noiseSuppression;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEchoCancellation() {
        return this.echoCancellation;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAutoGainControl() {
        return this.autoGainControl;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHighPassFilter() {
        return this.highPassFilter;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTypingNoiseDetection() {
        return this.typingNoiseDetection;
    }

    public final LocalAudioTrackOptions copy(boolean noiseSuppression, boolean echoCancellation, boolean autoGainControl, boolean highPassFilter, boolean typingNoiseDetection) {
        return new LocalAudioTrackOptions(noiseSuppression, echoCancellation, autoGainControl, highPassFilter, typingNoiseDetection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalAudioTrackOptions)) {
            return false;
        }
        LocalAudioTrackOptions localAudioTrackOptions = (LocalAudioTrackOptions) other;
        if (this.noiseSuppression == localAudioTrackOptions.noiseSuppression && this.echoCancellation == localAudioTrackOptions.echoCancellation && this.autoGainControl == localAudioTrackOptions.autoGainControl && this.highPassFilter == localAudioTrackOptions.highPassFilter && this.typingNoiseDetection == localAudioTrackOptions.typingNoiseDetection) {
            return true;
        }
        return false;
    }

    public final boolean getAutoGainControl() {
        return this.autoGainControl;
    }

    public final boolean getEchoCancellation() {
        return this.echoCancellation;
    }

    public final boolean getHighPassFilter() {
        return this.highPassFilter;
    }

    public final boolean getNoiseSuppression() {
        return this.noiseSuppression;
    }

    public final boolean getTypingNoiseDetection() {
        return this.typingNoiseDetection;
    }

    public int hashCode() {
        return Boolean.hashCode(this.typingNoiseDetection) + b.f(b.f(b.f(Boolean.hashCode(this.noiseSuppression) * 31, 31, this.echoCancellation), 31, this.autoGainControl), 31, this.highPassFilter);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocalAudioTrackOptions(noiseSuppression=");
        sb.append(this.noiseSuppression);
        sb.append(", echoCancellation=");
        sb.append(this.echoCancellation);
        sb.append(", autoGainControl=");
        sb.append(this.autoGainControl);
        sb.append(", highPassFilter=");
        sb.append(this.highPassFilter);
        sb.append(", typingNoiseDetection=");
        return c.n(sb, this.typingNoiseDetection, ')');
    }

    public LocalAudioTrackOptions(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.noiseSuppression = z6;
        this.echoCancellation = z10;
        this.autoGainControl = z11;
        this.highPassFilter = z12;
        this.typingNoiseDetection = z13;
    }

    public LocalAudioTrackOptions() {
        this(false, false, false, false, false, 31, null);
    }
}
