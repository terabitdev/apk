package io.elevenlabs.analytics;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import hr.n;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.analytics.SingularServiceImpl$handleLink$1", f = "SingularServiceImpl.kt", l = {186, 187}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class SingularServiceImpl$handleLink$1 extends i implements p {
    final /* synthetic */ String $deeplink;
    final /* synthetic */ String $passthrough;
    int label;
    final /* synthetic */ SingularServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingularServiceImpl$handleLink$1(String str, SingularServiceImpl singularServiceImpl, String str2, c<? super SingularServiceImpl$handleLink$1> cVar) {
        super(2, cVar);
        this.$passthrough = str;
        this.this$0 = singularServiceImpl;
        this.$deeplink = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new SingularServiceImpl$handleLink$1(this.$passthrough, this.this$0, this.$deeplink, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((SingularServiceImpl$handleLink$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r4.c(r1, r3) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r4.c(r2, r3) == r0) goto L19;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n nVar;
        n nVar2;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            String str = this.$passthrough;
            xn.a aVar = xn.a.f37986a;
            if (str != null) {
                nVar2 = this.this$0.deepLinkChannel;
                String str2 = this.$passthrough;
                this.label = 1;
            } else if (this.$deeplink != null) {
                nVar = this.this$0.deepLinkChannel;
                String str3 = this.$deeplink;
                this.label = 2;
            }
        }
        return z.f31622a;
    }
}
