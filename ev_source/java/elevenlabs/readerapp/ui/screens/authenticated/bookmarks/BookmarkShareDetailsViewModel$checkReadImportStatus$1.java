package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel$checkReadImportStatus$1", f = "BookmarkShareDetailsScreen.kt", l = {105, 105}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class BookmarkShareDetailsViewModel$checkReadImportStatus$1 extends yn.i implements p {
    final /* synthetic */ String $bookmarkId;
    int label;
    final /* synthetic */ BookmarkShareDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkShareDetailsViewModel$checkReadImportStatus$1(BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, String str, wn.c<? super BookmarkShareDetailsViewModel$checkReadImportStatus$1> cVar) {
        super(2, cVar);
        this.this$0 = bookmarkShareDetailsViewModel;
        this.$bookmarkId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BookmarkShareDetailsViewModel$checkReadImportStatus$1(this.this$0, this.$bookmarkId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BookmarkShareDetailsViewModel$checkReadImportStatus$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readBookmarkService = this.this$0.bookmarkService;
            String str = this.$bookmarkId;
            this.label = 1;
            obj = readBookmarkService.observeBookmark(str, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel$checkReadImportStatus$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ BookmarkShareDetailsViewModel this$0;

        public AnonymousClass1(BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
            this.this$0 = bookmarkShareDetailsViewModel;
        }

        public static /* synthetic */ BookmarkShareDetailsState a(ReadMeta readMeta, BookmarkShareDetailsState bookmarkShareDetailsState) {
            return emit$lambda$0$0$0(readMeta, bookmarkShareDetailsState);
        }

        public static final BookmarkShareDetailsState emit$lambda$0$0$0(ReadMeta readMeta, BookmarkShareDetailsState bookmarkShareDetailsState) {
            bookmarkShareDetailsState.getClass();
            return BookmarkShareDetailsState.copy$default(bookmarkShareDetailsState, false, null, null, readMeta.getFromUserImport(), false, null, 55, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Bookmark bookmark, wn.c<? super z> cVar) {
            BookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1 bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1;
            int i10;
            ReadsService readsService;
            BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel;
            ReadMeta readMeta;
            if (cVar instanceof BookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1) {
                bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1 = (BookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1) cVar;
                int i11 = bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.result;
                    i10 = bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            bookmarkShareDetailsViewModel = (BookmarkShareDetailsViewModel) bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.L$1;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        if (bookmark != null) {
                            BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel2 = this.this$0;
                            readsService = bookmarkShareDetailsViewModel2.readsService;
                            String readId = bookmark.getReadId();
                            bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.L$0 = null;
                            bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.L$1 = bookmarkShareDetailsViewModel2;
                            bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.L$2 = null;
                            bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.I$0 = 0;
                            bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.label = 1;
                            Object read = readsService.getRead(readId, bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1);
                            xn.a aVar = xn.a.f37986a;
                            if (read == aVar) {
                                return aVar;
                            }
                            obj = read;
                            bookmarkShareDetailsViewModel = bookmarkShareDetailsViewModel2;
                        }
                        return z.f31622a;
                    }
                    readMeta = (ReadMeta) obj;
                    if (readMeta != null) {
                        bookmarkShareDetailsViewModel.queueStateUpdate(new h(readMeta, 0));
                    }
                    return z.f31622a;
                }
            }
            bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1 = new BookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1(this, cVar);
            Object obj2 = bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.result;
            i10 = bookmarkShareDetailsViewModel$checkReadImportStatus$1$1$emit$1.label;
            if (i10 == 0) {
            }
            readMeta = (ReadMeta) obj2;
            if (readMeta != null) {
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((Bookmark) obj, (wn.c<? super z>) cVar);
        }
    }
}
