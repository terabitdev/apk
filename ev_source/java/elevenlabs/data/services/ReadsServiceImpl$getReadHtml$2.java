package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.model.FileDownloadState;
import java.io.File;
import kotlin.Metadata;
import sn.z;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$getReadHtml$2", f = "ReadsServiceImpl.kt", l = {449, 450}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/FileDownloadState;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$getReadHtml$2 extends yn.i implements p {
    final /* synthetic */ File $offlineHtmlFile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$getReadHtml$2(File file, wn.c<? super ReadsServiceImpl$getReadHtml$2> cVar) {
        super(2, cVar);
        this.$offlineHtmlFile = file;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsServiceImpl$getReadHtml$2 readsServiceImpl$getReadHtml$2 = new ReadsServiceImpl$getReadHtml$2(this.$offlineHtmlFile, cVar);
        readsServiceImpl$getReadHtml$2.L$0 = obj;
        return readsServiceImpl$getReadHtml$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((ReadsServiceImpl$getReadHtml$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0.emit(r6, r5) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r0.emit(r6, r5) == r4) goto L15;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ir.j jVar = (ir.j) this.L$0;
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
            FileDownloadState.Downloading downloading = new FileDownloadState.Downloading(0);
            this.L$0 = jVar;
            this.label = 1;
        }
        FileDownloadState.Finished finished = new FileDownloadState.Finished(this.$offlineHtmlFile, u.f33548a);
        this.L$0 = null;
        this.label = 2;
    }
}
