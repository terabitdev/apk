package io.elevenlabs.readerapp.ui.components;

import android.graphics.Bitmap;
import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.components.PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1", f = "PaletteUtils.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lwa/e;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lfr/d0;)Lwa/e;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Bitmap $bmp;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1(Bitmap bitmap, wn.c<? super PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1> cVar) {
        super(2, cVar);
        this.$bmp = bitmap;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1(this.$bmp, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super wa.e> cVar) {
        return ((PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            return new f7.q(this.$bmp).a();
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
