package io.elevenlabs.data.database.entities.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import sn.z;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;
import ur.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u00002\u00020\u0001:\nUVWXYZ[\\]^J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00112\u0006\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u0018H'¢\u0006\u0004\b\u0013\u0010\"J#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00112\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010'\u001a\u00020\u001dH§@¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H'¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010'\u001a\u00020\u001dH'¢\u0006\u0004\b,\u0010-J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010.\u001a\u00020\u001dH§@¢\u0006\u0004\b/\u0010)J\u0018\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0002H§@¢\u0006\u0004\b1\u0010\u0006J\u001e\u00102\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b2\u0010\u000bJ\"\u00106\u001a\u0004\u0018\u0001052\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0015H§@¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b8\u0010\u0010J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209H'¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=H'¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010:\u001a\u00020@H'¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010:\u001a\u00020CH'¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010:\u001a\u00020FH'¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010:\u001a\u00020IH'¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010:\u001a\u00020LH'¢\u0006\u0004\bM\u0010NJ\u0018\u0010P\u001a\u00020\u00042\u0006\u0010:\u001a\u00020OH§@¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010:\u001a\u00020RH'¢\u0006\u0004\bS\u0010T¨\u0006_À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "read", "Lsn/z;", "insertRead", "(Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;Lwn/c;)Ljava/lang/Object;", "", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "chapters", "insertChapters", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "sampleConfig", "", "insertSampleConfig", "(Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;Lwn/c;)Ljava/lang/Object;", "Lir/i;", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "getAll", "()Lir/i;", "", "getCount", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "syncState", "getAllWithSyncState", "(Lio/elevenlabs/data/database/entities/reads/SyncState;)Ljava/util/List;", "limit", "", "orderBy", "", "archived", "deletedSyncState", "(ILjava/lang/String;Ljava/lang/Boolean;Lio/elevenlabs/data/database/entities/reads/SyncState;)Lir/i;", "Lnb/f;", "query", FirebaseAnalytics.Event.SEARCH, "(Lnb/f;)Lir/i;", "id", "getById", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getAllById", "(Ljava/util/List;)Ljava/util/List;", "observeById", "(Ljava/lang/String;)Lir/i;", "parentId", "getSampleReadsByParentId", "readMeta", "deleteRead", "deleteChapters", "readId", "chapterIndex", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ChapterCharRange;", "getChapterCharRange", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "deleteSampleConfig", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateLastCharOffset", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;", "updateAudioPosition", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;", "updateTitle", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;", "updateMarkedAsUnread", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;", "updateCompletedAtUnix", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;", "updateLastVoiceId", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;", "updateRating", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;", "updateStatus", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;", "updateArchivedStatus", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;)V", "ChapterCharRange", "ReadMetaLastCharOffsetUpdate", "ReadMetaAudioPositionUpdate", "ReadMetaTitleUpdate", "ReadMetaMarkedAsUnreadUpdate", "ReadMetaCompletedAtUnixUpdate", "ReadMetaLastVoiceIdUpdate", "ReadMetaRatingUpdate", "ReadMetaSyncStatusUpdate", "ReadMetaArchiveUpdate", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadsDao {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ChapterCharRange;", "", "startingCharOffset", "", "charCount", "<init>", "(JJ)V", "getStartingCharOffset", "()J", "getCharCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ChapterCharRange {
        private final long charCount;
        private final long startingCharOffset;

        public ChapterCharRange(long j4, long j10) {
            this.startingCharOffset = j4;
            this.charCount = j10;
        }

        public static /* synthetic */ ChapterCharRange copy$default(ChapterCharRange chapterCharRange, long j4, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = chapterCharRange.startingCharOffset;
            }
            if ((i10 & 2) != 0) {
                j10 = chapterCharRange.charCount;
            }
            return chapterCharRange.copy(j4, j10);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStartingCharOffset() {
            return this.startingCharOffset;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCharCount() {
            return this.charCount;
        }

        public final ChapterCharRange copy(long startingCharOffset, long charCount) {
            return new ChapterCharRange(startingCharOffset, charCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChapterCharRange)) {
                return false;
            }
            ChapterCharRange chapterCharRange = (ChapterCharRange) other;
            if (this.startingCharOffset == chapterCharRange.startingCharOffset && this.charCount == chapterCharRange.charCount) {
                return true;
            }
            return false;
        }

        public final long getCharCount() {
            return this.charCount;
        }

        public final long getStartingCharOffset() {
            return this.startingCharOffset;
        }

        public int hashCode() {
            return Long.hashCode(this.charCount) + (Long.hashCode(this.startingCharOffset) * 31);
        }

        public String toString() {
            return defpackage.f.h(this.charCount, Separators.RPAREN, com.google.android.gms.internal.play_billing.b.q("ChapterCharRange(startingCharOffset=", this.startingCharOffset, ", charCount="));
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ ir.i getAll$default(ReadsDao readsDao, int i10, String str, Boolean bool, SyncState syncState, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str = "updated_at_unix";
            }
            if ((i11 & 8) != 0) {
                syncState = SyncState.PENDING_DELETE;
            }
            return readsDao.getAll(i10, str, bool, syncState);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getAll");
        return null;
    }

    Object deleteChapters(List<ReadChapterEntity> list, wn.c<? super z> cVar);

    Object deleteRead(ReadMetaEntity readMetaEntity, wn.c<? super z> cVar);

    Object deleteSampleConfig(SampleConfigEntity sampleConfigEntity, wn.c<? super z> cVar);

    ir.i getAll();

    ir.i getAll(int limit, String orderBy, Boolean archived, SyncState deletedSyncState);

    List<ReadMetaEntityWithChapters> getAllById(List<String> id2);

    List<ReadMetaEntityWithChapters> getAllWithSyncState(SyncState syncState);

    Object getById(String str, wn.c<? super ReadMetaEntityWithChapters> cVar);

    Object getChapterCharRange(String str, int i10, wn.c<? super ChapterCharRange> cVar);

    Object getCount(wn.c<? super Integer> cVar);

    Object getSampleReadsByParentId(String str, wn.c<? super List<ReadMetaEntityWithChapters>> cVar);

    Object insertChapters(List<ReadChapterEntity> list, wn.c<? super z> cVar);

    Object insertRead(ReadMetaEntity readMetaEntity, wn.c<? super z> cVar);

    Object insertSampleConfig(SampleConfigEntity sampleConfigEntity, wn.c<? super Long> cVar);

    ir.i observeById(String id2);

    ir.i search(nb.f fVar);

    void updateArchivedStatus(ReadMetaArchiveUpdate r12);

    void updateAudioPosition(ReadMetaAudioPositionUpdate r12);

    void updateCompletedAtUnix(ReadMetaCompletedAtUnixUpdate r12);

    void updateLastCharOffset(ReadMetaLastCharOffsetUpdate r12);

    void updateLastVoiceId(ReadMetaLastVoiceIdUpdate r12);

    void updateMarkedAsUnread(ReadMetaMarkedAsUnreadUpdate r12);

    void updateRating(ReadMetaRatingUpdate r12);

    Object updateStatus(ReadMetaSyncStatusUpdate readMetaSyncStatusUpdate, wn.c<? super z> cVar);

    void updateTitle(ReadMetaTitleUpdate r12);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b\u0005\u0010\u0019¨\u0006'"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;", "", "", "read_id", "", "is_archived", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "Z", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaArchiveUpdate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_archived;
        private final String read_id;

        public /* synthetic */ ReadMetaArchiveUpdate(int i10, String str, boolean z6, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.read_id = str;
                this.is_archived = z6;
            } else {
                t0.j(i10, 3, ReadsDao$ReadMetaArchiveUpdate$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ReadMetaArchiveUpdate copy$default(ReadMetaArchiveUpdate readMetaArchiveUpdate, String str, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaArchiveUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                z6 = readMetaArchiveUpdate.is_archived;
            }
            return readMetaArchiveUpdate.copy(str, z6);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaArchiveUpdate self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.read_id);
            output.T(serialDesc, 1, self.is_archived);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIs_archived() {
            return this.is_archived;
        }

        public final ReadMetaArchiveUpdate copy(String read_id, boolean is_archived) {
            read_id.getClass();
            return new ReadMetaArchiveUpdate(read_id, is_archived);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaArchiveUpdate)) {
                return false;
            }
            ReadMetaArchiveUpdate readMetaArchiveUpdate = (ReadMetaArchiveUpdate) other;
            if (m.c(this.read_id, readMetaArchiveUpdate.read_id) && this.is_archived == readMetaArchiveUpdate.is_archived) {
                return true;
            }
            return false;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public int hashCode() {
            return Boolean.hashCode(this.is_archived) + (this.read_id.hashCode() * 31);
        }

        public final boolean is_archived() {
            return this.is_archived;
        }

        public String toString() {
            return "ReadMetaArchiveUpdate(read_id=" + this.read_id + ", is_archived=" + this.is_archived + Separators.RPAREN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaArchiveUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaArchiveUpdate(String str, boolean z6) {
            str.getClass();
            this.read_id = str;
            this.is_archived = z6;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;", "", "", "read_id", "last_listened_audio_file_number", "", "last_listened_audio_seconds", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "sync_state", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLio/elevenlabs/data/database/entities/reads/SyncState;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLio/elevenlabs/data/database/entities/reads/SyncState;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()Lio/elevenlabs/data/database/entities/reads/SyncState;", "copy", "(Ljava/lang/String;Ljava/lang/String;DLio/elevenlabs/data/database/entities/reads/SyncState;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "getLast_listened_audio_file_number", "D", "getLast_listened_audio_seconds", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "getSync_state", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaAudioPositionUpdate {
        private final String last_listened_audio_file_number;
        private final double last_listened_audio_seconds;
        private final String read_id;
        private final SyncState sync_state;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final sn.h[] $childSerializers = {null, null, null, sn.a.d(sn.i.f31597b, new a(0))};

        public /* synthetic */ ReadMetaAudioPositionUpdate(int i10, String str, String str2, double d10, SyncState syncState, c1 c1Var) {
            if (7 == (i10 & 7)) {
                this.read_id = str;
                this.last_listened_audio_file_number = str2;
                this.last_listened_audio_seconds = d10;
                if ((i10 & 8) == 0) {
                    this.sync_state = SyncState.PENDING_UPDATE_PUSH;
                    return;
                } else {
                    this.sync_state = syncState;
                    return;
                }
            }
            t0.j(i10, 7, ReadsDao$ReadMetaAudioPositionUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static final KSerializer _childSerializers$_anonymous_() {
            SyncState[] values = SyncState.values();
            values.getClass();
            return new w("io.elevenlabs.data.database.entities.reads.SyncState", (Enum[]) values);
        }

        public static /* synthetic */ ReadMetaAudioPositionUpdate copy$default(ReadMetaAudioPositionUpdate readMetaAudioPositionUpdate, String str, String str2, double d10, SyncState syncState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaAudioPositionUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                str2 = readMetaAudioPositionUpdate.last_listened_audio_file_number;
            }
            if ((i10 & 4) != 0) {
                d10 = readMetaAudioPositionUpdate.last_listened_audio_seconds;
            }
            if ((i10 & 8) != 0) {
                syncState = readMetaAudioPositionUpdate.sync_state;
            }
            SyncState syncState2 = syncState;
            return readMetaAudioPositionUpdate.copy(str, str2, d10, syncState2);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaAudioPositionUpdate self, tr.b output, SerialDescriptor serialDesc) {
            sn.h[] hVarArr = $childSerializers;
            output.V(serialDesc, 0, self.read_id);
            output.V(serialDesc, 1, self.last_listened_audio_file_number);
            output.e0(serialDesc, 2, self.last_listened_audio_seconds);
            if (output.C(serialDesc) || self.sync_state != SyncState.PENDING_UPDATE_PUSH) {
                output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.sync_state);
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast_listened_audio_file_number() {
            return this.last_listened_audio_file_number;
        }

        /* renamed from: component3, reason: from getter */
        public final double getLast_listened_audio_seconds() {
            return this.last_listened_audio_seconds;
        }

        /* renamed from: component4, reason: from getter */
        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public final ReadMetaAudioPositionUpdate copy(String read_id, String last_listened_audio_file_number, double last_listened_audio_seconds, SyncState sync_state) {
            read_id.getClass();
            last_listened_audio_file_number.getClass();
            sync_state.getClass();
            return new ReadMetaAudioPositionUpdate(read_id, last_listened_audio_file_number, last_listened_audio_seconds, sync_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaAudioPositionUpdate)) {
                return false;
            }
            ReadMetaAudioPositionUpdate readMetaAudioPositionUpdate = (ReadMetaAudioPositionUpdate) other;
            if (m.c(this.read_id, readMetaAudioPositionUpdate.read_id) && m.c(this.last_listened_audio_file_number, readMetaAudioPositionUpdate.last_listened_audio_file_number) && Double.compare(this.last_listened_audio_seconds, readMetaAudioPositionUpdate.last_listened_audio_seconds) == 0 && this.sync_state == readMetaAudioPositionUpdate.sync_state) {
                return true;
            }
            return false;
        }

        public final String getLast_listened_audio_file_number() {
            return this.last_listened_audio_file_number;
        }

        public final double getLast_listened_audio_seconds() {
            return this.last_listened_audio_seconds;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public int hashCode() {
            return this.sync_state.hashCode() + n.c(j0.c.c(this.read_id.hashCode() * 31, 31, this.last_listened_audio_file_number), 31, this.last_listened_audio_seconds);
        }

        public String toString() {
            String str = this.read_id;
            String str2 = this.last_listened_audio_file_number;
            double d10 = this.last_listened_audio_seconds;
            SyncState syncState = this.sync_state;
            StringBuilder s10 = defpackage.f.s("ReadMetaAudioPositionUpdate(read_id=", str, ", last_listened_audio_file_number=", str2, ", last_listened_audio_seconds=");
            s10.append(d10);
            s10.append(", sync_state=");
            s10.append(syncState);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaAudioPositionUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaAudioPositionUpdate(String str, String str2, double d10, SyncState syncState) {
            str.getClass();
            str2.getClass();
            syncState.getClass();
            this.read_id = str;
            this.last_listened_audio_file_number = str2;
            this.last_listened_audio_seconds = d10;
            this.sync_state = syncState;
        }

        public /* synthetic */ ReadMetaAudioPositionUpdate(String str, String str2, double d10, SyncState syncState, int i10, kotlin.jvm.internal.f fVar) {
            this(str, str2, d10, (i10 & 8) != 0 ? SyncState.PENDING_UPDATE_PUSH : syncState);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;", "", "", "read_id", "", "completed_at_unix", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "sync_state", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lio/elevenlabs/data/database/entities/reads/SyncState;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lio/elevenlabs/data/database/entities/reads/SyncState;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "()Lio/elevenlabs/data/database/entities/reads/SyncState;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lio/elevenlabs/data/database/entities/reads/SyncState;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "Ljava/lang/Long;", "getCompleted_at_unix", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "getSync_state", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaCompletedAtUnixUpdate {
        private final Long completed_at_unix;
        private final String read_id;
        private final SyncState sync_state;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final sn.h[] $childSerializers = {null, null, sn.a.d(sn.i.f31597b, new a(1))};

        public /* synthetic */ ReadMetaCompletedAtUnixUpdate(int i10, String str, Long l4, SyncState syncState, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.read_id = str;
                this.completed_at_unix = l4;
                if ((i10 & 4) == 0) {
                    this.sync_state = SyncState.PENDING_UPDATE_PUSH;
                    return;
                } else {
                    this.sync_state = syncState;
                    return;
                }
            }
            t0.j(i10, 3, ReadsDao$ReadMetaCompletedAtUnixUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static final KSerializer _childSerializers$_anonymous_() {
            SyncState[] values = SyncState.values();
            values.getClass();
            return new w("io.elevenlabs.data.database.entities.reads.SyncState", (Enum[]) values);
        }

        public static /* synthetic */ ReadMetaCompletedAtUnixUpdate copy$default(ReadMetaCompletedAtUnixUpdate readMetaCompletedAtUnixUpdate, String str, Long l4, SyncState syncState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaCompletedAtUnixUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                l4 = readMetaCompletedAtUnixUpdate.completed_at_unix;
            }
            if ((i10 & 4) != 0) {
                syncState = readMetaCompletedAtUnixUpdate.sync_state;
            }
            return readMetaCompletedAtUnixUpdate.copy(str, l4, syncState);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaCompletedAtUnixUpdate self, tr.b output, SerialDescriptor serialDesc) {
            sn.h[] hVarArr = $childSerializers;
            output.V(serialDesc, 0, self.read_id);
            output.o(serialDesc, 1, l0.f34611a, self.completed_at_unix);
            if (output.C(serialDesc) || self.sync_state != SyncState.PENDING_UPDATE_PUSH) {
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.sync_state);
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getCompleted_at_unix() {
            return this.completed_at_unix;
        }

        /* renamed from: component3, reason: from getter */
        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public final ReadMetaCompletedAtUnixUpdate copy(String read_id, Long completed_at_unix, SyncState sync_state) {
            read_id.getClass();
            sync_state.getClass();
            return new ReadMetaCompletedAtUnixUpdate(read_id, completed_at_unix, sync_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaCompletedAtUnixUpdate)) {
                return false;
            }
            ReadMetaCompletedAtUnixUpdate readMetaCompletedAtUnixUpdate = (ReadMetaCompletedAtUnixUpdate) other;
            if (m.c(this.read_id, readMetaCompletedAtUnixUpdate.read_id) && m.c(this.completed_at_unix, readMetaCompletedAtUnixUpdate.completed_at_unix) && this.sync_state == readMetaCompletedAtUnixUpdate.sync_state) {
                return true;
            }
            return false;
        }

        public final Long getCompleted_at_unix() {
            return this.completed_at_unix;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.read_id.hashCode() * 31;
            Long l4 = this.completed_at_unix;
            if (l4 == null) {
                hashCode = 0;
            } else {
                hashCode = l4.hashCode();
            }
            return this.sync_state.hashCode() + ((hashCode2 + hashCode) * 31);
        }

        public String toString() {
            return "ReadMetaCompletedAtUnixUpdate(read_id=" + this.read_id + ", completed_at_unix=" + this.completed_at_unix + ", sync_state=" + this.sync_state + Separators.RPAREN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaCompletedAtUnixUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaCompletedAtUnixUpdate(String str, Long l4, SyncState syncState) {
            str.getClass();
            syncState.getClass();
            this.read_id = str;
            this.completed_at_unix = l4;
            this.sync_state = syncState;
        }

        public /* synthetic */ ReadMetaCompletedAtUnixUpdate(String str, Long l4, SyncState syncState, int i10, kotlin.jvm.internal.f fVar) {
            this(str, l4, (i10 & 4) != 0 ? SyncState.PENDING_UPDATE_PUSH : syncState);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;", "", "", "read_id", "", "last_listened_char_offset", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "sync_state", "<init>", "(Ljava/lang/String;JLio/elevenlabs/data/database/entities/reads/SyncState;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;JLio/elevenlabs/data/database/entities/reads/SyncState;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lio/elevenlabs/data/database/entities/reads/SyncState;", "copy", "(Ljava/lang/String;JLio/elevenlabs/data/database/entities/reads/SyncState;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "J", "getLast_listened_char_offset", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "getSync_state", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaLastCharOffsetUpdate {
        private final long last_listened_char_offset;
        private final String read_id;
        private final SyncState sync_state;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final sn.h[] $childSerializers = {null, null, sn.a.d(sn.i.f31597b, new a(2))};

        public /* synthetic */ ReadMetaLastCharOffsetUpdate(int i10, String str, long j4, SyncState syncState, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.read_id = str;
                this.last_listened_char_offset = j4;
                if ((i10 & 4) == 0) {
                    this.sync_state = SyncState.PENDING_UPDATE_PUSH;
                    return;
                } else {
                    this.sync_state = syncState;
                    return;
                }
            }
            t0.j(i10, 3, ReadsDao$ReadMetaLastCharOffsetUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static final KSerializer _childSerializers$_anonymous_() {
            SyncState[] values = SyncState.values();
            values.getClass();
            return new w("io.elevenlabs.data.database.entities.reads.SyncState", (Enum[]) values);
        }

        public static /* synthetic */ ReadMetaLastCharOffsetUpdate copy$default(ReadMetaLastCharOffsetUpdate readMetaLastCharOffsetUpdate, String str, long j4, SyncState syncState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaLastCharOffsetUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                j4 = readMetaLastCharOffsetUpdate.last_listened_char_offset;
            }
            if ((i10 & 4) != 0) {
                syncState = readMetaLastCharOffsetUpdate.sync_state;
            }
            return readMetaLastCharOffsetUpdate.copy(str, j4, syncState);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaLastCharOffsetUpdate self, tr.b output, SerialDescriptor serialDesc) {
            sn.h[] hVarArr = $childSerializers;
            output.V(serialDesc, 0, self.read_id);
            output.h0(serialDesc, 1, self.last_listened_char_offset);
            if (output.C(serialDesc) || self.sync_state != SyncState.PENDING_UPDATE_PUSH) {
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.sync_state);
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getLast_listened_char_offset() {
            return this.last_listened_char_offset;
        }

        /* renamed from: component3, reason: from getter */
        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public final ReadMetaLastCharOffsetUpdate copy(String read_id, long last_listened_char_offset, SyncState sync_state) {
            read_id.getClass();
            sync_state.getClass();
            return new ReadMetaLastCharOffsetUpdate(read_id, last_listened_char_offset, sync_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaLastCharOffsetUpdate)) {
                return false;
            }
            ReadMetaLastCharOffsetUpdate readMetaLastCharOffsetUpdate = (ReadMetaLastCharOffsetUpdate) other;
            if (m.c(this.read_id, readMetaLastCharOffsetUpdate.read_id) && this.last_listened_char_offset == readMetaLastCharOffsetUpdate.last_listened_char_offset && this.sync_state == readMetaLastCharOffsetUpdate.sync_state) {
                return true;
            }
            return false;
        }

        public final long getLast_listened_char_offset() {
            return this.last_listened_char_offset;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public int hashCode() {
            return this.sync_state.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.last_listened_char_offset, this.read_id.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.read_id;
            long j4 = this.last_listened_char_offset;
            SyncState syncState = this.sync_state;
            StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("ReadMetaLastCharOffsetUpdate(read_id=", str, j4, ", last_listened_char_offset=");
            r10.append(", sync_state=");
            r10.append(syncState);
            r10.append(Separators.RPAREN);
            return r10.toString();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaLastCharOffsetUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaLastCharOffsetUpdate(String str, long j4, SyncState syncState) {
            str.getClass();
            syncState.getClass();
            this.read_id = str;
            this.last_listened_char_offset = j4;
            this.sync_state = syncState;
        }

        public /* synthetic */ ReadMetaLastCharOffsetUpdate(String str, long j4, SyncState syncState, int i10, kotlin.jvm.internal.f fVar) {
            this(str, j4, (i10 & 4) != 0 ? SyncState.PENDING_UPDATE_PUSH : syncState);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;", "", "", "read_id", "last_used_voice_id", "last_used_audio_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "getLast_used_voice_id", "getLast_used_audio_type", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaLastVoiceIdUpdate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String last_used_audio_type;
        private final String last_used_voice_id;
        private final String read_id;

        public /* synthetic */ ReadMetaLastVoiceIdUpdate(int i10, String str, String str2, String str3, c1 c1Var) {
            if (7 == (i10 & 7)) {
                this.read_id = str;
                this.last_used_voice_id = str2;
                this.last_used_audio_type = str3;
                return;
            }
            t0.j(i10, 7, ReadsDao$ReadMetaLastVoiceIdUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static /* synthetic */ ReadMetaLastVoiceIdUpdate copy$default(ReadMetaLastVoiceIdUpdate readMetaLastVoiceIdUpdate, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaLastVoiceIdUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                str2 = readMetaLastVoiceIdUpdate.last_used_voice_id;
            }
            if ((i10 & 4) != 0) {
                str3 = readMetaLastVoiceIdUpdate.last_used_audio_type;
            }
            return readMetaLastVoiceIdUpdate.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaLastVoiceIdUpdate self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.read_id);
            output.V(serialDesc, 1, self.last_used_voice_id);
            output.o(serialDesc, 2, g1.f34588a, self.last_used_audio_type);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast_used_voice_id() {
            return this.last_used_voice_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLast_used_audio_type() {
            return this.last_used_audio_type;
        }

        public final ReadMetaLastVoiceIdUpdate copy(String read_id, String last_used_voice_id, String last_used_audio_type) {
            read_id.getClass();
            last_used_voice_id.getClass();
            return new ReadMetaLastVoiceIdUpdate(read_id, last_used_voice_id, last_used_audio_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaLastVoiceIdUpdate)) {
                return false;
            }
            ReadMetaLastVoiceIdUpdate readMetaLastVoiceIdUpdate = (ReadMetaLastVoiceIdUpdate) other;
            if (m.c(this.read_id, readMetaLastVoiceIdUpdate.read_id) && m.c(this.last_used_voice_id, readMetaLastVoiceIdUpdate.last_used_voice_id) && m.c(this.last_used_audio_type, readMetaLastVoiceIdUpdate.last_used_audio_type)) {
                return true;
            }
            return false;
        }

        public final String getLast_used_audio_type() {
            return this.last_used_audio_type;
        }

        public final String getLast_used_voice_id() {
            return this.last_used_voice_id;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public int hashCode() {
            int hashCode;
            int c5 = j0.c.c(this.read_id.hashCode() * 31, 31, this.last_used_voice_id);
            String str = this.last_used_audio_type;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return c5 + hashCode;
        }

        public String toString() {
            return defpackage.f.l(this.last_used_audio_type, Separators.RPAREN, defpackage.f.s("ReadMetaLastVoiceIdUpdate(read_id=", this.read_id, ", last_used_voice_id=", this.last_used_voice_id, ", last_used_audio_type="));
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaLastVoiceIdUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaLastVoiceIdUpdate(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.read_id = str;
            this.last_used_voice_id = str2;
            this.last_used_audio_type = str3;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006."}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;", "", "", "read_id", "", "marked_as_unread", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "sync_state", "<init>", "(Ljava/lang/String;ZLio/elevenlabs/data/database/entities/reads/SyncState;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLio/elevenlabs/data/database/entities/reads/SyncState;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lio/elevenlabs/data/database/entities/reads/SyncState;", "copy", "(Ljava/lang/String;ZLio/elevenlabs/data/database/entities/reads/SyncState;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "Z", "getMarked_as_unread", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "getSync_state", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaMarkedAsUnreadUpdate {
        private final boolean marked_as_unread;
        private final String read_id;
        private final SyncState sync_state;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final sn.h[] $childSerializers = {null, null, sn.a.d(sn.i.f31597b, new a(3))};

        public /* synthetic */ ReadMetaMarkedAsUnreadUpdate(int i10, String str, boolean z6, SyncState syncState, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.read_id = str;
                this.marked_as_unread = z6;
                if ((i10 & 4) == 0) {
                    this.sync_state = SyncState.PENDING_UPDATE_PUSH;
                    return;
                } else {
                    this.sync_state = syncState;
                    return;
                }
            }
            t0.j(i10, 3, ReadsDao$ReadMetaMarkedAsUnreadUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static final KSerializer _childSerializers$_anonymous_() {
            SyncState[] values = SyncState.values();
            values.getClass();
            return new w("io.elevenlabs.data.database.entities.reads.SyncState", (Enum[]) values);
        }

        public static /* synthetic */ ReadMetaMarkedAsUnreadUpdate copy$default(ReadMetaMarkedAsUnreadUpdate readMetaMarkedAsUnreadUpdate, String str, boolean z6, SyncState syncState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaMarkedAsUnreadUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                z6 = readMetaMarkedAsUnreadUpdate.marked_as_unread;
            }
            if ((i10 & 4) != 0) {
                syncState = readMetaMarkedAsUnreadUpdate.sync_state;
            }
            return readMetaMarkedAsUnreadUpdate.copy(str, z6, syncState);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaMarkedAsUnreadUpdate self, tr.b output, SerialDescriptor serialDesc) {
            sn.h[] hVarArr = $childSerializers;
            output.V(serialDesc, 0, self.read_id);
            output.T(serialDesc, 1, self.marked_as_unread);
            if (output.C(serialDesc) || self.sync_state != SyncState.PENDING_UPDATE_PUSH) {
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.sync_state);
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMarked_as_unread() {
            return this.marked_as_unread;
        }

        /* renamed from: component3, reason: from getter */
        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public final ReadMetaMarkedAsUnreadUpdate copy(String read_id, boolean marked_as_unread, SyncState sync_state) {
            read_id.getClass();
            sync_state.getClass();
            return new ReadMetaMarkedAsUnreadUpdate(read_id, marked_as_unread, sync_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaMarkedAsUnreadUpdate)) {
                return false;
            }
            ReadMetaMarkedAsUnreadUpdate readMetaMarkedAsUnreadUpdate = (ReadMetaMarkedAsUnreadUpdate) other;
            if (m.c(this.read_id, readMetaMarkedAsUnreadUpdate.read_id) && this.marked_as_unread == readMetaMarkedAsUnreadUpdate.marked_as_unread && this.sync_state == readMetaMarkedAsUnreadUpdate.sync_state) {
                return true;
            }
            return false;
        }

        public final boolean getMarked_as_unread() {
            return this.marked_as_unread;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public int hashCode() {
            return this.sync_state.hashCode() + com.google.android.gms.internal.play_billing.b.f(this.read_id.hashCode() * 31, 31, this.marked_as_unread);
        }

        public String toString() {
            return "ReadMetaMarkedAsUnreadUpdate(read_id=" + this.read_id + ", marked_as_unread=" + this.marked_as_unread + ", sync_state=" + this.sync_state + Separators.RPAREN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaMarkedAsUnreadUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaMarkedAsUnreadUpdate(String str, boolean z6, SyncState syncState) {
            str.getClass();
            syncState.getClass();
            this.read_id = str;
            this.marked_as_unread = z6;
            this.sync_state = syncState;
        }

        public /* synthetic */ ReadMetaMarkedAsUnreadUpdate(String str, boolean z6, SyncState syncState, int i10, kotlin.jvm.internal.f fVar) {
            this(str, z6, (i10 & 4) != 0 ? SyncState.PENDING_UPDATE_PUSH : syncState);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;", "", "", "read_id", "", "user_rating", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "Ljava/lang/Long;", "getUser_rating", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaRatingUpdate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String read_id;
        private final Long user_rating;

        public /* synthetic */ ReadMetaRatingUpdate(int i10, String str, Long l4, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.read_id = str;
                this.user_rating = l4;
            } else {
                t0.j(i10, 3, ReadsDao$ReadMetaRatingUpdate$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ReadMetaRatingUpdate copy$default(ReadMetaRatingUpdate readMetaRatingUpdate, String str, Long l4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaRatingUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                l4 = readMetaRatingUpdate.user_rating;
            }
            return readMetaRatingUpdate.copy(str, l4);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaRatingUpdate self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.read_id);
            output.o(serialDesc, 1, l0.f34611a, self.user_rating);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getUser_rating() {
            return this.user_rating;
        }

        public final ReadMetaRatingUpdate copy(String read_id, Long user_rating) {
            read_id.getClass();
            return new ReadMetaRatingUpdate(read_id, user_rating);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaRatingUpdate)) {
                return false;
            }
            ReadMetaRatingUpdate readMetaRatingUpdate = (ReadMetaRatingUpdate) other;
            if (m.c(this.read_id, readMetaRatingUpdate.read_id) && m.c(this.user_rating, readMetaRatingUpdate.user_rating)) {
                return true;
            }
            return false;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public final Long getUser_rating() {
            return this.user_rating;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.read_id.hashCode() * 31;
            Long l4 = this.user_rating;
            if (l4 == null) {
                hashCode = 0;
            } else {
                hashCode = l4.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "ReadMetaRatingUpdate(read_id=" + this.read_id + ", user_rating=" + this.user_rating + Separators.RPAREN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaRatingUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaRatingUpdate(String str, Long l4) {
            str.getClass();
            this.read_id = str;
            this.user_rating = l4;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;", "", "", "read_id", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "sync_state", "<init>", "(Ljava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lio/elevenlabs/data/database/entities/reads/SyncState;", "copy", "(Ljava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "getSync_state", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaSyncStatusUpdate {
        private final String read_id;
        private final SyncState sync_state;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final sn.h[] $childSerializers = {null, sn.a.d(sn.i.f31597b, new a(4))};

        public /* synthetic */ ReadMetaSyncStatusUpdate(int i10, String str, SyncState syncState, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.read_id = str;
                this.sync_state = syncState;
            } else {
                t0.j(i10, 3, ReadsDao$ReadMetaSyncStatusUpdate$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static final KSerializer _childSerializers$_anonymous_() {
            SyncState[] values = SyncState.values();
            values.getClass();
            return new w("io.elevenlabs.data.database.entities.reads.SyncState", (Enum[]) values);
        }

        public static /* synthetic */ ReadMetaSyncStatusUpdate copy$default(ReadMetaSyncStatusUpdate readMetaSyncStatusUpdate, String str, SyncState syncState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaSyncStatusUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                syncState = readMetaSyncStatusUpdate.sync_state;
            }
            return readMetaSyncStatusUpdate.copy(str, syncState);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaSyncStatusUpdate self, tr.b output, SerialDescriptor serialDesc) {
            sn.h[] hVarArr = $childSerializers;
            output.V(serialDesc, 0, self.read_id);
            output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.sync_state);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public final ReadMetaSyncStatusUpdate copy(String read_id, SyncState sync_state) {
            read_id.getClass();
            sync_state.getClass();
            return new ReadMetaSyncStatusUpdate(read_id, sync_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaSyncStatusUpdate)) {
                return false;
            }
            ReadMetaSyncStatusUpdate readMetaSyncStatusUpdate = (ReadMetaSyncStatusUpdate) other;
            if (m.c(this.read_id, readMetaSyncStatusUpdate.read_id) && this.sync_state == readMetaSyncStatusUpdate.sync_state) {
                return true;
            }
            return false;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public int hashCode() {
            return this.sync_state.hashCode() + (this.read_id.hashCode() * 31);
        }

        public String toString() {
            return "ReadMetaSyncStatusUpdate(read_id=" + this.read_id + ", sync_state=" + this.sync_state + Separators.RPAREN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaSyncStatusUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaSyncStatusUpdate(String str, SyncState syncState) {
            str.getClass();
            syncState.getClass();
            this.read_id = str;
            this.sync_state = syncState;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;", "", "", "read_id", "title", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "sync_state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/elevenlabs/data/database/entities/reads/SyncState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;)Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRead_id", "getTitle", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "getSync_state", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @qr.g
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadMetaTitleUpdate {
        private final String read_id;
        private final SyncState sync_state;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final sn.h[] $childSerializers = {null, null, sn.a.d(sn.i.f31597b, new a(5))};

        public /* synthetic */ ReadMetaTitleUpdate(int i10, String str, String str2, SyncState syncState, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.read_id = str;
                this.title = str2;
                if ((i10 & 4) == 0) {
                    this.sync_state = SyncState.PENDING_UPDATE_PUSH;
                    return;
                } else {
                    this.sync_state = syncState;
                    return;
                }
            }
            t0.j(i10, 3, ReadsDao$ReadMetaTitleUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static final KSerializer _childSerializers$_anonymous_() {
            SyncState[] values = SyncState.values();
            values.getClass();
            return new w("io.elevenlabs.data.database.entities.reads.SyncState", (Enum[]) values);
        }

        public static /* synthetic */ ReadMetaTitleUpdate copy$default(ReadMetaTitleUpdate readMetaTitleUpdate, String str, String str2, SyncState syncState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = readMetaTitleUpdate.read_id;
            }
            if ((i10 & 2) != 0) {
                str2 = readMetaTitleUpdate.title;
            }
            if ((i10 & 4) != 0) {
                syncState = readMetaTitleUpdate.sync_state;
            }
            return readMetaTitleUpdate.copy(str, str2, syncState);
        }

        public static final /* synthetic */ void write$Self$data_release(ReadMetaTitleUpdate self, tr.b output, SerialDescriptor serialDesc) {
            sn.h[] hVarArr = $childSerializers;
            output.V(serialDesc, 0, self.read_id);
            output.V(serialDesc, 1, self.title);
            if (output.C(serialDesc) || self.sync_state != SyncState.PENDING_UPDATE_PUSH) {
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.sync_state);
            }
        }

        /* renamed from: component1, reason: from getter */
        public final String getRead_id() {
            return this.read_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public final ReadMetaTitleUpdate copy(String read_id, String title, SyncState sync_state) {
            read_id.getClass();
            title.getClass();
            sync_state.getClass();
            return new ReadMetaTitleUpdate(read_id, title, sync_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMetaTitleUpdate)) {
                return false;
            }
            ReadMetaTitleUpdate readMetaTitleUpdate = (ReadMetaTitleUpdate) other;
            if (m.c(this.read_id, readMetaTitleUpdate.read_id) && m.c(this.title, readMetaTitleUpdate.title) && this.sync_state == readMetaTitleUpdate.sync_state) {
                return true;
            }
            return false;
        }

        public final String getRead_id() {
            return this.read_id;
        }

        public final SyncState getSync_state() {
            return this.sync_state;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.sync_state.hashCode() + j0.c.c(this.read_id.hashCode() * 31, 31, this.title);
        }

        public String toString() {
            String str = this.read_id;
            String str2 = this.title;
            SyncState syncState = this.sync_state;
            StringBuilder s10 = defpackage.f.s("ReadMetaTitleUpdate(read_id=", str, ", title=", str2, ", sync_state=");
            s10.append(syncState);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return ReadsDao$ReadMetaTitleUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ReadMetaTitleUpdate(String str, String str2, SyncState syncState) {
            str.getClass();
            str2.getClass();
            syncState.getClass();
            this.read_id = str;
            this.title = str2;
            this.sync_state = syncState;
        }

        public /* synthetic */ ReadMetaTitleUpdate(String str, String str2, SyncState syncState, int i10, kotlin.jvm.internal.f fVar) {
            this(str, str2, (i10 & 4) != 0 ? SyncState.PENDING_UPDATE_PUSH : syncState);
        }
    }
}
