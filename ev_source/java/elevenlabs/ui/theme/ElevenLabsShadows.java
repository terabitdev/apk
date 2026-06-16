package io.elevenlabs.ui.theme;

import android.gov.nist.core.Separators;
import ib.i;
import io.elevenlabs.ui.extensions.BoxShadow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p3.h0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsShadows;", "", "lg", "", "Lio/elevenlabs/ui/extensions/BoxShadow;", "<init>", "(Ljava/util/List;)V", "getLg", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ElevenLabsShadows {
    public static final int $stable = 8;
    private final List<BoxShadow> lg;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ElevenLabsShadows(List list, int i10, f fVar) {
        this(r0);
        List list2;
        if ((i10 & 1) != 0) {
            float f10 = 0;
            list2 = ig.f.I(new BoxShadow(h0.c(134217728), 6, -2, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(4) & 4294967295L), false, 16, null), new BoxShadow(h0.c(369098752), 16, -4, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(12) & 4294967295L), false, 16, null));
        } else {
            list2 = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ElevenLabsShadows copy$default(ElevenLabsShadows elevenLabsShadows, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = elevenLabsShadows.lg;
        }
        return elevenLabsShadows.copy(list);
    }

    public final List<BoxShadow> component1() {
        return this.lg;
    }

    public final ElevenLabsShadows copy(List<BoxShadow> lg2) {
        lg2.getClass();
        return new ElevenLabsShadows(lg2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ElevenLabsShadows) && m.c(this.lg, ((ElevenLabsShadows) other).lg)) {
            return true;
        }
        return false;
    }

    public final List<BoxShadow> getLg() {
        return this.lg;
    }

    public int hashCode() {
        return this.lg.hashCode();
    }

    public String toString() {
        return i.k("ElevenLabsShadows(lg=", Separators.RPAREN, this.lg);
    }

    public ElevenLabsShadows(List<BoxShadow> list) {
        list.getClass();
        this.lg = list;
    }

    public ElevenLabsShadows() {
        this(null, 1, null);
    }
}
