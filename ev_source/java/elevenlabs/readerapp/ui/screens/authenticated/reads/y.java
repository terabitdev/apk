package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImportFileViewModel f17009b;

    public /* synthetic */ y(ImportFileViewModel importFileViewModel, int i10) {
        this.f17008a = i10;
        this.f17009b = importFileViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z ImportFileScreen$lambda$8$0;
        ImportFileState listen$lambda$0;
        switch (this.f17008a) {
            case 0:
                ImportFileScreen$lambda$8$0 = ImportFileScreenKt.ImportFileScreen$lambda$8$0(this.f17009b, (ho.l) obj);
                return ImportFileScreen$lambda$8$0;
            default:
                listen$lambda$0 = ImportFileViewModel.listen$lambda$0(this.f17009b, (ImportFileState) obj);
                return listen$lambda$0;
        }
    }
}
