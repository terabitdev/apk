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
@yn.e(c = "io.elevenlabs.readerapp.ui.components.AnnouncementBannerCarouselKt$rememberImageAndColor$1$1", f = "AnnouncementBannerCarousel.kt", l = {260}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu2/o1;", "Lsn/k;", "Lp3/k0;", "Lp3/x;", "Lsn/z;", "<anonymous>", "(Lu2/o1;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AnnouncementBannerCarouselKt$rememberImageAndColor$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $skipColorExtraction;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementBannerCarouselKt$rememberImageAndColor$1$1(String str, Context context, boolean z6, wn.c<? super AnnouncementBannerCarouselKt$rememberImageAndColor$1$1> cVar) {
        super(2, cVar);
        this.$url = str;
        this.$context = context;
        this.$skipColorExtraction = z6;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        AnnouncementBannerCarouselKt$rememberImageAndColor$1$1 announcementBannerCarouselKt$rememberImageAndColor$1$1 = new AnnouncementBannerCarouselKt$rememberImageAndColor$1$1(this.$url, this.$context, this.$skipColorExtraction, cVar);
        announcementBannerCarouselKt$rememberImageAndColor$1$1.L$0 = obj;
        return announcementBannerCarouselKt$rememberImageAndColor$1$1;
    }

    @Override // ho.p
    public final Object invoke(o1 o1Var, wn.c<? super sn.z> cVar) {
        return ((AnnouncementBannerCarouselKt$rememberImageAndColor$1$1) create(o1Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        wa.e eVar;
        Integer num;
        wa.d dVar;
        p3.x xVar;
        wa.d a10;
        o1 o1Var = (o1) this.L$0;
        int i10 = this.label;
        sn.z zVar = sn.z.f31622a;
        p3.f fVar = null;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            String str = this.$url;
            if (str != null && str.length() != 0) {
                ad.h hVar = new ad.h(this.$context);
                hVar.f1788c = this.$url;
                hVar.f1798m = Boolean.FALSE;
                ad.i a11 = hVar.a();
                pc.j a12 = new pc.e(this.$context).a();
                this.L$0 = o1Var;
                this.L$1 = null;
                this.label = 1;
                obj = a12.c(a11, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
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
        if (!this.$skipColorExtraction) {
            if (bitmap != null) {
                eVar = new f7.q(bitmap).a();
            } else {
                eVar = null;
            }
            if (eVar != null && (a10 = eVar.a(wa.f.f36931i)) != null) {
                num = new Integer(a10.f36914d);
            } else if (eVar != null && (dVar = eVar.f36925e) != null) {
                num = new Integer(dVar.f36914d);
            } else {
                num = null;
            }
            if (num != null) {
                xVar = new p3.x(p3.h0.c(num.intValue()));
                if (bitmap != null) {
                    fVar = new p3.f(bitmap);
                }
                ((p1) o1Var).setValue(new sn.k(fVar, xVar));
                return zVar;
            }
        }
        xVar = null;
        if (bitmap != null) {
        }
        ((p1) o1Var).setValue(new sn.k(fVar, xVar));
        return zVar;
    }
}
