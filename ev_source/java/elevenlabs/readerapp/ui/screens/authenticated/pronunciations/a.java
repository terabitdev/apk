package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16576a;

    public /* synthetic */ a(int i10) {
        this.f16576a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16576a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewAddPronunciationScreenUIDefaultGroupPreviewAddPronunciationScreenUIKt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewAddPronunciationScreenUIErrorDefaultGroupPreviewAddPronunciationScreenUIErrorKt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewAddPronunciationScreenUILoadingDefaultGroupPreviewAddPronunciationScreenUILoadingKt.a(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewPronunciationsListScreenUIDefaultGroupPreviewPronunciationsListScreenUIKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewPronunciationsListScreenUIEmptyDefaultGroupPreviewPronunciationsListScreenUIEmptyKt.a(mVar, intValue);
            case 5:
                return ComposableSingletons$PreviewPronunciationsListScreenUILoadingDefaultGroupPreviewPronunciationsListScreenUILoadingKt.a(mVar, intValue);
            case 6:
                return ComposableSingletons$PronunciationScreenKt.c(mVar, intValue);
            case 7:
                return ComposableSingletons$PronunciationScreenKt.i(mVar, intValue);
            case 8:
                return ComposableSingletons$PronunciationScreenKt.f(mVar, intValue);
            case 9:
                return ComposableSingletons$PronunciationScreenKt.g(mVar, intValue);
            case 10:
                return ComposableSingletons$PronunciationsListScreenKt.i(mVar, intValue);
            case 11:
                return ComposableSingletons$PronunciationsListScreenKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PronunciationsListScreenKt.m(mVar, intValue);
        }
    }
}
