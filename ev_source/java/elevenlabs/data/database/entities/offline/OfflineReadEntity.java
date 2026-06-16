package io.elevenlabs.data.database.entities.offline;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u000256Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J{\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00103\u001a\u00020\u000fHÖ\u0081\u0004J\n\u00104\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u00067"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "", "id", "", "readId", "", "voiceId", "type", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;", "totalCharCount", "createdAtUnix", "updatedAtUnix", "status", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "progress", "", "cachedManifestUrls", "drmKeySetIds", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;JJJLio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getType", "()Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;", "getTotalCharCount", "getCreatedAtUnix", "getUpdatedAtUnix", "getStatus", "()Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "getProgress", "()I", "getCachedManifestUrls", "getDrmKeySetIds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "Type", "Status", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OfflineReadEntity {
    private final String cachedManifestUrls;
    private final long createdAtUnix;
    private final String drmKeySetIds;
    private final long id;
    private final int progress;
    private final String readId;
    private final Status status;
    private final long totalCharCount;
    private final Type type;
    private final long updatedAtUnix;
    private final String voiceId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "", "<init>", "(Ljava/lang/String;I)V", "DOWNLOADING_HTML", "CONVERTING", "DOWNLOADING_CHUNKS", "DOWNLOADING_MEDIA", "READY", "ERROR", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Status {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status DOWNLOADING_HTML = new Status("DOWNLOADING_HTML", 0);
        public static final Status CONVERTING = new Status("CONVERTING", 1);
        public static final Status DOWNLOADING_CHUNKS = new Status("DOWNLOADING_CHUNKS", 2);
        public static final Status DOWNLOADING_MEDIA = new Status("DOWNLOADING_MEDIA", 3);
        public static final Status READY = new Status("READY", 4);
        public static final Status ERROR = new Status("ERROR", 5);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{DOWNLOADING_HTML, CONVERTING, DOWNLOADING_CHUNKS, DOWNLOADING_MEDIA, READY, ERROR};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TTS", "MEDIA", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Type {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final String value;
        public static final Type TTS = new Type("TTS", 0, "tts");
        public static final Type MEDIA = new Type("MEDIA", 1, "media");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TTS, MEDIA};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private Type(String str, int i10, String str2) {
            this.value = str2;
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OfflineReadEntity(long j4, String str, String str2, Type type, long j10, long j11, long j12, Status status, int i10, String str3, String str4, int i11, kotlin.jvm.internal.f fVar) {
        this(r4, str, str2, r8, j10, j11, j12, status, i10, r17, r18);
        long j13;
        Type type2;
        String str5;
        String str6;
        if ((i11 & 1) != 0) {
            j13 = 0;
        } else {
            j13 = j4;
        }
        if ((i11 & 8) != 0) {
            type2 = Type.TTS;
        } else {
            type2 = type;
        }
        if ((i11 & 512) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
    }

    public static /* synthetic */ OfflineReadEntity copy$default(OfflineReadEntity offlineReadEntity, long j4, String str, String str2, Type type, long j10, long j11, long j12, Status status, int i10, String str3, String str4, int i11, Object obj) {
        long j13;
        String str5;
        String str6;
        Type type2;
        long j14;
        long j15;
        long j16;
        Status status2;
        int i12;
        String str7;
        String str8;
        if ((i11 & 1) != 0) {
            j13 = offlineReadEntity.id;
        } else {
            j13 = j4;
        }
        if ((i11 & 2) != 0) {
            str5 = offlineReadEntity.readId;
        } else {
            str5 = str;
        }
        if ((i11 & 4) != 0) {
            str6 = offlineReadEntity.voiceId;
        } else {
            str6 = str2;
        }
        if ((i11 & 8) != 0) {
            type2 = offlineReadEntity.type;
        } else {
            type2 = type;
        }
        if ((i11 & 16) != 0) {
            j14 = offlineReadEntity.totalCharCount;
        } else {
            j14 = j10;
        }
        if ((i11 & 32) != 0) {
            j15 = offlineReadEntity.createdAtUnix;
        } else {
            j15 = j11;
        }
        if ((i11 & 64) != 0) {
            j16 = offlineReadEntity.updatedAtUnix;
        } else {
            j16 = j12;
        }
        if ((i11 & 128) != 0) {
            status2 = offlineReadEntity.status;
        } else {
            status2 = status;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            i12 = offlineReadEntity.progress;
        } else {
            i12 = i10;
        }
        if ((i11 & 512) != 0) {
            str7 = offlineReadEntity.cachedManifestUrls;
        } else {
            str7 = str3;
        }
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str8 = offlineReadEntity.drmKeySetIds;
        } else {
            str8 = str4;
        }
        return offlineReadEntity.copy(j13, str5, str6, type2, j14, j15, j16, status2, i12, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCachedManifestUrls() {
        return this.cachedManifestUrls;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDrmKeySetIds() {
        return this.drmKeySetIds;
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
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTotalCharCount() {
        return this.totalCharCount;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component7, reason: from getter */
    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    /* renamed from: component8, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component9, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final OfflineReadEntity copy(long id2, String readId, String voiceId, Type type, long totalCharCount, long createdAtUnix, long updatedAtUnix, Status status, int progress, String cachedManifestUrls, String drmKeySetIds) {
        readId.getClass();
        voiceId.getClass();
        type.getClass();
        status.getClass();
        return new OfflineReadEntity(id2, readId, voiceId, type, totalCharCount, createdAtUnix, updatedAtUnix, status, progress, cachedManifestUrls, drmKeySetIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineReadEntity)) {
            return false;
        }
        OfflineReadEntity offlineReadEntity = (OfflineReadEntity) other;
        if (this.id == offlineReadEntity.id && m.c(this.readId, offlineReadEntity.readId) && m.c(this.voiceId, offlineReadEntity.voiceId) && this.type == offlineReadEntity.type && this.totalCharCount == offlineReadEntity.totalCharCount && this.createdAtUnix == offlineReadEntity.createdAtUnix && this.updatedAtUnix == offlineReadEntity.updatedAtUnix && this.status == offlineReadEntity.status && this.progress == offlineReadEntity.progress && m.c(this.cachedManifestUrls, offlineReadEntity.cachedManifestUrls) && m.c(this.drmKeySetIds, offlineReadEntity.drmKeySetIds)) {
            return true;
        }
        return false;
    }

    public final String getCachedManifestUrls() {
        return this.cachedManifestUrls;
    }

    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final String getDrmKeySetIds() {
        return this.drmKeySetIds;
    }

    public final long getId() {
        return this.id;
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

    public final long getTotalCharCount() {
        return this.totalCharCount;
    }

    public final Type getType() {
        return this.type;
    }

    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int b10 = j0.c.b(this.progress, (this.status.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.updatedAtUnix, com.google.android.gms.internal.play_billing.b.g(this.createdAtUnix, com.google.android.gms.internal.play_billing.b.g(this.totalCharCount, (this.type.hashCode() + j0.c.c(j0.c.c(Long.hashCode(this.id) * 31, 31, this.readId), 31, this.voiceId)) * 31, 31), 31), 31)) * 31, 31);
        String str = this.cachedManifestUrls;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (b10 + hashCode) * 31;
        String str2 = this.drmKeySetIds;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        long j4 = this.id;
        String str = this.readId;
        String str2 = this.voiceId;
        Type type = this.type;
        long j10 = this.totalCharCount;
        long j11 = this.createdAtUnix;
        long j12 = this.updatedAtUnix;
        Status status = this.status;
        int i10 = this.progress;
        String str3 = this.cachedManifestUrls;
        String str4 = this.drmKeySetIds;
        StringBuilder sb = new StringBuilder("OfflineReadEntity(id=");
        sb.append(j4);
        sb.append(", readId=");
        sb.append(str);
        sb.append(", voiceId=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(type);
        com.google.android.gms.internal.play_billing.b.w(sb, ", totalCharCount=", j10, ", createdAtUnix=");
        sb.append(j11);
        com.google.android.gms.internal.play_billing.b.w(sb, ", updatedAtUnix=", j12, ", status=");
        sb.append(status);
        sb.append(", progress=");
        sb.append(i10);
        sb.append(", cachedManifestUrls=");
        return defpackage.f.n(sb, str3, ", drmKeySetIds=", str4, Separators.RPAREN);
    }

    public OfflineReadEntity(long j4, String str, String str2, Type type, long j10, long j11, long j12, Status status, int i10, String str3, String str4) {
        str.getClass();
        str2.getClass();
        type.getClass();
        status.getClass();
        this.id = j4;
        this.readId = str;
        this.voiceId = str2;
        this.type = type;
        this.totalCharCount = j10;
        this.createdAtUnix = j11;
        this.updatedAtUnix = j12;
        this.status = status;
        this.progress = i10;
        this.cachedManifestUrls = str3;
        this.drmKeySetIds = str4;
    }
}
