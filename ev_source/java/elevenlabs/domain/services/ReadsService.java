package io.elevenlabs.domain.services;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterSlotIndex;
import io.elevenlabs.domain.model.FileData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadShareResult;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import ir.i;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.z;
import wn.c;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001YJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0014\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\fH¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00022\u0006\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u001c\u0010\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\fH¦@¢\u0006\u0004\b\u000e\u0010\u0019J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H¦@¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001e0\u00022\u0006\u0010\u0014\u001a\u00020\u0010H¦@¢\u0006\u0004\b\"\u0010\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\bH¦@¢\u0006\u0004\b$\u0010%J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00022\u0006\u0010\u0014\u001a\u00020\u0010H¦@¢\u0006\u0004\b'\u0010\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00022\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\b*\u0010\u0016J \u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\f2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\b,\u0010\u0016J\"\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0006H¦@¢\u0006\u0004\b/\u0010\u0013J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00022\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\b0\u0010\u0016J>\u00106\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00102\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0004\b6\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\b8\u0010\u0016J>\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u001e2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00102\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0004\b:\u00107J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001e2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\b<\u0010\u0016J\u0018\u0010=\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\b=\u0010\u0016J \u0010@\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010?\u001a\u00020>H¦@¢\u0006\u0004\b@\u0010AJ(\u0010E\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u00102\u0006\u0010D\u001a\u00020CH¦@¢\u0006\u0004\bE\u0010FJ \u0010G\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0010H¦@¢\u0006\u0004\bG\u0010!J \u0010I\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0010H¦@¢\u0006\u0004\bI\u0010!J&\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010J\u001a\u00020>H¦@¢\u0006\u0004\bK\u0010AJ\u001e\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u001e2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\bM\u0010\u0016J\u001e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\bN\u0010\u0016J&\u0010P\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010O\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\bP\u0010!J\u0018\u0010Q\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\bQ\u0010\u0016J\u0018\u0010R\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\bR\u0010\u0016J \u0010T\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\bH¦@¢\u0006\u0004\bT\u0010%J$\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u001e0\u00022\u0006\u0010(\u001a\u00020\u0010H¦@¢\u0006\u0004\bV\u0010\u0016J\u0018\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u0010H¦@¢\u0006\u0004\bX\u0010\u0016¨\u0006ZÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ReadsService;", "", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/i;", "", "limit", "", "archived", "Lio/elevenlabs/domain/services/ReadsService$SortBy;", "sortBy", "", "Lio/elevenlabs/domain/model/ReadMeta;", "getReads", "(ILjava/lang/Boolean;Lio/elevenlabs/domain/services/ReadsService$SortBy;Lwn/c;)Ljava/lang/Object;", "", "query", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "id", "isReadInLibrary", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "ids", "filterReadsInLibrary", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "observeRead", "(Ljava/lang/String;)Lir/i;", "getRead", "code", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "redeemRead", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getReadDetails", "saveToLibrary", "refreshRead", "(Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/FileDownloadState;", "getReadHtml", "readId", "Lio/elevenlabs/domain/model/OptimizedReadPreparation;", "prepareOptimizedRead", "Lio/elevenlabs/domain/model/ChapterSlotIndex;", "loadOptimizedReadIndex", "chapterIndex", "Lio/elevenlabs/domain/model/ChapterContent;", "loadChapterContent", "loadAllChapterContent", "Lio/elevenlabs/domain/model/FileData;", "file", "source", "title", "sourceUrl", "addUpload", "(Lio/elevenlabs/domain/model/FileData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "addExploreRead", "Lio/elevenlabs/domain/services/AddPodcastResult;", "addPodcast", "Lio/elevenlabs/domain/services/MakePodcastResult;", "makePodcast", "remove", "", "offset", "updateLastCharacterOffset", "(Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "audioFileNumber", "", "positionSeconds", "updateAudioPosition", "(Ljava/lang/String;Ljava/lang/String;DLwn/c;)Ljava/lang/Object;", "updateTitle", "lastUsedVoiceId", "updateLastUsedVoiceId", MetaStatKeys.KEY_RATING, "rateRead", "Lio/elevenlabs/domain/model/ReadShareResult;", "shareRead", "retryPodcast", "ownerId", "addSharedRead", "archive", "unarchive", "markedAsUnread", "markAsUnread", "Lio/elevenlabs/domain/model/ReadDetailsResponse;", "getReadDetailsSections", "parentReadId", "removeSampleReadFromLibrary", "SortBy", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadsService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/domain/services/ReadsService$SortBy;", "", "<init>", "(Ljava/lang/String;I)V", "AddedAt", "UpdatedAt", "Progress", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class SortBy {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SortBy[] $VALUES;
        public static final SortBy AddedAt = new SortBy("AddedAt", 0);
        public static final SortBy UpdatedAt = new SortBy("UpdatedAt", 1);
        public static final SortBy Progress = new SortBy("Progress", 2);

        private static final /* synthetic */ SortBy[] $values() {
            return new SortBy[]{AddedAt, UpdatedAt, Progress};
        }

        static {
            SortBy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private SortBy(String str, int i10) {
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static SortBy valueOf(String str) {
            return (SortBy) Enum.valueOf(SortBy.class, str);
        }

        public static SortBy[] values() {
            return (SortBy[]) $VALUES.clone();
        }
    }

    static /* synthetic */ Object addPodcast$default(ReadsService readsService, FileData fileData, String str, String str2, String str3, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            return readsService.addPodcast(fileData, str, str2, str3, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: addPodcast");
        return null;
    }

    static /* synthetic */ Object addUpload$default(ReadsService readsService, FileData fileData, String str, String str2, String str3, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            return readsService.addUpload(fileData, str, str2, str3, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: addUpload");
        return null;
    }

    static /* synthetic */ Object getReads$default(ReadsService readsService, int i10, Boolean bool, SortBy sortBy, c cVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                sortBy = SortBy.UpdatedAt;
            }
            return readsService.getReads(i10, bool, sortBy, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getReads");
        return null;
    }

    Object addExploreRead(String str, c<? super AsyncCallResult<z>> cVar);

    Object addPodcast(FileData fileData, String str, String str2, String str3, c<? super AsyncCallResult<AddPodcastResult>> cVar);

    Object addSharedRead(String str, String str2, c<? super AsyncCallResult<ReadMeta>> cVar);

    Object addUpload(FileData fileData, String str, String str2, String str3, c<? super AsyncCallResult<ReadMeta>> cVar);

    Object archive(String str, c<? super z> cVar);

    Object filterReadsInLibrary(List<String> list, c<? super List<String>> cVar);

    Object getRead(String str, c<? super ReadMeta> cVar);

    Object getReadDetails(String str, c<? super i> cVar);

    Object getReadDetailsSections(String str, c<? super i> cVar);

    Object getReadHtml(String str, c<? super i> cVar);

    Object getReads(int i10, Boolean bool, SortBy sortBy, c<? super i> cVar);

    Object getReads(List<String> list, c<? super List<ReadMeta>> cVar);

    Object isReadInLibrary(String str, c<? super i> cVar);

    Object loadAllChapterContent(String str, c<? super i> cVar);

    Object loadChapterContent(String str, int i10, c<? super ChapterContent> cVar);

    Object loadOptimizedReadIndex(String str, c<? super List<ChapterSlotIndex>> cVar);

    Object makePodcast(String str, c<? super AsyncCallResult<MakePodcastResult>> cVar);

    Object markAsUnread(String str, boolean z6, c<? super z> cVar);

    i observeRead(String id2);

    Object prepareOptimizedRead(String str, c<? super i> cVar);

    Object rateRead(String str, long j4, c<? super AsyncCallResult<z>> cVar);

    Object redeemRead(String str, String str2, c<? super AsyncCallResult<z>> cVar);

    Object refreshRead(String str, boolean z6, c<? super AsyncCallResult<ReadMeta>> cVar);

    Object remove(String str, c<? super Boolean> cVar);

    Object removeSampleReadFromLibrary(String str, c<? super Boolean> cVar);

    Object retryPodcast(String str, c<? super AsyncCallResult<z>> cVar);

    Object search(String str, int i10, c<? super i> cVar);

    Object shareRead(String str, c<? super AsyncCallResult<ReadShareResult>> cVar);

    i sync();

    Object unarchive(String str, c<? super z> cVar);

    Object updateAudioPosition(String str, String str2, double d10, c<? super z> cVar);

    Object updateLastCharacterOffset(String str, long j4, c<? super z> cVar);

    Object updateLastUsedVoiceId(String str, String str2, c<? super z> cVar);

    Object updateTitle(String str, String str2, c<? super z> cVar);
}
