package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001dJ\r\u0010#\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\u001dJ\r\u0010$\u001a\u00020\u001b¢\u0006\u0004\b$\u0010\u001dJ\r\u0010%\u001a\u00020\u001b¢\u0006\u0004\b%\u0010\u001dR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010+\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WriteViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WriteState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/readerapp/usecase/ShowImportingContentToast;", "showImportingContentToast", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Ljl/a;Lio/elevenlabs/domain/services/FileService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Ljl/a;)V", "", "value", "Lsn/z;", "onInputChanged", "(Ljava/lang/String;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "listen", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "isPodcastMode", "setPodcastMode", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onImportSurveyShown", "onSurveyCompleted", "onImportSurveyDismiss", "signalNavigatedToAddPodcastLimitReached", "Ljl/a;", "Lio/elevenlabs/domain/services/FileService;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class WriteViewModel extends MviViewModel<WriteState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final FileService fileService;
    private final Logger logger;
    private final jl.a readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a showImportingContentToast;
    private final String tag;
    private final jl.a toastService;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WriteViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, jl.a aVar2, FileService fileService, Logger logger, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar3) {
        super(new WriteState(false, null, null, null, false, false, false, 127, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        aVar.getClass();
        aVar2.getClass();
        fileService.getClass();
        logger.getClass();
        analytics.getClass();
        resolveErrorMessageUseCase.getClass();
        aVar3.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.readsService = aVar;
        this.toastService = aVar2;
        this.fileService = fileService;
        this.logger = logger;
        this.analytics = analytics;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.showImportingContentToast = aVar3;
        this.tag = "WriteViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WriteState listen$lambda$0(WriteViewModel writeViewModel, WriteState writeState) {
        writeState.getClass();
        if (writeState.isLoading()) {
            return writeState;
        }
        writeViewModel.analytics.log(new Analytics.Event.ClickedStartListening(Analytics.Event.ClickedStartListening.Type.Text, null, 2, 0 == true ? 1 : 0));
        fr.g0.D(c1.h(writeViewModel), writeViewModel.getDispatcherFactory().getIo(), null, new WriteViewModel$listen$1$1(writeViewModel, writeState, null), 2);
        return WriteState.copy$default(writeState, true, null, null, null, false, false, false, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WriteState onImportSurveyDismiss$lambda$0(WriteState writeState) {
        writeState.getClass();
        return WriteState.copy$default(writeState, false, null, null, null, false, false, false, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WriteState onImportSurveyShown$lambda$0(WriteState writeState) {
        writeState.getClass();
        return WriteState.copy$default(writeState, false, null, null, null, false, false, true, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WriteState onInputChanged$lambda$0(String str, WriteState writeState) {
        writeState.getClass();
        return WriteState.copy$default(writeState, false, str, null, null, false, false, false, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WriteState onSurveyCompleted$lambda$0(WriteState writeState) {
        writeState.getClass();
        return WriteState.copy$default(writeState, false, null, null, null, false, false, false, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WriteState setPodcastMode$lambda$0(boolean z6, WriteState writeState) {
        writeState.getClass();
        return WriteState.copy$default(writeState, false, null, null, null, z6, false, false, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WriteState signalNavigatedToAddPodcastLimitReached$lambda$0(WriteState writeState) {
        writeState.getClass();
        return WriteState.copy$default(writeState, false, null, null, null, false, false, false, 119, null);
    }

    public final MviViewModel.StateUpdate listen() {
        return queueStateUpdate(new w0(this, 1));
    }

    public final MviViewModel.StateUpdate onImportSurveyDismiss() {
        return queueStateUpdate(new e0(25));
    }

    public final MviViewModel.StateUpdate onImportSurveyShown() {
        return queueStateUpdate(new e0(24));
    }

    public final void onInputChanged(String value) {
        value.getClass();
        queueStateUpdate(new r(value, 12));
    }

    public final MviViewModel.StateUpdate onSurveyCompleted() {
        return queueStateUpdate(new e0(26));
    }

    public final MviViewModel.StateUpdate setPodcastMode(boolean isPodcastMode) {
        return queueStateUpdate(new io.elevenlabs.ocr.t(isPodcastMode, 8));
    }

    public final MviViewModel.StateUpdate signalNavigatedToAddPodcastLimitReached() {
        return queueStateUpdate(new e0(27));
    }
}
