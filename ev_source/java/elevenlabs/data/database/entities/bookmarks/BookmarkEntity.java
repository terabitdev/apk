package io.elevenlabs.data.database.entities.bookmarks;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001>B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010'J\u009a\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00108J\u0014\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010=\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'¨\u0006?"}, d2 = {"Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", "", "id", "", "read_id", "start_offset_inclusive", "", "end_offset_exclusive", ParameterNames.TEXT, "created_at_unix", "updated_at_unix", "note", "sync_state", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;", "created_id", "chapter_index", "", "start_time_seconds", "", "end_time_seconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJLjava/lang/String;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getId", "()Ljava/lang/String;", "getRead_id", "getStart_offset_inclusive", "()J", "getEnd_offset_exclusive", "getText", "getCreated_at_unix", "getUpdated_at_unix", "getNote", "getSync_state", "()Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;", "getCreated_id", "getChapter_index", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStart_time_seconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEnd_time_seconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJLjava/lang/String;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", "equals", "", "other", "hashCode", "toString", "SyncState", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class BookmarkEntity {
    private final Integer chapter_index;
    private final long created_at_unix;
    private final String created_id;
    private final long end_offset_exclusive;
    private final Double end_time_seconds;
    private final String id;
    private final String note;
    private final String read_id;
    private final long start_offset_inclusive;
    private final Double start_time_seconds;
    private final SyncState sync_state;
    private final String text;
    private final long updated_at_unix;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;", "", "<init>", "(Ljava/lang/String;I)V", "UPDATED", "PENDING_DELETE", "PENDING_UPDATE_PUSH", "PENDING_CREATE", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class SyncState {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ SyncState[] $VALUES;
        public static final SyncState UPDATED = new SyncState("UPDATED", 0);
        public static final SyncState PENDING_DELETE = new SyncState("PENDING_DELETE", 1);
        public static final SyncState PENDING_UPDATE_PUSH = new SyncState("PENDING_UPDATE_PUSH", 2);
        public static final SyncState PENDING_CREATE = new SyncState("PENDING_CREATE", 3);

        private static final /* synthetic */ SyncState[] $values() {
            return new SyncState[]{UPDATED, PENDING_DELETE, PENDING_UPDATE_PUSH, PENDING_CREATE};
        }

        static {
            SyncState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private SyncState(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static SyncState valueOf(String str) {
            return (SyncState) Enum.valueOf(SyncState.class, str);
        }

        public static SyncState[] values() {
            return (SyncState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BookmarkEntity(String str, String str2, long j4, long j10, String str3, long j11, long j12, String str4, SyncState syncState, String str5, Integer num, Double d10, Double d11, int i10, f fVar) {
        this(str, str2, j4, j10, str3, j11, j12, r15, syncState, r17, r18, r19, r20);
        String str6;
        String str7;
        Integer num2;
        Double d12;
        Double d13;
        if ((i10 & 128) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i10 & 512) != 0) {
            str7 = null;
        } else {
            str7 = str5;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i10 & 2048) != 0) {
            d12 = null;
        } else {
            d12 = d10;
        }
        if ((i10 & 4096) != 0) {
            d13 = null;
        } else {
            d13 = d11;
        }
    }

    public static /* synthetic */ BookmarkEntity copy$default(BookmarkEntity bookmarkEntity, String str, String str2, long j4, long j10, String str3, long j11, long j12, String str4, SyncState syncState, String str5, Integer num, Double d10, Double d11, int i10, Object obj) {
        String str6;
        String str7;
        long j13;
        long j14;
        String str8;
        long j15;
        long j16;
        String str9;
        SyncState syncState2;
        String str10;
        Integer num2;
        Double d12;
        Double d13;
        if ((i10 & 1) != 0) {
            str6 = bookmarkEntity.id;
        } else {
            str6 = str;
        }
        if ((i10 & 2) != 0) {
            str7 = bookmarkEntity.read_id;
        } else {
            str7 = str2;
        }
        if ((i10 & 4) != 0) {
            j13 = bookmarkEntity.start_offset_inclusive;
        } else {
            j13 = j4;
        }
        if ((i10 & 8) != 0) {
            j14 = bookmarkEntity.end_offset_exclusive;
        } else {
            j14 = j10;
        }
        if ((i10 & 16) != 0) {
            str8 = bookmarkEntity.text;
        } else {
            str8 = str3;
        }
        if ((i10 & 32) != 0) {
            j15 = bookmarkEntity.created_at_unix;
        } else {
            j15 = j11;
        }
        if ((i10 & 64) != 0) {
            j16 = bookmarkEntity.updated_at_unix;
        } else {
            j16 = j12;
        }
        if ((i10 & 128) != 0) {
            str9 = bookmarkEntity.note;
        } else {
            str9 = str4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            syncState2 = bookmarkEntity.sync_state;
        } else {
            syncState2 = syncState;
        }
        if ((i10 & 512) != 0) {
            str10 = bookmarkEntity.created_id;
        } else {
            str10 = str5;
        }
        String str11 = str6;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            num2 = bookmarkEntity.chapter_index;
        } else {
            num2 = num;
        }
        Integer num3 = num2;
        if ((i10 & 2048) != 0) {
            d12 = bookmarkEntity.start_time_seconds;
        } else {
            d12 = d10;
        }
        if ((i10 & 4096) != 0) {
            d13 = bookmarkEntity.end_time_seconds;
        } else {
            d13 = d11;
        }
        return bookmarkEntity.copy(str11, str7, j13, j14, str8, j15, j16, str9, syncState2, str10, num3, d12, d13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCreated_id() {
        return this.created_id;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getChapter_index() {
        return this.chapter_index;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getStart_time_seconds() {
        return this.start_time_seconds;
    }

    /* renamed from: component13, reason: from getter */
    public final Double getEnd_time_seconds() {
        return this.end_time_seconds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRead_id() {
        return this.read_id;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStart_offset_inclusive() {
        return this.start_offset_inclusive;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEnd_offset_exclusive() {
        return this.end_offset_exclusive;
    }

    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreated_at_unix() {
        return this.created_at_unix;
    }

    /* renamed from: component7, reason: from getter */
    public final long getUpdated_at_unix() {
        return this.updated_at_unix;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component9, reason: from getter */
    public final SyncState getSync_state() {
        return this.sync_state;
    }

    public final BookmarkEntity copy(String id2, String read_id, long start_offset_inclusive, long end_offset_exclusive, String text, long created_at_unix, long updated_at_unix, String note, SyncState sync_state, String created_id, Integer chapter_index, Double start_time_seconds, Double end_time_seconds) {
        id2.getClass();
        read_id.getClass();
        text.getClass();
        sync_state.getClass();
        return new BookmarkEntity(id2, read_id, start_offset_inclusive, end_offset_exclusive, text, created_at_unix, updated_at_unix, note, sync_state, created_id, chapter_index, start_time_seconds, end_time_seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookmarkEntity)) {
            return false;
        }
        BookmarkEntity bookmarkEntity = (BookmarkEntity) other;
        if (m.c(this.id, bookmarkEntity.id) && m.c(this.read_id, bookmarkEntity.read_id) && this.start_offset_inclusive == bookmarkEntity.start_offset_inclusive && this.end_offset_exclusive == bookmarkEntity.end_offset_exclusive && m.c(this.text, bookmarkEntity.text) && this.created_at_unix == bookmarkEntity.created_at_unix && this.updated_at_unix == bookmarkEntity.updated_at_unix && m.c(this.note, bookmarkEntity.note) && this.sync_state == bookmarkEntity.sync_state && m.c(this.created_id, bookmarkEntity.created_id) && m.c(this.chapter_index, bookmarkEntity.chapter_index) && m.c(this.start_time_seconds, bookmarkEntity.start_time_seconds) && m.c(this.end_time_seconds, bookmarkEntity.end_time_seconds)) {
            return true;
        }
        return false;
    }

    public final Integer getChapter_index() {
        return this.chapter_index;
    }

    public final long getCreated_at_unix() {
        return this.created_at_unix;
    }

    public final String getCreated_id() {
        return this.created_id;
    }

    public final long getEnd_offset_exclusive() {
        return this.end_offset_exclusive;
    }

    public final Double getEnd_time_seconds() {
        return this.end_time_seconds;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getRead_id() {
        return this.read_id;
    }

    public final long getStart_offset_inclusive() {
        return this.start_offset_inclusive;
    }

    public final Double getStart_time_seconds() {
        return this.start_time_seconds;
    }

    public final SyncState getSync_state() {
        return this.sync_state;
    }

    public final String getText() {
        return this.text;
    }

    public final long getUpdated_at_unix() {
        return this.updated_at_unix;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.updated_at_unix, com.google.android.gms.internal.play_billing.b.g(this.created_at_unix, c.c(com.google.android.gms.internal.play_billing.b.g(this.end_offset_exclusive, com.google.android.gms.internal.play_billing.b.g(this.start_offset_inclusive, c.c(this.id.hashCode() * 31, 31, this.read_id), 31), 31), 31, this.text), 31), 31);
        String str = this.note;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.sync_state.hashCode() + ((g10 + hashCode) * 31)) * 31;
        String str2 = this.created_id;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (hashCode5 + hashCode2) * 31;
        Integer num = this.chapter_index;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Double d10 = this.start_time_seconds;
        if (d10 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d10.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Double d11 = this.end_time_seconds;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.read_id;
        long j4 = this.start_offset_inclusive;
        long j10 = this.end_offset_exclusive;
        String str3 = this.text;
        long j11 = this.created_at_unix;
        long j12 = this.updated_at_unix;
        String str4 = this.note;
        SyncState syncState = this.sync_state;
        String str5 = this.created_id;
        Integer num = this.chapter_index;
        Double d10 = this.start_time_seconds;
        Double d11 = this.end_time_seconds;
        StringBuilder s10 = defpackage.f.s("BookmarkEntity(id=", str, ", read_id=", str2, ", start_offset_inclusive=");
        s10.append(j4);
        com.google.android.gms.internal.play_billing.b.w(s10, ", end_offset_exclusive=", j10, ", text=");
        s10.append(str3);
        s10.append(", created_at_unix=");
        s10.append(j11);
        com.google.android.gms.internal.play_billing.b.w(s10, ", updated_at_unix=", j12, ", note=");
        s10.append(str4);
        s10.append(", sync_state=");
        s10.append(syncState);
        s10.append(", created_id=");
        s10.append(str5);
        s10.append(", chapter_index=");
        s10.append(num);
        s10.append(", start_time_seconds=");
        s10.append(d10);
        s10.append(", end_time_seconds=");
        s10.append(d11);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public BookmarkEntity(String str, String str2, long j4, long j10, String str3, long j11, long j12, String str4, SyncState syncState, String str5, Integer num, Double d10, Double d11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        syncState.getClass();
        this.id = str;
        this.read_id = str2;
        this.start_offset_inclusive = j4;
        this.end_offset_exclusive = j10;
        this.text = str3;
        this.created_at_unix = j11;
        this.updated_at_unix = j12;
        this.note = str4;
        this.sync_state = syncState;
        this.created_id = str5;
        this.chapter_index = num;
        this.start_time_seconds = d10;
        this.end_time_seconds = d11;
    }
}
