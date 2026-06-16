package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.protobuf.c6;
import kotlin.Metadata;
import u2.o1;
import u2.p1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.components.PaletteUtilsKt$rememberHeaderColor$1$1", f = "PaletteUtils.kt", l = {38, 41}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu2/o1;", "Lp3/x;", "Lsn/z;", "<anonymous>", "(Lu2/o1;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PaletteUtilsKt$rememberHeaderColor$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isDarkMode;
    final /* synthetic */ String $url;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaletteUtilsKt$rememberHeaderColor$1$1(String str, Context context, boolean z6, wn.c<? super PaletteUtilsKt$rememberHeaderColor$1$1> cVar) {
        super(2, cVar);
        this.$url = str;
        this.$context = context;
        this.$isDarkMode = z6;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        PaletteUtilsKt$rememberHeaderColor$1$1 paletteUtilsKt$rememberHeaderColor$1$1 = new PaletteUtilsKt$rememberHeaderColor$1$1(this.$url, this.$context, this.$isDarkMode, cVar);
        paletteUtilsKt$rememberHeaderColor$1$1.L$0 = obj;
        return paletteUtilsKt$rememberHeaderColor$1$1;
    }

    @Override // ho.p
    public final Object invoke(o1 o1Var, wn.c<? super sn.z> cVar) {
        return ((PaletteUtilsKt$rememberHeaderColor$1$1) create(o1Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r8 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006b, code lost:
    
        if (r8 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        wa.e eVar;
        wa.d a10;
        wa.d dVar;
        p3.x xVar;
        o1 o1Var = (o1) this.L$0;
        int i10 = this.label;
        sn.z zVar = sn.z.f31622a;
        Integer num = null;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    eVar = (wa.e) obj;
                    if (!this.$isDarkMode) {
                        if (eVar == null || (a10 = eVar.a(wa.f.f36931i)) == null) {
                            if (eVar != null) {
                                a10 = eVar.a(wa.f.f36930h);
                            }
                            a10 = null;
                        }
                        if (a10 == null) {
                            num = new Integer(a10.f36914d);
                        } else if (eVar != null && (dVar = eVar.f36925e) != null) {
                            num = new Integer(dVar.f36914d);
                        }
                        if (num == null) {
                            xVar = new p3.x(p3.h0.c(num.intValue()));
                        } else {
                            xVar = new p3.x(PaletteUtilsKt.getHeaderColorFallback());
                        }
                        ((p1) o1Var).setValue(xVar);
                        return zVar;
                    }
                    if (eVar == null || (a10 = eVar.a(wa.f.f36930h)) == null) {
                        if (eVar != null) {
                            a10 = eVar.a(wa.f.f36929g);
                        }
                        a10 = null;
                    }
                    if (a10 == null) {
                    }
                    if (num == null) {
                    }
                    ((p1) o1Var).setValue(xVar);
                    return zVar;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            String str = this.$url;
            if (str != null && str.length() != 0) {
                ad.h hVar = new ad.h(this.$context);
                hVar.f1788c = this.$url;
                hVar.f1798m = Boolean.FALSE;
                ad.i a11 = hVar.a();
                pc.f a12 = pc.a.a(this.$context);
                this.L$0 = o1Var;
                this.L$1 = null;
                this.label = 1;
                obj = ((pc.j) a12).c(a11, this);
            }
            return zVar;
        }
        Drawable a13 = ((ad.j) obj).a();
        if (a13 instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) a13;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            mr.e eVar2 = fr.r0.f9888a;
            PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1 paletteUtilsKt$rememberHeaderColor$1$1$palette$1$1 = new PaletteUtilsKt$rememberHeaderColor$1$1$palette$1$1(bitmap, null);
            this.L$0 = o1Var;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = 0;
            this.label = 2;
            obj = fr.g0.Q(eVar2, paletteUtilsKt$rememberHeaderColor$1$1$palette$1$1, this);
        } else {
            eVar = null;
            if (!this.$isDarkMode) {
            }
        }
    }
}
