package io.elevenlabs.domain.services.player;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantTriggerEvent;", "", "readId", "", "voiceId", "position", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getPosition", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AssistantTriggerEvent {
    private final long position;
    private final String readId;
    private final String voiceId;

    public AssistantTriggerEvent(String str, String str2, long j4) {
        str.getClass();
        this.readId = str;
        this.voiceId = str2;
        this.position = j4;
    }

    public static /* synthetic */ AssistantTriggerEvent copy$default(AssistantTriggerEvent assistantTriggerEvent, String str, String str2, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = assistantTriggerEvent.readId;
        }
        if ((i10 & 2) != 0) {
            str2 = assistantTriggerEvent.voiceId;
        }
        if ((i10 & 4) != 0) {
            j4 = assistantTriggerEvent.position;
        }
        return assistantTriggerEvent.copy(str, str2, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    public final AssistantTriggerEvent copy(String readId, String voiceId, long position) {
        readId.getClass();
        return new AssistantTriggerEvent(readId, voiceId, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistantTriggerEvent)) {
            return false;
        }
        AssistantTriggerEvent assistantTriggerEvent = (AssistantTriggerEvent) other;
        if (m.c(this.readId, assistantTriggerEvent.readId) && m.c(this.voiceId, assistantTriggerEvent.voiceId) && this.position == assistantTriggerEvent.position) {
            return true;
        }
        return false;
    }

    public final long getPosition() {
        return this.position;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.readId.hashCode() * 31;
        String str = this.voiceId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.position) + ((hashCode2 + hashCode) * 31);
    }

    public String toString() {
        return f.h(this.position, Separators.RPAREN, f.s("AssistantTriggerEvent(readId=", this.readId, ", voiceId=", this.voiceId, ", position="));
    }
}
