package io.elevenlabs.ocr;

import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import g0.i0;
import kotlin.Metadata;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportScreenKt$CameraView$5$1$4$1$3$4$1$2", f = "OcrImportScreen.kt", l = {668}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportScreenKt$CameraView$5$1$4$1$3$4$1$2 extends yn.i implements ho.p {
    final /* synthetic */ ho.l $action;
    final /* synthetic */ Context $context;
    final /* synthetic */ i0 $imageCapture;
    final /* synthetic */ z0 $shutterOpen$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportScreenKt$CameraView$5$1$4$1$3$4$1$2(Context context, i0 i0Var, ho.l lVar, z0 z0Var, wn.c<? super OcrImportScreenKt$CameraView$5$1$4$1$3$4$1$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$imageCapture = i0Var;
        this.$action = lVar;
        this.$shutterOpen$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OcrImportScreenKt$CameraView$5$1$4$1$3$4$1$2(this.$context, this.$imageCapture, this.$action, this.$shutterOpen$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((OcrImportScreenKt$CameraView$5$1$4$1$3$4$1$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            OcrImportScreenKt.CameraView$lambda$22$0$2(this.$shutterOpen$delegate, false);
            OcrImportScreenKt.captureImage(this.$context, this.$imageCapture, this.$action);
            xq.a aVar = xq.b.f38124b;
            long n2 = xq.g.n(100, xq.d.MILLISECONDS);
            this.label = 1;
            Object n10 = g0.n(n2, this);
            xn.a aVar2 = xn.a.f37986a;
            if (n10 == aVar2) {
                return aVar2;
            }
        }
        OcrImportScreenKt.CameraView$lambda$22$0$2(this.$shutterOpen$delegate, true);
        return z.f31622a;
    }
}
