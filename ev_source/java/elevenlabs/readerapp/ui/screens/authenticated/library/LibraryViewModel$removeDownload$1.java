package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.OfflineReadsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$removeDownload$1", f = "LibraryViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class LibraryViewModel$removeDownload$1 extends yn.i implements ho.p {
    final /* synthetic */ ReadMeta $read;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ LibraryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$removeDownload$1(ReadMeta readMeta, LibraryViewModel libraryViewModel, wn.c<? super LibraryViewModel$removeDownload$1> cVar) {
        super(2, cVar);
        this.$read = readMeta;
        this.this$0 = libraryViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new LibraryViewModel$removeDownload$1(this.$read, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((LibraryViewModel$removeDownload$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            OfflineReadData offlineReadData = this.$read.getOfflineReadData();
            if (offlineReadData != null) {
                aVar = this.this$0.offlineReadsService;
                OfflineReadsService offlineReadsService = (OfflineReadsService) aVar.get();
                long offlineReadId = offlineReadData.getOfflineReadId();
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                Object removeDownload = offlineReadsService.removeDownload(offlineReadId, this);
                xn.a aVar2 = xn.a.f37986a;
                if (removeDownload == aVar2) {
                    return aVar2;
                }
            }
        }
        return sn.z.f31622a;
    }
}
