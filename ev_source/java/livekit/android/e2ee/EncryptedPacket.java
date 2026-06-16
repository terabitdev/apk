package io.livekit.android.e2ee;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lio/livekit/android/e2ee/EncryptedPacket;", "", "payload", "", "iv", "keyIndex", "", "([B[BI)V", "getIv", "()[B", "getKeyIndex", "()I", "getPayload", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EncryptedPacket {
    private final byte[] iv;
    private final int keyIndex;
    private final byte[] payload;

    public EncryptedPacket(byte[] bArr, byte[] bArr2, int i10) {
        bArr.getClass();
        bArr2.getClass();
        this.payload = bArr;
        this.iv = bArr2;
        this.keyIndex = i10;
    }

    public final byte[] getIv() {
        return this.iv;
    }

    public final int getKeyIndex() {
        return this.keyIndex;
    }

    public final byte[] getPayload() {
        return this.payload;
    }
}
