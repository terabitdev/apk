package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16126b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f16125a = i10;
        this.f16126b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z FullScreenImage$lambda$0$0;
        sn.z FullScreenImage$lambda$2$0;
        sn.z SpeedPickerSheet$lambda$0$0;
        sn.z BookmarksSheetUI$lambda$6$0;
        switch (this.f16125a) {
            case 0:
                FullScreenImage$lambda$0$0 = FullScreenImageKt.FullScreenImage$lambda$0$0((ho.l) this.f16126b);
                return FullScreenImage$lambda$0$0;
            case 1:
                FullScreenImage$lambda$2$0 = FullScreenImageKt.FullScreenImage$lambda$2$0((ho.l) this.f16126b);
                return FullScreenImage$lambda$2$0;
            case 2:
                SpeedPickerSheet$lambda$0$0 = SpeedPickerSheetKt.SpeedPickerSheet$lambda$0$0((ho.l) this.f16126b);
                return SpeedPickerSheet$lambda$0$0;
            default:
                BookmarksSheetUI$lambda$6$0 = BookmarksSheetKt.BookmarksSheetUI$lambda$6$0((z0) this.f16126b);
                return BookmarksSheetUI$lambda$6$0;
        }
    }
}
