package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.content.Context;
import android.webkit.WebResourceError;
import android.webkit.WebView;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16988b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f16987a = i10;
        this.f16988b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z ImportContentBrowserSurveySheet$lambda$0$0$0;
        sn.z WebViewContent$lambda$10$1$0;
        sn.z onReceivedError$lambda$1;
        sn.z RateTitleSheetUI$lambda$4$1$0$0;
        sn.z RateTitleSheet$lambda$2$1$0;
        sn.z WriteScreen$lambda$7$0;
        switch (this.f16987a) {
            case 0:
                ImportContentBrowserSurveySheet$lambda$0$0$0 = ImportContentBrowserSurveySheetKt.ImportContentBrowserSurveySheet$lambda$0$0$0((ImportContentBrowserSurveyViewModel) this.f16988b, (ho.l) obj);
                return ImportContentBrowserSurveySheet$lambda$0$0$0;
            case 1:
                WebViewContent$lambda$10$1$0 = ImportLinkScreenKt.WebViewContent$lambda$10$1$0((z0) this.f16988b, (WebView) obj);
                return WebViewContent$lambda$10$1$0;
            case 2:
                onReceivedError$lambda$1 = ImportLinkScreenKt$WebViewContent$1$1$1$1$1.onReceivedError$lambda$1((WebResourceError) this.f16988b, (ImportLinkViewModel) obj);
                return onReceivedError$lambda$1;
            case 3:
                RateTitleSheetUI$lambda$4$1$0$0 = RateTitleSheetKt.RateTitleSheetUI$lambda$4$1$0$0((Long) this.f16988b, (RateTitleViewModel) obj);
                return RateTitleSheetUI$lambda$4$1$0$0;
            case 4:
                RateTitleSheet$lambda$2$1$0 = RateTitleSheetKt.RateTitleSheet$lambda$2$1$0((RateTitleViewModel) this.f16988b, (ho.l) obj);
                return RateTitleSheet$lambda$2$1$0;
            default:
                WriteScreen$lambda$7$0 = WriteScreenKt.WriteScreen$lambda$7$0((Context) this.f16988b, (String) obj);
                return WriteScreen$lambda$7$0;
        }
    }
}
