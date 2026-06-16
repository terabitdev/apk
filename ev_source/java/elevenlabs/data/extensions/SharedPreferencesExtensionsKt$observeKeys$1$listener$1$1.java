package io.elevenlabs.data.extensions;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import hr.w;
import hr.x;
import kotlin.Metadata;
import sn.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt$observeKeys$1$listener$1$1", f = "SharedPreferencesExtensions.kt", l = {39, 39}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class SharedPreferencesExtensionsKt$observeKeys$1$listener$1$1 extends i implements p {
    final /* synthetic */ x $$this$channelFlow;
    final /* synthetic */ p $getValue;
    final /* synthetic */ SharedPreferences $sharedPreferences;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesExtensionsKt$observeKeys$1$listener$1$1(x xVar, p pVar, SharedPreferences sharedPreferences, wn.c<? super SharedPreferencesExtensionsKt$observeKeys$1$listener$1$1> cVar) {
        super(2, cVar);
        this.$$this$channelFlow = xVar;
        this.$getValue = pVar;
        this.$sharedPreferences = sharedPreferences;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SharedPreferencesExtensionsKt$observeKeys$1$listener$1$1(this.$$this$channelFlow, this.$getValue, this.$sharedPreferences, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SharedPreferencesExtensionsKt$observeKeys$1$listener$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0.c(r6, r5) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r6 == r3) goto L15;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hr.z zVar;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (hr.z) this.L$0;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            zVar = (w) this.$$this$channelFlow;
            zVar.getClass();
            p pVar = this.$getValue;
            SharedPreferences sharedPreferences = this.$sharedPreferences;
            sharedPreferences.getClass();
            this.L$0 = zVar;
            this.label = 1;
            obj = pVar.invoke(sharedPreferences, this);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
