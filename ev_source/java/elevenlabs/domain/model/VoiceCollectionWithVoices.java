package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/VoiceCollectionWithVoices;", "", "voiceCollection", "Lio/elevenlabs/domain/model/VoiceCollection;", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Lio/elevenlabs/domain/model/VoiceCollection;Ljava/util/List;)V", "getVoiceCollection", "()Lio/elevenlabs/domain/model/VoiceCollection;", "getVoices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class VoiceCollectionWithVoices {
    private final VoiceCollection voiceCollection;
    private final List<Voice> voices;

    public VoiceCollectionWithVoices(VoiceCollection voiceCollection, List<Voice> list) {
        voiceCollection.getClass();
        list.getClass();
        this.voiceCollection = voiceCollection;
        this.voices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceCollectionWithVoices copy$default(VoiceCollectionWithVoices voiceCollectionWithVoices, VoiceCollection voiceCollection, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            voiceCollection = voiceCollectionWithVoices.voiceCollection;
        }
        if ((i10 & 2) != 0) {
            list = voiceCollectionWithVoices.voices;
        }
        return voiceCollectionWithVoices.copy(voiceCollection, list);
    }

    /* renamed from: component1, reason: from getter */
    public final VoiceCollection getVoiceCollection() {
        return this.voiceCollection;
    }

    public final List<Voice> component2() {
        return this.voices;
    }

    public final VoiceCollectionWithVoices copy(VoiceCollection voiceCollection, List<Voice> voices) {
        voiceCollection.getClass();
        voices.getClass();
        return new VoiceCollectionWithVoices(voiceCollection, voices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceCollectionWithVoices)) {
            return false;
        }
        VoiceCollectionWithVoices voiceCollectionWithVoices = (VoiceCollectionWithVoices) other;
        if (m.c(this.voiceCollection, voiceCollectionWithVoices.voiceCollection) && m.c(this.voices, voiceCollectionWithVoices.voices)) {
            return true;
        }
        return false;
    }

    public final VoiceCollection getVoiceCollection() {
        return this.voiceCollection;
    }

    public final List<Voice> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return this.voices.hashCode() + (this.voiceCollection.hashCode() * 31);
    }

    public String toString() {
        return "VoiceCollectionWithVoices(voiceCollection=" + this.voiceCollection + ", voices=" + this.voices + Separators.RPAREN;
    }
}
