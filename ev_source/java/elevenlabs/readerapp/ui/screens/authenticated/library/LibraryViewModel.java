package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import com.revenuecat.purchases.utils.EventsFileHelper;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.z1;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u001c¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020&2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020 ¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001a¢\u0006\u0004\b4\u0010\u001eJ\u0015\u00105\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001a¢\u0006\u0004\b5\u0010\u001eJ\u0015\u00106\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001a¢\u0006\u0004\b6\u0010\u001eJ\u0015\u00108\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001a¢\u0006\u0004\b8\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/OfflineReadsService;", "offlineReadsService", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/usecase/DownloadReadUseCase;", "downloadReadUseCase", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/player/PlayerService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/model/ReadMeta;", "read", "Lsn/z;", "removeItem", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "downloadRead", "", "isCancellation", "removeDownload", "(Lio/elevenlabs/domain/model/ReadMeta;Z)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;", "tab", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "selectTab", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setInitialTab", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;)V", "loadNextPage", "()V", "Lio/elevenlabs/domain/services/ReadsService$SortBy;", "sortBy", "(Lio/elevenlabs/domain/services/ReadsService$SortBy;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "isLibraryVisible", "onLibraryVisibilityChange", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "meta", "archiveItem", "unarchiveItem", "markAsUnread", "readMeta", "onClickAddOrRemoveFromQueue", "Ljl/a;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LibraryViewModel extends MviViewModel<LibraryState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final jl.a collectionsService;
    private final jl.a downloadReadUseCase;
    private final jl.a offlineReadsService;
    private final PlayerService playerService;
    private final jl.a readsService;
    private final StringProvider stringProvider;
    private final String tag;
    private final ToastService toastService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1", f = "LibraryViewModel.kt", l = {EventsFileHelper.MAX_EVENT_PROPERTY_SIZE}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        final /* synthetic */ Logger $logger;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$3", f = "LibraryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/SyncStatus;", "syncStatus", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/SyncStatus;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LibraryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(LibraryViewModel libraryViewModel, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = libraryViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LibraryState invokeSuspend$lambda$0(SyncStatus syncStatus, LibraryState libraryState) {
                return LibraryState.copy$default(libraryState, false, null, false, 0, syncStatus, null, null, null, null, null, false, 2031, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // ho.p
            public final Object invoke(SyncStatus syncStatus, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass3) create(syncStatus, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                SyncStatus syncStatus = (SyncStatus) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new f0(syncStatus, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Logger logger, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$logger = logger;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$logger, cVar);
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
                final z1 stateFlow = LibraryViewModel.this.getStateFlow();
                jr.j G = ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$invokeSuspend$$inlined$map$1$2", f = "LibraryViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        Boolean valueOf = Boolean.valueOf(((LibraryState) obj).isLibraryVisible());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(valueOf, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                }), new LibraryViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.$logger, LibraryViewModel.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(LibraryViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(G, anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$3", f = "LibraryViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$3$1", f = "LibraryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/SyncStatus;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/SyncStatus;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LibraryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = libraryViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LibraryState invokeSuspend$lambda$0(SyncStatus syncStatus, LibraryState libraryState) {
                return LibraryState.copy$default(libraryState, false, null, false, 0, null, null, null, null, null, syncStatus, false, 1535, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // ho.p
            public final Object invoke(SyncStatus syncStatus, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass1) create(syncStatus, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                SyncStatus syncStatus = (SyncStatus) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new f0(syncStatus, 1));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

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
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                ir.i sync = ((CollectionsService) LibraryViewModel.this.collectionsService.get()).sync();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LibraryViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(sync, anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$4", f = "LibraryViewModel.kt", l = {119, 119}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$4$1", f = "LibraryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/CollectionMeta;", "collections", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$4$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LibraryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = libraryViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LibraryState invokeSuspend$lambda$0(List list, LibraryViewModel libraryViewModel, LibraryState libraryState) {
                return LibraryState.copy$default(libraryState, false, null, false, 0, null, null, null, null, tn.o.P0(LibraryScreenKt.downloadsCollection(libraryViewModel.stringProvider.getString(R.string.collection_downloaded)), list), null, false, 1791, null);
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
                    LibraryViewModel libraryViewModel = this.this$0;
                    libraryViewModel.queueStateUpdate(new h0(list, libraryViewModel, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass4(wn.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass4(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass4) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (ir.r.l((ir.i) r6, r0, r5) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
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
                CollectionsService collectionsService = (CollectionsService) LibraryViewModel.this.collectionsService.get();
                this.label = 1;
                obj = collectionsService.getCollections(this);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(LibraryViewModel.this, null);
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$5", f = "LibraryViewModel.kt", l = {127, 127}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5 extends yn.i implements ho.p {
        int label;

        public AnonymousClass5(wn.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass5(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass5) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                PlayerService playerService = LibraryViewModel.this.playerService;
                this.label = 1;
                obj = playerService.connect(this);
            }
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, StringProvider stringProvider, PlayerService playerService, ToastService toastService, Analytics analytics, Logger logger) {
        super(new LibraryState(false, null, false, 0, null, null, null, null, null, null, false, 2047, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        stringProvider.getClass();
        playerService.getClass();
        toastService.getClass();
        analytics.getClass();
        logger.getClass();
        this.readsService = aVar;
        this.offlineReadsService = aVar2;
        this.collectionsService = aVar3;
        this.downloadReadUseCase = aVar4;
        this.stringProvider = stringProvider;
        this.playerService = playerService;
        this.toastService = toastService;
        this.analytics = analytics;
        this.tag = "LibraryViewModel";
        logger.log("LibraryViewModel", "init");
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(logger, null), 2);
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass2(logger, null), 2);
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass3(null), 2);
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass4(null), 2);
        MviViewModel.launch$default(this, null, new AnonymousClass5(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass6(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LibraryState loadNextPage$lambda$0(LibraryState libraryState) {
        libraryState.getClass();
        if (libraryState.getHasMore()) {
            return LibraryState.copy$default(libraryState, false, null, false, libraryState.getLimit() + 10, null, null, null, null, null, null, false, 2039, null);
        }
        return libraryState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LibraryState onLibraryVisibilityChange$lambda$0(boolean z6, LibraryState libraryState) {
        libraryState.getClass();
        return LibraryState.copy$default(libraryState, z6, null, false, 0, null, null, null, null, null, null, false, 2046, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LibraryState selectTab$lambda$0(LibraryTab libraryTab, LibraryState libraryState) {
        libraryState.getClass();
        return LibraryState.copy$default(libraryState, false, null, false, 0, null, null, null, libraryTab, null, null, false, 1919, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LibraryState setInitialTab$lambda$0(LibraryTab libraryTab, LibraryViewModel libraryViewModel, LibraryState libraryState) {
        libraryState.getClass();
        if (libraryTab != null) {
            libraryViewModel.selectTab(libraryTab);
        }
        return LibraryState.copy$default(libraryState, false, null, false, 0, null, null, null, null, null, null, true, 1023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LibraryState sortBy$lambda$0(ReadsService.SortBy sortBy, LibraryState libraryState) {
        libraryState.getClass();
        return LibraryState.copy$default(libraryState, false, sortBy, false, 10, null, null, null, null, null, null, false, 2037, null);
    }

    public final void archiveItem(ReadMeta meta) {
        meta.getClass();
        fr.g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new LibraryViewModel$archiveItem$1(this, meta, null), 2);
    }

    public final void downloadRead(ReadMeta read) {
        read.getClass();
        this.analytics.log(new Analytics.Event.OfflineActionClicked(read.getReadId(), "download_all", "library", null, 8, null));
        MviViewModel.launch$default(this, null, new LibraryViewModel$downloadRead$1(this, read, null), 1, null);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final void loadNextPage() {
        if (((LibraryState) getStateFlow().getValue()).getHasMore()) {
            queueStateUpdate(new e0(17));
        }
    }

    public final void markAsUnread(ReadMeta meta) {
        meta.getClass();
        fr.g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new LibraryViewModel$markAsUnread$1(this, meta, null), 2);
    }

    public final void onClickAddOrRemoveFromQueue(ReadMeta readMeta) {
        readMeta.getClass();
        MviViewModel.launch$default(this, null, new LibraryViewModel$onClickAddOrRemoveFromQueue$1(this, readMeta, null), 1, null);
    }

    public final MviViewModel.StateUpdate onLibraryVisibilityChange(boolean isLibraryVisible) {
        return queueStateUpdate(new io.elevenlabs.ocr.t(isLibraryVisible, 4));
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
        analytics.log(new Analytics.Event.OfflineActionClicked(readId, str, "library", null, 8, null));
        fr.g0.D(c1.h(this), getDispatcherFactory().getIo(), null, new LibraryViewModel$removeDownload$1(read, this, null), 2);
    }

    public final void removeItem(ReadMeta read) {
        read.getClass();
        fr.g0.D(c1.h(this), getDispatcherFactory().getIo(), null, new LibraryViewModel$removeItem$1(this, read, null), 2);
    }

    public final MviViewModel.StateUpdate selectTab(LibraryTab tab) {
        tab.getClass();
        return queueStateUpdate(new i0(tab, 3));
    }

    public final void setInitialTab(LibraryTab tab) {
        if (((LibraryState) getStateFlow().getValue()).getInitialTabSet()) {
            return;
        }
        queueStateUpdate(new h0(tab, this, 4));
    }

    public final MviViewModel.StateUpdate sortBy(ReadsService.SortBy sortBy) {
        sortBy.getClass();
        return queueStateUpdate(new t(sortBy, 1));
    }

    public final void unarchiveItem(ReadMeta meta) {
        meta.getClass();
        fr.g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new LibraryViewModel$unarchiveItem$1(this, meta, null), 2);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$6", f = "LibraryViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass6 extends yn.i implements ho.p {
        int label;

        public AnonymousClass6(wn.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass6(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass6) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                z1 observeQueueState = LibraryViewModel.this.playerService.observeQueueState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LibraryViewModel.this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$6$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ LibraryViewModel this$0;

            public AnonymousClass1(LibraryViewModel libraryViewModel) {
                this.this$0 = libraryViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LibraryState emit$lambda$0(MediaQueueState mediaQueueState, LibraryState libraryState) {
                List<MediaItemState> list;
                libraryState.getClass();
                if (mediaQueueState != null) {
                    list = mediaQueueState.getItems();
                } else {
                    list = null;
                }
                if (list == null) {
                    list = tn.t.f33547a;
                }
                return LibraryState.copy$default(libraryState, false, null, false, 0, null, null, list, null, null, null, false, 1983, null);
            }

            public final Object emit(MediaQueueState mediaQueueState, wn.c<? super sn.z> cVar) {
                this.this$0.queueStateUpdate(new i0(mediaQueueState, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((MediaQueueState) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2", f = "LibraryViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ Logger $logger;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2$WhenMappings */
        /* loaded from: classes4.dex */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LibraryTab.values().length];
                try {
                    iArr[LibraryTab.SAVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LibraryTab.ARCHIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Logger logger, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$logger = logger;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.$logger, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                final z1 stateFlow = LibraryViewModel.this.getStateFlow();
                jr.j G = ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2$invokeSuspend$$inlined$map$1$2", f = "LibraryViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        LibraryState libraryState = (LibraryState) obj;
                                        sn.p pVar = new sn.p(new Integer(libraryState.getLimit()), libraryState.getSortBy(), libraryState.getActiveTab());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(pVar, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                }), new LibraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(null, LibraryViewModel.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(LibraryViewModel.this, this.$logger);
                this.label = 1;
                Object collect = G.collect(anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3<T> implements ir.j {
            final /* synthetic */ Logger $logger;
            final /* synthetic */ LibraryViewModel this$0;

            public AnonymousClass3(LibraryViewModel libraryViewModel, Logger logger) {
                this.this$0 = libraryViewModel;
                this.$logger = logger;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final LibraryState emit$lambda$0(Logger logger, LibraryViewModel libraryViewModel, List list, LibraryState libraryState) {
                boolean z6;
                libraryState.getClass();
                logger.log(libraryViewModel.tag, android.gov.nist.javax.sip.header.a.j(list.size(), "Has more reads: ", " vs ", libraryState.getLimit()));
                if (list.size() <= libraryState.getLimit()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return LibraryState.copy$default(libraryState, false, null, z6, 0, null, list, null, null, null, null, false, 2011, null);
            }

            public final Object emit(List<ReadMeta> list, wn.c<? super sn.z> cVar) {
                LibraryViewModel libraryViewModel = this.this$0;
                libraryViewModel.queueStateUpdate(new g0(this.$logger, libraryViewModel, list, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((List<ReadMeta>) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }
}
