package io.livekit.android.room;

import io.livekit.android.room.Room;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.Room", f = "Room.kt", l = {199}, m = "getSid-sxOGYxU")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class Room$getSid$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Room this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$getSid$1(Room room, wn.c<? super Room$getSid$1> cVar) {
        super(cVar);
        this.this$0 = room;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m2538getSidsxOGYxU = this.this$0.m2538getSidsxOGYxU(this);
        if (m2538getSidsxOGYxU == a.f37986a) {
            return m2538getSidsxOGYxU;
        }
        return Room.Sid.m2543boximpl((String) m2538getSidsxOGYxU);
    }
}
