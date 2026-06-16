package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract;", "", "<init>", "()V", "State", SIPHeaderNames.EVENT, "ControlEvent", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AskAgentContract {
    public static final int $stable = 0;
    public static final AskAgentContract INSTANCE = new AskAgentContract();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$ControlEvent;", "", "Close", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$ControlEvent$Close;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface ControlEvent {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$ControlEvent$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$ControlEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Close implements ControlEvent {
            public static final int $stable = 0;
            public static final Close INSTANCE = new Close();

            private Close() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Close)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2026002595;
            }

            public String toString() {
                return "Close";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event;", "", "Retry", "SendMessage", "EndChat", "DismissCustomerCenter", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$DismissCustomerCenter;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$EndChat;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$SendMessage;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$DismissCustomerCenter;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class DismissCustomerCenter implements Event {
            public static final int $stable = 0;
            public static final DismissCustomerCenter INSTANCE = new DismissCustomerCenter();

            private DismissCustomerCenter() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof DismissCustomerCenter)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 831234003;
            }

            public String toString() {
                return "DismissCustomerCenter";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$EndChat;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class EndChat implements Event {
            public static final int $stable = 0;
            public static final EndChat INSTANCE = new EndChat();

            private EndChat() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof EndChat)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2068855337;
            }

            public String toString() {
                return "EndChat";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Retry implements Event {
            public static final int $stable = 0;
            public static final Retry INSTANCE = new Retry();

            private Retry() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Retry)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -754806914;
            }

            public String toString() {
                return "Retry";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event$SendMessage;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event;", ParameterNames.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SendMessage implements Event {
            public static final int $stable = 0;
            private final String text;

            public SendMessage(String str) {
                str.getClass();
                this.text = str;
            }

            public static /* synthetic */ SendMessage copy$default(SendMessage sendMessage, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = sendMessage.text;
                }
                return sendMessage.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final SendMessage copy(String text) {
                text.getClass();
                return new SendMessage(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SendMessage) && m.c(this.text, ((SendMessage) other).text)) {
                    return true;
                }
                return false;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return defpackage.f.C("SendMessage(text=", this.text, Separators.RPAREN);
            }
        }
    }

    private AskAgentContract() {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006#"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$State;", "", "status", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "messages", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;", "isAssistantTyping", "", "errorMessage", "", "isStreamingAgentMessage", "showCustomerCenter", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;Ljava/util/List;ZLjava/lang/String;ZZ)V", "getStatus", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "getMessages", "()Ljava/util/List;", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getShowCustomerCenter", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final String errorMessage;
        private final boolean isAssistantTyping;
        private final boolean isStreamingAgentMessage;
        private final List<ChatMessage> messages;
        private final boolean showCustomerCenter;
        private final AssistantStatus status;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ State(io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus r2, java.util.List r3, boolean r4, java.lang.String r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.f r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus r2 = io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus.CONNECTING
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto Lc
                tn.t r3 = tn.t.f33547a
            Lc:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L12
                r4 = r0
            L12:
                r9 = r8 & 8
                if (r9 == 0) goto L17
                r5 = 0
            L17:
                r9 = r8 & 16
                if (r9 == 0) goto L1c
                r6 = r0
            L1c:
                r8 = r8 & 32
                if (r8 == 0) goto L28
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2f
            L28:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2f:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract.State.<init>(io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus, java.util.List, boolean, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.f):void");
        }

        public static /* synthetic */ State copy$default(State state, AssistantStatus assistantStatus, List list, boolean z6, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                assistantStatus = state.status;
            }
            if ((i10 & 2) != 0) {
                list = state.messages;
            }
            if ((i10 & 4) != 0) {
                z6 = state.isAssistantTyping;
            }
            if ((i10 & 8) != 0) {
                str = state.errorMessage;
            }
            if ((i10 & 16) != 0) {
                z10 = state.isStreamingAgentMessage;
            }
            if ((i10 & 32) != 0) {
                z11 = state.showCustomerCenter;
            }
            boolean z12 = z10;
            boolean z13 = z11;
            return state.copy(assistantStatus, list, z6, str, z12, z13);
        }

        /* renamed from: component1, reason: from getter */
        public final AssistantStatus getStatus() {
            return this.status;
        }

        public final List<ChatMessage> component2() {
            return this.messages;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAssistantTyping() {
            return this.isAssistantTyping;
        }

        /* renamed from: component4, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsStreamingAgentMessage() {
            return this.isStreamingAgentMessage;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowCustomerCenter() {
            return this.showCustomerCenter;
        }

        public final State copy(AssistantStatus status, List<ChatMessage> messages, boolean isAssistantTyping, String errorMessage, boolean isStreamingAgentMessage, boolean showCustomerCenter) {
            status.getClass();
            messages.getClass();
            return new State(status, messages, isAssistantTyping, errorMessage, isStreamingAgentMessage, showCustomerCenter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (this.status == state.status && m.c(this.messages, state.messages) && this.isAssistantTyping == state.isAssistantTyping && m.c(this.errorMessage, state.errorMessage) && this.isStreamingAgentMessage == state.isStreamingAgentMessage && this.showCustomerCenter == state.showCustomerCenter) {
                return true;
            }
            return false;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final List<ChatMessage> getMessages() {
            return this.messages;
        }

        public final boolean getShowCustomerCenter() {
            return this.showCustomerCenter;
        }

        public final AssistantStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            int f10 = com.google.android.gms.internal.play_billing.b.f(n.d(this.status.hashCode() * 31, 31, this.messages), 31, this.isAssistantTyping);
            String str = this.errorMessage;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.showCustomerCenter) + com.google.android.gms.internal.play_billing.b.f((f10 + hashCode) * 31, 31, this.isStreamingAgentMessage);
        }

        public final boolean isAssistantTyping() {
            return this.isAssistantTyping;
        }

        public final boolean isStreamingAgentMessage() {
            return this.isStreamingAgentMessage;
        }

        public String toString() {
            AssistantStatus assistantStatus = this.status;
            List<ChatMessage> list = this.messages;
            boolean z6 = this.isAssistantTyping;
            String str = this.errorMessage;
            boolean z10 = this.isStreamingAgentMessage;
            boolean z11 = this.showCustomerCenter;
            StringBuilder sb = new StringBuilder("State(status=");
            sb.append(assistantStatus);
            sb.append(", messages=");
            sb.append(list);
            sb.append(", isAssistantTyping=");
            defpackage.f.z(sb, z6, ", errorMessage=", str, ", isStreamingAgentMessage=");
            sb.append(z10);
            sb.append(", showCustomerCenter=");
            sb.append(z11);
            sb.append(Separators.RPAREN);
            return sb.toString();
        }

        public State(AssistantStatus assistantStatus, List<ChatMessage> list, boolean z6, String str, boolean z10, boolean z11) {
            assistantStatus.getClass();
            list.getClass();
            this.status = assistantStatus;
            this.messages = list;
            this.isAssistantTyping = z6;
            this.errorMessage = str;
            this.isStreamingAgentMessage = z10;
            this.showCustomerCenter = z11;
        }

        public State() {
            this(null, null, false, null, false, false, 63, null);
        }
    }
}
