package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel$setReadId$1$1", f = "SleepTimerSheet.kt", l = {115}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SleepTimerViewModel$setReadId$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ SleepTimerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTimerViewModel$setReadId$1$1(SleepTimerViewModel sleepTimerViewModel, String str, wn.c<? super SleepTimerViewModel$setReadId$1$1> cVar) {
        super(2, cVar);
        this.this$0 = sleepTimerViewModel;
        this.$readId = str;
    }

    public static final SleepTimerState invokeSuspend$lambda$0(ReadMeta readMeta, SleepTimerState sleepTimerState) {
        return SleepTimerState.copy$default(sleepTimerState, null, readMeta, null, null, 13, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new SleepTimerViewModel$setReadId$1$1(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((SleepTimerViewModel$setReadId$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
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
            readsService = this.this$0.readsService;
            String str = this.$readId;
            this.label = 1;
            obj = readsService.getRead(str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        this.this$0.queueStateUpdate(new s(2, (ReadMeta) obj));
        return sn.z.f31622a;
    }
}
