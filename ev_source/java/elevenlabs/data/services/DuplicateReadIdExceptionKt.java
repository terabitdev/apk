package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import io.elevenlabs.domain.model.ReadMeta;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/Logger;", "logger", "", ParameterNames.TAG, "source", "", "Lio/elevenlabs/domain/model/ReadMeta;", "list", "Lsn/z;", "reportDuplicateReadIds", "(Lio/elevenlabs/domain/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "meta", "describeRow", "(Lio/elevenlabs/domain/model/ReadMeta;)Ljava/lang/String;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DuplicateReadIdExceptionKt {
    public static /* synthetic */ CharSequence a(Map.Entry entry) {
        return reportDuplicateReadIds$lambda$2(entry);
    }

    public static final String describeRow(ReadMeta readMeta) {
        OfflineReadData offlineReadData = readMeta.getOfflineReadData();
        if (offlineReadData == null) {
            return "noOffline";
        }
        long offlineReadId = offlineReadData.getOfflineReadId();
        OfflineReadStatus status = offlineReadData.getStatus();
        String voiceId = offlineReadData.getVoiceId();
        AudioType type = offlineReadData.getType();
        int overallProgressPercent = offlineReadData.getOverallProgressPercent();
        StringBuilder sb = new StringBuilder("offlineId=");
        sb.append(offlineReadId);
        sb.append(", status=");
        sb.append(status);
        sb.append(", voice=");
        sb.append(voiceId);
        sb.append(", type=");
        sb.append(type);
        return xo.e.b(overallProgressPercent, ", progress=", sb);
    }

    public static final void reportDuplicateReadIds(Logger logger, String str, String str2, List<ReadMeta> list) {
        logger.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String readId = ((ReadMeta) obj).getReadId();
            Object obj2 = linkedHashMap.get(readId);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(readId, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return;
        }
        String E0 = o.E0(linkedHashMap2.entrySet(), "; ", null, null, new b(12), 30);
        logger.logError(str, defpackage.f.k("Duplicate readIds in ", str2, ": ", E0), new DuplicateReadIdException(str2, E0));
    }

    public static final CharSequence reportDuplicateReadIds$lambda$2(Map.Entry entry) {
        entry.getClass();
        String str = (String) entry.getKey();
        List list = (List) entry.getValue();
        return defpackage.f.l(o.E0(list, ", ", null, null, DuplicateReadIdExceptionKt$reportDuplicateReadIds$details$1$1.INSTANCE, 30), "]", android.gov.nist.javax.sip.header.a.o(list.size(), "readId=", str, "×", " ["));
    }
}
