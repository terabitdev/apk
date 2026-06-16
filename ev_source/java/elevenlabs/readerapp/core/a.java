package io.elevenlabs.readerapp.core;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14343a;

    public /* synthetic */ a(int i10) {
        this.f14343a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f14343a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewMessageBottomSheetUIfullDefaultGroupPreviewMessageBottomSheetUIfullKt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewSurveySheetOpenDefaultGroupPreviewSurveySheetOpenKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewSurveySheetSingleSelectDefaultGroupPreviewSurveySheetSingleSelectKt.a(mVar, intValue);
        }
    }
}
