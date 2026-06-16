package io.elevenlabs.data.database.entities.voices;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;", "", "voiceId", "", "lastUsedAtUnixMillis", "", "<init>", "(Ljava/lang/String;J)V", "getVoiceId", "()Ljava/lang/String;", "getLastUsedAtUnixMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class RecentVoiceEntity {
    private final long lastUsedAtUnixMillis;
    private final String voiceId;

    public RecentVoiceEntity(String str, long j4) {
        str.getClass();
        this.voiceId = str;
        this.lastUsedAtUnixMillis = j4;
    }

    public static /* synthetic */ RecentVoiceEntity copy$default(RecentVoiceEntity recentVoiceEntity, String str, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = recentVoiceEntity.voiceId;
        }
        if ((i10 & 2) != 0) {
            j4 = recentVoiceEntity.lastUsedAtUnixMillis;
        }
        return recentVoiceEntity.copy(str, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLastUsedAtUnixMillis() {
        return this.lastUsedAtUnixMillis;
    }

    public final RecentVoiceEntity copy(String voiceId, long lastUsedAtUnixMillis) {
        voiceId.getClass();
        return new RecentVoiceEntity(voiceId, lastUsedAtUnixMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentVoiceEntity)) {
            return false;
        }
        RecentVoiceEntity recentVoiceEntity = (RecentVoiceEntity) other;
        if (m.c(this.voiceId, recentVoiceEntity.voiceId) && this.lastUsedAtUnixMillis == recentVoiceEntity.lastUsedAtUnixMillis) {
            return true;
        }
        return false;
    }

    public final long getLastUsedAtUnixMillis() {
        return this.lastUsedAtUnixMillis;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUsedAtUnixMillis) + (this.voiceId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("RecentVoiceEntity(voiceId=", this.voiceId, this.lastUsedAtUnixMillis, ", lastUsedAtUnixMillis=");
        r10.append(Separators.RPAREN);
        return r10.toString();
    }
}
