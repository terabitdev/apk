package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import ho.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ0\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011Jv\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022(\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052&\b\u0002\u0010\n\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000eR7\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R5\u0010\n\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lio/elevenlabs/highlighter/TextSelectionMenuItem;", "", "", "id", "title", "Lkotlin/Function4;", "", "", "shouldShow", "Lsn/z;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lho/r;Lho/r;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lho/r;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lho/r;Lho/r;)Lio/elevenlabs/highlighter/TextSelectionMenuItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lho/r;", "getShouldShow", "getOnClick", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class TextSelectionMenuItem {
    public static final int $stable = 0;
    private final String id;
    private final r onClick;
    private final r shouldShow;
    private final String title;

    public TextSelectionMenuItem(String str, String str2, r rVar, r rVar2) {
        str.getClass();
        str2.getClass();
        rVar2.getClass();
        this.id = str;
        this.title = str2;
        this.shouldShow = rVar;
        this.onClick = rVar2;
    }

    public static /* synthetic */ TextSelectionMenuItem copy$default(TextSelectionMenuItem textSelectionMenuItem, String str, String str2, r rVar, r rVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = textSelectionMenuItem.id;
        }
        if ((i10 & 2) != 0) {
            str2 = textSelectionMenuItem.title;
        }
        if ((i10 & 4) != 0) {
            rVar = textSelectionMenuItem.shouldShow;
        }
        if ((i10 & 8) != 0) {
            rVar2 = textSelectionMenuItem.onClick;
        }
        return textSelectionMenuItem.copy(str, str2, rVar, rVar2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final r getShouldShow() {
        return this.shouldShow;
    }

    /* renamed from: component4, reason: from getter */
    public final r getOnClick() {
        return this.onClick;
    }

    public final TextSelectionMenuItem copy(String id2, String title, r shouldShow, r onClick) {
        id2.getClass();
        title.getClass();
        onClick.getClass();
        return new TextSelectionMenuItem(id2, title, shouldShow, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSelectionMenuItem)) {
            return false;
        }
        TextSelectionMenuItem textSelectionMenuItem = (TextSelectionMenuItem) other;
        if (kotlin.jvm.internal.m.c(this.id, textSelectionMenuItem.id) && kotlin.jvm.internal.m.c(this.title, textSelectionMenuItem.title) && kotlin.jvm.internal.m.c(this.shouldShow, textSelectionMenuItem.shouldShow) && kotlin.jvm.internal.m.c(this.onClick, textSelectionMenuItem.onClick)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final r getOnClick() {
        return this.onClick;
    }

    public final r getShouldShow() {
        return this.shouldShow;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(this.id.hashCode() * 31, 31, this.title);
        r rVar = this.shouldShow;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return this.onClick.hashCode() + ((c5 + hashCode) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        r rVar = this.shouldShow;
        r rVar2 = this.onClick;
        StringBuilder s10 = defpackage.f.s("TextSelectionMenuItem(id=", str, ", title=", str2, ", shouldShow=");
        s10.append(rVar);
        s10.append(", onClick=");
        s10.append(rVar2);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public /* synthetic */ TextSelectionMenuItem(String str, String str2, r rVar, r rVar2, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : rVar, rVar2);
    }
}
