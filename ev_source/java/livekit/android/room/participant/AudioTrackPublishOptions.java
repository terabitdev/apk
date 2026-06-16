package io.livekit.android.room.participant;

import as.s6;
import com.google.android.gms.internal.play_billing.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.room.track.Track;
import j0.c;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fB5\b\u0016\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u0011J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ^\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b4\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b5\u0010\u001c¨\u00066"}, d2 = {"Lio/livekit/android/room/participant/AudioTrackPublishOptions;", "Lio/livekit/android/room/participant/BaseAudioTrackPublishOptions;", "Lio/livekit/android/room/participant/TrackPublishOptions;", "", DiagnosticsEntry.NAME_KEY, "", "audioBitrate", "", "dtx", "red", "Lio/livekit/android/room/track/Track$Source;", "source", "stream", "preconnect", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZZLio/livekit/android/room/track/Track$Source;Ljava/lang/String;Z)V", "base", "(Ljava/lang/String;Lio/livekit/android/room/participant/BaseAudioTrackPublishOptions;Lio/livekit/android/room/track/Track$Source;Ljava/lang/String;)V", "", "Las/s6;", "getFeaturesList$livekit_android_sdk_release", "()Ljava/util/Set;", "getFeaturesList", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "component4", "component5", "()Lio/livekit/android/room/track/Track$Source;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ZZLio/livekit/android/room/track/Track$Source;Ljava/lang/String;Z)Lio/livekit/android/room/participant/AudioTrackPublishOptions;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getAudioBitrate", "Z", "getDtx", "getRed", "Lio/livekit/android/room/track/Track$Source;", "getSource", "getStream", "getPreconnect", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AudioTrackPublishOptions extends BaseAudioTrackPublishOptions implements TrackPublishOptions {
    private final Integer audioBitrate;
    private final boolean dtx;
    private final String name;
    private final boolean preconnect;
    private final boolean red;
    private final Track.Source source;
    private final String stream;

    public /* synthetic */ AudioTrackPublishOptions(String str, Integer num, boolean z6, boolean z10, Track.Source source, String str2, boolean z11, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? true : z6, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : source, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? false : z11);
    }

    public static /* synthetic */ AudioTrackPublishOptions copy$default(AudioTrackPublishOptions audioTrackPublishOptions, String str, Integer num, boolean z6, boolean z10, Track.Source source, String str2, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = audioTrackPublishOptions.name;
        }
        if ((i10 & 2) != 0) {
            num = audioTrackPublishOptions.audioBitrate;
        }
        if ((i10 & 4) != 0) {
            z6 = audioTrackPublishOptions.dtx;
        }
        if ((i10 & 8) != 0) {
            z10 = audioTrackPublishOptions.red;
        }
        if ((i10 & 16) != 0) {
            source = audioTrackPublishOptions.source;
        }
        if ((i10 & 32) != 0) {
            str2 = audioTrackPublishOptions.stream;
        }
        if ((i10 & 64) != 0) {
            z11 = audioTrackPublishOptions.preconnect;
        }
        String str3 = str2;
        boolean z12 = z11;
        Track.Source source2 = source;
        boolean z13 = z6;
        return audioTrackPublishOptions.copy(str, num, z13, z10, source2, str3, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDtx() {
        return this.dtx;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRed() {
        return this.red;
    }

    /* renamed from: component5, reason: from getter */
    public final Track.Source getSource() {
        return this.source;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStream() {
        return this.stream;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPreconnect() {
        return this.preconnect;
    }

    public final AudioTrackPublishOptions copy(String name, Integer audioBitrate, boolean dtx, boolean red, Track.Source source, String stream, boolean preconnect) {
        return new AudioTrackPublishOptions(name, audioBitrate, dtx, red, source, stream, preconnect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioTrackPublishOptions)) {
            return false;
        }
        AudioTrackPublishOptions audioTrackPublishOptions = (AudioTrackPublishOptions) other;
        if (m.c(this.name, audioTrackPublishOptions.name) && m.c(this.audioBitrate, audioTrackPublishOptions.audioBitrate) && this.dtx == audioTrackPublishOptions.dtx && this.red == audioTrackPublishOptions.red && this.source == audioTrackPublishOptions.source && m.c(this.stream, audioTrackPublishOptions.stream) && this.preconnect == audioTrackPublishOptions.preconnect) {
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

    public final Set<s6> getFeaturesList$livekit_android_sdk_release() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!getDtx()) {
            linkedHashSet.add(s6.TF_NO_DTX);
        }
        if (this.preconnect) {
            linkedHashSet.add(s6.TF_PRECONNECT_BUFFER);
        }
        return linkedHashSet;
    }

    @Override // io.livekit.android.room.participant.TrackPublishOptions
    public String getName() {
        return this.name;
    }

    public final boolean getPreconnect() {
        return this.preconnect;
    }

    @Override // io.livekit.android.room.participant.BaseAudioTrackPublishOptions
    public boolean getRed() {
        return this.red;
    }

    @Override // io.livekit.android.room.participant.TrackPublishOptions
    public Track.Source getSource() {
        return this.source;
    }

    @Override // io.livekit.android.room.participant.TrackPublishOptions
    public String getStream() {
        return this.stream;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.name;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        Integer num = this.audioBitrate;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int f10 = b.f(b.f((i11 + hashCode2) * 31, 31, this.dtx), 31, this.red);
        Track.Source source = this.source;
        if (source == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = source.hashCode();
        }
        int i12 = (f10 + hashCode3) * 31;
        String str2 = this.stream;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return Boolean.hashCode(this.preconnect) + ((i12 + i10) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackPublishOptions(name=");
        sb.append(this.name);
        sb.append(", audioBitrate=");
        sb.append(this.audioBitrate);
        sb.append(", dtx=");
        sb.append(this.dtx);
        sb.append(", red=");
        sb.append(this.red);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", stream=");
        sb.append(this.stream);
        sb.append(", preconnect=");
        return c.n(sb, this.preconnect, ')');
    }

    public AudioTrackPublishOptions() {
        this(null, null, false, false, null, null, false, 127, null);
    }

    public AudioTrackPublishOptions(String str, Integer num, boolean z6, boolean z10, Track.Source source, String str2, boolean z11) {
        this.name = str;
        this.audioBitrate = num;
        this.dtx = z6;
        this.red = z10;
        this.source = source;
        this.stream = str2;
        this.preconnect = z11;
    }

    public /* synthetic */ AudioTrackPublishOptions(String str, BaseAudioTrackPublishOptions baseAudioTrackPublishOptions, Track.Source source, String str2, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, baseAudioTrackPublishOptions, (i10 & 4) != 0 ? null : source, (i10 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioTrackPublishOptions(String str, BaseAudioTrackPublishOptions baseAudioTrackPublishOptions, Track.Source source, String str2) {
        this(str, baseAudioTrackPublishOptions.getAudioBitrate(), baseAudioTrackPublishOptions.getDtx(), baseAudioTrackPublishOptions.getRed(), source, str2, false, 64, null);
        baseAudioTrackPublishOptions.getClass();
    }
}
