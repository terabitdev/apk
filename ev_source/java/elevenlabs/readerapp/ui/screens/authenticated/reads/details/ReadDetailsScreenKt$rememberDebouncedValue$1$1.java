package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import kotlin.Metadata;
import u2.o1;
import u2.p1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt$rememberDebouncedValue$1$1", f = "ReadDetailsScreen.kt", l = {1098}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lu2/o1;", "Lsn/z;", "<anonymous>", "(Lu2/o1;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsScreenKt$rememberDebouncedValue$1$1 extends yn.i implements ho.p {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ T $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsScreenKt$rememberDebouncedValue$1$1(long j4, T t10, wn.c<? super ReadDetailsScreenKt$rememberDebouncedValue$1$1> cVar) {
        super(2, cVar);
        this.$delayMillis = j4;
        this.$value = t10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        ReadDetailsScreenKt$rememberDebouncedValue$1$1 readDetailsScreenKt$rememberDebouncedValue$1$1 = new ReadDetailsScreenKt$rememberDebouncedValue$1$1(this.$delayMillis, this.$value, cVar);
        readDetailsScreenKt$rememberDebouncedValue$1$1.L$0 = obj;
        return readDetailsScreenKt$rememberDebouncedValue$1$1;
    }

    @Override // ho.p
    public final Object invoke(o1 o1Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsScreenKt$rememberDebouncedValue$1$1) create(o1Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        o1 o1Var = (o1) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            long j4 = this.$delayMillis;
            this.L$0 = o1Var;
            this.label = 1;
            Object m10 = fr.g0.m(j4, this);
            xn.a aVar = xn.a.f37986a;
            if (m10 == aVar) {
                return aVar;
            }
        }
        ((p1) o1Var).setValue(this.$value);
        return sn.z.f31622a;
    }
}
