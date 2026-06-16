package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.readerapp.core.extensions.CoroutineExtensionsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import ir.j;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt$MiniPlayer$1$1", f = "MiniPlayer.kt", l = {64}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class MiniPlayerKt$MiniPlayer$1$1 extends i implements p {
    final /* synthetic */ l $navigateToPlayer;
    final /* synthetic */ MiniPlayerViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerKt$MiniPlayer$1$1(MiniPlayerViewModel miniPlayerViewModel, l lVar, wn.c<? super MiniPlayerKt$MiniPlayer$1$1> cVar) {
        super(2, cVar);
        this.$viewModel = miniPlayerViewModel;
        this.$navigateToPlayer = lVar;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new MiniPlayerKt$MiniPlayer$1$1(this.$viewModel, this.$navigateToPlayer, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((MiniPlayerKt$MiniPlayer$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            ir.i throttleDistinct$default = CoroutineExtensionsKt.throttleDistinct$default(this.$viewModel.getControlEventsFlow(), 300L, null, 2, null);
            final l lVar = this.$navigateToPlayer;
            j jVar = new j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt$MiniPlayer$1$1.1
                public final Object emit(MiniPlayerContract.ControlEvent controlEvent, wn.c<? super z> cVar) {
                    if (controlEvent instanceof MiniPlayerContract.ControlEvent.NavigateToPlayer) {
                        l.this.invoke(((MiniPlayerContract.ControlEvent.NavigateToPlayer) controlEvent).getReadId());
                        return z.f31622a;
                    }
                    c6.p();
                    return null;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((MiniPlayerContract.ControlEvent) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = throttleDistinct$default.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
