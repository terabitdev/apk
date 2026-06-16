package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list;

import fr.k1;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.i;
import ir.z1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\f\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0015H&¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\rH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListBaseViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "sharedRepository", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "event", "Lsn/z;", "onSharedEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "Lhr/q;", "onNavigationEvent-JP2dKIU", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;)Ljava/lang/Object;", "onNavigationEvent", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "syncVoices", "()Lir/i;", "", "Lio/elevenlabs/domain/model/Voice;", "observeVoices", "handleSyncVoices", "()V", "handleObserveVoices", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "Lfr/k1;", "syncJob", "Lfr/k1;", "Lir/z1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "getSharedStateFlow", "()Lir/z1;", "sharedStateFlow", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class VoicesListBaseViewModel extends MviViewModel<VoicesListContract.State> {
    public static final int $stable = 8;
    private final ConnectivityService connectivityService;
    private final VoicePickerSharedRepository sharedRepository;
    private k1 syncJob;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoicesListBaseViewModel(DispatcherFactory dispatcherFactory, ConnectivityService connectivityService, VoicePickerSharedRepository voicePickerSharedRepository) {
        super(new VoicesListContract.State(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        connectivityService.getClass();
        voicePickerSharedRepository.getClass();
        Logger logger = null;
        this.connectivityService = connectivityService;
        this.sharedRepository = voicePickerSharedRepository;
    }

    public final z1 getSharedStateFlow() {
        return this.sharedRepository.getStateFlow();
    }

    public final void handleObserveVoices() {
        MviViewModel.launch$default(this, null, new VoicesListBaseViewModel$handleObserveVoices$1(this, null), 1, null);
    }

    public final void handleSyncVoices() {
        k1 k1Var = this.syncJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.syncJob = MviViewModel.launch$default(this, null, new VoicesListBaseViewModel$handleSyncVoices$1(this, null), 1, null);
    }

    public abstract i observeVoices();

    /* renamed from: onNavigationEvent-JP2dKIU, reason: not valid java name */
    public final Object m1580onNavigationEventJP2dKIU(VoicePickerSharedContract.NavigationEvent event) {
        event.getClass();
        return this.sharedRepository.m1621onNavigationEventJP2dKIU(event);
    }

    public final void onSharedEvent(VoicePickerSharedContract.Event event) {
        event.getClass();
        this.sharedRepository.onEvent(event);
    }

    public abstract i syncVoices();
}
