package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.ui.echo.components.ButtonIconKt;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f14511b;

    public /* synthetic */ a0(s2 s2Var, int i10) {
        this.f14510a = i10;
        this.f14511b = s2Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        h5.j OfflineBannerDisplayingSurface$lambda$11$0$2$0;
        sn.z ButtonIcon_FhKo8ac$lambda$3$0$0;
        switch (this.f14510a) {
            case 0:
                OfflineBannerDisplayingSurface$lambda$11$0$2$0 = OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface$lambda$11$0$2$0(this.f14511b, (h5.c) obj);
                return OfflineBannerDisplayingSurface$lambda$11$0$2$0;
            case 1:
                r3.e eVar = (r3.e) obj;
                long j4 = ((p3.x) this.f14511b.getValue()).f26440a;
                if (!p3.x.c(j4, p3.x.f26438m)) {
                    r3.e.q0(eVar, j4, 0L, 0L, t2.u.P, null, 0, 126);
                }
                return sn.z.f31622a;
            case 2:
                ((p3.y0) ((p3.i0) obj)).c(((Number) this.f14511b.getValue()).floatValue());
                return sn.z.f31622a;
            default:
                ButtonIcon_FhKo8ac$lambda$3$0$0 = ButtonIconKt.ButtonIcon_FhKo8ac$lambda$3$0$0(this.f14511b, (p3.i0) obj);
                return ButtonIcon_FhKo8ac$lambda$3$0$0;
        }
    }
}
