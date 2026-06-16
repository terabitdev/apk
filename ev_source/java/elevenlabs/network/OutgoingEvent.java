package io.elevenlabs.network;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import wi.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/network/OutgoingEvent;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "UserMessage", "UserActivity", "Feedback", "ContextualUpdate", "ClientToolResult", "Pong", "Lio/elevenlabs/network/OutgoingEvent$ClientToolResult;", "Lio/elevenlabs/network/OutgoingEvent$ContextualUpdate;", "Lio/elevenlabs/network/OutgoingEvent$Feedback;", "Lio/elevenlabs/network/OutgoingEvent$Pong;", "Lio/elevenlabs/network/OutgoingEvent$UserActivity;", "Lio/elevenlabs/network/OutgoingEvent$UserMessage;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class OutgoingEvent {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/network/OutgoingEvent$ContextualUpdate;", "Lio/elevenlabs/network/OutgoingEvent;", ParameterNames.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "type", "getType", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ContextualUpdate extends OutgoingEvent {
        private final String text;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContextualUpdate(String str) {
            super(null);
            str.getClass();
            this.text = str;
            this.type = "contextual_update";
        }

        public static /* synthetic */ ContextualUpdate copy$default(ContextualUpdate contextualUpdate, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = contextualUpdate.text;
            }
            return contextualUpdate.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ContextualUpdate copy(String text) {
            text.getClass();
            return new ContextualUpdate(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof ContextualUpdate) && m.c(this.text, ((ContextualUpdate) other).text)) {
                return true;
            }
            return false;
        }

        public final String getText() {
            return this.text;
        }

        @Override // io.elevenlabs.network.OutgoingEvent
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return f.C("ContextualUpdate(text=", this.text, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/network/OutgoingEvent$Feedback;", "Lio/elevenlabs/network/OutgoingEvent;", FirebaseAnalytics.Param.SCORE, "", "eventId", "", "<init>", "(Ljava/lang/String;I)V", "getScore", "()Ljava/lang/String;", "getEventId", "()I", "type", "getType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Feedback extends OutgoingEvent {

        @b("event_id")
        private final int eventId;
        private final String score;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Feedback(String str, int i10) {
            super(null);
            str.getClass();
            this.score = str;
            this.eventId = i10;
            this.type = "feedback";
        }

        public static /* synthetic */ Feedback copy$default(Feedback feedback, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = feedback.score;
            }
            if ((i11 & 2) != 0) {
                i10 = feedback.eventId;
            }
            return feedback.copy(str, i10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScore() {
            return this.score;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        public final Feedback copy(String score, int eventId) {
            score.getClass();
            return new Feedback(score, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Feedback)) {
                return false;
            }
            Feedback feedback = (Feedback) other;
            if (m.c(this.score, feedback.score) && this.eventId == feedback.eventId) {
                return true;
            }
            return false;
        }

        public final int getEventId() {
            return this.eventId;
        }

        public final String getScore() {
            return this.score;
        }

        @Override // io.elevenlabs.network.OutgoingEvent
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Integer.hashCode(this.eventId) + (this.score.hashCode() * 31);
        }

        public String toString() {
            return "Feedback(score=" + this.score + ", eventId=" + this.eventId + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/network/OutgoingEvent$Pong;", "Lio/elevenlabs/network/OutgoingEvent;", "eventId", "", "<init>", "(I)V", "getEventId", "()I", "type", "", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Pong extends OutgoingEvent {

        @b("event_id")
        private final int eventId;
        private final String type;

        public Pong(int i10) {
            super(null);
            this.eventId = i10;
            this.type = "pong";
        }

        public static /* synthetic */ Pong copy$default(Pong pong, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pong.eventId;
            }
            return pong.copy(i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        public final Pong copy(int eventId) {
            return new Pong(eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Pong) && this.eventId == ((Pong) other).eventId) {
                return true;
            }
            return false;
        }

        public final int getEventId() {
            return this.eventId;
        }

        @Override // io.elevenlabs.network.OutgoingEvent
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Integer.hashCode(this.eventId);
        }

        public String toString() {
            return com.google.android.gms.internal.play_billing.b.j(this.eventId, "Pong(eventId=", Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/network/OutgoingEvent$UserActivity;", "Lio/elevenlabs/network/OutgoingEvent;", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class UserActivity extends OutgoingEvent {
        private final String type;

        public UserActivity() {
            super(null);
            this.type = "user_activity";
        }

        @Override // io.elevenlabs.network.OutgoingEvent
        public String getType() {
            return this.type;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/network/OutgoingEvent$UserMessage;", "Lio/elevenlabs/network/OutgoingEvent;", ParameterNames.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "type", "getType", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class UserMessage extends OutgoingEvent {
        private final String text;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserMessage(String str) {
            super(null);
            str.getClass();
            this.text = str;
            this.type = "user_message";
        }

        public static /* synthetic */ UserMessage copy$default(UserMessage userMessage, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = userMessage.text;
            }
            return userMessage.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final UserMessage copy(String text) {
            text.getClass();
            return new UserMessage(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof UserMessage) && m.c(this.text, ((UserMessage) other).text)) {
                return true;
            }
            return false;
        }

        public final String getText() {
            return this.text;
        }

        @Override // io.elevenlabs.network.OutgoingEvent
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return f.C("UserMessage(text=", this.text, Separators.RPAREN);
        }
    }

    public /* synthetic */ OutgoingEvent(kotlin.jvm.internal.f fVar) {
        this();
    }

    public abstract String getType();

    private OutgoingEvent() {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/network/OutgoingEvent$ClientToolResult;", "Lio/elevenlabs/network/OutgoingEvent;", "toolCallId", "", "result", "isError", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getToolCallId", "()Ljava/lang/String;", "getResult", "()Z", "type", "getType", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ClientToolResult extends OutgoingEvent {

        @b("is_error")
        private final boolean isError;
        private final String result;

        @b("tool_call_id")
        private final String toolCallId;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientToolResult(String str, String str2, boolean z6) {
            super(null);
            str.getClass();
            str2.getClass();
            this.toolCallId = str;
            this.result = str2;
            this.isError = z6;
            this.type = "client_tool_result";
        }

        public static /* synthetic */ ClientToolResult copy$default(ClientToolResult clientToolResult, String str, String str2, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = clientToolResult.toolCallId;
            }
            if ((i10 & 2) != 0) {
                str2 = clientToolResult.result;
            }
            if ((i10 & 4) != 0) {
                z6 = clientToolResult.isError;
            }
            return clientToolResult.copy(str, str2, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToolCallId() {
            return this.toolCallId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        public final ClientToolResult copy(String toolCallId, String result, boolean isError) {
            toolCallId.getClass();
            result.getClass();
            return new ClientToolResult(toolCallId, result, isError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientToolResult)) {
                return false;
            }
            ClientToolResult clientToolResult = (ClientToolResult) other;
            if (m.c(this.toolCallId, clientToolResult.toolCallId) && m.c(this.result, clientToolResult.result) && this.isError == clientToolResult.isError) {
                return true;
            }
            return false;
        }

        public final String getResult() {
            return this.result;
        }

        public final String getToolCallId() {
            return this.toolCallId;
        }

        @Override // io.elevenlabs.network.OutgoingEvent
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isError) + c.c(this.toolCallId.hashCode() * 31, 31, this.result);
        }

        public final boolean isError() {
            return this.isError;
        }

        public String toString() {
            String str = this.toolCallId;
            String str2 = this.result;
            return n.j(Separators.RPAREN, f.s("ClientToolResult(toolCallId=", str, ", result=", str2, ", isError="), this.isError);
        }

        public /* synthetic */ ClientToolResult(String str, String str2, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
            this(str, str2, (i10 & 4) != 0 ? false : z6);
        }
    }
}
