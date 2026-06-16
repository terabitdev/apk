package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import androidx.lifecycle.c1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010 J\u0015\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001eJ\r\u0010$\u001a\u00020\u001c¢\u0006\u0004\b$\u0010 J\r\u0010%\u001a\u00020\u001c¢\u0006\u0004\b%\u0010 J\r\u0010&\u001a\u00020\u001c¢\u0006\u0004\b&\u0010 J\u0015\u0010'\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010*\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020-2\u0006\u00100\u001a\u00020(¢\u0006\u0004\b1\u0010/J\u001d\u00104\u001a\u00020-2\u0006\u00100\u001a\u00020(2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020-2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b6\u0010/J\r\u00107\u001a\u00020\u001c¢\u0006\u0004\b7\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010=R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/OfflineReadsService;", "offlineReadsService", "Ljl/a;", "Lio/elevenlabs/domain/usecase/DownloadReadUseCase;", "downloadReadUseCase", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CollectionsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/OfflineReadsService;Ljl/a;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/Analytics;)V", "", "collectionId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setCollectionId", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "load", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "loadMore", "readId", "onReadClicked", "onNavigatedToRead", "onSuccessToastClick", "onDelete", "removeFromCollection", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "markAsUnread", "(Lio/elevenlabs/domain/model/ReadMeta;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "meta", "Lsn/z;", "archive", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "read", "downloadRead", "", "isCancellation", "removeDownload", "(Lio/elevenlabs/domain/model/ReadMeta;Z)V", "onClickAddOrRemoveFromQueue", "onClickAddFullCollectionToQueue", "Lio/elevenlabs/domain/services/CollectionsService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/OfflineReadsService;", "Ljl/a;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/Analytics;", "Lfr/k1;", "loadJob", "Lfr/k1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CollectionViewModel extends MviViewModel<CollectionState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final CollectionsService collectionsService;
    private final jl.a downloadReadUseCase;
    private k1 loadJob;
    private final OfflineReadsService offlineReadsService;
    private final PlayerService playerService;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$1", f = "CollectionViewModel.kt", l = {51}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$1$1", f = "CollectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/OfflineReadData;", "it", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00371 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CollectionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00371(CollectionViewModel collectionViewModel, wn.c<? super C00371> cVar) {
                super(2, cVar);
                this.this$0 = collectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CollectionState invokeSuspend$lambda$0(List list, CollectionState collectionState) {
                return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, list, null, null, false, false, null, 32255, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                C00371 c00371 = new C00371(this.this$0, cVar);
                c00371.L$0 = obj;
                return c00371;
            }

            @Override // ho.p
            public final Object invoke(List<OfflineReadData> list, wn.c<? super sn.z> cVar) {
                return ((C00371) create(list, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new h(list, 2));
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
                ir.i allOfflineReads = CollectionViewModel.this.offlineReadsService.getAllOfflineReads();
                C00371 c00371 = new C00371(CollectionViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(allOfflineReads, c00371, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$2", f = "CollectionViewModel.kt", l = {59, 59}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;

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

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (ir.r.k((ir.i) r5, r4) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            if (r5 == r3) goto L15;
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
                PlayerService playerService = CollectionViewModel.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollectionViewModel(DispatcherFactory dispatcherFactory, CollectionsService collectionsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, ReadsService readsService, OfflineReadsService offlineReadsService, jl.a aVar, StringProvider stringProvider, PlayerService playerService, Analytics analytics) {
        super(new CollectionState(null, false, false, null, false, null, null, null, null, null, null, null, false, false, null, 32767, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        collectionsService.getClass();
        resolveErrorMessageUseCase.getClass();
        toastService.getClass();
        readsService.getClass();
        offlineReadsService.getClass();
        aVar.getClass();
        stringProvider.getClass();
        playerService.getClass();
        analytics.getClass();
        Logger logger = null;
        this.collectionsService = collectionsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.toastService = toastService;
        this.readsService = readsService;
        this.offlineReadsService = offlineReadsService;
        this.downloadReadUseCase = aVar;
        this.stringProvider = stringProvider;
        this.playerService = playerService;
        this.analytics = analytics;
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState archive$lambda$0(ReadMeta readMeta, CollectionState collectionState) {
        collectionState.getClass();
        List<ReadMeta> networkReads = collectionState.getNetworkReads();
        ArrayList arrayList = new ArrayList();
        for (Object obj : networkReads) {
            if (!kotlin.jvm.internal.m.c(((ReadMeta) obj).getReadId(), readMeta.getReadId())) {
                arrayList.add(obj);
            }
        }
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, arrayList, null, false, false, null, 31743, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState load$lambda$0(CollectionViewModel collectionViewModel, CollectionState collectionState) {
        collectionState.getClass();
        if (collectionState.getCollectionId() == null) {
            return collectionState;
        }
        k1 k1Var = collectionViewModel.loadJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        collectionViewModel.loadJob = fr.g0.D(c1.h(collectionViewModel), collectionViewModel.getDispatcherFactory().getDefault(), null, new CollectionViewModel$load$1$1(collectionViewModel, collectionState, null), 2);
        return CollectionState.copy$default(collectionState, null, true, false, null, false, null, "", null, null, null, null, null, false, false, null, 32701, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState loadMore$lambda$0(CollectionViewModel collectionViewModel, CollectionState collectionState) {
        collectionState.getClass();
        if (collectionState.getCollectionId() != null && collectionState.getNextCursor() != null && !collectionState.isLoadingMore() && !collectionState.isLoading()) {
            fr.g0.D(c1.h(collectionViewModel), collectionViewModel.getDispatcherFactory().getDefault(), null, new CollectionViewModel$loadMore$1$1(collectionViewModel, collectionState, null), 2);
            return CollectionState.copy$default(collectionState, null, false, true, null, false, null, null, "", null, null, null, null, false, false, null, 32635, null);
        }
        return collectionState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState markAsUnread$lambda$0(CollectionViewModel collectionViewModel, ReadMeta readMeta, CollectionState collectionState) {
        collectionState.getClass();
        if (collectionState.getCollectionId() == null) {
            return collectionState;
        }
        fr.g0.D(c1.h(collectionViewModel), collectionViewModel.getDispatcherFactory().getDefault(), null, new CollectionViewModel$markAsUnread$1$1(collectionViewModel, readMeta, null), 2);
        List<ReadMeta> networkReads = collectionState.getNetworkReads();
        ArrayList arrayList = new ArrayList(tn.p.a0(networkReads, 10));
        for (ReadMeta readMeta2 : networkReads) {
            if (kotlin.jvm.internal.m.c(readMeta2.getReadId(), readMeta.getReadId())) {
                readMeta2 = readMeta2.copy((r84 & 1) != 0 ? readMeta2.articleImageUrl : null, (r84 & 2) != 0 ? readMeta2.author : null, (r84 & 4) != 0 ? readMeta2.chapters : null, (r84 & 8) != 0 ? readMeta2.charCount : 0L, (r84 & 16) != 0 ? readMeta2.createdAt : null, (r84 & 32) != 0 ? readMeta2.updatedAt : null, (r84 & 64) != 0 ? readMeta2.addedAt : null, (r84 & 128) != 0 ? readMeta2.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMeta2.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? readMeta2.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMeta2.source : null, (r84 & 2048) != 0 ? readMeta2.title : null, (r84 & 4096) != 0 ? readMeta2.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMeta2.url : null, (r84 & 16384) != 0 ? readMeta2.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMeta2.originalFileType : null, (r84 & 65536) != 0 ? readMeta2.hasOriginalAudio : false, (r84 & 131072) != 0 ? readMeta2.matureContent : false, (r84 & 262144) != 0 ? readMeta2.origin : null, (r84 & 524288) != 0 ? readMeta2.contentType : null, (r84 & 1048576) != 0 ? readMeta2.genre : null, (r84 & 2097152) != 0 ? readMeta2.isBookType : false, (r84 & 4194304) != 0 ? readMeta2.fromUserImport : false, (r84 & 8388608) != 0 ? readMeta2.rating : null, (r84 & 16777216) != 0 ? readMeta2.userRating : null, (r84 & 33554432) != 0 ? readMeta2.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? readMeta2.creationStatus : null, (r84 & 134217728) != 0 ? readMeta2.creationProgress : null, (r84 & 268435456) != 0 ? readMeta2.isArchived : false, (r84 & 536870912) != 0 ? readMeta2.markedAsUnread : true, (r84 & 1073741824) != 0 ? readMeta2.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? readMeta2.publicationDate : null, (r85 & 1) != 0 ? readMeta2.language : null, (r85 & 2) != 0 ? readMeta2.publisherProfileId : null, (r85 & 4) != 0 ? readMeta2.canDelete : false, (r85 & 8) != 0 ? readMeta2.androidProductId : null, (r85 & 16) != 0 ? readMeta2.isPaid : false, (r85 & 32) != 0 ? readMeta2.offlineReadData : null, (r85 & 64) != 0 ? readMeta2.previewAudio : null, (r85 & 128) != 0 ? readMeta2.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMeta2.voiceSelectionConfig : null, (r85 & 512) != 0 ? readMeta2.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMeta2.displayMode : null, (r85 & 2048) != 0 ? readMeta2.inUserLibrary : false, (r85 & 4096) != 0 ? readMeta2.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMeta2.audioType : null, (r85 & 16384) != 0 ? readMeta2.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMeta2.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? readMeta2.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? readMeta2.audioDurationSeconds : null, (r85 & 262144) != 0 ? readMeta2.audioTypes : null, (r85 & 524288) != 0 ? readMeta2.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? readMeta2.lastUsedAudioType : null, (r85 & 2097152) != 0 ? readMeta2.coverImageUrls : null, (r85 & 4194304) != 0 ? readMeta2.coverAspectRatio : null, (r85 & 8388608) != 0 ? readMeta2.blurPlaceholder : null);
            }
            arrayList.add(readMeta2);
        }
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, arrayList, null, false, false, null, 31743, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState onClickAddFullCollectionToQueue$lambda$0(CollectionViewModel collectionViewModel, CollectionState collectionState) {
        collectionState.getClass();
        if (collectionState.getCollectionId() != null && !collectionState.isLoadingMore() && !collectionState.isLoading()) {
            MviViewModel.launch$default(collectionViewModel, null, new CollectionViewModel$onClickAddFullCollectionToQueue$1$1(collectionState, collectionViewModel, null), 1, null);
            return CollectionState.copy$default(collectionState, null, false, true, null, false, null, null, "", null, null, null, null, false, false, null, 32635, null);
        }
        return collectionState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState onDelete$lambda$0(CollectionViewModel collectionViewModel, CollectionState collectionState) {
        collectionState.getClass();
        if (!collectionState.isLoading() && collectionState.getCollectionId() != null) {
            fr.g0.D(c1.h(collectionViewModel), collectionViewModel.getDispatcherFactory().getDefault(), null, new CollectionViewModel$onDelete$1$1(collectionViewModel, collectionState, null), 2);
            return CollectionState.copy$default(collectionState, null, true, false, null, false, null, null, null, null, null, null, null, false, false, null, 32765, null);
        }
        return collectionState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState onNavigatedToRead$lambda$0(CollectionState collectionState) {
        collectionState.getClass();
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, null, null, false, false, null, 30719, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState onReadClicked$lambda$0(String str, CollectionState collectionState) {
        collectionState.getClass();
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, null, str, false, false, null, 30719, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState onSuccessToastClick$lambda$0(CollectionState collectionState) {
        collectionState.getClass();
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, null, null, false, false, null, 28671, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState removeFromCollection$lambda$0(CollectionViewModel collectionViewModel, String str, CollectionState collectionState) {
        collectionState.getClass();
        if (collectionState.getCollectionId() == null) {
            return collectionState;
        }
        fr.g0.D(c1.h(collectionViewModel), collectionViewModel.getDispatcherFactory().getDefault(), null, new CollectionViewModel$removeFromCollection$1$1(collectionViewModel, collectionState, str, null), 2);
        List<ReadMeta> networkReads = collectionState.getNetworkReads();
        ArrayList arrayList = new ArrayList();
        for (Object obj : networkReads) {
            if (!kotlin.jvm.internal.m.c(((ReadMeta) obj).getReadId(), str)) {
                arrayList.add(obj);
            }
        }
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, arrayList, null, false, false, null, 31743, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionState setCollectionId$lambda$0(String str, CollectionViewModel collectionViewModel, CollectionState collectionState) {
        collectionState.getClass();
        if (!kotlin.jvm.internal.m.c(str, collectionState.getCollectionId())) {
            collectionViewModel.load();
            return CollectionState.copy$default(collectionState, str, false, false, null, false, null, null, null, null, null, null, null, false, false, null, 32766, null);
        }
        return collectionState;
    }

    public final void archive(ReadMeta meta) {
        meta.getClass();
        fr.g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new CollectionViewModel$archive$1(this, meta, null), 2);
        queueStateUpdate(new b0(meta, 4));
    }

    public final void downloadRead(ReadMeta read) {
        read.getClass();
        this.analytics.log(new Analytics.Event.OfflineActionClicked(read.getReadId(), "download_all", "collection", null, 8, null));
        MviViewModel.launch$default(this, null, new CollectionViewModel$downloadRead$1(this, read, null), 1, null);
    }

    public final MviViewModel.StateUpdate load() {
        return queueStateUpdate(new u(this, 4));
    }

    public final MviViewModel.StateUpdate loadMore() {
        return queueStateUpdate(new u(this, 3));
    }

    public final MviViewModel.StateUpdate markAsUnread(ReadMeta readMeta) {
        readMeta.getClass();
        return queueStateUpdate(new f0(this, readMeta, 5));
    }

    public final MviViewModel.StateUpdate onClickAddFullCollectionToQueue() {
        return queueStateUpdate(new u(this, 1));
    }

    public final void onClickAddOrRemoveFromQueue(ReadMeta readMeta) {
        readMeta.getClass();
        MviViewModel.launch$default(this, null, new CollectionViewModel$onClickAddOrRemoveFromQueue$1(this, readMeta, null), 1, null);
    }

    public final MviViewModel.StateUpdate onDelete() {
        return queueStateUpdate(new u(this, 2));
    }

    public final MviViewModel.StateUpdate onNavigatedToRead() {
        return queueStateUpdate(new y(7));
    }

    public final MviViewModel.StateUpdate onReadClicked(String readId) {
        readId.getClass();
        return queueStateUpdate(new k(readId, 3));
    }

    public final MviViewModel.StateUpdate onSuccessToastClick() {
        return queueStateUpdate(new y(8));
    }

    public final void removeDownload(ReadMeta read, boolean isCancellation) {
        String str;
        read.getClass();
        Analytics analytics = this.analytics;
        String readId = read.getReadId();
        if (isCancellation) {
            str = "cancel";
        } else {
            str = "remove";
        }
        analytics.log(new Analytics.Event.OfflineActionClicked(readId, str, "collection", null, 8, null));
        MviViewModel.launch$default(this, null, new CollectionViewModel$removeDownload$1(read, this, null), 1, null);
    }

    public final MviViewModel.StateUpdate removeFromCollection(String readId) {
        readId.getClass();
        return queueStateUpdate(new a0(this, readId));
    }

    public final MviViewModel.StateUpdate setCollectionId(String collectionId) {
        collectionId.getClass();
        return queueStateUpdate(new a0(collectionId, this));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$3", f = "CollectionViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        int label;

        public AnonymousClass3(wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                z1 observeQueueState = CollectionViewModel.this.playerService.observeQueueState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CollectionViewModel.this);
                this.label = 1;
                Object collect = observeQueueState.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            c6.u();
            return null;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ CollectionViewModel this$0;

            public AnonymousClass1(CollectionViewModel collectionViewModel) {
                this.this$0 = collectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CollectionState emit$lambda$0(MediaQueueState mediaQueueState, CollectionState collectionState) {
                List<MediaItemState> list;
                collectionState.getClass();
                if (mediaQueueState != null) {
                    list = mediaQueueState.getItems();
                } else {
                    list = null;
                }
                if (list == null) {
                    list = tn.t.f33547a;
                }
                return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, null, null, false, false, list, 16383, null);
            }

            public final Object emit(MediaQueueState mediaQueueState, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new b0(mediaQueueState, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((MediaQueueState) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }
}
