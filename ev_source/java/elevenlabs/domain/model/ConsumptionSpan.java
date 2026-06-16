package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\u000eHÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0011HÆ\u0003J\t\u0010;\u001a\u00020\u0013HÆ\u0003J\t\u0010<\u001a\u00020\u0015HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010?J\u0014\u0010@\u001a\u00020\u00152\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010B\u001a\u00020CHÖ\u0081\u0004J\n\u0010D\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001a¨\u0006E"}, d2 = {"Lio/elevenlabs/domain/model/ConsumptionSpan;", "", "id", "", "readId", "audioFileNumber", "startSeconds", "", "endSeconds", "startCharOffset", "", "endCharOffset", "listenedAtUnix", "playbackSpeed", "", "realTimeDurationSeconds", "type", "Lio/elevenlabs/domain/model/AudioType;", "playbackSource", "Lio/elevenlabs/domain/model/PlaybackSource;", "deviceOnline", "", "voiceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Long;Ljava/lang/Long;JFDLio/elevenlabs/domain/model/AudioType;Lio/elevenlabs/domain/model/PlaybackSource;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getReadId", "getAudioFileNumber", "getStartSeconds", "()D", "getEndSeconds", "getStartCharOffset", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndCharOffset", "getListenedAtUnix", "()J", "getPlaybackSpeed", "()F", "getRealTimeDurationSeconds", "getType", "()Lio/elevenlabs/domain/model/AudioType;", "getPlaybackSource", "()Lio/elevenlabs/domain/model/PlaybackSource;", "getDeviceOnline", "()Z", "getVoiceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Long;Ljava/lang/Long;JFDLio/elevenlabs/domain/model/AudioType;Lio/elevenlabs/domain/model/PlaybackSource;ZLjava/lang/String;)Lio/elevenlabs/domain/model/ConsumptionSpan;", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ConsumptionSpan {
    private final String audioFileNumber;
    private final boolean deviceOnline;
    private final Long endCharOffset;
    private final double endSeconds;
    private final String id;
    private final long listenedAtUnix;
    private final PlaybackSource playbackSource;
    private final float playbackSpeed;
    private final String readId;
    private final double realTimeDurationSeconds;
    private final Long startCharOffset;
    private final double startSeconds;
    private final AudioType type;
    private final String voiceId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConsumptionSpan(String str, String str2, String str3, double d10, double d11, Long l4, Long l7, long j4, float f10, double d12, AudioType audioType, PlaybackSource playbackSource, boolean z6, String str4, int i10, f fVar) {
        this(str, str2, str3, d10, d11, r11, r12, j4, f10, d12, audioType, playbackSource, z6, r21);
        Long l10;
        Long l11;
        String str5;
        if ((i10 & 32) != 0) {
            l10 = null;
        } else {
            l10 = l4;
        }
        if ((i10 & 64) != 0) {
            l11 = null;
        } else {
            l11 = l7;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
    }

    public static /* synthetic */ ConsumptionSpan copy$default(ConsumptionSpan consumptionSpan, String str, String str2, String str3, double d10, double d11, Long l4, Long l7, long j4, float f10, double d12, AudioType audioType, PlaybackSource playbackSource, boolean z6, String str4, int i10, Object obj) {
        String str5;
        String str6;
        String str7;
        double d13;
        double d14;
        Long l10;
        Long l11;
        long j10;
        float f11;
        double d15;
        AudioType audioType2;
        PlaybackSource playbackSource2;
        boolean z10;
        String str8;
        if ((i10 & 1) != 0) {
            str5 = consumptionSpan.id;
        } else {
            str5 = str;
        }
        if ((i10 & 2) != 0) {
            str6 = consumptionSpan.readId;
        } else {
            str6 = str2;
        }
        if ((i10 & 4) != 0) {
            str7 = consumptionSpan.audioFileNumber;
        } else {
            str7 = str3;
        }
        if ((i10 & 8) != 0) {
            d13 = consumptionSpan.startSeconds;
        } else {
            d13 = d10;
        }
        if ((i10 & 16) != 0) {
            d14 = consumptionSpan.endSeconds;
        } else {
            d14 = d11;
        }
        if ((i10 & 32) != 0) {
            l10 = consumptionSpan.startCharOffset;
        } else {
            l10 = l4;
        }
        if ((i10 & 64) != 0) {
            l11 = consumptionSpan.endCharOffset;
        } else {
            l11 = l7;
        }
        if ((i10 & 128) != 0) {
            j10 = consumptionSpan.listenedAtUnix;
        } else {
            j10 = j4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            f11 = consumptionSpan.playbackSpeed;
        } else {
            f11 = f10;
        }
        if ((i10 & 512) != 0) {
            d15 = consumptionSpan.realTimeDurationSeconds;
        } else {
            d15 = d12;
        }
        String str9 = str5;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            audioType2 = consumptionSpan.type;
        } else {
            audioType2 = audioType;
        }
        AudioType audioType3 = audioType2;
        if ((i10 & 2048) != 0) {
            playbackSource2 = consumptionSpan.playbackSource;
        } else {
            playbackSource2 = playbackSource;
        }
        PlaybackSource playbackSource3 = playbackSource2;
        if ((i10 & 4096) != 0) {
            z10 = consumptionSpan.deviceOnline;
        } else {
            z10 = z6;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str8 = consumptionSpan.voiceId;
        } else {
            str8 = str4;
        }
        return consumptionSpan.copy(str9, str6, str7, d13, d14, l10, l11, j10, f11, d15, audioType3, playbackSource3, z10, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final double getRealTimeDurationSeconds() {
        return this.realTimeDurationSeconds;
    }

    /* renamed from: component11, reason: from getter */
    public final AudioType getType() {
        return this.type;
    }

    /* renamed from: component12, reason: from getter */
    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getDeviceOnline() {
        return this.deviceOnline;
    }

    /* renamed from: component14, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final double getStartSeconds() {
        return this.startSeconds;
    }

    /* renamed from: component5, reason: from getter */
    public final double getEndSeconds() {
        return this.endSeconds;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getStartCharOffset() {
        return this.startCharOffset;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getEndCharOffset() {
        return this.endCharOffset;
    }

    /* renamed from: component8, reason: from getter */
    public final long getListenedAtUnix() {
        return this.listenedAtUnix;
    }

    /* renamed from: component9, reason: from getter */
    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final ConsumptionSpan copy(String id2, String readId, String audioFileNumber, double startSeconds, double endSeconds, Long startCharOffset, Long endCharOffset, long listenedAtUnix, float playbackSpeed, double realTimeDurationSeconds, AudioType type, PlaybackSource playbackSource, boolean deviceOnline, String voiceId) {
        id2.getClass();
        readId.getClass();
        type.getClass();
        playbackSource.getClass();
        return new ConsumptionSpan(id2, readId, audioFileNumber, startSeconds, endSeconds, startCharOffset, endCharOffset, listenedAtUnix, playbackSpeed, realTimeDurationSeconds, type, playbackSource, deviceOnline, voiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumptionSpan)) {
            return false;
        }
        ConsumptionSpan consumptionSpan = (ConsumptionSpan) other;
        if (m.c(this.id, consumptionSpan.id) && m.c(this.readId, consumptionSpan.readId) && m.c(this.audioFileNumber, consumptionSpan.audioFileNumber) && Double.compare(this.startSeconds, consumptionSpan.startSeconds) == 0 && Double.compare(this.endSeconds, consumptionSpan.endSeconds) == 0 && m.c(this.startCharOffset, consumptionSpan.startCharOffset) && m.c(this.endCharOffset, consumptionSpan.endCharOffset) && this.listenedAtUnix == consumptionSpan.listenedAtUnix && Float.compare(this.playbackSpeed, consumptionSpan.playbackSpeed) == 0 && Double.compare(this.realTimeDurationSeconds, consumptionSpan.realTimeDurationSeconds) == 0 && this.type == consumptionSpan.type && this.playbackSource == consumptionSpan.playbackSource && this.deviceOnline == consumptionSpan.deviceOnline && m.c(this.voiceId, consumptionSpan.voiceId)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final boolean getDeviceOnline() {
        return this.deviceOnline;
    }

    public final Long getEndCharOffset() {
        return this.endCharOffset;
    }

    public final double getEndSeconds() {
        return this.endSeconds;
    }

    public final String getId() {
        return this.id;
    }

    public final long getListenedAtUnix() {
        return this.listenedAtUnix;
    }

    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final double getRealTimeDurationSeconds() {
        return this.realTimeDurationSeconds;
    }

    public final Long getStartCharOffset() {
        return this.startCharOffset;
    }

    public final double getStartSeconds() {
        return this.startSeconds;
    }

    public final AudioType getType() {
        return this.type;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.readId);
        String str = this.audioFileNumber;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = n.c(n.c((c5 + hashCode) * 31, 31, this.startSeconds), 31, this.endSeconds);
        Long l4 = this.startCharOffset;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i11 = (c10 + hashCode2) * 31;
        Long l7 = this.endCharOffset;
        if (l7 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l7.hashCode();
        }
        int f10 = b.f((this.playbackSource.hashCode() + ((this.type.hashCode() + n.c(b.c(this.playbackSpeed, b.g(this.listenedAtUnix, (i11 + hashCode3) * 31, 31), 31), 31, this.realTimeDurationSeconds)) * 31)) * 31, 31, this.deviceOnline);
        String str2 = this.voiceId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return f10 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.readId;
        String str3 = this.audioFileNumber;
        double d10 = this.startSeconds;
        double d11 = this.endSeconds;
        Long l4 = this.startCharOffset;
        Long l7 = this.endCharOffset;
        long j4 = this.listenedAtUnix;
        float f10 = this.playbackSpeed;
        double d12 = this.realTimeDurationSeconds;
        AudioType audioType = this.type;
        PlaybackSource playbackSource = this.playbackSource;
        boolean z6 = this.deviceOnline;
        String str4 = this.voiceId;
        StringBuilder s10 = defpackage.f.s("ConsumptionSpan(id=", str, ", readId=", str2, ", audioFileNumber=");
        s10.append(str3);
        s10.append(", startSeconds=");
        s10.append(d10);
        s10.append(", endSeconds=");
        s10.append(d11);
        s10.append(", startCharOffset=");
        s10.append(l4);
        s10.append(", endCharOffset=");
        s10.append(l7);
        s10.append(", listenedAtUnix=");
        s10.append(j4);
        s10.append(", playbackSpeed=");
        s10.append(f10);
        s10.append(", realTimeDurationSeconds=");
        s10.append(d12);
        s10.append(", type=");
        s10.append(audioType);
        s10.append(", playbackSource=");
        s10.append(playbackSource);
        s10.append(", deviceOnline=");
        s10.append(z6);
        s10.append(", voiceId=");
        s10.append(str4);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public ConsumptionSpan(String str, String str2, String str3, double d10, double d11, Long l4, Long l7, long j4, float f10, double d12, AudioType audioType, PlaybackSource playbackSource, boolean z6, String str4) {
        str.getClass();
        str2.getClass();
        audioType.getClass();
        playbackSource.getClass();
        this.id = str;
        this.readId = str2;
        this.audioFileNumber = str3;
        this.startSeconds = d10;
        this.endSeconds = d11;
        this.startCharOffset = l4;
        this.endCharOffset = l7;
        this.listenedAtUnix = j4;
        this.playbackSpeed = f10;
        this.realTimeDurationSeconds = d12;
        this.type = audioType;
        this.playbackSource = playbackSource;
        this.deviceOnline = z6;
        this.voiceId = str4;
    }
}
