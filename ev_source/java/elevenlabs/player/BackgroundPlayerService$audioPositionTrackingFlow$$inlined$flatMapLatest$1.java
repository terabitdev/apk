package io.elevenlabs.player;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.model.ReadMeta;
import ir.h;
import ir.j;
import ir.r;
import kotlin.Metadata;
import sn.k;
import sn.z;
import xq.g;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1", f = "BackgroundPlayerService.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1 extends i implements q {
    final /* synthetic */ ReadMeta $readMeta$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1(wn.c cVar, BackgroundPlayerService backgroundPlayerService, ReadMeta readMeta) {
        super(3, cVar);
        this.this$0 = backgroundPlayerService;
        this.$readMeta$inlined = readMeta;
    }

    public final Object invoke(j jVar, k kVar, wn.c<? super z> cVar) {
        BackgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1 backgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1 = new BackgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1(cVar, this.this$0, this.$readMeta$inlined);
        backgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1.L$0 = jVar;
        backgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1.L$1 = kVar;
        return backgroundPlayerService$audioPositionTrackingFlow$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        xq.d dVar;
        ir.i m999currentAudioPositionHG0u8IE;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            j jVar = (j) this.L$0;
            k kVar = (k) this.L$1;
            boolean booleanValue = ((Boolean) kVar.f31600a).booleanValue();
            if (((Number) kVar.f31601b).intValue() == 1) {
                m999currentAudioPositionHG0u8IE = h.f17943a;
            } else {
                xq.a aVar = xq.b.f38124b;
                if (booleanValue) {
                    i10 = 200;
                    dVar = xq.d.MILLISECONDS;
                } else {
                    i10 = 0;
                    dVar = xq.d.SECONDS;
                }
                m999currentAudioPositionHG0u8IE = this.this$0.m999currentAudioPositionHG0u8IE(this.$readMeta$inlined, g.n(i10, dVar));
                if (!booleanValue) {
                    m999currentAudioPositionHG0u8IE = r.F(m999currentAudioPositionHG0u8IE, 1);
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object r10 = r.r(jVar, m999currentAudioPositionHG0u8IE, this);
            xn.a aVar2 = xn.a.f37986a;
            if (r10 == aVar2) {
                return aVar2;
            }
        }
        return z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((j) obj, (k) obj2, (wn.c<? super z>) obj3);
    }
}
