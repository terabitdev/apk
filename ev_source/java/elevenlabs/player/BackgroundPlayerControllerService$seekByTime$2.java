package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.player.BackgroundPlayerAction;
import ja.g4;
import ja.i4;
import ja.k4;
import ja.z;
import kotlin.Metadata;
import lh.b0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$seekByTime$2", f = "BackgroundPlayerControllerService.kt", l = {415}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$seekByTime$2 extends i implements p {
    final /* synthetic */ z $controller;
    final /* synthetic */ int $durationSeconds;
    final /* synthetic */ Analytics.Event.PlayerControlEventSource $source;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$seekByTime$2(int i10, z zVar, BackgroundPlayerControllerService backgroundPlayerControllerService, Analytics.Event.PlayerControlEventSource playerControlEventSource, wn.c<? super BackgroundPlayerControllerService$seekByTime$2> cVar) {
        super(2, cVar);
        this.$durationSeconds = i10;
        this.$controller = zVar;
        this.this$0 = backgroundPlayerControllerService;
        this.$source = playerControlEventSource;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$seekByTime$2(this.$durationSeconds, this.$controller, this.this$0, this.$source, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BackgroundPlayerControllerService$seekByTime$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        String str;
        Logger logger;
        String str2;
        String str3;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.I$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            int i12 = this.$durationSeconds;
            if (i12 >= 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                str = BackgroundPlayerAction.SeekForward.ACTION_ID;
            } else {
                str = BackgroundPlayerAction.SeekBack.ACTION_ID;
            }
            int abs = Math.abs(i12);
            z zVar = this.$controller;
            Bundle o6 = kd.a.o();
            ExchangeKt.setSeekSource(o6, this.$source);
            ExchangeKt.setSeekDurationSeconds(o6, new Integer(abs));
            b0 e10 = zVar.e(new g4(o6, str), kd.a.o());
            e10.getClass();
            this.L$0 = null;
            this.I$0 = i10;
            this.I$1 = abs;
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
        str2 = this.this$0.tag;
        if (i10 != 0) {
            str3 = "forward";
        } else {
            str3 = "back";
        }
        int i13 = k4Var.f19044a;
        i4 i4Var = k4Var.f19047d;
        StringBuilder o10 = android.gov.nist.javax.sip.header.a.o(i13, "Seek ", str3, " result ", " / ");
        o10.append(i4Var);
        logger.log(str2, o10.toString());
        return sn.z.f31622a;
    }
}
