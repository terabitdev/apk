package io.elevenlabs.data.mapping;

import android.util.Base64;
import com.google.protobuf.c6;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.OfflineChapterData;
import io.elevenlabs.domain.model.OfflineChapterStatus;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.a0;
import tn.p;
import tn.t;
import tn.u;
import ur.g1;
import ur.h0;
import vr.b;
import vr.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u001a\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\t*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\r*\u00020\u000eH\u0002\u001a\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0002¨\u0006\u0012"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/OfflineReadData;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "chapters", "", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "nowMillis", "", "readyManifestUrls", "", "", "readyDrmKeySetIds", "", "Lio/elevenlabs/domain/model/OfflineChapterStatus;", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "parseStringMapJson", "json", "parseDrmKeySetIdsJson", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadMappingKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OfflineReadEntity.Type.values().length];
            try {
                iArr[OfflineReadEntity.Type.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineReadEntity.Type.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OfflineReadEntity.Status.values().length];
            try {
                iArr2[OfflineReadEntity.Status.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OfflineReadEntity.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OfflineChapterEntity.Status.values().length];
            try {
                iArr3[OfflineChapterEntity.Status.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private static final Map<String, byte[]> parseDrmKeySetIdsJson(String str) {
        try {
            b bVar = c.f35855d;
            bVar.getClass();
            g1 g1Var = g1.f34588a;
            Map map = (Map) bVar.b(str, new h0(g1Var, g1Var));
            LinkedHashMap linkedHashMap = new LinkedHashMap(a0.H(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), Base64.decode((String) ((Map.Entry) obj).getValue(), 2));
            }
            return linkedHashMap;
        } catch (Exception unused) {
            return u.f33548a;
        }
    }

    private static final Map<String, String> parseStringMapJson(String str) {
        try {
            b bVar = c.f35855d;
            bVar.getClass();
            g1 g1Var = g1.f34588a;
            return (Map) bVar.b(str, new h0(g1Var, g1Var));
        } catch (Exception unused) {
            return u.f33548a;
        }
    }

    private static final Map<String, byte[]> readyDrmKeySetIds(List<OfflineChapterEntity> list) {
        ArrayList<OfflineChapterEntity> arrayList = new ArrayList();
        for (Object obj : list) {
            OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) obj;
            if (offlineChapterEntity.getStatus() == OfflineChapterEntity.Status.READY && offlineChapterEntity.getFileNumber() != null && offlineChapterEntity.getDrmKeySetId() != null) {
                arrayList.add(obj);
            }
        }
        int H = a0.H(p.a0(arrayList, 10));
        if (H < 16) {
            H = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H);
        for (OfflineChapterEntity offlineChapterEntity2 : arrayList) {
            String fileNumber = offlineChapterEntity2.getFileNumber();
            fileNumber.getClass();
            linkedHashMap.put(fileNumber, Base64.decode(offlineChapterEntity2.getDrmKeySetId(), 2));
        }
        return linkedHashMap;
    }

    private static final Map<String, String> readyManifestUrls(List<OfflineChapterEntity> list) {
        ArrayList<OfflineChapterEntity> arrayList = new ArrayList();
        for (Object obj : list) {
            OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) obj;
            if (offlineChapterEntity.getStatus() == OfflineChapterEntity.Status.READY && offlineChapterEntity.getFileNumber() != null && offlineChapterEntity.getCachedManifestUrl() != null) {
                arrayList.add(obj);
            }
        }
        int H = a0.H(p.a0(arrayList, 10));
        if (H < 16) {
            H = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H);
        for (OfflineChapterEntity offlineChapterEntity2 : arrayList) {
            String fileNumber = offlineChapterEntity2.getFileNumber();
            fileNumber.getClass();
            String cachedManifestUrl = offlineChapterEntity2.getCachedManifestUrl();
            cachedManifestUrl.getClass();
            linkedHashMap.put(fileNumber, cachedManifestUrl);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (r5 == null) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[LOOP:0: B:27:0x00ca->B:29:0x00d0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OfflineReadData toDomain(OfflineReadEntity offlineReadEntity, List<OfflineChapterEntity> list, long j4) {
        AudioType audioType;
        OfflineReadStatus offlineReadStatus;
        int H;
        String cachedManifestUrls;
        offlineReadEntity.getClass();
        list.getClass();
        long id2 = offlineReadEntity.getId();
        String readId = offlineReadEntity.getReadId();
        String voiceId = offlineReadEntity.getVoiceId();
        int i10 = WhenMappings.$EnumSwitchMapping$0[offlineReadEntity.getType().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                audioType = AudioType.MEDIA;
            } else {
                c6.p();
                return null;
            }
        } else {
            audioType = AudioType.TTS;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[offlineReadEntity.getStatus().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                offlineReadStatus = OfflineReadStatus.DOWNLOADING;
            } else {
                offlineReadStatus = OfflineReadStatus.ERROR;
            }
        } else {
            if (!list.isEmpty()) {
                for (OfflineChapterEntity offlineChapterEntity : list) {
                    if (offlineChapterEntity.getStatus() == OfflineChapterEntity.Status.EXPIRED || (offlineChapterEntity.getStatus() == OfflineChapterEntity.Status.READY && offlineChapterEntity.getExpiresAtUnix() <= j4)) {
                        offlineReadStatus = OfflineReadStatus.EXPIRED;
                        break;
                    }
                }
            }
            offlineReadStatus = OfflineReadStatus.READY;
        }
        OfflineReadStatus offlineReadStatus2 = offlineReadStatus;
        int progress = offlineReadEntity.getProgress();
        Map readyManifestUrls = readyManifestUrls(list);
        boolean isEmpty = readyManifestUrls.isEmpty();
        Map map = u.f33548a;
        if (isEmpty && ((cachedManifestUrls = offlineReadEntity.getCachedManifestUrls()) == null || (readyManifestUrls = parseStringMapJson(cachedManifestUrls)) == null)) {
            readyManifestUrls = map;
        }
        Map map2 = readyManifestUrls;
        Map readyDrmKeySetIds = readyDrmKeySetIds(list);
        boolean isEmpty2 = readyDrmKeySetIds.isEmpty();
        Map map3 = readyDrmKeySetIds;
        if (isEmpty2) {
            String drmKeySetIds = offlineReadEntity.getDrmKeySetIds();
            if (drmKeySetIds != null) {
                Map parseDrmKeySetIdsJson = parseDrmKeySetIdsJson(drmKeySetIds);
                map3 = parseDrmKeySetIdsJson;
            }
            H = a0.H(p.a0(list, 10));
            if (H < 16) {
                H = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
            for (OfflineChapterEntity offlineChapterEntity2 : list) {
                linkedHashMap.put(Integer.valueOf(offlineChapterEntity2.getChapterIndex()), new OfflineChapterData(offlineChapterEntity2.getChapterIndex(), toDomain(offlineChapterEntity2.getStatus()), offlineChapterEntity2.getProgress(), offlineChapterEntity2.getCreatedAtUnix(), offlineChapterEntity2.getExpiresAtUnix()));
            }
            return new OfflineReadData(id2, readId, voiceId, audioType, offlineReadStatus2, progress, map2, map, linkedHashMap);
        }
        map = map3;
        H = a0.H(p.a0(list, 10));
        if (H < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(H);
        while (r5.hasNext()) {
        }
        return new OfflineReadData(id2, readId, voiceId, audioType, offlineReadStatus2, progress, map2, map, linkedHashMap2);
    }

    public static /* synthetic */ OfflineReadData toDomain$default(OfflineReadEntity offlineReadEntity, List list, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = t.f33547a;
        }
        if ((i10 & 2) != 0) {
            j4 = System.currentTimeMillis();
        }
        return toDomain(offlineReadEntity, list, j4);
    }

    private static final OfflineChapterStatus toDomain(OfflineChapterEntity.Status status) {
        int i10 = WhenMappings.$EnumSwitchMapping$2[status.ordinal()];
        if (i10 == 1) {
            return OfflineChapterStatus.PENDING;
        }
        if (i10 == 2) {
            return OfflineChapterStatus.DOWNLOADING;
        }
        if (i10 == 3) {
            return OfflineChapterStatus.READY;
        }
        if (i10 == 4) {
            return OfflineChapterStatus.ERROR;
        }
        if (i10 == 5) {
            return OfflineChapterStatus.EXPIRED;
        }
        c6.p();
        return null;
    }
}
