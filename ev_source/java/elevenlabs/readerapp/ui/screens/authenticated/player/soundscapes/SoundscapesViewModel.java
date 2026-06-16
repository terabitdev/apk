package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import a2.o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.domain.services.SoundscapesService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.o1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import ir.i1;
import ir.r;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t2.u;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010\u0015J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010\u0015J\u000f\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0015J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u0015J!\u00102\u001a\u00020\u00112\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u0002090B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$State;", "Lio/elevenlabs/domain/services/SoundscapesService;", "soundscapesService", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Lio/elevenlabs/domain/services/SoundscapesService;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/DispatcherFactory;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "event", "Lsn/z;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;)V", "onCleared", "()V", "initialize", "onRetry", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "tab", "selectTab", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;)V", "", FirebaseAnalytics.Param.LEVEL, "setMixerLevel", "(F)V", "Lio/elevenlabs/domain/model/Soundscape;", "soundscape", "selectSoundscape", "(Lio/elevenlabs/domain/model/Soundscape;)V", "playPreview", "startDownload", "stopPreview", "stopPreviewInternal", "saveAndClose", "resetAndClose", "Ljava/io/File;", "file", "startPreview", "(Lio/elevenlabs/domain/model/Soundscape;Ljava/io/File;)V", "connectAndObservePlayer", "", "soundscapeId", "progress", "updateDownloadProgress", "(Ljava/lang/String;Ljava/lang/Float;)V", "Lio/elevenlabs/domain/services/SoundscapesService;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/Logger;", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$ControlEvent;", "mutableControlEventsFlow", "Lir/i1;", "", "Lfr/k1;", "downloadJobs", "Ljava/util/Map;", "playerConnectionJob", "Lfr/k1;", "Lir/i;", "getControlEventsFlow", "()Lir/i;", "controlEventsFlow", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SoundscapesViewModel extends MviViewModel<SoundscapesContract.State> {
    private static final String TAG = "SoundscapesViewModel";
    private final Analytics analytics;
    private final Map<String, k1> downloadJobs;
    private final Logger logger;
    private final i1 mutableControlEventsFlow;
    private k1 playerConnectionJob;
    private final PlayerService playerService;
    private final SoundscapesService soundscapesService;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapesViewModel(SoundscapesService soundscapesService, PlayerService playerService, Analytics analytics, Logger logger, DispatcherFactory dispatcherFactory) {
        super(new SoundscapesContract.State(false, null, null, null, null, u.P, null, null, null, null, null, null, null, 8191, null), dispatcherFactory, logger);
        soundscapesService.getClass();
        playerService.getClass();
        analytics.getClass();
        logger.getClass();
        dispatcherFactory.getClass();
        this.soundscapesService = soundscapesService;
        this.playerService = playerService;
        this.analytics = analytics;
        this.logger = logger;
        this.mutableControlEventsFlow = r.a(0, 1, hr.a.f12537b);
        this.downloadJobs = new LinkedHashMap();
        initialize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connectAndObservePlayer() {
        this.playerConnectionJob = MviViewModel.launch$default(this, null, new SoundscapesViewModel$connectAndObservePlayer$1(this, null), 1, null);
    }

    private final void initialize() {
        MviViewModel.launch$default(this, null, new SoundscapesViewModel$initialize$1(this, null), 1, null);
    }

    private final void onRetry() {
        queueStateUpdate(new l(6));
        initialize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State onRetry$lambda$0(SoundscapesContract.State state) {
        state.getClass();
        return SoundscapesContract.State.copy$default(state, true, null, null, null, null, u.P, null, null, null, null, null, null, null, 8188, null);
    }

    private final void playPreview(Soundscape soundscape) {
        queueStateUpdate(new io.elevenlabs.data.database.entities.reads.h(soundscape, this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State playPreview$lambda$0(Soundscape soundscape, SoundscapesViewModel soundscapesViewModel, SoundscapesContract.State state) {
        state.getClass();
        if (kotlin.jvm.internal.m.c(state.getPlayingPreviewId(), soundscape.getId())) {
            soundscapesViewModel.stopPreviewInternal();
            return SoundscapesContract.State.copy$default(state, false, null, null, null, null, u.P, null, null, null, null, null, null, null, 6143, null);
        }
        soundscapesViewModel.stopPreviewInternal();
        soundscapesViewModel.startDownload(soundscape);
        return SoundscapesContract.State.copy$default(state, false, null, null, null, null, u.P, null, null, null, null, null, null, a0.O(new sn.k(soundscape.getId(), Float.valueOf(u.P)), state.getDownloadProgress()), 4095, null);
    }

    private final void resetAndClose() {
        queueStateUpdate(new j(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State resetAndClose$lambda$0(SoundscapesViewModel soundscapesViewModel, SoundscapesContract.State state) {
        String str;
        float f10;
        state.getClass();
        Soundscape originalSoundscape = state.getOriginalSoundscape();
        if (originalSoundscape != null) {
            str = originalSoundscape.getId();
        } else {
            str = null;
        }
        File originalSoundscapeFile = state.getOriginalSoundscapeFile();
        Float originalMixerLevel = state.getOriginalMixerLevel();
        if (originalMixerLevel != null) {
            f10 = originalMixerLevel.floatValue();
        } else {
            f10 = 0.5f;
        }
        MviViewModel.launch$default(soundscapesViewModel, null, new SoundscapesViewModel$resetAndClose$1$1(soundscapesViewModel, str, originalSoundscapeFile, f10, null), 1, null);
        soundscapesViewModel.mutableControlEventsFlow.tryEmit(SoundscapesContract.ControlEvent.CloseScreen.INSTANCE);
        return state;
    }

    private final void saveAndClose() {
        queueStateUpdate(new j(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State saveAndClose$lambda$0(SoundscapesViewModel soundscapesViewModel, SoundscapesContract.State state) {
        String str;
        String str2;
        state.getClass();
        Soundscape selectedSoundscape = state.getSelectedSoundscape();
        File selectedSoundscapeFile = state.getSelectedSoundscapeFile();
        float mixerLevel = state.getMixerLevel();
        if (selectedSoundscape == null) {
            Analytics analytics = soundscapesViewModel.analytics;
            Soundscape originalSoundscape = state.getOriginalSoundscape();
            if (originalSoundscape != null) {
                str2 = originalSoundscape.getId();
            } else {
                str2 = null;
            }
            analytics.log(new Analytics.Event.SoundscapesDisabledTrack(str2));
        } else {
            soundscapesViewModel.analytics.log(new Analytics.Event.SoundscapesEnabledTrack(selectedSoundscape.getId()));
        }
        Analytics analytics2 = soundscapesViewModel.analytics;
        if (selectedSoundscape != null) {
            str = selectedSoundscape.getId();
        } else {
            str = null;
        }
        analytics2.log(new Analytics.Event.SoundscapesAdjustedVolume(mixerLevel, str));
        MviViewModel.launch$default(soundscapesViewModel, null, new SoundscapesViewModel$saveAndClose$1$1(soundscapesViewModel, selectedSoundscape, selectedSoundscapeFile, mixerLevel, null), 1, null);
        soundscapesViewModel.mutableControlEventsFlow.tryEmit(SoundscapesContract.ControlEvent.CloseScreen.INSTANCE);
        return SoundscapesContract.State.copy$default(state, true, null, null, null, null, u.P, null, null, selectedSoundscape, selectedSoundscapeFile, Float.valueOf(mixerLevel), null, null, 6398, null);
    }

    private final void selectSoundscape(Soundscape soundscape) {
        if (soundscape == null) {
            stopPreview();
        }
        queueStateUpdate(new m(soundscape, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State selectSoundscape$lambda$0(Soundscape soundscape, SoundscapesContract.State state) {
        state.getClass();
        return SoundscapesContract.State.copy$default(state, false, null, null, null, null, u.P, soundscape, null, null, null, null, null, null, 8127, null);
    }

    private final void selectTab(SoundscapeCategory tab) {
        queueStateUpdate(new m(tab, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State selectTab$lambda$0(SoundscapeCategory soundscapeCategory, SoundscapesContract.State state) {
        state.getClass();
        return SoundscapesContract.State.copy$default(state, false, null, null, null, soundscapeCategory, u.P, null, null, null, null, null, null, null, 8175, null);
    }

    private final void setMixerLevel(float level) {
        queueStateUpdate(new o1(this, level, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State setMixerLevel$lambda$0(SoundscapesViewModel soundscapesViewModel, float f10, SoundscapesContract.State state) {
        String str;
        state.getClass();
        Soundscape selectedSoundscape = state.getSelectedSoundscape();
        if (selectedSoundscape != null) {
            str = selectedSoundscape.getId();
        } else {
            str = null;
        }
        MviViewModel.launch$default(soundscapesViewModel, null, new SoundscapesViewModel$setMixerLevel$1$1(soundscapesViewModel, str, state.getSelectedSoundscapeFile(), f10, null), 1, null);
        return SoundscapesContract.State.copy$default(state, false, null, null, null, null, f10, null, null, null, null, null, null, null, 8159, null);
    }

    private final void startDownload(Soundscape soundscape) {
        this.downloadJobs.put(soundscape.getId(), MviViewModel.launch$default(this, null, new SoundscapesViewModel$startDownload$1(this, soundscape, null), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPreview(Soundscape soundscape, File file) {
        queueStateUpdate(new o0(this, soundscape, file, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State startPreview$lambda$0(SoundscapesViewModel soundscapesViewModel, Soundscape soundscape, File file, SoundscapesContract.State state) {
        state.getClass();
        MviViewModel.launch$default(soundscapesViewModel, null, new SoundscapesViewModel$startPreview$1$1(soundscapesViewModel, soundscape, file, state.getMixerLevel(), null), 1, null);
        return SoundscapesContract.State.copy$default(state, false, null, null, null, null, u.P, soundscape, file, null, null, null, soundscape.getId(), null, 5951, null);
    }

    private final void stopPreview() {
        queueStateUpdate(new j(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State stopPreview$lambda$0(SoundscapesViewModel soundscapesViewModel, SoundscapesContract.State state) {
        state.getClass();
        soundscapesViewModel.stopPreviewInternal();
        MviViewModel.launch$default(soundscapesViewModel, null, new SoundscapesViewModel$stopPreview$1$1(soundscapesViewModel, state.getMixerLevel(), null), 1, null);
        return SoundscapesContract.State.copy$default(state, false, null, null, null, null, u.P, null, null, null, null, null, null, null, 6143, null);
    }

    private final void stopPreviewInternal() {
        Iterator<Map.Entry<String, k1>> it = this.downloadJobs.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel((CancellationException) null);
        }
        this.downloadJobs.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDownloadProgress(String soundscapeId, Float progress) {
        queueStateUpdate(new io.elevenlabs.data.database.entities.reads.h(progress, soundscapeId, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SoundscapesContract.State updateDownloadProgress$lambda$0(Float f10, String str, SoundscapesContract.State state) {
        state.getClass();
        LinkedHashMap T = a0.T(state.getDownloadProgress());
        if (f10 == null) {
            T.remove(str);
        } else {
            T.put(str, f10);
        }
        return SoundscapesContract.State.copy$default(state, false, null, null, null, null, u.P, null, null, null, null, null, null, T, 4095, null);
    }

    public final ir.i getControlEventsFlow() {
        return new ir.k1(this.mutableControlEventsFlow);
    }

    @Override // io.elevenlabs.readerapp.core.MviViewModel, androidx.lifecycle.j1
    public void onCleared() {
        stopPreviewInternal();
        k1 k1Var = this.playerConnectionJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.playerConnectionJob = null;
        super.onCleared();
    }

    public final void onEvent(SoundscapesContract.Event event) {
        event.getClass();
        if (!(event instanceof SoundscapesContract.Event.Close) && !(event instanceof SoundscapesContract.Event.Reset)) {
            if (event instanceof SoundscapesContract.Event.Save) {
                saveAndClose();
                return;
            }
            if (event instanceof SoundscapesContract.Event.SelectTab) {
                selectTab(((SoundscapesContract.Event.SelectTab) event).getTab());
                return;
            }
            if (event instanceof SoundscapesContract.Event.UpdateMixerLevel) {
                setMixerLevel(((SoundscapesContract.Event.UpdateMixerLevel) event).getLevel());
                return;
            }
            if (event instanceof SoundscapesContract.Event.SelectSoundscape) {
                selectSoundscape(((SoundscapesContract.Event.SelectSoundscape) event).getSoundscape());
                return;
            }
            if (event instanceof SoundscapesContract.Event.PlayPreview) {
                playPreview(((SoundscapesContract.Event.PlayPreview) event).getSoundscape());
                return;
            }
            if (event instanceof SoundscapesContract.Event.StopPreview) {
                stopPreview();
                return;
            } else if (event instanceof SoundscapesContract.Event.Retry) {
                onRetry();
                return;
            } else {
                c6.p();
                return;
            }
        }
        resetAndClose();
    }
}
