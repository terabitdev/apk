package io.elevenlabs.domain.services.player;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import oo.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/services/player/PlayerConfiguration;", "", "Loo/d;", "activityClass", "", "bookmarkSavedStringRes", "bookmarkFailedStringRes", "bookmarkNotSupportedStringRes", "<init>", "(Loo/d;III)V", "component1", "()Loo/d;", "component2", "()I", "component3", "component4", "copy", "(Loo/d;III)Lio/elevenlabs/domain/services/player/PlayerConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loo/d;", "getActivityClass", TokenNames.I, "getBookmarkSavedStringRes", "getBookmarkFailedStringRes", "getBookmarkNotSupportedStringRes", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class PlayerConfiguration {
    private final d activityClass;
    private final int bookmarkFailedStringRes;
    private final int bookmarkNotSupportedStringRes;
    private final int bookmarkSavedStringRes;

    public PlayerConfiguration(d dVar, int i10, int i11, int i12) {
        dVar.getClass();
        this.activityClass = dVar;
        this.bookmarkSavedStringRes = i10;
        this.bookmarkFailedStringRes = i11;
        this.bookmarkNotSupportedStringRes = i12;
    }

    public static /* synthetic */ PlayerConfiguration copy$default(PlayerConfiguration playerConfiguration, d dVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dVar = playerConfiguration.activityClass;
        }
        if ((i13 & 2) != 0) {
            i10 = playerConfiguration.bookmarkSavedStringRes;
        }
        if ((i13 & 4) != 0) {
            i11 = playerConfiguration.bookmarkFailedStringRes;
        }
        if ((i13 & 8) != 0) {
            i12 = playerConfiguration.bookmarkNotSupportedStringRes;
        }
        return playerConfiguration.copy(dVar, i10, i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final d getActivityClass() {
        return this.activityClass;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBookmarkSavedStringRes() {
        return this.bookmarkSavedStringRes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBookmarkFailedStringRes() {
        return this.bookmarkFailedStringRes;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBookmarkNotSupportedStringRes() {
        return this.bookmarkNotSupportedStringRes;
    }

    public final PlayerConfiguration copy(d activityClass, int bookmarkSavedStringRes, int bookmarkFailedStringRes, int bookmarkNotSupportedStringRes) {
        activityClass.getClass();
        return new PlayerConfiguration(activityClass, bookmarkSavedStringRes, bookmarkFailedStringRes, bookmarkNotSupportedStringRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerConfiguration)) {
            return false;
        }
        PlayerConfiguration playerConfiguration = (PlayerConfiguration) other;
        if (m.c(this.activityClass, playerConfiguration.activityClass) && this.bookmarkSavedStringRes == playerConfiguration.bookmarkSavedStringRes && this.bookmarkFailedStringRes == playerConfiguration.bookmarkFailedStringRes && this.bookmarkNotSupportedStringRes == playerConfiguration.bookmarkNotSupportedStringRes) {
            return true;
        }
        return false;
    }

    public final d getActivityClass() {
        return this.activityClass;
    }

    public final int getBookmarkFailedStringRes() {
        return this.bookmarkFailedStringRes;
    }

    public final int getBookmarkNotSupportedStringRes() {
        return this.bookmarkNotSupportedStringRes;
    }

    public final int getBookmarkSavedStringRes() {
        return this.bookmarkSavedStringRes;
    }

    public int hashCode() {
        return Integer.hashCode(this.bookmarkNotSupportedStringRes) + c.b(this.bookmarkFailedStringRes, c.b(this.bookmarkSavedStringRes, this.activityClass.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "PlayerConfiguration(activityClass=" + this.activityClass + ", bookmarkSavedStringRes=" + this.bookmarkSavedStringRes + ", bookmarkFailedStringRes=" + this.bookmarkFailedStringRes + ", bookmarkNotSupportedStringRes=" + this.bookmarkNotSupportedStringRes + Separators.RPAREN;
    }
}
