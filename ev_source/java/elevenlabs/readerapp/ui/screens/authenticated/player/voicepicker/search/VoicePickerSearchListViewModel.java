package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import com.google.protobuf.c6;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CommunityVoicesPage;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.highlighter.t;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.g;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.i;
import ir.j;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import wq.n;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010\u001c\u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u00104\u001a\b\u0012\u0004\u0012\u000201008F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130+8F¢\u0006\u0006\u001a\u0004\b5\u0010.¨\u00068"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListStateMapper;", "mapper", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "sharedRepository", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "communityVoicesService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListStateMapper;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;Lio/elevenlabs/domain/services/CommunityVoicesService;Lio/elevenlabs/domain/Logger;)V", "", "page", "", "searchQuery", "", "reset", "Lsn/z;", "loadVoices", "(ILjava/lang/String;ZLwn/c;)Ljava/lang/Object;", "actualiseVoices", "()V", "handleSearchQueryChanges", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "event", "onSharedEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "Lhr/q;", "onNavigationEvent-JP2dKIU", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;)Ljava/lang/Object;", "onNavigationEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListStateMapper;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "Lio/elevenlabs/domain/Logger;", "Lir/i;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", "getUiStateFlow", "()Lir/i;", "uiStateFlow", "Lir/z1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "getSharedStateFlow", "()Lir/z1;", "sharedStateFlow", "getScrollUpFlow", "scrollUpFlow", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSearchListViewModel extends MviViewModel<VoicePickerSearchListContract.State> {
    private static final String TAG = "VoicePickerSearchVM";
    private final CommunityVoicesService communityVoicesService;
    private final Logger logger;
    private final VoicePickerSearchListStateMapper mapper;
    private final VoicePickerSharedRepository sharedRepository;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoicePickerSearchListViewModel(DispatcherFactory dispatcherFactory, VoicePickerSearchListStateMapper voicePickerSearchListStateMapper, VoicePickerSharedRepository voicePickerSharedRepository, CommunityVoicesService communityVoicesService, Logger logger) {
        super(new VoicePickerSearchListContract.State(null, null, null, null, false, 31, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        voicePickerSearchListStateMapper.getClass();
        voicePickerSharedRepository.getClass();
        communityVoicesService.getClass();
        logger.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.mapper = voicePickerSearchListStateMapper;
        this.sharedRepository = voicePickerSharedRepository;
        this.communityVoicesService = communityVoicesService;
        this.logger = logger;
        actualiseVoices();
        handleSearchQueryChanges();
    }

    private final void actualiseVoices() {
        MviViewModel.launch$default(this, null, new VoicePickerSearchListViewModel$actualiseVoices$1(this, null), 1, null);
    }

    private final void handleSearchQueryChanges() {
        MviViewModel.launch$default(this, null, new VoicePickerSearchListViewModel$handleSearchQueryChanges$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadVoices(int i10, String str, boolean z6, wn.c<? super z> cVar) {
        VoicePickerSearchListViewModel$loadVoices$1 voicePickerSearchListViewModel$loadVoices$1;
        int i11;
        int i12;
        AsyncCallResult asyncCallResult;
        boolean z10 = z6;
        if (cVar instanceof VoicePickerSearchListViewModel$loadVoices$1) {
            voicePickerSearchListViewModel$loadVoices$1 = (VoicePickerSearchListViewModel$loadVoices$1) cVar;
            int i13 = voicePickerSearchListViewModel$loadVoices$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                voicePickerSearchListViewModel$loadVoices$1.label = i13 - Integer.MIN_VALUE;
                VoicePickerSearchListViewModel$loadVoices$1 voicePickerSearchListViewModel$loadVoices$12 = voicePickerSearchListViewModel$loadVoices$1;
                Object obj = voicePickerSearchListViewModel$loadVoices$12.result;
                i11 = voicePickerSearchListViewModel$loadVoices$12.label;
                z zVar = z.f31622a;
                if (i11 == 0) {
                    if (i11 == 1) {
                        z10 = voicePickerSearchListViewModel$loadVoices$12.Z$0;
                        i12 = voicePickerSearchListViewModel$loadVoices$12.I$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    if (!z10 && (!((VoicePickerSearchListContract.State) getStateFlow().getValue()).getCommunityVoices().getHasMore() || ((VoicePickerSearchListContract.State) getStateFlow().getValue()).isLoading())) {
                        return zVar;
                    }
                    if (str != null && !n.m0(str)) {
                        queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(27));
                        CommunityVoicesService communityVoicesService = this.communityVoicesService;
                        voicePickerSearchListViewModel$loadVoices$12.L$0 = null;
                        voicePickerSearchListViewModel$loadVoices$12.I$0 = i10;
                        voicePickerSearchListViewModel$loadVoices$12.Z$0 = z10;
                        voicePickerSearchListViewModel$loadVoices$12.label = 1;
                        obj = CommunityVoicesService.getCommunityVoices$default(communityVoicesService, i10, 0, null, null, null, null, null, null, null, str, voicePickerSearchListViewModel$loadVoices$12, 510, null);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                        i12 = i10;
                    } else {
                        queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(26));
                        return zVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                    Logger.logWarning$default(this.logger, TAG, "Error loading community voices: " + asyncCallResult, null, 4, null);
                    queueStateUpdate(new t(i12, 13));
                    return zVar;
                }
                if (asyncCallResult instanceof AsyncCallResult.Success) {
                    queueStateUpdate(new g(z10, (AsyncCallResult.Success) asyncCallResult, i12, 1));
                    return zVar;
                }
                c6.p();
                return null;
            }
        }
        voicePickerSearchListViewModel$loadVoices$1 = new VoicePickerSearchListViewModel$loadVoices$1(this, cVar);
        VoicePickerSearchListViewModel$loadVoices$1 voicePickerSearchListViewModel$loadVoices$122 = voicePickerSearchListViewModel$loadVoices$1;
        Object obj2 = voicePickerSearchListViewModel$loadVoices$122.result;
        i11 = voicePickerSearchListViewModel$loadVoices$122.label;
        z zVar2 = z.f31622a;
        if (i11 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSearchListContract.State loadVoices$lambda$0(VoicePickerSearchListContract.State state) {
        state.getClass();
        return VoicePickerSearchListContract.State.copy$default(state, null, null, state.getCommunityVoices().copy(tn.t.f33547a, 0, false), null, false, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSearchListContract.State loadVoices$lambda$1(VoicePickerSearchListContract.State state) {
        state.getClass();
        return VoicePickerSearchListContract.State.copy$default(state, null, null, null, null, true, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSearchListContract.State loadVoices$lambda$2(int i10, VoicePickerSearchListContract.State state) {
        state.getClass();
        return VoicePickerSearchListContract.State.copy$default(state, null, null, VoicePickerSearchListContract.CommunityVoicesState.copy$default(state.getCommunityVoices(), null, i10, false, 1, null), null, false, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSearchListContract.State loadVoices$lambda$3(boolean z6, AsyncCallResult asyncCallResult, int i10, VoicePickerSearchListContract.State state) {
        List<Voice> list;
        state.getClass();
        VoicePickerSearchListContract.CommunityVoicesState communityVoices = state.getCommunityVoices();
        if (z6) {
            list = ((CommunityVoicesPage) ((AsyncCallResult.Success) asyncCallResult).getData()).getVoices();
        } else {
            ArrayList O0 = o.O0(((CommunityVoicesPage) ((AsyncCallResult.Success) asyncCallResult).getData()).getVoices(), state.getCommunityVoices().getItems());
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = O0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((Voice) next).getVoiceId())) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        return VoicePickerSearchListContract.State.copy$default(state, null, null, communityVoices.copy(list, i10, ((CommunityVoicesPage) ((AsyncCallResult.Success) asyncCallResult).getData()).getHasMore()), null, false, 11, null);
    }

    public final i getScrollUpFlow() {
        final i uiStateFlow = getUiStateFlow();
        return r.o(new i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$2

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$2$2", f = "VoicePickerSearchListViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
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
                                Boolean valueOf = Boolean.valueOf(!(((VoicePickerSearchListContract.UiState) obj) instanceof VoicePickerSearchListContract.UiState.Data));
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
        });
    }

    public final z1 getSharedStateFlow() {
        return this.sharedRepository.getStateFlow();
    }

    public final i getUiStateFlow() {
        final z1 stateFlow = getStateFlow();
        final VoicePickerSearchListStateMapper voicePickerSearchListStateMapper = this.mapper;
        return r.o(new i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;
                final /* synthetic */ VoicePickerSearchListStateMapper receiver$inlined;

                @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$1$2", f = "VoicePickerSearchListViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(j jVar, VoicePickerSearchListStateMapper voicePickerSearchListStateMapper) {
                    this.$this_unsafeFlow = jVar;
                    this.receiver$inlined = voicePickerSearchListStateMapper;
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
                                VoicePickerSearchListContract.UiState mapState = this.receiver$inlined.mapState((VoicePickerSearchListContract.State) obj);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(mapState, anonymousClass1);
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
                Object collect = i.this.collect(new AnonymousClass2(jVar, voicePickerSearchListStateMapper), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        });
    }

    public final void onEvent(VoicePickerSearchListContract.Event event) {
        event.getClass();
        if (event instanceof VoicePickerSearchListContract.Event.LoadMore) {
            MviViewModel.launch$default(this, null, new VoicePickerSearchListViewModel$onEvent$1(this, null), 1, null);
        } else {
            c6.p();
        }
    }

    /* renamed from: onNavigationEvent-JP2dKIU, reason: not valid java name */
    public final Object m1611onNavigationEventJP2dKIU(VoicePickerSharedContract.NavigationEvent event) {
        event.getClass();
        return this.sharedRepository.m1621onNavigationEventJP2dKIU(event);
    }

    public final void onSharedEvent(VoicePickerSharedContract.Event event) {
        event.getClass();
        this.sharedRepository.onEvent(event);
    }
}
