package io.livekit.android.e2ee;

import et.d;
import io.livekit.android.e2ee.DataPacketCryptorManager;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.DataPacketCryptor;
import livekit.org.webrtc.DataPacketCryptorFactory;
import livekit.org.webrtc.FrameCryptorAlgorithm;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManagerImpl;", "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "Lio/livekit/android/e2ee/KeyProvider;", "keyProvider", "<init>", "(Lio/livekit/android/e2ee/KeyProvider;)V", "Lio/livekit/android/room/participant/Participant$Identity;", "participantId", "", "keyIndex", "", "payload", "Lio/livekit/android/e2ee/EncryptedPacket;", "encrypt-bi5aZsc", "(Ljava/lang/String;I[B)Lio/livekit/android/e2ee/EncryptedPacket;", "encrypt", "packet", "decrypt-tq5M0Po", "(Ljava/lang/String;Lio/livekit/android/e2ee/EncryptedPacket;)[B", "decrypt", "Lsn/z;", "dispose", "()V", "", "isDisposed", "Z", "()Z", "setDisposed", "(Z)V", "Llivekit/org/webrtc/DataPacketCryptor;", "dataPacketCryptor", "Llivekit/org/webrtc/DataPacketCryptor;", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DataPacketCryptorManagerImpl implements DataPacketCryptorManager {
    private final DataPacketCryptor dataPacketCryptor;
    private boolean isDisposed;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lio/livekit/android/e2ee/DataPacketCryptorManagerImpl$Factory;", "Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "()V", "create", "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "keyProvider", "Lio/livekit/android/e2ee/KeyProvider;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Factory implements DataPacketCryptorManager.Factory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @Override // io.livekit.android.e2ee.DataPacketCryptorManager.Factory
        public DataPacketCryptorManager create(KeyProvider keyProvider) {
            keyProvider.getClass();
            return new DataPacketCryptorManagerImpl(keyProvider);
        }
    }

    public DataPacketCryptorManagerImpl(KeyProvider keyProvider) {
        keyProvider.getClass();
        DataPacketCryptor createDataPacketCryptor = DataPacketCryptorFactory.createDataPacketCryptor(FrameCryptorAlgorithm.AES_GCM, keyProvider.getRtcKeyProvider());
        createDataPacketCryptor.getClass();
        this.dataPacketCryptor = createDataPacketCryptor;
    }

    @Override // io.livekit.android.e2ee.DataPacketCryptorManager
    /* renamed from: decrypt-tq5M0Po */
    public synchronized byte[] mo2519decrypttq5M0Po(String participantId, EncryptedPacket packet) {
        participantId.getClass();
        packet.getClass();
        if (this.isDisposed) {
            return null;
        }
        return this.dataPacketCryptor.decrypt(participantId, new DataPacketCryptor.EncryptedPacket(packet.getPayload(), packet.getIv(), packet.getKeyIndex()));
    }

    @Override // io.livekit.android.e2ee.DataPacketCryptorManager
    public synchronized void dispose() {
        if (this.isDisposed) {
            return;
        }
        this.isDisposed = true;
        this.dataPacketCryptor.dispose();
    }

    @Override // io.livekit.android.e2ee.DataPacketCryptorManager
    /* renamed from: encrypt-bi5aZsc */
    public synchronized EncryptedPacket mo2520encryptbi5aZsc(String participantId, int keyIndex, byte[] payload) {
        participantId.getClass();
        payload.getClass();
        if (this.isDisposed) {
            return null;
        }
        DataPacketCryptor.EncryptedPacket encrypt = this.dataPacketCryptor.encrypt(participantId, keyIndex, payload);
        if (encrypt == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(null, "Error encrypting packet: null packet", new Object[0]);
            }
            return null;
        }
        byte[] bArr = encrypt.payload;
        byte[] bArr2 = encrypt.iv;
        int i10 = encrypt.keyIndex;
        if (bArr == null) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Error encrypting packet: null payload", new Object[0]);
            }
            return null;
        }
        if (bArr2 == null) {
            LKLog.Companion companion3 = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(null, "Error encrypting packet: null iv returned", new Object[0]);
            }
            return null;
        }
        return new EncryptedPacket(bArr, bArr2, i10);
    }

    /* renamed from: isDisposed, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final void setDisposed(boolean z6) {
        this.isDisposed = z6;
    }
}
