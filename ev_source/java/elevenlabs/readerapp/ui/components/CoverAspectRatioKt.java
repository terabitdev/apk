package io.elevenlabs.readerapp.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"", "coverAspectRatio", "", "isCoverSquarish", "(Ljava/lang/Double;)Z", "Lo3/e;", "imageSize", "isCoverSquarish-iaC8Vc4", "(Lo3/e;)Z", "SQUARISH_MIN_RATIO", "D", "SQUARISH_MAX_RATIO", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CoverAspectRatioKt {
    public static final double SQUARISH_MAX_RATIO = 1.15d;
    public static final double SQUARISH_MIN_RATIO = 0.85d;

    public static final boolean isCoverSquarish(Double d10) {
        if (d10 != null) {
            double doubleValue = d10.doubleValue();
            if (Math.abs(doubleValue) > Double.MAX_VALUE || doubleValue <= 0.0d) {
                d10 = null;
            }
            if (d10 != null) {
                double doubleValue2 = d10.doubleValue();
                if (0.85d <= doubleValue2 && doubleValue2 <= 1.15d) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: isCoverSquarish-iaC8Vc4, reason: not valid java name */
    public static final boolean m1084isCoverSquarishiaC8Vc4(o3.e eVar) {
        Double d10 = null;
        if (eVar != null) {
            if (Float.intBitsToFloat((int) (eVar.f24778a & 4294967295L)) <= t2.u.P) {
                eVar = null;
            }
            if (eVar != null) {
                long j4 = eVar.f24778a;
                d10 = Double.valueOf(Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j4 & 4294967295L)));
            }
        }
        return isCoverSquarish(d10);
    }
}
