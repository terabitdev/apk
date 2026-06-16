package io.livekit.android.events;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.p;
import ir.n1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aF\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086H¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {TokenNames.T, "Lio/livekit/android/events/EventListenable;", "Lkotlin/Function2;", "Lwn/c;", "Lsn/z;", "", "action", "", "collect", "(Lio/livekit/android/events/EventListenable;Lho/p;Lwn/c;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EventListenableKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object collect(EventListenable<? extends T> eventListenable, p pVar, c<?> cVar) {
        EventListenableKt$collect$1 eventListenableKt$collect$1;
        int i10;
        if (cVar instanceof EventListenableKt$collect$1) {
            eventListenableKt$collect$1 = (EventListenableKt$collect$1) cVar;
            int i11 = eventListenableKt$collect$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eventListenableKt$collect$1.label = i11 - Integer.MIN_VALUE;
                Object obj = eventListenableKt$collect$1.result;
                i10 = eventListenableKt$collect$1.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a.g(obj);
                } else {
                    a.g(obj);
                    n1 events = eventListenable.getEvents();
                    EventListenableKt$collect$2 eventListenableKt$collect$2 = new EventListenableKt$collect$2(pVar);
                    eventListenableKt$collect$1.label = 1;
                    Object collect = events.collect(eventListenableKt$collect$2, eventListenableKt$collect$1);
                    xn.a aVar = xn.a.f37986a;
                    if (collect == aVar) {
                        return aVar;
                    }
                }
                c6.u();
                return null;
            }
        }
        eventListenableKt$collect$1 = new EventListenableKt$collect$1(cVar);
        Object obj2 = eventListenableKt$collect$1.result;
        i10 = eventListenableKt$collect$1.label;
        if (i10 == 0) {
        }
        c6.u();
        return null;
    }

    private static final <T> Object collect$$forInline(EventListenable<? extends T> eventListenable, p pVar, c<?> cVar) {
        eventListenable.getEvents().collect(new EventListenableKt$collect$2(pVar), cVar);
        throw new RuntimeException();
    }
}
