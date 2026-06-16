package io.elevenlabs.ocr;

import android.content.Context;
import androidx.room.m0;
import com.google.protobuf.c6;
import fr.d0;
import kotlin.Metadata;
import lh.b0;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportScreenKt$CameraView$1$1", f = "OcrImportScreen.kt", l = {493}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportScreenKt$CameraView$1$1 extends yn.i implements ho.p {
    final /* synthetic */ z0 $cameraProvider$delegate;
    final /* synthetic */ Context $context;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportScreenKt$CameraView$1$1(Context context, z0 z0Var, wn.c<? super OcrImportScreenKt$CameraView$1$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$cameraProvider$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OcrImportScreenKt$CameraView$1$1(this.$context, this.$cameraProvider$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((OcrImportScreenKt$CameraView$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        Object await;
        z0 z0Var;
        xn.a aVar = xn.a.f37986a;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                z0Var = (z0) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            z0 z0Var2 = this.$cameraProvider$delegate;
            b1.h hVar = b1.h.f4142b;
            Context context = this.$context;
            context.getClass();
            b1.e eVar = b1.h.f4142b.f4143a;
            synchronized (eVar.f4126b) {
                b0Var = (p0.d) eVar.f4127c;
                if (b0Var == null) {
                    g0.t tVar = new g0.t(context, null);
                    p0.b g10 = p0.j.g(p0.d.b((b0) eVar.f4128d), new b1.c(new a2.b(tVar, 6), 0), m0.A());
                    eVar.f4127c = g10;
                    a5.a aVar2 = new a5.a(eVar, tVar, context, 3);
                    g10.a(new p0.i(g10, aVar2, 0), m0.A());
                    b0Var = p0.j.d(g10);
                }
            }
            a9.a aVar3 = new a9.a(new a2.p(16), 21);
            p0.b g11 = p0.j.g(b0Var, new j8.g(aVar3), m0.A());
            Context context2 = this.$context;
            this.L$0 = z0Var2;
            this.label = 1;
            await = OcrImportScreenKt.await(g11, context2, this);
            if (await == aVar) {
                return aVar;
            }
            z0Var = z0Var2;
            obj = await;
        }
        z0Var.setValue((b1.h) obj);
        return z.f31622a;
    }
}
