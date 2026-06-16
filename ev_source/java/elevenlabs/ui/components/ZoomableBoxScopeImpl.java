package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\n¨\u0006\""}, d2 = {"Lio/elevenlabs/ui/components/ZoomableBoxScopeImpl;", "Lio/elevenlabs/ui/components/ZoomableBoxScope;", "", "scale", "Lo3/b;", "offset", "rotation", "<init>", "(FJFLkotlin/jvm/internal/f;)V", "component1", "()F", "component2-F1C5BW0", "()J", "component2", "component3", "copy-d-4ec7I", "(FJF)Lio/elevenlabs/ui/components/ZoomableBoxScopeImpl;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.F, "getScale", "J", "getOffset-F1C5BW0", "getRotation", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ZoomableBoxScopeImpl implements ZoomableBoxScope {
    private final long offset;
    private final float rotation;
    private final float scale;

    private ZoomableBoxScopeImpl(float f10, long j4, float f11) {
        this.scale = f10;
        this.offset = j4;
        this.rotation = f11;
    }

    /* renamed from: copy-d-4ec7I$default, reason: not valid java name */
    public static /* synthetic */ ZoomableBoxScopeImpl m1887copyd4ec7I$default(ZoomableBoxScopeImpl zoomableBoxScopeImpl, float f10, long j4, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = zoomableBoxScopeImpl.scale;
        }
        if ((i10 & 2) != 0) {
            j4 = zoomableBoxScopeImpl.offset;
        }
        if ((i10 & 4) != 0) {
            f11 = zoomableBoxScopeImpl.rotation;
        }
        return zoomableBoxScopeImpl.m1889copyd4ec7I(f10, j4, f11);
    }

    /* renamed from: component1, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* renamed from: copy-d-4ec7I, reason: not valid java name */
    public final ZoomableBoxScopeImpl m1889copyd4ec7I(float scale, long offset, float rotation) {
        return new ZoomableBoxScopeImpl(scale, offset, rotation, null);
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof ZoomableBoxScopeImpl) {
                ZoomableBoxScopeImpl zoomableBoxScopeImpl = (ZoomableBoxScopeImpl) other;
                if (Float.compare(this.scale, zoomableBoxScopeImpl.scale) != 0 || !o3.b.c(this.offset, zoomableBoxScopeImpl.offset) || Float.compare(this.rotation, zoomableBoxScopeImpl.rotation) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // io.elevenlabs.ui.components.ZoomableBoxScope
    /* renamed from: getOffset-F1C5BW0 */
    public long mo1886getOffsetF1C5BW0() {
        return this.offset;
    }

    @Override // io.elevenlabs.ui.components.ZoomableBoxScope
    public float getRotation() {
        return this.rotation;
    }

    @Override // io.elevenlabs.ui.components.ZoomableBoxScope
    public float getScale() {
        return this.scale;
    }

    public int hashCode() {
        return Float.hashCode(this.rotation) + com.google.android.gms.internal.play_billing.b.g(this.offset, Float.hashCode(this.scale) * 31, 31);
    }

    public String toString() {
        return "ZoomableBoxScopeImpl(scale=" + this.scale + ", offset=" + o3.b.j(this.offset) + ", rotation=" + this.rotation + Separators.RPAREN;
    }

    public /* synthetic */ ZoomableBoxScopeImpl(float f10, long j4, float f11, kotlin.jvm.internal.f fVar) {
        this(f10, j4, f11);
    }
}
