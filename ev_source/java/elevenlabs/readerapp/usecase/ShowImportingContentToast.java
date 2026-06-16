package io.elevenlabs.readerapp.usecase;

import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/usecase/ShowImportingContentToast;", "", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "<init>", "(Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;)V", "", "isPodcastMode", "Lio/elevenlabs/domain/model/ReadMeta;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lsn/z;", "invoke", "(ZLio/elevenlabs/domain/model/ReadMeta;)V", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ShowImportingContentToast {
    public static final int $stable = 8;
    private final StringProvider stringProvider;
    private final ToastService toastService;

    public ShowImportingContentToast(ToastService toastService, StringProvider stringProvider) {
        toastService.getClass();
        stringProvider.getClass();
        this.toastService = toastService;
        this.stringProvider = stringProvider;
    }

    public final void invoke(boolean isPodcastMode, ReadMeta data) {
        data.getClass();
        if (!isPodcastMode && data.getCreationStatus() != ReadCreationStatus.Finished) {
            this.toastService.showToast(new ToastService.Toast.Action(this.stringProvider.invoke(R.string.user_read_importing_toast_title), this.stringProvider.invoke(R.string.user_read_importing_toast_subtitle), null, 4, null));
        }
    }
}
