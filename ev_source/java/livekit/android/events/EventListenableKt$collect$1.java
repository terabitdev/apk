package io.livekit.android.events;

import kotlin.Metadata;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.events.EventListenableKt", f = "EventListenable.kt", l = {34}, m = "collect")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes4.dex */
public final class EventListenableKt$collect$1<T> extends c {
    int label;
    /* synthetic */ Object result;

    public EventListenableKt$collect$1(wn.c<? super EventListenableKt$collect$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EventListenableKt.collect(null, null, this);
    }
}
