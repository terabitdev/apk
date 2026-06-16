package io.elevenlabs.data.worker;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import java.io.File;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloader$doDownloadHtmlStep$htmlFile$1", f = "OfflineReadsDownloader.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Ljava/io/File;", "<anonymous>", "(Lfr/d0;)Ljava/io/File;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineReadsDownloader$doDownloadHtmlStep$htmlFile$1 extends i implements p {
    final /* synthetic */ File $baseDir;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloader$doDownloadHtmlStep$htmlFile$1(File file, c<? super OfflineReadsDownloader$doDownloadHtmlStep$htmlFile$1> cVar) {
        super(2, cVar);
        this.$baseDir = file;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new OfflineReadsDownloader$doDownloadHtmlStep$htmlFile$1(this.$baseDir, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super File> cVar) {
        return ((OfflineReadsDownloader$doDownloadHtmlStep$htmlFile$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            if (!this.$baseDir.exists()) {
                this.$baseDir.mkdirs();
            }
            return new File(this.$baseDir, OfflineReadsDownloader.DOWNLOAD_HTML_CONTENT_FILENAME);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
