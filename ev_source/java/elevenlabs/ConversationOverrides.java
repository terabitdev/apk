package io.elevenlabs;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/ConversationOverrides;", "", "textOnly", "", "<init>", "(Ljava/lang/Boolean;)V", "getTextOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lio/elevenlabs/ConversationOverrides;", "equals", "other", "hashCode", "", "toString", "", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ConversationOverrides {
    private final Boolean textOnly;

    public /* synthetic */ ConversationOverrides(Boolean bool, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : bool);
    }

    public static /* synthetic */ ConversationOverrides copy$default(ConversationOverrides conversationOverrides, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = conversationOverrides.textOnly;
        }
        return conversationOverrides.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getTextOnly() {
        return this.textOnly;
    }

    public final ConversationOverrides copy(Boolean textOnly) {
        return new ConversationOverrides(textOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ConversationOverrides) && m.c(this.textOnly, ((ConversationOverrides) other).textOnly)) {
            return true;
        }
        return false;
    }

    public final Boolean getTextOnly() {
        return this.textOnly;
    }

    public int hashCode() {
        Boolean bool = this.textOnly;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ConversationOverrides(textOnly=" + this.textOnly + Separators.RPAREN;
    }

    public ConversationOverrides(Boolean bool) {
        this.textOnly = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationOverrides() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
