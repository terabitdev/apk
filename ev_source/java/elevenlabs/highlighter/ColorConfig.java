package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lio/elevenlabs/highlighter/ColorConfig;", "", "Lp3/x;", "activeWordColor", "activeSentenceColor", "bookmarkBgColor", "activeSentenceBookmarkBgColor", "<init>", "(JJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "copy-jRlVdoo", "(JJJJ)Lio/elevenlabs/highlighter/ColorConfig;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getActiveWordColor-0d7_KjU", "getActiveSentenceColor-0d7_KjU", "getBookmarkBgColor-0d7_KjU", "getActiveSentenceBookmarkBgColor-0d7_KjU", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ColorConfig {
    public static final int $stable = 0;
    private final long activeSentenceBookmarkBgColor;
    private final long activeSentenceColor;
    private final long activeWordColor;
    private final long bookmarkBgColor;

    private ColorConfig(long j4, long j10, long j11, long j12) {
        this.activeWordColor = j4;
        this.activeSentenceColor = j10;
        this.bookmarkBgColor = j11;
        this.activeSentenceBookmarkBgColor = j12;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ ColorConfig m961copyjRlVdoo$default(ColorConfig colorConfig, long j4, long j10, long j11, long j12, int i10, Object obj) {
        long j13;
        if ((i10 & 1) != 0) {
            j4 = colorConfig.activeWordColor;
        }
        long j14 = j4;
        if ((i10 & 2) != 0) {
            j10 = colorConfig.activeSentenceColor;
        }
        long j15 = j10;
        if ((i10 & 4) != 0) {
            j11 = colorConfig.bookmarkBgColor;
        }
        long j16 = j11;
        if ((i10 & 8) != 0) {
            j13 = colorConfig.activeSentenceBookmarkBgColor;
        } else {
            j13 = j12;
        }
        return colorConfig.m966copyjRlVdoo(j14, j15, j16, j13);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveWordColor() {
        return this.activeWordColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveSentenceColor() {
        return this.activeSentenceColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBookmarkBgColor() {
        return this.bookmarkBgColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveSentenceBookmarkBgColor() {
        return this.activeSentenceBookmarkBgColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final ColorConfig m966copyjRlVdoo(long activeWordColor, long activeSentenceColor, long bookmarkBgColor, long activeSentenceBookmarkBgColor) {
        return new ColorConfig(activeWordColor, activeSentenceColor, bookmarkBgColor, activeSentenceBookmarkBgColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorConfig)) {
            return false;
        }
        ColorConfig colorConfig = (ColorConfig) other;
        if (p3.x.c(this.activeWordColor, colorConfig.activeWordColor) && p3.x.c(this.activeSentenceColor, colorConfig.activeSentenceColor) && p3.x.c(this.bookmarkBgColor, colorConfig.bookmarkBgColor) && p3.x.c(this.activeSentenceBookmarkBgColor, colorConfig.activeSentenceBookmarkBgColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActiveSentenceBookmarkBgColor-0d7_KjU, reason: not valid java name */
    public final long m967getActiveSentenceBookmarkBgColor0d7_KjU() {
        return this.activeSentenceBookmarkBgColor;
    }

    /* renamed from: getActiveSentenceColor-0d7_KjU, reason: not valid java name */
    public final long m968getActiveSentenceColor0d7_KjU() {
        return this.activeSentenceColor;
    }

    /* renamed from: getActiveWordColor-0d7_KjU, reason: not valid java name */
    public final long m969getActiveWordColor0d7_KjU() {
        return this.activeWordColor;
    }

    /* renamed from: getBookmarkBgColor-0d7_KjU, reason: not valid java name */
    public final long m970getBookmarkBgColor0d7_KjU() {
        return this.bookmarkBgColor;
    }

    public int hashCode() {
        long j4 = this.activeWordColor;
        int i10 = p3.x.f26439n;
        return Long.hashCode(this.activeSentenceBookmarkBgColor) + com.google.android.gms.internal.play_billing.b.g(this.bookmarkBgColor, com.google.android.gms.internal.play_billing.b.g(this.activeSentenceColor, Long.hashCode(j4) * 31, 31), 31);
    }

    public String toString() {
        String i10 = p3.x.i(this.activeWordColor);
        String i11 = p3.x.i(this.activeSentenceColor);
        return defpackage.f.n(defpackage.f.s("ColorConfig(activeWordColor=", i10, ", activeSentenceColor=", i11, ", bookmarkBgColor="), p3.x.i(this.bookmarkBgColor), ", activeSentenceBookmarkBgColor=", p3.x.i(this.activeSentenceBookmarkBgColor), Separators.RPAREN);
    }

    public /* synthetic */ ColorConfig(long j4, long j10, long j11, long j12, kotlin.jvm.internal.f fVar) {
        this(j4, j10, j11, j12);
    }
}
