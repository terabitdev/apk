package io.elevenlabs.ocr;

import com.google.protobuf.c6;
import fr.d0;
import kotlin.Metadata;
import m0.b0;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportScreenKt$CameraView$3$1", f = "OcrImportScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportScreenKt$CameraView$3$1 extends yn.i implements ho.p {
    final /* synthetic */ z0 $camera$delegate;
    final /* synthetic */ z0 $torchEnabled$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportScreenKt$CameraView$3$1(z0 z0Var, z0 z0Var2, wn.c<? super OcrImportScreenKt$CameraView$3$1> cVar) {
        super(2, cVar);
        this.$camera$delegate = z0Var;
        this.$torchEnabled$delegate = z0Var2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OcrImportScreenKt$CameraView$3$1(this.$camera$delegate, this.$torchEnabled$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((OcrImportScreenKt$CameraView$3$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        g0.k CameraView$lambda$12;
        b0 a10;
        boolean CameraView$lambda$1;
        if (this.label == 0) {
            sn.a.g(obj);
            CameraView$lambda$12 = OcrImportScreenKt.CameraView$lambda$12(this.$camera$delegate);
            if (CameraView$lambda$12 != null && (a10 = CameraView$lambda$12.a()) != null) {
                CameraView$lambda$1 = OcrImportScreenKt.CameraView$lambda$1(this.$torchEnabled$delegate);
                a10.d(CameraView$lambda$1);
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
