package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16119b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f16118a = i10;
        this.f16119b = obj;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z ExportSheet$lambda$1;
        sn.z SleepTimerSheet$lambda$2;
        switch (this.f16118a) {
            case 0:
                ExportSheet$lambda$1 = ExportSheetKt.ExportSheet$lambda$1((ho.l) this.f16119b, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return ExportSheet$lambda$1;
            default:
                SleepTimerSheet$lambda$2 = SleepTimerSheetKt.SleepTimerSheet$lambda$2((SleepTimerViewModel) this.f16119b, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return SleepTimerSheet$lambda$2;
        }
    }
}
