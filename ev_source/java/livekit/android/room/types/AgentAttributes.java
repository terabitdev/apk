package io.livekit.android.room.types;

import java.io.StringReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import od.h;
import od.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BA\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0006\u0010\"\u001a\u00020\nJ\t\u0010#\u001a\u00020\nHÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/livekit/android/room/types/AgentAttributes;", "", "lkAgentInputs", "", "Lio/livekit/android/room/types/AgentInput;", "lkAgentOutputs", "Lio/livekit/android/room/types/AgentOutput;", "lkAgentState", "Lio/livekit/android/room/types/AgentState;", "lkPublishOnBehalf", "", "(Ljava/util/List;Ljava/util/List;Lio/livekit/android/room/types/AgentState;Ljava/lang/String;)V", "getLkAgentInputs$annotations", "()V", "getLkAgentInputs", "()Ljava/util/List;", "getLkAgentOutputs$annotations", "getLkAgentOutputs", "getLkAgentState$annotations", "getLkAgentState", "()Lio/livekit/android/room/types/AgentState;", "getLkPublishOnBehalf$annotations", "getLkPublishOnBehalf", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toJson", "toString", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class AgentAttributes {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<AgentInput> lkAgentInputs;
    private final List<AgentOutput> lkAgentOutputs;
    private final AgentState lkAgentState;
    private final String lkPublishOnBehalf;

    public /* synthetic */ AgentAttributes(List list, List list2, AgentState agentState, String str, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2, (i10 & 4) != 0 ? null : agentState, (i10 & 8) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentAttributes copy$default(AgentAttributes agentAttributes, List list, List list2, AgentState agentState, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = agentAttributes.lkAgentInputs;
        }
        if ((i10 & 2) != 0) {
            list2 = agentAttributes.lkAgentOutputs;
        }
        if ((i10 & 4) != 0) {
            agentState = agentAttributes.lkAgentState;
        }
        if ((i10 & 8) != 0) {
            str = agentAttributes.lkPublishOnBehalf;
        }
        return agentAttributes.copy(list, list2, agentState, str);
    }

    public final List<AgentInput> component1() {
        return this.lkAgentInputs;
    }

    public final List<AgentOutput> component2() {
        return this.lkAgentOutputs;
    }

    /* renamed from: component3, reason: from getter */
    public final AgentState getLkAgentState() {
        return this.lkAgentState;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLkPublishOnBehalf() {
        return this.lkPublishOnBehalf;
    }

    public final AgentAttributes copy(List<? extends AgentInput> lkAgentInputs, List<? extends AgentOutput> lkAgentOutputs, AgentState lkAgentState, String lkPublishOnBehalf) {
        return new AgentAttributes(lkAgentInputs, lkAgentOutputs, lkAgentState, lkPublishOnBehalf);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentAttributes)) {
            return false;
        }
        AgentAttributes agentAttributes = (AgentAttributes) other;
        if (m.c(this.lkAgentInputs, agentAttributes.lkAgentInputs) && m.c(this.lkAgentOutputs, agentAttributes.lkAgentOutputs) && this.lkAgentState == agentAttributes.lkAgentState && m.c(this.lkPublishOnBehalf, agentAttributes.lkPublishOnBehalf)) {
            return true;
        }
        return false;
    }

    public final List<AgentInput> getLkAgentInputs() {
        return this.lkAgentInputs;
    }

    public final List<AgentOutput> getLkAgentOutputs() {
        return this.lkAgentOutputs;
    }

    public final AgentState getLkAgentState() {
        return this.lkAgentState;
    }

    public final String getLkPublishOnBehalf() {
        return this.lkPublishOnBehalf;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        List<AgentInput> list = this.lkAgentInputs;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = hashCode * 31;
        List<AgentOutput> list2 = this.lkAgentOutputs;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        AgentState agentState = this.lkAgentState;
        if (agentState == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = agentState.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str = this.lkPublishOnBehalf;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i13 + i10;
    }

    public final String toJson() {
        l lVar;
        lVar = AgentTypesKt.klaxon;
        return lVar.e(this, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AgentAttributes(lkAgentInputs=");
        sb.append(this.lkAgentInputs);
        sb.append(", lkAgentOutputs=");
        sb.append(this.lkAgentOutputs);
        sb.append(", lkAgentState=");
        sb.append(this.lkAgentState);
        sb.append(", lkPublishOnBehalf=");
        return defpackage.f.m(sb, this.lkPublishOnBehalf, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/types/AgentAttributes$Companion;", "", "()V", "fromJson", "Lio/livekit/android/room/types/AgentAttributes;", "json", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AgentAttributes fromJson(String json) {
            l lVar;
            json.getClass();
            lVar = AgentTypesKt.klaxon;
            f0 f0Var = e0.f20562a;
            return (AgentAttributes) lVar.c((h) l.d(lVar, f0Var.b(AgentAttributes.class)).b0(new StringReader(json)), AgentAttributes.class, f0Var.b(AgentAttributes.class));
        }

        private Companion() {
        }
    }

    @od.f(name = "lk.agent.inputs")
    public static /* synthetic */ void getLkAgentInputs$annotations() {
    }

    @od.f(name = "lk.agent.outputs")
    public static /* synthetic */ void getLkAgentOutputs$annotations() {
    }

    @od.f(name = "lk.agent.state")
    public static /* synthetic */ void getLkAgentState$annotations() {
    }

    @od.f(name = "lk.publish_on_behalf")
    public static /* synthetic */ void getLkPublishOnBehalf$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgentAttributes(List<? extends AgentInput> list, List<? extends AgentOutput> list2, AgentState agentState, String str) {
        this.lkAgentInputs = list;
        this.lkAgentOutputs = list2;
        this.lkAgentState = agentState;
        this.lkPublishOnBehalf = str;
    }

    public AgentAttributes() {
        this(null, null, null, null, 15, null);
    }
}
