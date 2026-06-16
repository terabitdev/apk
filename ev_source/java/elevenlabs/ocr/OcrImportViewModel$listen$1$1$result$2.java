package io.elevenlabs.ocr;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.FileData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.ReadsService;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportViewModel$listen$1$1$result$2", f = "OcrImportScreen.kt", l = {262}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/ReadMeta;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OcrImportViewModel$listen$1$1$result$2 extends yn.i implements ho.l {
    final /* synthetic */ File $outputFile;
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ OcrImportViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportViewModel$listen$1$1$result$2(OcrImportViewModel ocrImportViewModel, File file, String str, wn.c<? super OcrImportViewModel$listen$1$1$result$2> cVar) {
        super(1, cVar);
        this.this$0 = ocrImportViewModel;
        this.$outputFile = file;
        this.$text = str;
    }

    @Override // yn.a
    public final wn.c<z> create(wn.c<?> cVar) {
        return new OcrImportViewModel$listen$1$1$result$2(this.this$0, this.$outputFile, this.$text, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super AsyncCallResult<ReadMeta>> cVar) {
        return ((OcrImportViewModel$listen$1$1$result$2) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        FileService fileService;
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
        aVar = this.this$0.readsService;
        Object obj2 = aVar.get();
        obj2.getClass();
        ReadsService readsService = (ReadsService) obj2;
        fileService = this.this$0.fileService;
        File file = this.$outputFile;
        file.getClass();
        FileData loadFileFromFileSystem = fileService.loadFileFromFileSystem(file);
        String E0 = tn.o.E0(tn.o.b1(wq.n.z0(this.$text, new String[]{Separators.SP}, 6), 10), Separators.SP, null, null, null, 62);
        this.label = 1;
        Object addUpload$default = ReadsService.addUpload$default(readsService, loadFileFromFileSystem, ParameterNames.TEXT, E0, null, this, 8, null);
        xn.a aVar2 = xn.a.f37986a;
        if (addUpload$default == aVar2) {
            return aVar2;
        }
        return addUpload$default;
    }
}
