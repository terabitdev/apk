package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.usecase.DownloadReadUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$downloadRead$1", f = "LibraryViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class LibraryViewModel$downloadRead$1 extends yn.i implements ho.p {
    final /* synthetic */ ReadMeta $read;
    int label;
    final /* synthetic */ LibraryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$downloadRead$1(LibraryViewModel libraryViewModel, ReadMeta readMeta, wn.c<? super LibraryViewModel$downloadRead$1> cVar) {
        super(2, cVar);
        this.this$0 = libraryViewModel;
        this.$read = readMeta;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new LibraryViewModel$downloadRead$1(this.this$0, this.$read, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((LibraryViewModel$downloadRead$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
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
            aVar = this.this$0.downloadReadUseCase;
            DownloadReadUseCase downloadReadUseCase = (DownloadReadUseCase) aVar.get();
            String readId = this.$read.getReadId();
            long charCount = this.$read.getCharCount();
            this.label = 1;
            Object invoke = downloadReadUseCase.invoke(readId, charCount, this);
            xn.a aVar2 = xn.a.f37986a;
            if (invoke == aVar2) {
                return aVar2;
            }
        }
        return sn.z.f31622a;
    }
}
