package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import hr.x;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$currentCharacterOffset$1", f = "BackgroundPlayerService.kt", l = {895, 897, 898}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$currentCharacterOffset$1 extends i implements p {
    final /* synthetic */ long $delayDuration;
    final /* synthetic */ long $startOffset;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$currentCharacterOffset$1(BackgroundPlayerService backgroundPlayerService, long j4, long j10, wn.c<? super BackgroundPlayerService$currentCharacterOffset$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$delayDuration = j4;
        this.$startOffset = j10;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$currentCharacterOffset$1 backgroundPlayerService$currentCharacterOffset$1 = new BackgroundPlayerService$currentCharacterOffset$1(this.this$0, this.$delayDuration, this.$startOffset, cVar);
        backgroundPlayerService$currentCharacterOffset$1.L$0 = obj;
        return backgroundPlayerService$currentCharacterOffset$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$currentCharacterOffset$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        if (fr.g0.n(r9, r13) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r14 == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (((hr.w) r0).f12593d.c(r14, r13) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        return r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0098 -> B:13:0x0031). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        Long l4;
        x xVar = (x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    longValue = this.J$0;
                    sn.a.g(obj);
                    long j4 = this.$delayDuration;
                    this.L$0 = xVar;
                    this.L$1 = null;
                    this.J$0 = longValue;
                    this.label = 3;
                }
            } else {
                sn.a.g(obj);
                longValue = ((Number) obj).longValue();
                if (this.this$0.getStreamingService().findCurrentCharacter(longValue) != null) {
                    l4 = new Long(this.$startOffset + r14.intValue());
                } else {
                    l4 = null;
                }
                this.L$0 = xVar;
                this.L$1 = null;
                this.J$0 = longValue;
                this.label = 2;
            }
        }
        sn.a.g(obj);
        if (g0.y(xVar)) {
            fr.z main = this.this$0.getDispatcherFactory().getMain();
            BackgroundPlayerService$currentCharacterOffset$1$currentPosition$1 backgroundPlayerService$currentCharacterOffset$1$currentPosition$1 = new BackgroundPlayerService$currentCharacterOffset$1$currentPosition$1(this.this$0, null);
            this.L$0 = xVar;
            this.L$1 = null;
            this.label = 1;
            obj = g0.Q(main, backgroundPlayerService$currentCharacterOffset$1$currentPosition$1, this);
        } else {
            return z.f31622a;
        }
    }
}
