package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f16910b;

    public /* synthetic */ f(int i10, ho.a aVar) {
        this.f16909a = i10;
        this.f16910b = aVar;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z AddSharedReadScreenUI$lambda$2$0$0$0;
        sn.z GenFMLoadingUI$lambda$6$0$0$1$6$0;
        switch (this.f16909a) {
            case 0:
                AddSharedReadScreenUI$lambda$2$0$0$0 = AddSharedReadScreenKt.AddSharedReadScreenUI$lambda$2$0$0$0(this.f16910b);
                return AddSharedReadScreenUI$lambda$2$0$0$0;
            case 1:
                GenFMLoadingUI$lambda$6$0$0$1$6$0 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$6$0(this.f16910b);
                return GenFMLoadingUI$lambda$6$0$0$1$6$0;
            case 2:
                return ImportFileScreenKt.r(this.f16910b);
            case 3:
                return ImportFileScreenKt.o(this.f16910b);
            default:
                return Boolean.valueOf(MoreActionsSheetKt.y(this.f16910b));
        }
    }
}
