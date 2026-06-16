package io.elevenlabs.ui.extensions;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "degrees", "", "createHueRotationMatrix", "(F)[F", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ColorExtensionsKt {
    public static final float[] createHueRotationMatrix(float f10) {
        float[] fArr = {1.0f, u.P, u.P, u.P, u.P, u.P, 1.0f, u.P, u.P, u.P, u.P, u.P, 1.0f, u.P, u.P, u.P, u.P, u.P, 1.0f, u.P};
        double radians = (float) Math.toRadians(f10);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float f11 = 1;
        float f12 = f11 - 0.213f;
        fArr[0] = ((cos * f12) + 0.213f) - (sin * 0.213f);
        float f13 = 0.715f - (cos * 0.715f);
        float f14 = sin * 0.715f;
        fArr[1] = f13 - f14;
        float f15 = 0.072f - (cos * 0.072f);
        float f16 = f11 - 0.072f;
        fArr[2] = (sin * f16) + f15;
        float f17 = 0.213f - (cos * 0.213f);
        fArr[5] = (0.143f * sin) + f17;
        fArr[6] = (0.14f * sin) + ((f11 - 0.715f) * cos) + 0.715f;
        fArr[7] = f15 - (0.283f * sin);
        fArr[10] = f17 - (f12 * sin);
        fArr[11] = f13 + f14;
        fArr[12] = (sin * 0.072f) + (cos * f16) + 0.072f;
        return fArr;
    }
}
