package io.elevenlabs.ui.components.animations;

import ec.t;
import ho.p;
import sn.z;
import u2.m;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f17263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17264d;

    public /* synthetic */ a(boolean z6, p pVar, int i10, int i11) {
        this.f17261a = i11;
        this.f17262b = z6;
        this.f17263c = pVar;
        this.f17264d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z AnimatedFadeVisibility$lambda$1;
        z AnimatedSlideDownWithFadeVisibility$lambda$3;
        z AnimatedSlideBottomVisibility$lambda$3;
        z AnimatedSlideTopVisibility$lambda$3;
        z AnimatedSlideTopWithFadeVisibility$lambda$3;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f17261a) {
            case 0:
                AnimatedFadeVisibility$lambda$1 = AnimatedVisibilityContainersKt.AnimatedFadeVisibility$lambda$1(this.f17262b, this.f17263c, this.f17264d, mVar, num.intValue());
                return AnimatedFadeVisibility$lambda$1;
            case 1:
                AnimatedSlideDownWithFadeVisibility$lambda$3 = AnimatedVisibilityContainersKt.AnimatedSlideDownWithFadeVisibility$lambda$3(this.f17262b, this.f17263c, this.f17264d, mVar, num.intValue());
                return AnimatedSlideDownWithFadeVisibility$lambda$3;
            case 2:
                AnimatedSlideBottomVisibility$lambda$3 = AnimatedVisibilityContainersKt.AnimatedSlideBottomVisibility$lambda$3(this.f17262b, this.f17263c, this.f17264d, mVar, num.intValue());
                return AnimatedSlideBottomVisibility$lambda$3;
            case 3:
                AnimatedSlideTopVisibility$lambda$3 = AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility$lambda$3(this.f17262b, this.f17263c, this.f17264d, mVar, num.intValue());
                return AnimatedSlideTopVisibility$lambda$3;
            case 4:
                AnimatedSlideTopWithFadeVisibility$lambda$3 = AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility$lambda$3(this.f17262b, this.f17263c, this.f17264d, mVar, num.intValue());
                return AnimatedSlideTopWithFadeVisibility$lambda$3;
            default:
                num.getClass();
                t.h(this.f17262b, this.f17263c, mVar, r.M(this.f17264d | 1));
                return z.f31622a;
        }
    }
}
