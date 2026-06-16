package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSignOutWarningDialogKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f14689b;

    public /* synthetic */ i1(int i10, ho.a aVar) {
        this.f14688a = i10;
        this.f14689b = aVar;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z WhatsNewPopup$lambda$0;
        sn.z AccountSignOutWarningDownloadedReadsDialog$lambda$0;
        int i10 = this.f14688a;
        r1.y yVar = (r1.y) obj;
        BottomSheetControl bottomSheetControl = (BottomSheetControl) obj2;
        u2.m mVar = (u2.m) obj3;
        int intValue = ((Integer) obj4).intValue();
        switch (i10) {
            case 0:
                WhatsNewPopup$lambda$0 = WhatsNewPopupKt.WhatsNewPopup$lambda$0(this.f14689b, yVar, bottomSheetControl, mVar, intValue);
                return WhatsNewPopup$lambda$0;
            default:
                AccountSignOutWarningDownloadedReadsDialog$lambda$0 = AccountSignOutWarningDialogKt.AccountSignOutWarningDownloadedReadsDialog$lambda$0(this.f14689b, yVar, bottomSheetControl, mVar, intValue);
                return AccountSignOutWarningDownloadedReadsDialog$lambda$0;
        }
    }
}
