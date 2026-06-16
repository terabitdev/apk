package io.elevenlabs;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/AgentOverrides;", "", SDPKeywords.PROMPT, "Lio/elevenlabs/PromptOverrides;", "firstMessage", "", "language", "Lio/elevenlabs/Language;", "<init>", "(Lio/elevenlabs/PromptOverrides;Ljava/lang/String;Lio/elevenlabs/Language;)V", "getPrompt", "()Lio/elevenlabs/PromptOverrides;", "getFirstMessage", "()Ljava/lang/String;", "getLanguage", "()Lio/elevenlabs/Language;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AgentOverrides {
    private final String firstMessage;
    private final Language language;
    private final PromptOverrides prompt;

    public /* synthetic */ AgentOverrides(PromptOverrides promptOverrides, String str, Language language, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : promptOverrides, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : language);
    }

    public static /* synthetic */ AgentOverrides copy$default(AgentOverrides agentOverrides, PromptOverrides promptOverrides, String str, Language language, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            promptOverrides = agentOverrides.prompt;
        }
        if ((i10 & 2) != 0) {
            str = agentOverrides.firstMessage;
        }
        if ((i10 & 4) != 0) {
            language = agentOverrides.language;
        }
        return agentOverrides.copy(promptOverrides, str, language);
    }

    /* renamed from: component1, reason: from getter */
    public final PromptOverrides getPrompt() {
        return this.prompt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFirstMessage() {
        return this.firstMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final Language getLanguage() {
        return this.language;
    }

    public final AgentOverrides copy(PromptOverrides prompt, String firstMessage, Language language) {
        return new AgentOverrides(prompt, firstMessage, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentOverrides)) {
            return false;
        }
        AgentOverrides agentOverrides = (AgentOverrides) other;
        if (m.c(this.prompt, agentOverrides.prompt) && m.c(this.firstMessage, agentOverrides.firstMessage) && this.language == agentOverrides.language) {
            return true;
        }
        return false;
    }

    public final String getFirstMessage() {
        return this.firstMessage;
    }

    public final Language getLanguage() {
        return this.language;
    }

    public final PromptOverrides getPrompt() {
        return this.prompt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        PromptOverrides promptOverrides = this.prompt;
        int i10 = 0;
        if (promptOverrides == null) {
            hashCode = 0;
        } else {
            hashCode = promptOverrides.hashCode();
        }
        int i11 = hashCode * 31;
        String str = this.firstMessage;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Language language = this.language;
        if (language != null) {
            i10 = language.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        return "AgentOverrides(prompt=" + this.prompt + ", firstMessage=" + this.firstMessage + ", language=" + this.language + Separators.RPAREN;
    }

    public AgentOverrides(PromptOverrides promptOverrides, String str, Language language) {
        this.prompt = promptOverrides;
        this.firstMessage = str;
        this.language = language;
    }

    public AgentOverrides() {
        this(null, null, null, 7, null);
    }
}
