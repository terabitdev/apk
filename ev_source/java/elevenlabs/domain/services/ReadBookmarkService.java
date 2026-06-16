package io.elevenlabs.domain.services;

import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.BookmarkShareResult;
import io.elevenlabs.domain.model.CreateBookmarkRequest;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0007J \u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0007J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0007J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001e\u0010\u0007J&\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\u0019¨\u0006\"À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ReadBookmarkService;", "", "", "readId", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "maxCount", "syncAllPending", "(ILwn/c;)Ljava/lang/Object;", "", "Lio/elevenlabs/domain/model/Bookmark;", "getBookmarks", "bookmarkId", "observeBookmark", "Lio/elevenlabs/domain/model/BookmarkRange;", "getBookmarkRanges", "Lio/elevenlabs/domain/model/CreateBookmarkRequest;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createBookmark", "(Ljava/lang/String;Lio/elevenlabs/domain/model/CreateBookmarkRequest;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "deleteBookmark", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "note", "updateBookmark", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "downloadBookmarksMarkdown", "voiceId", "Lio/elevenlabs/domain/model/BookmarkShareResult;", "shareBookmark", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadBookmarkService {
    Object createBookmark(String str, CreateBookmarkRequest createBookmarkRequest, c<? super String> cVar);

    Object deleteBookmark(String str, String str2, c<? super z> cVar);

    Object downloadBookmarksMarkdown(String str, c<? super AsyncCallResult<String>> cVar);

    Object getBookmarkRanges(String str, c<? super i> cVar);

    Object getBookmarks(String str, c<? super i> cVar);

    Object observeBookmark(String str, c<? super i> cVar);

    Object shareBookmark(String str, String str2, c<? super AsyncCallResult<BookmarkShareResult>> cVar);

    Object sync(String str, c<? super i> cVar);

    Object syncAllPending(int i10, c<? super Integer> cVar);

    Object updateBookmark(String str, String str2, String str3, c<? super z> cVar);
}
