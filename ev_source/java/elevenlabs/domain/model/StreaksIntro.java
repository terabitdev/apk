package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/StreaksIntro;", "", "streakImageUrl", "", "streakFullImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStreakImageUrl", "()Ljava/lang/String;", "getStreakFullImageUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class StreaksIntro {
    private final String streakFullImageUrl;
    private final String streakImageUrl;

    public StreaksIntro(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.streakImageUrl = str;
        this.streakFullImageUrl = str2;
    }

    public static /* synthetic */ StreaksIntro copy$default(StreaksIntro streaksIntro, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = streaksIntro.streakImageUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = streaksIntro.streakFullImageUrl;
        }
        return streaksIntro.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStreakImageUrl() {
        return this.streakImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStreakFullImageUrl() {
        return this.streakFullImageUrl;
    }

    public final StreaksIntro copy(String streakImageUrl, String streakFullImageUrl) {
        streakImageUrl.getClass();
        streakFullImageUrl.getClass();
        return new StreaksIntro(streakImageUrl, streakFullImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreaksIntro)) {
            return false;
        }
        StreaksIntro streaksIntro = (StreaksIntro) other;
        if (m.c(this.streakImageUrl, streaksIntro.streakImageUrl) && m.c(this.streakFullImageUrl, streaksIntro.streakFullImageUrl)) {
            return true;
        }
        return false;
    }

    public final String getStreakFullImageUrl() {
        return this.streakFullImageUrl;
    }

    public final String getStreakImageUrl() {
        return this.streakImageUrl;
    }

    public int hashCode() {
        return this.streakFullImageUrl.hashCode() + (this.streakImageUrl.hashCode() * 31);
    }

    public String toString() {
        return h.c("StreaksIntro(streakImageUrl=", this.streakImageUrl, ", streakFullImageUrl=", this.streakFullImageUrl, Separators.RPAREN);
    }
}
