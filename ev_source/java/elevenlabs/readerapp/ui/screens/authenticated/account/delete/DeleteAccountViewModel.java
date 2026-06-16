package io.elevenlabs.readerapp.ui.screens.authenticated.account.delete;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.j;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/delete/DeleteAccountViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/delete/DeleteAccountState;", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "Lsn/z;", "deleteAccount", "()V", "Lio/elevenlabs/domain/services/AuthService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DeleteAccountViewModel extends MviViewModel<DeleteAccountState> {
    public static final int $stable = 8;
    private final AuthService authService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeleteAccountViewModel(AuthService authService, ToastService toastService, StringProvider stringProvider, ResolveErrorMessageUseCase resolveErrorMessageUseCase, DispatcherFactory dispatcherFactory, Logger logger) {
        super(new DeleteAccountState(null, false, 3, 0 == true ? 1 : 0), dispatcherFactory, logger);
        authService.getClass();
        toastService.getClass();
        stringProvider.getClass();
        resolveErrorMessageUseCase.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        this.authService = authService;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        g0.D(c1.h(this), null, null, new AnonymousClass1(null), 3);
    }

    public final void deleteAccount() {
        g0.D(c1.h(this), null, null, new DeleteAccountViewModel$deleteAccount$1(this, null), 3);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel$1", f = "DeleteAccountViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

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
                ir.i user = DeleteAccountViewModel.this.authService.user();
                C00311 c00311 = new C00311(DeleteAccountViewModel.this);
                this.label = 1;
                Object collect = user.collect(c00311, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00311<T> implements j {
            final /* synthetic */ DeleteAccountViewModel this$0;

            public C00311(DeleteAccountViewModel deleteAccountViewModel) {
                this.this$0 = deleteAccountViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DeleteAccountState emit$lambda$0(User user, DeleteAccountState deleteAccountState) {
                deleteAccountState.getClass();
                return DeleteAccountState.copy$default(deleteAccountState, user, false, 2, null);
            }

            public final Object emit(User user, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new d(user, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((User) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
