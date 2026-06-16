package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.webkit.WebView;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16970b;

    public /* synthetic */ r(String str, int i10) {
        this.f16969a = i10;
        this.f16970b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        GenFMLoadingState readId$lambda$0;
        sn.z ImportFileScreenUI$lambda$2$0$0$0$0;
        sn.z ImportFileScreenUI$lambda$2$0$0$2$0;
        sn.z WebViewContent$lambda$10$2$0;
        sn.z WebViewContent$lambda$10$0$0$0$1$0;
        sn.z WebViewContent$lambda$10$0$0$0$0$0;
        ImportLinkState onPageLoaded$lambda$0;
        sn.z PasteLinkScreenUI$lambda$2$0$0$3$0$0;
        PasteLinkState onUrlChanged$lambda$0;
        RateTitleState readId$lambda$02;
        sn.z WriteScreenUI$lambda$9$0$0$0$0$0;
        WriteState onInputChanged$lambda$0;
        switch (this.f16969a) {
            case 0:
                readId$lambda$0 = GenFMLoadingViewModel.setReadId$lambda$0(this.f16970b, (GenFMLoadingState) obj);
                return readId$lambda$0;
            case 1:
                ImportFileScreenUI$lambda$2$0$0$0$0 = ImportFileScreenKt.ImportFileScreenUI$lambda$2$0$0$0$0(this.f16970b, (p4.b0) obj);
                return ImportFileScreenUI$lambda$2$0$0$0$0;
            case 2:
                ImportFileScreenUI$lambda$2$0$0$2$0 = ImportFileScreenKt.ImportFileScreenUI$lambda$2$0$0$2$0(this.f16970b, (p4.b0) obj);
                return ImportFileScreenUI$lambda$2$0$0$2$0;
            case 3:
                WebViewContent$lambda$10$2$0 = ImportLinkScreenKt.WebViewContent$lambda$10$2$0(this.f16970b, (WebView) obj);
                return WebViewContent$lambda$10$2$0;
            case 4:
                WebViewContent$lambda$10$0$0$0$1$0 = ImportLinkScreenKt.WebViewContent$lambda$10$0$0$0$1$0(this.f16970b, (ImportLinkViewModel) obj);
                return WebViewContent$lambda$10$0$0$0$1$0;
            case 5:
                WebViewContent$lambda$10$0$0$0$0$0 = ImportLinkScreenKt.WebViewContent$lambda$10$0$0$0$0$0(this.f16970b, (ImportLinkViewModel) obj);
                return WebViewContent$lambda$10$0$0$0$0$0;
            case 6:
                return ImportLinkScreenKt$WebViewContent$1$1$1$1$1.b(this.f16970b, (ImportLinkViewModel) obj);
            case 7:
                onPageLoaded$lambda$0 = ImportLinkViewModel.onPageLoaded$lambda$0(this.f16970b, (ImportLinkState) obj);
                return onPageLoaded$lambda$0;
            case 8:
                PasteLinkScreenUI$lambda$2$0$0$3$0$0 = PasteLinkScreenKt.PasteLinkScreenUI$lambda$2$0$0$3$0$0(this.f16970b, (PasteLinkViewModel) obj);
                return PasteLinkScreenUI$lambda$2$0$0$3$0$0;
            case 9:
                onUrlChanged$lambda$0 = PasteLinkViewModel.onUrlChanged$lambda$0(this.f16970b, (PasteLinkState) obj);
                return onUrlChanged$lambda$0;
            case 10:
                readId$lambda$02 = RateTitleViewModel.setReadId$lambda$0(this.f16970b, (RateTitleState) obj);
                return readId$lambda$02;
            case 11:
                WriteScreenUI$lambda$9$0$0$0$0$0 = WriteScreenKt.WriteScreenUI$lambda$9$0$0$0$0$0(this.f16970b, (WriteViewModel) obj);
                return WriteScreenUI$lambda$9$0$0$0$0$0;
            default:
                onInputChanged$lambda$0 = WriteViewModel.onInputChanged$lambda$0(this.f16970b, (WriteState) obj);
                return onInputChanged$lambda$0;
        }
    }
}
