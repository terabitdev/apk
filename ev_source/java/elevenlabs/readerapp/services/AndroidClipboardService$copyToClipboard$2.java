package io.elevenlabs.readerapp.services;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.AndroidClipboardService$copyToClipboard$2", f = "AndroidClipboardService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AndroidClipboardService$copyToClipboard$2 extends i implements p {
    final /* synthetic */ String $content;
    int label;
    final /* synthetic */ AndroidClipboardService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClipboardService$copyToClipboard$2(AndroidClipboardService androidClipboardService, String str, c<? super AndroidClipboardService$copyToClipboard$2> cVar) {
        super(2, cVar);
        this.this$0 = androidClipboardService;
        this.$content = str;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AndroidClipboardService$copyToClipboard$2(this.this$0, this.$content, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((AndroidClipboardService$copyToClipboard$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        if (this.label == 0) {
            sn.a.g(obj);
            context = this.this$0.context;
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("ReaderAppContent", this.$content));
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
