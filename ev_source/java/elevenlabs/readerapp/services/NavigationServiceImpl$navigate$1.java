package io.elevenlabs.readerapp.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.readerapp.core.NavigationDispatcher;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.NavigationServiceImpl$navigate$1", f = "NavigationServiceImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class NavigationServiceImpl$navigate$1 extends i implements p {
    final /* synthetic */ Destination $destination;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NavigationServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationServiceImpl$navigate$1(NavigationServiceImpl navigationServiceImpl, Destination destination, c<? super NavigationServiceImpl$navigate$1> cVar) {
        super(2, cVar);
        this.this$0 = navigationServiceImpl;
        this.$destination = destination;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        NavigationServiceImpl$navigate$1 navigationServiceImpl$navigate$1 = new NavigationServiceImpl$navigate$1(this.this$0, this.$destination, cVar);
        navigationServiceImpl$navigate$1.L$0 = obj;
        return navigationServiceImpl$navigate$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((NavigationServiceImpl$navigate$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        NavigationDispatcherProvider navigationDispatcherProvider;
        Logger logger;
        d0 d0Var = (d0) this.L$0;
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
            navigationDispatcherProvider = this.this$0.navigationDispatcherProvider;
            NavigationDispatcher dispatcher = navigationDispatcherProvider.getDispatcher();
            if (dispatcher == null) {
                logger = this.this$0.logger;
                logger.logError("NavigationService", "navigate - dispatcher missing; request dropped", null);
            } else {
                Destination destination = this.$destination;
                this.L$0 = d0Var;
                this.label = 1;
                Object requestNavigation = dispatcher.requestNavigation(destination, this);
                xn.a aVar = xn.a.f37986a;
                if (requestNavigation == aVar) {
                    return aVar;
                }
            }
        }
        return z.f31622a;
    }
}
