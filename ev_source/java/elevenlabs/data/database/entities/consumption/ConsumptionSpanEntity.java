package io.elevenlabs.data.database.entities.consumption;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.AudioType;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0011HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¦\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\u0014\u0010?\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010A\u001a\u00020BHÖ\u0081\u0004J\n\u0010C\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0019¨\u0006D"}, d2 = {"Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;", "", "id", "", "read_id", "audio_file_number", "start_seconds", "", "end_seconds", "start_char_offset", "", "end_char_offset", "listened_at_unix", "playback_speed", "", "real_time_duration_seconds", "type", "Lio/elevenlabs/domain/model/AudioType;", "playback_source", "device_online", "", "voice_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Long;Ljava/lang/Long;JFDLio/elevenlabs/domain/model/AudioType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRead_id", "getAudio_file_number", "getStart_seconds", "()D", "getEnd_seconds", "getStart_char_offset", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnd_char_offset", "getListened_at_unix", "()J", "getPlayback_speed", "()F", "getReal_time_duration_seconds", "getType", "()Lio/elevenlabs/domain/model/AudioType;", "getPlayback_source", "getDevice_online", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVoice_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Long;Ljava/lang/Long;JFDLio/elevenlabs/domain/model/AudioType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ConsumptionSpanEntity {
    private final String audio_file_number;
    private final Boolean device_online;
    private final Long end_char_offset;
    private final double end_seconds;
    private final String id;
    private final long listened_at_unix;
    private final String playback_source;
    private final float playback_speed;
    private final String read_id;
    private final double real_time_duration_seconds;
    private final Long start_char_offset;
    private final double start_seconds;
    private final AudioType type;
    private final String voice_id;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConsumptionSpanEntity(String str, String str2, String str3, double d10, double d11, Long l4, Long l7, long j4, float f10, double d12, AudioType audioType, String str4, Boolean bool, String str5, int i10, f fVar) {
        this(str, str2, str3, d10, d11, r11, r12, j4, f10, d12, audioType, r19, r20, r21);
        Long l10;
        Long l11;
        String str6;
        Boolean bool2;
        String str7;
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
        if ((i10 & 2048) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i10 & 4096) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str7 = null;
        } else {
            str7 = str5;
        }
    }

    public static /* synthetic */ ConsumptionSpanEntity copy$default(ConsumptionSpanEntity consumptionSpanEntity, String str, String str2, String str3, double d10, double d11, Long l4, Long l7, long j4, float f10, double d12, AudioType audioType, String str4, Boolean bool, String str5, int i10, Object obj) {
        String str6;
        String str7;
        String str8;
        double d13;
        double d14;
        Long l10;
        Long l11;
        long j10;
        float f11;
        double d15;
        AudioType audioType2;
        String str9;
        Boolean bool2;
        String str10;
        if ((i10 & 1) != 0) {
            str6 = consumptionSpanEntity.id;
        } else {
            str6 = str;
        }
        if ((i10 & 2) != 0) {
            str7 = consumptionSpanEntity.read_id;
        } else {
            str7 = str2;
        }
        if ((i10 & 4) != 0) {
            str8 = consumptionSpanEntity.audio_file_number;
        } else {
            str8 = str3;
        }
        if ((i10 & 8) != 0) {
            d13 = consumptionSpanEntity.start_seconds;
        } else {
            d13 = d10;
        }
        if ((i10 & 16) != 0) {
            d14 = consumptionSpanEntity.end_seconds;
        } else {
            d14 = d11;
        }
        if ((i10 & 32) != 0) {
            l10 = consumptionSpanEntity.start_char_offset;
        } else {
            l10 = l4;
        }
        if ((i10 & 64) != 0) {
            l11 = consumptionSpanEntity.end_char_offset;
        } else {
            l11 = l7;
        }
        if ((i10 & 128) != 0) {
            j10 = consumptionSpanEntity.listened_at_unix;
        } else {
            j10 = j4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            f11 = consumptionSpanEntity.playback_speed;
        } else {
            f11 = f10;
        }
        if ((i10 & 512) != 0) {
            d15 = consumptionSpanEntity.real_time_duration_seconds;
        } else {
            d15 = d12;
        }
        String str11 = str6;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            audioType2 = consumptionSpanEntity.type;
        } else {
            audioType2 = audioType;
        }
        AudioType audioType3 = audioType2;
        if ((i10 & 2048) != 0) {
            str9 = consumptionSpanEntity.playback_source;
        } else {
            str9 = str4;
        }
        String str12 = str9;
        if ((i10 & 4096) != 0) {
            bool2 = consumptionSpanEntity.device_online;
        } else {
            bool2 = bool;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str10 = consumptionSpanEntity.voice_id;
        } else {
            str10 = str5;
        }
        return consumptionSpanEntity.copy(str11, str7, str8, d13, d14, l10, l11, j10, f11, d15, audioType3, str12, bool2, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final double getReal_time_duration_seconds() {
        return this.real_time_duration_seconds;
    }

    /* renamed from: component11, reason: from getter */
    public final AudioType getType() {
        return this.type;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPlayback_source() {
        return this.playback_source;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getDevice_online() {
        return this.device_online;
    }

    /* renamed from: component14, reason: from getter */
    public final String getVoice_id() {
        return this.voice_id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRead_id() {
        return this.read_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAudio_file_number() {
        return this.audio_file_number;
    }

    /* renamed from: component4, reason: from getter */
    public final double getStart_seconds() {
        return this.start_seconds;
    }

    /* renamed from: component5, reason: from getter */
    public final double getEnd_seconds() {
        return this.end_seconds;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getStart_char_offset() {
        return this.start_char_offset;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getEnd_char_offset() {
        return this.end_char_offset;
    }

    /* renamed from: component8, reason: from getter */
    public final long getListened_at_unix() {
        return this.listened_at_unix;
    }

    /* renamed from: component9, reason: from getter */
    public final float getPlayback_speed() {
        return this.playback_speed;
    }

    public final ConsumptionSpanEntity copy(String id2, String read_id, String audio_file_number, double start_seconds, double end_seconds, Long start_char_offset, Long end_char_offset, long listened_at_unix, float playback_speed, double real_time_duration_seconds, AudioType type, String playback_source, Boolean device_online, String voice_id) {
        id2.getClass();
        read_id.getClass();
        type.getClass();
        return new ConsumptionSpanEntity(id2, read_id, audio_file_number, start_seconds, end_seconds, start_char_offset, end_char_offset, listened_at_unix, playback_speed, real_time_duration_seconds, type, playback_source, device_online, voice_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumptionSpanEntity)) {
            return false;
        }
        ConsumptionSpanEntity consumptionSpanEntity = (ConsumptionSpanEntity) other;
        if (m.c(this.id, consumptionSpanEntity.id) && m.c(this.read_id, consumptionSpanEntity.read_id) && m.c(this.audio_file_number, consumptionSpanEntity.audio_file_number) && Double.compare(this.start_seconds, consumptionSpanEntity.start_seconds) == 0 && Double.compare(this.end_seconds, consumptionSpanEntity.end_seconds) == 0 && m.c(this.start_char_offset, consumptionSpanEntity.start_char_offset) && m.c(this.end_char_offset, consumptionSpanEntity.end_char_offset) && this.listened_at_unix == consumptionSpanEntity.listened_at_unix && Float.compare(this.playback_speed, consumptionSpanEntity.playback_speed) == 0 && Double.compare(this.real_time_duration_seconds, consumptionSpanEntity.real_time_duration_seconds) == 0 && this.type == consumptionSpanEntity.type && m.c(this.playback_source, consumptionSpanEntity.playback_source) && m.c(this.device_online, consumptionSpanEntity.device_online) && m.c(this.voice_id, consumptionSpanEntity.voice_id)) {
            return true;
        }
        return false;
    }

    public final String getAudio_file_number() {
        return this.audio_file_number;
    }

    public final Boolean getDevice_online() {
        return this.device_online;
    }

    public final Long getEnd_char_offset() {
        return this.end_char_offset;
    }

    public final double getEnd_seconds() {
        return this.end_seconds;
    }

    public final String getId() {
        return this.id;
    }

    public final long getListened_at_unix() {
        return this.listened_at_unix;
    }

    public final String getPlayback_source() {
        return this.playback_source;
    }

    public final float getPlayback_speed() {
        return this.playback_speed;
    }

    public final String getRead_id() {
        return this.read_id;
    }

    public final double getReal_time_duration_seconds() {
        return this.real_time_duration_seconds;
    }

    public final Long getStart_char_offset() {
        return this.start_char_offset;
    }

    public final double getStart_seconds() {
        return this.start_seconds;
    }

    public final AudioType getType() {
        return this.type;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.read_id);
        String str = this.audio_file_number;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = n.c(n.c((c5 + hashCode) * 31, 31, this.start_seconds), 31, this.end_seconds);
        Long l4 = this.start_char_offset;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i11 = (c10 + hashCode2) * 31;
        Long l7 = this.end_char_offset;
        if (l7 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l7.hashCode();
        }
        int hashCode6 = (this.type.hashCode() + n.c(b.c(this.playback_speed, b.g(this.listened_at_unix, (i11 + hashCode3) * 31, 31), 31), 31, this.real_time_duration_seconds)) * 31;
        String str2 = this.playback_source;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i12 = (hashCode6 + hashCode4) * 31;
        Boolean bool = this.device_online;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str3 = this.voice_id;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.read_id;
        String str3 = this.audio_file_number;
        double d10 = this.start_seconds;
        double d11 = this.end_seconds;
        Long l4 = this.start_char_offset;
        Long l7 = this.end_char_offset;
        long j4 = this.listened_at_unix;
        float f10 = this.playback_speed;
        double d12 = this.real_time_duration_seconds;
        AudioType audioType = this.type;
        String str4 = this.playback_source;
        Boolean bool = this.device_online;
        String str5 = this.voice_id;
        StringBuilder s10 = defpackage.f.s("ConsumptionSpanEntity(id=", str, ", read_id=", str2, ", audio_file_number=");
        s10.append(str3);
        s10.append(", start_seconds=");
        s10.append(d10);
        s10.append(", end_seconds=");
        s10.append(d11);
        s10.append(", start_char_offset=");
        s10.append(l4);
        s10.append(", end_char_offset=");
        s10.append(l7);
        s10.append(", listened_at_unix=");
        s10.append(j4);
        s10.append(", playback_speed=");
        s10.append(f10);
        s10.append(", real_time_duration_seconds=");
        s10.append(d12);
        s10.append(", type=");
        s10.append(audioType);
        s10.append(", playback_source=");
        s10.append(str4);
        s10.append(", device_online=");
        s10.append(bool);
        s10.append(", voice_id=");
        s10.append(str5);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public ConsumptionSpanEntity(String str, String str2, String str3, double d10, double d11, Long l4, Long l7, long j4, float f10, double d12, AudioType audioType, String str4, Boolean bool, String str5) {
        str.getClass();
        str2.getClass();
        audioType.getClass();
        this.id = str;
        this.read_id = str2;
        this.audio_file_number = str3;
        this.start_seconds = d10;
        this.end_seconds = d11;
        this.start_char_offset = l4;
        this.end_char_offset = l7;
        this.listened_at_unix = j4;
        this.playback_speed = f10;
        this.real_time_duration_seconds = d12;
        this.type = audioType;
        this.playback_source = str4;
        this.device_online = bool;
        this.voice_id = str5;
    }
}
