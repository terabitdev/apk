package io.elevenlabs.models;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import j0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lio/elevenlabs/models/Message;", "", "id", "", FirebaseAnalytics.Param.CONTENT, "", "role", "Lio/elevenlabs/models/MessageRole;", DiagnosticsEntry.TIMESTAMP_KEY, "", "metadata", "", "<init>", "(ILjava/lang/String;Lio/elevenlabs/models/MessageRole;JLjava/util/Map;)V", "getId", "()I", "getContent", "()Ljava/lang/String;", "getRole", "()Lio/elevenlabs/models/MessageRole;", "getTimestamp", "()J", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Message {
    private final String content;
    private final int id;
    private final Map<String, Object> metadata;
    private final MessageRole role;
    private final long timestamp;

    public /* synthetic */ Message(int i10, String str, MessageRole messageRole, long j4, Map map, int i11, f fVar) {
        this(i10, str, messageRole, (i11 & 8) != 0 ? System.currentTimeMillis() : j4, (i11 & 16) != 0 ? u.f33548a : map);
    }

    public static /* synthetic */ Message copy$default(Message message, int i10, String str, MessageRole messageRole, long j4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = message.id;
        }
        if ((i11 & 2) != 0) {
            str = message.content;
        }
        if ((i11 & 4) != 0) {
            messageRole = message.role;
        }
        if ((i11 & 8) != 0) {
            j4 = message.timestamp;
        }
        if ((i11 & 16) != 0) {
            map = message.metadata;
        }
        Map map2 = map;
        MessageRole messageRole2 = messageRole;
        return message.copy(i10, str, messageRole2, j4, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final MessageRole getRole() {
        return this.role;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Map<String, Object> component5() {
        return this.metadata;
    }

    public final Message copy(int id2, String content, MessageRole role, long timestamp, Map<String, ? extends Object> metadata) {
        content.getClass();
        role.getClass();
        metadata.getClass();
        return new Message(id2, content, role, timestamp, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        if (this.id == message.id && m.c(this.content, message.content) && this.role == message.role && this.timestamp == message.timestamp && m.c(this.metadata, message.metadata)) {
            return true;
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getId() {
        return this.id;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final MessageRole getRole() {
        return this.role;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.metadata.hashCode() + b.g(this.timestamp, (this.role.hashCode() + c.c(Integer.hashCode(this.id) * 31, 31, this.content)) * 31, 31);
    }

    public String toString() {
        return "Message(id=" + this.id + ", content=" + this.content + ", role=" + this.role + ", timestamp=" + this.timestamp + ", metadata=" + this.metadata + Separators.RPAREN;
    }

    public Message(int i10, String str, MessageRole messageRole, long j4, Map<String, ? extends Object> map) {
        str.getClass();
        messageRole.getClass();
        map.getClass();
        this.id = i10;
        this.content = str;
        this.role = messageRole;
        this.timestamp = j4;
        this.metadata = map;
    }
}
