package io.elevenlabs.ocr;

import com.google.protobuf.c6;
import fr.d0;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportScreenKt$OcrImportScreen$4$1", f = "OcrImportScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportScreenKt$OcrImportScreen$4$1 extends yn.i implements ho.p {
    final /* synthetic */ boolean $isPodcastMode;
    final /* synthetic */ OcrImportViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportScreenKt$OcrImportScreen$4$1(OcrImportViewModel ocrImportViewModel, boolean z6, wn.c<? super OcrImportScreenKt$OcrImportScreen$4$1> cVar) {
        super(2, cVar);
        this.$vm = ocrImportViewModel;
        this.$isPodcastMode = z6;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OcrImportScreenKt$OcrImportScreen$4$1(this.$vm, this.$isPodcastMode, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((OcrImportScreenKt$OcrImportScreen$4$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$vm.setPodcastMode(this.$isPodcastMode);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
