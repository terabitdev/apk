package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.theme.ReaderColors;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0017\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DownloadActionHelper;", "", "", "downloadText", "cancelDownloadText", "removeDownloadText", "Lio/elevenlabs/domain/model/OfflineReadData;", "offlineReadData", "", "isReadPaid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/OfflineReadData;Z)V", "Lsn/k;", "Lio/elevenlabs/ui/components/ActionConfig;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DownloadAction;", "getCurrentAction", "()Lsn/k;", "Lio/elevenlabs/ui/components/ActionSpecBuilder$HandlerScope;", "Lio/elevenlabs/ui/components/ActionSpecBuilder;", "handlerScope", "Lkotlin/Function1;", "Lsn/z;", "onAction", "addHandlers", "(Lio/elevenlabs/ui/components/ActionSpecBuilder$HandlerScope;Lho/l;)V", "", "getDownloadActions", "()Ljava/util/List;", "Lio/elevenlabs/domain/model/OfflineReadData;", "Z", "actionDownload", "Lio/elevenlabs/ui/components/ActionConfig;", "actionCancelDownload", "actionRemoveDownload", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DownloadActionHelper {
    public static final int $stable = 8;
    private final ActionConfig actionCancelDownload;
    private final ActionConfig actionDownload;
    private final ActionConfig actionRemoveDownload;
    private final boolean isReadPaid;
    private final OfflineReadData offlineReadData;

    public DownloadActionHelper(String str, String str2, String str3, OfflineReadData offlineReadData, boolean z6) {
        ib.i.s(str, str2, str3);
        this.offlineReadData = offlineReadData;
        this.isReadPaid = z6;
        int i10 = R.drawable.download;
        ReaderColors readerColors = ReaderColors.INSTANCE;
        this.actionDownload = new ActionConfig(i10, str, readerColors.m2372getBlue5000d7_KjU(), false, false, 24, null);
        this.actionCancelDownload = new ActionConfig(R.drawable.close, str2, readerColors.m2425getOrange4000d7_KjU(), false, false, 24, null);
        this.actionRemoveDownload = new ActionConfig(R.drawable.close, str3, readerColors.m2449getRed5000d7_KjU(), false, false, 24, null);
    }

    public static final sn.z addHandlers$lambda$0$0(ho.l lVar, DownloadAction downloadAction) {
        lVar.invoke(downloadAction);
        return sn.z.f31622a;
    }

    private final sn.k getCurrentAction() {
        OfflineReadData offlineReadData = this.offlineReadData;
        if (offlineReadData == null) {
            return new sn.k(this.actionDownload, DownloadAction.START_DOWNLOAD);
        }
        if (offlineReadData.getStatus() == OfflineReadStatus.EXPIRED) {
            return new sn.k(this.actionDownload, DownloadAction.START_DOWNLOAD);
        }
        if (this.offlineReadData.getStatus() == OfflineReadStatus.READY) {
            return new sn.k(this.actionRemoveDownload, DownloadAction.REMOVE_DOWNLOAD);
        }
        return new sn.k(this.actionCancelDownload, DownloadAction.CANCEL_DOWNLOAD);
    }

    public final void addHandlers(ActionSpecBuilder.HandlerScope handlerScope, ho.l onAction) {
        handlerScope.getClass();
        onAction.getClass();
        sn.k currentAction = getCurrentAction();
        if (currentAction == null) {
            return;
        }
        handlerScope.handledBy((ActionConfig) currentAction.f31600a, new n(onAction, (DownloadAction) currentAction.f31601b, 1));
    }

    public final List<ActionConfig> getDownloadActions() {
        sn.k currentAction = getCurrentAction();
        if (currentAction == null) {
            return tn.t.f33547a;
        }
        return ig.f.H(currentAction.f31600a);
    }
}
