package io.elevenlabs.player;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/player/BookmarkWindow;", "", "startOffset", "", "endOffset", ParameterNames.TEXT, "", "<init>", "(JJLjava/lang/String;)V", "getStartOffset", "()J", "getEndOffset", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class BookmarkWindow {
    private final long endOffset;
    private final long startOffset;
    private final String text;

    public BookmarkWindow(long j4, long j10, String str) {
        str.getClass();
        this.startOffset = j4;
        this.endOffset = j10;
        this.text = str;
    }

    public static /* synthetic */ BookmarkWindow copy$default(BookmarkWindow bookmarkWindow, long j4, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = bookmarkWindow.startOffset;
        }
        long j11 = j4;
        if ((i10 & 2) != 0) {
            j10 = bookmarkWindow.endOffset;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            str = bookmarkWindow.text;
        }
        return bookmarkWindow.copy(j11, j12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartOffset() {
        return this.startOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndOffset() {
        return this.endOffset;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final BookmarkWindow copy(long startOffset, long endOffset, String text) {
        text.getClass();
        return new BookmarkWindow(startOffset, endOffset, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookmarkWindow)) {
            return false;
        }
        BookmarkWindow bookmarkWindow = (BookmarkWindow) other;
        if (this.startOffset == bookmarkWindow.startOffset && this.endOffset == bookmarkWindow.endOffset && m.c(this.text, bookmarkWindow.text)) {
            return true;
        }
        return false;
    }

    public final long getEndOffset() {
        return this.endOffset;
    }

    public final long getStartOffset() {
        return this.startOffset;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.endOffset, Long.hashCode(this.startOffset) * 31, 31);
    }

    public String toString() {
        long j4 = this.startOffset;
        long j10 = this.endOffset;
        String str = this.text;
        StringBuilder q = com.google.android.gms.internal.play_billing.b.q("BookmarkWindow(startOffset=", j4, ", endOffset=");
        q.append(j10);
        q.append(", text=");
        q.append(str);
        q.append(Separators.RPAREN);
        return q.toString();
    }
}
