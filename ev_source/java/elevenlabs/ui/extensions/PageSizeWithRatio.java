package io.elevenlabs.ui.extensions;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import w1.j;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\u0004*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/ui/extensions/PageSizeWithRatio;", "Lw1/j;", "", "ratio", "", "maximumSize", "<init>", "(FLjava/lang/Integer;)V", "Lh5/c;", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "(Lh5/c;II)I", TokenNames.F, "Ljava/lang/Integer;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PageSizeWithRatio implements j {
    public static final int $stable = 0;
    private final Integer maximumSize;
    private final float ratio;

    public PageSizeWithRatio(float f10, Integer num) {
        this.ratio = f10;
        this.maximumSize = num;
    }

    @Override // w1.j
    public int calculateMainAxisPageSize(h5.c cVar, int i10, int i11) {
        cVar.getClass();
        int i12 = (int) (i10 * this.ratio);
        Integer num = this.maximumSize;
        if (num != null && i12 > num.intValue()) {
            return this.maximumSize.intValue();
        }
        return i12;
    }
}
