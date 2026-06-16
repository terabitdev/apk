package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16947a;

    public /* synthetic */ m(int i10) {
        this.f16947a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16947a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewReadShareSheetErrorDefaultGroupPreviewReadShareSheetErrorKt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewReadShareSheetIdleDefaultGroupPreviewReadShareSheetIdleKt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewWriteScreenIdleDefaultGroupPreviewWriteScreenIdleKt.a(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewWriteScreenInputDefaultGroupPreviewWriteScreenInputKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewWriteScreenInputLongDefaultGroupPreviewWriteScreenInputLongKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewWriteScreenLoadingDefaultGroupPreviewWriteScreenLoadingKt.a(mVar, intValue);
        }
    }
}
