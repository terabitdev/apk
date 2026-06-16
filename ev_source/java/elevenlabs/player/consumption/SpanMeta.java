package io.elevenlabs.player.consumption;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.PlaybackSource;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006&"}, d2 = {"Lio/elevenlabs/player/consumption/SpanMeta;", "", "audioFileNumber", "", "audioType", "Lio/elevenlabs/domain/model/AudioType;", "playbackSource", "Lio/elevenlabs/domain/model/PlaybackSource;", "deviceOnline", "", "playbackSpeed", "", "voiceId", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/AudioType;Lio/elevenlabs/domain/model/PlaybackSource;ZFLjava/lang/String;)V", "getAudioFileNumber", "()Ljava/lang/String;", "getAudioType", "()Lio/elevenlabs/domain/model/AudioType;", "getPlaybackSource", "()Lio/elevenlabs/domain/model/PlaybackSource;", "getDeviceOnline", "()Z", "getPlaybackSpeed", "()F", "getVoiceId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SpanMeta {
    private final String audioFileNumber;
    private final AudioType audioType;
    private final boolean deviceOnline;
    private final PlaybackSource playbackSource;
    private final float playbackSpeed;
    private final String voiceId;

    public SpanMeta(String str, AudioType audioType, PlaybackSource playbackSource, boolean z6, float f10, String str2) {
        audioType.getClass();
        playbackSource.getClass();
        this.audioFileNumber = str;
        this.audioType = audioType;
        this.playbackSource = playbackSource;
        this.deviceOnline = z6;
        this.playbackSpeed = f10;
        this.voiceId = str2;
    }

    public static /* synthetic */ SpanMeta copy$default(SpanMeta spanMeta, String str, AudioType audioType, PlaybackSource playbackSource, boolean z6, float f10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = spanMeta.audioFileNumber;
        }
        if ((i10 & 2) != 0) {
            audioType = spanMeta.audioType;
        }
        if ((i10 & 4) != 0) {
            playbackSource = spanMeta.playbackSource;
        }
        if ((i10 & 8) != 0) {
            z6 = spanMeta.deviceOnline;
        }
        if ((i10 & 16) != 0) {
            f10 = spanMeta.playbackSpeed;
        }
        if ((i10 & 32) != 0) {
            str2 = spanMeta.voiceId;
        }
        float f11 = f10;
        String str3 = str2;
        return spanMeta.copy(str, audioType, playbackSource, z6, f11, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final AudioType getAudioType() {
        return this.audioType;
    }

    /* renamed from: component3, reason: from getter */
    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDeviceOnline() {
        return this.deviceOnline;
    }

    /* renamed from: component5, reason: from getter */
    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    public final SpanMeta copy(String audioFileNumber, AudioType audioType, PlaybackSource playbackSource, boolean deviceOnline, float playbackSpeed, String voiceId) {
        audioType.getClass();
        playbackSource.getClass();
        return new SpanMeta(audioFileNumber, audioType, playbackSource, deviceOnline, playbackSpeed, voiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanMeta)) {
            return false;
        }
        SpanMeta spanMeta = (SpanMeta) other;
        if (m.c(this.audioFileNumber, spanMeta.audioFileNumber) && this.audioType == spanMeta.audioType && this.playbackSource == spanMeta.playbackSource && this.deviceOnline == spanMeta.deviceOnline && Float.compare(this.playbackSpeed, spanMeta.playbackSpeed) == 0 && m.c(this.voiceId, spanMeta.voiceId)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final AudioType getAudioType() {
        return this.audioType;
    }

    public final boolean getDeviceOnline() {
        return this.deviceOnline;
    }

    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        String str = this.audioFileNumber;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c5 = b.c(this.playbackSpeed, b.f((this.playbackSource.hashCode() + ((this.audioType.hashCode() + (hashCode * 31)) * 31)) * 31, 31, this.deviceOnline), 31);
        String str2 = this.voiceId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return c5 + i10;
    }

    public String toString() {
        return "SpanMeta(audioFileNumber=" + this.audioFileNumber + ", audioType=" + this.audioType + ", playbackSource=" + this.playbackSource + ", deviceOnline=" + this.deviceOnline + ", playbackSpeed=" + this.playbackSpeed + ", voiceId=" + this.voiceId + Separators.RPAREN;
    }

    public /* synthetic */ SpanMeta(String str, AudioType audioType, PlaybackSource playbackSource, boolean z6, float f10, String str2, int i10, f fVar) {
        this(str, audioType, playbackSource, z6, f10, (i10 & 32) != 0 ? null : str2);
    }
}
