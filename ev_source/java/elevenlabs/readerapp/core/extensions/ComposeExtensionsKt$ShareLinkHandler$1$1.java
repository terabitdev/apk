package io.elevenlabs.readerapp.core.extensions;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import j.j;
import kotlin.Metadata;
import sn.z;
import wn.c;
import wq.n;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt$ShareLinkHandler$1$1", f = "ComposeExtensions.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ComposeExtensionsKt$ShareLinkHandler$1$1 extends i implements p {
    final /* synthetic */ String $chooseAppText;
    final /* synthetic */ String $link;
    final /* synthetic */ j $shareLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeExtensionsKt$ShareLinkHandler$1$1(String str, j jVar, String str2, c<? super ComposeExtensionsKt$ShareLinkHandler$1$1> cVar) {
        super(2, cVar);
        this.$link = str;
        this.$shareLauncher = jVar;
        this.$chooseAppText = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ComposeExtensionsKt$ShareLinkHandler$1$1(this.$link, this.$shareLauncher, this.$chooseAppText, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ComposeExtensionsKt$ShareLinkHandler$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            String str = this.$link;
            if (str != null && !n.m0(str)) {
                ComposeExtensionsKt.handleShare(this.$link, this.$shareLauncher, this.$chooseAppText);
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
