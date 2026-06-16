package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u001c¢\u0006\u0004\b*\u0010 R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0014\u00101\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportFileViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportFileState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/readerapp/usecase/ShowImportingContentToast;", "showImportingContentToast", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "notificationPermissionService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Lio/elevenlabs/domain/Logger;Ljl/a;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Ljl/a;Lio/elevenlabs/domain/services/NotificationPermissionService;Ljl/a;Lio/elevenlabs/domain/StringProvider;)V", "", "fileUri", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onFilePicked", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "listen", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", ParameterNames.CAUSE, "Lsn/z;", "onFilePickerUnavailable", "(Ljava/lang/Throwable;)V", "", "isPodcastMode", "setPodcastMode", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "signalNavigatedToAddPodcastLimitReached", "Ljl/a;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "Lio/elevenlabs/domain/StringProvider;", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportFileViewModel extends MviViewModel<ImportFileState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final jl.a fileService;
    private final Logger logger;
    private final NotificationPermissionService notificationPermissionService;
    private final jl.a readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a showImportingContentToast;
    private final StringProvider stringProvider;
    private final String tag;
    private final jl.a toastService;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImportFileViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, Logger logger, jl.a aVar2, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar3, NotificationPermissionService notificationPermissionService, jl.a aVar4, StringProvider stringProvider) {
        super(new ImportFileState(null, false, null, null, null, false, false, 127, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        dispatcherFactory.getClass();
        aVar.getClass();
        logger.getClass();
        aVar2.getClass();
        analytics.getClass();
        resolveErrorMessageUseCase.getClass();
        aVar3.getClass();
        notificationPermissionService.getClass();
        aVar4.getClass();
        stringProvider.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.readsService = aVar;
        this.logger = logger;
        this.fileService = aVar2;
        this.analytics = analytics;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.showImportingContentToast = aVar3;
        this.notificationPermissionService = notificationPermissionService;
        this.toastService = aVar4;
        this.stringProvider = stringProvider;
        this.tag = "ImportFileViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ImportFileState listen$lambda$0(ImportFileViewModel importFileViewModel, ImportFileState importFileState) {
        importFileState.getClass();
        if (!importFileState.isLoading() && importFileState.getFile() != null) {
            importFileViewModel.analytics.log(new Analytics.Event.ClickedStartListening(Analytics.Event.ClickedStartListening.Type.File, null, 2, 0 == true ? 1 : 0));
            fr.g0.D(c1.h(importFileViewModel), importFileViewModel.getDispatcherFactory().getDefault(), null, new ImportFileViewModel$listen$1$1(importFileState, importFileViewModel, null), 2);
            return ImportFileState.copy$default(importFileState, null, true, null, null, null, false, false, 125, null);
        }
        return importFileState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportFileState onFilePicked$lambda$0(ImportFileViewModel importFileViewModel, String str, ImportFileState importFileState) {
        importFileState.getClass();
        importFileViewModel.listen();
        return ImportFileState.copy$default(importFileState, new SelectedFile(str, ((FileService) importFileViewModel.fileService.get()).loadFileFromContentResolver(str).getFileName()), false, null, null, null, false, false, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportFileState onFilePickerUnavailable$lambda$0(ImportFileState importFileState) {
        importFileState.getClass();
        return ImportFileState.copy$default(importFileState, null, false, null, null, null, true, false, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportFileState setPodcastMode$lambda$0(boolean z6, ImportFileState importFileState) {
        importFileState.getClass();
        return ImportFileState.copy$default(importFileState, null, false, null, null, null, false, z6, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportFileState signalNavigatedToAddPodcastLimitReached$lambda$0(ImportFileState importFileState) {
        importFileState.getClass();
        return ImportFileState.copy$default(importFileState, null, false, null, null, null, false, false, 111, null);
    }

    public final MviViewModel.StateUpdate listen() {
        return queueStateUpdate(new y(this, 1));
    }

    public final MviViewModel.StateUpdate onFilePicked(String fileUri) {
        fileUri.getClass();
        return queueStateUpdate(new h(this, fileUri, 5));
    }

    public final void onFilePickerUnavailable(Throwable cause) {
        cause.getClass();
        this.logger.logWarning(this.tag, "No file manager app available on device", cause);
        Object obj = this.toastService.get();
        obj.getClass();
        ToastService.showToast$default((ToastService) obj, this.stringProvider.invoke(R.string.import_file_no_file_manager_error), null, ToastService.ToastVariant.ERROR, 2, null);
        queueStateUpdate(new j(23));
    }

    public final MviViewModel.StateUpdate setPodcastMode(boolean isPodcastMode) {
        return queueStateUpdate(new io.elevenlabs.ocr.t(isPodcastMode, 6));
    }

    public final MviViewModel.StateUpdate signalNavigatedToAddPodcastLimitReached() {
        return queueStateUpdate(new j(24));
    }
}
