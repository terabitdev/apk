package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ContentPreferencesState;", "", "isAssistantEnabled", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ContentPreferencesState;", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ContentPreferencesState {
    public static final int $stable = 0;
    private final Boolean isAssistantEnabled;

    public /* synthetic */ ContentPreferencesState(Boolean bool, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : bool);
    }

    public static /* synthetic */ ContentPreferencesState copy$default(ContentPreferencesState contentPreferencesState, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = contentPreferencesState.isAssistantEnabled;
        }
        return contentPreferencesState.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsAssistantEnabled() {
        return this.isAssistantEnabled;
    }

    public final ContentPreferencesState copy(Boolean isAssistantEnabled) {
        return new ContentPreferencesState(isAssistantEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ContentPreferencesState) && kotlin.jvm.internal.m.c(this.isAssistantEnabled, ((ContentPreferencesState) other).isAssistantEnabled)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.isAssistantEnabled;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isAssistantEnabled() {
        return this.isAssistantEnabled;
    }

    public String toString() {
        return "ContentPreferencesState(isAssistantEnabled=" + this.isAssistantEnabled + Separators.RPAREN;
    }

    public ContentPreferencesState(Boolean bool) {
        this.isAssistantEnabled = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentPreferencesState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
