package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/EditCollectionViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/EditCollectionState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CollectionsService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ToastService;)V", "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", ParameterNames.ICON, "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setIcon", "(Lio/elevenlabs/domain/model/CollectionMeta$Icon;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", DiagnosticsEntry.NAME_KEY, "setName", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "submit", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onNavigatedBack", "collectionId", "Lsn/z;", "setCollectionId", "(Ljava/lang/String;)V", "Lio/elevenlabs/domain/services/CollectionsService;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ToastService;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EditCollectionViewModel extends MviViewModel<EditCollectionState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final CollectionsService collectionsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final ToastService toastService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCollectionViewModel(DispatcherFactory dispatcherFactory, CollectionsService collectionsService, Analytics analytics, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService) {
        super(new EditCollectionState(null, null, null, false, false, 31, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        collectionsService.getClass();
        analytics.getClass();
        logger.getClass();
        resolveErrorMessageUseCase.getClass();
        toastService.getClass();
        this.collectionsService = collectionsService;
        this.analytics = analytics;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.toastService = toastService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCollectionState onNavigatedBack$lambda$0(EditCollectionState editCollectionState) {
        editCollectionState.getClass();
        return EditCollectionState.copy$default(editCollectionState, null, null, null, false, false, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCollectionState setIcon$lambda$0(CollectionMeta.Icon icon, EditCollectionState editCollectionState) {
        editCollectionState.getClass();
        return EditCollectionState.copy$default(editCollectionState, null, icon, null, false, false, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCollectionState setName$lambda$0(String str, EditCollectionState editCollectionState) {
        editCollectionState.getClass();
        return EditCollectionState.copy$default(editCollectionState, null, null, str, false, false, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCollectionState submit$lambda$0(EditCollectionViewModel editCollectionViewModel, EditCollectionState editCollectionState) {
        editCollectionState.getClass();
        if (editCollectionState.isLoading() || editCollectionState.getCollectionId() == null) {
            return editCollectionState;
        }
        fr.g0.D(c1.h(editCollectionViewModel), editCollectionViewModel.getDispatcherFactory().getDefault(), null, new EditCollectionViewModel$submit$1$1(editCollectionViewModel, editCollectionState, null), 2);
        return EditCollectionState.copy$default(editCollectionState, null, null, null, true, false, 23, null);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final MviViewModel.StateUpdate onNavigatedBack() {
        return queueStateUpdate(new y(14));
    }

    public final void setCollectionId(String collectionId) {
        collectionId.getClass();
        fr.g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new EditCollectionViewModel$setCollectionId$1(this, collectionId, null), 2);
    }

    public final MviViewModel.StateUpdate setIcon(CollectionMeta.Icon icon) {
        icon.getClass();
        return queueStateUpdate(new m0(icon, 2));
    }

    public final MviViewModel.StateUpdate setName(String name) {
        name.getClass();
        return queueStateUpdate(new k(name, 6));
    }

    public final MviViewModel.StateUpdate submit() {
        return queueStateUpdate(new o0(this, 1));
    }
}
