package io.elevenlabs.readerapp.usecase;

import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import hr.x;
import java.util.Date;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.usecase.GetCurrentTimeUseCaseImpl$invoke$1", f = "GetCurrentTimeUseCaseImpl.kt", l = {15, 16}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Ljava/util/Date;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class GetCurrentTimeUseCaseImpl$invoke$1 extends i implements p {
    final /* synthetic */ long $interval;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCurrentTimeUseCaseImpl$invoke$1(long j4, c<? super GetCurrentTimeUseCaseImpl$invoke$1> cVar) {
        super(2, cVar);
        this.$interval = j4;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        GetCurrentTimeUseCaseImpl$invoke$1 getCurrentTimeUseCaseImpl$invoke$1 = new GetCurrentTimeUseCaseImpl$invoke$1(this.$interval, cVar);
        getCurrentTimeUseCaseImpl$invoke$1.L$0 = obj;
        return getCurrentTimeUseCaseImpl$invoke$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, c<? super z> cVar) {
        return ((GetCurrentTimeUseCaseImpl$invoke$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (fr.g0.n(r5, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (((hr.w) r0).f12593d.c(r8, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:11:0x001f). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x xVar = (x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                long j4 = this.$interval;
                this.L$0 = xVar;
                this.label = 2;
            }
        }
        sn.a.g(obj);
        if (g0.y(xVar)) {
            Date date = new Date();
            this.L$0 = xVar;
            this.label = 1;
        } else {
            return z.f31622a;
        }
    }
}
