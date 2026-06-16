package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSignOutWarningDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDisclaimerSheetKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f14705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f14706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14707d;

    public /* synthetic */ j1(ho.a aVar, ho.a aVar2, int i10, int i11) {
        this.f14704a = i11;
        this.f14705b = aVar;
        this.f14706c = aVar2;
        this.f14707d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z WhatsNewPopup$lambda$1;
        sn.z AccountSignOutWarningGenericDialog$lambda$0;
        sn.z AccountSignOutWarningDownloadedReadsDialog$lambda$1;
        sn.z BookmarkShareDisclaimerSheetUI$lambda$1;
        sn.z BookmarkShareDisclaimerSheet$lambda$1;
        int i10 = this.f14704a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                WhatsNewPopup$lambda$1 = WhatsNewPopupKt.WhatsNewPopup$lambda$1(this.f14705b, this.f14706c, this.f14707d, mVar, intValue);
                return WhatsNewPopup$lambda$1;
            case 1:
                AccountSignOutWarningGenericDialog$lambda$0 = AccountSignOutWarningDialogKt.AccountSignOutWarningGenericDialog$lambda$0(this.f14705b, this.f14706c, this.f14707d, mVar, intValue);
                return AccountSignOutWarningGenericDialog$lambda$0;
            case 2:
                AccountSignOutWarningDownloadedReadsDialog$lambda$1 = AccountSignOutWarningDialogKt.AccountSignOutWarningDownloadedReadsDialog$lambda$1(this.f14705b, this.f14706c, this.f14707d, mVar, intValue);
                return AccountSignOutWarningDownloadedReadsDialog$lambda$1;
            case 3:
                BookmarkShareDisclaimerSheetUI$lambda$1 = BookmarkShareDisclaimerSheetKt.BookmarkShareDisclaimerSheetUI$lambda$1(this.f14705b, this.f14706c, this.f14707d, mVar, intValue);
                return BookmarkShareDisclaimerSheetUI$lambda$1;
            default:
                BookmarkShareDisclaimerSheet$lambda$1 = BookmarkShareDisclaimerSheetKt.BookmarkShareDisclaimerSheet$lambda$1(this.f14705b, this.f14706c, this.f14707d, mVar, intValue);
                return BookmarkShareDisclaimerSheet$lambda$1;
        }
    }
}
