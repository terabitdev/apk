package io.elevenlabs.ui.echo.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize;", "", "WrapIcon", "Fixed", "Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize$Fixed;", "Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize$WrapIcon;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface ButtonIconContainerSize {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize$WrapIcon;", "Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize;", "Lr1/z1;", "padding", "<init>", "(Lr1/z1;)V", "component1", "()Lr1/z1;", "copy", "(Lr1/z1;)Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize$WrapIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr1/z1;", "getPadding", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class WrapIcon implements ButtonIconContainerSize {
        public static final int $stable = 0;
        private final z1 padding;

        public WrapIcon(z1 z1Var) {
            z1Var.getClass();
            this.padding = z1Var;
        }

        public static /* synthetic */ WrapIcon copy$default(WrapIcon wrapIcon, z1 z1Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z1Var = wrapIcon.padding;
            }
            return wrapIcon.copy(z1Var);
        }

        /* renamed from: component1, reason: from getter */
        public final z1 getPadding() {
            return this.padding;
        }

        public final WrapIcon copy(z1 padding) {
            padding.getClass();
            return new WrapIcon(padding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof WrapIcon) && m.c(this.padding, ((WrapIcon) other).padding)) {
                return true;
            }
            return false;
        }

        public final z1 getPadding() {
            return this.padding;
        }

        public int hashCode() {
            return this.padding.hashCode();
        }

        public String toString() {
            return "WrapIcon(padding=" + this.padding + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize$Fixed;", "Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize;", "Lh5/f;", "size", "<init>", "(FLkotlin/jvm/internal/f;)V", "component1-D9Ej5fM", "()F", "component1", "copy-0680j_4", "(F)Lio/elevenlabs/ui/echo/components/ButtonIconContainerSize$Fixed;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.F, "getSize-D9Ej5fM", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Fixed implements ButtonIconContainerSize {
        public static final int $stable = 0;
        private final float size;

        private Fixed(float f10) {
            this.size = f10;
        }

        /* renamed from: copy-0680j_4$default, reason: not valid java name */
        public static /* synthetic */ Fixed m1957copy0680j_4$default(Fixed fixed, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = fixed.size;
            }
            return fixed.m1959copy0680j_4(f10);
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: copy-0680j_4, reason: not valid java name */
        public final Fixed m1959copy0680j_4(float size) {
            return new Fixed(size, null);
        }

        public boolean equals(Object other) {
            if (this != other) {
                if (!(other instanceof Fixed) || !f.b(this.size, ((Fixed) other).size)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
        public final float m1960getSizeD9Ej5fM() {
            return this.size;
        }

        public int hashCode() {
            return Float.hashCode(this.size);
        }

        public String toString() {
            return defpackage.f.C("Fixed(size=", f.c(this.size), Separators.RPAREN);
        }

        public /* synthetic */ Fixed(float f10, kotlin.jvm.internal.f fVar) {
            this(f10);
        }
    }
}
