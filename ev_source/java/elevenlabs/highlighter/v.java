package io.elevenlabs.highlighter;

import ho.r;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SpeedPickerSheetKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14253c;

    public /* synthetic */ v(float f10, Object obj, int i10) {
        this.f14251a = i10;
        this.f14252b = f10;
        this.f14253c = obj;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z ImageElement$lambda$1$3$1;
        sn.z SpeedPickerSheet$lambda$1;
        switch (this.f14251a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                ImageElement$lambda$1$3$1 = HighlighterKt.ImageElement$lambda$1$3$1(this.f14252b, (ad.i) this.f14253c, (qc.x) obj, (qc.f) obj2, (u2.m) obj3, intValue);
                return ImageElement$lambda$1$3$1;
            default:
                int intValue2 = ((Integer) obj4).intValue();
                SpeedPickerSheet$lambda$1 = SpeedPickerSheetKt.SpeedPickerSheet$lambda$1(this.f14252b, (ho.l) this.f14253c, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue2);
                return SpeedPickerSheet$lambda$1;
        }
    }
}
