package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/model/ActiveCreditPack;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "expiresAt", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "getLabel", "()Ljava/lang/String;", "getExpiresAt", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ActiveCreditPack {
    private final Date expiresAt;
    private final String label;

    public ActiveCreditPack(String str, Date date) {
        str.getClass();
        date.getClass();
        this.label = str;
        this.expiresAt = date;
    }

    public static /* synthetic */ ActiveCreditPack copy$default(ActiveCreditPack activeCreditPack, String str, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activeCreditPack.label;
        }
        if ((i10 & 2) != 0) {
            date = activeCreditPack.expiresAt;
        }
        return activeCreditPack.copy(str, date);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    public final ActiveCreditPack copy(String label, Date expiresAt) {
        label.getClass();
        expiresAt.getClass();
        return new ActiveCreditPack(label, expiresAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveCreditPack)) {
            return false;
        }
        ActiveCreditPack activeCreditPack = (ActiveCreditPack) other;
        if (m.c(this.label, activeCreditPack.label) && m.c(this.expiresAt, activeCreditPack.expiresAt)) {
            return true;
        }
        return false;
    }

    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.expiresAt.hashCode() + (this.label.hashCode() * 31);
    }

    public String toString() {
        return "ActiveCreditPack(label=" + this.label + ", expiresAt=" + this.expiresAt + Separators.RPAREN;
    }
}
