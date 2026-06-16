package io.livekit.android.coroutines;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import kotlin.Metadata;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.coroutines.ReentrantMutexKt$withReentrantLock$2", f = "ReentrantMutex.kt", l = {61, 44}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {TokenNames.T, "Lfr/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReentrantMutexKt$withReentrantLock$2 extends i implements p {
    final /* synthetic */ l $block;
    final /* synthetic */ a $this_withReentrantLock;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReentrantMutexKt$withReentrantLock$2(a aVar, l lVar, c<? super ReentrantMutexKt$withReentrantLock$2> cVar) {
        super(2, cVar);
        this.$this_withReentrantLock = aVar;
        this.$block = lVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ReentrantMutexKt$withReentrantLock$2(this.$this_withReentrantLock, this.$block, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super T> cVar) {
        return ((ReentrantMutexKt$withReentrantLock$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        if (r7.a(r6) == r4) goto L19;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        l lVar;
        a aVar2;
        Throwable th;
        int i10 = this.label;
        xn.a aVar3 = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        aVar2 = (a) this.L$0;
                        try {
                            sn.a.g(obj);
                            aVar2.n(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.n(null);
                            throw th;
                        }
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = (l) this.L$1;
                a aVar4 = (a) this.L$0;
                sn.a.g(obj);
                aVar = aVar4;
            } else {
                sn.a.g(obj);
                aVar = this.$this_withReentrantLock;
                lVar = this.$block;
                this.L$0 = aVar;
                this.L$1 = lVar;
                this.label = 1;
            }
            this.L$0 = aVar;
            this.L$1 = null;
            this.label = 2;
            Object invoke = lVar.invoke(this);
            if (invoke != aVar3) {
                aVar2 = aVar;
                obj = invoke;
                aVar2.n(null);
                return obj;
            }
            return aVar3;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.n(null);
            throw th;
        }
    }
}
