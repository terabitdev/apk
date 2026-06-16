package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.services.ReadBookmarkService;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$initialize$2", f = "BookmarksSheet.kt", l = {85, 86}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadBookmarksViewModel$initialize$2 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadBookmarksViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadBookmarksViewModel$initialize$2(ReadBookmarksViewModel readBookmarksViewModel, String str, wn.c<? super ReadBookmarksViewModel$initialize$2> cVar) {
        super(2, cVar);
        this.this$0 = readBookmarksViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadBookmarksViewModel$initialize$2(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadBookmarksViewModel$initialize$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (((ir.i) r5).collect(r0, r4) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r5 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadBookmarkService readBookmarkService;
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
            readBookmarkService = this.this$0.bookmarkService;
            String str = this.$readId;
            this.label = 1;
            obj = readBookmarkService.getBookmarks(str, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$initialize$2$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ ReadBookmarksViewModel this$0;

        public AnonymousClass1(ReadBookmarksViewModel readBookmarksViewModel) {
            this.this$0 = readBookmarksViewModel;
        }

        public static final ReadBookmarksState emit$lambda$0(List list, ReadBookmarksState readBookmarksState) {
            readBookmarksState.getClass();
            return ReadBookmarksState.copy$default(readBookmarksState, null, null, tn.o.a1(new Comparator() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$initialize$2$1$emit$lambda$0$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return wn.e.g(Long.valueOf(((Bookmark) t10).getStartOffsetInclusive()), Long.valueOf(((Bookmark) t11).getStartOffsetInclusive()));
                }
            }, list), false, 11, null);
        }

        public final Object emit(List<Bookmark> list, wn.c<? super sn.z> cVar) {
            this.this$0.queueStateUpdate(new l(list, 2));
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((List<Bookmark>) obj, (wn.c<? super sn.z>) cVar);
        }
    }
}
