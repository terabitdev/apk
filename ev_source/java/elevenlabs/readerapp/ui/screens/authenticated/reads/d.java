package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn.d f16757b;

    public /* synthetic */ d(sn.d dVar, int i10) {
        this.f16756a = i10;
        this.f16757b = dVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z AddSharedReadScreenUI$lambda$2;
        sn.z ImportFileScreenUI$lambda$1;
        sn.z MoreActionsSheetUI$lambda$0$0;
        sn.z PasteLinkScreenUI$lambda$1;
        sn.z ImportLinkScreenUI$lambda$1$0$1;
        switch (this.f16756a) {
            case 0:
                AddSharedReadScreenUI$lambda$2 = AddSharedReadScreenKt.AddSharedReadScreenUI$lambda$2((ho.a) this.f16757b, (u2.m) obj, ((Integer) obj2).intValue());
                return AddSharedReadScreenUI$lambda$2;
            case 1:
                ImportFileScreenUI$lambda$1 = ImportFileScreenKt.ImportFileScreenUI$lambda$1((ho.a) this.f16757b, (u2.m) obj, ((Integer) obj2).intValue());
                return ImportFileScreenUI$lambda$1;
            case 2:
                MoreActionsSheetUI$lambda$0$0 = MoreActionsSheetKt.MoreActionsSheetUI$lambda$0$0((ho.a) this.f16757b, (u2.m) obj, ((Integer) obj2).intValue());
                return MoreActionsSheetUI$lambda$0$0;
            case 3:
                PasteLinkScreenUI$lambda$1 = PasteLinkScreenKt.PasteLinkScreenUI$lambda$1((ho.a) this.f16757b, (u2.m) obj, ((Integer) obj2).intValue());
                return PasteLinkScreenUI$lambda$1;
            default:
                ImportLinkScreenUI$lambda$1$0$1 = ImportLinkScreenKt.ImportLinkScreenUI$lambda$1$0$1((ho.l) this.f16757b, (u2.m) obj, ((Integer) obj2).intValue());
                return ImportLinkScreenUI$lambda$1$0$1;
        }
    }
}
