package io.livekit.android.e2ee;

import a9.a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.FrameCryptorKeyProvider;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/livekit/android/e2ee/KeyProvider;", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "keyIndex", "", "setSharedKey", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "", "ratchetSharedKey", "(Ljava/lang/Integer;)[B", "exportSharedKey", "participantId", "Lsn/z;", "setKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "ratchetKey", "(Ljava/lang/String;Ljava/lang/Integer;)[B", "exportKey", "trailer", "setSifTrailer", "([B)V", "getLatestKeyIndex", "(Ljava/lang/String;)I", "Llivekit/org/webrtc/FrameCryptorKeyProvider;", "getRtcKeyProvider", "()Llivekit/org/webrtc/FrameCryptorKeyProvider;", "rtcKeyProvider", "getEnableSharedKey", "()Z", "setEnableSharedKey", "(Z)V", "enableSharedKey", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface KeyProvider {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ byte[] exportKey$default(KeyProvider keyProvider, String str, Integer num, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = 0;
                }
                return keyProvider.exportKey(str, num);
            }
            a.y("Super calls with default arguments not supported in this target, function: exportKey");
            return null;
        }

        public static /* synthetic */ byte[] exportSharedKey$default(KeyProvider keyProvider, Integer num, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    num = 0;
                }
                return keyProvider.exportSharedKey(num);
            }
            a.y("Super calls with default arguments not supported in this target, function: exportSharedKey");
            return null;
        }

        public static /* synthetic */ byte[] ratchetKey$default(KeyProvider keyProvider, String str, Integer num, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = 0;
                }
                return keyProvider.ratchetKey(str, num);
            }
            a.y("Super calls with default arguments not supported in this target, function: ratchetKey");
            return null;
        }

        public static /* synthetic */ byte[] ratchetSharedKey$default(KeyProvider keyProvider, Integer num, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    num = 0;
                }
                return keyProvider.ratchetSharedKey(num);
            }
            a.y("Super calls with default arguments not supported in this target, function: ratchetSharedKey");
            return null;
        }

        public static /* synthetic */ void setKey$default(KeyProvider keyProvider, String str, String str2, Integer num, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    num = 0;
                }
                keyProvider.setKey(str, str2, num);
                return;
            }
            a.y("Super calls with default arguments not supported in this target, function: setKey");
        }

        public static /* synthetic */ boolean setSharedKey$default(KeyProvider keyProvider, String str, Integer num, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = 0;
                }
                return keyProvider.setSharedKey(str, num);
            }
            a.y("Super calls with default arguments not supported in this target, function: setSharedKey");
            return false;
        }
    }

    byte[] exportKey(String participantId, Integer keyIndex);

    byte[] exportSharedKey(Integer keyIndex);

    boolean getEnableSharedKey();

    int getLatestKeyIndex(String participantId);

    FrameCryptorKeyProvider getRtcKeyProvider();

    byte[] ratchetKey(String participantId, Integer keyIndex);

    byte[] ratchetSharedKey(Integer keyIndex);

    void setEnableSharedKey(boolean z6);

    void setKey(String key, String participantId, Integer keyIndex);

    boolean setSharedKey(String key, Integer keyIndex);

    void setSifTrailer(byte[] trailer);
}
