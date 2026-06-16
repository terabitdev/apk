package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import i4.q2;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14953c;

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f14951a = i10;
        this.f14952b = obj;
        this.f14953c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        z RenderDynamicSection$lambda$0$0$0$0;
        z AccountSignOutWarningDownloadedReadsDialog$lambda$0$0$0;
        switch (this.f14951a) {
            case 0:
                RenderDynamicSection$lambda$0$0$0$0 = AccountDynamicSectionKt.RenderDynamicSection$lambda$0$0$0$0((q2) this.f14952b, (SectionItem) this.f14953c);
                return RenderDynamicSection$lambda$0$0$0$0;
            default:
                AccountSignOutWarningDownloadedReadsDialog$lambda$0$0$0 = AccountSignOutWarningDialogKt.AccountSignOutWarningDownloadedReadsDialog$lambda$0$0$0((ho.a) this.f14952b, (BottomSheetControl) this.f14953c);
                return AccountSignOutWarningDownloadedReadsDialog$lambda$0$0$0;
        }
    }
}
