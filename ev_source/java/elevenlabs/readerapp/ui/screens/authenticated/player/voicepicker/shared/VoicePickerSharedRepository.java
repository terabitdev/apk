package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import ho.l;
import ho.p;
import hr.n;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.Filter;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.FiltersState;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.SelectFiltersEvent;
import ir.a1;
import ir.b2;
import ir.d1;
import ir.j1;
import ir.l1;
import ir.r;
import ir.z1;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0001\u0018\u0000 }2\u00020\u0001:\u0001}B{\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0&2\u0006\u0010!\u001a\u00020%¢\u0006\u0004\b'\u0010(J3\u0010.\u001a\u00020-2\"\u0010,\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0+\u0012\u0006\u0012\u0004\u0018\u00010\u00010*H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\"2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J+\u00109\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0004\u0012\u00020407062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\"2\u0006\u0010;\u001a\u000204H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\"2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u001a\u0010B\u001a\u0004\u0018\u0001042\u0006\u0010?\u001a\u00020>H\u0082@¢\u0006\u0004\bB\u0010CJ#\u0010G\u001a\u00020\"2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E0DH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\"2\u0006\u0010;\u001a\u000204H\u0002¢\u0006\u0004\bI\u0010=J\u0017\u0010J\u001a\u00020\"2\u0006\u0010;\u001a\u000204H\u0002¢\u0006\u0004\bJ\u0010=J\u0017\u0010K\u001a\u00020\"2\u0006\u0010;\u001a\u000204H\u0002¢\u0006\u0004\bK\u0010=JE\u0010P\u001a\u00020\"2\u0006\u0010;\u001a\u0002042\b\b\u0001\u0010M\u001a\u00020L2\"\u0010O\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0N0+\u0012\u0006\u0012\u0004\u0018\u00010\u00010DH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\"2\u0006\u0010R\u001a\u000204H\u0002¢\u0006\u0004\bS\u0010=J\u000f\u0010T\u001a\u00020\"H\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010VR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010[R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\\R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010]R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010^R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010_R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010`R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010aR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u001c\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020%0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010jR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020E0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020E0o8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\"\u0010u\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020>\u0018\u00010t0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010nR\u0019\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104068F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020%068F¢\u0006\u0006\u001a\u0004\by\u0010wR\u001d\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0t068F¢\u0006\u0006\u001a\u0004\b{\u0010w¨\u0006~"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "", "Lfr/d0;", "scope", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "communityVoicesService", "Lio/elevenlabs/domain/services/FavoriteVoicesService;", "favoritesService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/RecentVoicesService;", "recentVoicesService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/FeatureFlagService;", "featureFlagService", "<init>", "(Lfr/d0;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/AudioPreviewService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/services/CommunityVoicesService;Lio/elevenlabs/domain/services/FavoriteVoicesService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/RecentVoicesService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/FeatureFlagService;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "event", "Lsn/z;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "Lhr/q;", "onNavigationEvent-JP2dKIU", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;)Ljava/lang/Object;", "onNavigationEvent", "Lkotlin/Function2;", "Lwn/c;", "block", "Lfr/k1;", "launch", "(Lho/p;)Lfr/k1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "mode", "initialise", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;)V", "", "readId", "Lir/i;", "Lsn/k;", "Lio/elevenlabs/domain/model/ReadMeta;", "observeInitData", "(Ljava/lang/String;)Lir/i;", "voiceId", "logVoiceChangerPreviewIfUnlocked", "(Ljava/lang/String;)V", "Lio/elevenlabs/domain/model/Voice;", "voice", "toggleVoicePreview", "(Lio/elevenlabs/domain/model/Voice;)V", "resolvePreviewUrl", "(Lio/elevenlabs/domain/model/Voice;Lwn/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "update", "updateState", "(Lho/l;)V", "addFavorite", "removeFavorite", "deleteVoice", "", "unknownErrorMessage", "Lio/elevenlabs/domain/model/AsyncCallResult;", "action", "favoritesAction", "(Ljava/lang/String;ILho/l;)V", "message", "showErrorToast", "loadAvailableFilters", "()V", "Lfr/d0;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/services/AudioPreviewService;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/VoicesService;", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "Lio/elevenlabs/domain/services/FavoriteVoicesService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/RecentVoicesService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/FeatureFlagService;", "lastPreviewPlayJob", "Lfr/k1;", "readMetaObservationJob", "voiceChangerFlagObservationJob", "Lhr/n;", "mutableSearchQueryChannel", "Lhr/n;", "mutableNavigationEventsChannel", "Lir/j1;", "mutableStateFlow", "Lir/j1;", "Lir/z1;", "stateFlow", "Lir/z1;", "getStateFlow", "()Lir/z1;", "", "mutableVoices", "getSearchQueryFlow", "()Lir/i;", "searchQueryFlow", "getNavigationFlow", "navigationFlow", "getVoices", "voices", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository {
    private static final String TAG = "VoicePickerSharedRepo";
    private final Analytics analytics;
    private final AudioPreviewService audioPreviewService;
    private final CommunityVoicesService communityVoicesService;
    private final DispatcherFactory dispatcherFactory;
    private final FavoriteVoicesService favoritesService;
    private final FeatureFlagService featureFlagService;
    private k1 lastPreviewPlayJob;
    private final Logger logger;
    private final n mutableNavigationEventsChannel;
    private final n mutableSearchQueryChannel;
    private final j1 mutableStateFlow;
    private final j1 mutableVoices;
    private k1 readMetaObservationJob;
    private final ReadsService readsService;
    private final RecentVoicesService recentVoicesService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final d0 scope;
    private final z1 stateFlow;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    private k1 voiceChangerFlagObservationJob;
    private final VoicesService voicesService;
    public static final int $stable = 8;

    public VoicePickerSharedRepository(d0 d0Var, DispatcherFactory dispatcherFactory, AudioPreviewService audioPreviewService, StringProvider stringProvider, ToastService toastService, ReadsService readsService, VoicesService voicesService, CommunityVoicesService communityVoicesService, FavoriteVoicesService favoriteVoicesService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger, RecentVoicesService recentVoicesService, Analytics analytics, FeatureFlagService featureFlagService) {
        d0Var.getClass();
        dispatcherFactory.getClass();
        audioPreviewService.getClass();
        stringProvider.getClass();
        toastService.getClass();
        readsService.getClass();
        voicesService.getClass();
        communityVoicesService.getClass();
        favoriteVoicesService.getClass();
        resolveErrorMessageUseCase.getClass();
        logger.getClass();
        recentVoicesService.getClass();
        analytics.getClass();
        featureFlagService.getClass();
        this.scope = d0Var;
        this.dispatcherFactory = dispatcherFactory;
        this.audioPreviewService = audioPreviewService;
        this.stringProvider = stringProvider;
        this.toastService = toastService;
        this.readsService = readsService;
        this.voicesService = voicesService;
        this.communityVoicesService = communityVoicesService;
        this.favoritesService = favoriteVoicesService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.logger = logger;
        this.recentVoicesService = recentVoicesService;
        this.analytics = analytics;
        this.featureFlagService = featureFlagService;
        this.mutableSearchQueryChannel = kd.a.b(0, 7, null);
        this.mutableNavigationEventsChannel = kd.a.b(-2, 6, null);
        b2 c5 = r.c(new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null));
        this.mutableStateFlow = c5;
        this.stateFlow = new l1(c5);
        this.mutableVoices = r.c(null);
    }

    private final void addFavorite(String voiceId) {
        favoritesAction(voiceId, R.string.add_voice_to_favorites_error_message, new VoicePickerSharedRepository$addFavorite$1(this, voiceId, null));
    }

    private final void deleteVoice(String voiceId) {
        if (((VoicePickerSharedContract.State) this.stateFlow.getValue()).getDeleteVoiceInProgressIds().contains(voiceId)) {
            return;
        }
        launch(new VoicePickerSharedRepository$deleteVoice$1(this, voiceId, null));
        updateState(new f(voiceId, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State deleteVoice$lambda$0(String str, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, null, null, kd.a.O(state.getDeleteVoiceInProgressIds(), str), false, 6143, null);
    }

    private final void favoritesAction(String voiceId, int unknownErrorMessage, l action) {
        if (((VoicePickerSharedContract.State) this.stateFlow.getValue()).getFavoriteChangeInProgressVoiceIds().contains(voiceId)) {
            return;
        }
        launch(new VoicePickerSharedRepository$favoritesAction$1(action, this, unknownErrorMessage, voiceId, null));
        updateState(new f(voiceId, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State favoritesAction$lambda$0(String str, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, kd.a.O(state.getFavoriteChangeInProgressVoiceIds(), str), null, null, null, false, 7935, null);
    }

    private final void initialise(VoicePickerMode mode) {
        k1 k1Var = this.readMetaObservationJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.readMetaObservationJob = null;
        k1 k1Var2 = this.voiceChangerFlagObservationJob;
        if (k1Var2 != null) {
            k1Var2.cancel((CancellationException) null);
        }
        this.voiceChangerFlagObservationJob = null;
        updateState(new i(mode, 2));
        this.voiceChangerFlagObservationJob = launch(new VoicePickerSharedRepository$initialise$2(this, null));
        if (mode instanceof VoicePickerMode.VoicePicker) {
            this.readMetaObservationJob = launch(new VoicePickerSharedRepository$initialise$3(this, mode, null));
        } else if (mode instanceof VoicePickerMode.VoicesTab) {
            updateState(new j(8));
        } else {
            c6.p();
            return;
        }
        loadAvailableFilters();
        launch(new VoicePickerSharedRepository$initialise$5(this, null));
        launch(new VoicePickerSharedRepository$initialise$6(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State initialise$lambda$0(VoicePickerMode voicePickerMode, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, voicePickerMode, null, null, null, null, false, null, false, null, null, null, null, false, 8178, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State initialise$lambda$1(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, VoicePickerSharedContract.ReadMetaState.Absent.INSTANCE, null, null, null, false, null, false, null, null, null, null, false, 8189, null);
    }

    private final k1 launch(p block) {
        return g0.D(this.scope, this.dispatcherFactory.getDefault(), null, block, 2);
    }

    private final void loadAvailableFilters() {
        launch(new VoicePickerSharedRepository$loadAvailableFilters$1(this, null));
    }

    private final void logVoiceChangerPreviewIfUnlocked(String voiceId) {
        VoicePickerSharedContract.ReadMetaState.Present present;
        ReadMeta value;
        VoicePickerSharedContract.State state = (VoicePickerSharedContract.State) this.stateFlow.getValue();
        VoicePickerSharedContract.ReadMetaState readMeta = state.getReadMeta();
        if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Present) {
            present = (VoicePickerSharedContract.ReadMetaState.Present) readMeta;
        } else {
            present = null;
        }
        if (present != null && (value = present.getValue()) != null && (state.getMode() instanceof VoicePickerMode.VoicePicker) && state.isVoiceChangerEnabled() && ReadMetaKt.getSupportsVoiceChanger(value)) {
            this.analytics.log(new Analytics.Event.VoiceChangerVoicePreviewed(value.getReadId(), voiceId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ir.i observeInitData(String readId) {
        return r.o(new d1(this.readsService.observeRead(readId), this.voicesService.defaultVoiceId(), VoicePickerSharedRepository$observeInitData$3.INSTANCE, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeInitData$lambda$0(ReadMeta readMeta, String str, wn.c cVar) {
        return new k(readMeta, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$0(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, ((VoicePickerSharedContract.Event.PreviewVoice) event).getVoice().getVoiceId(), null, false, null, false, null, null, null, null, false, 8183, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$1(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, ((VoicePickerSharedContract.Event.SelectVoice) event).getVoice().getVoiceId(), null, false, null, false, null, null, null, null, false, 8183, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$10(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, null, VoicePickerSharedContract.DeleteVoiceConfirmationDialogState.Hidden.INSTANCE, null, false, 7167, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$11(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        Filter filter;
        Set<Filter> set;
        Filter filter2;
        Filter filter3;
        Filter filter4;
        state.getClass();
        FiltersState filters = state.getFilters();
        VoicePickerSharedContract.Event.UpdateFilters updateFilters = (VoicePickerSharedContract.Event.UpdateFilters) event;
        SelectFiltersEvent filters2 = updateFilters.getFilters();
        Filter filter5 = null;
        if (filters2 != null) {
            filter = filters2.getActiveSort();
        } else {
            filter = null;
        }
        SelectFiltersEvent filters3 = updateFilters.getFilters();
        if (filters3 != null) {
            set = filters3.getActiveUseCases();
        } else {
            set = null;
        }
        SelectFiltersEvent filters4 = updateFilters.getFilters();
        if (filters4 != null) {
            filter2 = filters4.getActiveAge();
        } else {
            filter2 = null;
        }
        SelectFiltersEvent filters5 = updateFilters.getFilters();
        if (filters5 != null) {
            filter3 = filters5.getActiveGender();
        } else {
            filter3 = null;
        }
        SelectFiltersEvent filters6 = updateFilters.getFilters();
        if (filters6 != null) {
            filter4 = filters6.getActiveLanguage();
        } else {
            filter4 = null;
        }
        SelectFiltersEvent filters7 = updateFilters.getFilters();
        if (filters7 != null) {
            filter5 = filters7.getActiveAccent();
        }
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, FiltersState.copy$default(filters, null, filter, filter5, set, filter2, filter3, filter4, 1, null), false, null, null, null, null, false, 8127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$12(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, ((VoicePickerSharedContract.Event.UpdateFiltersDialogShown) event).getShown(), null, null, null, null, false, 8063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$13(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, ((VoicePickerSharedContract.Event.UpdateSearchShown) event).getShown(), null, false, null, null, null, null, false, 8159, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$14(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, null, null, null, false, 8031, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$15(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, ((VoicePickerSharedContract.Event.SetSelectedVoiceId) event).getVoiceId(), null, false, null, false, null, null, null, null, false, 8183, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$2(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, ((VoicePickerSharedContract.Event.UpdateFallbackVoiceId) event).getVoiceId(), null, null, false, null, false, null, null, null, null, false, 8187, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$3(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, EffectivePlaybackModeKt.ORIGINAL_AUDIO, null, false, null, false, null, null, null, null, false, 8183, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$4(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, state.getFallbackVoiceId(), null, false, null, false, null, null, null, null, false, 8183, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$5(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, new VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Shown(((VoicePickerSharedContract.Event.ConfirmRemoveFavorite) event).getVoice()), null, null, false, 7679, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$6(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Hidden.INSTANCE, null, null, false, 7679, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$7(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Hidden.INSTANCE, null, null, false, 7679, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$8(VoicePickerSharedContract.Event event, VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, null, new VoicePickerSharedContract.DeleteVoiceConfirmationDialogState.Shown(((VoicePickerSharedContract.Event.ConfirmDeleteVoice) event).getVoice()), null, false, 7167, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerSharedContract.State onEvent$lambda$9(VoicePickerSharedContract.State state) {
        state.getClass();
        return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, null, VoicePickerSharedContract.DeleteVoiceConfirmationDialogState.Hidden.INSTANCE, null, false, 7167, null);
    }

    private final void removeFavorite(String voiceId) {
        favoritesAction(voiceId, R.string.remove_voice_from_favorites_error_message, new VoicePickerSharedRepository$removeFavorite$1(this, voiceId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolvePreviewUrl(Voice voice, wn.c<? super String> cVar) {
        VoicePickerSharedRepository$resolvePreviewUrl$1 voicePickerSharedRepository$resolvePreviewUrl$1;
        int i10;
        VoicePickerSharedContract.ReadMetaState.Present present;
        ReadMeta readMeta;
        AsyncCallResult asyncCallResult;
        if (cVar instanceof VoicePickerSharedRepository$resolvePreviewUrl$1) {
            voicePickerSharedRepository$resolvePreviewUrl$1 = (VoicePickerSharedRepository$resolvePreviewUrl$1) cVar;
            int i11 = voicePickerSharedRepository$resolvePreviewUrl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voicePickerSharedRepository$resolvePreviewUrl$1.label = i11 - Integer.MIN_VALUE;
                VoicePickerSharedRepository$resolvePreviewUrl$1 voicePickerSharedRepository$resolvePreviewUrl$12 = voicePickerSharedRepository$resolvePreviewUrl$1;
                Object obj = voicePickerSharedRepository$resolvePreviewUrl$12.result;
                i10 = voicePickerSharedRepository$resolvePreviewUrl$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        voice = (Voice) voicePickerSharedRepository$resolvePreviewUrl$12.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    VoicePickerMode mode = ((VoicePickerSharedContract.State) this.stateFlow.getValue()).getMode();
                    VoicePickerSharedContract.ReadMetaState readMeta2 = ((VoicePickerSharedContract.State) this.stateFlow.getValue()).getReadMeta();
                    if (readMeta2 instanceof VoicePickerSharedContract.ReadMetaState.Present) {
                        present = (VoicePickerSharedContract.ReadMetaState.Present) readMeta2;
                    } else {
                        present = null;
                    }
                    if (present != null) {
                        readMeta = present.getValue();
                    } else {
                        readMeta = null;
                    }
                    if ((mode instanceof VoicePickerMode.VoicePicker) && readMeta != null) {
                        VoicesService voicesService = this.voicesService;
                        String voiceId = voice.getVoiceId();
                        String readId = ((VoicePickerMode.VoicePicker) mode).getReadId();
                        long lastListenedCharOffset = readMeta.getLastListenedCharOffset();
                        voicePickerSharedRepository$resolvePreviewUrl$12.L$0 = voice;
                        voicePickerSharedRepository$resolvePreviewUrl$12.L$1 = null;
                        voicePickerSharedRepository$resolvePreviewUrl$12.L$2 = null;
                        voicePickerSharedRepository$resolvePreviewUrl$12.label = 1;
                        obj = voicesService.getContextualPreviewUrl(voiceId, readId, lastListenedCharOffset, voicePickerSharedRepository$resolvePreviewUrl$12);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return voice.getPreviewUrl();
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    return ((AsyncCallResult.Success) asyncCallResult).getData();
                }
                Logger.logWarning$default(this.logger, TAG, "Contextual preview failed, falling back to static preview", null, 4, null);
                return voice.getPreviewUrl();
            }
        }
        voicePickerSharedRepository$resolvePreviewUrl$1 = new VoicePickerSharedRepository$resolvePreviewUrl$1(this, cVar);
        VoicePickerSharedRepository$resolvePreviewUrl$1 voicePickerSharedRepository$resolvePreviewUrl$122 = voicePickerSharedRepository$resolvePreviewUrl$1;
        Object obj2 = voicePickerSharedRepository$resolvePreviewUrl$122.result;
        i10 = voicePickerSharedRepository$resolvePreviewUrl$122.label;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorToast(String message) {
        ToastService.showToast$default(this.toastService, message, null, ToastService.ToastVariant.ERROR, 2, null);
    }

    private final void toggleVoicePreview(Voice voice) {
        this.analytics.log(Analytics.Event.VoicesClickedPlayVoice.INSTANCE);
        logVoiceChangerPreviewIfUnlocked(voice.getVoiceId());
        this.lastPreviewPlayJob = launch(new VoicePickerSharedRepository$toggleVoicePreview$1(this.lastPreviewPlayJob, m.c(((VoicePickerSharedContract.State) this.stateFlow.getValue()).getPlayingPreviewVoiceId(), voice.getVoiceId()), this, voice, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(l update) {
        j1 j1Var = this.mutableStateFlow;
        j1Var.setValue(update.invoke(j1Var.getValue()));
    }

    public final ir.i getNavigationFlow() {
        return r.B(this.mutableNavigationEventsChannel);
    }

    public final ir.i getSearchQueryFlow() {
        return r.B(this.mutableSearchQueryChannel);
    }

    public final z1 getStateFlow() {
        return this.stateFlow;
    }

    public final ir.i getVoices() {
        return r.o(new a1(this.mutableVoices, 0));
    }

    public final void onEvent(final VoicePickerSharedContract.Event event) {
        event.getClass();
        if (event instanceof VoicePickerSharedContract.Event.Initialise) {
            initialise(((VoicePickerSharedContract.Event.Initialise) event).getMode());
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.PreviewVoice) {
            VoicePickerMode mode = ((VoicePickerSharedContract.State) this.stateFlow.getValue()).getMode();
            if (mode instanceof VoicePickerMode.VoicePicker) {
                VoicePickerSharedContract.Event.PreviewVoice previewVoice = (VoicePickerSharedContract.Event.PreviewVoice) event;
                if (previewVoice.getMarkAsRecentIfSelected()) {
                    launch(new VoicePickerSharedRepository$onEvent$1(this, event, null));
                }
                toggleVoicePreview(previewVoice.getVoice());
                final int i10 = 4;
                updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        VoicePickerSharedContract.State onEvent$lambda$1;
                        VoicePickerSharedContract.State onEvent$lambda$2;
                        VoicePickerSharedContract.State onEvent$lambda$5;
                        VoicePickerSharedContract.State onEvent$lambda$8;
                        VoicePickerSharedContract.State onEvent$lambda$0;
                        VoicePickerSharedContract.State onEvent$lambda$11;
                        VoicePickerSharedContract.State onEvent$lambda$12;
                        VoicePickerSharedContract.State onEvent$lambda$13;
                        VoicePickerSharedContract.State onEvent$lambda$15;
                        switch (i10) {
                            case 0:
                                onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$1;
                            case 1:
                                onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$2;
                            case 2:
                                onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$5;
                            case 3:
                                onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$8;
                            case 4:
                                onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$0;
                            case 5:
                                onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$11;
                            case 6:
                                onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$12;
                            case 7:
                                onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$13;
                            default:
                                onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$15;
                        }
                    }
                });
                return;
            }
            if (mode instanceof VoicePickerMode.VoicesTab) {
                toggleVoicePreview(((VoicePickerSharedContract.Event.PreviewVoice) event).getVoice());
                return;
            } else {
                if (mode != null) {
                    c6.p();
                    return;
                }
                return;
            }
        }
        if (event instanceof VoicePickerSharedContract.Event.SelectVoice) {
            VoicePickerSharedContract.Event.SelectVoice selectVoice = (VoicePickerSharedContract.Event.SelectVoice) event;
            toggleVoicePreview(selectVoice.getVoice());
            VoicePickerMode mode2 = ((VoicePickerSharedContract.State) this.stateFlow.getValue()).getMode();
            if (mode2 instanceof VoicePickerMode.VoicePicker) {
                if (selectVoice.getMarkAsRecent()) {
                    launch(new VoicePickerSharedRepository$onEvent$3(this, event, null));
                }
                final int i11 = 0;
                updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        VoicePickerSharedContract.State onEvent$lambda$1;
                        VoicePickerSharedContract.State onEvent$lambda$2;
                        VoicePickerSharedContract.State onEvent$lambda$5;
                        VoicePickerSharedContract.State onEvent$lambda$8;
                        VoicePickerSharedContract.State onEvent$lambda$0;
                        VoicePickerSharedContract.State onEvent$lambda$11;
                        VoicePickerSharedContract.State onEvent$lambda$12;
                        VoicePickerSharedContract.State onEvent$lambda$13;
                        VoicePickerSharedContract.State onEvent$lambda$15;
                        switch (i11) {
                            case 0:
                                onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$1;
                            case 1:
                                onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$2;
                            case 2:
                                onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$5;
                            case 3:
                                onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$8;
                            case 4:
                                onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$0;
                            case 5:
                                onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$11;
                            case 6:
                                onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$12;
                            case 7:
                                onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$13;
                            default:
                                onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                                return onEvent$lambda$15;
                        }
                    }
                });
                return;
            }
            if (!(mode2 instanceof VoicePickerMode.VoicesTab) && mode2 != null) {
                c6.p();
                return;
            }
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.UpdateFallbackVoiceId) {
            final int i12 = 1;
            updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State onEvent$lambda$1;
                    VoicePickerSharedContract.State onEvent$lambda$2;
                    VoicePickerSharedContract.State onEvent$lambda$5;
                    VoicePickerSharedContract.State onEvent$lambda$8;
                    VoicePickerSharedContract.State onEvent$lambda$0;
                    VoicePickerSharedContract.State onEvent$lambda$11;
                    VoicePickerSharedContract.State onEvent$lambda$12;
                    VoicePickerSharedContract.State onEvent$lambda$13;
                    VoicePickerSharedContract.State onEvent$lambda$15;
                    switch (i12) {
                        case 0:
                            onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$1;
                        case 1:
                            onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$2;
                        case 2:
                            onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$5;
                        case 3:
                            onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$8;
                        case 4:
                            onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$0;
                        case 5:
                            onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$11;
                        case 6:
                            onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$12;
                        case 7:
                            onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$13;
                        default:
                            onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$15;
                    }
                }
            });
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.SelectOriginalAudio) {
            k1 k1Var = this.lastPreviewPlayJob;
            if (k1Var != null) {
                k1Var.cancel((CancellationException) null);
            }
            updateState(new j(3));
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.CancelVoicePreview) {
            k1 k1Var2 = this.lastPreviewPlayJob;
            if (k1Var2 != null) {
                k1Var2.cancel((CancellationException) null);
                return;
            }
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.ResetSelectedVoice) {
            k1 k1Var3 = this.lastPreviewPlayJob;
            if (k1Var3 != null) {
                k1Var3.cancel((CancellationException) null);
            }
            updateState(new j(4));
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.AddFavorite) {
            addFavorite(((VoicePickerSharedContract.Event.AddFavorite) event).getVoiceId());
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.ConfirmRemoveFavorite) {
            final int i13 = 2;
            updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State onEvent$lambda$1;
                    VoicePickerSharedContract.State onEvent$lambda$2;
                    VoicePickerSharedContract.State onEvent$lambda$5;
                    VoicePickerSharedContract.State onEvent$lambda$8;
                    VoicePickerSharedContract.State onEvent$lambda$0;
                    VoicePickerSharedContract.State onEvent$lambda$11;
                    VoicePickerSharedContract.State onEvent$lambda$12;
                    VoicePickerSharedContract.State onEvent$lambda$13;
                    VoicePickerSharedContract.State onEvent$lambda$15;
                    switch (i13) {
                        case 0:
                            onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$1;
                        case 1:
                            onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$2;
                        case 2:
                            onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$5;
                        case 3:
                            onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$8;
                        case 4:
                            onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$0;
                        case 5:
                            onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$11;
                        case 6:
                            onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$12;
                        case 7:
                            onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$13;
                        default:
                            onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$15;
                    }
                }
            });
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.DismissRemoveFavoriteConfirmation) {
            updateState(new j(5));
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.RemoveFavorite) {
            updateState(new j(6));
            removeFavorite(((VoicePickerSharedContract.Event.RemoveFavorite) event).getVoiceId());
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.ConfirmDeleteVoice) {
            final int i14 = 3;
            updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State onEvent$lambda$1;
                    VoicePickerSharedContract.State onEvent$lambda$2;
                    VoicePickerSharedContract.State onEvent$lambda$5;
                    VoicePickerSharedContract.State onEvent$lambda$8;
                    VoicePickerSharedContract.State onEvent$lambda$0;
                    VoicePickerSharedContract.State onEvent$lambda$11;
                    VoicePickerSharedContract.State onEvent$lambda$12;
                    VoicePickerSharedContract.State onEvent$lambda$13;
                    VoicePickerSharedContract.State onEvent$lambda$15;
                    switch (i14) {
                        case 0:
                            onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$1;
                        case 1:
                            onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$2;
                        case 2:
                            onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$5;
                        case 3:
                            onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$8;
                        case 4:
                            onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$0;
                        case 5:
                            onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$11;
                        case 6:
                            onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$12;
                        case 7:
                            onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$13;
                        default:
                            onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$15;
                    }
                }
            });
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.DismissDeleteVoiceConfirmation) {
            updateState(new j(7));
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.DeleteVoice) {
            updateState(new j(9));
            deleteVoice(((VoicePickerSharedContract.Event.DeleteVoice) event).getVoiceId());
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.UpdateFilters) {
            final int i15 = 5;
            updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State onEvent$lambda$1;
                    VoicePickerSharedContract.State onEvent$lambda$2;
                    VoicePickerSharedContract.State onEvent$lambda$5;
                    VoicePickerSharedContract.State onEvent$lambda$8;
                    VoicePickerSharedContract.State onEvent$lambda$0;
                    VoicePickerSharedContract.State onEvent$lambda$11;
                    VoicePickerSharedContract.State onEvent$lambda$12;
                    VoicePickerSharedContract.State onEvent$lambda$13;
                    VoicePickerSharedContract.State onEvent$lambda$15;
                    switch (i15) {
                        case 0:
                            onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$1;
                        case 1:
                            onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$2;
                        case 2:
                            onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$5;
                        case 3:
                            onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$8;
                        case 4:
                            onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$0;
                        case 5:
                            onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$11;
                        case 6:
                            onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$12;
                        case 7:
                            onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$13;
                        default:
                            onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$15;
                    }
                }
            });
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.UpdateFiltersDialogShown) {
            final int i16 = 6;
            updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State onEvent$lambda$1;
                    VoicePickerSharedContract.State onEvent$lambda$2;
                    VoicePickerSharedContract.State onEvent$lambda$5;
                    VoicePickerSharedContract.State onEvent$lambda$8;
                    VoicePickerSharedContract.State onEvent$lambda$0;
                    VoicePickerSharedContract.State onEvent$lambda$11;
                    VoicePickerSharedContract.State onEvent$lambda$12;
                    VoicePickerSharedContract.State onEvent$lambda$13;
                    VoicePickerSharedContract.State onEvent$lambda$15;
                    switch (i16) {
                        case 0:
                            onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$1;
                        case 1:
                            onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$2;
                        case 2:
                            onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$5;
                        case 3:
                            onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$8;
                        case 4:
                            onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$0;
                        case 5:
                            onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$11;
                        case 6:
                            onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$12;
                        case 7:
                            onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$13;
                        default:
                            onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$15;
                    }
                }
            });
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.UpdateSearchShown) {
            final int i17 = 7;
            updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State onEvent$lambda$1;
                    VoicePickerSharedContract.State onEvent$lambda$2;
                    VoicePickerSharedContract.State onEvent$lambda$5;
                    VoicePickerSharedContract.State onEvent$lambda$8;
                    VoicePickerSharedContract.State onEvent$lambda$0;
                    VoicePickerSharedContract.State onEvent$lambda$11;
                    VoicePickerSharedContract.State onEvent$lambda$12;
                    VoicePickerSharedContract.State onEvent$lambda$13;
                    VoicePickerSharedContract.State onEvent$lambda$15;
                    switch (i17) {
                        case 0:
                            onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$1;
                        case 1:
                            onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$2;
                        case 2:
                            onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$5;
                        case 3:
                            onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$8;
                        case 4:
                            onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$0;
                        case 5:
                            onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$11;
                        case 6:
                            onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$12;
                        case 7:
                            onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$13;
                        default:
                            onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$15;
                    }
                }
            });
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.ResetBeforeClosing) {
            k1 k1Var4 = this.lastPreviewPlayJob;
            if (k1Var4 != null) {
                k1Var4.cancel((CancellationException) null);
            }
            updateState(new j(10));
            return;
        }
        if (event instanceof VoicePickerSharedContract.Event.UpdateSearchQuery) {
            this.mutableSearchQueryChannel.d(((VoicePickerSharedContract.Event.UpdateSearchQuery) event).getQuery());
        } else if (event instanceof VoicePickerSharedContract.Event.SetSelectedVoiceId) {
            final int i18 = 8;
            updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.e
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State onEvent$lambda$1;
                    VoicePickerSharedContract.State onEvent$lambda$2;
                    VoicePickerSharedContract.State onEvent$lambda$5;
                    VoicePickerSharedContract.State onEvent$lambda$8;
                    VoicePickerSharedContract.State onEvent$lambda$0;
                    VoicePickerSharedContract.State onEvent$lambda$11;
                    VoicePickerSharedContract.State onEvent$lambda$12;
                    VoicePickerSharedContract.State onEvent$lambda$13;
                    VoicePickerSharedContract.State onEvent$lambda$15;
                    switch (i18) {
                        case 0:
                            onEvent$lambda$1 = VoicePickerSharedRepository.onEvent$lambda$1(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$1;
                        case 1:
                            onEvent$lambda$2 = VoicePickerSharedRepository.onEvent$lambda$2(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$2;
                        case 2:
                            onEvent$lambda$5 = VoicePickerSharedRepository.onEvent$lambda$5(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$5;
                        case 3:
                            onEvent$lambda$8 = VoicePickerSharedRepository.onEvent$lambda$8(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$8;
                        case 4:
                            onEvent$lambda$0 = VoicePickerSharedRepository.onEvent$lambda$0(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$0;
                        case 5:
                            onEvent$lambda$11 = VoicePickerSharedRepository.onEvent$lambda$11(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$11;
                        case 6:
                            onEvent$lambda$12 = VoicePickerSharedRepository.onEvent$lambda$12(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$12;
                        case 7:
                            onEvent$lambda$13 = VoicePickerSharedRepository.onEvent$lambda$13(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$13;
                        default:
                            onEvent$lambda$15 = VoicePickerSharedRepository.onEvent$lambda$15(event, (VoicePickerSharedContract.State) obj);
                            return onEvent$lambda$15;
                    }
                }
            });
        } else {
            c6.p();
        }
    }

    /* renamed from: onNavigationEvent-JP2dKIU, reason: not valid java name */
    public final Object m1621onNavigationEventJP2dKIU(VoicePickerSharedContract.NavigationEvent event) {
        event.getClass();
        return this.mutableNavigationEventsChannel.d(event);
    }
}
