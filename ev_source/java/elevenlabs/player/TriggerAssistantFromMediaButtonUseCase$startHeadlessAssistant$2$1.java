package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import w7.h1;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1", f = "TriggerAssistantFromMediaButtonUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1 extends i implements p {
    final /* synthetic */ h1 $player;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1(h1 h1Var, wn.c<? super TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1> cVar) {
        super(2, cVar);
        this.$player = h1Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1(this.$player, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$player.play();
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
