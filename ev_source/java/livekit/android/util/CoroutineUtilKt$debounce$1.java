package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.j0;
import ho.l;
import ho.p;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "param", "Lsn/z;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CoroutineUtilKt$debounce$1 extends n implements l {
    final /* synthetic */ d0 $coroutineScope;
    final /* synthetic */ kotlin.jvm.internal.d0 $debounceJob;
    final /* synthetic */ p $destinationFunction;
    final /* synthetic */ long $waitMs;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.util.CoroutineUtilKt$debounce$1$1", f = "CoroutineUtil.kt", l = {30, 31}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {TokenNames.T, TokenNames.R, "Lfr/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.util.CoroutineUtilKt$debounce$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ p $destinationFunction;
        final /* synthetic */ T $param;
        final /* synthetic */ long $waitMs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j4, p pVar, T t10, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$waitMs = j4;
            this.$destinationFunction = pVar;
            this.$param = t10;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$waitMs, this.$destinationFunction, this.$param, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super R> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        
            if (fr.g0.m(r4, r6) == r3) goto L16;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            a aVar = a.f37986a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        return obj;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                long j4 = this.$waitMs;
                this.label = 1;
            }
            p pVar = this.$destinationFunction;
            Object obj2 = this.$param;
            this.label = 2;
            Object invoke = pVar.invoke(obj2, this);
            if (invoke == aVar) {
                return aVar;
            }
            return invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineUtilKt$debounce$1(kotlin.jvm.internal.d0 d0Var, d0 d0Var2, long j4, p pVar) {
        super(1);
        this.$debounceJob = d0Var;
        this.$coroutineScope = d0Var2;
        this.$waitMs = j4;
        this.$destinationFunction = pVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2635invoke(T t10) {
        j0 j0Var = (j0) this.$debounceJob.f20559a;
        if (j0Var != null) {
            j0Var.cancel((CancellationException) null);
        }
        this.$debounceJob.f20559a = g0.g(this.$coroutineScope, null, new AnonymousClass1(this.$waitMs, this.$destinationFunction, t10, null), 3);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2635invoke((CoroutineUtilKt$debounce$1) obj);
        return z.f31622a;
    }
}
