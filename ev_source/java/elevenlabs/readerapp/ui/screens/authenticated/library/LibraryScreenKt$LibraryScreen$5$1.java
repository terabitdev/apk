package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$LibraryScreen$5$1", f = "LibraryScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class LibraryScreenKt$LibraryScreen$5$1 extends yn.i implements ho.p {
    final /* synthetic */ boolean $isLibraryVisible;
    final /* synthetic */ LibraryViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryScreenKt$LibraryScreen$5$1(LibraryViewModel libraryViewModel, boolean z6, wn.c<? super LibraryScreenKt$LibraryScreen$5$1> cVar) {
        super(2, cVar);
        this.$vm = libraryViewModel;
        this.$isLibraryVisible = z6;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new LibraryScreenKt$LibraryScreen$5$1(this.$vm, this.$isLibraryVisible, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((LibraryScreenKt$LibraryScreen$5$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$vm.onLibraryVisibilityChange(this.$isLibraryVisible);
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
