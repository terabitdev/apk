package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel;
import ir.i;
import ir.i1;
import ir.j;
import ir.k1;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00178F¢\u0006\u0006\u001a\u0004\b \u0010\u001b¨\u0006\""}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$DomainState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "playerVisibilityService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/services/PlayerVisibilityService;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState;", "toUiState", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$DomainState;)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "event", "Lsn/z;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;)V", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "Lir/i;", "uiStateFlow", "Lir/i;", "getUiStateFlow", "()Lir/i;", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$ControlEvent;", "mutableControlEventsFlow", "Lir/i1;", "getControlEventsFlow", "controlEventsFlow", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MiniPlayerViewModel extends MviViewModel<MiniPlayerContract.DomainState> {
    public static final int $stable = 8;
    private final i1 mutableControlEventsFlow;
    private final PlayerService playerService;
    private final PlayerVisibilityService playerVisibilityService;
    private final i uiStateFlow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MiniPlayerViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService, PlayerService playerService, PlayerVisibilityService playerVisibilityService) {
        super(new MiniPlayerContract.DomainState(null, null, false, false, 15, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        readsService.getClass();
        playerService.getClass();
        playerVisibilityService.getClass();
        Logger logger = null;
        this.playerService = playerService;
        this.playerVisibilityService = playerVisibilityService;
        final z1 stateFlow = getStateFlow();
        this.uiStateFlow = new i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;
                final /* synthetic */ MiniPlayerViewModel this$0;

                @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$special$$inlined$map$1$2", f = "MiniPlayerViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, MiniPlayerViewModel miniPlayerViewModel) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = miniPlayerViewModel;
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
                    MiniPlayerContract.UiState uiState;
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
                                uiState = this.this$0.toUiState((MiniPlayerContract.DomainState) obj);
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
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
        this.mutableControlEventsFlow = r.a(0, 1, hr.a.f12537b);
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(readsService, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiniPlayerContract.DomainState onEvent$lambda$0(MiniPlayerContract.DomainState domainState) {
        domainState.getClass();
        return MiniPlayerContract.DomainState.copy$default(domainState, null, null, false, false, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiniPlayerContract.DomainState onEvent$lambda$1(MiniPlayerContract.DomainState domainState) {
        domainState.getClass();
        return MiniPlayerContract.DomainState.copy$default(domainState, null, null, false, true, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MiniPlayerContract.UiState toUiState(MiniPlayerContract.DomainState domainState) {
        MiniPlayerContract.PlayButtonState active;
        if (domainState.getItem() == null) {
            return MiniPlayerContract.UiState.Hidden.INSTANCE;
        }
        String title = domainState.getItem().getTitle();
        String author = domainState.getItem().getAuthor();
        if (author == null) {
            author = "ElevenLabs";
        }
        String coverImageUrl = ReadMetaKt.coverImageUrl(domainState.getItem(), CoverImageSize.Medium);
        ReadSource source = domainState.getItem().getSource();
        String originalFileType = domainState.getItem().getOriginalFileType();
        if (domainState.isPlayingWhenReady() && (domainState.getPlayerConnectionState() == PlayerConnectionState.BUFFERING || domainState.getPlayerConnectionState() == PlayerConnectionState.UNKNOWN)) {
            active = MiniPlayerContract.PlayButtonState.Loading.INSTANCE;
        } else if (domainState.isPlayingWhenReady() && domainState.getPlayerConnectionState() == PlayerConnectionState.READY) {
            active = new MiniPlayerContract.PlayButtonState.Active(true);
        } else {
            active = new MiniPlayerContract.PlayButtonState.Active(false);
        }
        return new MiniPlayerContract.UiState.Shown(title, author, coverImageUrl, source, originalFileType, active);
    }

    public final i getControlEventsFlow() {
        return new k1(this.mutableControlEventsFlow);
    }

    public final i getUiStateFlow() {
        return this.uiStateFlow;
    }

    public final void onEvent(MiniPlayerContract.Event event) {
        String readId;
        event.getClass();
        if (event instanceof MiniPlayerContract.Event.ClickPlayPause) {
            MviViewModel.launch$default(this, null, new MiniPlayerViewModel$onEvent$1(this, null), 1, null);
            return;
        }
        if (event instanceof MiniPlayerContract.Event.ClickContainer) {
            ReadMeta item = ((MiniPlayerContract.DomainState) getStateFlow().getValue()).getItem();
            if (item != null && (readId = item.getReadId()) != null) {
                this.mutableControlEventsFlow.tryEmit(new MiniPlayerContract.ControlEvent.NavigateToPlayer(readId));
                return;
            }
            return;
        }
        if (event instanceof MiniPlayerContract.Event.ClickSeekBackward) {
            MviViewModel.launch$default(this, null, new MiniPlayerViewModel$onEvent$2(this, null), 1, null);
            return;
        }
        if (event instanceof MiniPlayerContract.Event.LifecyclePause) {
            queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(18));
        } else if (event instanceof MiniPlayerContract.Event.LifecycleResume) {
            this.playerVisibilityService.onMiniPlayerCreated();
            queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(19));
        } else {
            c6.p();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$2", f = "MiniPlayerViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements p {
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
                i isPlayingWhenReady = MiniPlayerViewModel.this.playerService.isPlayingWhenReady();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MiniPlayerViewModel.this);
                this.label = 1;
                Object collect = isPlayingWhenReady.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements j {
            final /* synthetic */ MiniPlayerViewModel this$0;

            public AnonymousClass1(MiniPlayerViewModel miniPlayerViewModel) {
                this.this$0 = miniPlayerViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final MiniPlayerContract.DomainState emit$lambda$0(boolean z6, MiniPlayerContract.DomainState domainState) {
                domainState.getClass();
                return MiniPlayerContract.DomainState.copy$default(domainState, null, null, z6, false, 11, null);
            }

            public final Object emit(final boolean z6, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.f
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        MiniPlayerContract.DomainState emit$lambda$0;
                        emit$lambda$0 = MiniPlayerViewModel.AnonymousClass2.AnonymousClass1.emit$lambda$0(z6, (MiniPlayerContract.DomainState) obj);
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

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$1", f = "MiniPlayerViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
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
                final z1 stateFlow = MiniPlayerViewModel.this.getStateFlow();
                jr.j G = r.G(r.o(new i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$1$invokeSuspend$$inlined$map$1$2", f = "MiniPlayerViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        Boolean valueOf = Boolean.valueOf(((MiniPlayerContract.DomainState) obj).isAppInForeground());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(valueOf, anonymousClass1);
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
                        Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                }), new MiniPlayerViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, MiniPlayerViewModel.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(MiniPlayerViewModel.this);
                this.label = 1;
                Object collect = G.collect(anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements j {
            final /* synthetic */ MiniPlayerViewModel this$0;

            public AnonymousClass3(MiniPlayerViewModel miniPlayerViewModel) {
                this.this$0 = miniPlayerViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final MiniPlayerContract.DomainState emit$lambda$0(PlayerConnectionState playerConnectionState, MiniPlayerContract.DomainState domainState) {
                domainState.getClass();
                return MiniPlayerContract.DomainState.copy$default(domainState, null, playerConnectionState, false, false, 13, null);
            }

            public final Object emit(PlayerConnectionState playerConnectionState, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new e(playerConnectionState, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((PlayerConnectionState) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$3", f = "MiniPlayerViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements p {
        final /* synthetic */ ReadsService $readsService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ReadsService readsService, wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$readsService = readsService;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(this.$readsService, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                final z1 observeQueueState = MiniPlayerViewModel.this.playerService.observeQueueState();
                jr.j G = r.G(r.o(new i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$3$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$3$invokeSuspend$$inlined$mapNotNull$1$2", f = "MiniPlayerViewModel.kt", l = {52}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
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

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            MediaItemState mediaItemState;
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
                                        MediaQueueState mediaQueueState = (MediaQueueState) obj;
                                        if (mediaQueueState != null) {
                                            mediaItemState = mediaQueueState.getCurrentItem();
                                        } else {
                                            mediaItemState = null;
                                        }
                                        if (mediaItemState != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(mediaItemState, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
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
                        Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                }), new MiniPlayerViewModel$3$invokeSuspend$$inlined$flatMapLatest$1(null, this.$readsService));
                C00433 c00433 = new C00433(MiniPlayerViewModel.this);
                this.label = 1;
                Object collect = G.collect(c00433, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00433<T> implements j {
            final /* synthetic */ MiniPlayerViewModel this$0;

            public C00433(MiniPlayerViewModel miniPlayerViewModel) {
                this.this$0 = miniPlayerViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final MiniPlayerContract.DomainState emit$lambda$0(ReadMeta readMeta, MiniPlayerContract.DomainState domainState) {
                domainState.getClass();
                return MiniPlayerContract.DomainState.copy$default(domainState, readMeta, null, false, false, 14, null);
            }

            public final Object emit(ReadMeta readMeta, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new e(readMeta, 1));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((ReadMeta) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
