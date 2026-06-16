package io.elevenlabs.ocr;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u001b\u0010%\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u001a¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001a¢\u0006\u0004\b1\u00100J\r\u00102\u001a\u00020\u001a¢\u0006\u0004\b2\u00100J\u0015\u00104\u001a\u00020\u001a2\u0006\u00103\u001a\u00020'¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u0018¢\u0006\u0004\b7\u0010\u001cJ\u001b\u00109\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002080\"¢\u0006\u0004\b9\u0010&J\r\u0010:\u001a\u00020\u001a¢\u0006\u0004\b:\u00100R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010;R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010BR\u0014\u0010C\u001a\u0002088\u0002X\u0082D¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lio/elevenlabs/ocr/OcrImportViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/ocr/OcrImportState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/ocr/usecase/RecognizeDocumentTextUseCase;", "recognizeDocumentTextUseCase", "Landroid/content/Context;", "context", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/FileService;Ljl/a;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Ljl/a;Landroid/content/Context;)V", "", "granted", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onPermissionStatusChanged", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", ParameterNames.CAUSE, "Lsn/z;", "onCameraBindError", "(Ljava/lang/Throwable;)V", "", "Landroid/net/Uri;", "uris", "onPicturesSaved", "(Ljava/util/List;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", Constants.MessagePayloadKeys.FROM, "to", "onImageSwap", "(II)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "item", "onPictureClick", "(Landroid/net/Uri;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onPictureClose", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "listen", "onPictureRemove", FirebaseAnalytics.Param.INDEX, "onDragStarted", "(I)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "isPodcastMode", "setPodcastMode", "", "setInitialImages", "signalNavigatedToAddPodcastLimitReached", "Ljl/a;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/FileService;", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Landroid/content/Context;", ParameterNames.TAG, "Ljava/lang/String;", "ocr_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OcrImportViewModel extends MviViewModel<OcrImportState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final Context context;
    private final FileService fileService;
    private final Logger logger;
    private final jl.a readsService;
    private final jl.a recognizeDocumentTextUseCase;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final String tag;
    private final jl.a toastService;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OcrImportViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, Analytics analytics, FileService fileService, jl.a aVar2, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar3, Context context) {
        super(new OcrImportState(null, null, null, false, null, null, false, 127, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        dispatcherFactory.getClass();
        aVar.getClass();
        analytics.getClass();
        fileService.getClass();
        aVar2.getClass();
        logger.getClass();
        resolveErrorMessageUseCase.getClass();
        aVar3.getClass();
        context.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.readsService = aVar;
        this.analytics = analytics;
        this.fileService = fileService;
        this.toastService = aVar2;
        this.logger = logger;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.recognizeDocumentTextUseCase = aVar3;
        this.context = context;
        this.tag = "OcrImportViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final OcrImportState listen$lambda$0(OcrImportViewModel ocrImportViewModel, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        if (!ocrImportState.isLoading() && !ocrImportState.getImages().isEmpty()) {
            ocrImportViewModel.analytics.log(new Analytics.Event.ClickedStartListening(Analytics.Event.ClickedStartListening.Type.OCR, null, 2, 0 == true ? 1 : 0));
            g0.D(c1.h(ocrImportViewModel), ocrImportViewModel.getDispatcherFactory().getDefault(), null, new OcrImportViewModel$listen$1$1(ocrImportState, ocrImportViewModel, null), 2);
            return OcrImportState.copy$default(ocrImportState, null, null, null, true, null, null, false, 119, null);
        }
        return ocrImportState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState onDragStarted$lambda$0(OcrImportViewModel ocrImportViewModel, int i10, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        ocrImportViewModel.logger.verbose(ocrImportViewModel.tag, new u(i10, 0));
        return OcrImportState.copy$default(ocrImportState, null, null, (Uri) tn.o.z0(i10, ocrImportState.getImages()), false, null, null, false, 123, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState onImageSwap$lambda$0(OcrImportViewModel ocrImportViewModel, final int i10, final int i11, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        ocrImportViewModel.logger.verbose(ocrImportViewModel.tag, new ho.a() { // from class: io.elevenlabs.ocr.v
            @Override // ho.a
            public final Object invoke() {
                String j4;
                j4 = android.gov.nist.javax.sip.header.a.j(i10, "onImageSwap ", " -> ", i11);
                return j4;
            }
        });
        if (i10 < 0 || i11 < 0 || i10 >= ocrImportState.getImages().size() || i11 >= ocrImportState.getImages().size()) {
            return ocrImportState;
        }
        ArrayList i12 = tn.o.i1(ocrImportState.getImages());
        Uri uri = (Uri) i12.get(i10);
        i12.set(i10, i12.get(i11));
        i12.set(i11, uri);
        return OcrImportState.copy$default(ocrImportState, null, tn.o.g1(i12), null, false, null, null, false, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState onPermissionStatusChanged$lambda$0(boolean z6, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        return OcrImportState.copy$default(ocrImportState, Boolean.valueOf(z6), null, null, false, null, null, false, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState onPictureClick$lambda$0(Uri uri, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        if (kotlin.jvm.internal.m.c(uri, ocrImportState.getSelectedImage())) {
            return OcrImportState.copy$default(ocrImportState, null, null, null, false, null, null, false, 123, null);
        }
        return OcrImportState.copy$default(ocrImportState, null, null, uri, false, null, null, false, 123, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState onPictureClose$lambda$0(OcrImportState ocrImportState) {
        ocrImportState.getClass();
        return OcrImportState.copy$default(ocrImportState, null, null, null, false, null, null, false, 123, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState onPictureRemove$lambda$0(OcrImportState ocrImportState) {
        ocrImportState.getClass();
        List<Uri> images = ocrImportState.getImages();
        ArrayList arrayList = new ArrayList();
        for (Object obj : images) {
            if (!kotlin.jvm.internal.m.c((Uri) obj, ocrImportState.getSelectedImage())) {
                arrayList.add(obj);
            }
        }
        return OcrImportState.copy$default(ocrImportState, null, arrayList, null, false, null, null, false, 121, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState onPicturesSaved$lambda$0(List list, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        return OcrImportState.copy$default(ocrImportState, null, tn.o.g1(tn.o.k1(tn.o.O0(list, ocrImportState.getImages()))), null, false, null, null, false, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState setInitialImages$lambda$0(List list, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        ArrayList arrayList = new ArrayList(tn.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse((String) it.next()));
        }
        return OcrImportState.copy$default(ocrImportState, null, arrayList, null, false, null, null, false, 125, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState setPodcastMode$lambda$0(boolean z6, OcrImportState ocrImportState) {
        ocrImportState.getClass();
        return OcrImportState.copy$default(ocrImportState, null, null, null, false, null, null, z6, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OcrImportState signalNavigatedToAddPodcastLimitReached$lambda$0(OcrImportState ocrImportState) {
        ocrImportState.getClass();
        return OcrImportState.copy$default(ocrImportState, null, null, null, false, null, null, false, 95, null);
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final MviViewModel.StateUpdate listen() {
        return queueStateUpdate(new n(1, this));
    }

    public final void onCameraBindError(Throwable cause) {
        cause.getClass();
        this.logger.logError(this.tag, "CameraX bindToLifecycle failed", cause);
    }

    public final MviViewModel.StateUpdate onDragStarted(int index) {
        return queueStateUpdate(new g3.q(this, index, 1));
    }

    public final MviViewModel.StateUpdate onImageSwap(int from, int to2) {
        return queueStateUpdate(new w(this, from, to2, 0));
    }

    public final MviViewModel.StateUpdate onPermissionStatusChanged(boolean granted) {
        return queueStateUpdate(new t(granted, 1));
    }

    public final MviViewModel.StateUpdate onPictureClick(Uri item) {
        item.getClass();
        return queueStateUpdate(new m(item, 2));
    }

    public final MviViewModel.StateUpdate onPictureClose() {
        return queueStateUpdate(new x(17));
    }

    public final MviViewModel.StateUpdate onPictureRemove() {
        return queueStateUpdate(new x(16));
    }

    public final MviViewModel.StateUpdate onPicturesSaved(List<? extends Uri> uris) {
        uris.getClass();
        return queueStateUpdate(new k(uris, 2));
    }

    public final MviViewModel.StateUpdate setInitialImages(List<String> uris) {
        uris.getClass();
        return queueStateUpdate(new k(uris, 1));
    }

    public final MviViewModel.StateUpdate setPodcastMode(boolean isPodcastMode) {
        return queueStateUpdate(new t(isPodcastMode, 0));
    }

    public final MviViewModel.StateUpdate signalNavigatedToAddPodcastLimitReached() {
        return queueStateUpdate(new x(18));
    }
}
