package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.protobuf.c6;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.readerapp.core.extensions.DateExtensionsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerOption;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel$save$1$1", f = "SleepTimerSheet.kt", l = {127, 125}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SleepTimerViewModel$save$1$1 extends yn.i implements ho.p {
    final /* synthetic */ SleepTimerState $this_queueStateUpdate;
    Object L$0;
    int label;
    final /* synthetic */ SleepTimerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTimerViewModel$save$1$1(SleepTimerViewModel sleepTimerViewModel, SleepTimerState sleepTimerState, wn.c<? super SleepTimerViewModel$save$1$1> cVar) {
        super(2, cVar);
        this.this$0 = sleepTimerViewModel;
        this.$this_queueStateUpdate = sleepTimerState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new SleepTimerViewModel$save$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((SleepTimerViewModel$save$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (r0.setSleepTimer(r8, r7) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r8 == r4) goto L21;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PlayerService playerService;
        GetCurrentTimeUseCase getCurrentTimeUseCase;
        Date date;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            playerService = (PlayerService) this.L$0;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            playerService = this.this$0.playerService;
            SleepTimerOption selected = this.$this_queueStateUpdate.getSelected();
            if (kotlin.jvm.internal.m.c(selected, SleepTimerOption.Off.INSTANCE)) {
                date = null;
                this.L$0 = null;
                this.label = 2;
            } else if (selected instanceof SleepTimerOption.Time) {
                getCurrentTimeUseCase = this.this$0.getCurrentTimeUseCase;
                ir.i m958invokeLRDsOJo$default = GetCurrentTimeUseCase.m958invokeLRDsOJo$default(getCurrentTimeUseCase, 0L, 1, null);
                this.L$0 = playerService;
                this.label = 1;
                obj = ir.r.u(m958invokeLRDsOJo$default, this);
            } else {
                c6.p();
                return null;
            }
        }
        xq.a aVar2 = xq.b.f38124b;
        date = DateExtensionsKt.m1013plusHG0u8IE((Date) obj, xq.g.n(((SleepTimerOption.Time) this.$this_queueStateUpdate.getSelected()).getTimerMinutes(), xq.d.MINUTES));
        this.L$0 = null;
        this.label = 2;
    }
}
