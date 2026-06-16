package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\"\u0010\u001dJ\r\u0010#\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CollectionsService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;)V", "", "collectionId", "collectionTitle", "readId", "Lsn/z;", "addReadToNewCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", DiagnosticsEntry.NAME_KEY, "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setName", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", ParameterNames.ICON, "setIcon", "(Lio/elevenlabs/domain/model/CollectionMeta$Icon;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "submit", "onDismissed", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/services/CollectionsService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/Logger;", "Lfr/k1;", "submitJob", "Lfr/k1;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CreateCollectionViewModel extends MviViewModel<CreateCollectionState> {
    private static final String TAG = "CreateCollectionVM";
    private final Analytics analytics;
    private final CollectionsService collectionsService;
    private final Logger logger;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private k1 submitJob;
    private final ToastService toastService;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCollectionViewModel(DispatcherFactory dispatcherFactory, CollectionsService collectionsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, StringProvider stringProvider, Analytics analytics, Logger logger) {
        super(new CreateCollectionState(null, null, false, null, 15, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        collectionsService.getClass();
        toastService.getClass();
        resolveErrorMessageUseCase.getClass();
        stringProvider.getClass();
        analytics.getClass();
        logger.getClass();
        this.collectionsService = collectionsService;
        this.toastService = toastService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.stringProvider = stringProvider;
        this.analytics = analytics;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addReadToNewCollection(String str, String str2, String str3, wn.c<? super sn.z> cVar) {
        CreateCollectionViewModel$addReadToNewCollection$1 createCollectionViewModel$addReadToNewCollection$1;
        int i10;
        String str4;
        String str5;
        AsyncCallResult asyncCallResult;
        String str6 = str;
        if (cVar instanceof CreateCollectionViewModel$addReadToNewCollection$1) {
            createCollectionViewModel$addReadToNewCollection$1 = (CreateCollectionViewModel$addReadToNewCollection$1) cVar;
            int i11 = createCollectionViewModel$addReadToNewCollection$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                createCollectionViewModel$addReadToNewCollection$1.label = i11 - Integer.MIN_VALUE;
                Object obj = createCollectionViewModel$addReadToNewCollection$1.result;
                i10 = createCollectionViewModel$addReadToNewCollection$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        String str7 = (String) createCollectionViewModel$addReadToNewCollection$1.L$2;
                        str5 = (String) createCollectionViewModel$addReadToNewCollection$1.L$1;
                        String str8 = (String) createCollectionViewModel$addReadToNewCollection$1.L$0;
                        sn.a.g(obj);
                        str4 = str7;
                        str6 = str8;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CollectionsService collectionsService = this.collectionsService;
                    List H = ig.f.H(str3);
                    createCollectionViewModel$addReadToNewCollection$1.L$0 = str6;
                    createCollectionViewModel$addReadToNewCollection$1.L$1 = str2;
                    str4 = str3;
                    createCollectionViewModel$addReadToNewCollection$1.L$2 = str4;
                    createCollectionViewModel$addReadToNewCollection$1.label = 1;
                    obj = collectionsService.addReadsToCollection(str6, H, createCollectionViewModel$addReadToNewCollection$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                    str5 = str2;
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    this.analytics.log(new Analytics.Event.AddToCollectionSheetCreatedCollection(str4, str6));
                    ToastService.showToast$default(this.toastService, this.stringProvider.getString(R.string.add_read_to_collection_success, str5), null, ToastService.ToastVariant.NEUTRAL, 2, null);
                } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                    Logger logger = this.logger;
                    AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
                    AsyncCallResult.AsyncCallError error2 = error.getError();
                    StringBuilder s10 = defpackage.f.s("addReadToNewCollection failed - readId=", str4, ", collectionId=", str6, ", error=");
                    s10.append(error2);
                    Logger.logWarning$default(logger, TAG, s10.toString(), null, 4, null);
                    ToastService.showToast$default(this.toastService, ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, error, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                } else {
                    c6.p();
                    return null;
                }
                return sn.z.f31622a;
            }
        }
        createCollectionViewModel$addReadToNewCollection$1 = new CreateCollectionViewModel$addReadToNewCollection$1(this, cVar);
        Object obj2 = createCollectionViewModel$addReadToNewCollection$1.result;
        i10 = createCollectionViewModel$addReadToNewCollection$1.label;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCollectionState onDismissed$lambda$0(CreateCollectionViewModel createCollectionViewModel, CreateCollectionState createCollectionState) {
        createCollectionState.getClass();
        k1 k1Var = createCollectionViewModel.submitJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        createCollectionViewModel.submitJob = null;
        return new CreateCollectionState(null, null, false, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCollectionState setIcon$lambda$0(CollectionMeta.Icon icon, CreateCollectionState createCollectionState) {
        createCollectionState.getClass();
        return CreateCollectionState.copy$default(createCollectionState, null, icon, false, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCollectionState setName$lambda$0(String str, CreateCollectionState createCollectionState) {
        createCollectionState.getClass();
        return CreateCollectionState.copy$default(createCollectionState, str, null, false, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCollectionState submit$lambda$0(CreateCollectionViewModel createCollectionViewModel, String str, CreateCollectionState createCollectionState) {
        createCollectionState.getClass();
        if (createCollectionState.isLoading() || wq.n.m0(createCollectionState.getName())) {
            return createCollectionState;
        }
        k1 k1Var = createCollectionViewModel.submitJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        createCollectionViewModel.submitJob = MviViewModel.launch$default(createCollectionViewModel, null, new CreateCollectionViewModel$submit$1$1(createCollectionViewModel, createCollectionState, str, null), 1, null);
        return CreateCollectionState.copy$default(createCollectionState, null, null, true, null, 11, null);
    }

    public final MviViewModel.StateUpdate onDismissed() {
        return queueStateUpdate(new b0(this, 6));
    }

    public final MviViewModel.StateUpdate setIcon(CollectionMeta.Icon icon) {
        icon.getClass();
        return queueStateUpdate(new m0(icon, 0));
    }

    public final MviViewModel.StateUpdate setName(String name) {
        name.getClass();
        return queueStateUpdate(new k(name, 4));
    }

    public final MviViewModel.StateUpdate submit(String readId) {
        return queueStateUpdate(new f0(this, readId, 8));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CreateCollectionViewModel$Companion;", "", "<init>", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
