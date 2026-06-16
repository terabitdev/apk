package io.livekit.android;

import android.media.AudioAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lio/livekit/android/AudioType;", "", "audioMode", "", "audioAttributes", "Landroid/media/AudioAttributes;", "audioStreamType", "(ILandroid/media/AudioAttributes;I)V", "getAudioAttributes", "()Landroid/media/AudioAttributes;", "getAudioMode", "()I", "getAudioStreamType", "CallAudioType", "CustomAudioType", "MediaAudioType", "Lio/livekit/android/AudioType$CallAudioType;", "Lio/livekit/android/AudioType$CustomAudioType;", "Lio/livekit/android/AudioType$MediaAudioType;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class AudioType {
    private final AudioAttributes audioAttributes;
    private final int audioMode;
    private final int audioStreamType;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/AudioType$CallAudioType;", "Lio/livekit/android/AudioType;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class CallAudioType extends AudioType {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CallAudioType() {
            super(3, r0, 0, null);
            AudioAttributes build = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
            build.getClass();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/AudioType$CustomAudioType;", "Lio/livekit/android/AudioType;", "audioMode", "", "audioAttributes", "Landroid/media/AudioAttributes;", "audioStreamType", "(ILandroid/media/AudioAttributes;I)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class CustomAudioType extends AudioType {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAudioType(int i10, AudioAttributes audioAttributes, int i11) {
            super(i10, audioAttributes, i11, null);
            audioAttributes.getClass();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/AudioType$MediaAudioType;", "Lio/livekit/android/AudioType;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class MediaAudioType extends AudioType {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MediaAudioType() {
            super(0, r0, 3, null);
            AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(0).build();
            build.getClass();
        }
    }

    private AudioType(int i10, AudioAttributes audioAttributes, int i11) {
        this.audioMode = i10;
        this.audioAttributes = audioAttributes;
        this.audioStreamType = i11;
    }

    public final AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    public final int getAudioMode() {
        return this.audioMode;
    }

    public final int getAudioStreamType() {
        return this.audioStreamType;
    }

    public /* synthetic */ AudioType(int i10, AudioAttributes audioAttributes, int i11, f fVar) {
        this(i10, audioAttributes, i11);
    }
}
