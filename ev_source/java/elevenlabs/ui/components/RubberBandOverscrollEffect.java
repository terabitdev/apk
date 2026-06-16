package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010!\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010)\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lio/elevenlabs/ui/components/RubberBandOverscrollEffect;", TokenNames.T, "Ll1/t1;", "Ln1/p;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "", "Lsn/z;", "updateOverscrollDelta", "Lkotlin/Function0;", "getOverscrollDelta", "Lfr/d0;", "scope", "rubberBandFactor", "Lj1/e1;", "snapAnimationSpec", "<init>", "(Ln1/p;Lho/l;Lho/a;Lfr/d0;FLj1/e1;)V", "Lo3/b;", "delta", "", "source", "performScroll", "applyToScroll-Rhakbz0", "(JILho/l;)J", "applyToScroll", "Lh5/q;", "velocity", "Lkotlin/Function2;", "Lwn/c;", "performFling", "applyToFling-BMRW4eQ", "(JLho/p;Lwn/c;)Ljava/lang/Object;", "applyToFling", "Ln1/p;", "Lho/l;", "Lho/a;", "Lfr/d0;", TokenNames.F, "Lj1/e1;", "", "isInProgress", "()Z", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RubberBandOverscrollEffect<T> implements l1.t1 {
    private final ho.a getOverscrollDelta;
    private final float rubberBandFactor;
    private final fr.d0 scope;
    private final j1.e1 snapAnimationSpec;
    private final n1.p state;
    private final ho.l updateOverscrollDelta;

    public RubberBandOverscrollEffect(n1.p pVar, ho.l lVar, ho.a aVar, fr.d0 d0Var, float f10, j1.e1 e1Var) {
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        d0Var.getClass();
        e1Var.getClass();
        this.state = pVar;
        this.updateOverscrollDelta = lVar;
        this.getOverscrollDelta = aVar;
        this.scope = d0Var;
        this.rubberBandFactor = f10;
        this.snapAnimationSpec = e1Var;
    }

    @Override // l1.t1
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    public Object mo1871applyToFlingBMRW4eQ(long j4, ho.p pVar, wn.c<? super sn.z> cVar) {
        float floatValue = ((Number) this.getOverscrollDelta.invoke()).floatValue();
        if (floatValue != t2.u.P) {
            fr.g0.D(this.scope, null, null, new RubberBandOverscrollEffect$applyToFling$2(floatValue, this, null), 3);
        }
        Object invoke = pVar.invoke(new h5.q(j4), cVar);
        if (invoke == xn.a.f37986a) {
            return invoke;
        }
        return sn.z.f31622a;
    }

    @Override // l1.t1
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    public long mo1872applyToScrollRhakbz0(long delta, int source, ho.l performScroll) {
        performScroll.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (delta >> 32));
        float h10 = this.state.f23888f.h();
        float floatValue = ((Number) this.getOverscrollDelta.invoke()).floatValue();
        long j4 = ((o3.b) performScroll.invoke(new o3.b(delta))).f24764a;
        int i10 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i10) != intBitsToFloat) {
            n1.f1 b10 = this.state.b();
            if (intBitsToFloat > t2.u.P) {
                if (h10 < ((n1.y) b10).c()) {
                    return j4;
                }
            } else if (intBitsToFloat >= t2.u.P || h10 > ((n1.y) b10).d()) {
                return j4;
            }
            float intBitsToFloat2 = (intBitsToFloat - Float.intBitsToFloat(i10)) * this.rubberBandFactor;
            this.updateOverscrollDelta.invoke(Float.valueOf(floatValue + intBitsToFloat2));
            float intBitsToFloat3 = Float.intBitsToFloat(i10) + intBitsToFloat2;
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            return (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32);
        }
        return j4;
    }

    @Override // l1.t1
    public i3.t getEffectModifier() {
        return i3.q.f13017a;
    }

    @Override // l1.t1
    public h4.j getNode() {
        return new h4.b1(1);
    }

    @Override // l1.t1
    public boolean isInProgress() {
        boolean z6;
        if (((Number) this.getOverscrollDelta.invoke()).floatValue() == t2.u.P) {
            z6 = true;
        } else {
            z6 = false;
        }
        return !z6;
    }

    public /* synthetic */ RubberBandOverscrollEffect(n1.p pVar, ho.l lVar, ho.a aVar, fr.d0 d0Var, float f10, j1.e1 e1Var, int i10, kotlin.jvm.internal.f fVar) {
        this(pVar, lVar, aVar, d0Var, (i10 & 16) != 0 ? 0.2f : f10, (i10 & 32) != 0 ? SwipeToActionBoxKt.SNAP_ANIMATION_SPEC : e1Var);
    }
}
