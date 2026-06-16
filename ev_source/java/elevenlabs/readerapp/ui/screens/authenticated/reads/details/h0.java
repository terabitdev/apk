package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16816a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReadDetailsViewModel f16818c;

    public /* synthetic */ h0(ReadDetailsViewModel readDetailsViewModel, String str) {
        this.f16818c = readDetailsViewModel;
        this.f16817b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReadDetailsState handleAddToLibrarySuccess$lambda$0;
        ReadDetailsState loadStoreProduct$lambda$0;
        switch (this.f16816a) {
            case 0:
                handleAddToLibrarySuccess$lambda$0 = ReadDetailsViewModel.handleAddToLibrarySuccess$lambda$0(this.f16818c, this.f16817b, (ReadDetailsState) obj);
                return handleAddToLibrarySuccess$lambda$0;
            default:
                loadStoreProduct$lambda$0 = ReadDetailsViewModel.loadStoreProduct$lambda$0(this.f16817b, this.f16818c, (ReadDetailsState) obj);
                return loadStoreProduct$lambda$0;
        }
    }

    public /* synthetic */ h0(String str, ReadDetailsViewModel readDetailsViewModel) {
        this.f16817b = str;
        this.f16818c = readDetailsViewModel;
    }
}
