package io.livekit.android.room.types;

import ho.l;
import io.livekit.android.room.types.AgentOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import od.j;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lod/j;", "it", "Lio/livekit/android/room/types/AgentOutput;", "invoke", "(Lod/j;)Lio/livekit/android/room/types/AgentOutput;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AgentTypesKt$klaxon$3 extends n implements l {
    public static final AgentTypesKt$klaxon$3 INSTANCE = new AgentTypesKt$klaxon$3();

    public AgentTypesKt$klaxon$3() {
        super(1);
    }

    @Override // ho.l
    public final AgentOutput invoke(j jVar) {
        jVar.getClass();
        AgentOutput.Companion companion = AgentOutput.INSTANCE;
        String str = jVar.f25067c;
        str.getClass();
        return companion.fromValue(str);
    }
}
