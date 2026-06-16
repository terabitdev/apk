package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.domain.model.ChapterOfflineDownloadStatus;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u0003J\u0010\u0010*\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u0003J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\u0015\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0003J\u0015\u00106\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000eHÆ\u0003J\u0087\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000eHÆ\u0001J\u0014\u00108\u001a\u00020(2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\fHÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010$\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006="}, d2 = {"Lio/elevenlabs/domain/model/OfflineReadData;", "", "offlineReadId", "", "readId", "", "voiceId", "type", "Lio/elevenlabs/domain/model/AudioType;", "status", "Lio/elevenlabs/domain/model/OfflineReadStatus;", "overallProgressPercent", "", "cachedManifestUrls", "", "drmKeySetIds", "", "chapterStatuses", "Lio/elevenlabs/domain/model/OfflineChapterData;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/AudioType;Lio/elevenlabs/domain/model/OfflineReadStatus;ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getOfflineReadId", "()J", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getType", "()Lio/elevenlabs/domain/model/AudioType;", "getStatus", "()Lio/elevenlabs/domain/model/OfflineReadStatus;", "getOverallProgressPercent", "()I", "getCachedManifestUrls", "()Ljava/util/Map;", "getDrmKeySetIds", "getChapterStatuses", "earliestChapterExpiryUnix", "getEarliestChapterExpiryUnix", "()Ljava/lang/Long;", "isExpired", "", "nowMillis", "isExpiringSoon", "chapterDownloadIndicator", "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;", "chapterIndex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OfflineReadData {
    public static final long EXPIRY_WARNING_DAYS = 7;
    public static final long EXPIRY_WARNING_MILLIS = 604800000;
    private final Map<String, String> cachedManifestUrls;
    private final Map<Integer, OfflineChapterData> chapterStatuses;
    private final Map<String, byte[]> drmKeySetIds;
    private final long offlineReadId;
    private final int overallProgressPercent;
    private final String readId;
    private final OfflineReadStatus status;
    private final AudioType type;
    private final String voiceId;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineChapterStatus.values().length];
            try {
                iArr[OfflineChapterStatus.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineChapterStatus.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineChapterStatus.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OfflineReadData(long j4, String str, String str2, AudioType audioType, OfflineReadStatus offlineReadStatus, int i10, Map<String, String> map, Map<String, byte[]> map2, Map<Integer, OfflineChapterData> map3) {
        str.getClass();
        str2.getClass();
        audioType.getClass();
        offlineReadStatus.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.offlineReadId = j4;
        this.readId = str;
        this.voiceId = str2;
        this.type = audioType;
        this.status = offlineReadStatus;
        this.overallProgressPercent = i10;
        this.cachedManifestUrls = map;
        this.drmKeySetIds = map2;
        this.chapterStatuses = map3;
    }

    public static /* synthetic */ ChapterOfflineDownloadStatus chapterDownloadIndicator$default(OfflineReadData offlineReadData, int i10, long j4, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j4 = System.currentTimeMillis();
        }
        return offlineReadData.chapterDownloadIndicator(i10, j4);
    }

    public static /* synthetic */ OfflineReadData copy$default(OfflineReadData offlineReadData, long j4, String str, String str2, AudioType audioType, OfflineReadStatus offlineReadStatus, int i10, Map map, Map map2, Map map3, int i11, Object obj) {
        AudioType audioType2;
        OfflineReadStatus offlineReadStatus2;
        int i12;
        Map map4;
        Map map5;
        Map map6;
        if ((i11 & 1) != 0) {
            j4 = offlineReadData.offlineReadId;
        }
        long j10 = j4;
        if ((i11 & 2) != 0) {
            str = offlineReadData.readId;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = offlineReadData.voiceId;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            audioType2 = offlineReadData.type;
        } else {
            audioType2 = audioType;
        }
        if ((i11 & 16) != 0) {
            offlineReadStatus2 = offlineReadData.status;
        } else {
            offlineReadStatus2 = offlineReadStatus;
        }
        if ((i11 & 32) != 0) {
            i12 = offlineReadData.overallProgressPercent;
        } else {
            i12 = i10;
        }
        if ((i11 & 64) != 0) {
            map4 = offlineReadData.cachedManifestUrls;
        } else {
            map4 = map;
        }
        if ((i11 & 128) != 0) {
            map5 = offlineReadData.drmKeySetIds;
        } else {
            map5 = map2;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            map6 = offlineReadData.chapterStatuses;
        } else {
            map6 = map3;
        }
        return offlineReadData.copy(j10, str3, str4, audioType2, offlineReadStatus2, i12, map4, map5, map6);
    }

    public static /* synthetic */ boolean isExpired$default(OfflineReadData offlineReadData, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = System.currentTimeMillis();
        }
        return offlineReadData.isExpired(j4);
    }

    public static /* synthetic */ boolean isExpiringSoon$default(OfflineReadData offlineReadData, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = System.currentTimeMillis();
        }
        return offlineReadData.isExpiringSoon(j4);
    }

    public final ChapterOfflineDownloadStatus chapterDownloadIndicator(int chapterIndex, long nowMillis) {
        OfflineChapterData offlineChapterData = this.chapterStatuses.get(Integer.valueOf(chapterIndex));
        if (offlineChapterData == null) {
            if (this.status == OfflineReadStatus.READY && this.chapterStatuses.isEmpty()) {
                return ChapterOfflineDownloadStatus.Downloaded.INSTANCE;
            }
            return ChapterOfflineDownloadStatus.NotDownloaded.INSTANCE;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[offlineChapterData.getStatus().ordinal()];
        if (i10 == 1 && offlineChapterData.getExpiresAtUnix() > nowMillis) {
            return ChapterOfflineDownloadStatus.Downloaded.INSTANCE;
        }
        if (i10 != 2 && i10 != 3) {
            return ChapterOfflineDownloadStatus.NotDownloaded.INSTANCE;
        }
        return new ChapterOfflineDownloadStatus.Downloading(offlineChapterData.getProgressPercent());
    }

    /* renamed from: component1, reason: from getter */
    public final long getOfflineReadId() {
        return this.offlineReadId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component4, reason: from getter */
    public final AudioType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final OfflineReadStatus getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOverallProgressPercent() {
        return this.overallProgressPercent;
    }

    public final Map<String, String> component7() {
        return this.cachedManifestUrls;
    }

    public final Map<String, byte[]> component8() {
        return this.drmKeySetIds;
    }

    public final Map<Integer, OfflineChapterData> component9() {
        return this.chapterStatuses;
    }

    public final OfflineReadData copy(long offlineReadId, String readId, String voiceId, AudioType type, OfflineReadStatus status, int overallProgressPercent, Map<String, String> cachedManifestUrls, Map<String, byte[]> drmKeySetIds, Map<Integer, OfflineChapterData> chapterStatuses) {
        readId.getClass();
        voiceId.getClass();
        type.getClass();
        status.getClass();
        cachedManifestUrls.getClass();
        drmKeySetIds.getClass();
        chapterStatuses.getClass();
        return new OfflineReadData(offlineReadId, readId, voiceId, type, status, overallProgressPercent, cachedManifestUrls, drmKeySetIds, chapterStatuses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineReadData)) {
            return false;
        }
        OfflineReadData offlineReadData = (OfflineReadData) other;
        if (this.offlineReadId == offlineReadData.offlineReadId && m.c(this.readId, offlineReadData.readId) && m.c(this.voiceId, offlineReadData.voiceId) && this.type == offlineReadData.type && this.status == offlineReadData.status && this.overallProgressPercent == offlineReadData.overallProgressPercent && m.c(this.cachedManifestUrls, offlineReadData.cachedManifestUrls) && m.c(this.drmKeySetIds, offlineReadData.drmKeySetIds) && m.c(this.chapterStatuses, offlineReadData.chapterStatuses)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getCachedManifestUrls() {
        return this.cachedManifestUrls;
    }

    public final Map<Integer, OfflineChapterData> getChapterStatuses() {
        return this.chapterStatuses;
    }

    public final Map<String, byte[]> getDrmKeySetIds() {
        return this.drmKeySetIds;
    }

    public final Long getEarliestChapterExpiryUnix() {
        Collection<OfflineChapterData> values = this.chapterStatuses.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((OfflineChapterData) obj).getStatus() == OfflineChapterStatus.READY) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Long valueOf = Long.valueOf(((OfflineChapterData) it.next()).getExpiresAtUnix());
        while (it.hasNext()) {
            Long valueOf2 = Long.valueOf(((OfflineChapterData) it.next()).getExpiresAtUnix());
            if (valueOf.compareTo(valueOf2) > 0) {
                valueOf = valueOf2;
            }
        }
        return valueOf;
    }

    public final long getOfflineReadId() {
        return this.offlineReadId;
    }

    public final int getOverallProgressPercent() {
        return this.overallProgressPercent;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final OfflineReadStatus getStatus() {
        return this.status;
    }

    public final AudioType getType() {
        return this.type;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        return this.chapterStatuses.hashCode() + f.a(this.drmKeySetIds, f.a(this.cachedManifestUrls, c.b(this.overallProgressPercent, (this.status.hashCode() + ((this.type.hashCode() + c.c(c.c(Long.hashCode(this.offlineReadId) * 31, 31, this.readId), 31, this.voiceId)) * 31)) * 31, 31), 31), 31);
    }

    public final boolean isExpired(long nowMillis) {
        Long earliestChapterExpiryUnix = getEarliestChapterExpiryUnix();
        if (earliestChapterExpiryUnix == null || nowMillis < earliestChapterExpiryUnix.longValue()) {
            return false;
        }
        return true;
    }

    public final boolean isExpiringSoon(long nowMillis) {
        Long earliestChapterExpiryUnix;
        if (this.status == OfflineReadStatus.READY && (earliestChapterExpiryUnix = getEarliestChapterExpiryUnix()) != null) {
            long longValue = earliestChapterExpiryUnix.longValue() - nowMillis;
            if (1 <= longValue && longValue < 604800001) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "OfflineReadData(offlineReadId=" + this.offlineReadId + ", readId=" + this.readId + ", voiceId=" + this.voiceId + ", type=" + this.type + ", status=" + this.status + ", overallProgressPercent=" + this.overallProgressPercent + ", cachedManifestUrls=" + this.cachedManifestUrls + ", drmKeySetIds=" + this.drmKeySetIds + ", chapterStatuses=" + this.chapterStatuses + Separators.RPAREN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OfflineReadData(long j4, String str, String str2, AudioType audioType, OfflineReadStatus offlineReadStatus, int i10, Map map, Map map2, Map map3, int i11, kotlin.jvm.internal.f fVar) {
        this(j4, str, str2, audioType, offlineReadStatus, i10, r13 != 0 ? r0 : map, (i11 & 128) != 0 ? r0 : map2, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r0 : map3);
        int i12 = i11 & 64;
        u uVar = u.f33548a;
    }
}
