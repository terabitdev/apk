package io.livekit.android.room.types;

import android.gov.nist.core.Separators;
import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lio/livekit/android/room/types/AgentOutput;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentTypesKt$klaxon$4 extends n implements l {
    public static final AgentTypesKt$klaxon$4 INSTANCE = new AgentTypesKt$klaxon$4();

    public AgentTypesKt$klaxon$4() {
        super(1);
    }

    @Override // ho.l
    public final String invoke(AgentOutput agentOutput) {
        agentOutput.getClass();
        return Separators.DOUBLE_QUOTE + agentOutput.getValue() + '\"';
    }
}
