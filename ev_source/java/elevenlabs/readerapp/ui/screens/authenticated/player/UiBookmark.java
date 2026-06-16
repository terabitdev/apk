package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/UiBookmark;", "", "startOffset", "", "endOffsetInclusive", ParameterNames.TEXT, "", "<init>", "(JJLjava/lang/String;)V", "getStartOffset", "()J", "getEndOffsetInclusive", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class UiBookmark {
    public static final int $stable = 0;
    private final long endOffsetInclusive;
    private final long startOffset;
    private final String text;

    public UiBookmark(long j4, long j10, String str) {
        str.getClass();
        this.startOffset = j4;
        this.endOffsetInclusive = j10;
        this.text = str;
    }

    public static /* synthetic */ UiBookmark copy$default(UiBookmark uiBookmark, long j4, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = uiBookmark.startOffset;
        }
        long j11 = j4;
        if ((i10 & 2) != 0) {
            j10 = uiBookmark.endOffsetInclusive;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            str = uiBookmark.text;
        }
        return uiBookmark.copy(j11, j12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartOffset() {
        return this.startOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndOffsetInclusive() {
        return this.endOffsetInclusive;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final UiBookmark copy(long startOffset, long endOffsetInclusive, String text) {
        text.getClass();
        return new UiBookmark(startOffset, endOffsetInclusive, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiBookmark)) {
            return false;
        }
        UiBookmark uiBookmark = (UiBookmark) other;
        if (this.startOffset == uiBookmark.startOffset && this.endOffsetInclusive == uiBookmark.endOffsetInclusive && kotlin.jvm.internal.m.c(this.text, uiBookmark.text)) {
            return true;
        }
        return false;
    }

    public final long getEndOffsetInclusive() {
        return this.endOffsetInclusive;
    }

    public final long getStartOffset() {
        return this.startOffset;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.endOffsetInclusive, Long.hashCode(this.startOffset) * 31, 31);
    }

    public String toString() {
        long j4 = this.startOffset;
        long j10 = this.endOffsetInclusive;
        String str = this.text;
        StringBuilder q = com.google.android.gms.internal.play_billing.b.q("UiBookmark(startOffset=", j4, ", endOffsetInclusive=");
        q.append(j10);
        q.append(", text=");
        q.append(str);
        q.append(Separators.RPAREN);
        return q.toString();
    }
}
