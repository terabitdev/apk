package io.elevenlabs.data.worker;

import com.google.protobuf.c6;
import ho.l;
import java.io.File;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloader$doDownloadHtmlStep$2", f = "OfflineReadsDownloader.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineReadsDownloader$doDownloadHtmlStep$2 extends i implements l {
    final /* synthetic */ File $htmlFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloader$doDownloadHtmlStep$2(File file, c<? super OfflineReadsDownloader$doDownloadHtmlStep$2> cVar) {
        super(1, cVar);
        this.$htmlFile = file;
    }

    @Override // yn.a
    public final c<z> create(c<?> cVar) {
        return new OfflineReadsDownloader$doDownloadHtmlStep$2(this.$htmlFile, cVar);
    }

    @Override // ho.l
    public final Object invoke(c<? super z> cVar) {
        return ((OfflineReadsDownloader$doDownloadHtmlStep$2) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$htmlFile.delete();
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
