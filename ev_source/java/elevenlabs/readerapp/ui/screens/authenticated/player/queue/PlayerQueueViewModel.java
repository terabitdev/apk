package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import ig.f;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel;
import ir.a1;
import ir.j;
import ir.z1;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0015J\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/model/MediaItemState;", "fallbackActiveItem", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/model/MediaItemState;Lio/elevenlabs/domain/Analytics;)V", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState$Data;", "Lsn/z;", "block", "withLoadedState", "(Lho/l;)V", "item", "onItemClick", "(Lio/elevenlabs/domain/model/MediaItemState;)V", "draggedItem", "", FirebaseAnalytics.Param.ITEMS, "onItemsUpdate", "(Lio/elevenlabs/domain/model/MediaItemState;Ljava/util/List;)V", "onItemRemove", "onScreenClosed", "()V", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/model/MediaItemState;", "Lio/elevenlabs/domain/Analytics;", "Lir/i;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;", "getUiState", "()Lir/i;", "uiState", "Factory", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerQueueViewModel extends MviViewModel<PlayerQueueContract.DomainState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final MediaItemState fallbackActiveItem;
    private final PlayerService playerService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$1", f = "PlayerQueueViewModel.kt", l = {40, 41}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$1, reason: invalid class name */
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

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (ir.r.k((ir.i) r5, r4) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
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
                        return z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                PlayerService playerService = PlayerQueueViewModel.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueViewModel$Factory;", "", "create", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueViewModel;", "fallbackActiveItem", "Lio/elevenlabs/domain/model/MediaItemState;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        PlayerQueueViewModel create(MediaItemState fallbackActiveItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerQueueViewModel(DispatcherFactory dispatcherFactory, PlayerService playerService, MediaItemState mediaItemState, Analytics analytics) {
        super(PlayerQueueContract.DomainState.Initial.INSTANCE, dispatcherFactory, null, 4, null);
        dispatcherFactory.getClass();
        playerService.getClass();
        analytics.getClass();
        this.playerService = playerService;
        this.fallbackActiveItem = mediaItemState;
        this.analytics = analytics;
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
    }

    private final void withLoadedState(l block) {
        PlayerQueueContract.DomainState domainState = (PlayerQueueContract.DomainState) getStateFlow().getValue();
        if (domainState instanceof PlayerQueueContract.DomainState.Data) {
            block.invoke(domainState);
        }
    }

    public final ir.i getUiState() {
        final z1 stateFlow = getStateFlow();
        return new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$special$$inlined$map$1$2", f = "PlayerQueueViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                PlayerQueueContract.UiState uiState = PlayerQueueUiMapperKt.toUiState((PlayerQueueContract.DomainState) obj);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(uiState, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    public final void onItemClick(MediaItemState item) {
        item.getClass();
        MviViewModel.launch$default(this, null, new PlayerQueueViewModel$onItemClick$1(this, item, null), 1, null);
    }

    public final void onItemRemove(MediaItemState item) {
        item.getClass();
        MviViewModel.launch$default(this, null, new PlayerQueueViewModel$onItemRemove$1(this, item, null), 1, null);
    }

    public final void onItemsUpdate(MediaItemState draggedItem, List<MediaItemState> items) {
        draggedItem.getClass();
        items.getClass();
        MviViewModel.launch$default(this, null, new PlayerQueueViewModel$onItemsUpdate$1(this, draggedItem, items, null), 1, null);
    }

    public final void onScreenClosed() {
        String str;
        boolean z6;
        PlayerQueueContract.DomainState domainState = (PlayerQueueContract.DomainState) getStateFlow().getValue();
        if (domainState instanceof PlayerQueueContract.DomainState.Data) {
            PlayerQueueContract.DomainState.Data data = (PlayerQueueContract.DomainState.Data) domainState;
            Analytics analytics = this.analytics;
            MediaItemState fallbackActiveItem = data.getFallbackActiveItem();
            if (fallbackActiveItem == null || (str = fallbackActiveItem.getReadId()) == null) {
                str = "unknown";
            }
            int size = data.getQueue().getItems().size();
            if (data.getQueue().getCurrentIndex() >= f.y(data.getQueue().getItems())) {
                z6 = true;
            } else {
                z6 = false;
            }
            analytics.log(new Analytics.Event.PlayerQueueScreenHidden(str, size, z6, data.getQueue().getCurrentIndex()));
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$2", f = "PlayerQueueViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends i implements p {
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
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
                a1 a1Var = new a1(PlayerQueueViewModel.this.playerService.observeQueueState(), 0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PlayerQueueViewModel.this);
                this.label = 1;
                Object collect = a1Var.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements j {
            final /* synthetic */ PlayerQueueViewModel this$0;

            public AnonymousClass1(PlayerQueueViewModel playerQueueViewModel) {
                this.this$0 = playerQueueViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PlayerQueueContract.DomainState emit$lambda$0(MediaQueueState mediaQueueState, PlayerQueueViewModel playerQueueViewModel, PlayerQueueContract.DomainState domainState) {
                domainState.getClass();
                return new PlayerQueueContract.DomainState.Data(mediaQueueState, playerQueueViewModel.fallbackActiveItem);
            }

            public final Object emit(final MediaQueueState mediaQueueState, wn.c<? super z> cVar) {
                String str;
                boolean z6;
                if (this.this$0.getStateFlow().getValue() instanceof PlayerQueueContract.DomainState.Initial) {
                    Analytics analytics = this.this$0.analytics;
                    MediaItemState currentItem = mediaQueueState.getCurrentItem();
                    if (currentItem == null || (str = currentItem.getReadId()) == null) {
                        MediaItemState mediaItemState = this.this$0.fallbackActiveItem;
                        if (mediaItemState != null) {
                            str = mediaItemState.getReadId();
                        } else {
                            str = "unknown";
                        }
                    }
                    int size = mediaQueueState.getItems().size();
                    if (mediaQueueState.getCurrentIndex() >= f.y(mediaQueueState.getItems())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    analytics.log(new Analytics.Event.PlayerQueueScreenShown(str, mediaQueueState.getCurrentIndex(), size, z6));
                }
                final PlayerQueueViewModel playerQueueViewModel = this.this$0;
                playerQueueViewModel.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.e
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        PlayerQueueContract.DomainState emit$lambda$0;
                        emit$lambda$0 = PlayerQueueViewModel.AnonymousClass2.AnonymousClass1.emit$lambda$0(MediaQueueState.this, playerQueueViewModel, (PlayerQueueContract.DomainState) obj);
                        return emit$lambda$0;
                    }
                });
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((MediaQueueState) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
