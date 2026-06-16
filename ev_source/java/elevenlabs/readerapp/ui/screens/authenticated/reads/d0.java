package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImportLinkViewModel f16759b;

    public /* synthetic */ d0(ImportLinkViewModel importLinkViewModel, int i10) {
        this.f16758a = i10;
        this.f16759b = importLinkViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z ImportLinkScreen$lambda$4$0$0;
        sn.z ImportLinkScreen$lambda$5$0;
        ImportLinkState onParsingError$lambda$0;
        ImportLinkState onListenClick$lambda$0;
        switch (this.f16758a) {
            case 0:
                ImportLinkScreen$lambda$4$0$0 = ImportLinkScreenKt.ImportLinkScreen$lambda$4$0$0(this.f16759b, (ho.l) obj);
                return ImportLinkScreen$lambda$4$0$0;
            case 1:
                ImportLinkScreen$lambda$5$0 = ImportLinkScreenKt.ImportLinkScreen$lambda$5$0(this.f16759b, (ho.l) obj);
                return ImportLinkScreen$lambda$5$0;
            case 2:
                onParsingError$lambda$0 = ImportLinkViewModel.onParsingError$lambda$0(this.f16759b, (ImportLinkState) obj);
                return onParsingError$lambda$0;
            default:
                onListenClick$lambda$0 = ImportLinkViewModel.onListenClick$lambda$0(this.f16759b, (ImportLinkState) obj);
                return onListenClick$lambda$0;
        }
    }
}
