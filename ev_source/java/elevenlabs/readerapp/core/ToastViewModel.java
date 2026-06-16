package io.elevenlabs.readerapp.core;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/core/ToastViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/core/ToastState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ToastService;)V", "onToastClick", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onToastHidden", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ToastViewModel extends MviViewModel<ToastState> {
    public static final int $stable = 8;
    private final ToastService toastService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.ToastViewModel$1", f = "ToastViewModel.kt", l = {46}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.ToastViewModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.ToastViewModel$1$1", f = "ToastViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/services/ToastService$Toast;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/services/ToastService$Toast;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.ToastViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00221 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ToastViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00221(ToastViewModel toastViewModel, wn.c<? super C00221> cVar) {
                super(2, cVar);
                this.this$0 = toastViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ToastState invokeSuspend$lambda$0(ToastService.Toast toast, ToastState toastState) {
                boolean z6;
                if (toast != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return toastState.copy(toast, z6);
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00221 c00221 = new C00221(this.this$0, cVar);
                c00221.L$0 = obj;
                return c00221;
            }

            @Override // ho.p
            public final Object invoke(ToastService.Toast toast, wn.c<? super z> cVar) {
                return ((C00221) create(toast, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                ToastService.Toast toast = (ToastService.Toast) this.L$0;
                int i10 = this.label;
                int i11 = 1;
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new b(toast, i11));
                    if (toast != null) {
                        xq.a aVar = xq.b.f38124b;
                        long n2 = xq.g.n(5, xq.d.SECONDS);
                        this.L$0 = null;
                        this.label = 1;
                        Object n10 = g0.n(n2, this);
                        xn.a aVar2 = xn.a.f37986a;
                        if (n10 == aVar2) {
                            return aVar2;
                        }
                    }
                    return z.f31622a;
                }
                this.this$0.queueStateUpdate(new n(0));
                return z.f31622a;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                ir.i toast = ToastViewModel.this.toastService.getToast();
                C00221 c00221 = new C00221(ToastViewModel.this, null);
                this.label = 1;
                Object l4 = r.l(toast, c00221, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ToastViewModel(DispatcherFactory dispatcherFactory, ToastService toastService) {
        super(new ToastState(null, false, 3, 0 == true ? 1 : 0), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        toastService.getClass();
        Logger logger = null;
        this.toastService = toastService;
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToastState onToastClick$lambda$0(ToastState toastState) {
        toastState.getClass();
        return ToastState.copy$default(toastState, null, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToastState onToastHidden$lambda$0(ToastViewModel toastViewModel, ToastState toastState) {
        toastState.getClass();
        if (toastState.getToast() != null) {
            toastViewModel.toastService.pop(toastState.getToast());
        }
        return toastState;
    }

    public final MviViewModel.StateUpdate onToastClick() {
        return queueStateUpdate(new n(8));
    }

    public final MviViewModel.StateUpdate onToastHidden() {
        return queueStateUpdate(new m(this, 0));
    }
}
