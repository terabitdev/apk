package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16111b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f16110a = i10;
        this.f16111b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z ContentSearchBottomSheetUI$lambda$2$2$0$0;
        sn.z ExportSheetUI$lambda$2$0;
        switch (this.f16110a) {
            case 0:
                ContentSearchBottomSheetUI$lambda$2$2$0$0 = ContentSearchSheetKt.ContentSearchBottomSheetUI$lambda$2$2$0$0((ContentSearchState) this.f16111b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ContentSearchBottomSheetUI$lambda$2$2$0$0;
            default:
                ExportSheetUI$lambda$2$0 = ExportSheetKt.ExportSheetUI$lambda$2$0((ho.a) this.f16111b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ExportSheetUI$lambda$2$0;
        }
    }
}
