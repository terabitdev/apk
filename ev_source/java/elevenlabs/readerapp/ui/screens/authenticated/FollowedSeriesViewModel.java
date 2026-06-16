package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.protobuf.c6;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/FollowedSeriesViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/FollowedSeriesState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "collectionsService", "Lio/elevenlabs/domain/services/CollectionsService;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CollectionsService;)V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FollowedSeriesViewModel extends MviViewModel<FollowedSeriesState> {
    public static final int $stable = 8;
    private final CollectionsService collectionsService;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FollowedSeriesViewModel(DispatcherFactory dispatcherFactory, CollectionsService collectionsService) {
        super(new FollowedSeriesState(null, 1, 0 == true ? 1 : 0), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        collectionsService.getClass();
        Logger logger = null;
        this.collectionsService = collectionsService;
        fr.g0.D(androidx.lifecycle.c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel$1", f = "FollowedSeriesScreen.kt", l = {57, 57}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (((ir.i) r5).collect(r0, r4) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            if (r5 == r3) goto L15;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            xn.a aVar = xn.a.f37986a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                CollectionsService collectionsService = FollowedSeriesViewModel.this.collectionsService;
                this.label = 1;
                obj = collectionsService.getFollowedSeries(this);
            }
            C00281 c00281 = new C00281(FollowedSeriesViewModel.this);
            this.label = 2;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00281<T> implements ir.j {
            final /* synthetic */ FollowedSeriesViewModel this$0;

            public C00281(FollowedSeriesViewModel followedSeriesViewModel) {
                this.this$0 = followedSeriesViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FollowedSeriesState emit$lambda$0(List list, FollowedSeriesState followedSeriesState) {
                followedSeriesState.getClass();
                return followedSeriesState.copy(list);
            }

            public final Object emit(List<CollectionMeta> list, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new x(list, 1));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((List<CollectionMeta>) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }
}
