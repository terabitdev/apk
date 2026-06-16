package io.livekit.android.webrtc;

import android.gov.nist.javax.sdp.fields.AttributeField;
import b.f;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import tn.c0;
import wq.i;
import wq.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lb/f;", "", "Lsn/k;", "Landroid/gov/nist/javax/sdp/fields/AttributeField;", "Lio/livekit/android/webrtc/SdpRtp;", "getRtps", "(Lb/f;)Ljava/util/List;", "", "string", "tryParseRtp", "(Ljava/lang/String;)Lio/livekit/android/webrtc/SdpRtp;", "Lio/livekit/android/webrtc/SdpMsid;", "getMsid", "(Lb/f;)Lio/livekit/android/webrtc/SdpMsid;", "Lio/livekit/android/webrtc/SdpFmtp;", "getFmtps", "tryParseFmtp", "(Ljava/lang/String;)Lio/livekit/android/webrtc/SdpFmtp;", "Lio/livekit/android/webrtc/SdpExt;", "getExts", "tryParseExt", "(Ljava/lang/String;)Lio/livekit/android/webrtc/SdpExt;", "str", "", "toOptionalLong", "(Ljava/lang/String;)Ljava/lang/Long;", "toOptionalString", "(Ljava/lang/String;)Ljava/lang/String;", "Lwq/l;", "RTP", "Lwq/l;", "FMTP", "EXT", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class JainSdpUtilsKt {
    private static final l RTP = new l("(\\d*) ([\\w\\-.]*)(?:\\s*/(\\d*)(?:\\s*/(\\S*))?)?");
    private static final l FMTP = new l("(\\d*) ([\\S| ]*)");
    private static final l EXT = new l("(\\d+)(?:/(\\w+))?(?: (urn:ietf:params:rtp-hdrext:encrypt))? (\\S*)(?: (\\S*))?");

    public static final List<k> getExts(f fVar) {
        k kVar;
        fVar.getClass();
        Vector attributes = fVar.getAttributes(true);
        attributes.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (obj instanceof AttributeField) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (m.c(((AttributeField) next).getAttribute().getName(), "extmap")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AttributeField attributeField = (AttributeField) it2.next();
            String value = attributeField.getValue();
            value.getClass();
            SdpExt tryParseExt = tryParseExt(value);
            if (tryParseExt == null) {
                LKLog.Companion companion = LKLog.INSTANCE;
                kVar = null;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.f(null, "could not parse extmap: " + attributeField.encode(), new Object[0]);
                }
            } else {
                kVar = new k(attributeField, tryParseExt);
            }
            if (kVar != null) {
                arrayList3.add(kVar);
            }
        }
        return arrayList3;
    }

    public static final List<k> getFmtps(f fVar) {
        k kVar;
        fVar.getClass();
        Vector attributes = fVar.getAttributes(true);
        attributes.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (obj instanceof AttributeField) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (m.c(((AttributeField) next).getAttribute().getName(), "fmtp")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AttributeField attributeField = (AttributeField) it2.next();
            String value = attributeField.getValue();
            value.getClass();
            SdpFmtp tryParseFmtp = tryParseFmtp(value);
            if (tryParseFmtp == null) {
                LKLog.Companion companion = LKLog.INSTANCE;
                kVar = null;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.f(null, "could not parse fmtp: " + attributeField.encode(), new Object[0]);
                }
            } else {
                kVar = new k(attributeField, tryParseFmtp);
            }
            if (kVar != null) {
                arrayList3.add(kVar);
            }
        }
        return arrayList3;
    }

    public static final SdpMsid getMsid(f fVar) {
        fVar.getClass();
        String attribute = fVar.getAttribute("msid");
        if (attribute == null) {
            return null;
        }
        return new SdpMsid(attribute);
    }

    public static final List<k> getRtps(f fVar) {
        k kVar;
        fVar.getClass();
        Vector attributes = fVar.getAttributes(true);
        attributes.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (obj instanceof AttributeField) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (m.c(((AttributeField) next).getAttribute().getName(), "rtpmap")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AttributeField attributeField = (AttributeField) it2.next();
            String value = attributeField.getValue();
            value.getClass();
            SdpRtp tryParseRtp = tryParseRtp(value);
            if (tryParseRtp == null) {
                LKLog.Companion companion = LKLog.INSTANCE;
                kVar = null;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.f(null, "could not parse rtpmap: " + attributeField.encode(), new Object[0]);
                }
            } else {
                kVar = new k(attributeField, tryParseRtp);
            }
            if (kVar != null) {
                arrayList3.add(kVar);
            }
        }
        return arrayList3;
    }

    public static final Long toOptionalLong(String str) {
        str.getClass();
        if (str.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public static final String toOptionalString(String str) {
        str.getClass();
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final SdpExt tryParseExt(String str) {
        str.getClass();
        i d10 = EXT.d(str);
        if (d10 == null) {
            return null;
        }
        String str2 = (String) ((c0) d10.a()).get(1);
        String str3 = (String) ((c0) d10.a()).get(2);
        String str4 = (String) ((c0) d10.a()).get(3);
        return new SdpExt(Long.parseLong(str2), toOptionalString(str3), toOptionalString(str4), (String) ((c0) d10.a()).get(4), toOptionalString((String) ((c0) d10.a()).get(5)));
    }

    public static final SdpFmtp tryParseFmtp(String str) {
        str.getClass();
        i d10 = FMTP.d(str);
        if (d10 == null) {
            return null;
        }
        String str2 = (String) ((c0) d10.a()).get(1);
        return new SdpFmtp(Long.parseLong(str2), (String) ((c0) d10.a()).get(2));
    }

    public static final SdpRtp tryParseRtp(String str) {
        str.getClass();
        i d10 = RTP.d(str);
        if (d10 == null) {
            return null;
        }
        String str2 = (String) ((c0) d10.a()).get(1);
        return new SdpRtp(Long.parseLong(str2), (String) ((c0) d10.a()).get(2), toOptionalLong((String) ((c0) d10.a()).get(3)), toOptionalString((String) ((c0) d10.a()).get(4)));
    }
}
