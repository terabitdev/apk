package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.CollectionMetaKt;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020'¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CollectionsService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/model/CollectionMeta;", "collection", "", "resolveTitle", "(Lio/elevenlabs/domain/model/CollectionMeta;)Ljava/lang/String;", "readId", "collectionId", "collectionTitle", "", "wasAdded", "Lsn/z;", "performToggle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "message", "Lio/elevenlabs/domain/services/ToastService$ToastVariant;", "variant", "showToggleToast", "(Ljava/lang/String;Lio/elevenlabs/domain/services/ToastService$ToastVariant;)V", "fetchAddedCollections", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setReadId", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onSheetDismissed", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onCreateNewCollectionClick", "()V", "toggle", "Lio/elevenlabs/domain/services/CollectionsService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/ToastService$Toast;", "lastToggleToast", "Lio/elevenlabs/domain/services/ToastService$Toast;", "Lfr/k1;", "membershipJob", "Lfr/k1;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AddReadToCollectionViewModel extends MviViewModel<AddReadToCollectionState> {
    private static final String TAG = "AddReadToCollectionVM";
    private final Analytics analytics;
    private final CollectionsService collectionsService;
    private ToastService.Toast lastToggleToast;
    private final Logger logger;
    private k1 membershipJob;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$1", f = "AddReadToCollectionScreen.kt", l = {214}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$1$1", f = "AddReadToCollectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/SyncStatus;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/SyncStatus;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00341 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AddReadToCollectionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00341(AddReadToCollectionViewModel addReadToCollectionViewModel, wn.c<? super C00341> cVar) {
                super(2, cVar);
                this.this$0 = addReadToCollectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AddReadToCollectionState invokeSuspend$lambda$0(SyncStatus syncStatus, AddReadToCollectionState addReadToCollectionState) {
                return AddReadToCollectionState.copy$default(addReadToCollectionState, null, syncStatus, null, null, false, 29, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                C00341 c00341 = new C00341(this.this$0, cVar);
                c00341.L$0 = obj;
                return c00341;
            }

            @Override // ho.p
            public final Object invoke(SyncStatus syncStatus, wn.c<? super sn.z> cVar) {
                return ((C00341) create(syncStatus, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                SyncStatus syncStatus = (SyncStatus) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new g(syncStatus, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                ir.i sync = AddReadToCollectionViewModel.this.collectionsService.sync();
                C00341 c00341 = new C00341(AddReadToCollectionViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(sync, c00341, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$2", f = "AddReadToCollectionScreen.kt", l = {219, 219}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$2$1", f = "AddReadToCollectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/CollectionMeta;", "all", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AddReadToCollectionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AddReadToCollectionViewModel addReadToCollectionViewModel, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = addReadToCollectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AddReadToCollectionState invokeSuspend$lambda$0(List list, AddReadToCollectionState addReadToCollectionState) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((CollectionMeta) obj).isOwner()) {
                        arrayList.add(obj);
                    }
                }
                return AddReadToCollectionState.copy$default(addReadToCollectionState, null, null, arrayList, null, false, 27, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // ho.p
            public final Object invoke(List<CollectionMeta> list, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass1) create(list, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new h(list, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (ir.r.l((ir.i) r6, r0, r5) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            if (r6 == r3) goto L15;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            xn.a aVar = xn.a.f37986a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                CollectionsService collectionsService = AddReadToCollectionViewModel.this.collectionsService;
                this.label = 1;
                obj = collectionsService.getCollections(this);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(AddReadToCollectionViewModel.this, null);
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReadToCollectionViewModel(DispatcherFactory dispatcherFactory, CollectionsService collectionsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, StringProvider stringProvider, Analytics analytics, Logger logger) {
        super(new AddReadToCollectionState(null, null, null, null, false, 31, null), dispatcherFactory, logger);
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
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAddedCollections(String str, wn.c<? super sn.z> cVar) {
        AddReadToCollectionViewModel$fetchAddedCollections$1 addReadToCollectionViewModel$fetchAddedCollections$1;
        int i10;
        AsyncCallResult asyncCallResult;
        if (cVar instanceof AddReadToCollectionViewModel$fetchAddedCollections$1) {
            addReadToCollectionViewModel$fetchAddedCollections$1 = (AddReadToCollectionViewModel$fetchAddedCollections$1) cVar;
            int i11 = addReadToCollectionViewModel$fetchAddedCollections$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                addReadToCollectionViewModel$fetchAddedCollections$1.label = i11 - Integer.MIN_VALUE;
                Object obj = addReadToCollectionViewModel$fetchAddedCollections$1.result;
                i10 = addReadToCollectionViewModel$fetchAddedCollections$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = (String) addReadToCollectionViewModel$fetchAddedCollections$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    CollectionsService collectionsService = this.collectionsService;
                    addReadToCollectionViewModel$fetchAddedCollections$1.L$0 = str;
                    addReadToCollectionViewModel$fetchAddedCollections$1.label = 1;
                    obj = collectionsService.getCollectionsContainingRead(str, addReadToCollectionViewModel$fetchAddedCollections$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    queueStateUpdate(new e0((AsyncCallResult.Success) asyncCallResult, 1));
                } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                    AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
                    Logger.logWarning$default(this.logger, TAG, "fetchAddedCollections failed - readId=" + str + ", error=" + error.getError(), null, 4, null);
                    showToggleToast(ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, error, null, 2, null), ToastService.ToastVariant.ERROR);
                    queueStateUpdate(new o(13));
                } else {
                    c6.p();
                    return null;
                }
                return sn.z.f31622a;
            }
        }
        addReadToCollectionViewModel$fetchAddedCollections$1 = new AddReadToCollectionViewModel$fetchAddedCollections$1(this, cVar);
        Object obj2 = addReadToCollectionViewModel$fetchAddedCollections$1.result;
        i10 = addReadToCollectionViewModel$fetchAddedCollections$1.label;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj2;
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadToCollectionState fetchAddedCollections$lambda$0(AsyncCallResult asyncCallResult, AddReadToCollectionState addReadToCollectionState) {
        addReadToCollectionState.getClass();
        return AddReadToCollectionState.copy$default(addReadToCollectionState, null, null, null, tn.o.l1((Iterable) ((AsyncCallResult.Success) asyncCallResult).getData()), false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadToCollectionState fetchAddedCollections$lambda$1(AddReadToCollectionState addReadToCollectionState) {
        addReadToCollectionState.getClass();
        return AddReadToCollectionState.copy$default(addReadToCollectionState, null, null, null, null, true, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadToCollectionState onSheetDismissed$lambda$0(AddReadToCollectionViewModel addReadToCollectionViewModel, AddReadToCollectionState addReadToCollectionState) {
        addReadToCollectionState.getClass();
        k1 k1Var = addReadToCollectionViewModel.membershipJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        addReadToCollectionViewModel.membershipJob = null;
        return AddReadToCollectionState.copy$default(addReadToCollectionState, null, null, null, null, false, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r14 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r14 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performToggle(String str, String str2, String str3, boolean z6, wn.c<? super sn.z> cVar) {
        AddReadToCollectionViewModel$performToggle$1 addReadToCollectionViewModel$performToggle$1;
        int i10;
        AsyncCallResult asyncCallResult;
        int i11;
        if (cVar instanceof AddReadToCollectionViewModel$performToggle$1) {
            addReadToCollectionViewModel$performToggle$1 = (AddReadToCollectionViewModel$performToggle$1) cVar;
            int i12 = addReadToCollectionViewModel$performToggle$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                addReadToCollectionViewModel$performToggle$1.label = i12 - Integer.MIN_VALUE;
                Object obj = addReadToCollectionViewModel$performToggle$1.result;
                i10 = addReadToCollectionViewModel$performToggle$1.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            z6 = addReadToCollectionViewModel$performToggle$1.Z$0;
                            str3 = (String) addReadToCollectionViewModel$performToggle$1.L$2;
                            str2 = (String) addReadToCollectionViewModel$performToggle$1.L$1;
                            str = (String) addReadToCollectionViewModel$performToggle$1.L$0;
                            sn.a.g(obj);
                            asyncCallResult = (AsyncCallResult) obj;
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        z6 = addReadToCollectionViewModel$performToggle$1.Z$0;
                        str3 = (String) addReadToCollectionViewModel$performToggle$1.L$2;
                        str2 = (String) addReadToCollectionViewModel$performToggle$1.L$1;
                        str = (String) addReadToCollectionViewModel$performToggle$1.L$0;
                        sn.a.g(obj);
                        asyncCallResult = (AsyncCallResult) obj;
                    }
                } else {
                    sn.a.g(obj);
                    CollectionsService collectionsService = this.collectionsService;
                    xn.a aVar = xn.a.f37986a;
                    if (z6) {
                        addReadToCollectionViewModel$performToggle$1.L$0 = str;
                        addReadToCollectionViewModel$performToggle$1.L$1 = str2;
                        addReadToCollectionViewModel$performToggle$1.L$2 = str3;
                        addReadToCollectionViewModel$performToggle$1.Z$0 = z6;
                        addReadToCollectionViewModel$performToggle$1.label = 1;
                        obj = collectionsService.removeReadFromCollection(str2, str, addReadToCollectionViewModel$performToggle$1);
                    } else {
                        List H = ig.f.H(str);
                        addReadToCollectionViewModel$performToggle$1.L$0 = str;
                        addReadToCollectionViewModel$performToggle$1.L$1 = str2;
                        addReadToCollectionViewModel$performToggle$1.L$2 = str3;
                        addReadToCollectionViewModel$performToggle$1.Z$0 = z6;
                        addReadToCollectionViewModel$performToggle$1.label = 2;
                        obj = collectionsService.addReadsToCollection(str2, H, addReadToCollectionViewModel$performToggle$1);
                    }
                    return aVar;
                }
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    Logger logger = this.logger;
                    boolean z10 = !z6;
                    StringBuilder s10 = defpackage.f.s("toggle ok - readId=", str, ", collectionId=", str2, ", added=");
                    s10.append(z10);
                    logger.log(TAG, s10.toString());
                    this.analytics.log(new Analytics.Event.AddToCollectionSheetToggledRead(str, str2, z10));
                    if (str3 != null) {
                        if (z6) {
                            i11 = R.string.add_read_to_collection_removed;
                        } else {
                            i11 = R.string.add_read_to_collection_success;
                        }
                        showToggleToast(this.stringProvider.getString(i11, str3), ToastService.ToastVariant.NEUTRAL);
                    }
                } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                    Logger logger2 = this.logger;
                    AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
                    AsyncCallResult.AsyncCallError error2 = error.getError();
                    StringBuilder s11 = defpackage.f.s("toggle failed - readId=", str, ", collectionId=", str2, ", wasAdded=");
                    s11.append(z6);
                    s11.append(", error=");
                    s11.append(error2);
                    Logger.logWarning$default(logger2, TAG, s11.toString(), null, 4, null);
                    showToggleToast(ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, error, null, 2, null), ToastService.ToastVariant.ERROR);
                    queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.g(1, str2, z6));
                } else {
                    c6.p();
                    return null;
                }
                return sn.z.f31622a;
            }
        }
        addReadToCollectionViewModel$performToggle$1 = new AddReadToCollectionViewModel$performToggle$1(this, cVar);
        Object obj2 = addReadToCollectionViewModel$performToggle$1.result;
        i10 = addReadToCollectionViewModel$performToggle$1.label;
        if (i10 == 0) {
        }
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadToCollectionState performToggle$lambda$0(boolean z6, String str, AddReadToCollectionState addReadToCollectionState) {
        LinkedHashSet K;
        addReadToCollectionState.getClass();
        Set<String> addedCollectionIds = addReadToCollectionState.getAddedCollectionIds();
        if (addedCollectionIds == null) {
            return addReadToCollectionState;
        }
        if (z6) {
            K = kd.a.O(addedCollectionIds, str);
        } else {
            K = kd.a.K(addedCollectionIds, str);
        }
        return AddReadToCollectionState.copy$default(addReadToCollectionState, null, null, null, K, false, 23, null);
    }

    private final String resolveTitle(CollectionMeta collection) {
        if (CollectionMetaKt.isReadLater(collection)) {
            return this.stringProvider.getString(R.string.read_later_collection_title);
        }
        return collection.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadToCollectionState setReadId$lambda$0(String str, AddReadToCollectionViewModel addReadToCollectionViewModel, AddReadToCollectionState addReadToCollectionState) {
        addReadToCollectionState.getClass();
        if (kotlin.jvm.internal.m.c(addReadToCollectionState.getReadId(), str) && addReadToCollectionState.getAddedCollectionIds() != null) {
            return addReadToCollectionState;
        }
        ib.i.r("setReadId - readId=", str, addReadToCollectionViewModel.logger, TAG);
        k1 k1Var = addReadToCollectionViewModel.membershipJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        addReadToCollectionViewModel.membershipJob = MviViewModel.launch$default(addReadToCollectionViewModel, null, new AddReadToCollectionViewModel$setReadId$1$1(addReadToCollectionViewModel, str, null), 1, null);
        return AddReadToCollectionState.copy$default(addReadToCollectionState, str, null, null, null, false, 6, null);
    }

    private final void showToggleToast(String message, ToastService.ToastVariant variant) {
        ToastService.Toast.Message message2 = new ToastService.Toast.Message(message, null, variant, 2, null);
        ToastService.Toast toast = this.lastToggleToast;
        if (toast != null) {
            this.toastService.pop(toast);
        }
        this.lastToggleToast = message2;
        this.toastService.showToast(message2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadToCollectionState toggle$lambda$0(String str, AddReadToCollectionViewModel addReadToCollectionViewModel, AddReadToCollectionState addReadToCollectionState) {
        Set<String> addedCollectionIds;
        Object obj;
        String str2;
        LinkedHashSet O;
        addReadToCollectionState.getClass();
        String readId = addReadToCollectionState.getReadId();
        if (readId == null || (addedCollectionIds = addReadToCollectionState.getAddedCollectionIds()) == null) {
            return addReadToCollectionState;
        }
        boolean contains = addedCollectionIds.contains(str);
        Iterator<T> it = addReadToCollectionState.getCollections().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.m.c(((CollectionMeta) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CollectionMeta collectionMeta = (CollectionMeta) obj;
        if (collectionMeta != null) {
            str2 = addReadToCollectionViewModel.resolveTitle(collectionMeta);
        } else {
            str2 = null;
        }
        MviViewModel.launch$default(addReadToCollectionViewModel, null, new AddReadToCollectionViewModel$toggle$1$1(addReadToCollectionViewModel, readId, str, str2, contains, null), 1, null);
        if (contains) {
            O = kd.a.K(addedCollectionIds, str);
        } else {
            O = kd.a.O(addedCollectionIds, str);
        }
        return AddReadToCollectionState.copy$default(addReadToCollectionState, null, null, null, O, false, 23, null);
    }

    public final void onCreateNewCollectionClick() {
        String readId = ((AddReadToCollectionState) getStateFlow().getValue()).getReadId();
        if (readId == null) {
            return;
        }
        this.analytics.log(new Analytics.Event.AddToCollectionSheetClickedCreateNew(readId));
    }

    public final MviViewModel.StateUpdate onSheetDismissed() {
        return queueStateUpdate(new b0(this, 1));
    }

    public final MviViewModel.StateUpdate setReadId(String readId) {
        readId.getClass();
        return queueStateUpdate(new f(readId, this, 0));
    }

    public final MviViewModel.StateUpdate toggle(String collectionId) {
        collectionId.getClass();
        return queueStateUpdate(new f(collectionId, this, 1));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionViewModel$Companion;", "", "<init>", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
