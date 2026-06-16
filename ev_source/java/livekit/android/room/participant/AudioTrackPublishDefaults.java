package io.livekit.android.room.participant;

import com.google.android.gms.internal.play_billing.b;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "Lio/livekit/android/room/participant/BaseAudioTrackPublishOptions;", "audioBitrate", "", "dtx", "", "red", "(Ljava/lang/Integer;ZZ)V", "getAudioBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDtx", "()Z", "getRed", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;ZZ)Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "equals", "other", "", "hashCode", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AudioTrackPublishDefaults extends BaseAudioTrackPublishOptions {
    private final Integer audioBitrate;
    private final boolean dtx;
    private final boolean red;

    public /* synthetic */ AudioTrackPublishDefaults(Integer num, boolean z6, boolean z10, int i10, f fVar) {
        this((i10 & 1) != 0 ? Integer.valueOf(AudioPresets.MUSIC.getMaxBitrate()) : num, (i10 & 2) != 0 ? true : z6, (i10 & 4) != 0 ? true : z10);
    }

    public static /* synthetic */ AudioTrackPublishDefaults copy$default(AudioTrackPublishDefaults audioTrackPublishDefaults, Integer num, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = audioTrackPublishDefaults.audioBitrate;
        }
        if ((i10 & 2) != 0) {
            z6 = audioTrackPublishDefaults.dtx;
        }
        if ((i10 & 4) != 0) {
            z10 = audioTrackPublishDefaults.red;
        }
        return audioTrackPublishDefaults.copy(num, z6, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDtx() {
        return this.dtx;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRed() {
        return this.red;
    }

    public final AudioTrackPublishDefaults copy(Integer audioBitrate, boolean dtx, boolean red) {
        return new AudioTrackPublishDefaults(audioBitrate, dtx, red);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTrackPublishDefaults)) {
            return false;
        }
        AudioTrackPublishDefaults audioTrackPublishDefaults = (AudioTrackPublishDefaults) other;
        if (m.c(this.audioBitrate, audioTrackPublishDefaults.audioBitrate) && this.dtx == audioTrackPublishDefaults.dtx && this.red == audioTrackPublishDefaults.red) {
            return true;
        }
        return false;
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public boolean getDtx() {
        return this.dtx;
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public boolean getRed() {
        return this.red;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.audioBitrate;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Boolean.hashCode(this.red) + b.f(hashCode * 31, 31, this.dtx);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackPublishDefaults(audioBitrate=");
        sb.append(this.audioBitrate);
        sb.append(", dtx=");
        sb.append(this.dtx);
        sb.append(", red=");
        return c.n(sb, this.red, ')');
    }

    public AudioTrackPublishDefaults() {
        this(null, false, false, 7, null);
    }

    public AudioTrackPublishDefaults(Integer num, boolean z6, boolean z10) {
        this.audioBitrate = num;
        this.dtx = z6;
        this.red = z10;
    }
}
