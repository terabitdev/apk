package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.core.extensions.StringExtensionsKt;
import java.net.URL;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0016¢\u0006\u0004\b%\u0010\u001aJ\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0018¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020\u0018¢\u0006\u0004\b)\u0010'J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0018¢\u0006\u0004\b.\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0014\u00104\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/readerapp/usecase/ShowImportingContentToast;", "showImportingContentToast", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Ljl/a;Lio/elevenlabs/domain/services/FileService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Ljl/a;)V", "", "url", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onPageLoaded", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "code", "description", "Lsn/z;", "onPageLoadError", "(ILjava/lang/String;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onParsingError", "(Ljava/lang/String;)V", "html", "onParsingCompleted", "reload", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onListenClick", "onProcessTriggered", "", "isPodcastMode", "setPodcastMode", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "signalNavigatedToAddPodcastLimitReached", "Ljl/a;", "Lio/elevenlabs/domain/services/FileService;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportLinkViewModel extends MviViewModel<ImportLinkState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final FileService fileService;
    private final Logger logger;
    private final jl.a readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a showImportingContentToast;
    private final jl.a stringProvider;
    private final String tag;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImportLinkViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, jl.a aVar2, FileService fileService, Logger logger, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar3) {
        super(new ImportLinkState(false, null, null, null, null, false, false, false, 255, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
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
        this.stringProvider = aVar2;
        this.fileService = fileService;
        this.logger = logger;
        this.analytics = analytics;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.showImportingContentToast = aVar3;
        this.tag = "ImportLinkViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState onListenClick$lambda$0(ImportLinkViewModel importLinkViewModel, ImportLinkState importLinkState) {
        String str;
        importLinkState.getClass();
        if (importLinkState.getUrl() != null && !importLinkState.isLoading()) {
            Analytics analytics = importLinkViewModel.analytics;
            Analytics.Event.ClickedStartListening.Type type = Analytics.Event.ClickedStartListening.Type.Website;
            URL url = StringExtensionsKt.toUrl(importLinkState.getUrl());
            if (url != null) {
                str = url.getHost();
            } else {
                str = null;
            }
            analytics.log(new Analytics.Event.ClickedStartListening(type, str));
            return ImportLinkState.copy$default(importLinkState, false, null, null, null, null, false, true, false, 191, null);
        }
        return importLinkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState onPageLoadError$lambda$0(ImportLinkViewModel importLinkViewModel, int i10, ImportLinkState importLinkState) {
        importLinkState.getClass();
        return ImportLinkState.copy$default(importLinkState, false, null, null, null, ((StringProvider) importLinkViewModel.stringProvider.get()).getString(i10), false, false, false, 238, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState onPageLoaded$lambda$0(String str, ImportLinkState importLinkState) {
        importLinkState.getClass();
        return ImportLinkState.copy$default(importLinkState, false, str, null, null, "", false, false, false, 204, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState onParsingCompleted$lambda$0(ImportLinkViewModel importLinkViewModel, String str, ImportLinkState importLinkState) {
        importLinkState.getClass();
        if (importLinkState.isLoading()) {
            return importLinkState;
        }
        fr.g0.D(c1.h(importLinkViewModel), importLinkViewModel.getDispatcherFactory().getDefault(), null, new ImportLinkViewModel$onParsingCompleted$1$1(importLinkViewModel, str, importLinkState, null), 2);
        return ImportLinkState.copy$default(importLinkState, true, null, null, null, null, false, false, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState onParsingError$lambda$0(ImportLinkViewModel importLinkViewModel, ImportLinkState importLinkState) {
        importLinkState.getClass();
        return ImportLinkState.copy$default(importLinkState, false, null, null, null, ((StringProvider) importLinkViewModel.stringProvider.get()).getString(R.string.import_link_error_saving), false, false, false, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState onProcessTriggered$lambda$0(ImportLinkState importLinkState) {
        importLinkState.getClass();
        return ImportLinkState.copy$default(importLinkState, false, null, null, null, null, false, false, false, 191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState reload$lambda$0(ImportLinkState importLinkState) {
        importLinkState.getClass();
        return ImportLinkState.copy$default(importLinkState, true, null, null, null, null, true, false, false, 222, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState setPodcastMode$lambda$0(boolean z6, ImportLinkState importLinkState) {
        importLinkState.getClass();
        return ImportLinkState.copy$default(importLinkState, false, null, null, null, null, false, false, z6, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImportLinkState signalNavigatedToAddPodcastLimitReached$lambda$0(ImportLinkState importLinkState) {
        importLinkState.getClass();
        return ImportLinkState.copy$default(importLinkState, false, null, null, null, null, false, false, false, 247, null);
    }

    public final MviViewModel.StateUpdate onListenClick() {
        return queueStateUpdate(new d0(this, 3));
    }

    public final void onPageLoadError(int code, String description) {
        int i10;
        description.getClass();
        this.logger.log(this.tag, p.n.h(code, "onPageLoadError: ", " / ", description));
        switch (code) {
            case -14:
                i10 = R.string.import_link_error_loading_file_not_found;
                break;
            case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                i10 = R.string.import_link_error_loading_generic_file_error;
                break;
            case -12:
            case -8:
            case -7:
            case -6:
            case -2:
                i10 = R.string.import_link_error_loading_host_lookup;
                break;
            case IntegrityErrorCode.NONCE_TOO_LONG /* -11 */:
                i10 = R.string.import_link_error_loading_ssl_handshake;
                break;
            case IntegrityErrorCode.NONCE_TOO_SHORT /* -10 */:
                i10 = R.string.import_link_error_loading_unsupported_scheme;
                break;
            case -9:
                i10 = R.string.import_link_error_loading_too_many_redirects;
                break;
            case -5:
                i10 = R.string.import_link_error_loading_proxy_auth;
                break;
            case IntegrityErrorCode.PLAY_STORE_ACCOUNT_NOT_FOUND /* -4 */:
                i10 = R.string.import_link_error_auth;
                break;
            case -3:
                i10 = R.string.import_link_error_loading_unsupported_authentication_scheme;
                break;
            default:
                i10 = R.string.import_link_error_loading_unknown;
                break;
        }
        queueStateUpdate(new g3.q(this, i10, 3));
    }

    public final MviViewModel.StateUpdate onPageLoaded(String url) {
        url.getClass();
        return queueStateUpdate(new r(url, 7));
    }

    public final MviViewModel.StateUpdate onParsingCompleted(String html) {
        html.getClass();
        return queueStateUpdate(new h(this, html, 6));
    }

    public final void onParsingError(String error) {
        error.getClass();
        Logger.logWarning$default(this.logger, this.tag, "onParsingError: ".concat(error), null, 4, null);
        queueStateUpdate(new d0(this, 2));
    }

    public final MviViewModel.StateUpdate onProcessTriggered() {
        return queueStateUpdate(new e0(3));
    }

    public final MviViewModel.StateUpdate reload() {
        return queueStateUpdate(new e0(5));
    }

    public final MviViewModel.StateUpdate setPodcastMode(boolean isPodcastMode) {
        return queueStateUpdate(new io.elevenlabs.ocr.t(isPodcastMode, 7));
    }

    public final MviViewModel.StateUpdate signalNavigatedToAddPodcastLimitReached() {
        return queueStateUpdate(new e0(4));
    }
}
