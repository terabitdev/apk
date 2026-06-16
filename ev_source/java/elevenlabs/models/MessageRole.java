package io.elevenlabs.models;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\bj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Lio/elevenlabs/models/MessageRole;", "", "<init>", "(Ljava/lang/String;I)V", "USER", "AGENT", "isUser", "", "()Z", "isAgent", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MessageRole {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MessageRole[] $VALUES;
    public static final MessageRole USER = new MessageRole("USER", 0);
    public static final MessageRole AGENT = new MessageRole("AGENT", 1);

    private static final /* synthetic */ MessageRole[] $values() {
        return new MessageRole[]{USER, AGENT};
    }

    static {
        MessageRole[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private MessageRole(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MessageRole valueOf(String str) {
        return (MessageRole) Enum.valueOf(MessageRole.class, str);
    }

    public static MessageRole[] values() {
        return (MessageRole[]) $VALUES.clone();
    }

    public final boolean isAgent() {
        if (this == AGENT) {
            return true;
        }
        return false;
    }

    public final boolean isUser() {
        if (this == USER) {
            return true;
        }
        return false;
    }
}
