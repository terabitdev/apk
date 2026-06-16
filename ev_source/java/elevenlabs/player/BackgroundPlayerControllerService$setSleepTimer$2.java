package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.player.BackgroundPlayerAction;
import ja.g4;
import ja.k4;
import ja.z;
import java.util.Date;
import kotlin.Metadata;
import lh.b0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$setSleepTimer$2", f = "BackgroundPlayerControllerService.kt", l = {386}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$setSleepTimer$2 extends i implements p {
    final /* synthetic */ z $controller;
    final /* synthetic */ Date $date;
    int label;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$setSleepTimer$2(z zVar, BackgroundPlayerControllerService backgroundPlayerControllerService, Date date, wn.c<? super BackgroundPlayerControllerService$setSleepTimer$2> cVar) {
        super(2, cVar);
        this.$controller = zVar;
        this.this$0 = backgroundPlayerControllerService;
        this.$date = date;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$setSleepTimer$2(this.$controller, this.this$0, this.$date, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BackgroundPlayerControllerService$setSleepTimer$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Long l4;
        Logger logger;
        String str;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            z zVar = this.$controller;
            Bundle o6 = kd.a.o();
            Date date = this.$date;
            if (date != null) {
                l4 = new Long(date.getTime());
            } else {
                l4 = null;
            }
            ExchangeKt.setSleepTimerTimestamp(o6, l4);
            b0 e10 = zVar.e(new g4(o6, BackgroundPlayerAction.SleepTimer.ACTION_ID), kd.a.o());
            e10.getClass();
            this.label = 1;
            obj = BackgroundPlayerControllerServiceKt.await(e10, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        obj.getClass();
        k4 k4Var = (k4) obj;
        logger = this.this$0.logger;
        str = this.this$0.tag;
        logger.log(str, "Set sleep timer result " + k4Var.f19044a + " / " + k4Var.f19047d);
        return sn.z.f31622a;
    }
}
