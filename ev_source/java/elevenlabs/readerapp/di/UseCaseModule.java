package io.elevenlabs.readerapp.di;

import io.elevenlabs.domain.usecase.DevicePerformanceMeasurer;
import io.elevenlabs.domain.usecase.DownloadReadUseCase;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.usecase.DevicePerformanceMeasurerImpl;
import io.elevenlabs.readerapp.usecase.DownloadReadUseCaseImpl;
import io.elevenlabs.readerapp.usecase.GetCurrentTimeUseCaseImpl;
import io.elevenlabs.readerapp.usecase.PlayPronunciationPreviewUseCaseImpl;
import io.elevenlabs.readerapp.usecase.ResolveErrorMessageUseCaseImpl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H'¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/di/UseCaseModule;", "", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/readerapp/usecase/ResolveErrorMessageUseCaseImpl;", "getCurrentTimeUseCase", "Lio/elevenlabs/domain/usecase/GetCurrentTimeUseCase;", "getCurrentTimeUseCaseImpl", "Lio/elevenlabs/readerapp/usecase/GetCurrentTimeUseCaseImpl;", "getDownloadReadUseCase", "Lio/elevenlabs/domain/usecase/DownloadReadUseCase;", "downloadReadUseCaseImpl", "Lio/elevenlabs/readerapp/usecase/DownloadReadUseCaseImpl;", "getPlayPronunciationPreviewUseCase", "Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;", "playPronunciationPreviewUseCaseImpl", "Lio/elevenlabs/readerapp/usecase/PlayPronunciationPreviewUseCaseImpl;", "bindDevicePerformanceMeasurer", "Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;", "impl", "Lio/elevenlabs/readerapp/usecase/DevicePerformanceMeasurerImpl;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface UseCaseModule {
    DevicePerformanceMeasurer bindDevicePerformanceMeasurer(DevicePerformanceMeasurerImpl impl);

    GetCurrentTimeUseCase getCurrentTimeUseCase(GetCurrentTimeUseCaseImpl getCurrentTimeUseCaseImpl);

    DownloadReadUseCase getDownloadReadUseCase(DownloadReadUseCaseImpl downloadReadUseCaseImpl);

    PlayPronunciationPreviewUseCase getPlayPronunciationPreviewUseCase(PlayPronunciationPreviewUseCaseImpl playPronunciationPreviewUseCaseImpl);

    ResolveErrorMessageUseCase resolveErrorMessageUseCase(ResolveErrorMessageUseCaseImpl resolveErrorMessageUseCase);
}
