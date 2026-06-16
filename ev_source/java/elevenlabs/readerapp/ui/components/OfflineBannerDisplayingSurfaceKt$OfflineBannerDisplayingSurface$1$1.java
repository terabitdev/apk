package io.elevenlabs.readerapp.ui.components;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.protobuf.c6;
import k6.h2;
import k6.k2;
import kotlin.Metadata;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.components.OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1", f = "OfflineBannerDisplayingSurface.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ s2 $displayOfflineBanner$delegate;
    final /* synthetic */ boolean $isDarkTheme;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1(Activity activity, boolean z6, View view, s2 s2Var, wn.c<? super OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1> cVar) {
        super(2, cVar);
        this.$activity = activity;
        this.$isDarkTheme = z6;
        this.$view = view;
        this.$displayOfflineBanner$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1(this.$activity, this.$isDarkTheme, this.$view, this.$displayOfflineBanner$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((OfflineBannerDisplayingSurfaceKt$OfflineBannerDisplayingSurface$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Window window;
        kj.c h2Var;
        boolean OfflineBannerDisplayingSurface$lambda$1;
        if (this.label == 0) {
            sn.a.g(obj);
            Activity activity = this.$activity;
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            if (!this.$isDarkTheme && window != null) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 35) {
                    h2Var = new k2(window);
                } else if (i10 >= 30) {
                    h2Var = new k2(window);
                } else if (i10 >= 26) {
                    h2Var = new h2(window);
                } else {
                    h2Var = new h2(window);
                }
                OfflineBannerDisplayingSurface$lambda$1 = OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface$lambda$1(this.$displayOfflineBanner$delegate);
                h2Var.M(!OfflineBannerDisplayingSurface$lambda$1);
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
