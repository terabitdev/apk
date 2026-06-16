package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.readerapp.core.extensions.CoroutineExtensionsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsControlEvent;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt$ReadDetailsScreen$9$1", f = "ReadDetailsScreen.kt", l = {187}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsScreenKt$ReadDetailsScreen$9$1 extends yn.i implements ho.p {
    final /* synthetic */ ho.p $onNavigateToPlayer;
    final /* synthetic */ ReadDetailsViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsScreenKt$ReadDetailsScreen$9$1(ReadDetailsViewModel readDetailsViewModel, ho.p pVar, wn.c<? super ReadDetailsScreenKt$ReadDetailsScreen$9$1> cVar) {
        super(2, cVar);
        this.$vm = readDetailsViewModel;
        this.$onNavigateToPlayer = pVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsScreenKt$ReadDetailsScreen$9$1(this.$vm, this.$onNavigateToPlayer, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsScreenKt$ReadDetailsScreen$9$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            ir.i throttleDistinct$default = CoroutineExtensionsKt.throttleDistinct$default(this.$vm.getControlEventsFlow(), 300L, null, 2, null);
            final ho.p pVar = this.$onNavigateToPlayer;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt$ReadDetailsScreen$9$1.1
                public final Object emit(ReadDetailsControlEvent readDetailsControlEvent, wn.c<? super sn.z> cVar) {
                    if (readDetailsControlEvent instanceof ReadDetailsControlEvent.NavigateToPlayer) {
                        ho.p.this.invoke(((ReadDetailsControlEvent.NavigateToPlayer) readDetailsControlEvent).getReadId(), Analytics.Event.PlayerActivationSource.ReadDetails);
                        return sn.z.f31622a;
                    }
                    c6.p();
                    return null;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((ReadDetailsControlEvent) obj2, (wn.c<? super sn.z>) cVar);
                }
            };
            this.label = 1;
            Object collect = throttleDistinct$default.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
