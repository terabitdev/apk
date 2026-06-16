package io.livekit.android.e2ee;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j0.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lio/livekit/android/e2ee/KeyInfo;", "", "participantId", "", "keyIndex", "", SubscriberAttributeKt.JSON_NAME_KEY, "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getKeyIndex", "()I", "setKeyIndex", "(I)V", "getParticipantId", "setParticipantId", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class KeyInfo {
    private String key;
    private int keyIndex;
    private String participantId;

    public KeyInfo(String str, int i10, String str2) {
        str.getClass();
        str2.getClass();
        this.participantId = str;
        this.keyIndex = i10;
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getKeyIndex() {
        return this.keyIndex;
    }

    public final String getParticipantId() {
        return this.participantId;
    }

    public final void setKey(String str) {
        str.getClass();
        this.key = str;
    }

    public final void setKeyIndex(int i10) {
        this.keyIndex = i10;
    }

    public final void setParticipantId(String str) {
        str.getClass();
        this.participantId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyInfo(participantId='");
        sb.append(this.participantId);
        sb.append("', keyIndex=");
        return c.m(sb, this.keyIndex, ')');
    }
}
