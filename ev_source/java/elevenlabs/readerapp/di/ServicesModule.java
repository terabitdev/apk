package io.elevenlabs.readerapp.di;

import io.elevenlabs.domain.services.AgentContextService;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.ClipboardService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.NavigationService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.readerapp.services.AgentContextServiceImpl;
import io.elevenlabs.readerapp.services.AndroidClipboardService;
import io.elevenlabs.readerapp.services.AndroidConnectivityService;
import io.elevenlabs.readerapp.services.MediaAudioPreviewService;
import io.elevenlabs.readerapp.services.NavigationServiceImpl;
import io.elevenlabs.readerapp.services.ToastServiceImpl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001aH'¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/di/ServicesModule;", "", "<init>", "()V", "bindConnectivityService", "Lio/elevenlabs/domain/services/ConnectivityService;", "androidConnectivityService", "Lio/elevenlabs/readerapp/services/AndroidConnectivityService;", "bindClipboardService", "Lio/elevenlabs/domain/services/ClipboardService;", "androidClipboardService", "Lio/elevenlabs/readerapp/services/AndroidClipboardService;", "bindToastService", "Lio/elevenlabs/domain/services/ToastService;", "toastServiceImpl", "Lio/elevenlabs/readerapp/services/ToastServiceImpl;", "bindAudioPreviewPlayerService", "Lio/elevenlabs/domain/services/AudioPreviewService;", "player", "Lio/elevenlabs/readerapp/services/MediaAudioPreviewService;", "bindUseCaseNavigationService", "Lio/elevenlabs/domain/services/NavigationService;", "impl", "Lio/elevenlabs/readerapp/services/NavigationServiceImpl;", "bindAgentContextService", "Lio/elevenlabs/domain/services/AgentContextService;", "Lio/elevenlabs/readerapp/services/AgentContextServiceImpl;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class ServicesModule {
    public static final int $stable = 0;

    public abstract AgentContextService bindAgentContextService(AgentContextServiceImpl impl);

    public abstract AudioPreviewService bindAudioPreviewPlayerService(MediaAudioPreviewService player);

    public abstract ClipboardService bindClipboardService(AndroidClipboardService androidClipboardService);

    public abstract ConnectivityService bindConnectivityService(AndroidConnectivityService androidConnectivityService);

    public abstract ToastService bindToastService(ToastServiceImpl toastServiceImpl);

    public abstract NavigationService bindUseCaseNavigationService(NavigationServiceImpl impl);
}
