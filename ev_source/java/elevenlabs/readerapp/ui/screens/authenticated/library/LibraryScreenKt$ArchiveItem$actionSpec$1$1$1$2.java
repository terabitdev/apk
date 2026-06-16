package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import com.google.protobuf.c6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$ArchiveItem$actionSpec$1$1$1$2", f = "LibraryScreen.kt", l = {633}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LibraryScreenKt$ArchiveItem$actionSpec$1$1$1$2 extends yn.i implements ho.l {
    final /* synthetic */ DeleteConfirmationState $deleteConfirmationState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryScreenKt$ArchiveItem$actionSpec$1$1$1$2(DeleteConfirmationState deleteConfirmationState, wn.c<? super LibraryScreenKt$ArchiveItem$actionSpec$1$1$1$2> cVar) {
        super(1, cVar);
        this.$deleteConfirmationState = deleteConfirmationState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(wn.c<?> cVar) {
        return new LibraryScreenKt$ArchiveItem$actionSpec$1$1$1$2(this.$deleteConfirmationState, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super Boolean> cVar) {
        return ((LibraryScreenKt$ArchiveItem$actionSpec$1$1$1$2) create(cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        this.$deleteConfirmationState.show();
        DeleteConfirmationState deleteConfirmationState = this.$deleteConfirmationState;
        this.label = 1;
        Object awaitResult = deleteConfirmationState.awaitResult(this);
        xn.a aVar = xn.a.f37986a;
        if (awaitResult == aVar) {
            return aVar;
        }
        return awaitResult;
    }
}
