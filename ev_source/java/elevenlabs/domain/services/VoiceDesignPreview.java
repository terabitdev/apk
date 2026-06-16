package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/services/VoiceDesignPreview;", "", "generatedVoiceId", "", "audioBase64", "durationSeconds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getGeneratedVoiceId", "()Ljava/lang/String;", "getAudioBase64", "getDurationSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lio/elevenlabs/domain/services/VoiceDesignPreview;", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class VoiceDesignPreview {
    private final String audioBase64;
    private final Double durationSeconds;
    private final String generatedVoiceId;

    public VoiceDesignPreview(String str, String str2, Double d10) {
        str.getClass();
        str2.getClass();
        this.generatedVoiceId = str;
        this.audioBase64 = str2;
        this.durationSeconds = d10;
    }

    public static /* synthetic */ VoiceDesignPreview copy$default(VoiceDesignPreview voiceDesignPreview, String str, String str2, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voiceDesignPreview.generatedVoiceId;
        }
        if ((i10 & 2) != 0) {
            str2 = voiceDesignPreview.audioBase64;
        }
        if ((i10 & 4) != 0) {
            d10 = voiceDesignPreview.durationSeconds;
        }
        return voiceDesignPreview.copy(str, str2, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGeneratedVoiceId() {
        return this.generatedVoiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAudioBase64() {
        return this.audioBase64;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getDurationSeconds() {
        return this.durationSeconds;
    }

    public final VoiceDesignPreview copy(String generatedVoiceId, String audioBase64, Double durationSeconds) {
        generatedVoiceId.getClass();
        audioBase64.getClass();
        return new VoiceDesignPreview(generatedVoiceId, audioBase64, durationSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceDesignPreview)) {
            return false;
        }
        VoiceDesignPreview voiceDesignPreview = (VoiceDesignPreview) other;
        if (m.c(this.generatedVoiceId, voiceDesignPreview.generatedVoiceId) && m.c(this.audioBase64, voiceDesignPreview.audioBase64) && m.c(this.durationSeconds, voiceDesignPreview.durationSeconds)) {
            return true;
        }
        return false;
    }

    public final String getAudioBase64() {
        return this.audioBase64;
    }

    public final Double getDurationSeconds() {
        return this.durationSeconds;
    }

    public final String getGeneratedVoiceId() {
        return this.generatedVoiceId;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(this.generatedVoiceId.hashCode() * 31, 31, this.audioBase64);
        Double d10 = this.durationSeconds;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        String str = this.generatedVoiceId;
        String str2 = this.audioBase64;
        Double d10 = this.durationSeconds;
        StringBuilder s10 = f.s("VoiceDesignPreview(generatedVoiceId=", str, ", audioBase64=", str2, ", durationSeconds=");
        s10.append(d10);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
