package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.services.ReadBookmarkService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "EditBookmarkViewModel.kt", l = {190, 189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class EditBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 extends yn.i implements q {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ EditBookmarkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(wn.c cVar, EditBookmarkViewModel editBookmarkViewModel) {
        super(3, cVar);
        this.this$0 = editBookmarkViewModel;
    }

    public final Object invoke(ir.j jVar, String str, wn.c<? super z> cVar) {
        EditBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 editBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new EditBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.this$0);
        editBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        editBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return editBookmarkViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (ir.r.r(r0, (ir.i) r8, r7) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r8 == r4) goto L15;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ir.j jVar;
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
            jVar = (ir.j) this.L$2;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            jVar = (ir.j) this.L$0;
            String str = (String) this.L$1;
            readBookmarkService = this.this$0.bookmarkService;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = jVar;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = readBookmarkService.observeBookmark(str, this);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (String) obj2, (wn.c<? super z>) obj3);
    }
}
