package io.livekit.android.room.metrics;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import ho.p;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.Room;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.metrics.RTCMetricsManagerKt$collectMetrics$2", f = "RTCMetricsManager.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lfr/k1;", "<anonymous>", "(Lfr/d0;)Lfr/k1;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCMetricsManagerKt$collectMetrics$2 extends i implements p {
    final /* synthetic */ Room $room;
    final /* synthetic */ RTCEngine $rtcEngine;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.metrics.RTCMetricsManagerKt$collectMetrics$2$1", f = "RTCMetricsManager.kt", l = {45}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.metrics.RTCMetricsManagerKt$collectMetrics$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Room $room;
        final /* synthetic */ RTCEngine $rtcEngine;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Room room, RTCEngine rTCEngine, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$room = room;
            this.$rtcEngine = rTCEngine;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$room, this.$rtcEngine, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Object collectPublisherMetrics;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                Room room = this.$room;
                RTCEngine rTCEngine = this.$rtcEngine;
                this.label = 1;
                collectPublisherMetrics = RTCMetricsManagerKt.collectPublisherMetrics(room, rTCEngine, this);
                xn.a aVar = xn.a.f37986a;
                if (collectPublisherMetrics == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.metrics.RTCMetricsManagerKt$collectMetrics$2$2", f = "RTCMetricsManager.kt", l = {46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.metrics.RTCMetricsManagerKt$collectMetrics$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ Room $room;
        final /* synthetic */ RTCEngine $rtcEngine;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Room room, RTCEngine rTCEngine, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$room = room;
            this.$rtcEngine = rTCEngine;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$room, this.$rtcEngine, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Object collectSubscriberMetrics;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                Room room = this.$room;
                RTCEngine rTCEngine = this.$rtcEngine;
                this.label = 1;
                collectSubscriberMetrics = RTCMetricsManagerKt.collectSubscriberMetrics(room, rTCEngine, this);
                xn.a aVar = xn.a.f37986a;
                if (collectSubscriberMetrics == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCMetricsManagerKt$collectMetrics$2(Room room, RTCEngine rTCEngine, c<? super RTCMetricsManagerKt$collectMetrics$2> cVar) {
        super(2, cVar);
        this.$room = room;
        this.$rtcEngine = rTCEngine;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCMetricsManagerKt$collectMetrics$2 rTCMetricsManagerKt$collectMetrics$2 = new RTCMetricsManagerKt$collectMetrics$2(this.$room, this.$rtcEngine, cVar);
        rTCMetricsManagerKt$collectMetrics$2.L$0 = obj;
        return rTCMetricsManagerKt$collectMetrics$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super k1> cVar) {
        return ((RTCMetricsManagerKt$collectMetrics$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.g(obj);
            d0 d0Var = (d0) this.L$0;
            g0.D(d0Var, null, null, new AnonymousClass1(this.$room, this.$rtcEngine, null), 3);
            return g0.D(d0Var, null, null, new AnonymousClass2(this.$room, this.$rtcEngine, null), 3);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
