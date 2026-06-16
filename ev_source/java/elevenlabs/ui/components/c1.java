package io.elevenlabs.ui.components;

import q2.j6;
import q2.x5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17296b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.f17295a = i10;
        this.f17296b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z InternalFullWidthButton_dqcolps$lambda$4$2;
        sn.z ErrorContainer$lambda$0;
        sn.z Menu_ILWXrKs$lambda$3$0;
        sn.z Slider$lambda$2;
        sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$0;
        switch (this.f17295a) {
            case 0:
                InternalFullWidthButton_dqcolps$lambda$4$2 = FullWidthButtonKt.InternalFullWidthButton_dqcolps$lambda$4$2((ButtonSpecs) this.f17296b, (i1.g0) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return InternalFullWidthButton_dqcolps$lambda$4$2;
            case 1:
                ErrorContainer$lambda$0 = ErrorContainerKt.ErrorContainer$lambda$0((String) this.f17296b, (r1.l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ErrorContainer$lambda$0;
            case 2:
                Menu_ILWXrKs$lambda$3$0 = MenuKt.Menu_ILWXrKs$lambda$3$0((Iterable) this.f17296b, (r1.y) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return Menu_ILWXrKs$lambda$3$0;
            case 3:
                Slider$lambda$2 = SliderKt.Slider$lambda$2((x5) this.f17296b, (j6) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return Slider$lambda$2;
            default:
                Preview_SwipeToActionBox_StartSideOpen$lambda$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_StartSideOpen$lambda$0((ActionConfig) this.f17296b, (ActionSpecBuilder) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return Preview_SwipeToActionBox_StartSideOpen$lambda$0;
        }
    }
}
