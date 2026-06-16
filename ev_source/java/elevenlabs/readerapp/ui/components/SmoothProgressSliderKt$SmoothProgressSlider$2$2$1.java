package io.elevenlabs.readerapp.ui.components;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import m2.k1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SmoothProgressSliderKt$SmoothProgressSlider$2$2$1 implements PointerInputEventHandler {
    final /* synthetic */ u2.w0 $barWidthPx$delegate;
    final /* synthetic */ u2.z0 $isSeeking$delegate;
    final /* synthetic */ s2 $updatedOnValueChange$delegate;
    final /* synthetic */ s2 $updatedOnValueChangeFinished$delegate;
    final /* synthetic */ s2 $updatedOnValueChangeStarted$delegate;

    public SmoothProgressSliderKt$SmoothProgressSlider$2$2$1(u2.w0 w0Var, u2.z0 z0Var, s2 s2Var, s2 s2Var2, s2 s2Var3) {
        this.$barWidthPx$delegate = w0Var;
        this.$isSeeking$delegate = z0Var;
        this.$updatedOnValueChangeStarted$delegate = s2Var;
        this.$updatedOnValueChange$delegate = s2Var2;
        this.$updatedOnValueChangeFinished$delegate = s2Var3;
    }

    public static final sn.z invoke$lambda$0(u2.w0 w0Var, u2.z0 z0Var, s2 s2Var, s2 s2Var2, o3.b bVar) {
        float SmoothProgressSlider_OXtVwFM$lambda$4;
        ho.a SmoothProgressSlider_OXtVwFM$lambda$8;
        float SmoothProgressSlider_OXtVwFM$lambda$42;
        ho.l SmoothProgressSlider_OXtVwFM$lambda$6;
        SmoothProgressSlider_OXtVwFM$lambda$4 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$4(w0Var);
        if (SmoothProgressSlider_OXtVwFM$lambda$4 > t2.u.P) {
            SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$2(z0Var, true);
            SmoothProgressSlider_OXtVwFM$lambda$8 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$8(s2Var);
            SmoothProgressSlider_OXtVwFM$lambda$8.invoke();
            float intBitsToFloat = Float.intBitsToFloat((int) (bVar.f24764a >> 32));
            SmoothProgressSlider_OXtVwFM$lambda$42 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$4(w0Var);
            float l4 = ae.l.l(intBitsToFloat / SmoothProgressSlider_OXtVwFM$lambda$42, t2.u.P, 1.0f);
            SmoothProgressSlider_OXtVwFM$lambda$6 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$6(s2Var2);
            SmoothProgressSlider_OXtVwFM$lambda$6.invoke(Float.valueOf(l4));
        }
        return sn.z.f31622a;
    }

    public static final sn.z invoke$lambda$1(u2.z0 z0Var, s2 s2Var) {
        ho.a SmoothProgressSlider_OXtVwFM$lambda$7;
        SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$2(z0Var, false);
        SmoothProgressSlider_OXtVwFM$lambda$7 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$7(s2Var);
        SmoothProgressSlider_OXtVwFM$lambda$7.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z invoke$lambda$2(u2.w0 w0Var, s2 s2Var, c4.v vVar, o3.b bVar) {
        float SmoothProgressSlider_OXtVwFM$lambda$4;
        float SmoothProgressSlider_OXtVwFM$lambda$42;
        ho.l SmoothProgressSlider_OXtVwFM$lambda$6;
        vVar.getClass();
        SmoothProgressSlider_OXtVwFM$lambda$4 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$4(w0Var);
        if (SmoothProgressSlider_OXtVwFM$lambda$4 > t2.u.P) {
            float intBitsToFloat = Float.intBitsToFloat((int) (vVar.f4757c >> 32));
            SmoothProgressSlider_OXtVwFM$lambda$42 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$4(w0Var);
            float l4 = ae.l.l(intBitsToFloat / SmoothProgressSlider_OXtVwFM$lambda$42, t2.u.P, 1.0f);
            SmoothProgressSlider_OXtVwFM$lambda$6 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$6(s2Var);
            SmoothProgressSlider_OXtVwFM$lambda$6.invoke(Float.valueOf(l4));
        }
        return sn.z.f31622a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c4.a0 a0Var, wn.c<? super sn.z> cVar) {
        final u2.w0 w0Var = this.$barWidthPx$delegate;
        u2.z0 z0Var = this.$isSeeking$delegate;
        s2 s2Var = this.$updatedOnValueChangeStarted$delegate;
        final s2 s2Var2 = this.$updatedOnValueChange$delegate;
        Object d10 = n1.y0.d(a0Var, new x0(w0Var, z0Var, s2Var, s2Var2, 0), new y0(z0Var, this.$updatedOnValueChangeFinished$delegate, 0), new k1(8), new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.z0
            @Override // ho.p
            public final Object invoke(Object obj, Object obj2) {
                sn.z invoke$lambda$2;
                invoke$lambda$2 = SmoothProgressSliderKt$SmoothProgressSlider$2$2$1.invoke$lambda$2(u2.w0.this, s2Var2, (c4.v) obj, (o3.b) obj2);
                return invoke$lambda$2;
            }
        }, cVar);
        if (d10 == xn.a.f37986a) {
            return d10;
        }
        return sn.z.f31622a;
    }
}
