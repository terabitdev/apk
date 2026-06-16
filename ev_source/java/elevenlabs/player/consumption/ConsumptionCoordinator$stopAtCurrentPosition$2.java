package io.elevenlabs.player.consumption;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.ConsumptionSpan;
import io.elevenlabs.domain.services.ConsumptionTrackingService;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.consumption.ConsumptionCoordinator$stopAtCurrentPosition$2", f = "ConsumptionCoordinator.kt", l = {50}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ConsumptionCoordinator$stopAtCurrentPosition$2 extends i implements p {
    final /* synthetic */ ConsumptionSpan $span;
    int label;
    final /* synthetic */ ConsumptionCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumptionCoordinator$stopAtCurrentPosition$2(ConsumptionCoordinator consumptionCoordinator, ConsumptionSpan consumptionSpan, c<? super ConsumptionCoordinator$stopAtCurrentPosition$2> cVar) {
        super(2, cVar);
        this.this$0 = consumptionCoordinator;
        this.$span = consumptionSpan;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ConsumptionCoordinator$stopAtCurrentPosition$2(this.this$0, this.$span, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ConsumptionCoordinator$stopAtCurrentPosition$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConsumptionTrackingService consumptionTrackingService;
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
            consumptionTrackingService = this.this$0.trackingService;
            ConsumptionSpan consumptionSpan = this.$span;
            this.label = 1;
            Object saveSpan = consumptionTrackingService.saveSpan(consumptionSpan, this);
            xn.a aVar = xn.a.f37986a;
            if (saveSpan == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
