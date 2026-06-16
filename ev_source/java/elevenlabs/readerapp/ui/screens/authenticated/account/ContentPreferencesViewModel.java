package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ContentPreferencesViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ContentPreferencesState;", "Lio/elevenlabs/domain/services/AssistantPreferencesService;", "assistantPreferencesService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Lio/elevenlabs/domain/services/AssistantPreferencesService;Lio/elevenlabs/domain/DispatcherFactory;)V", "", "value", "Lsn/z;", "toggleAssistant", "(Z)V", "Lio/elevenlabs/domain/services/AssistantPreferencesService;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ContentPreferencesViewModel extends MviViewModel<ContentPreferencesState> {
    public static final int $stable = 8;
    private final AssistantPreferencesService assistantPreferencesService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPreferencesViewModel(AssistantPreferencesService assistantPreferencesService, DispatcherFactory dispatcherFactory) {
        super(new ContentPreferencesState(null, 1, null), dispatcherFactory, null, 4, null);
        assistantPreferencesService.getClass();
        dispatcherFactory.getClass();
        this.assistantPreferencesService = assistantPreferencesService;
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
    }

    public final void toggleAssistant(boolean value) {
        this.assistantPreferencesService.setAssistantEnabled(value);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel$1", f = "ContentPreferencesViewModel.kt", l = {19}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
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
                ir.i observeAssistantEnabled = ContentPreferencesViewModel.this.assistantPreferencesService.observeAssistantEnabled();
                C00301 c00301 = new C00301(ContentPreferencesViewModel.this);
                this.label = 1;
                Object collect = observeAssistantEnabled.collect(c00301, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00301<T> implements ir.j {
            final /* synthetic */ ContentPreferencesViewModel this$0;

            public C00301(ContentPreferencesViewModel contentPreferencesViewModel) {
                this.this$0 = contentPreferencesViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ContentPreferencesState emit$lambda$0(boolean z6, ContentPreferencesState contentPreferencesState) {
                contentPreferencesState.getClass();
                return contentPreferencesState.copy(Boolean.valueOf(z6));
            }

            public final Object emit(final boolean z6, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.r
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        ContentPreferencesState emit$lambda$0;
                        emit$lambda$0 = ContentPreferencesViewModel.AnonymousClass1.C00301.emit$lambda$0(z6, (ContentPreferencesState) obj);
                        return emit$lambda$0;
                    }
                });
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super z>) cVar);
            }
        }
    }
}
