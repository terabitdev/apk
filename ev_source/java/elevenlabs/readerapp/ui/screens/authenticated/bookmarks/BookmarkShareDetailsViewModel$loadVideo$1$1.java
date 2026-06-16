package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.BookmarkShareResult;
import io.elevenlabs.domain.services.ReadBookmarkService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel$loadVideo$1$1", f = "BookmarkShareDetailsScreen.kt", l = {72}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class BookmarkShareDetailsViewModel$loadVideo$1$1 extends yn.i implements p {
    final /* synthetic */ String $bookmarkId;
    final /* synthetic */ String $voiceId;
    int label;
    final /* synthetic */ BookmarkShareDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkShareDetailsViewModel$loadVideo$1$1(BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, String str, String str2, wn.c<? super BookmarkShareDetailsViewModel$loadVideo$1$1> cVar) {
        super(2, cVar);
        this.this$0 = bookmarkShareDetailsViewModel;
        this.$bookmarkId = str;
        this.$voiceId = str2;
    }

    public static final BookmarkShareDetailsState invokeSuspend$lambda$0(AsyncCallResult asyncCallResult, BookmarkShareDetailsState bookmarkShareDetailsState) {
        return BookmarkShareDetailsState.copy$default(bookmarkShareDetailsState, false, null, ((BookmarkShareResult) ((AsyncCallResult.Success) asyncCallResult).getData()).getFile(), false, false, null, 58, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BookmarkShareDetailsViewModel$loadVideo$1$1(this.this$0, this.$bookmarkId, this.$voiceId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BookmarkShareDetailsViewModel$loadVideo$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadBookmarkService readBookmarkService;
        String str;
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
            readBookmarkService = this.this$0.bookmarkService;
            String str2 = this.$bookmarkId;
            String str3 = this.$voiceId;
            this.label = 1;
            obj = readBookmarkService.shareBookmark(str2, str3, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new h((AsyncCallResult.Success) asyncCallResult, 1));
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
            if (error.getError().isNotNetwork()) {
                Logger logger = this.this$0.getLogger();
                str = this.this$0.tag;
                logger.logError(str, "Failed to download bookmark video: " + error.getError(), null);
            }
            this.this$0.queueStateUpdate(new i(0));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
