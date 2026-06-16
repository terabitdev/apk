package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/CaptionItem;", "", "", ParameterNames.TEXT, "", "iconRes", "Lp3/x;", "iconTint", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lp3/x;Lkotlin/jvm/internal/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3-QN2ZGVo", "()Lp3/x;", "component3", "copy-t9lfQc4", "(Ljava/lang/String;Ljava/lang/Integer;Lp3/x;)Lio/elevenlabs/readerapp/ui/components/CaptionItem;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/lang/Integer;", "getIconRes", "Lp3/x;", "getIconTint-QN2ZGVo", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CaptionItem {
    public static final int $stable = 0;
    private final Integer iconRes;
    private final p3.x iconTint;
    private final String text;

    public /* synthetic */ CaptionItem(String str, Integer num, p3.x xVar, int i10, kotlin.jvm.internal.f fVar) {
        this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : xVar, null);
    }

    /* renamed from: copy-t9lfQc4$default, reason: not valid java name */
    public static /* synthetic */ CaptionItem m1025copyt9lfQc4$default(CaptionItem captionItem, String str, Integer num, p3.x xVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = captionItem.text;
        }
        if ((i10 & 2) != 0) {
            num = captionItem.iconRes;
        }
        if ((i10 & 4) != 0) {
            xVar = captionItem.iconTint;
        }
        return captionItem.m1027copyt9lfQc4(str, num, xVar);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
    public final p3.x getIconTint() {
        return this.iconTint;
    }

    /* renamed from: copy-t9lfQc4, reason: not valid java name */
    public final CaptionItem m1027copyt9lfQc4(String text, Integer iconRes, p3.x iconTint) {
        text.getClass();
        return new CaptionItem(text, iconRes, iconTint, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptionItem)) {
            return false;
        }
        CaptionItem captionItem = (CaptionItem) other;
        if (kotlin.jvm.internal.m.c(this.text, captionItem.text) && kotlin.jvm.internal.m.c(this.iconRes, captionItem.iconRes) && kotlin.jvm.internal.m.c(this.iconTint, captionItem.iconTint)) {
            return true;
        }
        return false;
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    /* renamed from: getIconTint-QN2ZGVo, reason: not valid java name */
    public final p3.x m1028getIconTintQN2ZGVo() {
        return this.iconTint;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.text.hashCode() * 31;
        Integer num = this.iconRes;
        int i10 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        p3.x xVar = this.iconTint;
        if (xVar != null) {
            i10 = Long.hashCode(xVar.f26440a);
        }
        return i11 + i10;
    }

    public String toString() {
        return "CaptionItem(text=" + this.text + ", iconRes=" + this.iconRes + ", iconTint=" + this.iconTint + Separators.RPAREN;
    }

    private CaptionItem(String str, Integer num, p3.x xVar) {
        str.getClass();
        this.text = str;
        this.iconRes = num;
        this.iconTint = xVar;
    }

    public /* synthetic */ CaptionItem(String str, Integer num, p3.x xVar, kotlin.jvm.internal.f fVar) {
        this(str, num, xVar);
    }
}
