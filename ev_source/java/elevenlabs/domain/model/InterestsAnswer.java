package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/InterestsAnswer;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "title", "selected", "", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getTitle", "getSelected", "()Z", "getIcon", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class InterestsAnswer {
    private final String icon;
    private final String key;
    private final boolean selected;
    private final String title;

    public InterestsAnswer(String str, String str2, boolean z6, String str3) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.title = str2;
        this.selected = z6;
        this.icon = str3;
    }

    public static /* synthetic */ InterestsAnswer copy$default(InterestsAnswer interestsAnswer, String str, String str2, boolean z6, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = interestsAnswer.key;
        }
        if ((i10 & 2) != 0) {
            str2 = interestsAnswer.title;
        }
        if ((i10 & 4) != 0) {
            z6 = interestsAnswer.selected;
        }
        if ((i10 & 8) != 0) {
            str3 = interestsAnswer.icon;
        }
        return interestsAnswer.copy(str, str2, z6, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final InterestsAnswer copy(String r22, String title, boolean selected, String r52) {
        r22.getClass();
        title.getClass();
        return new InterestsAnswer(r22, title, selected, r52);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestsAnswer)) {
            return false;
        }
        InterestsAnswer interestsAnswer = (InterestsAnswer) other;
        if (m.c(this.key, interestsAnswer.key) && m.c(this.title, interestsAnswer.title) && this.selected == interestsAnswer.selected && m.c(this.icon, interestsAnswer.icon)) {
            return true;
        }
        return false;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int f10 = b.f(c.c(this.key.hashCode() * 31, 31, this.title), 31, this.selected);
        String str = this.icon;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.title;
        boolean z6 = this.selected;
        String str3 = this.icon;
        StringBuilder s10 = f.s("InterestsAnswer(key=", str, ", title=", str2, ", selected=");
        s10.append(z6);
        s10.append(", icon=");
        s10.append(str3);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
