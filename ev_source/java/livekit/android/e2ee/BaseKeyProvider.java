package io.livekit.android.e2ee;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import et.d;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.FrameCryptorFactory;
import livekit.org.webrtc.FrameCryptorKeyProvider;
import wq.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lio/livekit/android/e2ee/BaseKeyProvider;", "Lio/livekit/android/e2ee/KeyProvider;", "", "ratchetSalt", "uncryptedMagicBytes", "", "ratchetWindowSize", "", "enableSharedKey", "failureTolerance", "keyRingSize", "discardFrameWhenCryptorNotReady", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZIIZ)V", SubscriberAttributeKt.JSON_NAME_KEY, "keyIndex", "setSharedKey", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "", "ratchetSharedKey", "(Ljava/lang/Integer;)[B", "exportSharedKey", "participantId", "Lsn/z;", "setKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "ratchetKey", "(Ljava/lang/String;Ljava/lang/Integer;)[B", "exportKey", "trailer", "setSifTrailer", "([B)V", "getLatestKeyIndex", "(Ljava/lang/String;)I", "Z", "getEnableSharedKey", "()Z", "setEnableSharedKey", "(Z)V", "", "latestSetIndex", "Ljava/util/Map;", "Llivekit/org/webrtc/FrameCryptorKeyProvider;", "rtcKeyProvider", "Llivekit/org/webrtc/FrameCryptorKeyProvider;", "getRtcKeyProvider", "()Llivekit/org/webrtc/FrameCryptorKeyProvider;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BaseKeyProvider implements KeyProvider {
    private boolean enableSharedKey;
    private final Map<String, Integer> latestSetIndex;
    private final FrameCryptorKeyProvider rtcKeyProvider;

    public BaseKeyProvider(String str, String str2, int i10, boolean z6, int i11, int i12, boolean z10) {
        str.getClass();
        str2.getClass();
        this.enableSharedKey = z6;
        this.latestSetIndex = new LinkedHashMap();
        boolean enableSharedKey = getEnableSharedKey();
        Charset charset = b.f37231a;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        byte[] bytes2 = str2.getBytes(charset);
        bytes2.getClass();
        FrameCryptorKeyProvider createFrameCryptorKeyProvider = FrameCryptorFactory.createFrameCryptorKeyProvider(enableSharedKey, bytes, i10, bytes2, i11, i12, z10);
        createFrameCryptorKeyProvider.getClass();
        this.rtcKeyProvider = createFrameCryptorKeyProvider;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] exportKey(String participantId, Integer keyIndex) {
        int i10;
        participantId.getClass();
        FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
        if (keyIndex != null) {
            i10 = keyIndex.intValue();
        } else {
            i10 = 0;
        }
        byte[] exportKey = rtcKeyProvider.exportKey(participantId, i10);
        exportKey.getClass();
        return exportKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] exportSharedKey(Integer keyIndex) {
        int i10;
        FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
        if (keyIndex != null) {
            i10 = keyIndex.intValue();
        } else {
            i10 = 0;
        }
        byte[] exportSharedKey = rtcKeyProvider.exportSharedKey(i10);
        exportSharedKey.getClass();
        return exportSharedKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public boolean getEnableSharedKey() {
        return this.enableSharedKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public int getLatestKeyIndex(String participantId) {
        participantId.getClass();
        Integer num = this.latestSetIndex.get(participantId);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public FrameCryptorKeyProvider getRtcKeyProvider() {
        return this.rtcKeyProvider;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] ratchetKey(String participantId, Integer keyIndex) {
        int i10;
        participantId.getClass();
        FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
        if (keyIndex != null) {
            i10 = keyIndex.intValue();
        } else {
            i10 = 0;
        }
        byte[] ratchetKey = rtcKeyProvider.ratchetKey(participantId, i10);
        ratchetKey.getClass();
        return ratchetKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public byte[] ratchetSharedKey(Integer keyIndex) {
        int i10;
        FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
        if (keyIndex != null) {
            i10 = keyIndex.intValue();
        } else {
            i10 = 0;
        }
        byte[] ratchetSharedKey = rtcKeyProvider.ratchetSharedKey(i10);
        ratchetSharedKey.getClass();
        return ratchetSharedKey;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public void setEnableSharedKey(boolean z6) {
        this.enableSharedKey = z6;
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public void setKey(String key, String participantId, Integer keyIndex) {
        key.getClass();
        if (!getEnableSharedKey()) {
            int i10 = 0;
            if (participantId == null) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.a(null, "Please provide valid participantId for non-SharedKey mode.", new Object[0]);
                    return;
                }
                return;
            }
            if (keyIndex != null) {
                i10 = keyIndex.intValue();
            }
            this.latestSetIndex.put(participantId, Integer.valueOf(i10));
            FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
            byte[] bytes = key.getBytes(b.f37231a);
            bytes.getClass();
            rtcKeyProvider.setKey(participantId, i10, bytes);
        }
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public boolean setSharedKey(String key, Integer keyIndex) {
        int i10;
        key.getClass();
        FrameCryptorKeyProvider rtcKeyProvider = getRtcKeyProvider();
        if (keyIndex != null) {
            i10 = keyIndex.intValue();
        } else {
            i10 = 0;
        }
        byte[] bytes = key.getBytes(b.f37231a);
        bytes.getClass();
        return rtcKeyProvider.setSharedKey(i10, bytes);
    }

    @Override // io.livekit.android.e2ee.KeyProvider
    public void setSifTrailer(byte[] trailer) {
        trailer.getClass();
        getRtcKeyProvider().setSifTrailer(trailer);
    }

    public BaseKeyProvider() {
        this(null, null, 0, false, 0, 0, false, 127, null);
    }

    public /* synthetic */ BaseKeyProvider(String str, String str2, int i10, boolean z6, int i11, int i12, boolean z10, int i13, f fVar) {
        this((i13 & 1) != 0 ? E2EEOptionsKt.defaultRatchetSalt : str, (i13 & 2) != 0 ? E2EEOptionsKt.defaultMagicBytes : str2, (i13 & 4) != 0 ? 16 : i10, (i13 & 8) != 0 ? true : z6, (i13 & 16) != 0 ? -1 : i11, (i13 & 32) != 0 ? 16 : i12, (i13 & 64) != 0 ? false : z10);
    }
}
