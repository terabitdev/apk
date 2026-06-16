package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.webkit.WebView;
import com.google.protobuf.c6;
import kotlin.Metadata;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkScreenKt$WebViewContent$3$1", f = "ImportLinkScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ImportLinkScreenKt$WebViewContent$3$1 extends yn.i implements ho.p {
    final /* synthetic */ ho.l $action;
    final /* synthetic */ String $jsScript;
    final /* synthetic */ ImportLinkState $state;
    final /* synthetic */ z0 $webView$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportLinkScreenKt$WebViewContent$3$1(ImportLinkState importLinkState, String str, ho.l lVar, z0 z0Var, wn.c<? super ImportLinkScreenKt$WebViewContent$3$1> cVar) {
        super(2, cVar);
        this.$state = importLinkState;
        this.$jsScript = str;
        this.$action = lVar;
        this.$webView$delegate = z0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z invokeSuspend$lambda$1(ImportLinkViewModel importLinkViewModel) {
        importLinkViewModel.onProcessTriggered();
        return sn.z.f31622a;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ImportLinkScreenKt$WebViewContent$3$1(this.$state, this.$jsScript, this.$action, this.$webView$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ImportLinkScreenKt$WebViewContent$3$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.webkit.ValueCallback, java.lang.Object] */
    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        WebView WebViewContent$lambda$2;
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.$state.getTriggerProcess()) {
                WebViewContent$lambda$2 = ImportLinkScreenKt.WebViewContent$lambda$2(this.$webView$delegate);
                if (WebViewContent$lambda$2 != 0) {
                    WebViewContent$lambda$2.evaluateJavascript(this.$jsScript, new Object());
                }
                this.$action.invoke(new j(3));
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(String str) {
    }
}
