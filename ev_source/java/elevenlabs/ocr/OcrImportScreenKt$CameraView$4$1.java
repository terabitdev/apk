package io.elevenlabs.ocr;

import com.google.protobuf.c6;
import fr.d0;
import ka.j0;
import kotlin.Metadata;
import t1.z;
import u2.x0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportScreenKt$CameraView$4$1", f = "OcrImportScreen.kt", l = {540}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportScreenKt$CameraView$4$1 extends yn.i implements ho.p {
    final /* synthetic */ x0 $lastImageCount$delegate;
    final /* synthetic */ z $previewsListState;
    final /* synthetic */ OcrImportState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportScreenKt$CameraView$4$1(OcrImportState ocrImportState, z zVar, x0 x0Var, wn.c<? super OcrImportScreenKt$CameraView$4$1> cVar) {
        super(2, cVar);
        this.$state = ocrImportState;
        this.$previewsListState = zVar;
        this.$lastImageCount$delegate = x0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new OcrImportScreenKt$CameraView$4$1(this.$state, this.$previewsListState, this.$lastImageCount$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((OcrImportScreenKt$CameraView$4$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int CameraView$lambda$19;
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
            CameraView$lambda$19 = OcrImportScreenKt.CameraView$lambda$19(this.$lastImageCount$delegate);
            if (CameraView$lambda$19 < this.$state.getImages().size()) {
                z zVar = this.$previewsListState;
                int y10 = ig.f.y(this.$state.getImages());
                this.label = 1;
                j0 j0Var = z.f31871x;
                Object f10 = zVar.f(y10, 0, this);
                xn.a aVar = xn.a.f37986a;
                if (f10 == aVar) {
                    return aVar;
                }
            }
        }
        OcrImportScreenKt.CameraView$lambda$20(this.$lastImageCount$delegate, this.$state.getImages().size());
        return sn.z.f31622a;
    }
}
