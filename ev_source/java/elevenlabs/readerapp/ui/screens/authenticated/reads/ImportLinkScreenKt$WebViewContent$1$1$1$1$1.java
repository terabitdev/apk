package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"io/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportLinkScreenKt$WebViewContent$1$1$1$1$1", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Lsn/z;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportLinkScreenKt$WebViewContent$1$1$1$1$1 extends WebViewClient {
    final /* synthetic */ ho.l $action;
    final /* synthetic */ z0 $canGoBack$delegate;
    final /* synthetic */ z0 $canGoForward$delegate;
    final /* synthetic */ String $initialUrl;
    final /* synthetic */ WebView $this_apply;

    public ImportLinkScreenKt$WebViewContent$1$1$1$1$1(WebView webView, ho.l lVar, z0 z0Var, z0 z0Var2, String str) {
        this.$this_apply = webView;
        this.$action = lVar;
        this.$canGoBack$delegate = z0Var;
        this.$canGoForward$delegate = z0Var2;
        this.$initialUrl = str;
    }

    public static final sn.z onPageFinished$lambda$0(String str, ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.getClass();
        importLinkViewModel.onPageLoaded(str);
        return sn.z.f31622a;
    }

    public static final sn.z onReceivedError$lambda$1(WebResourceError webResourceError, ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.getClass();
        importLinkViewModel.onPageLoadError(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
        return sn.z.f31622a;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        url.getClass();
        super.onPageFinished(view, url);
        if (this.$this_apply.getProgress() == 100) {
            this.$action.invoke(new r(url, 6));
        }
        ImportLinkScreenKt.WebViewContent$lambda$6(this.$canGoBack$delegate, this.$this_apply.canGoBack());
        ImportLinkScreenKt.WebViewContent$lambda$9(this.$canGoForward$delegate, this.$this_apply.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError r42) {
        request.getClass();
        r42.getClass();
        super.onReceivedError(view, request, r42);
        if (kotlin.jvm.internal.m.c(request.getUrl().toString(), this.$initialUrl)) {
            this.$action.invoke(new u(r42, 2));
        }
        ImportLinkScreenKt.WebViewContent$lambda$6(this.$canGoBack$delegate, this.$this_apply.canGoBack());
        ImportLinkScreenKt.WebViewContent$lambda$9(this.$canGoForward$delegate, this.$this_apply.canGoForward());
    }
}
