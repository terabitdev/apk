package io.livekit.android.e2ee;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0013J,\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManager;", "", "Lio/livekit/android/room/participant/Participant$Identity;", "participantId", "", "keyIndex", "", "payload", "Lio/livekit/android/e2ee/EncryptedPacket;", "encrypt-bi5aZsc", "(Ljava/lang/String;I[B)Lio/livekit/android/e2ee/EncryptedPacket;", "encrypt", "packet", "decrypt-tq5M0Po", "(Ljava/lang/String;Lio/livekit/android/e2ee/EncryptedPacket;)[B", "decrypt", "Lsn/z;", "dispose", "()V", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface DataPacketCryptorManager {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "", "create", "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "keyProvider", "Lio/livekit/android/e2ee/KeyProvider;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        DataPacketCryptorManager create(KeyProvider keyProvider);
    }

    /* renamed from: decrypt-tq5M0Po, reason: not valid java name */
    byte[] mo2519decrypttq5M0Po(String participantId, EncryptedPacket packet);

    void dispose();

    /* renamed from: encrypt-bi5aZsc, reason: not valid java name */
    EncryptedPacket mo2520encryptbi5aZsc(String participantId, int keyIndex, byte[] payload);
}
