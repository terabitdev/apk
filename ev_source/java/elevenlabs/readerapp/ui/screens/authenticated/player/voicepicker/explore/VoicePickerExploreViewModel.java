package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import com.google.protobuf.c6;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ExploreVoicesService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.j1;
import ir.l1;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BBA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J7\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130*2\u0006\u0010&\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u00020.¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u0002080;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020?0;8F¢\u0006\u0006\u001a\u0004\b@\u0010=¨\u0006C"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreStateMapper;", "mapper", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "sharedRepository", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/domain/services/ExploreVoicesService;", "exploreVoicesService", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "communityVoicesService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreStateMapper;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/domain/services/ExploreVoicesService;Lio/elevenlabs/domain/services/CommunityVoicesService;)V", "Lsn/z;", "loadRecommendedVoices", "()V", "", "page", "loadCommunityVoices", "(I)V", "produceUiState", "actualiseVoices", "", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "sections", "", "", "Lio/elevenlabs/domain/model/Voice;", "voicesMap", "actualiseSections", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "event", "onSharedEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "Lhr/q;", "onNavigationEvent-JP2dKIU", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;)Ljava/lang/Object;", "onNavigationEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event;)V", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreStateMapper;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lio/elevenlabs/domain/services/ExploreVoicesService;", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "Lir/j1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;", "mutableUiStateFlow", "Lir/j1;", "Lir/z1;", "getUiStateFlow", "()Lir/z1;", "uiStateFlow", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "getSharedStateFlow", "sharedStateFlow", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreViewModel extends MviViewModel<VoicePickerExploreContract.State> {
    private static final String TAG = "VoicePickerExploreVM";
    private final CommunityVoicesService communityVoicesService;
    private final ConnectivityService connectivityService;
    private final ExploreVoicesService exploreVoicesService;
    private final Logger logger;
    private final VoicePickerExploreStateMapper mapper;
    private final j1 mutableUiStateFlow;
    private final VoicePickerSharedRepository sharedRepository;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoicePickerExploreViewModel(DispatcherFactory dispatcherFactory, Logger logger, VoicePickerExploreStateMapper voicePickerExploreStateMapper, VoicePickerSharedRepository voicePickerSharedRepository, ConnectivityService connectivityService, ExploreVoicesService exploreVoicesService, CommunityVoicesService communityVoicesService) {
        super(new VoicePickerExploreContract.State(null, null, null, 7, r5), dispatcherFactory, r3, 4, r5);
        dispatcherFactory.getClass();
        logger.getClass();
        voicePickerExploreStateMapper.getClass();
        voicePickerSharedRepository.getClass();
        connectivityService.getClass();
        exploreVoicesService.getClass();
        communityVoicesService.getClass();
        kotlin.jvm.internal.f fVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        this.logger = logger;
        this.mapper = voicePickerExploreStateMapper;
        this.sharedRepository = voicePickerSharedRepository;
        this.connectivityService = connectivityService;
        this.exploreVoicesService = exploreVoicesService;
        this.communityVoicesService = communityVoicesService;
        this.mutableUiStateFlow = r.c(VoicePickerExploreContract.UiState.Loading.INSTANCE);
        loadRecommendedVoices();
        actualiseVoices();
        produceUiState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ExploreVoiceSections.Section> actualiseSections(List<? extends ExploreVoiceSections.Section> sections, Map<String, Voice> voicesMap) {
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        for (Object obj : sections) {
            if (obj instanceof ExploreVoiceSections.Section.FeaturedVoices) {
                ExploreVoiceSections.Section.FeaturedVoices featuredVoices = (ExploreVoiceSections.Section.FeaturedVoices) obj;
                List<Voice> featuredVoices2 = featuredVoices.getFeaturedVoices();
                ArrayList arrayList2 = new ArrayList(p.a0(featuredVoices2, 10));
                for (Voice voice : featuredVoices2) {
                    Voice voice2 = voicesMap.get(voice.getVoiceId());
                    if (voice2 != null) {
                        voice = voice2;
                    }
                    arrayList2.add(voice);
                }
                List<Voice> voices = featuredVoices.getVoices();
                ArrayList arrayList3 = new ArrayList(p.a0(voices, 10));
                for (Voice voice3 : voices) {
                    Voice voice4 = voicesMap.get(voice3.getVoiceId());
                    if (voice4 != null) {
                        voice3 = voice4;
                    }
                    arrayList3.add(voice3);
                }
                obj = ExploreVoiceSections.Section.FeaturedVoices.copy$default(featuredVoices, null, arrayList2, arrayList3, 1, null);
            } else if (obj instanceof ExploreVoiceSections.Section.VoiceGrid) {
                ExploreVoiceSections.Section.VoiceGrid voiceGrid = (ExploreVoiceSections.Section.VoiceGrid) obj;
                List<Voice> voices2 = voiceGrid.getVoices();
                ArrayList arrayList4 = new ArrayList(p.a0(voices2, 10));
                for (Voice voice5 : voices2) {
                    Voice voice6 = voicesMap.get(voice5.getVoiceId());
                    if (voice6 != null) {
                        voice5 = voice6;
                    }
                    arrayList4.add(voice5);
                }
                obj = ExploreVoiceSections.Section.VoiceGrid.copy$default(voiceGrid, null, arrayList4, 1, null);
            } else if (obj instanceof ExploreVoiceSections.Section.VoiceList) {
                ExploreVoiceSections.Section.VoiceList voiceList = (ExploreVoiceSections.Section.VoiceList) obj;
                List<Voice> voices3 = voiceList.getVoices();
                ArrayList arrayList5 = new ArrayList(p.a0(voices3, 10));
                for (Voice voice7 : voices3) {
                    Voice voice8 = voicesMap.get(voice7.getVoiceId());
                    if (voice8 != null) {
                        voice7 = voice8;
                    }
                    arrayList5.add(voice7);
                }
                obj = ExploreVoiceSections.Section.VoiceList.copy$default(voiceList, null, arrayList5, 1, null);
            } else if (!(obj instanceof ExploreVoiceSections.Section.VoiceCollections) && !(obj instanceof ExploreVoiceSections.Section.VoiceDesign)) {
                c6.p();
                return null;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private final void actualiseVoices() {
        MviViewModel.launch$default(this, null, new VoicePickerExploreViewModel$actualiseVoices$1(this, null), 1, null);
    }

    private final void loadCommunityVoices(int page) {
        MviViewModel.launch$default(this, null, new VoicePickerExploreViewModel$loadCommunityVoices$1(this, page, null), 1, null);
    }

    private final void loadRecommendedVoices() {
        MviViewModel.launch$default(this, null, new VoicePickerExploreViewModel$loadRecommendedVoices$1(this, null), 1, null);
    }

    private final void produceUiState() {
        MviViewModel.launch$default(this, null, new VoicePickerExploreViewModel$produceUiState$1(this, null), 1, null);
    }

    public final z1 getSharedStateFlow() {
        return this.sharedRepository.getStateFlow();
    }

    public final z1 getUiStateFlow() {
        return new l1(this.mutableUiStateFlow);
    }

    public final void onEvent(VoicePickerExploreContract.Event event) {
        event.getClass();
        if (event instanceof VoicePickerExploreContract.Event.LoadMore) {
            loadCommunityVoices(((VoicePickerExploreContract.State) getStateFlow().getValue()).getCommunityVoices().getPage() + 1);
        } else if (event instanceof VoicePickerExploreContract.Event.ErrorRetry) {
            loadCommunityVoices(0);
            loadRecommendedVoices();
        } else {
            c6.p();
        }
    }

    /* renamed from: onNavigationEvent-JP2dKIU, reason: not valid java name */
    public final Object m1566onNavigationEventJP2dKIU(VoicePickerSharedContract.NavigationEvent event) {
        event.getClass();
        return this.sharedRepository.m1621onNavigationEventJP2dKIU(event);
    }

    public final void onSharedEvent(VoicePickerSharedContract.Event event) {
        event.getClass();
        this.sharedRepository.onEvent(event);
    }
}
