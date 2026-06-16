package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ExploreVoicesService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.i;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionRoute;", "route", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "sharedRepository", "Lio/elevenlabs/domain/services/ExploreVoicesService;", ReferencesHeader.SERVICE, "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionRoute;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;Lio/elevenlabs/domain/services/ExploreVoicesService;Lio/elevenlabs/domain/services/ConnectivityService;)V", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/VoiceCollectionWithVoices;", "observeCollection", "()Lir/i;", "Lsn/z;", "handleLoadCollection", "()V", "actualiseVoices", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "event", "onSharedEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionRoute;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "Lio/elevenlabs/domain/services/ExploreVoicesService;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lir/z1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "getSharedState", "()Lir/z1;", "sharedState", "Factory", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerCollectionViewModel extends MviViewModel<VoicePickerCollectionState> {
    public static final int $stable = 8;
    private final ConnectivityService connectivityService;
    private final Logger logger;
    private final VoicePickerCollectionRoute route;
    private final ExploreVoicesService service;
    private final VoicePickerSharedRepository sharedRepository;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionViewModel$Factory;", "", "create", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionViewModel;", "route", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionRoute;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        VoicePickerCollectionViewModel create(VoicePickerCollectionRoute route);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerCollectionViewModel(DispatcherFactory dispatcherFactory, VoicePickerCollectionRoute voicePickerCollectionRoute, Logger logger, VoicePickerSharedRepository voicePickerSharedRepository, ExploreVoicesService exploreVoicesService, ConnectivityService connectivityService) {
        super(VoicePickerCollectionState.Loading.INSTANCE, dispatcherFactory, null, 4, null);
        dispatcherFactory.getClass();
        voicePickerCollectionRoute.getClass();
        logger.getClass();
        voicePickerSharedRepository.getClass();
        exploreVoicesService.getClass();
        connectivityService.getClass();
        this.route = voicePickerCollectionRoute;
        this.logger = logger;
        this.sharedRepository = voicePickerSharedRepository;
        this.service = exploreVoicesService;
        this.connectivityService = connectivityService;
        handleLoadCollection();
        actualiseVoices();
    }

    private final void actualiseVoices() {
        MviViewModel.launch$default(this, null, new VoicePickerCollectionViewModel$actualiseVoices$1(this, null), 1, null);
    }

    private final void handleLoadCollection() {
        MviViewModel.launch$default(this, null, new VoicePickerCollectionViewModel$handleLoadCollection$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i observeCollection() {
        return r.G(this.connectivityService.isConnected(), new VoicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1(null, this));
    }

    public final z1 getSharedState() {
        return this.sharedRepository.getStateFlow();
    }

    public final void onSharedEvent(VoicePickerSharedContract.Event event) {
        event.getClass();
        this.sharedRepository.onEvent(event);
    }
}
