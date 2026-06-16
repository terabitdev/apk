package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.services.ReadBookmarkService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel$updateBookmarkNote$1", f = "EditBookmarkViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class EditBookmarkViewModel$updateBookmarkNote$1 extends yn.i implements p {
    final /* synthetic */ Bookmark $bookmark;
    final /* synthetic */ String $note;
    int label;
    final /* synthetic */ EditBookmarkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditBookmarkViewModel$updateBookmarkNote$1(EditBookmarkViewModel editBookmarkViewModel, Bookmark bookmark, String str, wn.c<? super EditBookmarkViewModel$updateBookmarkNote$1> cVar) {
        super(2, cVar);
        this.this$0 = editBookmarkViewModel;
        this.$bookmark = bookmark;
        this.$note = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new EditBookmarkViewModel$updateBookmarkNote$1(this.this$0, this.$bookmark, this.$note, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((EditBookmarkViewModel$updateBookmarkNote$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadBookmarkService readBookmarkService;
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
            String readId = this.$bookmark.getReadId();
            String bookmarkId = this.$bookmark.getBookmarkId();
            String str = this.$note;
            this.label = 1;
            Object updateBookmark = readBookmarkService.updateBookmark(readId, bookmarkId, str, this);
            xn.a aVar = xn.a.f37986a;
            if (updateBookmark == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
