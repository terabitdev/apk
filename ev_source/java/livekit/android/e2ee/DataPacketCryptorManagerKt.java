package io.livekit.android.e2ee;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$EncryptedPacket;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSdkType", "Lio/livekit/android/e2ee/EncryptedPacket;", "Llivekit/LivekitModels$EncryptedPacket;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DataPacketCryptorManagerKt {
    public static final EncryptedPacket toSdkType(LivekitModels$EncryptedPacket livekitModels$EncryptedPacket) {
        livekitModels$EncryptedPacket.getClass();
        byte[] m10 = livekitModels$EncryptedPacket.getEncryptedValue().m();
        m10.getClass();
        byte[] m11 = livekitModels$EncryptedPacket.getIv().m();
        m11.getClass();
        return new EncryptedPacket(m10, m11, livekitModels$EncryptedPacket.getKeyIndex());
    }
}
