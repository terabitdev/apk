package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import a2.t3;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CommunityVoicesPage;
import io.elevenlabs.domain.model.Filter;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.FiltersState;
import ir.j;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110#8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "sharedRepository", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "communityVoicesService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;Lio/elevenlabs/domain/services/CommunityVoicesService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Logger;)V", "", "page", "", "reset", "Lsn/z;", "loadVoices", "(IZLwn/c;)Ljava/lang/Object;", "actualiseVoices", "()V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "event", "onSharedEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Logger;", "Lir/i;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", "getUiStateFlow", "()Lir/i;", "uiStateFlow", "getScrollUpFlow", "scrollUpFlow", "Lir/z1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "getSharedStateFlow", "()Lir/z1;", "sharedStateFlow", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerFilteredListViewModel extends MviViewModel<VoicePickerFilteredListContract.State> {
    private static final String TAG = "VoicePickerFilteredListVM";
    private final CommunityVoicesService communityVoicesService;
    private final Logger logger;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final VoicePickerSharedRepository sharedRepository;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoicePickerFilteredListViewModel(DispatcherFactory dispatcherFactory, VoicePickerSharedRepository voicePickerSharedRepository, CommunityVoicesService communityVoicesService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        super(new VoicePickerFilteredListContract.State(null, 0, false, null, false, 31, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        voicePickerSharedRepository.getClass();
        communityVoicesService.getClass();
        resolveErrorMessageUseCase.getClass();
        logger.getClass();
        Logger logger2 = null;
        this.sharedRepository = voicePickerSharedRepository;
        this.communityVoicesService = communityVoicesService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.logger = logger;
        actualiseVoices();
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
    }

    private final void actualiseVoices() {
        MviViewModel.launch$default(this, null, new VoicePickerFilteredListViewModel$actualiseVoices$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadVoices(int i10, boolean z6, wn.c<? super z> cVar) {
        VoicePickerFilteredListViewModel$loadVoices$1 voicePickerFilteredListViewModel$loadVoices$1;
        int i11;
        xn.a aVar;
        int i12;
        Filter activeSort;
        String str;
        Filter activeAccent;
        String str2;
        Filter activeGender;
        String str3;
        Filter activeAge;
        String str4;
        Set<Filter> activeUseCases;
        LinkedHashSet linkedHashSet;
        Filter activeLanguage;
        String str5;
        Object communityVoices$default;
        int i13;
        AsyncCallResult asyncCallResult;
        boolean z10 = z6;
        if (cVar instanceof VoicePickerFilteredListViewModel$loadVoices$1) {
            voicePickerFilteredListViewModel$loadVoices$1 = (VoicePickerFilteredListViewModel$loadVoices$1) cVar;
            int i14 = voicePickerFilteredListViewModel$loadVoices$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                voicePickerFilteredListViewModel$loadVoices$1.label = i14 - Integer.MIN_VALUE;
                VoicePickerFilteredListViewModel$loadVoices$1 voicePickerFilteredListViewModel$loadVoices$12 = voicePickerFilteredListViewModel$loadVoices$1;
                Object obj = voicePickerFilteredListViewModel$loadVoices$12.result;
                i11 = voicePickerFilteredListViewModel$loadVoices$12.label;
                z zVar = z.f31622a;
                aVar = xn.a.f37986a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            z10 = voicePickerFilteredListViewModel$loadVoices$12.Z$0;
                            i13 = voicePickerFilteredListViewModel$loadVoices$12.I$0;
                            sn.a.g(obj);
                            asyncCallResult = (AsyncCallResult) obj;
                            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                                Logger.logWarning$default(this.logger, TAG, "Error loading community voices: " + asyncCallResult, null, 4, null);
                                queueStateUpdate(new t3(this, (AsyncCallResult.Error) asyncCallResult, i13, 2));
                                return zVar;
                            }
                            if (asyncCallResult instanceof AsyncCallResult.Success) {
                                queueStateUpdate(new g(z10, (AsyncCallResult.Success) asyncCallResult, i13, 0));
                                return zVar;
                            }
                            c6.p();
                            return null;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z10 = voicePickerFilteredListViewModel$loadVoices$12.Z$0;
                    int i15 = voicePickerFilteredListViewModel$loadVoices$12.I$0;
                    sn.a.g(obj);
                    i12 = i15;
                } else {
                    sn.a.g(obj);
                    VoicePickerFilteredListContract.State state = (VoicePickerFilteredListContract.State) getStateFlow().getValue();
                    if (!z10 && (!state.getHasMore() || state.isLoading())) {
                        return zVar;
                    }
                    queueStateUpdate(new h(10));
                    final z1 sharedStateFlow = getSharedStateFlow();
                    ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$loadVoices$$inlined$mapNotNull$1

                        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$loadVoices$$inlined$mapNotNull$1$2, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass2<T> implements j {
                            final /* synthetic */ j $this_unsafeFlow;

                            @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$loadVoices$$inlined$mapNotNull$1$2", f = "VoicePickerFilteredListViewModel.kt", l = {53}, m = "emit", v = 2)
                            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$loadVoices$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                            FiltersState filters = ((VoicePickerSharedContract.State) obj).getFilters();
                                            if (!filters.isActive()) {
                                                filters = null;
                                            }
                                            if (filters != null) {
                                                anonymousClass1.L$0 = null;
                                                anonymousClass1.L$1 = null;
                                                anonymousClass1.L$2 = null;
                                                anonymousClass1.L$3 = null;
                                                anonymousClass1.L$4 = null;
                                                anonymousClass1.I$0 = 0;
                                                anonymousClass1.label = 1;
                                                Object emit = jVar.emit(filters, anonymousClass1);
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
                        public Object collect(j jVar, wn.c cVar2) {
                            Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                            if (collect == xn.a.f37986a) {
                                return collect;
                            }
                            return z.f31622a;
                        }
                    };
                    voicePickerFilteredListViewModel$loadVoices$12.L$0 = null;
                    voicePickerFilteredListViewModel$loadVoices$12.I$0 = i10;
                    voicePickerFilteredListViewModel$loadVoices$12.Z$0 = z10;
                    voicePickerFilteredListViewModel$loadVoices$12.label = 1;
                    Object u6 = r.u(iVar, voicePickerFilteredListViewModel$loadVoices$12);
                    if (u6 == aVar) {
                        return aVar;
                    }
                    i12 = i10;
                    obj = u6;
                }
                FiltersState filtersState = (FiltersState) obj;
                CommunityVoicesService communityVoicesService = this.communityVoicesService;
                activeSort = filtersState.getActiveSort();
                if (activeSort == null) {
                    str = activeSort.getKey();
                } else {
                    str = null;
                }
                activeAccent = filtersState.getActiveAccent();
                if (activeAccent == null) {
                    str2 = activeAccent.getKey();
                } else {
                    str2 = null;
                }
                activeGender = filtersState.getActiveGender();
                if (activeGender == null) {
                    str3 = activeGender.getKey();
                } else {
                    str3 = null;
                }
                activeAge = filtersState.getActiveAge();
                if (activeAge == null) {
                    str4 = activeAge.getKey();
                } else {
                    str4 = null;
                }
                activeUseCases = filtersState.getActiveUseCases();
                if (activeUseCases == null) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator<T> it = activeUseCases.iterator();
                    while (it.hasNext()) {
                        linkedHashSet2.add(((Filter) it.next()).getKey());
                    }
                    linkedHashSet = linkedHashSet2;
                } else {
                    linkedHashSet = null;
                }
                activeLanguage = filtersState.getActiveLanguage();
                if (activeLanguage == null) {
                    str5 = activeLanguage.getKey();
                } else {
                    str5 = null;
                }
                voicePickerFilteredListViewModel$loadVoices$12.L$0 = null;
                voicePickerFilteredListViewModel$loadVoices$12.L$1 = null;
                voicePickerFilteredListViewModel$loadVoices$12.I$0 = i12;
                voicePickerFilteredListViewModel$loadVoices$12.Z$0 = z10;
                voicePickerFilteredListViewModel$loadVoices$12.label = 2;
                communityVoices$default = CommunityVoicesService.getCommunityVoices$default(communityVoicesService, i12, 0, str, str2, null, str3, str4, linkedHashSet, str5, null, voicePickerFilteredListViewModel$loadVoices$12, 530, null);
                if (communityVoices$default != aVar) {
                    return aVar;
                }
                obj = communityVoices$default;
                i13 = i12;
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                }
            }
        }
        voicePickerFilteredListViewModel$loadVoices$1 = new VoicePickerFilteredListViewModel$loadVoices$1(this, cVar);
        VoicePickerFilteredListViewModel$loadVoices$1 voicePickerFilteredListViewModel$loadVoices$122 = voicePickerFilteredListViewModel$loadVoices$1;
        Object obj2 = voicePickerFilteredListViewModel$loadVoices$122.result;
        i11 = voicePickerFilteredListViewModel$loadVoices$122.label;
        z zVar2 = z.f31622a;
        aVar = xn.a.f37986a;
        if (i11 == 0) {
        }
        FiltersState filtersState2 = (FiltersState) obj2;
        CommunityVoicesService communityVoicesService2 = this.communityVoicesService;
        activeSort = filtersState2.getActiveSort();
        if (activeSort == null) {
        }
        activeAccent = filtersState2.getActiveAccent();
        if (activeAccent == null) {
        }
        activeGender = filtersState2.getActiveGender();
        if (activeGender == null) {
        }
        activeAge = filtersState2.getActiveAge();
        if (activeAge == null) {
        }
        activeUseCases = filtersState2.getActiveUseCases();
        if (activeUseCases == null) {
        }
        activeLanguage = filtersState2.getActiveLanguage();
        if (activeLanguage == null) {
        }
        voicePickerFilteredListViewModel$loadVoices$122.L$0 = null;
        voicePickerFilteredListViewModel$loadVoices$122.L$1 = null;
        voicePickerFilteredListViewModel$loadVoices$122.I$0 = i12;
        voicePickerFilteredListViewModel$loadVoices$122.Z$0 = z10;
        voicePickerFilteredListViewModel$loadVoices$122.label = 2;
        communityVoices$default = CommunityVoicesService.getCommunityVoices$default(communityVoicesService2, i12, 0, str, str2, null, str3, str4, linkedHashSet, str5, null, voicePickerFilteredListViewModel$loadVoices$122, 530, null);
        if (communityVoices$default != aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerFilteredListContract.State loadVoices$lambda$0(VoicePickerFilteredListContract.State state) {
        state.getClass();
        return VoicePickerFilteredListContract.State.copy$default(state, null, 0, true, null, false, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerFilteredListContract.State loadVoices$lambda$2(VoicePickerFilteredListViewModel voicePickerFilteredListViewModel, AsyncCallResult asyncCallResult, int i10, VoicePickerFilteredListContract.State state) {
        state.getClass();
        return VoicePickerFilteredListContract.State.copy$default(state, null, i10, false, ResolveErrorMessageUseCase.invoke$default(voicePickerFilteredListViewModel.resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerFilteredListContract.State loadVoices$lambda$3(boolean z6, AsyncCallResult asyncCallResult, int i10, VoicePickerFilteredListContract.State state) {
        List<Voice> list;
        state.getClass();
        if (z6) {
            list = ((CommunityVoicesPage) ((AsyncCallResult.Success) asyncCallResult).getData()).getVoices();
        } else {
            ArrayList O0 = o.O0(((CommunityVoicesPage) ((AsyncCallResult.Success) asyncCallResult).getData()).getVoices(), state.getItems());
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
        return state.copy(list, i10, false, null, ((CommunityVoicesPage) ((AsyncCallResult.Success) asyncCallResult).getData()).getHasMore());
    }

    public final ir.i getScrollUpFlow() {
        final ir.i uiStateFlow = getUiStateFlow();
        return r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$2

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$2$2", f = "VoicePickerFilteredListViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
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
                                Boolean valueOf = Boolean.valueOf(!(((VoicePickerFilteredListContract.UiState) obj) instanceof VoicePickerFilteredListContract.UiState.Data));
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
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
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

    public final ir.i getUiStateFlow() {
        final z1 stateFlow = getStateFlow();
        return new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$1$2", f = "VoicePickerFilteredListViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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
                                VoicePickerFilteredListContract.UiState uiState = VoicePickerFilteredListStateMapperKt.toUiState((VoicePickerFilteredListContract.State) obj);
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

    public final void onEvent(VoicePickerFilteredListContract.Event event) {
        event.getClass();
        if (event instanceof VoicePickerFilteredListContract.Event.ErrorRetry) {
            MviViewModel.launch$default(this, null, new VoicePickerFilteredListViewModel$onEvent$1(this, null), 1, null);
        } else if (event instanceof VoicePickerFilteredListContract.Event.LoadMore) {
            MviViewModel.launch$default(this, null, new VoicePickerFilteredListViewModel$onEvent$2(this, null), 1, null);
        } else {
            c6.p();
        }
    }

    public final void onSharedEvent(VoicePickerSharedContract.Event event) {
        event.getClass();
        this.sharedRepository.onEvent(event);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$1", f = "VoicePickerFilteredListViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$1, reason: invalid class name */
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
                final z1 sharedStateFlow = VoicePickerFilteredListViewModel.this.getSharedStateFlow();
                ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$1$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "VoicePickerFilteredListViewModel.kt", l = {54}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                        List<Object> activeFilters = ((VoicePickerSharedContract.State) obj).getFilters().getActiveFilters();
                                        if (activeFilters.isEmpty()) {
                                            activeFilters = null;
                                        }
                                        if (activeFilters != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(activeFilters, anonymousClass1);
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
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(VoicePickerFilteredListViewModel.this);
                this.label = 1;
                Object collect = o6.collect(anonymousClass2, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements j {
            final /* synthetic */ VoicePickerFilteredListViewModel this$0;

            public AnonymousClass2(VoicePickerFilteredListViewModel voicePickerFilteredListViewModel) {
                this.this$0 = voicePickerFilteredListViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final VoicePickerFilteredListContract.State emit$lambda$0(VoicePickerFilteredListContract.State state) {
                state.getClass();
                return VoicePickerFilteredListContract.State.copy$default(state, t.f33547a, 0, true, null, false, 26, null);
            }

            public final Object emit(List<? extends Object> list, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new h(0));
                Object loadVoices = this.this$0.loadVoices(0, true, cVar);
                if (loadVoices == xn.a.f37986a) {
                    return loadVoices;
                }
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((List<? extends Object>) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
