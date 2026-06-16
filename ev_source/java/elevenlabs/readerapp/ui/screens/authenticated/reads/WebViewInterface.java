package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.webkit.JavascriptInterface;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WebViewInterface;", "", "Lkotlin/Function1;", "", "Lsn/z;", "onHtmlReceived", "onError", "<init>", "(Lho/l;Lho/l;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onParseCompleted", "(Ljava/lang/String;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onParseFailed", "Lho/l;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class WebViewInterface {
    public static final int $stable = 0;
    private final ho.l onError;
    private final ho.l onHtmlReceived;

    public WebViewInterface(ho.l lVar, ho.l lVar2) {
        lVar.getClass();
        lVar2.getClass();
        this.onHtmlReceived = lVar;
        this.onError = lVar2;
    }

    @JavascriptInterface
    public final void onParseCompleted(String data) {
        data.getClass();
        this.onHtmlReceived.invoke(data);
    }

    @JavascriptInterface
    public final void onParseFailed(String error) {
        error.getClass();
        this.onError.invoke(error);
    }
}
