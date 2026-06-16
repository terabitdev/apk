package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;", "", FirebaseAnalytics.Param.CONTENT, "", "isFromUser", "", DiagnosticsEntry.TIMESTAMP_KEY, "", "<init>", "(Ljava/lang/String;ZJ)V", "getContent", "()Ljava/lang/String;", "()Z", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ChatMessage {
    public static final int $stable = 0;
    private final String content;
    private final boolean isFromUser;
    private final long timestamp;

    public ChatMessage(String str, boolean z6, long j4) {
        str.getClass();
        this.content = str;
        this.isFromUser = z6;
        this.timestamp = j4;
    }

    public static /* synthetic */ ChatMessage copy$default(ChatMessage chatMessage, String str, boolean z6, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = chatMessage.content;
        }
        if ((i10 & 2) != 0) {
            z6 = chatMessage.isFromUser;
        }
        if ((i10 & 4) != 0) {
            j4 = chatMessage.timestamp;
        }
        return chatMessage.copy(str, z6, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFromUser() {
        return this.isFromUser;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ChatMessage copy(String content, boolean isFromUser, long timestamp) {
        content.getClass();
        return new ChatMessage(content, isFromUser, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) other;
        if (kotlin.jvm.internal.m.c(this.content, chatMessage.content) && this.isFromUser == chatMessage.isFromUser && this.timestamp == chatMessage.timestamp) {
            return true;
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + com.google.android.gms.internal.play_billing.b.f(this.content.hashCode() * 31, 31, this.isFromUser);
    }

    public final boolean isFromUser() {
        return this.isFromUser;
    }

    public String toString() {
        String str = this.content;
        boolean z6 = this.isFromUser;
        long j4 = this.timestamp;
        StringBuilder sb = new StringBuilder("ChatMessage(content=");
        sb.append(str);
        sb.append(", isFromUser=");
        sb.append(z6);
        sb.append(", timestamp=");
        return defpackage.f.h(j4, Separators.RPAREN, sb);
    }

    public /* synthetic */ ChatMessage(String str, boolean z6, long j4, int i10, kotlin.jvm.internal.f fVar) {
        this(str, z6, (i10 & 4) != 0 ? System.currentTimeMillis() : j4);
    }
}
