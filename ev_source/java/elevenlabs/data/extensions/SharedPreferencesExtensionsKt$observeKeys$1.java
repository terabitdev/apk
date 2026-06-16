package io.elevenlabs.data.extensions;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import hr.w;
import hr.x;
import java.util.Set;
import kotlin.Metadata;
import sn.z;
import tn.o;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt$observeKeys$1", f = "SharedPreferencesExtensions.kt", l = {44, 44, 46}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lhr/x;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class SharedPreferencesExtensionsKt$observeKeys$1 extends i implements p {
    final /* synthetic */ p $getValue;
    final /* synthetic */ Set<String> $observedKeys;
    final /* synthetic */ SharedPreferences $this_observeKeys;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesExtensionsKt$observeKeys$1(p pVar, SharedPreferences sharedPreferences, Set<String> set, wn.c<? super SharedPreferencesExtensionsKt$observeKeys$1> cVar) {
        super(2, cVar);
        this.$getValue = pVar;
        this.$this_observeKeys = sharedPreferences;
        this.$observedKeys = set;
    }

    public static final void invokeSuspend$lambda$0(Set set, x xVar, p pVar, SharedPreferences sharedPreferences, String str) {
        if (o.m0(set, str)) {
            g0.D(xVar, null, null, new SharedPreferencesExtensionsKt$observeKeys$1$listener$1$1(xVar, pVar, sharedPreferences, null), 3);
        }
    }

    public static final z invokeSuspend$lambda$1(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return z.f31622a;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        SharedPreferencesExtensionsKt$observeKeys$1 sharedPreferencesExtensionsKt$observeKeys$1 = new SharedPreferencesExtensionsKt$observeKeys$1(this.$getValue, this.$this_observeKeys, this.$observedKeys, cVar);
        sharedPreferencesExtensionsKt$observeKeys$1.L$0 = obj;
        return sharedPreferencesExtensionsKt$observeKeys$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((SharedPreferencesExtensionsKt$observeKeys$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (n0.l.h(r0, r3, r9) != r6) goto L48;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hr.z zVar;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2;
        x xVar = (x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        return z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                onSharedPreferenceChangeListener2 = (SharedPreferences.OnSharedPreferenceChangeListener) this.L$1;
                sn.a.g(obj);
                this.$this_observeKeys.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
                c cVar = new c(this.$this_observeKeys, onSharedPreferenceChangeListener2, 1);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            } else {
                zVar = (hr.z) this.L$2;
                onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.L$1;
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            b bVar = new b(this.$observedKeys, xVar, this.$getValue, 1);
            zVar = (w) xVar;
            zVar.getClass();
            p pVar = this.$getValue;
            SharedPreferences sharedPreferences = this.$this_observeKeys;
            this.L$0 = xVar;
            this.L$1 = bVar;
            this.L$2 = zVar;
            this.label = 1;
            obj = pVar.invoke(sharedPreferences, this);
            if (obj != aVar) {
                onSharedPreferenceChangeListener = bVar;
            }
            return aVar;
        }
        this.L$0 = xVar;
        this.L$1 = onSharedPreferenceChangeListener;
        this.L$2 = null;
        this.label = 2;
        if (zVar.c(obj, this) != aVar) {
            onSharedPreferenceChangeListener2 = onSharedPreferenceChangeListener;
            this.$this_observeKeys.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
            c cVar2 = new c(this.$this_observeKeys, onSharedPreferenceChangeListener2, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        return aVar;
    }
}
