package io.livekit.android.webrtc;

import ho.l;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpCapabilities;
import livekit.org.webrtc.RtpTransceiver;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llivekit/org/webrtc/RtpTransceiver;", "", "targetCodec", "Lkotlin/Function1;", "Llivekit/org/webrtc/MediaStreamTrack$MediaType;", "Llivekit/org/webrtc/RtpCapabilities;", "Lio/livekit/android/dagger/CapabilitiesGetter;", "capabilitiesGetter", "Lsn/z;", "sortVideoCodecPreferences", "(Llivekit/org/webrtc/RtpTransceiver;Ljava/lang/String;Lho/l;)V", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RtpTransceiverExtKt {
    public static final void sortVideoCodecPreferences(RtpTransceiver rtpTransceiver, String str, l lVar) {
        rtpTransceiver.getClass();
        str.getClass();
        lVar.getClass();
        RtpCapabilities rtpCapabilities = (RtpCapabilities) lVar.invoke(MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO);
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.e(null, "capabilities:", new Object[0]);
        }
        List<RtpCapabilities.CodecCapability> list = rtpCapabilities.codecs;
        list.getClass();
        for (RtpCapabilities.CodecCapability codecCapability : list) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.e(null, "codec: " + codecCapability.name + ", " + codecCapability.kind + ", " + codecCapability.mimeType + ", " + codecCapability.parameters + ", " + codecCapability.preferredPayloadType, new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (RtpCapabilities.CodecCapability codecCapability2 : rtpCapabilities.codecs) {
            String str2 = codecCapability2.mimeType;
            str2.getClass();
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("audio/opus")) {
                arrayList.add(codecCapability2);
            } else if (!lowerCase.equals("video/".concat(str))) {
                arrayList3.add(codecCapability2);
            } else if (str.equals("h264")) {
                if (m.c(codecCapability2.parameters.get("profile-level-id"), "42e01f")) {
                    arrayList.add(codecCapability2);
                } else {
                    arrayList2.add(codecCapability2);
                }
            } else {
                arrayList.add(codecCapability2);
            }
        }
        rtpTransceiver.setCodecPreferences(o.O0(arrayList3, o.O0(arrayList2, arrayList)));
    }
}
