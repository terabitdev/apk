package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.Filter;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/OfflineReadsService;", "offlineReadsService", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/services/OfflineReadsService;Lio/elevenlabs/domain/Analytics;)V", "", "readId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onReadClicked", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onNavigatedToRead", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/Filter;", "filter", "selectCategory", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/Filter;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/ReadMeta;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lsn/z;", "removeDownload", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "Lio/elevenlabs/domain/services/OfflineReadsService;", "Lio/elevenlabs/domain/Analytics;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DownloadsViewModel extends MviViewModel<DownloadsState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final OfflineReadsService offlineReadsService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel$1", f = "DownloadsScreen.kt", l = {137}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel$1$1", f = "DownloadsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/ReadMeta;", "reads", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00271 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DownloadsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00271(DownloadsViewModel downloadsViewModel, wn.c<? super C00271> cVar) {
                super(2, cVar);
                this.this$0 = downloadsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DownloadsState invokeSuspend$lambda$0(List list, DownloadsState downloadsState) {
                Filter.Category category;
                Filter selectedFilter;
                Filter selectedFilter2 = downloadsState.getSelectedFilter();
                String str = null;
                if (selectedFilter2 instanceof Filter.Category) {
                    category = (Filter.Category) selectedFilter2;
                } else {
                    category = null;
                }
                if (category != null) {
                    str = category.getCategory();
                }
                if (str != null && !invokeSuspend$lambda$0$hasReads(list, str)) {
                    selectedFilter = Filter.AllReads.INSTANCE;
                } else {
                    selectedFilter = downloadsState.getSelectedFilter();
                }
                return DownloadsState.copy$default(downloadsState, null, false, list, selectedFilter, null, false, 49, null);
            }

            private static final boolean invokeSuspend$lambda$0$hasReads(List<ReadMeta> list, String str) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    tn.o.g0(((ReadMeta) it.next()).getGenre(), arrayList);
                }
                return arrayList.contains(str);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                C00271 c00271 = new C00271(this.this$0, cVar);
                c00271.L$0 = obj;
                return c00271;
            }

            @Override // ho.p
            public final Object invoke(List<ReadMeta> list, wn.c<? super sn.z> cVar) {
                return ((C00271) create(list, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new x(list, 0));
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
                ir.i downloadedReads = DownloadsViewModel.this.offlineReadsService.getDownloadedReads();
                C00271 c00271 = new C00271(DownloadsViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(downloadedReads, c00271, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DownloadsViewModel(DispatcherFactory dispatcherFactory, StringProvider stringProvider, OfflineReadsService offlineReadsService, Analytics analytics) {
        super(new DownloadsState(LibraryScreenKt.downloadsCollection(stringProvider.getString(R.string.collection_downloaded)), false, null, null, null, false, 62, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        dispatcherFactory.getClass();
        stringProvider.getClass();
        offlineReadsService.getClass();
        analytics.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.offlineReadsService = offlineReadsService;
        this.analytics = analytics;
        fr.g0.D(androidx.lifecycle.c1.h(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadsState onNavigatedToRead$lambda$0(DownloadsState downloadsState) {
        downloadsState.getClass();
        return DownloadsState.copy$default(downloadsState, null, false, null, null, null, false, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadsState onReadClicked$lambda$0(String str, DownloadsState downloadsState) {
        downloadsState.getClass();
        return DownloadsState.copy$default(downloadsState, null, false, null, null, str, false, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadsState selectCategory$lambda$0(Filter filter, DownloadsState downloadsState) {
        downloadsState.getClass();
        return DownloadsState.copy$default(downloadsState, null, false, null, filter, null, false, 53, null);
    }

    public final MviViewModel.StateUpdate onNavigatedToRead() {
        return queueStateUpdate(new w(20));
    }

    public final MviViewModel.StateUpdate onReadClicked(String readId) {
        readId.getClass();
        return queueStateUpdate(new k0(readId, 3));
    }

    public final void removeDownload(ReadMeta data) {
        data.getClass();
        this.analytics.log(new Analytics.Event.OfflineActionClicked(data.getReadId(), "remove", "downloads", null, 8, null));
        fr.g0.D(androidx.lifecycle.c1.h(this), getDispatcherFactory().getIo(), null, new DownloadsViewModel$removeDownload$1(data, this, null), 2);
    }

    public final MviViewModel.StateUpdate selectCategory(Filter filter) {
        filter.getClass();
        return queueStateUpdate(new l(filter, 1));
    }
}
