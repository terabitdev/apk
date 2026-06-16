package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;", "", "id", "", "labelResId", "", "promptTextResId", "<init>", "(Ljava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getLabelResId", "()I", "getPromptTextResId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class VoiceDesignPrompt {
    public static final int $stable = 0;
    private final String id;
    private final int labelResId;
    private final int promptTextResId;

    public VoiceDesignPrompt(String str, int i10, int i11) {
        str.getClass();
        this.id = str;
        this.labelResId = i10;
        this.promptTextResId = i11;
    }

    public static /* synthetic */ VoiceDesignPrompt copy$default(VoiceDesignPrompt voiceDesignPrompt, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = voiceDesignPrompt.id;
        }
        if ((i12 & 2) != 0) {
            i10 = voiceDesignPrompt.labelResId;
        }
        if ((i12 & 4) != 0) {
            i11 = voiceDesignPrompt.promptTextResId;
        }
        return voiceDesignPrompt.copy(str, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLabelResId() {
        return this.labelResId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPromptTextResId() {
        return this.promptTextResId;
    }

    public final VoiceDesignPrompt copy(String id2, int labelResId, int promptTextResId) {
        id2.getClass();
        return new VoiceDesignPrompt(id2, labelResId, promptTextResId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceDesignPrompt)) {
            return false;
        }
        VoiceDesignPrompt voiceDesignPrompt = (VoiceDesignPrompt) other;
        if (m.c(this.id, voiceDesignPrompt.id) && this.labelResId == voiceDesignPrompt.labelResId && this.promptTextResId == voiceDesignPrompt.promptTextResId) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final int getPromptTextResId() {
        return this.promptTextResId;
    }

    public int hashCode() {
        return Integer.hashCode(this.promptTextResId) + j0.c.b(this.labelResId, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.id;
        return defpackage.f.f(this.promptTextResId, Separators.RPAREN, android.gov.nist.javax.sip.header.a.o(this.labelResId, "VoiceDesignPrompt(id=", str, ", labelResId=", ", promptTextResId="));
    }
}
