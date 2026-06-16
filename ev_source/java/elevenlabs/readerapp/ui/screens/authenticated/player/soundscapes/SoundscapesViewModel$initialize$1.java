package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.SoundscapesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapeCategory;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import java.util.List;
import kotlin.Metadata;
import sn.z;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$initialize$1", f = "SoundscapesViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SoundscapesViewModel$initialize$1 extends yn.i implements p {
    int label;
    final /* synthetic */ SoundscapesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapesViewModel$initialize$1(SoundscapesViewModel soundscapesViewModel, wn.c<? super SoundscapesViewModel$initialize$1> cVar) {
        super(2, cVar);
        this.this$0 = soundscapesViewModel;
    }

    public static final SoundscapesContract.State invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, SoundscapesContract.State state) {
        return SoundscapesContract.State.copy$default(state, false, ((AsyncCallResult.Error) asyncCallResult).getError().toString(), null, null, null, u.P, null, null, null, null, null, null, null, 8188, null);
    }

    public static final SoundscapesContract.State invokeSuspend$lambda$2(List list, SoundscapesContract.State state) {
        return SoundscapesContract.State.copy$default(state, false, null, list, SoundscapeCategory.INSTANCE.buildTabs(list), SoundscapeCategory.All.INSTANCE, u.P, null, null, null, null, null, null, null, 8162, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SoundscapesViewModel$initialize$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SoundscapesViewModel$initialize$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        SoundscapesService soundscapesService;
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
            this.this$0.queueStateUpdate(new l(0));
            soundscapesService = this.this$0.soundscapesService;
            this.label = 1;
            obj = soundscapesService.getSoundscapes(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        boolean z6 = asyncCallResult instanceof AsyncCallResult.Success;
        z zVar = z.f31622a;
        if (z6) {
            this.this$0.queueStateUpdate(new m((List) ((AsyncCallResult.Success) asyncCallResult).getData(), 1));
            this.this$0.connectAndObservePlayer();
            return zVar;
        }
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            this.this$0.queueStateUpdate(new m((AsyncCallResult.Error) asyncCallResult, 0));
            this.this$0.connectAndObservePlayer();
            return zVar;
        }
        c6.p();
        return null;
    }
}
