package io.elevenlabs.models;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import ib.i;
import j0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lio/elevenlabs/models/ConversationEvent;", "", "<init>", "()V", "AudioAlignment", "AgentResponseMetadata", "AgentChatResponsePart", "TentativeUserTranscript", "TentativeAgentResponse", "ConversationInitiationMetadata", "Audio", "AgentResponse", "AgentResponseCorrection", "UserTranscript", "ClientToolCall", "AgentToolResponse", "VadScore", "Ping", "Interruption", "ServerError", "Lio/elevenlabs/models/ConversationEvent$AgentChatResponsePart;", "Lio/elevenlabs/models/ConversationEvent$AgentResponse;", "Lio/elevenlabs/models/ConversationEvent$AgentResponseCorrection;", "Lio/elevenlabs/models/ConversationEvent$AgentResponseMetadata;", "Lio/elevenlabs/models/ConversationEvent$AgentToolResponse;", "Lio/elevenlabs/models/ConversationEvent$Audio;", "Lio/elevenlabs/models/ConversationEvent$AudioAlignment;", "Lio/elevenlabs/models/ConversationEvent$ClientToolCall;", "Lio/elevenlabs/models/ConversationEvent$ConversationInitiationMetadata;", "Lio/elevenlabs/models/ConversationEvent$Interruption;", "Lio/elevenlabs/models/ConversationEvent$Ping;", "Lio/elevenlabs/models/ConversationEvent$ServerError;", "Lio/elevenlabs/models/ConversationEvent$TentativeAgentResponse;", "Lio/elevenlabs/models/ConversationEvent$TentativeUserTranscript;", "Lio/elevenlabs/models/ConversationEvent$UserTranscript;", "Lio/elevenlabs/models/ConversationEvent$VadScore;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class ConversationEvent {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$AgentChatResponsePart;", "Lio/elevenlabs/models/ConversationEvent;", "partType", "", ParameterNames.TEXT, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPartType", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AgentChatResponsePart extends ConversationEvent {
        private final String partType;
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgentChatResponsePart(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.partType = str;
            this.text = str2;
        }

        public static /* synthetic */ AgentChatResponsePart copy$default(AgentChatResponsePart agentChatResponsePart, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = agentChatResponsePart.partType;
            }
            if ((i10 & 2) != 0) {
                str2 = agentChatResponsePart.text;
            }
            return agentChatResponsePart.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPartType() {
            return this.partType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final AgentChatResponsePart copy(String partType, String text) {
            partType.getClass();
            text.getClass();
            return new AgentChatResponsePart(partType, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgentChatResponsePart)) {
                return false;
            }
            AgentChatResponsePart agentChatResponsePart = (AgentChatResponsePart) other;
            if (m.c(this.partType, agentChatResponsePart.partType) && m.c(this.text, agentChatResponsePart.text)) {
                return true;
            }
            return false;
        }

        public final String getPartType() {
            return this.partType;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.partType.hashCode() * 31);
        }

        public String toString() {
            return h.c("AgentChatResponsePart(partType=", this.partType, ", text=", this.text, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$AgentResponse;", "Lio/elevenlabs/models/ConversationEvent;", "agentResponse", "", "<init>", "(Ljava/lang/String;)V", "getAgentResponse", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AgentResponse extends ConversationEvent {
        private final String agentResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgentResponse(String str) {
            super(null);
            str.getClass();
            this.agentResponse = str;
        }

        public static /* synthetic */ AgentResponse copy$default(AgentResponse agentResponse, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = agentResponse.agentResponse;
            }
            return agentResponse.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgentResponse() {
            return this.agentResponse;
        }

        public final AgentResponse copy(String agentResponse) {
            agentResponse.getClass();
            return new AgentResponse(agentResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof AgentResponse) && m.c(this.agentResponse, ((AgentResponse) other).agentResponse)) {
                return true;
            }
            return false;
        }

        public final String getAgentResponse() {
            return this.agentResponse;
        }

        public int hashCode() {
            return this.agentResponse.hashCode();
        }

        public String toString() {
            return f.C("AgentResponse(agentResponse=", this.agentResponse, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$AgentResponseCorrection;", "Lio/elevenlabs/models/ConversationEvent;", "originalAgentResponse", "", "correctedAgentResponse", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOriginalAgentResponse", "()Ljava/lang/String;", "getCorrectedAgentResponse", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AgentResponseCorrection extends ConversationEvent {
        private final String correctedAgentResponse;
        private final String originalAgentResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgentResponseCorrection(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.originalAgentResponse = str;
            this.correctedAgentResponse = str2;
        }

        public static /* synthetic */ AgentResponseCorrection copy$default(AgentResponseCorrection agentResponseCorrection, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = agentResponseCorrection.originalAgentResponse;
            }
            if ((i10 & 2) != 0) {
                str2 = agentResponseCorrection.correctedAgentResponse;
            }
            return agentResponseCorrection.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOriginalAgentResponse() {
            return this.originalAgentResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCorrectedAgentResponse() {
            return this.correctedAgentResponse;
        }

        public final AgentResponseCorrection copy(String originalAgentResponse, String correctedAgentResponse) {
            originalAgentResponse.getClass();
            correctedAgentResponse.getClass();
            return new AgentResponseCorrection(originalAgentResponse, correctedAgentResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgentResponseCorrection)) {
                return false;
            }
            AgentResponseCorrection agentResponseCorrection = (AgentResponseCorrection) other;
            if (m.c(this.originalAgentResponse, agentResponseCorrection.originalAgentResponse) && m.c(this.correctedAgentResponse, agentResponseCorrection.correctedAgentResponse)) {
                return true;
            }
            return false;
        }

        public final String getCorrectedAgentResponse() {
            return this.correctedAgentResponse;
        }

        public final String getOriginalAgentResponse() {
            return this.originalAgentResponse;
        }

        public int hashCode() {
            return this.correctedAgentResponse.hashCode() + (this.originalAgentResponse.hashCode() * 31);
        }

        public String toString() {
            return h.c("AgentResponseCorrection(originalAgentResponse=", this.originalAgentResponse, ", correctedAgentResponse=", this.correctedAgentResponse, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$AgentResponseMetadata;", "Lio/elevenlabs/models/ConversationEvent;", "metadata", "", "", "", "<init>", "(Ljava/util/Map;)V", "getMetadata", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AgentResponseMetadata extends ConversationEvent {
        private final Map<String, Object> metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgentResponseMetadata(Map<String, ? extends Object> map) {
            super(null);
            map.getClass();
            this.metadata = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AgentResponseMetadata copy$default(AgentResponseMetadata agentResponseMetadata, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = agentResponseMetadata.metadata;
            }
            return agentResponseMetadata.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.metadata;
        }

        public final AgentResponseMetadata copy(Map<String, ? extends Object> metadata) {
            metadata.getClass();
            return new AgentResponseMetadata(metadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof AgentResponseMetadata) && m.c(this.metadata, ((AgentResponseMetadata) other).metadata)) {
                return true;
            }
            return false;
        }

        public final Map<String, Object> getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            return this.metadata.hashCode();
        }

        public String toString() {
            return "AgentResponseMetadata(metadata=" + this.metadata + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$AgentToolResponse;", "Lio/elevenlabs/models/ConversationEvent;", "toolName", "", "toolCallId", "toolType", "isError", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getToolName", "()Ljava/lang/String;", "getToolCallId", "getToolType", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AgentToolResponse extends ConversationEvent {
        private final boolean isError;
        private final String toolCallId;
        private final String toolName;
        private final String toolType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgentToolResponse(String str, String str2, String str3, boolean z6) {
            super(null);
            i.s(str, str2, str3);
            this.toolName = str;
            this.toolCallId = str2;
            this.toolType = str3;
            this.isError = z6;
        }

        public static /* synthetic */ AgentToolResponse copy$default(AgentToolResponse agentToolResponse, String str, String str2, String str3, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = agentToolResponse.toolName;
            }
            if ((i10 & 2) != 0) {
                str2 = agentToolResponse.toolCallId;
            }
            if ((i10 & 4) != 0) {
                str3 = agentToolResponse.toolType;
            }
            if ((i10 & 8) != 0) {
                z6 = agentToolResponse.isError;
            }
            return agentToolResponse.copy(str, str2, str3, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToolName() {
            return this.toolName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getToolCallId() {
            return this.toolCallId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getToolType() {
            return this.toolType;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        public final AgentToolResponse copy(String toolName, String toolCallId, String toolType, boolean isError) {
            toolName.getClass();
            toolCallId.getClass();
            toolType.getClass();
            return new AgentToolResponse(toolName, toolCallId, toolType, isError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgentToolResponse)) {
                return false;
            }
            AgentToolResponse agentToolResponse = (AgentToolResponse) other;
            if (m.c(this.toolName, agentToolResponse.toolName) && m.c(this.toolCallId, agentToolResponse.toolCallId) && m.c(this.toolType, agentToolResponse.toolType) && this.isError == agentToolResponse.isError) {
                return true;
            }
            return false;
        }

        public final String getToolCallId() {
            return this.toolCallId;
        }

        public final String getToolName() {
            return this.toolName;
        }

        public final String getToolType() {
            return this.toolType;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isError) + c.c(c.c(this.toolName.hashCode() * 31, 31, this.toolCallId), 31, this.toolType);
        }

        public final boolean isError() {
            return this.isError;
        }

        public String toString() {
            String str = this.toolName;
            String str2 = this.toolCallId;
            String str3 = this.toolType;
            boolean z6 = this.isError;
            StringBuilder s10 = f.s("AgentToolResponse(toolName=", str, ", toolCallId=", str2, ", toolType=");
            s10.append(str3);
            s10.append(", isError=");
            s10.append(z6);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$Audio;", "Lio/elevenlabs/models/ConversationEvent;", "eventId", "", "audioBase64", "", "<init>", "(ILjava/lang/String;)V", "getEventId", "()I", "getAudioBase64", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Audio extends ConversationEvent {
        private final String audioBase64;
        private final int eventId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Audio(int i10, String str) {
            super(null);
            str.getClass();
            this.eventId = i10;
            this.audioBase64 = str;
        }

        public static /* synthetic */ Audio copy$default(Audio audio, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = audio.eventId;
            }
            if ((i11 & 2) != 0) {
                str = audio.audioBase64;
            }
            return audio.copy(i10, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAudioBase64() {
            return this.audioBase64;
        }

        public final Audio copy(int eventId, String audioBase64) {
            audioBase64.getClass();
            return new Audio(eventId, audioBase64);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Audio)) {
                return false;
            }
            Audio audio = (Audio) other;
            if (this.eventId == audio.eventId && m.c(this.audioBase64, audio.audioBase64)) {
                return true;
            }
            return false;
        }

        public final String getAudioBase64() {
            return this.audioBase64;
        }

        public final int getEventId() {
            return this.eventId;
        }

        public int hashCode() {
            return this.audioBase64.hashCode() + (Integer.hashCode(this.eventId) * 31);
        }

        public String toString() {
            return "Audio(eventId=" + this.eventId + ", audioBase64=" + this.audioBase64 + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$AudioAlignment;", "Lio/elevenlabs/models/ConversationEvent;", "alignment", "", "", "", "<init>", "(Ljava/util/Map;)V", "getAlignment", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioAlignment extends ConversationEvent {
        private final Map<String, Object> alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAlignment(Map<String, ? extends Object> map) {
            super(null);
            map.getClass();
            this.alignment = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AudioAlignment copy$default(AudioAlignment audioAlignment, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = audioAlignment.alignment;
            }
            return audioAlignment.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.alignment;
        }

        public final AudioAlignment copy(Map<String, ? extends Object> alignment) {
            alignment.getClass();
            return new AudioAlignment(alignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof AudioAlignment) && m.c(this.alignment, ((AudioAlignment) other).alignment)) {
                return true;
            }
            return false;
        }

        public final Map<String, Object> getAlignment() {
            return this.alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "AudioAlignment(alignment=" + this.alignment + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$ConversationInitiationMetadata;", "Lio/elevenlabs/models/ConversationEvent;", "conversationId", "", "agentOutputAudioFormat", "userInputAudioFormat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getAgentOutputAudioFormat", "getUserInputAudioFormat", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ConversationInitiationMetadata extends ConversationEvent {
        private final String agentOutputAudioFormat;
        private final String conversationId;
        private final String userInputAudioFormat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationInitiationMetadata(String str, String str2, String str3) {
            super(null);
            i.s(str, str2, str3);
            this.conversationId = str;
            this.agentOutputAudioFormat = str2;
            this.userInputAudioFormat = str3;
        }

        public static /* synthetic */ ConversationInitiationMetadata copy$default(ConversationInitiationMetadata conversationInitiationMetadata, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversationInitiationMetadata.conversationId;
            }
            if ((i10 & 2) != 0) {
                str2 = conversationInitiationMetadata.agentOutputAudioFormat;
            }
            if ((i10 & 4) != 0) {
                str3 = conversationInitiationMetadata.userInputAudioFormat;
            }
            return conversationInitiationMetadata.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAgentOutputAudioFormat() {
            return this.agentOutputAudioFormat;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUserInputAudioFormat() {
            return this.userInputAudioFormat;
        }

        public final ConversationInitiationMetadata copy(String conversationId, String agentOutputAudioFormat, String userInputAudioFormat) {
            conversationId.getClass();
            agentOutputAudioFormat.getClass();
            userInputAudioFormat.getClass();
            return new ConversationInitiationMetadata(conversationId, agentOutputAudioFormat, userInputAudioFormat);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationInitiationMetadata)) {
                return false;
            }
            ConversationInitiationMetadata conversationInitiationMetadata = (ConversationInitiationMetadata) other;
            if (m.c(this.conversationId, conversationInitiationMetadata.conversationId) && m.c(this.agentOutputAudioFormat, conversationInitiationMetadata.agentOutputAudioFormat) && m.c(this.userInputAudioFormat, conversationInitiationMetadata.userInputAudioFormat)) {
                return true;
            }
            return false;
        }

        public final String getAgentOutputAudioFormat() {
            return this.agentOutputAudioFormat;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getUserInputAudioFormat() {
            return this.userInputAudioFormat;
        }

        public int hashCode() {
            return this.userInputAudioFormat.hashCode() + c.c(this.conversationId.hashCode() * 31, 31, this.agentOutputAudioFormat);
        }

        public String toString() {
            return f.l(this.userInputAudioFormat, Separators.RPAREN, f.s("ConversationInitiationMetadata(conversationId=", this.conversationId, ", agentOutputAudioFormat=", this.agentOutputAudioFormat, ", userInputAudioFormat="));
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$Interruption;", "Lio/elevenlabs/models/ConversationEvent;", "eventId", "", "<init>", "(I)V", "getEventId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Interruption extends ConversationEvent {
        private final int eventId;

        public Interruption(int i10) {
            super(null);
            this.eventId = i10;
        }

        public static /* synthetic */ Interruption copy$default(Interruption interruption, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = interruption.eventId;
            }
            return interruption.copy(i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        public final Interruption copy(int eventId) {
            return new Interruption(eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Interruption) && this.eventId == ((Interruption) other).eventId) {
                return true;
            }
            return false;
        }

        public final int getEventId() {
            return this.eventId;
        }

        public int hashCode() {
            return Integer.hashCode(this.eventId);
        }

        public String toString() {
            return b.j(this.eventId, "Interruption(eventId=", Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$Ping;", "Lio/elevenlabs/models/ConversationEvent;", "eventId", "", "pingMs", "", "<init>", "(ILjava/lang/Long;)V", "getEventId", "()I", "getPingMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(ILjava/lang/Long;)Lio/elevenlabs/models/ConversationEvent$Ping;", "equals", "", "other", "", "hashCode", "toString", "", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Ping extends ConversationEvent {
        private final int eventId;
        private final Long pingMs;

        public Ping(int i10, Long l4) {
            super(null);
            this.eventId = i10;
            this.pingMs = l4;
        }

        public static /* synthetic */ Ping copy$default(Ping ping, int i10, Long l4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = ping.eventId;
            }
            if ((i11 & 2) != 0) {
                l4 = ping.pingMs;
            }
            return ping.copy(i10, l4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getPingMs() {
            return this.pingMs;
        }

        public final Ping copy(int eventId, Long pingMs) {
            return new Ping(eventId, pingMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ping)) {
                return false;
            }
            Ping ping = (Ping) other;
            if (this.eventId == ping.eventId && m.c(this.pingMs, ping.pingMs)) {
                return true;
            }
            return false;
        }

        public final int getEventId() {
            return this.eventId;
        }

        public final Long getPingMs() {
            return this.pingMs;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = Integer.hashCode(this.eventId) * 31;
            Long l4 = this.pingMs;
            if (l4 == null) {
                hashCode = 0;
            } else {
                hashCode = l4.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Ping(eventId=" + this.eventId + ", pingMs=" + this.pingMs + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$ServerError;", "Lio/elevenlabs/models/ConversationEvent;", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ServerError extends ConversationEvent {
        private final int code;
        private final String message;

        public ServerError(int i10, String str) {
            super(null);
            this.code = i10;
            this.message = str;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = serverError.code;
            }
            if ((i11 & 2) != 0) {
                str = serverError.message;
            }
            return serverError.copy(i10, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final ServerError copy(int code, String message) {
            return new ServerError(code, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) other;
            if (this.code == serverError.code && m.c(this.message, serverError.message)) {
                return true;
            }
            return false;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = Integer.hashCode(this.code) * 31;
            String str = this.message;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "ServerError(code=" + this.code + ", message=" + this.message + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$TentativeAgentResponse;", "Lio/elevenlabs/models/ConversationEvent;", "tentativeAgentResponse", "", "<init>", "(Ljava/lang/String;)V", "getTentativeAgentResponse", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class TentativeAgentResponse extends ConversationEvent {
        private final String tentativeAgentResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TentativeAgentResponse(String str) {
            super(null);
            str.getClass();
            this.tentativeAgentResponse = str;
        }

        public static /* synthetic */ TentativeAgentResponse copy$default(TentativeAgentResponse tentativeAgentResponse, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = tentativeAgentResponse.tentativeAgentResponse;
            }
            return tentativeAgentResponse.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTentativeAgentResponse() {
            return this.tentativeAgentResponse;
        }

        public final TentativeAgentResponse copy(String tentativeAgentResponse) {
            tentativeAgentResponse.getClass();
            return new TentativeAgentResponse(tentativeAgentResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof TentativeAgentResponse) && m.c(this.tentativeAgentResponse, ((TentativeAgentResponse) other).tentativeAgentResponse)) {
                return true;
            }
            return false;
        }

        public final String getTentativeAgentResponse() {
            return this.tentativeAgentResponse;
        }

        public int hashCode() {
            return this.tentativeAgentResponse.hashCode();
        }

        public String toString() {
            return f.C("TentativeAgentResponse(tentativeAgentResponse=", this.tentativeAgentResponse, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$TentativeUserTranscript;", "Lio/elevenlabs/models/ConversationEvent;", "userTranscript", "", "eventId", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getUserTranscript", "()Ljava/lang/String;", "getEventId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lio/elevenlabs/models/ConversationEvent$TentativeUserTranscript;", "equals", "", "other", "", "hashCode", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class TentativeUserTranscript extends ConversationEvent {
        private final Integer eventId;
        private final String userTranscript;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TentativeUserTranscript(String str, Integer num) {
            super(null);
            str.getClass();
            this.userTranscript = str;
            this.eventId = num;
        }

        public static /* synthetic */ TentativeUserTranscript copy$default(TentativeUserTranscript tentativeUserTranscript, String str, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = tentativeUserTranscript.userTranscript;
            }
            if ((i10 & 2) != 0) {
                num = tentativeUserTranscript.eventId;
            }
            return tentativeUserTranscript.copy(str, num);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserTranscript() {
            return this.userTranscript;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getEventId() {
            return this.eventId;
        }

        public final TentativeUserTranscript copy(String userTranscript, Integer eventId) {
            userTranscript.getClass();
            return new TentativeUserTranscript(userTranscript, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TentativeUserTranscript)) {
                return false;
            }
            TentativeUserTranscript tentativeUserTranscript = (TentativeUserTranscript) other;
            if (m.c(this.userTranscript, tentativeUserTranscript.userTranscript) && m.c(this.eventId, tentativeUserTranscript.eventId)) {
                return true;
            }
            return false;
        }

        public final Integer getEventId() {
            return this.eventId;
        }

        public final String getUserTranscript() {
            return this.userTranscript;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.userTranscript.hashCode() * 31;
            Integer num = this.eventId;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "TentativeUserTranscript(userTranscript=" + this.userTranscript + ", eventId=" + this.eventId + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$UserTranscript;", "Lio/elevenlabs/models/ConversationEvent;", "userTranscript", "", "<init>", "(Ljava/lang/String;)V", "getUserTranscript", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class UserTranscript extends ConversationEvent {
        private final String userTranscript;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserTranscript(String str) {
            super(null);
            str.getClass();
            this.userTranscript = str;
        }

        public static /* synthetic */ UserTranscript copy$default(UserTranscript userTranscript, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = userTranscript.userTranscript;
            }
            return userTranscript.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUserTranscript() {
            return this.userTranscript;
        }

        public final UserTranscript copy(String userTranscript) {
            userTranscript.getClass();
            return new UserTranscript(userTranscript);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof UserTranscript) && m.c(this.userTranscript, ((UserTranscript) other).userTranscript)) {
                return true;
            }
            return false;
        }

        public final String getUserTranscript() {
            return this.userTranscript;
        }

        public int hashCode() {
            return this.userTranscript.hashCode();
        }

        public String toString() {
            return f.C("UserTranscript(userTranscript=", this.userTranscript, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$VadScore;", "Lio/elevenlabs/models/ConversationEvent;", FirebaseAnalytics.Param.SCORE, "", "<init>", "(F)V", "getScore", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class VadScore extends ConversationEvent {
        private final float score;

        public VadScore(float f10) {
            super(null);
            this.score = f10;
        }

        public static /* synthetic */ VadScore copy$default(VadScore vadScore, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = vadScore.score;
            }
            return vadScore.copy(f10);
        }

        /* renamed from: component1, reason: from getter */
        public final float getScore() {
            return this.score;
        }

        public final VadScore copy(float score) {
            return new VadScore(score);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof VadScore) && Float.compare(this.score, ((VadScore) other).score) == 0) {
                return true;
            }
            return false;
        }

        public final float getScore() {
            return this.score;
        }

        public int hashCode() {
            return Float.hashCode(this.score);
        }

        public String toString() {
            return "VadScore(score=" + this.score + Separators.RPAREN;
        }
    }

    public /* synthetic */ ConversationEvent(kotlin.jvm.internal.f fVar) {
        this();
    }

    private ConversationEvent() {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/models/ConversationEvent$ClientToolCall;", "Lio/elevenlabs/models/ConversationEvent;", "toolName", "", "parameters", "", "", "toolCallId", "expectsResponse", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)V", "getToolName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "getToolCallId", "getExpectsResponse", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ClientToolCall extends ConversationEvent {
        private final boolean expectsResponse;
        private final Map<String, Object> parameters;
        private final String toolCallId;
        private final String toolName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientToolCall(String str, Map<String, ? extends Object> map, String str2, boolean z6) {
            super(null);
            str.getClass();
            map.getClass();
            str2.getClass();
            this.toolName = str;
            this.parameters = map;
            this.toolCallId = str2;
            this.expectsResponse = z6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClientToolCall copy$default(ClientToolCall clientToolCall, String str, Map map, String str2, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = clientToolCall.toolName;
            }
            if ((i10 & 2) != 0) {
                map = clientToolCall.parameters;
            }
            if ((i10 & 4) != 0) {
                str2 = clientToolCall.toolCallId;
            }
            if ((i10 & 8) != 0) {
                z6 = clientToolCall.expectsResponse;
            }
            return clientToolCall.copy(str, map, str2, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToolName() {
            return this.toolName;
        }

        public final Map<String, Object> component2() {
            return this.parameters;
        }

        /* renamed from: component3, reason: from getter */
        public final String getToolCallId() {
            return this.toolCallId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getExpectsResponse() {
            return this.expectsResponse;
        }

        public final ClientToolCall copy(String toolName, Map<String, ? extends Object> parameters, String toolCallId, boolean expectsResponse) {
            toolName.getClass();
            parameters.getClass();
            toolCallId.getClass();
            return new ClientToolCall(toolName, parameters, toolCallId, expectsResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientToolCall)) {
                return false;
            }
            ClientToolCall clientToolCall = (ClientToolCall) other;
            if (m.c(this.toolName, clientToolCall.toolName) && m.c(this.parameters, clientToolCall.parameters) && m.c(this.toolCallId, clientToolCall.toolCallId) && this.expectsResponse == clientToolCall.expectsResponse) {
                return true;
            }
            return false;
        }

        public final boolean getExpectsResponse() {
            return this.expectsResponse;
        }

        public final Map<String, Object> getParameters() {
            return this.parameters;
        }

        public final String getToolCallId() {
            return this.toolCallId;
        }

        public final String getToolName() {
            return this.toolName;
        }

        public int hashCode() {
            return Boolean.hashCode(this.expectsResponse) + c.c(f.a(this.parameters, this.toolName.hashCode() * 31, 31), 31, this.toolCallId);
        }

        public String toString() {
            return "ClientToolCall(toolName=" + this.toolName + ", parameters=" + this.parameters + ", toolCallId=" + this.toolCallId + ", expectsResponse=" + this.expectsResponse + Separators.RPAREN;
        }

        public /* synthetic */ ClientToolCall(String str, Map map, String str2, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
            this(str, map, str2, (i10 & 8) != 0 ? false : z6);
        }
    }
}
