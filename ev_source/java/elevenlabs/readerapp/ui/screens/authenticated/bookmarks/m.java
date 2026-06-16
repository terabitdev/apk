package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import ho.p;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15272a;

    public /* synthetic */ m(int i10) {
        this.f15272a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda_131822061$lambda$0;
        int i10 = this.f15272a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                lambda_131822061$lambda$0 = ComposableSingletons$BookmarkShareDisclaimerSheetKt.lambda_131822061$lambda$0(mVar, intValue);
                return lambda_131822061$lambda$0;
            case 1:
                return ComposableSingletons$PreviewBookmarkRowDefaultGroupPreviewBookmarkRowKt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewBookmarkShareDisclaimerSheetDefaultGroupPreviewBookmarkShareDisclaimerSheetKt.a(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewBookmarkSheetDefaultGroupPreviewBookmarkSheetKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewBookmarkSheetShareableDefaultGroupPreviewBookmarkSheetShareableKt.a(mVar, intValue);
            case 5:
                return ComposableSingletons$PreviewEditBookmarkSheetIdleDefaultGroupPreviewEditBookmarkSheetIdleKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewEditBookmarkSheetWithExistingNoteDefaultGroupPreviewEditBookmarkSheetWithExistingNoteKt.a(mVar, intValue);
        }
    }
}
