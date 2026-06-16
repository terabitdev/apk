package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.FileData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.ReadsService;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel$onParsingCompleted$1$1$result$2", f = "ImportLinkScreen.kt", l = {182}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/ReadMeta;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportLinkViewModel$onParsingCompleted$1$1$result$2 extends yn.i implements ho.l {
    final /* synthetic */ File $outputFile;
    final /* synthetic */ ImportLinkState $this_queueStateUpdate;
    int label;
    final /* synthetic */ ImportLinkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportLinkViewModel$onParsingCompleted$1$1$result$2(ImportLinkViewModel importLinkViewModel, File file, ImportLinkState importLinkState, wn.c<? super ImportLinkViewModel$onParsingCompleted$1$1$result$2> cVar) {
        super(1, cVar);
        this.this$0 = importLinkViewModel;
        this.$outputFile = file;
        this.$this_queueStateUpdate = importLinkState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(wn.c<?> cVar) {
        return new ImportLinkViewModel$onParsingCompleted$1$1$result$2(this.this$0, this.$outputFile, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super AsyncCallResult<ReadMeta>> cVar) {
        return ((ImportLinkViewModel$onParsingCompleted$1$1$result$2) create(cVar)).invokeSuspend(sn.z.f31622a);
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
        String url = this.$this_queueStateUpdate.getUrl();
        this.label = 1;
        Object addUpload$default = ReadsService.addUpload$default(readsService, loadFileFromFileSystem, "website", null, url, this, 4, null);
        xn.a aVar2 = xn.a.f37986a;
        if (addUpload$default == aVar2) {
            return aVar2;
        }
        return addUpload$default;
    }
}
