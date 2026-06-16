package io.elevenlabs.data.database.entities.offline;

import android.gov.nist.core.Separators;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00062"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "", "offlineReadId", "", "readId", "", "chapterIndex", "", "fileNumber", "status", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "progress", "cachedManifestUrl", "drmKeySetId", "createdAtUnix", "expiresAtUnix", "<init>", "(JLjava/lang/String;ILjava/lang/String;Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;ILjava/lang/String;Ljava/lang/String;JJ)V", "getOfflineReadId", "()J", "getReadId", "()Ljava/lang/String;", "getChapterIndex", "()I", "getFileNumber", "getStatus", "()Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "getProgress", "getCachedManifestUrl", "getDrmKeySetId", "getCreatedAtUnix", "getExpiresAtUnix", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "Status", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OfflineChapterEntity {
    public static final long EXPIRY_DAYS = 60;
    public static final long EXPIRY_MILLIS = 5184000000L;
    private final String cachedManifestUrl;
    private final int chapterIndex;
    private final long createdAtUnix;
    private final String drmKeySetId;
    private final long expiresAtUnix;
    private final String fileNumber;
    private final long offlineReadId;
    private final int progress;
    private final String readId;
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "DOWNLOADING", "READY", "ERROR", "EXPIRED", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Status {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PENDING = new Status("PENDING", 0);
        public static final Status DOWNLOADING = new Status("DOWNLOADING", 1);
        public static final Status READY = new Status("READY", 2);
        public static final Status ERROR = new Status("ERROR", 3);
        public static final Status EXPIRED = new Status("EXPIRED", 4);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, DOWNLOADING, READY, ERROR, EXPIRED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private Status(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OfflineChapterEntity(long j4, String str, int i10, String str2, Status status, int i11, String str3, String str4, long j10, long j11, int i12, kotlin.jvm.internal.f fVar) {
        this(j4, str, i10, r8, status, r10, r11, r12, j10, j11);
        String str5;
        int i13;
        String str6;
        String str7;
        if ((i12 & 8) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i12 & 32) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 64) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i12 & 128) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
    }

    public static /* synthetic */ OfflineChapterEntity copy$default(OfflineChapterEntity offlineChapterEntity, long j4, String str, int i10, String str2, Status status, int i11, String str3, String str4, long j10, long j11, int i12, Object obj) {
        long j12;
        String str5;
        int i13;
        String str6;
        Status status2;
        int i14;
        String str7;
        String str8;
        long j13;
        long j14;
        if ((i12 & 1) != 0) {
            j12 = offlineChapterEntity.offlineReadId;
        } else {
            j12 = j4;
        }
        if ((i12 & 2) != 0) {
            str5 = offlineChapterEntity.readId;
        } else {
            str5 = str;
        }
        if ((i12 & 4) != 0) {
            i13 = offlineChapterEntity.chapterIndex;
        } else {
            i13 = i10;
        }
        if ((i12 & 8) != 0) {
            str6 = offlineChapterEntity.fileNumber;
        } else {
            str6 = str2;
        }
        if ((i12 & 16) != 0) {
            status2 = offlineChapterEntity.status;
        } else {
            status2 = status;
        }
        if ((i12 & 32) != 0) {
            i14 = offlineChapterEntity.progress;
        } else {
            i14 = i11;
        }
        if ((i12 & 64) != 0) {
            str7 = offlineChapterEntity.cachedManifestUrl;
        } else {
            str7 = str3;
        }
        if ((i12 & 128) != 0) {
            str8 = offlineChapterEntity.drmKeySetId;
        } else {
            str8 = str4;
        }
        if ((i12 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            j13 = offlineChapterEntity.createdAtUnix;
        } else {
            j13 = j10;
        }
        if ((i12 & 512) != 0) {
            j14 = offlineChapterEntity.expiresAtUnix;
        } else {
            j14 = j11;
        }
        return offlineChapterEntity.copy(j12, str5, i13, str6, status2, i14, str7, str8, j13, j14);
    }

    /* renamed from: component1, reason: from getter */
    public final long getOfflineReadId() {
        return this.offlineReadId;
    }

    /* renamed from: component10, reason: from getter */
    public final long getExpiresAtUnix() {
        return this.expiresAtUnix;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileNumber() {
        return this.fileNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCachedManifestUrl() {
        return this.cachedManifestUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDrmKeySetId() {
        return this.drmKeySetId;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final OfflineChapterEntity copy(long offlineReadId, String readId, int chapterIndex, String fileNumber, Status status, int progress, String cachedManifestUrl, String drmKeySetId, long createdAtUnix, long expiresAtUnix) {
        readId.getClass();
        status.getClass();
        return new OfflineChapterEntity(offlineReadId, readId, chapterIndex, fileNumber, status, progress, cachedManifestUrl, drmKeySetId, createdAtUnix, expiresAtUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineChapterEntity)) {
            return false;
        }
        OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) other;
        if (this.offlineReadId == offlineChapterEntity.offlineReadId && m.c(this.readId, offlineChapterEntity.readId) && this.chapterIndex == offlineChapterEntity.chapterIndex && m.c(this.fileNumber, offlineChapterEntity.fileNumber) && this.status == offlineChapterEntity.status && this.progress == offlineChapterEntity.progress && m.c(this.cachedManifestUrl, offlineChapterEntity.cachedManifestUrl) && m.c(this.drmKeySetId, offlineChapterEntity.drmKeySetId) && this.createdAtUnix == offlineChapterEntity.createdAtUnix && this.expiresAtUnix == offlineChapterEntity.expiresAtUnix) {
            return true;
        }
        return false;
    }

    public final String getCachedManifestUrl() {
        return this.cachedManifestUrl;
    }

    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final String getDrmKeySetId() {
        return this.drmKeySetId;
    }

    public final long getExpiresAtUnix() {
        return this.expiresAtUnix;
    }

    public final String getFileNumber() {
        return this.fileNumber;
    }

    public final long getOfflineReadId() {
        return this.offlineReadId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int b10 = j0.c.b(this.chapterIndex, j0.c.c(Long.hashCode(this.offlineReadId) * 31, 31, this.readId), 31);
        String str = this.fileNumber;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b11 = j0.c.b(this.progress, (this.status.hashCode() + ((b10 + hashCode) * 31)) * 31, 31);
        String str2 = this.cachedManifestUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (b11 + hashCode2) * 31;
        String str3 = this.drmKeySetId;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return Long.hashCode(this.expiresAtUnix) + com.google.android.gms.internal.play_billing.b.g(this.createdAtUnix, (i11 + i10) * 31, 31);
    }

    public String toString() {
        long j4 = this.offlineReadId;
        String str = this.readId;
        int i10 = this.chapterIndex;
        String str2 = this.fileNumber;
        Status status = this.status;
        int i11 = this.progress;
        String str3 = this.cachedManifestUrl;
        String str4 = this.drmKeySetId;
        long j10 = this.createdAtUnix;
        long j11 = this.expiresAtUnix;
        StringBuilder sb = new StringBuilder("OfflineChapterEntity(offlineReadId=");
        sb.append(j4);
        sb.append(", readId=");
        sb.append(str);
        sb.append(", chapterIndex=");
        sb.append(i10);
        sb.append(", fileNumber=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(status);
        sb.append(", progress=");
        sb.append(i11);
        defpackage.f.x(sb, ", cachedManifestUrl=", str3, ", drmKeySetId=", str4);
        com.google.android.gms.internal.play_billing.b.w(sb, ", createdAtUnix=", j10, ", expiresAtUnix=");
        return defpackage.f.h(j11, Separators.RPAREN, sb);
    }

    public OfflineChapterEntity(long j4, String str, int i10, String str2, Status status, int i11, String str3, String str4, long j10, long j11) {
        str.getClass();
        status.getClass();
        this.offlineReadId = j4;
        this.readId = str;
        this.chapterIndex = i10;
        this.fileNumber = str2;
        this.status = status;
        this.progress = i11;
        this.cachedManifestUrl = str3;
        this.drmKeySetId = str4;
        this.createdAtUnix = j10;
        this.expiresAtUnix = j11;
    }
}
