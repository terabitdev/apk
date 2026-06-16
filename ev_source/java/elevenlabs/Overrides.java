package io.elevenlabs;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/elevenlabs/Overrides;", "", "agent", "Lio/elevenlabs/AgentOverrides;", "tts", "Lio/elevenlabs/TtsOverrides;", "conversation", "Lio/elevenlabs/ConversationOverrides;", "client", "Lio/elevenlabs/ClientOverrides;", "<init>", "(Lio/elevenlabs/AgentOverrides;Lio/elevenlabs/TtsOverrides;Lio/elevenlabs/ConversationOverrides;Lio/elevenlabs/ClientOverrides;)V", "getAgent", "()Lio/elevenlabs/AgentOverrides;", "getTts", "()Lio/elevenlabs/TtsOverrides;", "getConversation", "()Lio/elevenlabs/ConversationOverrides;", "getClient", "()Lio/elevenlabs/ClientOverrides;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Overrides {
    private final AgentOverrides agent;
    private final ClientOverrides client;
    private final ConversationOverrides conversation;
    private final TtsOverrides tts;

    public /* synthetic */ Overrides(AgentOverrides agentOverrides, TtsOverrides ttsOverrides, ConversationOverrides conversationOverrides, ClientOverrides clientOverrides, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : agentOverrides, (i10 & 2) != 0 ? null : ttsOverrides, (i10 & 4) != 0 ? null : conversationOverrides, (i10 & 8) != 0 ? null : clientOverrides);
    }

    public static /* synthetic */ Overrides copy$default(Overrides overrides, AgentOverrides agentOverrides, TtsOverrides ttsOverrides, ConversationOverrides conversationOverrides, ClientOverrides clientOverrides, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            agentOverrides = overrides.agent;
        }
        if ((i10 & 2) != 0) {
            ttsOverrides = overrides.tts;
        }
        if ((i10 & 4) != 0) {
            conversationOverrides = overrides.conversation;
        }
        if ((i10 & 8) != 0) {
            clientOverrides = overrides.client;
        }
        return overrides.copy(agentOverrides, ttsOverrides, conversationOverrides, clientOverrides);
    }

    /* renamed from: component1, reason: from getter */
    public final AgentOverrides getAgent() {
        return this.agent;
    }

    /* renamed from: component2, reason: from getter */
    public final TtsOverrides getTts() {
        return this.tts;
    }

    /* renamed from: component3, reason: from getter */
    public final ConversationOverrides getConversation() {
        return this.conversation;
    }

    /* renamed from: component4, reason: from getter */
    public final ClientOverrides getClient() {
        return this.client;
    }

    public final Overrides copy(AgentOverrides agent, TtsOverrides tts, ConversationOverrides conversation, ClientOverrides client) {
        return new Overrides(agent, tts, conversation, client);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Overrides)) {
            return false;
        }
        Overrides overrides = (Overrides) other;
        if (m.c(this.agent, overrides.agent) && m.c(this.tts, overrides.tts) && m.c(this.conversation, overrides.conversation) && m.c(this.client, overrides.client)) {
            return true;
        }
        return false;
    }

    public final AgentOverrides getAgent() {
        return this.agent;
    }

    public final ClientOverrides getClient() {
        return this.client;
    }

    public final ConversationOverrides getConversation() {
        return this.conversation;
    }

    public final TtsOverrides getTts() {
        return this.tts;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        AgentOverrides agentOverrides = this.agent;
        int i10 = 0;
        if (agentOverrides == null) {
            hashCode = 0;
        } else {
            hashCode = agentOverrides.hashCode();
        }
        int i11 = hashCode * 31;
        TtsOverrides ttsOverrides = this.tts;
        if (ttsOverrides == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ttsOverrides.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        ConversationOverrides conversationOverrides = this.conversation;
        if (conversationOverrides == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = conversationOverrides.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        ClientOverrides clientOverrides = this.client;
        if (clientOverrides != null) {
            i10 = clientOverrides.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        return "Overrides(agent=" + this.agent + ", tts=" + this.tts + ", conversation=" + this.conversation + ", client=" + this.client + Separators.RPAREN;
    }

    public Overrides(AgentOverrides agentOverrides, TtsOverrides ttsOverrides, ConversationOverrides conversationOverrides, ClientOverrides clientOverrides) {
        this.agent = agentOverrides;
        this.tts = ttsOverrides;
        this.conversation = conversationOverrides;
        this.client = clientOverrides;
    }

    public Overrides() {
        this(null, null, null, null, 15, null);
    }
}
