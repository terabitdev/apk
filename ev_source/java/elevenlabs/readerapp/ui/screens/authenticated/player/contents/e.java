package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import ho.p;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16009a;

    public /* synthetic */ e(int i10) {
        this.f16009a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda__1704353767$lambda$0;
        z lambda_414108030$lambda$0;
        z lambda_1418536190$lambda$0;
        z lambda_857536661$lambda$0;
        int i10 = this.f16009a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                lambda__1704353767$lambda$0 = ComposableSingletons$ChapterDownloadStatusIconKt.lambda__1704353767$lambda$0(mVar, intValue);
                return lambda__1704353767$lambda$0;
            case 1:
                lambda_414108030$lambda$0 = ComposableSingletons$ChapterDownloadStatusIconKt.lambda_414108030$lambda$0(mVar, intValue);
                return lambda_414108030$lambda$0;
            case 2:
                lambda_1418536190$lambda$0 = ComposableSingletons$ChapterDownloadStatusIconKt.lambda_1418536190$lambda$0(mVar, intValue);
                return lambda_1418536190$lambda$0;
            case 3:
                lambda_857536661$lambda$0 = ComposableSingletons$PlayerContentsScreenKt.lambda_857536661$lambda$0(mVar, intValue);
                return lambda_857536661$lambda$0;
            case 4:
                return ComposableSingletons$PreviewChapterDownloadStatusIconDefaultGroupPreviewChapterDownloadStatusIconKt.a(mVar, intValue);
            case 5:
                return ComposableSingletons$PreviewChapterDownloadStatusIconDownloadingDefaultGroupPreviewChapterDownloadStatusIconDownloadingKt.a(mVar, intValue);
            case 6:
                return ComposableSingletons$PreviewChapterDownloadStatusIconNotDownloadedDefaultGroupPreviewChapterDownloadStatusIconNotDownloadedKt.a(mVar, intValue);
            case 7:
                return ComposableSingletons$PreviewChapterListItemDefaultGroupPreviewChapterListItemKt.a(mVar, intValue);
            case 8:
                return ComposableSingletons$PreviewPlayerContentsScreenUIDefaultGroupPreviewPlayerContentsScreenUIKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewPlayerContentsScreenUIEmptyDefaultGroupPreviewPlayerContentsScreenUIEmptyKt.a(mVar, intValue);
        }
    }
}
