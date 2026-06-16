package io.elevenlabs.readerapp.core;

import androidx.lifecycle.c1;
import androidx.lifecycle.j1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import ho.q;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import ir.b2;
import ir.d1;
import ir.l1;
import ir.r;
import ir.w;
import ir.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00014B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\r2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010!\u001a\u00020 2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001bH\u0004¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010'\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R0\u0010*\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lio/elevenlabs/readerapp/core/MviViewModel;", "State", "Landroidx/lifecycle/j1;", "initialState", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Ljava/lang/Object;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/core/Reducer;", "reduce", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "queueStateUpdate", "(Lho/l;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "noUpdate", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "getLogMessage", "(Ljava/lang/Object;)Ljava/lang/String;", "Lsn/z;", "onCleared", "()V", "Lwn/h;", "context", "Lkotlin/Function2;", "Lfr/d0;", "Lwn/c;", "", "block", "Lfr/k1;", "launch", "(Lwn/h;Lho/p;)Lfr/k1;", "Lio/elevenlabs/domain/DispatcherFactory;", "getDispatcherFactory", "()Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Logger;", "debugTag", "Ljava/lang/String;", "Lhr/n;", "events", "Lhr/n;", "Lir/j1;", "mutableStateFlow", "Lir/j1;", "Lir/z1;", "stateFlow", "Lir/z1;", "getStateFlow", "()Lir/z1;", "StateUpdate", "core_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class MviViewModel<State> extends j1 {
    private final String debugTag;
    private final DispatcherFactory dispatcherFactory;
    private final hr.n events;
    private final Logger logger;
    private final ir.j1 mutableStateFlow;
    private final z1 stateFlow;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "<init>", "()V", "core_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class StateUpdate {
        public static final StateUpdate INSTANCE = new StateUpdate();

        private StateUpdate() {
        }
    }

    public MviViewModel(State state, DispatcherFactory dispatcherFactory, Logger logger) {
        dispatcherFactory.getClass();
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
        String n2 = e0.f20562a.b(getClass()).n();
        n2.getClass();
        this.debugTag = n2;
        this.events = kd.a.b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
        b2 c5 = r.c(state);
        this.mutableStateFlow = c5;
        this.stateFlow = new l1(c5);
        if (logger != null) {
            logger.verbose(n2, new f(3));
        }
        launch$default(this, null, new AnonymousClass2(this, state, null), 1, null);
    }

    public static final String _init_$lambda$0() {
        return "MviViewModel init";
    }

    public static /* synthetic */ k1 launch$default(MviViewModel mviViewModel, wn.h hVar, ho.p pVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                hVar = mviViewModel.dispatcherFactory.getDefault();
            }
            return mviViewModel.launch(hVar, pVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: launch");
        return null;
    }

    public static final String queueStateUpdate$lambda$0() {
        return "Queue state update";
    }

    public final DispatcherFactory getDispatcherFactory() {
        return this.dispatcherFactory;
    }

    public String getLogMessage(State r32) {
        return "State: " + r32;
    }

    public final z1 getStateFlow() {
        return this.stateFlow;
    }

    public final k1 launch(wn.h context, ho.p block) {
        context.getClass();
        block.getClass();
        return g0.D(c1.h(this), context, null, block, 2);
    }

    public final StateUpdate noUpdate() {
        return StateUpdate.INSTANCE;
    }

    @Override // androidx.lifecycle.j1
    public void onCleared() {
        super.onCleared();
        this.events.cancel(null);
    }

    public final StateUpdate queueStateUpdate(ho.l reduce) {
        reduce.getClass();
        Logger logger = this.logger;
        if (logger != null) {
            logger.verbose(this.debugTag, new f(4));
        }
        launch$default(this, null, new MviViewModel$queueStateUpdate$2(this, reduce, null), 1, null);
        return StateUpdate.INSTANCE;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.MviViewModel$2", f = "MviViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.MviViewModel$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ State $initialState;
        int label;
        final /* synthetic */ MviViewModel<State> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MviViewModel<State> mviViewModel, State state, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = mviViewModel;
            this.$initialState = state;
        }

        public static final String invokeSuspend$lambda$0() {
            return "Loop launch";
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$initialState, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                Logger logger = ((MviViewModel) this.this$0).logger;
                if (logger != null) {
                    logger.verbose(((MviViewModel) this.this$0).debugTag, new f(0));
                }
                ir.i o6 = r.o(new d1(this.$initialState, r.n(((MviViewModel) this.this$0).events), new C00212(null), 0));
                MviViewModel<State> mviViewModel = this.this$0;
                if (((MviViewModel) mviViewModel).logger != null) {
                    o6 = new w(o6, new MviViewModel$2$3$1(mviViewModel, null), 5);
                }
                ir.j1 j1Var = ((MviViewModel) this.this$0).mutableStateFlow;
                this.label = 1;
                Object collect = o6.collect(j1Var, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.MviViewModel$2$2", f = "MviViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003H\n"}, d2 = {"State", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/core/Reducer;", "action", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.MviViewModel$2$2 */
        /* loaded from: classes3.dex */
        public static final class C00212 extends yn.i implements q {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public C00212(wn.c<? super C00212> cVar) {
                super(3, cVar);
            }

            public final Object invoke(State state, ho.l lVar, wn.c<? super State> cVar) {
                C00212 c00212 = new C00212(cVar);
                c00212.L$0 = state;
                c00212.L$1 = lVar;
                return c00212.invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                ho.l lVar = (ho.l) this.L$1;
                if (this.label == 0) {
                    sn.a.g(obj);
                    return lVar.invoke(obj2);
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }

            @Override // ho.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((C00212) obj, (ho.l) obj2, (wn.c<? super C00212>) obj3);
            }
        }
    }

    public /* synthetic */ MviViewModel(Object obj, DispatcherFactory dispatcherFactory, Logger logger, int i10, kotlin.jvm.internal.f fVar) {
        this(obj, dispatcherFactory, (i10 & 4) != 0 ? null : logger);
    }
}
