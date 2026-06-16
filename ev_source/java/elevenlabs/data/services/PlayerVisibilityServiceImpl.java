package io.elevenlabs.data.services;

import androidx.lifecycle.b0;
import androidx.lifecycle.u;
import com.google.firebase.sessions.s;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import ho.q;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import ir.h1;
import ir.j1;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/data/services/PlayerVisibilityServiceImpl;", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "Lfr/d0;", "coroutineScope", "Landroidx/lifecycle/b0;", "processLifecycleOwner", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Lfr/d0;Landroidx/lifecycle/b0;Lio/elevenlabs/domain/DispatcherFactory;)V", "Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;", "getPlayerVisibility", "()Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;", "Lsn/z;", "onMiniPlayerCreated", "()V", "onPlayerScreenTextVisible", "onPlayerScreenAudioOnlyVisible", "Lir/j1;", "foregroundStateFlow", "Lir/j1;", "resultStateFlow", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerVisibilityServiceImpl implements PlayerVisibilityService {
    private final j1 foregroundStateFlow;
    private final j1 resultStateFlow;

    public PlayerVisibilityServiceImpl(@ApplicationCoroutineScope d0 d0Var, b0 b0Var, DispatcherFactory dispatcherFactory) {
        d0Var.getClass();
        b0Var.getClass();
        dispatcherFactory.getClass();
        Analytics.Event.PlayerVisibility playerVisibility = Analytics.Event.PlayerVisibility.Unknown;
        this.foregroundStateFlow = r.c(playerVisibility);
        this.resultStateFlow = r.c(playerVisibility);
        g0.D(d0Var, dispatcherFactory.getDefault(), null, new AnonymousClass1(b0Var, this, null), 2);
    }

    @Override // io.elevenlabs.domain.services.PlayerVisibilityService
    public Analytics.Event.PlayerVisibility getPlayerVisibility() {
        return (Analytics.Event.PlayerVisibility) this.resultStateFlow.getValue();
    }

    @Override // io.elevenlabs.domain.services.PlayerVisibilityService
    public void onMiniPlayerCreated() {
        this.foregroundStateFlow.setValue(Analytics.Event.PlayerVisibility.Mini);
    }

    @Override // io.elevenlabs.domain.services.PlayerVisibilityService
    public void onPlayerScreenAudioOnlyVisible() {
        this.foregroundStateFlow.setValue(Analytics.Event.PlayerVisibility.AudioOnly);
    }

    @Override // io.elevenlabs.domain.services.PlayerVisibilityService
    public void onPlayerScreenTextVisible() {
        this.foregroundStateFlow.setValue(Analytics.Event.PlayerVisibility.Text);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.PlayerVisibilityServiceImpl$1", f = "PlayerVisibilityServiceImpl.kt", l = {30}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.PlayerVisibilityServiceImpl$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        final /* synthetic */ b0 $processLifecycleOwner;
        int label;
        final /* synthetic */ PlayerVisibilityServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b0 b0Var, PlayerVisibilityServiceImpl playerVisibilityServiceImpl, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$processLifecycleOwner = b0Var;
            this.this$0 = playerVisibilityServiceImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(u uVar, Analytics.Event.PlayerVisibility playerVisibility, wn.c cVar) {
            return new sn.k(uVar, playerVisibility);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$processLifecycleOwner, this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            wn.c cVar = null;
            z zVar = z.f31622a;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                    return zVar;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
            z1 currentStateFlow = this.$processLifecycleOwner.getLifecycle().getCurrentStateFlow();
            j1 j1Var = this.this$0.foregroundStateFlow;
            AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
            final PlayerVisibilityServiceImpl playerVisibilityServiceImpl = this.this$0;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.data.services.PlayerVisibilityServiceImpl.1.4
                public final Object emit(sn.k kVar, wn.c<? super z> cVar2) {
                    u uVar = (u) kVar.f31600a;
                    Analytics.Event.PlayerVisibility playerVisibility = (Analytics.Event.PlayerVisibility) kVar.f31601b;
                    j1 j1Var2 = PlayerVisibilityServiceImpl.this.resultStateFlow;
                    if (!uVar.a(u.f2895e)) {
                        playerVisibility = Analytics.Event.PlayerVisibility.Background;
                    }
                    j1Var2.setValue(playerVisibility);
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar2) {
                    return emit((sn.k) obj2, (wn.c<? super z>) cVar2);
                }
            };
            this.label = 1;
            Object a10 = jr.b.a(h1.f17948a, new s(anonymousClass3, cVar, 3), jVar, this, new ir.i[]{currentStateFlow, j1Var});
            xn.a aVar = xn.a.f37986a;
            if (a10 != aVar) {
                a10 = zVar;
            }
            if (a10 == aVar) {
                return aVar;
            }
            return zVar;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.data.services.PlayerVisibilityServiceImpl$1$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.a implements q {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, sn.k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            @Override // ho.q
            public final Object invoke(u uVar, Analytics.Event.PlayerVisibility playerVisibility, wn.c<? super sn.k> cVar) {
                return AnonymousClass1.invokeSuspend$lambda$0(uVar, playerVisibility, cVar);
            }
        }
    }
}
