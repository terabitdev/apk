package io.livekit.android.room;

import android.gov.nist.javax.sdp.fields.AttributeField;
import b.f;
import io.livekit.android.room.TrackBitrateInfoKey;
import io.livekit.android.webrtc.JainSdpUtilsKt;
import io.livekit.android.webrtc.SdpExt;
import io.livekit.android.webrtc.SdpFmtp;
import io.livekit.android.webrtc.SdpMsid;
import io.livekit.android.webrtc.SdpRtp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import tn.o;
import wq.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb/f;", "mediaDesc", "Lsn/z;", "ensureVideoDDExtensionForSVC", "(Lb/f;)V", "media", "", "Lio/livekit/android/room/TrackBitrateInfoKey;", "Lio/livekit/android/room/TrackBitrateInfo;", "trackBitrates", "ensureCodecBitrates", "(Lb/f;Ljava/util/Map;)V", "", "codec", "", "isSVCCodec", "(Ljava/lang/String;)Z", "DD_EXTENSION_URI", "Ljava/lang/String;", "", "startBitrateForSVC", "D", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionTransportKt {
    private static final String DD_EXTENSION_URI = "https://aomediacodec.github.io/av1-rtp-spec/#dependency-descriptor-rtp-header-extension";
    private static final double startBitrateForSVC = 0.7d;

    public static final void ensureCodecBitrates(f fVar, Map<TrackBitrateInfoKey, TrackBitrateInfo> map) {
        String value;
        boolean z6;
        Object obj;
        fVar.getClass();
        map.getClass();
        SdpMsid msid = JainSdpUtilsKt.getMsid(fVar);
        if (msid != null && (value = msid.getValue()) != null) {
            for (Map.Entry<TrackBitrateInfoKey, TrackBitrateInfo> entry : map.entrySet()) {
                TrackBitrateInfoKey key = entry.getKey();
                TrackBitrateInfo value2 = entry.getValue();
                if ((key instanceof TrackBitrateInfoKey.Cid) && n.a0(value, ((TrackBitrateInfoKey.Cid) key).getValue(), false)) {
                    Iterator<T> it = JainSdpUtilsKt.getRtps(fVar).iterator();
                    while (true) {
                        z6 = true;
                        if (it.hasNext()) {
                            obj = it.next();
                            if (u.O(((SdpRtp) ((k) obj).f31601b).getCodec(), value2.getCodec(), true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    k kVar = (k) obj;
                    if (kVar != null) {
                        long payload = ((SdpRtp) kVar.f31601b).getPayload();
                        Iterator<k> it2 = JainSdpUtilsKt.getFmtps(fVar).iterator();
                        boolean z10 = false;
                        while (true) {
                            if (it2.hasNext()) {
                                k next = it2.next();
                                AttributeField attributeField = (AttributeField) next.f31600a;
                                SdpFmtp sdpFmtp = (SdpFmtp) next.f31601b;
                                if (sdpFmtp.getPayload() == payload) {
                                    String config = sdpFmtp.getConfig();
                                    if (!n.a0(sdpFmtp.getConfig(), "x-google-start-bitrate", false)) {
                                        StringBuilder q = defpackage.f.q(config, ";x-google-start-bitrate=");
                                        q.append(a.z(value2.getMaxBitrate() * startBitrateForSVC));
                                        config = q.toString();
                                    }
                                    if (!n.a0(sdpFmtp.getConfig(), "x-google-max-bitrate", false)) {
                                        StringBuilder q10 = defpackage.f.q(config, ";x-google-max-bitrate=");
                                        q10.append(value2.getMaxBitrate());
                                        config = q10.toString();
                                    }
                                    if (!m.c(sdpFmtp.getConfig(), config)) {
                                        attributeField.setValue(sdpFmtp.getPayload() + ' ' + config);
                                        break;
                                    }
                                    z10 = true;
                                }
                            } else {
                                z6 = z10;
                                break;
                            }
                        }
                        if (!z6) {
                            fVar.addAttribute(new SdpFmtp(payload, "x-google-start-bitrate=" + (value2.getMaxBitrate() * startBitrateForSVC) + ";x-google-max-bitrate=" + value2.getMaxBitrate()).toAttributeField());
                        }
                    }
                }
            }
        }
    }

    public static final void ensureVideoDDExtensionForSVC(f fVar) {
        SdpRtp sdpRtp;
        String codec;
        boolean z6;
        fVar.getClass();
        k kVar = (k) o.y0(JainSdpUtilsKt.getRtps(fVar));
        if (kVar != null && (sdpRtp = (SdpRtp) kVar.f31601b) != null && (codec = sdpRtp.getCodec()) != null && isSVCCodec(codec)) {
            List<k> exts = JainSdpUtilsKt.getExts(fVar);
            boolean z10 = false;
            long j4 = 0;
            if (exts == null || !exts.isEmpty()) {
                Iterator<T> it = exts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SdpExt sdpExt = (SdpExt) ((k) it.next()).f31601b;
                    if (m.c(sdpExt.getUri(), DD_EXTENSION_URI)) {
                        z6 = true;
                    } else {
                        if (sdpExt.getValue() > j4) {
                            j4 = sdpExt.getValue();
                        }
                        z6 = false;
                    }
                    if (z6) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                fVar.addAttribute(new SdpExt(j4 + 1, null, null, DD_EXTENSION_URI, null).toAttributeField());
            }
        }
    }

    public static final boolean isSVCCodec(String str) {
        if (str != null) {
            if ("av1".equalsIgnoreCase(str) || "vp9".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
